package com.example.nhom13_3d_124ltad01;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Base64;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.baitapnhomlaptrinhadr_nhd_cosmetic.R;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import okhttp3.*;

public class upanh extends AppCompatActivity {

    private static final int PICK_IMAGE_REQUEST = 1;

    private Button btnSelectImage, btnUpload;
    private ImageView ivPreview;
    private Bitmap selectedBitmap;

    private String uploadUrl = "http://your-server-ip/upload_image.php";
    private String userID; // Lưu userID được truyền từ trang trước

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.upanh);

        btnSelectImage = findViewById(R.id.btnSelectImage);
        btnUpload = findViewById(R.id.btnUpload);
        ivPreview = findViewById(R.id.ivPreview);

        // Nhận userID từ Intent
        Intent intent = getIntent();
        userID = intent.getStringExtra("userID");

        btnSelectImage.setOnClickListener(v -> openImageChooser());

        btnUpload.setOnClickListener(v -> {
            if (selectedBitmap != null) {
                uploadImage();
            } else {
                Toast.makeText(upanh.this, "Please select an image", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void openImageChooser() {
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent, PICK_IMAGE_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == PICK_IMAGE_REQUEST && resultCode == Activity.RESULT_OK && data != null && data.getData() != null) {
            Uri imageUri = data.getData();
            try {
                selectedBitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), imageUri);
                ivPreview.setImageBitmap(selectedBitmap);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void uploadImage() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        selectedBitmap.compress(Bitmap.CompressFormat.JPEG, 100, baos);
        byte[] imageBytes = baos.toByteArray();
        String encodedImage = Base64.encodeToString(imageBytes, Base64.DEFAULT);

        OkHttpClient client = new OkHttpClient();
        RequestBody requestBody = new FormBody.Builder()
                .add("userID", userID) // Gửi userID
                .add("image", encodedImage) // Gửi ảnh
                .build();

        Request request = new Request.Builder()
                .url(uploadUrl)
                .post(requestBody)
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                runOnUiThread(() -> Toast.makeText(upanh.this, "Upload failed", Toast.LENGTH_SHORT).show());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                runOnUiThread(() -> Toast.makeText(upanh.this, "Upload successful", Toast.LENGTH_SHORT).show());
            }
        });
    }
}

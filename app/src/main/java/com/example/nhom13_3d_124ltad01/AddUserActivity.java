package com.example.nhom13_3d_124ltad01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.baitapnhomlaptrinhadr_nhd_cosmetic.R;
import com.example.nhom13_3d_124ltad01.retrofit.ApiService;
import com.example.nhom13_3d_124ltad01.retrofit.RetrofitClient;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Query;

public class AddUserActivity extends AppCompatActivity {

    public TextView image, group_name,student_id,class_name,names;
    public Button dangKy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tao_tai_khoan);
        image = findViewById(R.id.image);
        group_name = findViewById(R.id.group_name);
        student_id = findViewById(R.id.student_id);
        class_name = findViewById(R.id.class_name);
        names = findViewById(R.id.name);
        dangKy = findViewById(R.id.btnDangKy);

        dangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddUser(String.valueOf(image),String.valueOf(class_name),String.valueOf(student_id),String.valueOf(image),String.valueOf(group_name));
            }
        });




    }

    public void AddUser (String name, String classes, String studentId, String image,String groupname) {
        ApiService apiService = RetrofitClient.getInstance("").create(ApiService.class);

        // Gọi API để thêm chi tiết đơn hàng
        Call<ResponseBody> call = apiService.insertUser(name, classes,studentId,image,groupname);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful()) {
                    Toast.makeText(getApplicationContext(), "Tạo User thành công ", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
    }
}

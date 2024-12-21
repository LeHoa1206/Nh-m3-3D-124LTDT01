package com.example.nhom13_3d_124ltad01;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.baitapnhomlaptrinhadr_nhd_cosmetic.R;
import com.example.nhom13_3d_124ltad01.adapter.UserAdapter;
import com.example.nhom13_3d_124ltad01.model.User;
import com.example.nhom13_3d_124ltad01.retrofit.ApiService;
import com.example.nhom13_3d_124ltad01.retrofit.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import com.example.baitapnhomlaptrinhadr_nhd_cosmetic.R;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private UserAdapter userAdapter;
    private List<User> userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

<<<<<<< HEAD
        // Khởi tạo RecyclerView
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        userList = new ArrayList<>();
        userAdapter = new UserAdapter(this, userList);
        recyclerView.setAdapter(userAdapter);

        // Gọi API để lấy dữ liệu người dùng
        fetchUsers();
    }

    private void fetchUsers() {
        ApiService apiService = RetrofitClient.getInstance().create(ApiService.class);

        Call<List<User>> call = apiService.getUsers(); // Gọi API để lấy danh sách người dùng
        call.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                if (response.isSuccessful()) {
                    List<User> users = response.body();
                    userList.addAll(users);
                    userAdapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(MainActivity.this, "Lỗi: " + response.code(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                Log.e("MainActivity", "Lỗi kết nối API: " + t.getMessage());
                Toast.makeText(MainActivity.this, "Lỗi kết nối", Toast.LENGTH_SHORT).show();
            }
        });
=======
>>>>>>> 10ed0db8108920e810b42f965f0b49d2cb1a2f8f
    }
}

package com.example.nhom13_3d_124ltad01.retrofit;



import com.example.nhom13_3d_124ltad01.model.User;
import com.example.nhom13_3d_124ltad01.respone.ApiResponse;

import java.util.List;

import io.reactivex.rxjava3.core.Observable;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService {

    // Định nghĩa phương thức GET để lấy danh sách người dùng
    @GET("get_users.php")  // Thay 'get_users.php' bằng tên tệp API của bạn
    Call<List<User>> getUsers();  // Trả về danh sách người dùng
}

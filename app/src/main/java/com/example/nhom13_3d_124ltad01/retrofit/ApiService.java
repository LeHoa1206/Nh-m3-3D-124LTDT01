package com.example.nhom13_3d_124ltad01.retrofit;



<<<<<<< HEAD
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
=======

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface ApiService {
    // Lấy tất cả sản phẩm

    @GET("api_insert.php")
    Call<ResponseBody> insertUser(
            @Query("name") String name,
            @Query("class") String className,
            @Query("student_id") String studentId,
            @Query("image") String image,
            @Query("group_name") String groupName
    );



>>>>>>> 10ed0db8108920e810b42f965f0b49d2cb1a2f8f
}

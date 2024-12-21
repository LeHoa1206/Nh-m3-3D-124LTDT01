package com.example.nhom13_3d_124ltad01.retrofit;




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



}

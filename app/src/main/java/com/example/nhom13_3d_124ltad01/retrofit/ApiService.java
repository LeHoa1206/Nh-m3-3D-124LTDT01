package com.example.nhom13_3d_124ltad01.retrofit;

import com.example.nhom13_3d_124ltad01.respone.ApiResponse;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Field;

public interface ApiService {
    // Lấy tất cả sản phẩm
    @POST("sanpham.php")  // Đảm bảo đây là endpoint API thực tế của bạn
    Call<ApiResponse> getSanPhamList();  // Gọi danh sách sản phẩm

    @POST("sanphamnoibat.php")
    Call<ApiResponse> getSanPhamListNoiBat();

    @POST("sanphamdexuat.php")
    Call<ApiResponse> getSanPhamListDexuat();

    @POST("upload_image.php")
    @FormUrlEncoded
    Call<ResponseBody> uploadImage(
            @Field("userID") String userID,
            @Field("image") String imageBase64
    );
}

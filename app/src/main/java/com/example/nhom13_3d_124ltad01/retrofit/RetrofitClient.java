package com.example.nhom13_3d_124ltad01.retrofit;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static Retrofit retrofit;
    private static final String BARE_URL = "http://172.20.10.4/baitapnhom/";  // Thay bằng URL API của bạn

    public static Retrofit getInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BARE_URL)  // URL gốc của API
                    .addConverterFactory(GsonConverterFactory.create())  // Converter cho JSON (Gson)
                    .addCallAdapterFactory(RxJava3CallAdapterFactory.create())  // RxJava call adapter (tuỳ chọn, dùng nếu cần)
                    .build();
        }
        return retrofit;
    }
}

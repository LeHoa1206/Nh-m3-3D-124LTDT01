package com.example.nhom13_3d_124ltad01.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory; // Import RxJava3CallAdapterFactory

public class RetrofitClient {

    private static Retrofit retrofit;
    private static String BARE_URL = "http://172.20.10.4/WebbanhangLH/";  // Thay bằng URL API của bạn

    public static Retrofit getInstance(String baseUrl) {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BARE_URL)
                    .addConverterFactory(GsonConverterFactory.create())  // Gson converter to parse JSON
                    .addCallAdapterFactory(RxJava3CallAdapterFactory.create())  // Add RxJava3 call adapter
                    .build();
        }
        return retrofit;
    }


}

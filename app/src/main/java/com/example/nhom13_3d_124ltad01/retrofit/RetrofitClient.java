package com.example.nhom13_3d_124ltad01.retrofit;

import retrofit2.Retrofit;
<<<<<<< HEAD
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory; // Import RxJava3CallAdapterFactory
=======
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
>>>>>>> 1646bbd20e3ada237d73e89154f62f3539f320f9

public class RetrofitClient {

    private static Retrofit retrofit;
<<<<<<< HEAD
    private static String BARE_URL = "http://172.20.10.4/WebbanhangLH/";  // Thay bằng URL API của bạn
=======
<<<<<<< HEAD
    private static final String BARE_URL = "http://172.20.10.4/baitapnhom/";  // Thay bằng URL API của bạn

    public static Retrofit getInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BARE_URL)  // URL gốc của API
                    .addConverterFactory(GsonConverterFactory.create())  // Converter cho JSON (Gson)
                    .addCallAdapterFactory(RxJava3CallAdapterFactory.create())  // RxJava call adapter (tuỳ chọn, dùng nếu cần)
=======
    private static String BARE_URL = "http://172.20.10.5:8888/baitapnhom/";  // Thay bằng URL API của bạn
>>>>>>> 1646bbd20e3ada237d73e89154f62f3539f320f9

    public static Retrofit getInstance(String baseUrl) {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BARE_URL)
                    .addConverterFactory(GsonConverterFactory.create())  // Gson converter to parse JSON
                    .addCallAdapterFactory(RxJava3CallAdapterFactory.create())  // Add RxJava3 call adapter
<<<<<<< HEAD
=======
>>>>>>> 10ed0db8108920e810b42f965f0b49d2cb1a2f8f
>>>>>>> 1646bbd20e3ada237d73e89154f62f3539f320f9
                    .build();
        }
        return retrofit;
    }
<<<<<<< HEAD


=======
<<<<<<< HEAD
=======


>>>>>>> 10ed0db8108920e810b42f965f0b49d2cb1a2f8f
>>>>>>> 1646bbd20e3ada237d73e89154f62f3539f320f9
}

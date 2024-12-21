package com.example.nhom13_3d_124ltad01.respone;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ApiReponseDH {
    @SerializedName("success")
    private boolean success;  // Biến để kiểm tra trạng thái thành công

    @SerializedName("message")
    private String message;   // Biến để lưu thông điệp từ API



    // Getter và Setter
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



    @Override
    public String toString() {
        return "ApiReponseDH{" +
                "success=" + success +
                ", message='" + message + '\'' +
                '}';
    }
}

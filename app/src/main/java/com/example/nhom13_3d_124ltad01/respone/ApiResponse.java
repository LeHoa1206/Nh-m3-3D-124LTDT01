package com.example.nhom13_3d_124ltad01.respone;

import com.google.gson.annotations.SerializedName;

<<<<<<< HEAD
public class ApiResponse {

    @SerializedName("status")
    private boolean status;
=======
import java.util.List;

public class ApiResponse {
    @SerializedName("success")
    private boolean success;
>>>>>>> 1646bbd20e3ada237d73e89154f62f3539f320f9

    @SerializedName("message")
    private String message;

<<<<<<< HEAD
    @SerializedName("data")
    private Object data;

    public ApiResponse(boolean status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
=======
    @SerializedName("result")

    // Getter and Setter
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
>>>>>>> 1646bbd20e3ada237d73e89154f62f3539f320f9
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

<<<<<<< HEAD
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
=======

>>>>>>> 1646bbd20e3ada237d73e89154f62f3539f320f9
}

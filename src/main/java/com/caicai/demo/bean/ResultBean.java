package com.caicai.demo.bean;

public class ResultBean<T> {
    private String code;
    private String version;
    private String message;
    private T data;

    public ResultBean(T data) {
        this.data = data;
        this.code ="10000";
        this.version ="1.0";
        this.message ="请求成功";
    }

    public ResultBean(String code, String version, String message, T data) {
        this.code = code;
        this.version = version;
        this.message = message;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

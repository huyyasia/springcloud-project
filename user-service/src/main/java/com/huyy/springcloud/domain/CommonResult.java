package com.huyy.springcloud.domain;

/**
 * @Author huyy
 * @Date 2020/8/11 10:45
 * @Version 1.0
 */
public class CommonResult<T> {

    private String message;

    private Integer code;

    private T data;

    public CommonResult(String message, Integer code, T data) {
        this.message = message;
        this.code = code;
        this.data = data;
    }

    public CommonResult(String message, Integer code) {
        this.message = message;
        this.code = code;
        this.data = null;
    }

    public CommonResult(T data) {
        this.data = data;
        this.message = "操作成功";
        this.code = 200;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

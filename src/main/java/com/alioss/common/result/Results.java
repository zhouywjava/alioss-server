package com.alioss.common.result;

import com.alioss.common.constant.ResultCode;

/**
 * @Description: 返回工具类
 * @Author: zyw
 * @Date: 2018/1/9
 */
public class Results {

    private Results(){}

    public static <T> Result<T> success(){
        return new GenericResult(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMessage());
    }

    public static <T> Result<T> success(T content){
        return new GenericResult(ResultCode.SUCCESS.getCode(),content,ResultCode.SUCCESS.getMessage());
    }

    public static <T> Result<T> success(String message) {
        return new GenericResult(ResultCode.SUCCESS.getCode(), null, message);
    }

    public static <T> Result<T> success(T content, String message) {
        return new GenericResult(ResultCode.SUCCESS.getCode(), content, message);
    }

    public static <T> Result<T> fail() {
        return new GenericResult(ResultCode.ERROR.getCode(), (Object)null, (String)null);
    }

    public static <T> Result<T> fail(String message) {
        return new GenericResult(ResultCode.ERROR.getCode(), null, message);
    }

    public static <T> Result<T> fail(T content) {
        return new GenericResult(ResultCode.ERROR.getCode(), content,ResultCode.ERROR.getMessage());
    }

    public static <T> Result<T> fail(int failCode, String message) {
        return new GenericResult(failCode, message);
    }

    public static <T> Result<T> fail(int failCode, T content, String message) {
        return new GenericResult(failCode, content, message);
    }

}

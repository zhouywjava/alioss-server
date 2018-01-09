package com.alioss.common.result;

/**
 * @Description: 返回对象实体
 * @Author: zyw
 * @Date: 2018/1/9
 */
public class GenericResult<T> implements Result<T> {
    private int code;
    private T content;
    private String message;

    public GenericResult(int code) {
        this(code,null,null);
    }

    public GenericResult(int code, T content) {
        this(code,content,null);
    }

    public GenericResult(int code, String message) {
        this(code,null,message);
    }

    public GenericResult(int code, T content, String message) {
        this.code = code;
        this.content = content;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

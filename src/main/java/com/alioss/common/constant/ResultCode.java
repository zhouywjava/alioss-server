package com.alioss.common.constant;

/**
 * @Description:
 * @Author: zyw
 * @Date: 2018/1/9
 */
public enum ResultCode {

    SUCCESS(10000,"common.success"),
    UNKNOWN(-1,"common.unknown"),
    PARAM_INVALID(10010,"param.invalid"),
    ERROR(99999,"common.error");

    private final int code;
    private final String message;

    ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

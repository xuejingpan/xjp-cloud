package com.xuejingpan.xjpcloud.common.core.result;

/**
 * @EnumName ResultEnum
 * @Description TODO
 * @Author xuejingpan
 */
public enum ResultEnum {

    /**
     * 请求成功
     */
    SUCCESS(0, "success"),

    /**
     * 请求失败
     */
    FAIL(-1, "fail"),

    NOT_LOGIN(10001, "未登录");

    private final Integer code;

    private final String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

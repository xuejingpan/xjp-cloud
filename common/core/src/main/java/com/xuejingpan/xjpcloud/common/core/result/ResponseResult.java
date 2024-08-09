package com.xuejingpan.xjpcloud.common.core.result;

import lombok.Data;

/**
 * @ClassName ResponseResult
 * @Description 统一返回结果
 * @Author xuejingpan
 */
@Data
public class ResponseResult<T> {

    private static final long serialVersionUID = 1L;

    private Integer code;

    private String message;

    private T data;

    public ResponseResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResponseResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}

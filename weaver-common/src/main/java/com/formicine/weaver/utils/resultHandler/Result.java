package com.formicine.weaver.utils.resultHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

/**
 * Created by zli on 2016/11/23.
 * <p>
 * 返回结果类
 */
public class Result<T extends Serializable> implements Serializable {
    private static final Logger logger = LoggerFactory.getLogger(Result.class);
    private int code = ResultEnum.SUCCESS.getCode();

    private boolean success = true;

    private String message = ResultEnum.SUCCESS.name();

    private T data;

    private long elapsedTime;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public long getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(long elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(100)
                .append("Result{code=").append(code)
                .append(", success=").append(success)
                .append(", message='").append(message).append('\'')
                .append(", data=").append(data)
                .append(", elapsedTime=").append(elapsedTime)
                .append('}');
        return sb.toString();
    }


    public static <T extends Serializable> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setData(data);
        return result;
    }

    public static Result success() {
        Result result = new Result();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMessage(ResultEnum.SUCCESS.getMessage());
        return result;
    }

    public static Result error(int code, String message) {
        Result result = new Result();
        result.setCode(code);
        result.setSuccess(false);
        result.setMessage(message);
        logger.error("result code {},message {}", code, message);
        return result;
    }

    public static Result error(ResultEnum resultEnum) {
        Result result = new Result();
        result.setCode(resultEnum.getCode());
        result.setSuccess(false);
        result.setMessage(resultEnum.getMessage());
        logger.error("result code {},message {}", result.getCode(), result.getMessage());
        return result;
    }
}

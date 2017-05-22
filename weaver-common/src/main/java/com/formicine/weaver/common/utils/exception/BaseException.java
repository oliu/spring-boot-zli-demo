package com.formicine.weaver.common.utils.exception;


import com.formicine.weaver.common.utils.resultHandler.ResultEnum;

/**
 * 基本异常, 继承自RuntimeException.
 * <br>从由Spring管理事务的函数中抛出时会触发事务回滚.
 */
@SuppressWarnings("serial")
public class BaseException extends RuntimeException {

    protected ResultEnum resultEnum;

    public BaseException() {
        super();
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(String message, ResultEnum resultEnum) {
        super(message);
        this.resultEnum = resultEnum;
    }

    public BaseException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.resultEnum = resultEnum;
    }

    public ResultEnum getResultEnum() {
        return resultEnum;
    }

    public void setResultEnum(ResultEnum resultEnum) {
        this.resultEnum = resultEnum;
    }
}

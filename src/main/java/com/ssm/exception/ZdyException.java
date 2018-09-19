package com.ssm.exception;

public class ZdyException extends Exception {



    public ZdyException(String message, Integer errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    /**
     * 错误代码
     */
    private Integer errorCode;

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }


}

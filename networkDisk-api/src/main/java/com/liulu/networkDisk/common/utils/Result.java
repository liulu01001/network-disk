package com.liulu.networkDisk.common.utils;

/**
 * @auther Liu_lu
 * @date 2019/3/30 16:59
 *  返回前台封装数据
 */

public class Result {
    protected Boolean success = true;
    protected String message;
    protected int statusCode;

    public Result() {
    }

    public Boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}

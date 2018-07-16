package xyz.xyzmax.slam.exception;

public enum ErrorEnum {

    Nologin("未登录", -1), Noauth("用户未授权", -5);

    private String errorMessage;
    private int statusCode;

    ErrorEnum(String errorMessage, int statusCode) {
        this.errorMessage = errorMessage;
        this.statusCode = statusCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    @Override
    public String toString() {
        return this.errorMessage;
    }
}
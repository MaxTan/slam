package xyz.xyzmax.slam.model;

public class JsonResultModel {

    private Object data;
    private String errorMessage;
    private String stackTraceMessage;
    private int statusCode;

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getStackTraceMessage() {
        return this.stackTraceMessage;
    }

    public void setStackTraceMessage(String stackTraceMessage) {
        this.stackTraceMessage = stackTraceMessage;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
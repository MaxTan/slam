package xyz.xyzmax.slam.exception;

public class CustomException extends Exception {

    private static final long serialVersionUID = 4337410585629769916L;

	private int statusCode;
    private String errorMeesage;

    public CustomException(String message) {
        super(message);
    }

    public CustomException(ErrorEnum error) {
        super(error.toString());
        this.statusCode = error.getStatusCode();
        this.errorMeesage = error.getErrorMessage();
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getErrorMessage() {
        return this.errorMeesage;
    }
}

package tuya.tedge.driver.sdk.base.exception;

public class GeneraException extends Exception {
    private static final long serialVersionUID = -5601623123990971477L;

    public GeneraException(String message) {
        super(message);
    }

    public GeneraException(String message, Throwable cause) {
        super(message, cause);
    }
}
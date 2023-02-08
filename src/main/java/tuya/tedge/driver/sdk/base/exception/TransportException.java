package tuya.tedge.driver.sdk.base.exception;

public class TransportException extends GeneraException {
    private boolean retryable = false;

    public TransportException(String message, Throwable cause) {
        super(message, cause);
    }

    public boolean isRetryable() {
        return this.retryable;
    }

    public void setRetryable(boolean retryable) {
        this.retryable = retryable;
    }
}
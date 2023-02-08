package tuya.tedge.driver.sdk.base.exception;

import lombok.Data;
@Data
public class ClientException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private String errorCode = ExceptionConstants.UNKNOWN;

    public ClientException() {
    }

    /**
     * 使用的时候，包装成 e.getMessage + message
     *
     * @param message
     * @param t
     */
    public ClientException(String message, Throwable t) {
        super(message, t);
    }

    public ClientException(String message, String errorCode, Throwable t) {
        super(message, t);
        this.errorCode = errorCode;
    }

    public ClientException(String message) {
        super(message);
    }

    public ClientException(Throwable t) {
        super(t);
    }
}

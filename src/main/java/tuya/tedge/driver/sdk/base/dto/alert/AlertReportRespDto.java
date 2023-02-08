package tuya.tedge.driver.sdk.base.dto.alert;

public class AlertReportRespDto {
    private String id;
    private Integer statusCode;
    private String message;

    public AlertReportRespDto() {
    }

    public AlertReportRespDto(String id, Integer statusCode, String message) {
        this.id = id;
        this.statusCode = statusCode;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

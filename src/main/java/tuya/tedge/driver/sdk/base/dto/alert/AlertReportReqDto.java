package tuya.tedge.driver.sdk.base.dto.alert;

import tuya.tedge.driver.sdk.base.model.AlertLevel;
import tuya.tedge.driver.sdk.grpc.alert.AlertType;
import lombok.Data;

@Data
public class AlertReportReqDto {
    private String id;
    private String version;
    private String serviceName;
    private AlertType alertType;
    private AlertLevel alertLevel;
    private Long t;
    private String content;

    public AlertReportReqDto() {
        id = "";
        version = "";
        serviceName = "";
        alertType = AlertType.DRIVER_ALERT;
        Integer t = 0;
        String content = "";
    }

    public AlertReportReqDto(String id, String version, String serviceName, AlertType alertType, AlertLevel alertLevel, Long t, String content) {
        this.id = id;
        this.version = version;
        this.serviceName = serviceName;
        this.alertType = alertType;
        this.alertLevel = alertLevel;
        this.t = t;
        this.content = content;
    }
}

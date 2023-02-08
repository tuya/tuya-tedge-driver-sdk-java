package tuya.tedge.driver.sdk.base.model;

import lombok.Data;

import java.util.List;

@Data
public class ActiveDeviceResponse {
    private Integer processNum;
    private Integer successNum;
    private Integer failNum;
    private List<ActiveDeviceResult> activeDeviceResultList;

    public ActiveDeviceResponse(){}

    public ActiveDeviceResponse(Integer processNum, Integer successNum, Integer failNum, List<ActiveDeviceResult> activeDeviceResultList) {
        this.processNum = processNum;
        this.successNum = successNum;
        this.failNum = failNum;
        this.activeDeviceResultList = activeDeviceResultList;
    }
}

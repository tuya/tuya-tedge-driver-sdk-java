package tuya.tedge.driver.sdk.base.model;

import lombok.Data;

@Data
public class ActiveDeviceResult {
    private String id;
    private String name;
    private Boolean processSuccess;
    private String activeStatus;
    private String remark;

    public ActiveDeviceResult(){}

    public ActiveDeviceResult(String id, String name, Boolean processSuccess, String activeStatus, String remark) {
        this.id = id;
        this.name = name;
        this.processSuccess = processSuccess;
        this.activeStatus = activeStatus;
        this.remark = remark;
    }

}

package tuya.tedge.driver.sdk.base.model;

import lombok.Data;

import java.util.List;

@Data
public class DeviceStatus {
    public static String DeviceActiveStatusInactivated = "inactivated";
    public static String DeviceActiveStatusActivated = "activated";
    public static String DeviceActiveStatusActiveFail = "activeFail";

    private List<String> online;
    private List<String> offline;

    public DeviceStatus() {
    }

    public DeviceStatus(List<String> online, List<String> offline) {
        this.online = online;
        this.offline = offline;
    }
}

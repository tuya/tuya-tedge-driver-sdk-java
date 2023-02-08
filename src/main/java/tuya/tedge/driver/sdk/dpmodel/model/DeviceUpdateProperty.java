package tuya.tedge.driver.sdk.dpmodel.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Map;

@Data
public class DeviceUpdateProperty {
    @JSONField(name = "name")
    private String name;
    @JSONField(name = "ip")
    private String ip;
    @JSONField(name = "lat")
    private String lat;
    @JSONField(name = "lon")
    private String lon;
    @JSONField(name = "installLocation")
    private String installLocation;
    @JSONField(name = "extendData")
    private Map<String, Object> extendData;

    public DeviceUpdateProperty() {
    }

    public DeviceUpdateProperty(String name) {
        this.name = name;
    }

    public DeviceUpdateProperty(String name, String ip, String lat, String lon) {
        this.name = name;
        this.ip = ip;
        this.lat = lat;
        this.lon = lon;
    }

    public DeviceUpdateProperty(Map<String, Object> extendData) {
        this.extendData = extendData;
    }

    public DeviceUpdateProperty(String vendorCode, String installLocation, Map<String, Object> extendData) {
        //this.vendorCode = vendorCode;
        this.installLocation = installLocation;
        this.extendData = extendData;
    }
}

package tuya.tedge.driver.sdk.dpmodel.model;

import tuya.tedge.driver.sdk.base.model.ProtocolProperties;
import lombok.Data;

import java.util.Map;

@Data
public class DeviceInfo {
    private String id;
    private String name;
    private String description;
    private String productId;
    private String ip;
    private String lat;
    private String lon;
    private String vendorCode;
    private String installLocation;
    private Map<String, Object> extendData;
    private Boolean isIpcDev;
    private Map<String, ProtocolProperties> protocolsMap;
    private String serviceId;
    private String onlineStatus;
    private String activeStatus;
    private String cloudDeviceId;

    public DeviceInfo() {
    }

    //public DeviceInfo(String id, String name, String description, String productId, String ip, String lat, String lon, String vendorCode, String installLocation, Map<String, Object> extendData, Boolean isIpcDev, Map<String, ProtocolProperties> protocolsMap, String serviceId, String onlineStatus, String activeStatus, String cloudDeviceId) {
    public DeviceInfo(String id, String name, String description, String productId, String ip, String lat, String lon, String installLocation, Map<String, Object> extendData, Boolean isIpcDev, Map<String, ProtocolProperties> protocolsMap, String serviceId, String onlineStatus, String activeStatus, String cloudDeviceId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.productId = productId;
        this.ip = ip;
        this.lat = lat;
        this.lon = lon;
        //this.vendorCode = vendorCode;
        this.installLocation = installLocation;
        this.extendData = extendData;
        this.isIpcDev = isIpcDev;
        this.protocolsMap = protocolsMap;
        this.serviceId = serviceId;
        this.onlineStatus = onlineStatus;
        this.activeStatus = activeStatus;
        this.cloudDeviceId = cloudDeviceId;
    }
}

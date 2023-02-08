package tuya.tedge.driver.sdk.base.model;

import lombok.Data;

import java.util.Map;
@Data
public class DeviceMetadata {
    private String cid;
    private String name;
    private String description;
    private String productId;
    private String ip;
    private String lat;
    private String lon;
    private String installLocation;
    private Map<String, Object> extendData;
    private Map<String, ProtocolProperties> protocolsMap;

    public DeviceMetadata() {
        this.cid = "";
        this.name = "";
        this.description = "";
        this.productId = "";
        this.ip = "";
        this.lat = "";
        this.lon = "";
        this.installLocation = "";
        this.extendData = null;
        this.protocolsMap = null;
    }

    public DeviceMetadata(String cid, String name, String description, String productId, String ip, String lat, String lon, String installLocation, Map<String, Object> extendData, Map<String, ProtocolProperties> protocolsMap) {
        this.cid = cid;
        this.name = name;
        this.description = description;
        this.productId = productId;
        this.ip = ip;
        this.lat = lat;
        this.lon = lon;
        this.installLocation = installLocation;
        this.extendData = extendData;
        this.protocolsMap = protocolsMap;
    }

    public DeviceMetadata(String cid, String name, String productId, String installLocation, Map<String, Object> extendData) {
        this.cid = cid;
        this.name = name;
        this.productId = productId;
        this.installLocation = installLocation;
        this.extendData = extendData;
    }
}

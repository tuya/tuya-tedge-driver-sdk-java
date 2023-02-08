package tuya.tedge.driver.sdk.base.dto.device;

import tuya.tedge.driver.sdk.base.model.ProtocolProperties;
import tuya.tedge.driver.sdk.grpc.device.EnumDeviceSource;
import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class DeviceUpdateInfoDto {
    private String id;
    private String name;
    private String description;
    private String productId;
    private String ip;
    private String lat;
    private String lon;
    private String vendorCode;
    private String installLocation;
    private String extendData;
    private Map<String, ProtocolProperties> protocolsMap;
    private String serviceId;
    private String onlineStatus;
    private String activeStatus;
    private String cloudDeviceId;
    private List<String> screenType;
    private String parentCloudId;
    private Boolean isScreenDevice;
    private EnumDeviceSource source;

    public DeviceUpdateInfoDto() {
        this.id = "";
        this.name = "";
        this.description = "";
        this.productId = "";
        this.ip = "";
        this.lat = "";
        this.lon = "";
        this.vendorCode = "";
        this.installLocation = "";
        this.extendData = "";
        this.protocolsMap = new HashMap<>();
        this.serviceId = "";
        this.onlineStatus = "";
        this.activeStatus = "";
        this.cloudDeviceId = "";
        this.parentCloudId = "";
        this.source = EnumDeviceSource.ENUM_DEVICE_SOURCE_UNSPECIFIED;
    }

    public DeviceUpdateInfoDto(String id, String name, String description, String productId, String ip, String lat, String lon, String vendorCode, String installLocation, String extendData, Map<String, ProtocolProperties> protocolsMap, String serviceId, String onlineStatus, String activeStatus, String cloudDeviceId, List<String> screenType, String parentCloudId, Boolean isScreenDevice, EnumDeviceSource source) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.productId = productId;
        this.ip = ip;
        this.lat = lat;
        this.lon = lon;
        this.vendorCode = vendorCode;
        this.installLocation = installLocation;
        this.extendData = extendData;
        this.protocolsMap = protocolsMap;
        this.serviceId = serviceId;
        this.onlineStatus = onlineStatus;
        this.activeStatus = activeStatus;
        this.cloudDeviceId = cloudDeviceId;
        this.screenType = screenType;
        this.parentCloudId = parentCloudId;
        this.isScreenDevice = isScreenDevice;
        this.source = source;
    }
}

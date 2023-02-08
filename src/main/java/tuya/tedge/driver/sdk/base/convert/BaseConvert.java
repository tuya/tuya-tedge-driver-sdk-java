package tuya.tedge.driver.sdk.base.convert;

import com.alibaba.fastjson.JSON;
import tuya.tedge.driver.sdk.base.dto.device.AddDeviceRequestDto;
import tuya.tedge.driver.sdk.base.dto.device.DeviceAddInfoDto;
import tuya.tedge.driver.sdk.base.dto.product.ProductDto;
import tuya.tedge.driver.sdk.base.model.DeviceMetadata;
import tuya.tedge.driver.sdk.base.model.ProductMetadata;
import tuya.tedge.driver.sdk.base.model.ProtocolProperties;
import tuya.tedge.driver.sdk.grpc.device.EnumDeviceSource;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class BaseConvert {
    public AddDeviceRequestDto deviceMetadataModel2Dto(DeviceMetadata dm, String serviceId, Boolean isIpc) {
        if (dm == null) {
            return null;
        }
        String extendData = "";
        if (dm.getExtendData() != null) {
            extendData = JSON.toJSONString(dm.getExtendData());
        }
        DeviceAddInfoDto device = new DeviceAddInfoDto();

        device.setId(dm.getCid());
        device.setName(dm.getName());
        device.setDescription(StringNull.getRealString(dm.getDescription()));
        device.setProductId(dm.getProductId());
        device.setIp(StringNull.getRealString(dm.getIp()));
        device.setLat(StringNull.getRealString(dm.getLat()));
        device.setLon(StringNull.getRealString(dm.getLon()));
        device.setInstallLocation(StringNull.getRealString(dm.getInstallLocation()));
        device.setExtendData(StringNull.getRealString(extendData));
        device.setIsIpcDev(isIpc);
        //device.setProtocolsMap(propertiesMapModel2Dto(dm.getProtocolsMap()));
        device.setServiceId(serviceId);
        device.setSource(EnumDeviceSource.ENUM_DEVICE_SOURCE_DRIVER);

        return new AddDeviceRequestDto(device);
    }

    public ProductDto productMetadataModel2Dto(ProductMetadata metadata, String deviceLibraryId) {
        if (metadata == null) {
            return null;
        }
        return new ProductDto(
                metadata.getId(),
                metadata.getName(),
                metadata.getDescription(),
                null,
                deviceLibraryId
        );

    }

    public Map<String, ProtocolProperties> propertiesMapModel2Dto(Map<String, ProtocolProperties> model) {
        if (model == null) {
            return null;
        }
        Map<String, ProtocolProperties> ppMap = new HashMap<>();
        model.forEach((key, value) -> {
                    ppMap.put(key, value);
                }
        );

        return ppMap;
    }
}

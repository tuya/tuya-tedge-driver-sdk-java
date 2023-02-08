package tuya.tedge.driver.sdk.dpmodel.convert;

import tuya.tedge.driver.sdk.base.dto.common.GatewayStateDto;
import tuya.tedge.driver.sdk.base.dto.device.DeviceInfoDto;
import tuya.tedge.driver.sdk.base.model.ProtocolProperties;
import tuya.tedge.driver.sdk.base.dto.product.ProductDto;
import tuya.tedge.driver.sdk.base.dto.common.LogLevelRequestDto;
import tuya.tedge.driver.sdk.base.dto.common.LogLevelType;
import tuya.tedge.driver.sdk.dpmodel.dto.command.CmdRequestDto;
import tuya.tedge.driver.sdk.dpmodel.dto.product.DpDto;
import tuya.tedge.driver.sdk.dpmodel.model.*;
import tuya.tedge.driver.sdk.grpc.common.LogLevelRequest;
import tuya.tedge.driver.sdk.grpc.devicecallback.GatewayState;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class ModelConvert {
    public CommandRequest cmdRequestDto2Model(CmdRequestDto requestDto) {
        if (requestDto == null) {
            log.error("CmdRequestDto is null");
            return null;
        }
        JSONObject obj = JSON.parseObject(JSON.parse(requestDto.getData()).toString());
        Map<String, Object> m = new HashMap<>();
        //循环转换
        Iterator it = obj.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> entry = (Map.Entry<String, Object>) it.next();
            m.put(entry.getKey(), entry.getValue());
        }

        return new CommandRequest(requestDto.getProtocol().getValue(), requestDto.getT(), requestDto.getS(), m);
    }

    public DeviceInfo deviceInfoDto2Model(DeviceInfoDto dto) {
        if (dto == null) {
            return null;
        }

        return new DeviceInfo(
                dto.getId(),
                dto.getName(),
                dto.getDescription(),
                dto.getProductId(),
                dto.getIp(),
                dto.getLat(),
                dto.getLon(),
                //dto.getVendorCode(),
                dto.getInstallLocation(),
                dto.getExtendData(),
                dto.getIsIpcDev(),
                propertiesMapDto2Model(dto.getProtocolsMap()),
                dto.getServiceId(),
                dto.getOnlineStatus(),
                dto.getActiveStatus(),
                dto.getCloudDeviceId()
        );
    }


    private ProtocolProperties protocolPropertiesDto2Model(ProtocolProperties dto) {
        if (dto == null) {
            return null;
        }
        return new ProtocolProperties(dto.getCustomMap());
    }

    public Map<String, ProtocolProperties> propertiesMapDto2Model(Map<String, ProtocolProperties> dtoMap) {
        if (dtoMap == null) {
            return null;
        }
        Map<String, ProtocolProperties> ppMap = new HashMap<>();
        dtoMap.forEach((key, value) -> {
                    ppMap.put(key, protocolPropertiesDto2Model(value));
                }
        );
        return ppMap;
    }

    /**
     * 产品
     */
    public ProductInfo productDto2Model(ProductDto dto) {
        if (dto == null) {
            return null;
        }
        return new ProductInfo(
                dto.getId(),
                dto.getName(),
                dto.getDescription(),
                dpsDto2Model(dto.getDps()),
                dto.getDeviceLibraryId()
        );
    }

    public List<Dp> dpsDto2Model(List<DpDto> dpDtoList) {
        if (dpDtoList == null) {
            return null;
        }
        List<Dp> dps = new ArrayList<>();
        for (DpDto dpDto : dpDtoList) {
            Dp d = dpDto2Model(dpDto);
            if (d == null) {
                continue;
            }
            dps.add(d);
        }
        return dps;
    }

    public Dp dpDto2Model(DpDto dto) {
        if (dto == null) {
            return null;
        }
        return new Dp(
                dto.getId(),
                dto.getDescription(),
                propertyValueDto2Model(dto.getProperties()),
                dto.getAttributes()
        );
    }

    private PropertyValue propertyValueDto2Model(PropertyValue dto) {
        if (dto == null) {
            return null;
        }
        return new PropertyValue(
                dto.getType(),
                dto.getReadWrite(),
                dto.getUnits(),
                dto.getMinimum(),
                dto.getMaximum(),
                dto.getDefaultValue(),
                dto.getShift(),
                dto.getScale(),
                dto.getEnums(),
                dto.getFault()
        );
    }

    public List<DeviceInfo> deviceInfoListDto2Model(List<DeviceInfoDto> dtoList) {
        if (dtoList == null) {
            return null;
        }
        List<DeviceInfo> list = new ArrayList<>();
        dtoList.forEach(device -> {
            list.add(deviceInfoDto2Model(device));
        });
        return list;
    }

    public List<ProductInfo> productInfoListDto2Model(List<ProductDto> dtoList) {
        if (dtoList == null) {
            return null;
        }
        List<ProductInfo> list = new ArrayList<>();
        dtoList.forEach(p -> {
            list.add(productDto2Model(p));
        });
        return list;
    }

    public LogLevelRequestDto logLevelRpc2Dto(LogLevelRequest request) {
        if (request == null) {
            return null;
        }
        return new LogLevelRequestDto(LogLevelType.typeOfValue(request.getLogLevel().getNumber()));
    }

    public GatewayStateDto gatewayStateRpc2Dto(GatewayState request) {
        if (request == null) {
            return null;
        }
        return new GatewayStateDto(request.getConnStatus());
    }
}

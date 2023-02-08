package tuya.tedge.driver.sdk.base.convert;

import com.alibaba.fastjson.JSON;
import tuya.tedge.driver.sdk.base.model.ActiveDeviceResponse;
import tuya.tedge.driver.sdk.base.model.ActiveDeviceResult;
import tuya.tedge.driver.sdk.base.model.ProtocolProperties;
import tuya.tedge.driver.sdk.grpc.device.*;
import tuya.tedge.driver.sdk.base.dto.device.*;
import tuya.tedge.driver.sdk.base.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeviceConvert {
    private static CommonConvert convert = new CommonConvert();

    /**
     * 设备添加回调转换
     *
     * @param dev
     * @return
     */
    public DeviceInfoDto deviceInfoAddDto2Dto(DeviceAddInfoDto dev) {
        if (dev == null) {
            return null;
        }

        DeviceInfoDto ret = new DeviceInfoDto(
                dev.getId(),
                dev.getName(),
                dev.getDescription(),
                dev.getProductId(),
                dev.getIp(),
                dev.getLat(),
                dev.getLon(),
                dev.getInstallLocation(),
                null,
                dev.getIsIpcDev(),
                dev.getProtocolsMap(),
                dev.getServiceId(),
                dev.getOnlineStatus(),
                dev.getActiveStatus(),
                dev.getCloudDeviceId()
        );

        Map<String, Object> ed = new HashMap<>();
        if (dev.getIsScreenDevice()) {
            ret.setActiveStatus(DeviceStatus.DeviceActiveStatusActivated);
            ed.put("parentCloudId", dev.getParentCloudId());
            ed.put("screenType", dev.getScreenType());
            if (dev.getExtendData().length() > 0) {
                TyDeviceExtend ext = JSON.parseObject(dev.getExtendData(), TyDeviceExtend.class);
                ed.put("localKey", ext.getLocalKey());
                ed.put("mac", ext.getMac());
            }
        } else {
            if (dev.getExtendData().length() > 0) {
                ed = JSON.parseObject(dev.getExtendData(), HashMap.class);
            }
        }
        ret.setExtendData(ed);


        return ret;
    }

    public DeviceInfoDto deviceInfoUpdateDto2Dto(DeviceInfoDto dev, DeviceUpdateInfoDto update) {
        if (update == null || dev == null) {
            return null;
        }

        DeviceInfoDto ret = new DeviceInfoDto(
                update.getId(),
                update.getName(),
                update.getDescription(),
                update.getProductId(),
                update.getIp(),
                update.getLat(),
                update.getLon(),
                update.getInstallLocation(),
                null,
                dev.getIsIpcDev(),
                update.getProtocolsMap(),
                update.getServiceId(),
                update.getOnlineStatus(),
                update.getActiveStatus(),
                update.getCloudDeviceId()
        );

        Map<String, Object> ed = new HashMap<>();
        if (update.getExtendData() == null || update.getExtendData().length() <= 0) {
            ret.setExtendData(ed);
            return ret;
        }
        if (update.getIsScreenDevice()) {
            ret.setActiveStatus(DeviceStatus.DeviceActiveStatusActivated);
            ed.put("parentCloudId", update.getParentCloudId());
            ed.put("screenType", update.getScreenType());
            TyDeviceExtend ext = JSON.parseObject(update.getExtendData(), TyDeviceExtend.class);
            ed.put("localKey", ext.getLocalKey());
            ed.put("mac", ext.getMac());
        } else {
            ed = JSON.parseObject(update.getExtendData(), HashMap.class);
        }

        ret.setExtendData(ed);
        return ret;
    }

    public AddDeviceRequest addDeviceRequestDto2Rpc(AddDeviceRequestDto resultDto) {
        if (resultDto == null) {
            return null;
        }
        return AddDeviceRequest.newBuilder()
                .setDevice(deviceAddInfoDto2Rpc(resultDto.getDevice()))
                .build();
    }

    public DeviceActive deviceActiveDto2Rpc(DeviceActiveDto dto) {
        if (dto == null) {
            return null;
        }
        return DeviceActive.newBuilder()
                .addAllId(dto.getIdList())
                .setIsAll(dto.getIsAll())
                .build();
    }

    public UpdateDeviceRequest updateDeviceRequestDto2Rpc(UpdateDeviceRequestDto dto) {
        if (dto == null) {
            return null;
        }
        return UpdateDeviceRequest.newBuilder()
                .setUpdateDevice(deviceUpdateInfoDto2Rpc(dto.getUpdateDevice()))
                .build();
    }

    public DeviceByIdRequest deviceByIdRequestDto2Rpc(DeviceByIdRequestDto dto) {
        if (dto == null) {
            return null;
        }
        return DeviceByIdRequest.newBuilder()
                .setId(dto.getId())
                .build();
    }

    public DeleteDeviceByIdRequest deleteDeviceByIdRequestDto2Rpc(DeleteDeviceByIdRequestDto dto) {
        if (dto == null) {
            return null;
        }
        return DeleteDeviceByIdRequest.newBuilder()
                .setId(dto.getId())
                .build();
    }

    public DeleteDeviceByIdRequestDto deleteDeviceByIdRequestRpc2Dto(DeleteDeviceByIdRequest request) {
        if (request == null) {
            return null;
        }
        return new DeleteDeviceByIdRequestDto(request.getId());
    }

    public DeviceSearchQueryRequest deviceSearchQueryRequestDto2Rpc(DeviceSearchQueryRequestDto dto) {
        if (dto == null) {
            return null;
        }

        return DeviceSearchQueryRequest.newBuilder()
                .setBaseSearchConditionQuery(convert.baseSearchConditionQueryDto2Rpc(dto.getBaseSearchConditionQuery()))
                .setActiveStatus(dto.getActiveStatus())
                .setServiceId(dto.getServiceId())
                .setProductId(dto.getProductId())
                .setStatus(dto.getStatus())
                .setActiveStatuses(dto.getActiveStatuses())
                .setCloudDeviceIds(dto.getCloudDeviceIds())
                .setIdOrNameLike(dto.getIdOrNameLike())
                .build();
    }

    public DeviceOnlineAndOfflineList deviceOnlineAndOfflineListDto2Rpc(DeviceStatus dto) {
        if (dto == null) {
            return null;
        }
        DeviceOnlineAndOfflineList.Builder builder = DeviceOnlineAndOfflineList.newBuilder();
        if (dto.getOnline() != null) {
            builder.addAllOnline(dto.getOnline());
        }
        if (dto.getOffline() != null) {
            builder.addAllOffline(dto.getOffline());
        }
        return builder.build();
    }


    public ActiveDeviceResponse activeDeviceResponseRpc2Dto(tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResponse response) {
        if (response == null) {
            return null;
        }
        List<ActiveDeviceResult> resultDtoList = new ArrayList<>();
        response.getActiveDeviceResultsList().forEach(action -> {
            resultDtoList.add(activeDeviceResultRpc2Dto(action));
        });

        return new ActiveDeviceResponse(
                response.getProcessNum(),
                response.getSuccessNum(),
                response.getFailNum(),
                resultDtoList
        );
    }

    public DeviceInfoDto deviceInfoRpc2Dto(DeviceInfo dev) {
        if (dev == null) {
            return null;
        }

        Map<String, ProtocolProperties> propertiesDtoMap = new HashMap<>();
        dev.getProtocolsMap().forEach((key, value) -> {
            propertiesDtoMap.put(key, protocolPropertiesRpc2Dto(value));
        });

        DeviceInfoDto ret = new DeviceInfoDto(
                dev.getId(),
                dev.getName(),
                dev.getDescription(),
                dev.getProductId(),
                dev.getIp(),
                dev.getLat(),
                dev.getLon(),
                dev.getInstallLocation(),
                null,
                dev.getIsIpcDev(),
                propertiesDtoMap,
                dev.getServiceId(),
                dev.getOnlineStatus(),
                dev.getActiveStatus(),
                dev.getCloudDeviceId()
        );

        Map<String, Object> ed = new HashMap<>();
        if (dev.getIsScreenDevice()) {
            ret.setActiveStatus(DeviceStatus.DeviceActiveStatusActivated);
            ed.put("parentCloudId", dev.getParentCloudId());
            ed.put("screenType", dev.getScreenTypeList());
            if (dev.getExtendData().length() > 0) {
                TyDeviceExtend ext = JSON.parseObject(dev.getExtendData(), TyDeviceExtend.class);
                ed.put("localKey", ext.getLocalKey());
                ed.put("mac", ext.getMac());
            }
        } else {
            if (dev.getExtendData().length() > 0) {
                ed = JSON.parseObject(dev.getExtendData(), HashMap.class);
            }
        }
        ret.setExtendData(ed);
        return ret;
    }

    public MultiDeviceResponseDto multiDeviceResponseRpc2Dto(MultiDeviceResponse response) {
        if (response == null) {
            return null;
        }
        List<DeviceInfoDto> dtoList = new ArrayList<>();
        response.getDevicesList().forEach(action -> {
            dtoList.add(deviceInfoRpc2Dto(action));
        });
        return new MultiDeviceResponseDto(
                response.getTotal(),
                dtoList
        );
    }

    private DeviceAddInfo deviceAddInfoDto2Rpc(DeviceAddInfoDto addDto) {
        if (addDto == null) {
            return null;
        }

        Map<String, tuya.tedge.driver.sdk.grpc.device.ProtocolProperties> respMap = new HashMap<>();
        if (addDto.getProtocolsMap() != null) {
            addDto.getProtocolsMap().forEach((key, value) -> {
                respMap.put(key, protocolPropertiesDto2Rpc(value));
            });
        }

        return DeviceAddInfo.newBuilder()
                .setId(addDto.getId())
                .setName(addDto.getName())
                .setDescription(addDto.getDescription())
                .setProductId(addDto.getProductId())
                .setIp(addDto.getIp())
                .setLat(addDto.getLat())
                .setLon(addDto.getLon())
                .setInstallLocation(addDto.getInstallLocation())
                .setExtendData(addDto.getExtendData())
                .setIsIpcDev(addDto.getIsIpcDev())
                .setServiceId(addDto.getServiceId())
                .putAllProtocols(respMap)
                .setSource(addDto.getSource())
                .build();
    }

    public DeviceAddInfoDto deviceAddInfoRpc2Dto(DeviceAddInfo addInfo) {
        if (addInfo == null) {
            return null;
        }

        Map<String, ProtocolProperties> respMap = new HashMap<>();
        addInfo.getProtocolsMap().forEach((key, value) -> {
            respMap.put(key, protocolPropertiesRpc2Dto(value));
        });

        return new DeviceAddInfoDto(
                addInfo.getId(),
                addInfo.getName(),
                addInfo.getDescription(),
                addInfo.getProductId(),
                addInfo.getIp(),
                addInfo.getLat(),
                addInfo.getLon(),
                addInfo.getVendorCode(),
                addInfo.getInstallLocation(),
                addInfo.getExtendData(),
                addInfo.getIsIpcDev(),
                respMap,
                addInfo.getServiceId(),
                addInfo.getOnlineStatus(),
                addInfo.getActiveStatus(),
                addInfo.getCloudDeviceId(),
                addInfo.getScreenTypeList(),
                addInfo.getParentCloudId(),
                addInfo.getIsScreenDevice(),
                addInfo.getSource()
        );
    }

    private DeviceSourceType deviceSourceRpc2Dto(EnumDeviceSource enumDeviceSource) {
        return DeviceSourceType.valueOf(String.valueOf(enumDeviceSource.getNumber()));
    }

    private EnumDeviceSource deviceSourceDto2Rpc(DeviceSourceType enumDeviceSource) {
        return EnumDeviceSource.forNumber(enumDeviceSource.getValue());
    }

    private DeviceUpdateInfo deviceUpdateInfoDto2Rpc(DeviceUpdateInfoDto updateInfo) {
        if (updateInfo == null) {
            return null;
        }

        Map<String, tuya.tedge.driver.sdk.grpc.device.ProtocolProperties> respMap = new HashMap<>();
        updateInfo.getProtocolsMap().forEach((key, value) -> {
            respMap.put(key, protocolPropertiesDto2Rpc(value));
        });

        return DeviceUpdateInfo.newBuilder()
                .setId(updateInfo.getId())
                .setName(updateInfo.getName())
                .setDescription(updateInfo.getDescription())
                .setProductId(updateInfo.getProductId())
                .setIp(updateInfo.getIp())
                .setLat(updateInfo.getLat())
                .setLon(updateInfo.getLon())
                .setVendorCode(updateInfo.getVendorCode())
                .setInstallLocation(updateInfo.getInstallLocation())
                .setExtendData(updateInfo.getExtendData())
                .setServiceId(updateInfo.getServiceId())
                .setOnlineStatus(updateInfo.getOnlineStatus())
                .setActiveStatus(updateInfo.getActiveStatus())
                .setCloudDeviceId(updateInfo.getCloudDeviceId())
                .putAllProtocols(respMap)
                .build();
    }


    public DeviceUpdateInfoDto deviceUpdateInfoRpc2Dto(DeviceUpdateInfo updateInfo) {
        if (updateInfo == null) {
            return null;
        }

        Map<String, ProtocolProperties> respMap = new HashMap<>();
        updateInfo.getProtocolsMap().forEach((key, value) -> {
            respMap.put(key, protocolPropertiesRpc2Dto(value));
        });

        return new DeviceUpdateInfoDto(
                updateInfo.getId(),
                updateInfo.getName(),
                updateInfo.getDescription(),
                updateInfo.getProductId(),
                updateInfo.getIp(),
                updateInfo.getLat(),
                updateInfo.getLon(),
                updateInfo.getVendorCode(),
                updateInfo.getInstallLocation(),
                updateInfo.getExtendData(),
                respMap,
                updateInfo.getServiceId(),
                updateInfo.getOnlineStatus(),
                updateInfo.getActiveStatus(),
                updateInfo.getCloudDeviceId(),
                updateInfo.getScreenTypeList(),
                updateInfo.getParentCloudId(),
                updateInfo.getIsScreenDevice(),
                updateInfo.getSource()
        );
    }

    private ProtocolProperties protocolPropertiesRpc2Dto(tuya.tedge.driver.sdk.grpc.device.ProtocolProperties properties) {
        if (properties == null) {
            return null;
        }
        return new ProtocolProperties(properties.getPpMap());
    }

    private tuya.tedge.driver.sdk.grpc.device.ProtocolProperties protocolPropertiesDto2Rpc(ProtocolProperties dto) {
        if (dto == null) {
            return null;
        }
        return tuya.tedge.driver.sdk.grpc.device.ProtocolProperties.newBuilder()
                .putAllPp(dto.getCustomMap())
                .build();
    }

    private ActiveDeviceResult activeDeviceResultRpc2Dto(tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult result) {
        if (result == null) {
            return null;
        }
        return new ActiveDeviceResult(
                result.getId(),
                result.getName(),
                result.getProcessSuccess(),
                result.getActiveStatus(),
                result.getRemark()
        );
    }

}

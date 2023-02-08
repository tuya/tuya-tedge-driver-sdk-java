package tuya.tedge.driver.sdk.dpmodel.convert;

import tuya.tedge.driver.sdk.dpmodel.dto.deviceservice.DeviceServiceDto;
import tuya.tedge.driver.sdk.grpc.deviceservice.DeviceService;
import tuya.tedge.driver.sdk.grpc.deviceservice.DeviceServiceByIdRequest;

public class DeviceServiceConvert {
    public DeviceServiceDto deviceServiceRpc2Dto(DeviceService deviceService) {
        if (deviceService == null) {
            return null;
        }

        return new DeviceServiceDto(
                deviceService.getId(),
                deviceService.getName(),
                deviceService.getBaseAddress(),
                deviceService.getDeviceLibraryId(),
                deviceService.getDockerContainerId(),
                deviceService.getConfig().toByteArray(),
                deviceService.getIsMountDir(),
                deviceService.getRunStatus(),
                deviceService.getExpertMode(),
                deviceService.getExpertModeContent(),
                deviceService.getDockerParamsSwitch(),
                deviceService.getDockerParams(),
                deviceService.getIsAppService()
        );
    }

    public DeviceServiceByIdRequest toDeviceServiceByIdRequest(String serviceId) {
        if (serviceId == null) {
            return null;
        }
        return DeviceServiceByIdRequest.newBuilder()
                .setId(serviceId)
                .build();
    }

}

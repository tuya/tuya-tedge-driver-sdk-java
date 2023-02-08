package tuya.tedge.driver.sdk.base.service;

import tuya.tedge.driver.sdk.base.dto.common.GatewayStateDto;
import tuya.tedge.driver.sdk.base.dto.common.LogLevelRequestDto;
import tuya.tedge.driver.sdk.base.dto.device.DeleteDeviceByIdRequestDto;
import tuya.tedge.driver.sdk.base.dto.device.DeviceAddInfoDto;
import tuya.tedge.driver.sdk.base.dto.device.DeviceUpdateInfoDto;

public interface BaseServiceCallback {
    /**
     * 云端添加设备回调
     *
     * @param request
     */
    void addDeviceCallback(DeviceAddInfoDto request);

    /**
     * 云端更新设备回调
     *
     * @param request
     */
    void updateDeviceCallback(DeviceUpdateInfoDto request);

    /**
     * 云端删除设备回调
     *
     * @param request
     */
    void deleteDeviceCallback(DeleteDeviceByIdRequestDto request);

    /**
     * 动态更改日志级别
     *
     * @param request
     */
    void changeLogLevel(LogLevelRequestDto request);

    //TODO:
    //void AppServiceAddress(AppBaseAddress) returns (google.protobuf.Empty);

    /**
     * 动态更改日志级别
     *
     * @param request
     */
    void gatewayStateCallback(GatewayStateDto request);
}

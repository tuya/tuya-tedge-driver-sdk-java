package tuya.tedge.driver.sdk.base.rpcclient;

import tuya.tedge.driver.sdk.base.convert.DeviceConvert;
import tuya.tedge.driver.sdk.base.model.ActiveDeviceResponse;
import tuya.tedge.driver.sdk.base.model.DeviceStatus;
import tuya.tedge.driver.sdk.base.utils.TimeConst;
import tuya.tedge.driver.sdk.base.dto.device.*;
import tuya.tedge.driver.sdk.grpc.device.*;

import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

@Slf4j
public class DeviceClient {
    private RpcDeviceGrpc.RpcDeviceBlockingStub blockingStub;
    private DeviceConvert convert;

    public DeviceClient(ManagedChannel channel) {
        this.blockingStub = RpcDeviceGrpc.newBlockingStub(channel);
        this.convert = new DeviceConvert();
    }


    public void AddDevice(AddDeviceRequestDto requestDto) {
        try {
            AddDeviceRequest addDevRequest = this.convert.addDeviceRequestDto2Rpc(requestDto);
            this.blockingStub.withDeadlineAfter(TimeConst.rpcTimeout, TimeUnit.SECONDS).addDevice(addDevRequest);
        } catch (StatusRuntimeException e) {
            log.error(e.getMessage());
        }
    }

    public void AddDevice(AddDeviceRequest request) {
        try {
            this.blockingStub.withDeadlineAfter(TimeConst.rpcTimeout, TimeUnit.SECONDS).addDevice(request);
        } catch (StatusRuntimeException e) {
            log.error(e.getMessage());
        }
    }

    public ActiveDeviceResponse ActivateDevice(DeviceActiveDto dto) {
        try {
            tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResponse response = this.blockingStub.activateDevice(this.convert.deviceActiveDto2Rpc(dto));
            return this.convert.activeDeviceResponseRpc2Dto(response);
        } catch (StatusRuntimeException e) {
            log.error(e.getMessage());
        }
        return null;
    }

    public void UpdateDevice(UpdateDeviceRequestDto request) {
        try {
            this.blockingStub.updateDevice(this.convert.updateDeviceRequestDto2Rpc(request));
        } catch (StatusRuntimeException e) {
            log.error(e.getMessage());
        }
    }

    public void UpdateDevice(UpdateDeviceRequest request) {
        try {
            this.blockingStub.updateDevice(request);
        } catch (StatusRuntimeException e) {
            log.error(e.getMessage());
        }
    }

    public DeviceInfoDto DeviceById(DeviceByIdRequestDto request) {
        try {
            DeviceInfo deviceInfo = this.blockingStub.deviceById(this.convert.deviceByIdRequestDto2Rpc(request));
            return this.convert.deviceInfoRpc2Dto(deviceInfo);

        } catch (StatusRuntimeException e) {
            log.error(e.getMessage());
        }
        return null;
    }

    public void DeleteDeviceById(DeleteDeviceByIdRequestDto request) {
        try {
            this.blockingStub.deleteDeviceById(this.convert.deleteDeviceByIdRequestDto2Rpc(request));
        } catch (StatusRuntimeException e) {
            log.error(e.getMessage());
        }
    }

    public MultiDeviceResponseDto DevicesSearch(DeviceSearchQueryRequestDto request) {
        MultiDeviceResponseDto multiProductsResponse = null;
        try {
            MultiDeviceResponse response = this.blockingStub.devicesSearch(this.convert.deviceSearchQueryRequestDto2Rpc(request));
            multiProductsResponse = this.convert.multiDeviceResponseRpc2Dto(response);
        } catch (StatusRuntimeException e) {
            log.error(e.getMessage());
        }
        return multiProductsResponse;
    }

    public void ReportDevicesOnlineAndOffline(DeviceStatus list) {
        try {
            this.blockingStub.reportDevicesOnlineAndOffline(this.convert.deviceOnlineAndOfflineListDto2Rpc(list));
        } catch (StatusRuntimeException e) {
            log.error(e.getMessage());
        }
    }
}

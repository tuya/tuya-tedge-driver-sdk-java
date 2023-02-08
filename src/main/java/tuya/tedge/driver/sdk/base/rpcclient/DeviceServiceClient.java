package tuya.tedge.driver.sdk.base.rpcclient;

import tuya.tedge.driver.sdk.base.utils.TimeConst;
import tuya.tedge.driver.sdk.dpmodel.convert.DeviceServiceConvert;
import tuya.tedge.driver.sdk.dpmodel.dto.deviceservice.DeviceServiceDto;
import tuya.tedge.driver.sdk.grpc.deviceservice.DeviceService;
import tuya.tedge.driver.sdk.grpc.deviceservice.RpcDeviceServiceGrpc;
import tuya.tedge.driver.sdk.grpc.deviceservice.DriverProxyRequest;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

@Slf4j
public class DeviceServiceClient {
    private RpcDeviceServiceGrpc.RpcDeviceServiceBlockingStub blockingStub;
    private DeviceServiceConvert convert;

    public DeviceServiceClient(ManagedChannel channel) {
        this.blockingStub = RpcDeviceServiceGrpc.newBlockingStub(channel);
        this.convert = new DeviceServiceConvert();
    }

    public DeviceServiceDto deviceServiceById(String id) throws StatusRuntimeException {
        DeviceServiceDto deviceServiceDto;
        try {
            DeviceService resp = this.blockingStub.withDeadlineAfter(TimeConst.rpcTimeout, TimeUnit.SECONDS).deviceServiceById(convert.toDeviceServiceByIdRequest(id));
            deviceServiceDto = this.convert.deviceServiceRpc2Dto(resp);
        } catch (StatusRuntimeException e) {
            throw e;
        }
        return deviceServiceDto;
    }

    public void driverProxyRegist(String id, String name, String host, String port) {
        log.debug("driverProxyRegist in, host:{}, port:{}", host, port);
        try {
            DriverProxyRequest proxyRequest = DriverProxyRequest.newBuilder()
                    .setId(id).setName(name).setHost(host).setPort(port).build();
            blockingStub.driverProxyRegister(proxyRequest);
        } catch (StatusRuntimeException e) {
            log.error("RPC driverProxyRegist failed:{}", e.getMessage());
        }
        log.info("driverProxyRegist success, host:{}, port:{}", host, port);
    }
}

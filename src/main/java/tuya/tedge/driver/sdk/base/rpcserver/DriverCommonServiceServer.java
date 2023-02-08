package tuya.tedge.driver.sdk.base.rpcserver;

import tuya.tedge.driver.sdk.base.convert.DeviceConvert;
import tuya.tedge.driver.sdk.dpmodel.convert.ModelConvert;
import tuya.tedge.driver.sdk.base.service.BaseServiceCallback;
import tuya.tedge.driver.sdk.grpc.common.LogLevelRequest;
import tuya.tedge.driver.sdk.grpc.device.DeleteDeviceByIdRequest;
import tuya.tedge.driver.sdk.grpc.device.DeviceAddInfo;
import tuya.tedge.driver.sdk.grpc.device.DeviceUpdateInfo;
import tuya.tedge.driver.sdk.grpc.devicecallback.DriverCommonServiceGrpc;
import tuya.tedge.driver.sdk.grpc.devicecallback.GatewayState;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;

public class DriverCommonServiceServer extends DriverCommonServiceGrpc.DriverCommonServiceImplBase {
    private BaseServiceCallback baseService;
    private DeviceConvert convert;
    private ModelConvert modelConvert;

    public DriverCommonServiceServer(BaseServiceCallback baseService) {
        this.baseService = baseService;
        this.convert = new DeviceConvert();
        this.modelConvert = new ModelConvert();
    }

    @Override
    public void addDeviceCallback(DeviceAddInfo request, StreamObserver<Empty> responseObserver) {
        baseService.addDeviceCallback(this.convert.deviceAddInfoRpc2Dto(request));
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void updateDeviceCallback(DeviceUpdateInfo request, StreamObserver<Empty> responseObserver) {
        baseService.updateDeviceCallback(this.convert.deviceUpdateInfoRpc2Dto(request));
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void deleteDeviceCallback(DeleteDeviceByIdRequest request, StreamObserver<Empty> responseObserver) {
        baseService.deleteDeviceCallback(this.convert.deleteDeviceByIdRequestRpc2Dto(request));
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void changeLogLevel(LogLevelRequest request, StreamObserver<Empty> responseObserver) {
        baseService.changeLogLevel(this.modelConvert.logLevelRpc2Dto(request));
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void gatewayStateCallback(GatewayState request, StreamObserver<Empty> responseObserver) {
        baseService.gatewayStateCallback(this.modelConvert.gatewayStateRpc2Dto(request));
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }
}
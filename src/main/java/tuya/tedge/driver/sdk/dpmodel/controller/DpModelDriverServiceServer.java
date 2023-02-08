package tuya.tedge.driver.sdk.dpmodel.controller;

import com.google.protobuf.Empty;
import tuya.tedge.driver.sdk.dpmodel.convert.CommandConvert;
import tuya.tedge.driver.sdk.dpmodel.convert.ProductConvert;
import tuya.tedge.driver.sdk.dpmodel.service.DpModelServiceCallback;
import tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest;
import tuya.tedge.driver.sdk.grpc.devicecallback.DPModelDriverServiceGrpc;
import tuya.tedge.driver.sdk.grpc.product.Product;
import io.grpc.stub.StreamObserver;

public class DpModelDriverServiceServer extends DPModelDriverServiceGrpc.DPModelDriverServiceImplBase {
    private final DpModelServiceCallback callback;
    private final ProductConvert productConvert;
    private final CommandConvert commandConvert;

    public DpModelDriverServiceServer(DpModelServiceCallback callback) {
        this.callback = callback;
        this.productConvert = new ProductConvert();
        this.commandConvert = new CommandConvert();
    }

    @Override
    public void updateProductCallback(Product request, StreamObserver<Empty> responseObserver) {
        callback.updateProductCallback(productConvert.productRpc2Dto(request));
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void issueCommand(CmdRequest request, StreamObserver<Empty> responseObserver) {
        callback.issueCommand(this.commandConvert.cmdRequestRpc2Dto(request));
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }
}
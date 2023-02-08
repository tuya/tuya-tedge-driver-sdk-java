package tuya.tedge.driver.sdk.base.rpcserver;

import com.google.protobuf.Empty;
import tuya.tedge.driver.sdk.base.utils.Version;
import tuya.tedge.driver.sdk.grpc.common.CommonGrpc;
import tuya.tedge.driver.sdk.grpc.common.Pong;
import tuya.tedge.driver.sdk.grpc.common.VersionResponse;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
public class CommonServer extends CommonGrpc.CommonImplBase {

    public CommonServer() {
    }

    @Override
    public void ping(Empty request, StreamObserver<Pong> responseObserver) {
        String time = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now());
        Pong pong = Pong.newBuilder().setTimestamp(time).build();
        responseObserver.onNext(pong);
        responseObserver.onCompleted();
    }

    @Override
    public void version(Empty request, StreamObserver<VersionResponse> responseObserver) {
        VersionResponse resp = VersionResponse.newBuilder().setVersion(Version.version).build();
        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }
}

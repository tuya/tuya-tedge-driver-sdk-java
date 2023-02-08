package tuya.tedge.driver.sdk.base.rpcclient;

import com.google.protobuf.Empty;
import tuya.tedge.driver.sdk.base.convert.GatewayConvert;
import tuya.tedge.driver.sdk.base.model.GatewayInfo;
import tuya.tedge.driver.sdk.base.utils.TimeConst;
import tuya.tedge.driver.sdk.grpc.gateway.GateWayInfoResponse;
import tuya.tedge.driver.sdk.grpc.gateway.RpcGatewayForDeviceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

@Slf4j
public class GatewayClient {
    private RpcGatewayForDeviceGrpc.RpcGatewayForDeviceBlockingStub blockingStub;
    private GatewayConvert convert;

    public GatewayClient(ManagedChannel channel) {
        this.blockingStub = RpcGatewayForDeviceGrpc.newBlockingStub(channel);
        this.convert = new GatewayConvert();
    }

    public GatewayInfo GateGatewayInfo() {
        try {
            GateWayInfoResponse resp = blockingStub.withDeadlineAfter(TimeConst.rpcTimeout, TimeUnit.SECONDS).getGatewayInfo(Empty.newBuilder().build());
            return convert.gateWayInfoResponseRpc2Model(resp);
        } catch (StatusRuntimeException e) {
            log.error(e.getMessage());
        }

        return null;
    }
}

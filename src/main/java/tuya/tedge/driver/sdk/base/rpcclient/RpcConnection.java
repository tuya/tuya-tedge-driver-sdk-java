package tuya.tedge.driver.sdk.base.rpcclient;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

@Slf4j
public class RpcConnection {

    private ManagedChannel channel;

    RpcConnection(String addr) {
        channel = ManagedChannelBuilder.forTarget(addr)
                .maxRetryAttempts(1)
                .keepAliveTime(10, TimeUnit.SECONDS)
                .keepAliveTimeout(5, TimeUnit.SECONDS)
                .usePlaintext()
                .build();
    }

    public ManagedChannel getChannel() {
        return channel;
    }

    /**
     * todo 后续考虑添加连接池子
     *
     * @param addr
     * @return
     */
    public static RpcConnection GetRpcConnection(String addr) {
        return new RpcConnection(addr);
    }

    public void close() {
        try {
            channel.shutdown().awaitTermination(3, TimeUnit.SECONDS);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }
}

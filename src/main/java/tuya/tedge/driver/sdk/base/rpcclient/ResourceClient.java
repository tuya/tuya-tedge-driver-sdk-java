package tuya.tedge.driver.sdk.base.rpcclient;

import tuya.tedge.driver.sdk.base.config.ClientConfig;
import io.grpc.ManagedChannel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Getter
public class ResourceClient {
    private List<RpcConnection> rpcConnections;
    /**
     * rpc客户端
     */
    private EventClient eventClient;
    private AlertClient alertClient;
    private DeviceClient deviceClient;
    private DeviceServiceClient deviceServiceClient;
    private GatewayClient gatewayClient;
    private ProductClient productClient;
    private DriverStorageClient driverStorageClient;

    public ResourceClient() {
        log.info("create a resource client addr:" + ClientConfig.config.rpcConfig().getResourceAddr());
        this.rpcConnections = new ArrayList<>();
    }

    public ResourceClient init() {
        this.eventClient = new EventClient(getChannel());
        this.alertClient = new AlertClient(getChannel());
        this.deviceClient = new DeviceClient(getChannel());
        this.deviceServiceClient = new DeviceServiceClient(getChannel());
        this.gatewayClient = new GatewayClient(getChannel());
        this.productClient = new ProductClient(getChannel());
        this.driverStorageClient = new DriverStorageClient(getChannel());
        return this;
    }

    public void closeConnection() {
        for (RpcConnection c : this.rpcConnections) {
            c.close();
        }
    }

    private ManagedChannel getChannel() {
        final RpcConnection c1 = new RpcConnection(ClientConfig.config.rpcConfig().getResourceAddr());
        this.rpcConnections.add(c1);
        return c1.getChannel();
    }

    public EventClient getEventClient() {
        if (this.eventClient == null) {
            this.eventClient = new EventClient(getChannel());
            return this.eventClient;
        }
        return this.eventClient;
    }

    public AlertClient getAlertClient() {
        if (this.alertClient == null) {
            this.alertClient = new AlertClient(getChannel());
            return this.alertClient;
        }
        return this.alertClient;
    }

    public DeviceClient getDeviceClient() {
        if (this.deviceClient == null) {
            this.deviceClient = new DeviceClient(getChannel());
            return this.deviceClient;
        }
        return this.deviceClient;
    }

    public DeviceServiceClient getDeviceServiceClient() {
        if (this.deviceServiceClient == null) {
            this.deviceServiceClient = new DeviceServiceClient(getChannel());
            return this.deviceServiceClient;
        }
        return this.deviceServiceClient;
    }

    public GatewayClient getGatewayClient() {
        if (this.gatewayClient == null) {
            this.gatewayClient = new GatewayClient(getChannel());
            return this.gatewayClient;
        }
        return this.gatewayClient;
    }

    public ProductClient getProductClient() {
        if (this.productClient == null) {
            this.productClient = new ProductClient(getChannel());
            return this.productClient;
        }
        return this.productClient;
    }

    public DriverStorageClient getDriverStorageClient() {
        if (this.driverStorageClient == null) {
            this.driverStorageClient = new DriverStorageClient(getChannel());
            return this.driverStorageClient;
        }
        return this.driverStorageClient;
    }
}

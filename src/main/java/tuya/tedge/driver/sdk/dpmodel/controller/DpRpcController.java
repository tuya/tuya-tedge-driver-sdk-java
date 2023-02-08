package tuya.tedge.driver.sdk.dpmodel.controller;

import tuya.tedge.driver.sdk.base.utils.PrintException;
import tuya.tedge.driver.sdk.base.config.ServiceConfig;
import tuya.tedge.driver.sdk.base.rpcserver.CommonServer;
import tuya.tedge.driver.sdk.base.rpcserver.DriverCommonServiceServer;
import tuya.tedge.driver.sdk.base.thread.AsyncTaskExecutor;
import tuya.tedge.driver.sdk.dpmodel.service.DpModelService;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Slf4j
public class DpRpcController {
    private Server server;
    private ServiceConfig config;
    private AsyncTaskExecutor asyncTaskExecutor;

    public DpRpcController(ServiceConfig config) {
        this.config = config;
        this.asyncTaskExecutor = new AsyncTaskExecutor("RPC_Server", 1, 3, 5000, "RpcServerPool_");
    }

    public DpRpcController registerService(DpModelService service) {
        log.info("DpModel RegisterService Success");

        this.server = ServerBuilder.forPort(Integer.parseInt(this.config.getPort()))
                .addService(new DpModelDriverServiceServer(service))
                .addService(new DriverCommonServiceServer(service))
                .addService(new CommonServer())
                .build();
        return this;
    }

    public void start() {
        this.asyncTaskExecutor.execute(() -> {
            try {
                log.info("DpRpcController rpc Server Start");
                this.server.start();
                this.server.awaitTermination();
            } catch (IOException | InterruptedException e) {
                PrintException.printStack(e);
            }
        });
    }

    public void stop() throws InterruptedException {
        if (server != null) {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }
}

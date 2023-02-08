package tuya.tedge.driver.sdk.dpmodel;

import tuya.tedge.driver.sdk.base.rpcclient.ResourceClient;
import tuya.tedge.driver.sdk.base.rpcclient.GatewayClient;
import tuya.tedge.driver.sdk.base.config.ClientConfig;
import tuya.tedge.driver.sdk.base.model.GatewayModel;
import tuya.tedge.driver.sdk.base.model.GatewayInfo;
import tuya.tedge.driver.sdk.base.mqttitf.MqttDriver;
import tuya.tedge.driver.sdk.dpmodel.controller.DpRpcController;
import tuya.tedge.driver.sdk.dpmodel.service.DpModelService;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.cli.*;

@Slf4j
public class DpDriverService {
    private ClientConfig config;
    private DpModelService dpService;

    public DpDriverService(String[] args) throws Exception {
        Options options = new Options();

        Option configOption = new Option("c", "config", true, "config file path");
        configOption.setRequired(false);
        options.addOption(configOption);

        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = null;
        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            log.error("1.DpDriverService parse commandline exception:{}", e.getMessage());
            System.exit(1);
        }

        String configFilePath = null;
        if (cmd != null) {
            configFilePath = cmd.getOptionValue("config");
            if (configFilePath == null) {
                configFilePath = "/etc/driver/res/configuration.toml";
            }
        }

        try {
            ClientConfig.loadConfig(configFilePath);
        } catch (Exception e) {
            log.error("3.DpDriverService init config fail:{}", e.getMessage());
            throw e;
        }

        this.config = ClientConfig.config;
        this.dpService = new DpModelService(this.config);
        try {
            this.dpService.init();
        } catch (Exception e) {
            log.error("4.DpDriverService init DpModelService exception:{}", e.getMessage());
            throw e;
        }

        try {
            this.dpService.initCache();
        } catch (Exception e) {
            log.error("5.DpDriverService init initShadows exception:{}", e.getMessage());
            throw e;
        }

        log.info("x.DpDriverService init complete configPath:{}", configFilePath);
    }

    public GatewayModel getTEdgeModel() {
        ResourceClient resClient = new ResourceClient();
        GatewayClient gwClient = resClient.getGatewayClient();
        GatewayInfo gwInfo = gwClient.GateGatewayInfo();
        resClient.closeConnection();

        //log.info("GATEWAY INFO: env:{},gwId:{},region:{},dataModel:{} ", gwInfo.getEnv(), gwInfo.getGwId(), gwInfo.getRegion(), gwInfo.getDataModel());
        return gwInfo.getDataModel();
    }

    public DpDriverService setMqttDriverImpl(MqttDriver mqttDriverImpl, String username) {
        if (mqttDriverImpl == null) {
            log.error("setMqttDriverImpl MqttDriver impl is null, exit.");
            System.exit(-1);
        }

        dpService.setMqttDriverImpl(mqttDriverImpl, username);
        return this;
    }

    public DpDriverService start(DPModelDriver dpDriverImpl) {
        if (dpDriverImpl == null) {
            log.error("setDpDriverImpl DPModelDriver impl is null, exit.");
            System.exit(-1);
        }
        dpService.setDpDriverImpl(dpDriverImpl);

        if (dpService.mqttClient != null) {
            dpService.mqttClient.connect();
        }

        DpRpcController rpcController = new DpRpcController(config.serviceConfig());
        rpcController.registerService(dpService).start();

        dpService.registerSignal();

        return this;
    }

    public DpDriverApi getDpDriverApi() {
        return dpService;
    }
}

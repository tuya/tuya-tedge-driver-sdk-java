package tuya.tedge.driver.sdk.base.config;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import net.consensys.cava.toml.Toml;
import net.consensys.cava.toml.TomlParseResult;
import net.consensys.cava.toml.TomlTable;

import java.nio.file.Path;
import java.nio.file.Paths;

@Slf4j(topic = "")
@ToString
public class ClientConfig {
    public static ClientConfig config;
    private TomlTable customConfig;
    private LoggerConfig loggerConfig;
    private MqttConfig mqttConfig;
    private RpcConfig rpcConfig;
    private ServiceConfig serviceConfig;

    ClientConfig() {
    }

    public static void loadConfig(String configFile) throws Exception {
        Path source = Paths.get(configFile);
        TomlParseResult result = Toml.parse(source);

        config = new ClientConfig();
        config.customConfig = result.getTable("CustomConfig");

        //logger
        config.loggerConfig = new LoggerConfig(
                result.getString("Logger.FileName"),
                result.getString("Logger.LogLevel")
        );

        //mqtt
        config.mqttConfig = new MqttConfig(
                result.getString("Clients.MQTTBroker.Address"),
                result.getBoolean("Clients.MQTTBroker.UseTLS"),
                result.getString("Clients.MQTTBroker.CertFilePath")
        );

        //rpc
        config.rpcConfig = new RpcConfig(
                result.getString("Clients.Resource.Address"),
                result.getBoolean("Clients.Resource.UseTLS"),
                result.getString("Clients.Resource.CertFilePath")
        );
        //service
        String address = result.getString("Service.Server.Address");
        config.serviceConfig = new ServiceConfig(
                result.getString("Service.ID"),
                result.getString("Service.Name"),
                address,
                getPort(address),
                result.getBoolean("Service.Server.UseTLS"),
                result.getString("Service.Server.CertFile"),
                result.getString("Service.Server.KeyFile"),
                null,
                result.getBoolean("Service.Server.Activated")
        );

        log.info("Start: load driver config resource addr:{}, mqtt addr:{}, serviceId:{}",
                config.rpcConfig.getResourceAddr(),
                config.mqttConfig.getBrokerAddr(),
                config.serviceConfig.getId());
    }

    private static String getPort(String addr) {//127.0.0.1:9000
        if (addr == null) {
            return "";
        }
        final String[] split = addr.split(":");
        if (split.length == 0) {
            return "";
        }
        return split[split.length - 1];
    }

    public TomlTable customConfig() {
        return customConfig;
    }

    public LoggerConfig loggerConfig() {
        return loggerConfig;
    }

    public MqttConfig mqttConfig() {
        return mqttConfig;
    }

    public RpcConfig rpcConfig() {
        return rpcConfig;
    }

    public ServiceConfig serviceConfig() {
        return serviceConfig;
    }

}

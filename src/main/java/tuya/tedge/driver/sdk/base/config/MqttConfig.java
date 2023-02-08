package tuya.tedge.driver.sdk.base.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Slf4j
@Data
public class MqttConfig {
    private final String DRIVER_CLIENT_PREFIX = "driver-";
    private final String DriverTopicPrefix = "tedge/driver/";
    private final String innerTopicPrefix = "tedge/inner/";
    private String brokerAddr;
    private Boolean brokerUseTls;
    private String brokerCertFilePath;
    private String userName;
    private String password;
    private String clientId;
    private String brokerSubTopic;
    private String brokerPubTopic;
    //毫秒
    private int sendPeriod = 10;
    private int maxPerPeriod = 10;
    private int sendQueueSize = 600000;
    private int minReconnectPeriod = 1000;
    private int maxReconnectPeriod = 60000;

    public MqttConfig(String address, Boolean useTls, String certFilePath) {
        this.brokerAddr = address;
        this.brokerUseTls = useTls;
        this.brokerCertFilePath = certFilePath;
    }

    public void updateUsername(String username) {
        if (username == null) {
            log.error("mqtt setUsername username is null");
            return;
        }

        this.userName = username;
        this.clientId = DRIVER_CLIENT_PREFIX + userName;
        this.brokerPubTopic = DriverTopicPrefix + userName + "tx";
        this.brokerSubTopic = DriverTopicPrefix + userName + "rx";
        this.password = getMd5Str(userName).substring(8, 24);
    }

//    //TODO:
//    public void setConnectHandler() {
//
//    }

    private String getMd5Str(String str) {
        byte[] digest;
        try {
            MessageDigest md5 = MessageDigest.getInstance("md5");
            digest = md5.digest(str.getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException e) {
            log.error("getMd5Str e:{}", e.getMessage());
            return "";
        }

        //16是表示转换为16进制数
        return new BigInteger(1, digest).toString(16);
    }

    @Override
    public String toString() {
        return "MqttConfig{" +
                "DRIVER_CLIENT_PREFIX='" + DRIVER_CLIENT_PREFIX + '\'' +
                ", DriverTopicPrefix='" + DriverTopicPrefix + '\'' +
                ", innerTopicPrefix='" + innerTopicPrefix + '\'' +
                ", brokerAddr='" + brokerAddr + '\'' +
                ", brokerUseTls=" + brokerUseTls +
                ", brokerCertFilePath='" + brokerCertFilePath + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", clientId='" + clientId + '\'' +
                ", brokerSubTopic='" + brokerSubTopic + '\'' +
                ", brokerPubTopic='" + brokerPubTopic + '\'' +
                ", sendPeriod=" + sendPeriod +
                ", maxPerPeriod=" + maxPerPeriod +
                ", sendQueueSize=" + sendQueueSize +
                ", minReconnectPeriod=" + minReconnectPeriod +
                ", maxReconnectPeriod=" + maxReconnectPeriod +
                '}';
    }
}

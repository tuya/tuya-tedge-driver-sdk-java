package tuya.tedge.driver.sdk.base.mqtt;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class PubTopic {
    @JSONField(name = "ClientId")
    private String ClientId;
    @JSONField(name = "Username")
    private String Username;
    @JSONField(name = "Topic")
    private String Topic;
    @JSONField(name = "Qos")
    private Byte Qos;
    @JSONField(name = "Retained")
    private Boolean Retained;
    @JSONField(name = "Pass")
    private Boolean Pass;
    @JSONField(name = " Msg")
    private String Msg;

    public PubTopic() {
    }

    public PubTopic(String clientId, String username, String topic, Byte qos, Boolean retained, Boolean pass, String msg) {
        ClientId = clientId;
        Username = username;
        Topic = topic;
        Qos = qos;
        Retained = retained;
        Pass = pass;
        Msg = msg;
    }
}
package tuya.tedge.driver.sdk.base.mqtt;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class SubTopic {
    @JSONField(name = "Topic")
    private String Topic;
    @JSONField(name = "Qos")
    private Byte Qos;
    @JSONField(name = "Pass")
    private Boolean Pass;
    @JSONField(name = "Msg")
    private String Msg;

    public SubTopic() {
    }

    public SubTopic(String topic, Byte qos, Boolean pass, String msg) {
        Topic = topic;
        Qos = qos;
        Pass = pass;
        Msg = msg;
    }
}
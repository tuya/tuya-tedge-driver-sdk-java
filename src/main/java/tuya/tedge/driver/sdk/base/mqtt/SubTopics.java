package tuya.tedge.driver.sdk.base.mqtt;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class SubTopics {
    @JSONField(name = "ClientId")
    private String ClientId;
    @JSONField(name = "Username")
    private String Username;
    @JSONField(name = "Topics")
    private SubTopic[] Topics;

    public SubTopics() {
    }

    public SubTopics(String clientId, String username, SubTopic[] topics) {
        ClientId = clientId;
        Username = username;
        Topics = topics;
    }
}

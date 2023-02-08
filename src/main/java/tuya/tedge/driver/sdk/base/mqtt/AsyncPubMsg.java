package tuya.tedge.driver.sdk.base.mqtt;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class AsyncPubMsg {
    @JSONField(name = "Id")
    private Long Id;
    @JSONField(name = "Type")
    private Integer Type;
    @JSONField(name = "Data")
    private PubTopic Data;

    public AsyncPubMsg() {
    }

    public AsyncPubMsg(Long id, Integer type, PubTopic data) {
        Id = id;
        Type = type;
        Data = data;
    }
}

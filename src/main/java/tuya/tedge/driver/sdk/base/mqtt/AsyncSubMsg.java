package tuya.tedge.driver.sdk.base.mqtt;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class AsyncSubMsg {
    @JSONField(name = "Id")
    private Long Id;
    @JSONField(name = "Type")
    private Integer Type;
    @JSONField(name = "Data")
    private SubTopics Data;

    public AsyncSubMsg() {
    }

    public AsyncSubMsg(Long id, Integer type, SubTopics data) {
        Id = id;
        Type = type;
        Data = data;
    }
}

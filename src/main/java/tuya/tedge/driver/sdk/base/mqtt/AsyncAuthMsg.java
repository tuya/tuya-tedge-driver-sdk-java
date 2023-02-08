package tuya.tedge.driver.sdk.base.mqtt;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class AsyncAuthMsg {
    @JSONField(name = "Id")
    private Long Id;
    @JSONField(name = "Type")
    private Integer Type;
    @JSONField(name = "Data")
    private AuthCheck Data;

    public AsyncAuthMsg() {
    }

    public AsyncAuthMsg(Long id, Integer type, AuthCheck data) {
        Id = id;
        Type = type;
        Data = data;
    }
}

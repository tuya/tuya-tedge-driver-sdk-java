package tuya.tedge.driver.sdk.base.mqtt;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class AsyncMsgDto {
    @JSONField(name = "Id")
    private Long Id;
    @JSONField(name = "Type")
    private Integer Type;
    @JSONField(name = "Data")
    private String Data;

    public AsyncMsgDto() {
    }

    public AsyncMsgDto(Long id, Integer type, String data) {
        Id = id;
        Type = type;
        Data = data;
    }
}

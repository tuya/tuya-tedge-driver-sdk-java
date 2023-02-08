package tuya.tedge.driver.sdk.dpmodel.dto.command;

import tuya.tedge.driver.sdk.base.dto.common.MqttProtocolType;
import lombok.Data;

@Data
public class CmdRequestDto {
    private String cid;
    private MqttProtocolType protocol;
    private Long s;
    private Long t;
    private byte[] data;

    public CmdRequestDto(String cid, MqttProtocolType protocol, Long s, Long t, byte[] data) {
        this.cid = cid;
        this.protocol = protocol;
        this.s = s;
        this.t = t;
        this.data = data;
    }
}

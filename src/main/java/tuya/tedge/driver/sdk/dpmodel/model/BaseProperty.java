package tuya.tedge.driver.sdk.dpmodel.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class BaseProperty {
    @JSONField(name = "name")
    private String name;
    @JSONField(name = "ip")
    private String ip;
    @JSONField(name = "lat")
    private String lat;
    @JSONField(name = "lon")
    private String lon;


    public BaseProperty() {
    }

    public BaseProperty(String name, String ip, String lat, String lon) {
        this.name = name;
        this.ip = ip;
        this.lat = lat;
        this.lon = lon;
    }
}

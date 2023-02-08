package tuya.tedge.driver.sdk.dpmodel.dto.event;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UploadTokenInfo {
    @JSONField(name = "uploadUrl")
    private String uploadUrl;
    @JSONField(name = "token")
    private String token;

    public UploadTokenInfo() {
    }

    public UploadTokenInfo(String uploadUrl, String token) {
        this.uploadUrl = uploadUrl;
        this.token = token;
    }
}

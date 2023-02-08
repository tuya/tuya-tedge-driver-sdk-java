package tuya.tedge.driver.sdk.dpmodel.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ImageFileInfo {
    @JSONField(name = "tmp_file_id")
    private String tmpFileId;

    public ImageFileInfo() {
    }

    public ImageFileInfo(String tmpFileId) {
        this.tmpFileId = tmpFileId;
    }
}

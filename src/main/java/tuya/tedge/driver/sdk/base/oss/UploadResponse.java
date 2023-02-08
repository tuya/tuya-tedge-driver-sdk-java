package tuya.tedge.driver.sdk.base.oss;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class UploadResponse {
    private String bucket;
    private String objectKey;
    private String secretKey;
    private Long expireTime;

    public UploadResponse() {
    }

    public UploadResponse(String bucket, String objectKey, String secretKey, Long expireTime) {
        this.bucket = bucket;
        this.objectKey = objectKey;
        this.secretKey = secretKey;
        this.expireTime = expireTime;
    }
}

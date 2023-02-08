package tuya.tedge.driver.sdk.base.dto.common;

import lombok.Data;

@Data
public class LogLevelRequestDto {
    private LogLevelType logLevel;

    public LogLevelRequestDto(LogLevelType logLevel) {
        this.logLevel = logLevel;
    }

    public LogLevelRequestDto() {
    }
}

package tuya.tedge.driver.sdk.base.dto.common;

public enum LogLevelType {
    /**
     * 日志级别类型
     */
    ENUM_LOG_LEVEL_UNSPECIFIE(0),
    ENUM_LOG_LEVEL_DEBUG(1),
    ENUM_LOG_LEVEL_INFO(2),
    ENUM_LOG_LEVEL_WARNING(3),
    ENUM_LOG_LEVEL_ERROR(4);

    private Integer level;

    LogLevelType(int i) {
        this.level = i;
    }

    public Integer getValue() {
        return this.level;
    }

    public static LogLevelType typeOfValue(Integer value) {
        for (LogLevelType e : LogLevelType.values()) {
            if (e.getValue().equals(value)) {
                return e;
            }
        }
        return ENUM_LOG_LEVEL_UNSPECIFIE;
    }
}

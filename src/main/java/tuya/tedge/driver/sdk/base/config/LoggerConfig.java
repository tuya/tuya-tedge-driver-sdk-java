package tuya.tedge.driver.sdk.base.config;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.Level;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;


@Data
@Slf4j
public class LoggerConfig {
    private String fileName = "";
    private String logLevel = "DEBUG";

    public LoggerConfig() {
    }

    public LoggerConfig(String fileName, String logLevel) {
        this.fileName = fileName;
        this.logLevel = logLevel;
    }

    public static void dynamicUpdateLoggerLevel(Level level) {
        // 第一步：获取日志上下文
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        // 第二步：获取日志对象 （日志是有继承关系的，关闭上层，下层如果没有特殊说明也会关闭,可以是其他包）
        ch.qos.logback.classic.Logger rootLogger = lc.getLogger("root");
        // 第三步：修改日志级别
        String originalLogLevel = rootLogger.getLevel().levelStr;
        rootLogger.setLevel(level);

        log.info("logger-level {} to {}", originalLogLevel, rootLogger.getLevel().levelStr);
    }

}
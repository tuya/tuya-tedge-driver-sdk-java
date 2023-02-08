package tuya.tedge.driver.sdk.base.utils;

import lombok.extern.slf4j.Slf4j;

import java.io.*;

@Slf4j
public class PrintException {
    public PrintException() {
    }

    public static void printStack(Exception e) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        e.printStackTrace(writer);
        StringBuffer buffer = stringWriter.getBuffer();
        String errMsg = buffer.toString();
        log.error("main exception:{}", errMsg);
    }
}
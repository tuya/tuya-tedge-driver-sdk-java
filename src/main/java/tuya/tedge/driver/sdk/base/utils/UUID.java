package tuya.tedge.driver.sdk.base.utils;

import com.fasterxml.uuid.EthernetAddress;
import com.fasterxml.uuid.Generators;
import com.fasterxml.uuid.impl.TimeBasedGenerator;
import lombok.Data;

@Data
public class UUID {
    private static TimeBasedGenerator generator;

    static {
        generator = Generators.timeBasedGenerator(EthernetAddress.fromInterface());
    }

    public static String genUuid() {
        return generator.generate().toString();
    }
}

package tuya.tedge.driver.sdk.base.signal;

import lombok.extern.slf4j.Slf4j;
//import sun.misc.*;

//@Slf4j
//@SuppressWarnings("restriction")
//public class SignalExit implements SignalHandler {
//
//    public void handle(Signal arg) {
//        log.warn("SignalExit handle signal:{} is recevied", arg.getName());
//    }
//}

@Slf4j
public class SignalExit {

    public void handle() {
        log.warn("SignalExit handle signal is recevied");
    }
}
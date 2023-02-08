package tuya.tedge.driver.sdk.base.mqtt;

import tuya.tedge.driver.sdk.base.mqttitf.MqttDriver;
import tuya.tedge.driver.sdk.base.config.MqttConfig;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.paho.client.mqttv3.*;

@Slf4j
public class MqttClient {
    private MqttConfig config;
    private MqttConnection connection;

    public MqttClient(MqttConfig config) {
        this.config = config;
    }

    public void connect() {
        if (this.connection == null) {
            this.connection = new MqttConnection(this.config);
        }
        if (!this.connection.open()) {
            connection.reconnect();
        }
    }

    public void setMqttDriverImpl(MqttDriver mqttDriverImpl) {
        if (this.connection == null) {
            this.connection = new MqttConnection(this.config);
        }
        this.connection.setMqttDriverImpl(mqttDriverImpl);
    }

    public void close() throws MqttException {
        this.connection.close();
        log.info("Transport connection is closed");
    }

    public Boolean Subscribe(String topic, Byte qos, IMqttMessageListener listener) throws MqttException {
        if (isInnerTopicPrefix(topic)) {
            return false;
        }
        return this.connection.Subscribe(topic, qos, listener);
    }

    public Boolean Publish(String topic, byte[] payload, Byte qos, Boolean retained) {
        if (isInnerTopicPrefix(topic)) {
            return false;
        }
        return this.connection.Publish(topic, payload, qos, retained);
    }

    public Boolean UnSubscribe(String[] topic) {
        for (String s : topic) {
            if (isInnerTopicPrefix(s)) {
                return false;
            }
        }
        return this.connection.UnSubscribe(topic);
    }

    private Boolean isInnerTopicPrefix(String topic) {
        if (topic == null) {
            log.error("topic is null");
            return false;
        }
        String innerPrefix = config.getInnerTopicPrefix();
        if (topic.length() < innerPrefix.length()) {
            return false;
        }
        if (!topic.startsWith(innerPrefix)) {
            return false;
        }

        log.error("inner topic:{}...", topic);
        return true;
    }
}






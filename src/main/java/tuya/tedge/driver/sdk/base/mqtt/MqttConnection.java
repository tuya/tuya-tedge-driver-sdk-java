package tuya.tedge.driver.sdk.base.mqtt;

import com.alibaba.fastjson.JSON;
import tuya.tedge.driver.sdk.base.mqttitf.MqttDriver;
import tuya.tedge.driver.sdk.base.config.MqttConfig;
import tuya.tedge.driver.sdk.base.exception.TransportException;
import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class MqttConnection implements MqttCallbackExtended {
    private MqttConfig config;
    private MqttAsyncClient client;
    private MqttDriver mqttDriver;
    private static final int AUTH = 1;
    private static final int SUB = 2;
    private static final int PUB = 3;
    private static final int UN_SUB = 4;
    private static final int CONNECTED = 5;
    private static final int CLOSED = 6;

    MqttConnection(MqttConfig config) {
        this.config = config;
    }

    protected void setMqttDriverImpl(MqttDriver mqttDriverImpl) {
        this.mqttDriver = mqttDriverImpl;
    }

    public Boolean open() {
        try {
            String clientId = this.config.getClientId();
            this.client = new MqttAsyncClient(this.config.getBrokerAddr(), clientId, new MemoryPersistence());

            //设置回调
            this.client.setCallback(this);
            MqttConnectOptions options = new MqttConnectOptions();
            options.setUserName(this.config.getUserName());
            options.setPassword(this.config.getPassword().toCharArray());

            options.setAutomaticReconnect(true);
            options.setCleanSession(true);
            options.setKeepAliveInterval(5);
            options.setConnectionTimeout(10);
            options.setHttpsHostnameVerificationEnabled(false);
            options.setMaxInflight(2000);

            log.info("MqttConnection connect mqtt server {}", this.config.getBrokerAddr());
            IMqttToken token = this.client.connect(options);
            token.waitForCompletion();

            Subscribe(this.config.getBrokerSubTopic(), (byte) 1);
        } catch (MqttException var7) {
            log.error("MqttConnection open exception:{}", var7.getMessage());
            return false;
        }
        log.info("MqttConnection Open Mqtt Success");
        return true;
    }

    @Override
    public void connectionLost(Throwable throwable) {
        log.info("MqttConnection connectionLost, error = {}", this.convertException(throwable).getMessage());
    }

    @Override
    public void messageArrived(String topic, MqttMessage mqttMessage) {
        log.info("MqttConnection messageArrived topic:{},mqttMsg:{},payload:{}", topic, mqttMessage, mqttMessage.getPayload());

        InnerMessage msg = this.convertMessage(topic, mqttMessage);
        AsyncMsgDto brokerMsg = JSON.parseObject(msg.getPayload(), AsyncMsgDto.class);
        Object replyMsg;
        if (brokerMsg == null) {
            log.error("MqttConnection mqtt msg auth error,broker msg is null");
            return;
        }

        Long brokerMsgId = brokerMsg.getId();
        switch (brokerMsg.getType()) {
            case AUTH:
                AuthCheck auth = JSON.parseObject(brokerMsg.getData(), AuthCheck.class);
                if (auth == null) {
                    log.error("MqttConnection AuthCheck is null");
                    return;
                }
                log.info("MqttConnection auth type authCheck:{}", auth);
                Boolean pass = mqttDriver.auth(auth.getClientId(), auth.getUserName(), auth.getPassword());
                auth.setPass(pass);
                replyMsg = new AsyncAuthMsg(
                        brokerMsgId,
                        AUTH,
                        auth
                );
                break;
            case SUB:
                SubTopics sub = JSON.parseObject(brokerMsg.getData(), SubTopics.class);
                if (sub == null) {
                    log.error("MqttConnection SubTopics is null");
                    return;
                }
                log.info("MqttConnection sub type authCheck:{}", sub);
                for (SubTopic subTopic : sub.getTopics()) {
                    log.info("MqttConnection sub type authCheck topic:{}", subTopic.toString());
                    Boolean subPass = mqttDriver.subscribe(sub.getClientId(), sub.getUsername(), subTopic.getTopic(), subTopic.getQos());
                    subTopic.setPass(subPass);
                }
                replyMsg = new AsyncSubMsg(
                        brokerMsgId,
                        SUB,
                        sub
                );
                break;
            case PUB:
                PubTopic pub = JSON.parseObject(brokerMsg.getData(), PubTopic.class);
                if (pub == null) {
                    log.error("MqttConnection PubTopic is null");
                    return;
                }
                log.info("MqttConnection pub type PubTopic:{}", pub);
                Boolean pubPass = mqttDriver.publish(pub.getClientId(), pub.getUsername(), pub.getTopic(), pub.getQos(), pub.getRetained());
                pub.setPass(pubPass);
                replyMsg = new AsyncPubMsg(
                        brokerMsgId,
                        PUB,
                        pub
                );
                break;
            case UN_SUB:
                UnSubNotify unSub = JSON.parseObject(brokerMsg.getData(), UnSubNotify.class);
                if (unSub == null) {
                    log.error("MqttConnection UnSubNotify is null");
                    return;
                }
                log.info("MqttConnection UnSub type Notify{}", unSub);
                mqttDriver.unSubscribe(unSub.getClientId(), unSub.getUsername(), unSub.getTopics());
                return;
            case CONNECTED:
                ConnectedNotify conn = JSON.parseObject(brokerMsg.getData(), ConnectedNotify.class);
                if (conn == null) {
                    log.error("MqttConnection ConnectedNotify is null");
                    return;
                }
                log.info("MqttConnection Connected type ConnectedNotify{}", conn);
                mqttDriver.connected(conn.getClientId(), conn.getUsername());
                return;
            case CLOSED:
                ClosedNotify closedNotify = JSON.parseObject(brokerMsg.getData(), ClosedNotify.class);
                if (closedNotify == null) {
                    log.error("MqttConnection ClosedNotify is null");
                    return;
                }
                log.info("MqttConnection Closed type ClosedNotify{}", closedNotify);
                mqttDriver.closed(closedNotify.getClientId(), closedNotify.getUsername());
                return;
            default:
                log.error("MqttConnection Invalid type:{}", brokerMsg.getType());
                return;
        }

        try {
            byte[] buff = JSON.toJSONBytes(replyMsg);
            this.SendAckMessage(buff);
        } catch (Exception e) {
            log.error("MqttConnection messageArrived exception:{}", e.getMessage());
        }
    }

    @Override
    public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
    }

    @Override
    public void connectComplete(boolean var1, String var2) {
        log.info("MqttConnection connectComplete var1:{}, var2:{}", var1, var2);
    }

    private InnerMessage convertMessage(String topic, MqttMessage msg) {
        return new InnerMessage(topic, msg.getPayload(), Integer.toString(msg.getId()));
    }

    private TransportException convertException(Throwable e) {
        TransportException transportException = new TransportException(e.getMessage(), e);
        if (e instanceof MqttException) {
            MqttException mqttException = (MqttException) e;
            log.error("MqttException, reasonCode = {}, message = {}", mqttException.getReasonCode(), mqttException.getMessage());
            switch (mqttException.getReasonCode()) {
                case 1:
                case 2:
                case 4:
                case 5:
                    break;
                case 3:
                default:
                    transportException.setRetryable(true);
            }
        }

        return transportException;
    }

    protected Boolean Publish(String topic, byte[] payload, int qos, boolean retained) {
        try {
            this.client.publish(topic, payload, qos, retained);
        } catch (Exception e) {
            log.error(e.getMessage());
            return false;
        }
        log.info("MqttConnection publish Topic:{} ,success", topic);
        return true;
    }

    //发送消息给默认的broker topic
    public void SendAckMessage(byte[] payload) throws MqttException {
        IMqttDeliveryToken token = this.client.publish(this.config.getBrokerPubTopic(), payload, (byte) 1, false);
        token.waitForCompletion();
    }

    public Boolean Subscribe(String topic, Byte qos) {
        try {
            IMqttToken token = client.subscribe(topic, qos);
            token.waitForCompletion();
        } catch (Exception e) {
            log.error("MqttConnection Subscribe topic:{}, exception:{}", topic, e.getMessage());
            return false;
        }

        log.info("MqttConnection Subscribe Topic:{} ,success", topic);
        return true;
    }

    public Boolean Subscribe(String topic, Byte qos, IMqttMessageListener listener) {
        try {
            IMqttToken token = client.subscribe(topic, qos, listener);
            token.waitForCompletion();
        } catch (Exception e) {
            log.error(e.getMessage());
            return false;
        }
        log.info("MqttConnection Subscribe Topic:{},success", topic);
        return true;
    }

    public Boolean UnSubscribe(String[] topic) {
        try {
            IMqttToken token = client.unsubscribe(topic);
            token.waitForCompletion();
        } catch (Exception e) {
            log.error(e.getMessage());
            return false;
        }
        log.info("MqttConnection Subscribe Topic:{},success", Arrays.toString(topic));
        return true;
    }

    public void close() throws MqttException {
        this.client.close();
    }

    protected void reconnect() {
        int sleepTime = this.config.getMinReconnectPeriod();
        while (true) {
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException var5) {
                log.warn("MqttConnection client reconnect sleep exception:{}", var5.getMessage());
            }

            if (this.open()) {
                log.info("MqttConnection client Reconnect success");
                return;
            }

            sleepTime *= 2L;
            log.info("MqttConnection client reconnect sleepTime:{}", sleepTime);
            if (sleepTime > this.config.getMaxReconnectPeriod()) {
                sleepTime = this.config.getMaxReconnectPeriod();
            }
        }
    }
}

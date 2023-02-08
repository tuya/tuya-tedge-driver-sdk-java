package tuya.tedge.driver.sdk.base.mqttitf;

public interface MqttDriver {
    /**
     * Auth mqtt设备连接鉴权，broker会将与该驱动相关的mqtt设备连接鉴权信息转发给sdk，sdk会回调该接口，将鉴
     * 权信息发送给驱动应用层做校验，鉴权通过返回true，mqtt broker允许连接，否则拒接连接。
     *
     * @param clientId mqtt设备连接时指定的clientID
     * @param username mqtt设备连接时指定的username
     * @param password mqtt设备连接时指定的password
     * @return 鉴权通过返回true，mqtt broker允许连接，否则拒接连接。
     */
    Boolean auth(String clientId, String username, String password);

    /**
     * Sub mqtt设备订阅topic校验，broker会将与该驱动相关的mqtt设备订阅topic的信息转发给sdk，sdk会回调该接
     * 口，将topic校验信息发送给驱动应用层做校验，校验通过返回true，mqtt broker允许订阅，否则拒绝订阅。
     *
     * @param clientId mqtt设备连接时指定的clientID
     * @param username mqtt设备连接时指定的username
     * @param topic    设备要订阅的topic
     * @param qos      设备要订阅topic的QoS
     * @return 校验通过返回true，mqtt broker允许订阅，否则拒绝订阅。
     */

    Boolean subscribe(String clientId, String username, String topic, Byte qos);

    /**
     * Publish mqtt设备向topic中发布消息前校验，broker会将与该驱动相关的mqtt设备要发布消息的topic的信息转发给
     * sdk，sdk会回调该接口，将topic校验信息发送给驱动应用层做校验，校验通过返回true，mqtt broker允许发布
     * 消息，否则拒绝发布消息
     *
     * @param clientId mqtt设备连接时指定的clientID
     * @param username mqtt设备连接时指定的username
     * @param topic    设备要发布的topic
     * @param qos      设备要发布topic的QoS
     * @param retained
     * @return 校验通过返回true，mqtt broker允许发布消息，否则拒绝发布消息
     */
    Boolean publish(String clientId, String username, String topic, Byte qos, Boolean retained);

    /**
     * UnSubscribe mqtt设备取消订阅通知，mqtt设备取消订阅topic后broker会将取消订阅topic的消息通知给对应的驱动
     *
     * @param clientId mqtt取消订阅时指定的clientID
     * @param username mqtt取消订阅时指定的username
     * @param topics   设备取消订阅时的topic
     */
    void unSubscribe(String clientId, String username, String[] topics);

    /**
     * Connected mqtt设备连接成功通知，mqtt设备连接成功后broker会将连接成功消息通知给对应的驱动
     *
     * @param clientId mqtt设备连接时指定的clientID
     * @param username mqtt设备连接时指定的username
     */
    void connected(String clientId, String username);

    /**
     * Closed mqtt设备断开连接后通知，mqtt设备断开连接后broker会将断开连接信息通知给对应的驱动
     *
     * @param clientId mqtt设备断开连接时指定的clientID
     * @param username mqtt设备断开连接时指定的username
     */
    void closed(String clientId, String username);
}

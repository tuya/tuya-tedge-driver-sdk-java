// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event.proto

package tuya.tedge.driver.sdk.grpc.event;

public interface EventsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:event.Events)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .event.Event multi_events = 1;</code>
   */
  java.util.List<tuya.tedge.driver.sdk.grpc.event.Event> 
      getMultiEventsList();
  /**
   * <code>repeated .event.Event multi_events = 1;</code>
   */
  tuya.tedge.driver.sdk.grpc.event.Event getMultiEvents(int index);
  /**
   * <code>repeated .event.Event multi_events = 1;</code>
   */
  int getMultiEventsCount();
  /**
   * <code>repeated .event.Event multi_events = 1;</code>
   */
  java.util.List<? extends tuya.tedge.driver.sdk.grpc.event.EventOrBuilder> 
      getMultiEventsOrBuilderList();
  /**
   * <code>repeated .event.Event multi_events = 1;</code>
   */
  tuya.tedge.driver.sdk.grpc.event.EventOrBuilder getMultiEventsOrBuilder(
      int index);
}

/*
 * Messente API
 * [Messente](https://messente.com) is a global provider of messaging and user verification services.  * Send and receive SMS, Viber, WhatsApp and Telegram messages. * Manage contacts and groups. * Fetch detailed info about phone numbers. * Blacklist phone numbers to make sure you're not sending any unwanted messages.  Messente builds [tools](https://messente.com/documentation) to help organizations connect their services to people anywhere in the world.
 *
 * OpenAPI spec version: 1.4.0
 * Contact: messente@messente.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.messente.api;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.messente.api.Priority;
import com.messente.api.TextStore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * An omnimessage
 */
@ApiModel(description = "An omnimessage")

public class Omnimessage {
  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<Object> messages = new ArrayList<Object>();

  public static final String SERIALIZED_NAME_DLR_URL = "dlr_url";
  @SerializedName(SERIALIZED_NAME_DLR_URL)
  private String dlrUrl;

  public static final String SERIALIZED_NAME_TEXT_STORE = "text_store";
  @SerializedName(SERIALIZED_NAME_TEXT_STORE)
  private TextStore textStore = null;

  public static final String SERIALIZED_NAME_TIME_TO_SEND = "time_to_send";
  @SerializedName(SERIALIZED_NAME_TIME_TO_SEND)
  private OffsetDateTime timeToSend;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Priority priority = null;

  public Omnimessage to(String to) {
    this.to = to;
    return this;
  }

   /**
   * Phone number in e.164 format
   * @return to
  **/
  @ApiModelProperty(required = true, value = "Phone number in e.164 format")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public Omnimessage messages(List<Object> messages) {
    this.messages = messages;
    return this;
  }

  public Omnimessage addMessagesItem(Object messagesItem) {
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * An array of messages
   * @return messages
  **/
  @ApiModelProperty(required = true, value = "An array of messages")
  public List<Object> getMessages() {
    return messages;
  }

  public void setMessages(List<Object> messages) {
    this.messages = messages;
  }

  public Omnimessage dlrUrl(String dlrUrl) {
    this.dlrUrl = dlrUrl;
    return this;
  }

   /**
   * URL where the delivery report will be sent
   * @return dlrUrl
  **/
  @ApiModelProperty(value = "URL where the delivery report will be sent")
  public String getDlrUrl() {
    return dlrUrl;
  }

  public void setDlrUrl(String dlrUrl) {
    this.dlrUrl = dlrUrl;
  }

  public Omnimessage textStore(TextStore textStore) {
    this.textStore = textStore;
    return this;
  }

   /**
   * Get textStore
   * @return textStore
  **/
  @ApiModelProperty(value = "")
  public TextStore getTextStore() {
    return textStore;
  }

  public void setTextStore(TextStore textStore) {
    this.textStore = textStore;
  }

  public Omnimessage timeToSend(OffsetDateTime timeToSend) {
    this.timeToSend = timeToSend;
    return this;
  }

   /**
   * Optional parameter for sending messages at some specific time in the future.   Time must be specified in the ISO-8601 format.   If no timezone is specified, then the timezone is assumed to be UTC    Examples:    * Time specified with timezone: 2018-06-22T09:05:07+00:00 Time specified in UTC: 2018-06-22T09:05:07Z   * Time specified without timezone: 2018-06-22T09:05 (equivalent to 2018-06-22T09:05+00:00)
   * @return timeToSend
  **/
  @ApiModelProperty(value = "Optional parameter for sending messages at some specific time in the future.   Time must be specified in the ISO-8601 format.   If no timezone is specified, then the timezone is assumed to be UTC    Examples:    * Time specified with timezone: 2018-06-22T09:05:07+00:00 Time specified in UTC: 2018-06-22T09:05:07Z   * Time specified without timezone: 2018-06-22T09:05 (equivalent to 2018-06-22T09:05+00:00)")
  public OffsetDateTime getTimeToSend() {
    return timeToSend;
  }

  public void setTimeToSend(OffsetDateTime timeToSend) {
    this.timeToSend = timeToSend;
  }

  public Omnimessage priority(Priority priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(value = "")
  public Priority getPriority() {
    return priority;
  }

  public void setPriority(Priority priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Omnimessage omnimessage = (Omnimessage) o;
    return Objects.equals(this.to, omnimessage.to) &&
        Objects.equals(this.messages, omnimessage.messages) &&
        Objects.equals(this.dlrUrl, omnimessage.dlrUrl) &&
        Objects.equals(this.textStore, omnimessage.textStore) &&
        Objects.equals(this.timeToSend, omnimessage.timeToSend) &&
        Objects.equals(this.priority, omnimessage.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(to, messages, dlrUrl, textStore, timeToSend, priority);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Omnimessage {\n");
    
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    dlrUrl: ").append(toIndentedString(dlrUrl)).append("\n");
    sb.append("    textStore: ").append(toIndentedString(textStore)).append("\n");
    sb.append("    timeToSend: ").append(toIndentedString(timeToSend)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


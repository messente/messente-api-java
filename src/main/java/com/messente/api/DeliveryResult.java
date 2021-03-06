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
import com.messente.api.Channel;
import com.messente.api.ErrorCodeOmnichannelMachine;
import com.messente.api.Status;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * A delivery report
 */
@ApiModel(description = "A delivery report")

public class DeliveryResult {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Status status = null;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private Channel channel = null;

  public static final String SERIALIZED_NAME_MESSAGE_ID = "message_id";
  @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
  private String messageId;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_ERR = "err";
  @SerializedName(SERIALIZED_NAME_ERR)
  private ErrorCodeOmnichannelMachine err = null;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public DeliveryResult status(Status status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public DeliveryResult channel(Channel channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @ApiModelProperty(value = "")
  public Channel getChannel() {
    return channel;
  }

  public void setChannel(Channel channel) {
    this.channel = channel;
  }

  public DeliveryResult messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

   /**
   * Unique identifier for the message
   * @return messageId
  **/
  @ApiModelProperty(value = "Unique identifier for the message")
  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public DeliveryResult error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Human-readable description of what went wrong, *null* in case of success or if the message has not been processed yet
   * @return error
  **/
  @ApiModelProperty(value = "Human-readable description of what went wrong, *null* in case of success or if the message has not been processed yet")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public DeliveryResult err(ErrorCodeOmnichannelMachine err) {
    this.err = err;
    return this;
  }

   /**
   * Get err
   * @return err
  **/
  @ApiModelProperty(value = "")
  public ErrorCodeOmnichannelMachine getErr() {
    return err;
  }

  public void setErr(ErrorCodeOmnichannelMachine err) {
    this.err = err;
  }

  public DeliveryResult timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * When this status was received by Omnichannel API
   * @return timestamp
  **/
  @ApiModelProperty(value = "When this status was received by Omnichannel API")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryResult deliveryResult = (DeliveryResult) o;
    return Objects.equals(this.status, deliveryResult.status) &&
        Objects.equals(this.channel, deliveryResult.channel) &&
        Objects.equals(this.messageId, deliveryResult.messageId) &&
        Objects.equals(this.error, deliveryResult.error) &&
        Objects.equals(this.err, deliveryResult.err) &&
        Objects.equals(this.timestamp, deliveryResult.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, channel, messageId, error, err, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryResult {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    err: ").append(toIndentedString(err)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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


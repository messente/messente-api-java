/*
 * Messente API
 * [Messente](https://messente.com) is a global provider of messaging and user verification services. Use Messente API library to send and receive SMS, Viber and WhatsApp messages, blacklist phone numbers to make sure you're not sending any unwanted messages, manage contacts and groups.  Messente builds [tools](https://messente.com/documentation) to help organizations connect their services to people anywhere in the world.
 *
 * OpenAPI spec version: 1.0.1
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
import com.messente.api.MessageResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A container for a response received after successfully created omnimessage
 */
@ApiModel(description = "A container for a response received after successfully created omnimessage")

public class OmniMessageCreateSuccessResponse {
  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<MessageResult> messages = new ArrayList<MessageResult>();

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_OMNIMESSAGE_ID = "omnimessage_id";
  @SerializedName(SERIALIZED_NAME_OMNIMESSAGE_ID)
  private String omnimessageId;

  public OmniMessageCreateSuccessResponse messages(List<MessageResult> messages) {
    this.messages = messages;
    return this;
  }

  public OmniMessageCreateSuccessResponse addMessagesItem(MessageResult messagesItem) {
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * List of messages that compose the omnimessage
   * @return messages
  **/
  @ApiModelProperty(required = true, value = "List of messages that compose the omnimessage")
  public List<MessageResult> getMessages() {
    return messages;
  }

  public void setMessages(List<MessageResult> messages) {
    this.messages = messages;
  }

  public OmniMessageCreateSuccessResponse to(String to) {
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

  public OmniMessageCreateSuccessResponse omnimessageId(String omnimessageId) {
    this.omnimessageId = omnimessageId;
    return this;
  }

   /**
   * Unique identifier for the omnimessage
   * @return omnimessageId
  **/
  @ApiModelProperty(required = true, value = "Unique identifier for the omnimessage")
  public String getOmnimessageId() {
    return omnimessageId;
  }

  public void setOmnimessageId(String omnimessageId) {
    this.omnimessageId = omnimessageId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OmniMessageCreateSuccessResponse omniMessageCreateSuccessResponse = (OmniMessageCreateSuccessResponse) o;
    return Objects.equals(this.messages, omniMessageCreateSuccessResponse.messages) &&
        Objects.equals(this.to, omniMessageCreateSuccessResponse.to) &&
        Objects.equals(this.omnimessageId, omniMessageCreateSuccessResponse.omnimessageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages, to, omnimessageId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OmniMessageCreateSuccessResponse {\n");
    
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    omnimessageId: ").append(toIndentedString(omnimessageId)).append("\n");
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


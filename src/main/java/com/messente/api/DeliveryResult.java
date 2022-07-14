/*
 * Messente API
 * [Messente](https://messente.com) is a global provider of messaging and user verification services.  * Send and receive SMS, Viber, WhatsApp and Telegram messages. * Manage contacts and groups. * Fetch detailed info about phone numbers. * Blacklist phone numbers to make sure you're not sending any unwanted messages.  Messente builds [tools](https://messente.com/documentation) to help organizations connect their services to people anywhere in the world.
 *
 * The version of the OpenAPI document: 1.4.0
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
import java.time.OffsetDateTime;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.messente.JSON;

/**
 * A delivery report
 */
@ApiModel(description = "A delivery report")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeliveryResult {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Status status;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private Channel channel;

  public static final String SERIALIZED_NAME_MESSAGE_ID = "message_id";
  @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
  private UUID messageId;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_ERR = "err";
  @SerializedName(SERIALIZED_NAME_ERR)
  private ErrorCodeOmnichannelMachine err;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public DeliveryResult() { 
  }

  public DeliveryResult status(Status status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Channel getChannel() {
    return channel;
  }


  public void setChannel(Channel channel) {
    this.channel = channel;
  }


  public DeliveryResult messageId(UUID messageId) {
    
    this.messageId = messageId;
    return this;
  }

   /**
   * Unique identifier for the message
   * @return messageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier for the message")

  public UUID getMessageId() {
    return messageId;
  }


  public void setMessageId(UUID messageId) {
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When this status was received by Omnichannel API")

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }



  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("status");
    openapiFields.add("channel");
    openapiFields.add("message_id");
    openapiFields.add("error");
    openapiFields.add("err");
    openapiFields.add("timestamp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeliveryResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DeliveryResult.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeliveryResult is not found in the empty JSON string", DeliveryResult.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DeliveryResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeliveryResult` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("message_id") != null && !jsonObj.get("message_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message_id").toString()));
      }
      if (jsonObj.get("error") != null && !jsonObj.get("error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeliveryResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeliveryResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeliveryResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeliveryResult.class));

       return (TypeAdapter<T>) new TypeAdapter<DeliveryResult>() {
           @Override
           public void write(JsonWriter out, DeliveryResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeliveryResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeliveryResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeliveryResult
  * @throws IOException if the JSON string is invalid with respect to DeliveryResult
  */
  public static DeliveryResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeliveryResult.class);
  }

 /**
  * Convert an instance of DeliveryResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


/*
 * Messente API
 * [Messente](https://messente.com) is a global provider of messaging and user verification services.  * Send and receive SMS, Viber and WhatsApp messages. * Manage contacts and groups. * Fetch detailed info about phone numbers. * Blacklist phone numbers to make sure you're not sending any unwanted messages.  Messente builds [tools](https://messente.com/documentation) to help organizations connect their services to people anywhere in the world.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: messente@messente.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.messente.api;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.messente.api.OmnimessageMessagesInner;
import com.messente.api.Priority;
import com.messente.api.TextStore;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.messente.JSON;

/**
 * An omnimessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class Omnimessage {
  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  @javax.annotation.Nonnull
  private String to;

  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  @javax.annotation.Nonnull
  private List<OmnimessageMessagesInner> messages = new ArrayList<>();

  public static final String SERIALIZED_NAME_DLR_URL = "dlr_url";
  @SerializedName(SERIALIZED_NAME_DLR_URL)
  @javax.annotation.Nullable
  private String dlrUrl;

  public static final String SERIALIZED_NAME_TEXT_STORE = "text_store";
  @SerializedName(SERIALIZED_NAME_TEXT_STORE)
  @javax.annotation.Nullable
  private TextStore textStore;

  public static final String SERIALIZED_NAME_TIME_TO_SEND = "time_to_send";
  @SerializedName(SERIALIZED_NAME_TIME_TO_SEND)
  @javax.annotation.Nullable
  private OffsetDateTime timeToSend;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  @javax.annotation.Nullable
  private Priority priority;

  public Omnimessage() {
  }

  public Omnimessage to(@javax.annotation.Nonnull String to) {
    this.to = to;
    return this;
  }

  /**
   * Phone number in e.164 format
   * @return to
   */
  @javax.annotation.Nonnull
  public String getTo() {
    return to;
  }

  public void setTo(@javax.annotation.Nonnull String to) {
    this.to = to;
  }


  public Omnimessage messages(@javax.annotation.Nonnull List<OmnimessageMessagesInner> messages) {
    this.messages = messages;
    return this;
  }

  public Omnimessage addMessagesItem(OmnimessageMessagesInner messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

  /**
   * An array of messages
   * @return messages
   */
  @javax.annotation.Nonnull
  public List<OmnimessageMessagesInner> getMessages() {
    return messages;
  }

  public void setMessages(@javax.annotation.Nonnull List<OmnimessageMessagesInner> messages) {
    this.messages = messages;
  }


  public Omnimessage dlrUrl(@javax.annotation.Nullable String dlrUrl) {
    this.dlrUrl = dlrUrl;
    return this;
  }

  /**
   * URL where the delivery report will be sent
   * @return dlrUrl
   */
  @javax.annotation.Nullable
  public String getDlrUrl() {
    return dlrUrl;
  }

  public void setDlrUrl(@javax.annotation.Nullable String dlrUrl) {
    this.dlrUrl = dlrUrl;
  }


  public Omnimessage textStore(@javax.annotation.Nullable TextStore textStore) {
    this.textStore = textStore;
    return this;
  }

  /**
   * Get textStore
   * @return textStore
   */
  @javax.annotation.Nullable
  public TextStore getTextStore() {
    return textStore;
  }

  public void setTextStore(@javax.annotation.Nullable TextStore textStore) {
    this.textStore = textStore;
  }


  public Omnimessage timeToSend(@javax.annotation.Nullable OffsetDateTime timeToSend) {
    this.timeToSend = timeToSend;
    return this;
  }

  /**
   * Optional parameter for sending messages at some specific time in the future.   Time must be specified in the ISO-8601 format.   If no timezone is specified, then the timezone is assumed to be UTC    Examples:    * Time specified with timezone: 2018-06-22T09:05:07+00:00 Time specified in UTC: 2018-06-22T09:05:07Z   * Time specified without timezone: 2018-06-22T09:05 (equivalent to 2018-06-22T09:05+00:00)
   * @return timeToSend
   */
  @javax.annotation.Nullable
  public OffsetDateTime getTimeToSend() {
    return timeToSend;
  }

  public void setTimeToSend(@javax.annotation.Nullable OffsetDateTime timeToSend) {
    this.timeToSend = timeToSend;
  }


  public Omnimessage priority(@javax.annotation.Nullable Priority priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
   */
  @javax.annotation.Nullable
  public Priority getPriority() {
    return priority;
  }

  public void setPriority(@javax.annotation.Nullable Priority priority) {
    this.priority = priority;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the Omnimessage instance itself
   */
  public Omnimessage putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
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
        Objects.equals(this.priority, omnimessage.priority)&&
        Objects.equals(this.additionalProperties, omnimessage.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(to, messages, dlrUrl, textStore, timeToSend, priority, additionalProperties);
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
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("to");
    openapiFields.add("messages");
    openapiFields.add("dlr_url");
    openapiFields.add("text_store");
    openapiFields.add("time_to_send");
    openapiFields.add("priority");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("to");
    openapiRequiredFields.add("messages");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Omnimessage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Omnimessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Omnimessage is not found in the empty JSON string", Omnimessage.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Omnimessage.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("messages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `messages` to be an array in the JSON string but got `%s`", jsonObj.get("messages").toString()));
      }

      JsonArray jsonArraymessages = jsonObj.getAsJsonArray("messages");
      // validate the required field `messages` (array)
      for (int i = 0; i < jsonArraymessages.size(); i++) {
        OmnimessageMessagesInner.validateJsonElement(jsonArraymessages.get(i));
      };
      if ((jsonObj.get("dlr_url") != null && !jsonObj.get("dlr_url").isJsonNull()) && !jsonObj.get("dlr_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dlr_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dlr_url").toString()));
      }
      // validate the optional field `text_store`
      if (jsonObj.get("text_store") != null && !jsonObj.get("text_store").isJsonNull()) {
        TextStore.validateJsonElement(jsonObj.get("text_store"));
      }
      // validate the optional field `priority`
      if (jsonObj.get("priority") != null && !jsonObj.get("priority").isJsonNull()) {
        Priority.validateJsonElement(jsonObj.get("priority"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Omnimessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Omnimessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Omnimessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Omnimessage.class));

       return (TypeAdapter<T>) new TypeAdapter<Omnimessage>() {
           @Override
           public void write(JsonWriter out, Omnimessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public Omnimessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             Omnimessage instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Omnimessage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Omnimessage
   * @throws IOException if the JSON string is invalid with respect to Omnimessage
   */
  public static Omnimessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Omnimessage.class);
  }

  /**
   * Convert an instance of Omnimessage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import com.messente.api.WhatsappButtonType;
import com.messente.api.WhatsappOtpButtonType;
import com.messente.api.WhatsappSupportedApp;
import java.io.IOException;
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
 * Whatsapp button object.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class WhatsappTemplateButton {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private WhatsappButtonType type;

  public static final String SERIALIZED_NAME_OTP_TYPE = "otp_type";
  @SerializedName(SERIALIZED_NAME_OTP_TYPE)
  @javax.annotation.Nullable
  private WhatsappOtpButtonType otpType;

  public static final String SERIALIZED_NAME_AUTOFILL_TEXT = "autofill_text";
  @SerializedName(SERIALIZED_NAME_AUTOFILL_TEXT)
  @javax.annotation.Nullable
  private String autofillText;

  public static final String SERIALIZED_NAME_SUPPORTED_APPS = "supported_apps";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_APPS)
  @javax.annotation.Nullable
  private List<WhatsappSupportedApp> supportedApps = new ArrayList<>();

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  @javax.annotation.Nullable
  private String text;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  @javax.annotation.Nullable
  private String phoneNumber;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  @javax.annotation.Nullable
  private String url;

  public WhatsappTemplateButton() {
  }

  public WhatsappTemplateButton type(@javax.annotation.Nullable WhatsappButtonType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public WhatsappButtonType getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable WhatsappButtonType type) {
    this.type = type;
  }


  public WhatsappTemplateButton otpType(@javax.annotation.Nullable WhatsappOtpButtonType otpType) {
    this.otpType = otpType;
    return this;
  }

  /**
   * Get otpType
   * @return otpType
   */
  @javax.annotation.Nullable
  public WhatsappOtpButtonType getOtpType() {
    return otpType;
  }

  public void setOtpType(@javax.annotation.Nullable WhatsappOtpButtonType otpType) {
    this.otpType = otpType;
  }


  public WhatsappTemplateButton autofillText(@javax.annotation.Nullable String autofillText) {
    this.autofillText = autofillText;
    return this;
  }

  /**
   * Text to be autofilled in the OTP field
   * @return autofillText
   */
  @javax.annotation.Nullable
  public String getAutofillText() {
    return autofillText;
  }

  public void setAutofillText(@javax.annotation.Nullable String autofillText) {
    this.autofillText = autofillText;
  }


  public WhatsappTemplateButton supportedApps(@javax.annotation.Nullable List<WhatsappSupportedApp> supportedApps) {
    this.supportedApps = supportedApps;
    return this;
  }

  public WhatsappTemplateButton addSupportedAppsItem(WhatsappSupportedApp supportedAppsItem) {
    if (this.supportedApps == null) {
      this.supportedApps = new ArrayList<>();
    }
    this.supportedApps.add(supportedAppsItem);
    return this;
  }

  /**
   * List of supported apps for the button
   * @return supportedApps
   */
  @javax.annotation.Nullable
  public List<WhatsappSupportedApp> getSupportedApps() {
    return supportedApps;
  }

  public void setSupportedApps(@javax.annotation.Nullable List<WhatsappSupportedApp> supportedApps) {
    this.supportedApps = supportedApps;
  }


  public WhatsappTemplateButton text(@javax.annotation.Nullable String text) {
    this.text = text;
    return this;
  }

  /**
   * Text content of the button
   * @return text
   */
  @javax.annotation.Nullable
  public String getText() {
    return text;
  }

  public void setText(@javax.annotation.Nullable String text) {
    this.text = text;
  }


  public WhatsappTemplateButton phoneNumber(@javax.annotation.Nullable String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Phone number for the button
   * @return phoneNumber
   */
  @javax.annotation.Nullable
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(@javax.annotation.Nullable String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public WhatsappTemplateButton url(@javax.annotation.Nullable String url) {
    this.url = url;
    return this;
  }

  /**
   * URL for the button
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(@javax.annotation.Nullable String url) {
    this.url = url;
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
   * @return the WhatsappTemplateButton instance itself
   */
  public WhatsappTemplateButton putAdditionalProperty(String key, Object value) {
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
    WhatsappTemplateButton whatsappTemplateButton = (WhatsappTemplateButton) o;
    return Objects.equals(this.type, whatsappTemplateButton.type) &&
        Objects.equals(this.otpType, whatsappTemplateButton.otpType) &&
        Objects.equals(this.autofillText, whatsappTemplateButton.autofillText) &&
        Objects.equals(this.supportedApps, whatsappTemplateButton.supportedApps) &&
        Objects.equals(this.text, whatsappTemplateButton.text) &&
        Objects.equals(this.phoneNumber, whatsappTemplateButton.phoneNumber) &&
        Objects.equals(this.url, whatsappTemplateButton.url)&&
        Objects.equals(this.additionalProperties, whatsappTemplateButton.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, otpType, autofillText, supportedApps, text, phoneNumber, url, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappTemplateButton {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    otpType: ").append(toIndentedString(otpType)).append("\n");
    sb.append("    autofillText: ").append(toIndentedString(autofillText)).append("\n");
    sb.append("    supportedApps: ").append(toIndentedString(supportedApps)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("otp_type");
    openapiFields.add("autofill_text");
    openapiFields.add("supported_apps");
    openapiFields.add("text");
    openapiFields.add("phone_number");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WhatsappTemplateButton
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WhatsappTemplateButton.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WhatsappTemplateButton is not found in the empty JSON string", WhatsappTemplateButton.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        WhatsappButtonType.validateJsonElement(jsonObj.get("type"));
      }
      // validate the optional field `otp_type`
      if (jsonObj.get("otp_type") != null && !jsonObj.get("otp_type").isJsonNull()) {
        WhatsappOtpButtonType.validateJsonElement(jsonObj.get("otp_type"));
      }
      if ((jsonObj.get("autofill_text") != null && !jsonObj.get("autofill_text").isJsonNull()) && !jsonObj.get("autofill_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `autofill_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("autofill_text").toString()));
      }
      if (jsonObj.get("supported_apps") != null && !jsonObj.get("supported_apps").isJsonNull()) {
        JsonArray jsonArraysupportedApps = jsonObj.getAsJsonArray("supported_apps");
        if (jsonArraysupportedApps != null) {
          // ensure the json data is an array
          if (!jsonObj.get("supported_apps").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `supported_apps` to be an array in the JSON string but got `%s`", jsonObj.get("supported_apps").toString()));
          }

          // validate the optional field `supported_apps` (array)
          for (int i = 0; i < jsonArraysupportedApps.size(); i++) {
            WhatsappSupportedApp.validateJsonElement(jsonArraysupportedApps.get(i));
          };
        }
      }
      if ((jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if ((jsonObj.get("phone_number") != null && !jsonObj.get("phone_number").isJsonNull()) && !jsonObj.get("phone_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone_number").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WhatsappTemplateButton.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WhatsappTemplateButton' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WhatsappTemplateButton> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WhatsappTemplateButton.class));

       return (TypeAdapter<T>) new TypeAdapter<WhatsappTemplateButton>() {
           @Override
           public void write(JsonWriter out, WhatsappTemplateButton value) throws IOException {
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
           public WhatsappTemplateButton read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             WhatsappTemplateButton instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of WhatsappTemplateButton given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WhatsappTemplateButton
   * @throws IOException if the JSON string is invalid with respect to WhatsappTemplateButton
   */
  public static WhatsappTemplateButton fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WhatsappTemplateButton.class);
  }

  /**
   * Convert an instance of WhatsappTemplateButton to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


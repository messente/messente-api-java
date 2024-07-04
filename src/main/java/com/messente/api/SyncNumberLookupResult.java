/*
 * Messente API
 * [Messente](https://messente.com) is a global provider of messaging and user verification services.  * Send and receive SMS, Viber, WhatsApp and Telegram messages. * Manage contacts and groups. * Fetch detailed info about phone numbers. * Blacklist phone numbers to make sure you're not sending any unwanted messages.  Messente builds [tools](https://messente.com/documentation) to help organizations connect their services to people anywhere in the world.
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
import com.messente.api.MobileNetwork;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.messente.JSON;

/**
 * Info about a phone number
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class SyncNumberLookupResult {
  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public static final String SERIALIZED_NAME_ROAMING = "roaming";
  @SerializedName(SERIALIZED_NAME_ROAMING)
  private Boolean roaming;

  public static final String SERIALIZED_NAME_PORTED = "ported";
  @SerializedName(SERIALIZED_NAME_PORTED)
  private Boolean ported;

  public static final String SERIALIZED_NAME_ROAMING_NETWORK = "roamingNetwork";
  @SerializedName(SERIALIZED_NAME_ROAMING_NETWORK)
  private MobileNetwork roamingNetwork;

  public static final String SERIALIZED_NAME_CURRENT_NETWORK = "currentNetwork";
  @SerializedName(SERIALIZED_NAME_CURRENT_NETWORK)
  private MobileNetwork currentNetwork;

  public static final String SERIALIZED_NAME_ORIGINAL_NETWORK = "originalNetwork";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_NETWORK)
  private MobileNetwork originalNetwork;

  public static final String SERIALIZED_NAME_PORTED_NETWORK = "portedNetwork";
  @SerializedName(SERIALIZED_NAME_PORTED_NETWORK)
  private MobileNetwork portedNetwork;

  /**
   * Status of the phone number
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ON("ON"),
    
    OFF("OFF"),
    
    INVALID("INVALID"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private Object error = null;

  public SyncNumberLookupResult() {
  }

  public SyncNumberLookupResult number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Phone number in e.164 format
   * @return number
  **/
  @javax.annotation.Nonnull
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }


  public SyncNumberLookupResult roaming(Boolean roaming) {
    this.roaming = roaming;
    return this;
  }

   /**
   * Indicates if a number is roaming
   * @return roaming
  **/
  @javax.annotation.Nullable
  public Boolean getRoaming() {
    return roaming;
  }

  public void setRoaming(Boolean roaming) {
    this.roaming = roaming;
  }


  public SyncNumberLookupResult ported(Boolean ported) {
    this.ported = ported;
    return this;
  }

   /**
   * Indicates if a number is ported
   * @return ported
  **/
  @javax.annotation.Nullable
  public Boolean getPorted() {
    return ported;
  }

  public void setPorted(Boolean ported) {
    this.ported = ported;
  }


  public SyncNumberLookupResult roamingNetwork(MobileNetwork roamingNetwork) {
    this.roamingNetwork = roamingNetwork;
    return this;
  }

   /**
   * Get roamingNetwork
   * @return roamingNetwork
  **/
  @javax.annotation.Nullable
  public MobileNetwork getRoamingNetwork() {
    return roamingNetwork;
  }

  public void setRoamingNetwork(MobileNetwork roamingNetwork) {
    this.roamingNetwork = roamingNetwork;
  }


  public SyncNumberLookupResult currentNetwork(MobileNetwork currentNetwork) {
    this.currentNetwork = currentNetwork;
    return this;
  }

   /**
   * Get currentNetwork
   * @return currentNetwork
  **/
  @javax.annotation.Nullable
  public MobileNetwork getCurrentNetwork() {
    return currentNetwork;
  }

  public void setCurrentNetwork(MobileNetwork currentNetwork) {
    this.currentNetwork = currentNetwork;
  }


  public SyncNumberLookupResult originalNetwork(MobileNetwork originalNetwork) {
    this.originalNetwork = originalNetwork;
    return this;
  }

   /**
   * Get originalNetwork
   * @return originalNetwork
  **/
  @javax.annotation.Nullable
  public MobileNetwork getOriginalNetwork() {
    return originalNetwork;
  }

  public void setOriginalNetwork(MobileNetwork originalNetwork) {
    this.originalNetwork = originalNetwork;
  }


  public SyncNumberLookupResult portedNetwork(MobileNetwork portedNetwork) {
    this.portedNetwork = portedNetwork;
    return this;
  }

   /**
   * Get portedNetwork
   * @return portedNetwork
  **/
  @javax.annotation.Nullable
  public MobileNetwork getPortedNetwork() {
    return portedNetwork;
  }

  public void setPortedNetwork(MobileNetwork portedNetwork) {
    this.portedNetwork = portedNetwork;
  }


  public SyncNumberLookupResult status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the phone number
   * @return status
  **/
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public SyncNumberLookupResult error(Object error) {
    this.error = error;
    return this;
  }

   /**
   * Indicates if any error occurred while handling the request
   * @return error
  **/
  @javax.annotation.Nullable
  public Object getError() {
    return error;
  }

  public void setError(Object error) {
    this.error = error;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncNumberLookupResult syncNumberLookupResult = (SyncNumberLookupResult) o;
    return Objects.equals(this.number, syncNumberLookupResult.number) &&
        Objects.equals(this.roaming, syncNumberLookupResult.roaming) &&
        Objects.equals(this.ported, syncNumberLookupResult.ported) &&
        Objects.equals(this.roamingNetwork, syncNumberLookupResult.roamingNetwork) &&
        Objects.equals(this.currentNetwork, syncNumberLookupResult.currentNetwork) &&
        Objects.equals(this.originalNetwork, syncNumberLookupResult.originalNetwork) &&
        Objects.equals(this.portedNetwork, syncNumberLookupResult.portedNetwork) &&
        Objects.equals(this.status, syncNumberLookupResult.status) &&
        Objects.equals(this.error, syncNumberLookupResult.error);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, roaming, ported, roamingNetwork, currentNetwork, originalNetwork, portedNetwork, status, error);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncNumberLookupResult {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    roaming: ").append(toIndentedString(roaming)).append("\n");
    sb.append("    ported: ").append(toIndentedString(ported)).append("\n");
    sb.append("    roamingNetwork: ").append(toIndentedString(roamingNetwork)).append("\n");
    sb.append("    currentNetwork: ").append(toIndentedString(currentNetwork)).append("\n");
    sb.append("    originalNetwork: ").append(toIndentedString(originalNetwork)).append("\n");
    sb.append("    portedNetwork: ").append(toIndentedString(portedNetwork)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
    openapiFields.add("number");
    openapiFields.add("roaming");
    openapiFields.add("ported");
    openapiFields.add("roamingNetwork");
    openapiFields.add("currentNetwork");
    openapiFields.add("originalNetwork");
    openapiFields.add("portedNetwork");
    openapiFields.add("status");
    openapiFields.add("error");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("number");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SyncNumberLookupResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SyncNumberLookupResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SyncNumberLookupResult is not found in the empty JSON string", SyncNumberLookupResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SyncNumberLookupResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SyncNumberLookupResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SyncNumberLookupResult.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("number").toString()));
      }
      // validate the optional field `roamingNetwork`
      if (jsonObj.get("roamingNetwork") != null && !jsonObj.get("roamingNetwork").isJsonNull()) {
        MobileNetwork.validateJsonElement(jsonObj.get("roamingNetwork"));
      }
      // validate the optional field `currentNetwork`
      if (jsonObj.get("currentNetwork") != null && !jsonObj.get("currentNetwork").isJsonNull()) {
        MobileNetwork.validateJsonElement(jsonObj.get("currentNetwork"));
      }
      // validate the optional field `originalNetwork`
      if (jsonObj.get("originalNetwork") != null && !jsonObj.get("originalNetwork").isJsonNull()) {
        MobileNetwork.validateJsonElement(jsonObj.get("originalNetwork"));
      }
      // validate the optional field `portedNetwork`
      if (jsonObj.get("portedNetwork") != null && !jsonObj.get("portedNetwork").isJsonNull()) {
        MobileNetwork.validateJsonElement(jsonObj.get("portedNetwork"));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SyncNumberLookupResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SyncNumberLookupResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SyncNumberLookupResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SyncNumberLookupResult.class));

       return (TypeAdapter<T>) new TypeAdapter<SyncNumberLookupResult>() {
           @Override
           public void write(JsonWriter out, SyncNumberLookupResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SyncNumberLookupResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SyncNumberLookupResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SyncNumberLookupResult
  * @throws IOException if the JSON string is invalid with respect to SyncNumberLookupResult
  */
  public static SyncNumberLookupResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SyncNumberLookupResult.class);
  }

 /**
  * Convert an instance of SyncNumberLookupResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


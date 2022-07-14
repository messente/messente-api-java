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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * Info about the network related to the phone number
 */
@ApiModel(description = "Info about the network related to the phone number")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MobileNetwork {
  public static final String SERIALIZED_NAME_MCCMNC = "mccmnc";
  @SerializedName(SERIALIZED_NAME_MCCMNC)
  private String mccmnc;

  public static final String SERIALIZED_NAME_NETWORK_NAME = "networkName";
  @SerializedName(SERIALIZED_NAME_NETWORK_NAME)
  private String networkName;

  public static final String SERIALIZED_NAME_COUNTRY_NAME = "countryName";
  @SerializedName(SERIALIZED_NAME_COUNTRY_NAME)
  private String countryName;

  public static final String SERIALIZED_NAME_COUNTRY_PREFIX = "countryPrefix";
  @SerializedName(SERIALIZED_NAME_COUNTRY_PREFIX)
  private String countryPrefix;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public MobileNetwork() { 
  }

  public MobileNetwork mccmnc(String mccmnc) {
    
    this.mccmnc = mccmnc;
    return this;
  }

   /**
   * Mobile country and mobile network code
   * @return mccmnc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mobile country and mobile network code")

  public String getMccmnc() {
    return mccmnc;
  }


  public void setMccmnc(String mccmnc) {
    this.mccmnc = mccmnc;
  }


  public MobileNetwork networkName(String networkName) {
    
    this.networkName = networkName;
    return this;
  }

   /**
   * Mobile network name
   * @return networkName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mobile network name")

  public String getNetworkName() {
    return networkName;
  }


  public void setNetworkName(String networkName) {
    this.networkName = networkName;
  }


  public MobileNetwork countryName(String countryName) {
    
    this.countryName = countryName;
    return this;
  }

   /**
   * Country name
   * @return countryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Country name")

  public String getCountryName() {
    return countryName;
  }


  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }


  public MobileNetwork countryPrefix(String countryPrefix) {
    
    this.countryPrefix = countryPrefix;
    return this;
  }

   /**
   * Country prefix
   * @return countryPrefix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Country prefix")

  public String getCountryPrefix() {
    return countryPrefix;
  }


  public void setCountryPrefix(String countryPrefix) {
    this.countryPrefix = countryPrefix;
  }


  public MobileNetwork countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Country code
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Country code")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobileNetwork mobileNetwork = (MobileNetwork) o;
    return Objects.equals(this.mccmnc, mobileNetwork.mccmnc) &&
        Objects.equals(this.networkName, mobileNetwork.networkName) &&
        Objects.equals(this.countryName, mobileNetwork.countryName) &&
        Objects.equals(this.countryPrefix, mobileNetwork.countryPrefix) &&
        Objects.equals(this.countryCode, mobileNetwork.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mccmnc, networkName, countryName, countryPrefix, countryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileNetwork {\n");
    sb.append("    mccmnc: ").append(toIndentedString(mccmnc)).append("\n");
    sb.append("    networkName: ").append(toIndentedString(networkName)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    countryPrefix: ").append(toIndentedString(countryPrefix)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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
    openapiFields.add("mccmnc");
    openapiFields.add("networkName");
    openapiFields.add("countryName");
    openapiFields.add("countryPrefix");
    openapiFields.add("countryCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MobileNetwork
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MobileNetwork.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MobileNetwork is not found in the empty JSON string", MobileNetwork.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MobileNetwork.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MobileNetwork` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("mccmnc") != null && !jsonObj.get("mccmnc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mccmnc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mccmnc").toString()));
      }
      if (jsonObj.get("networkName") != null && !jsonObj.get("networkName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `networkName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("networkName").toString()));
      }
      if (jsonObj.get("countryName") != null && !jsonObj.get("countryName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryName").toString()));
      }
      if (jsonObj.get("countryPrefix") != null && !jsonObj.get("countryPrefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryPrefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryPrefix").toString()));
      }
      if (jsonObj.get("countryCode") != null && !jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MobileNetwork.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MobileNetwork' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MobileNetwork> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MobileNetwork.class));

       return (TypeAdapter<T>) new TypeAdapter<MobileNetwork>() {
           @Override
           public void write(JsonWriter out, MobileNetwork value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MobileNetwork read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MobileNetwork given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MobileNetwork
  * @throws IOException if the JSON string is invalid with respect to MobileNetwork
  */
  public static MobileNetwork fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MobileNetwork.class);
  }

 /**
  * Convert an instance of MobileNetwork to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


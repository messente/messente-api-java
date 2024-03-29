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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.messente.api.ErrorCodeStatistics;
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
 * Error fields container
 */
@ApiModel(description = "Error fields container")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ErrorItemStatistics {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private String details;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private ErrorCodeStatistics code;

  public ErrorItemStatistics() { 
  }

  public ErrorItemStatistics title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Error title
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Error title")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ErrorItemStatistics details(String details) {
    
    this.details = details;
    return this;
  }

   /**
   * Error details
   * @return details
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Error details")

  public String getDetails() {
    return details;
  }


  public void setDetails(String details) {
    this.details = details;
  }


  public ErrorItemStatistics code(ErrorCodeStatistics code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ErrorCodeStatistics getCode() {
    return code;
  }


  public void setCode(ErrorCodeStatistics code) {
    this.code = code;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorItemStatistics errorItemStatistics = (ErrorItemStatistics) o;
    return Objects.equals(this.title, errorItemStatistics.title) &&
        Objects.equals(this.details, errorItemStatistics.details) &&
        Objects.equals(this.code, errorItemStatistics.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, details, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorItemStatistics {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("details");
    openapiFields.add("code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("details");
    openapiRequiredFields.add("code");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ErrorItemStatistics
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ErrorItemStatistics.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ErrorItemStatistics is not found in the empty JSON string", ErrorItemStatistics.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ErrorItemStatistics.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ErrorItemStatistics` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ErrorItemStatistics.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (jsonObj.get("details") != null && !jsonObj.get("details").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `details` to be a primitive type in the JSON string but got `%s`", jsonObj.get("details").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ErrorItemStatistics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ErrorItemStatistics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ErrorItemStatistics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ErrorItemStatistics.class));

       return (TypeAdapter<T>) new TypeAdapter<ErrorItemStatistics>() {
           @Override
           public void write(JsonWriter out, ErrorItemStatistics value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ErrorItemStatistics read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ErrorItemStatistics given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ErrorItemStatistics
  * @throws IOException if the JSON string is invalid with respect to ErrorItemStatistics
  */
  public static ErrorItemStatistics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ErrorItemStatistics.class);
  }

 /**
  * Convert an instance of ErrorItemStatistics to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Textual value which corresponds to an error code
 */
@JsonAdapter(ErrorTitleOmnichannel.Adapter.class)
public enum ErrorTitleOmnichannel {
  
  NOT_FOUND("Not found"),
  
  FORBIDDEN("Forbidden"),
  
  UNAUTHORIZED("Unauthorized"),
  
  INVALID_DATA("Invalid data"),
  
  INTERNAL_SERVER_ERROR("Internal Server Error"),
  
  MISSING_DATA("Missing data"),
  
  METHOD_NOT_ALLOWED("Method not allowed");

  private String value;

  ErrorTitleOmnichannel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ErrorTitleOmnichannel fromValue(String text) {
    for (ErrorTitleOmnichannel b : ErrorTitleOmnichannel.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }

  public static class Adapter extends TypeAdapter<ErrorTitleOmnichannel> {
    @Override
    public void write(final JsonWriter jsonWriter, final ErrorTitleOmnichannel enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ErrorTitleOmnichannel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ErrorTitleOmnichannel.fromValue(String.valueOf(value));
    }
  }
}


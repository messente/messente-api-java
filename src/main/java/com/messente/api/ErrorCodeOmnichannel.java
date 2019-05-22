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
 * Matches the following ErrorTitleOmnichannel.   This field is a constant.    * 101 - Not found   * 102 - Forbidden   * 103 - Unauthorized   * 104 - Invalid data   * 105 - Internal Server Error   * 106 - Missing data   * 107 - Method not allowed
 */
@JsonAdapter(ErrorCodeOmnichannel.Adapter.class)
public enum ErrorCodeOmnichannel {
  
  _101("101"),
  
  _102("102"),
  
  _103("103"),
  
  _104("104"),
  
  _105("105"),
  
  _106("106"),
  
  _107("107");

  private String value;

  ErrorCodeOmnichannel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ErrorCodeOmnichannel fromValue(String text) {
    for (ErrorCodeOmnichannel b : ErrorCodeOmnichannel.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }

  public static class Adapter extends TypeAdapter<ErrorCodeOmnichannel> {
    @Override
    public void write(final JsonWriter jsonWriter, final ErrorCodeOmnichannel enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ErrorCodeOmnichannel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ErrorCodeOmnichannel.fromValue(String.valueOf(value));
    }
  }
}


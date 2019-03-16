/*
 * Messente API
 * [Messente](https://messente.com) is a global provider of messaging and user verification services. Use Messente API library to send and receive SMS, Viber and WhatsApp messages, blacklist phone numbers to make sure you're not sending any unwanted messages, manage contacts and groups.  Messente builds [tools](https://messente.com/documentation) to help organizations connect their services to people anywhere in the world.
 *
 * OpenAPI spec version: 0.0.1
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
 * Matches the following ErrorTitlePhonebook.   This field is a constant.    * 201 - Invalid data   * 202 - Unauthorized   * 203 - Missing resource   * 204 - Conflict   * 244 - Client error   * 205 - General error
 */
@JsonAdapter(ErrorCodePhonebook.Adapter.class)
public enum ErrorCodePhonebook {
  
  _201("201"),
  
  _202("202"),
  
  _203("203"),
  
  _204("204"),
  
  _244("244"),
  
  _205("205");

  private String value;

  ErrorCodePhonebook(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ErrorCodePhonebook fromValue(String text) {
    for (ErrorCodePhonebook b : ErrorCodePhonebook.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }

  public static class Adapter extends TypeAdapter<ErrorCodePhonebook> {
    @Override
    public void write(final JsonWriter jsonWriter, final ErrorCodePhonebook enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ErrorCodePhonebook read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ErrorCodePhonebook.fromValue(String.valueOf(value));
    }
  }
}


/*
 * Messente API
 * [Messente](https://messente.com) is a global provider of messaging and user verification services.  * Send and receive SMS, Viber, WhatsApp and Telegram messages. * Manage contacts and groups. * Fetch detailed info about phone numbers. * Blacklist phone numbers to make sure you're not sending any unwanted messages.  Messente builds [tools](https://messente.com/documentation) to help organizations connect their services to people anywhere in the world.
 *
 * OpenAPI spec version: 2.0.0
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
 * Matches the following error title.   This field is a constant  * 100 - Client Error * 103 - Unauthorized * 104 - Invalid data * 105 - Internal Server Error
 */
@JsonAdapter(ErrorCodeStatistics.Adapter.class)
public enum ErrorCodeStatistics {
  
  _100("100"),
  
  _103("103"),
  
  _104("104"),
  
  _105("105");

  private String value;

  ErrorCodeStatistics(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ErrorCodeStatistics fromValue(String text) {
    for (ErrorCodeStatistics b : ErrorCodeStatistics.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }

  public static class Adapter extends TypeAdapter<ErrorCodeStatistics> {
    @Override
    public void write(final JsonWriter jsonWriter, final ErrorCodeStatistics enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ErrorCodeStatistics read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ErrorCodeStatistics.fromValue(String.valueOf(value));
    }
  }
}


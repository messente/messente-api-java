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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Matches the following error title.   This field is a constant    * 101 - Not found   * 102 - Forbidden   * 103 - Unauthorized   * 104 - Internal Server Error   * 105 - Invalid data   * 106 - Missing data   * 107 - Method not allowed
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

  public static ErrorCodeOmnichannel fromValue(String value) {
    for (ErrorCodeOmnichannel b : ErrorCodeOmnichannel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ErrorCodeOmnichannel> {
    @Override
    public void write(final JsonWriter jsonWriter, final ErrorCodeOmnichannel enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ErrorCodeOmnichannel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ErrorCodeOmnichannel.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ErrorCodeOmnichannel.fromValue(value);
  }
}


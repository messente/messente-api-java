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
 * Machine-readable error code, &#39;null&#39; when the message has not been processed yet  Matches the following meanings    * 0 - No error   * 1 - Delivery failure   * 2 - Sending message expired   * 3 - Invalid number   * 4 - Error crediting account   * 5 - Invalid number format   * 6 - Too many identical messages   * 7 - Sender name not allowed   * 8 - Operator blacklisted   * 9 - Unroutable   * 10 - Seen   * 999 - General temporary error
 */
@JsonAdapter(ErrorCodeOmnichannelMachine.Adapter.class)
public enum ErrorCodeOmnichannelMachine {
  
  NUMBER_0(0),
  
  NUMBER_1(1),
  
  NUMBER_2(2),
  
  NUMBER_3(3),
  
  NUMBER_4(4),
  
  NUMBER_5(5),
  
  NUMBER_6(6),
  
  NUMBER_7(7),
  
  NUMBER_8(8),
  
  NUMBER_9(9),
  
  NUMBER_10(10),
  
  NUMBER_999(999);

  private Integer value;

  ErrorCodeOmnichannelMachine(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ErrorCodeOmnichannelMachine fromValue(Integer value) {
    for (ErrorCodeOmnichannelMachine b : ErrorCodeOmnichannelMachine.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ErrorCodeOmnichannelMachine> {
    @Override
    public void write(final JsonWriter jsonWriter, final ErrorCodeOmnichannelMachine enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ErrorCodeOmnichannelMachine read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return ErrorCodeOmnichannelMachine.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    ErrorCodeOmnichannelMachine.fromValue(value);
  }
}


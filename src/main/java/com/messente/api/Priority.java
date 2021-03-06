/*
 * Messente API
 * [Messente](https://messente.com) is a global provider of messaging and user verification services.  * Send and receive SMS, Viber, WhatsApp and Telegram messages. * Manage contacts and groups. * Fetch detailed info about phone numbers. * Blacklist phone numbers to make sure you're not sending any unwanted messages.  Messente builds [tools](https://messente.com/documentation) to help organizations connect their services to people anywhere in the world.
 *
 * OpenAPI spec version: 1.4.0
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
 * Set the priority of the message.   Messages are processed starting with in highest priority queue first and lowest priority queue last.   This for example allows to prioritize OTP messages over marketing traffic.
 */
@JsonAdapter(Priority.Adapter.class)
public enum Priority {
  
  LOW("low"),
  
  REGULAR("regular"),
  
  HIGH("high");

  private String value;

  Priority(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Priority fromValue(String text) {
    for (Priority b : Priority.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }

  public static class Adapter extends TypeAdapter<Priority> {
    @Override
    public void write(final JsonWriter jsonWriter, final Priority enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Priority read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Priority.fromValue(String.valueOf(value));
    }
  }
}


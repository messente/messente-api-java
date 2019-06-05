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
 * Whether to store message content as is (plaintext), as a hashed value (sha256) or not at all (nostore)
 */
@JsonAdapter(TextStore.Adapter.class)
public enum TextStore {
  
  NOSTORE("nostore"),
  
  PLAINTEXT("plaintext"),
  
  SHA256("sha256");

  private String value;

  TextStore(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TextStore fromValue(String text) {
    for (TextStore b : TextStore.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }

  public static class Adapter extends TypeAdapter<TextStore> {
    @Override
    public void write(final JsonWriter jsonWriter, final TextStore enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TextStore read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TextStore.fromValue(String.valueOf(value));
    }
  }
}


/*
 * Messente API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
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
 * The human-readable equivalent for this field is contained in \&quot;error\&quot;.   This value is *null* if the message is still being processed.
 */
@JsonAdapter(Status.Adapter.class)
public enum Status {
  
  ACK("ACK"),
  
  DELIVRD("DELIVRD"),
  
  UNDELIV("UNDELIV"),
  
  FAILED("FAILED"),
  
  UNKNOWN("UNKNOWN"),
  
  ACCEPTD("ACCEPTD"),
  
  REJECTD("REJECTD"),
  
  DELETED("DELETED"),
  
  EXPIRED("EXPIRED"),
  
  NACK("NACK"),
  
  SEEN("SEEN");

  private String value;

  Status(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Status fromValue(String text) {
    for (Status b : Status.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }

  public static class Adapter extends TypeAdapter<Status> {
    @Override
    public void write(final JsonWriter jsonWriter, final Status enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Status read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Status.fromValue(String.valueOf(value));
    }
  }
}


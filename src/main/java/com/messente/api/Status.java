/*
 * Messente API
 * [Messente](https://messente.com) is a global provider of messaging and user verification services.  * Send and receive SMS, Viber, WhatsApp and Telegram messages. * Manage contacts and groups. * Fetch detailed info about phone numbers. * Blacklist phone numbers to make sure you're not sending any unwanted messages.  Messente builds [tools](https://messente.com/documentation) to help organizations connect their services to people anywhere in the world.
 *
 * The version of the OpenAPI document: 1.4.0
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
 * The human-readable equivalent for this field is contained in \&quot;error\&quot;.   This value is *null* if the message is still being processed
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

  public static Status fromValue(String value) {
    for (Status b : Status.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Status> {
    @Override
    public void write(final JsonWriter jsonWriter, final Status enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Status read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Status.fromValue(value);
    }
  }
}


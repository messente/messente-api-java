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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SMS message content
 */
@ApiModel(description = "SMS message content")

public class SMS {
  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  private String sender;

  public static final String SERIALIZED_NAME_VALIDITY = "validity";
  @SerializedName(SERIALIZED_NAME_VALIDITY)
  private Integer validity;

  /**
   * Defines how non-GSM characters will be treated:    - \&quot;on\&quot; Use replacement settings from the account&#39;s [API Auto Replace settings page](https://dashboard.messente.com/api-settings/auto-replace)(default)   - \&quot;full\&quot; All non GSM 03.38 characters will be replaced with suitable alternatives   - \&quot;off\&quot; Message content is not modified in any way
   */
  @JsonAdapter(AutoconvertEnum.Adapter.class)
  public enum AutoconvertEnum {
    FULL("full"),
    
    ON("on"),
    
    OFF("off");

    private String value;

    AutoconvertEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AutoconvertEnum fromValue(String text) {
      for (AutoconvertEnum b : AutoconvertEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<AutoconvertEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AutoconvertEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AutoconvertEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AutoconvertEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_AUTOCONVERT = "autoconvert";
  @SerializedName(SERIALIZED_NAME_AUTOCONVERT)
  private AutoconvertEnum autoconvert;

  public static final String SERIALIZED_NAME_UDH = "udh";
  @SerializedName(SERIALIZED_NAME_UDH)
  private String udh;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel = "sms";

  public SMS text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Text content of the SMS
   * @return text
  **/
  @ApiModelProperty(example = "Hello world!", required = true, value = "Text content of the SMS")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public SMS sender(String sender) {
    this.sender = sender;
    return this;
  }

   /**
   * Phone number or alphanumeric sender name
   * @return sender
  **/
  @ApiModelProperty(value = "Phone number or alphanumeric sender name")
  public String getSender() {
    return sender;
  }

  public void setSender(String sender) {
    this.sender = sender;
  }

  public SMS validity(Integer validity) {
    this.validity = validity;
    return this;
  }

   /**
   * After how many minutes this channel is considered as failed and the next channel is attempted
   * @return validity
  **/
  @ApiModelProperty(example = "360", value = "After how many minutes this channel is considered as failed and the next channel is attempted")
  public Integer getValidity() {
    return validity;
  }

  public void setValidity(Integer validity) {
    this.validity = validity;
  }

  public SMS autoconvert(AutoconvertEnum autoconvert) {
    this.autoconvert = autoconvert;
    return this;
  }

   /**
   * Defines how non-GSM characters will be treated:    - \&quot;on\&quot; Use replacement settings from the account&#39;s [API Auto Replace settings page](https://dashboard.messente.com/api-settings/auto-replace)(default)   - \&quot;full\&quot; All non GSM 03.38 characters will be replaced with suitable alternatives   - \&quot;off\&quot; Message content is not modified in any way
   * @return autoconvert
  **/
  @ApiModelProperty(value = "Defines how non-GSM characters will be treated:    - \"on\" Use replacement settings from the account's [API Auto Replace settings page](https://dashboard.messente.com/api-settings/auto-replace)(default)   - \"full\" All non GSM 03.38 characters will be replaced with suitable alternatives   - \"off\" Message content is not modified in any way")
  public AutoconvertEnum getAutoconvert() {
    return autoconvert;
  }

  public void setAutoconvert(AutoconvertEnum autoconvert) {
    this.autoconvert = autoconvert;
  }

  public SMS udh(String udh) {
    this.udh = udh;
    return this;
  }

   /**
   * hex-encoded string containing SMS UDH
   * @return udh
  **/
  @ApiModelProperty(value = "hex-encoded string containing SMS UDH")
  public String getUdh() {
    return udh;
  }

  public void setUdh(String udh) {
    this.udh = udh;
  }

  public SMS channel(String channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @ApiModelProperty(value = "")
  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SMS SMS = (SMS) o;
    return Objects.equals(this.text, SMS.text) &&
        Objects.equals(this.sender, SMS.sender) &&
        Objects.equals(this.validity, SMS.validity) &&
        Objects.equals(this.autoconvert, SMS.autoconvert) &&
        Objects.equals(this.udh, SMS.udh) &&
        Objects.equals(this.channel, SMS.channel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, sender, validity, autoconvert, udh, channel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SMS {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
    sb.append("    autoconvert: ").append(toIndentedString(autoconvert)).append("\n");
    sb.append("    udh: ").append(toIndentedString(udh)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


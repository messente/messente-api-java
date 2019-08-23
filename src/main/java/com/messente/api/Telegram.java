/*
 * Messente API
 * [Messente](https://messente.com) is a global provider of messaging and user verification services. Use Messente API library to send and receive SMS, Viber, WhatsApp and Telegram messages, blacklist phone numbers to make sure you're not sending any unwanted messages, manage contacts and groups.  Messente builds [tools](https://messente.com/documentation) to help organizations connect their services to people anywhere in the world.
 *
 * OpenAPI spec version: 1.1.0
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
 * Telegram message content
 */
@ApiModel(description = "Telegram message content")

public class Telegram {
  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  private String sender;

  public static final String SERIALIZED_NAME_VALIDITY = "validity";
  @SerializedName(SERIALIZED_NAME_VALIDITY)
  private Integer validity;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_IMAGE_URL = "image_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_DOCUMENT_URL = "document_url";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_URL)
  private String documentUrl;

  public static final String SERIALIZED_NAME_AUDIO_URL = "audio_url";
  @SerializedName(SERIALIZED_NAME_AUDIO_URL)
  private String audioUrl;

  /**
   * The channel used to deliver the message
   */
  @JsonAdapter(ChannelEnum.Adapter.class)
  public enum ChannelEnum {
    TELEGRAM("telegram");

    private String value;

    ChannelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChannelEnum fromValue(String text) {
      for (ChannelEnum b : ChannelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<ChannelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChannelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChannelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ChannelEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private ChannelEnum channel = ChannelEnum.TELEGRAM;

  public Telegram sender(String sender) {
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

  public Telegram validity(Integer validity) {
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

  public Telegram text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Plaintext content for Telegram
   * @return text
  **/
  @ApiModelProperty(value = "Plaintext content for Telegram")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Telegram imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * URL for the embedded image. Mutually exclusive with \&quot;document_url\&quot; and \&quot;audio_url\&quot;
   * @return imageUrl
  **/
  @ApiModelProperty(value = "URL for the embedded image. Mutually exclusive with \"document_url\" and \"audio_url\"")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public Telegram documentUrl(String documentUrl) {
    this.documentUrl = documentUrl;
    return this;
  }

   /**
   * URL for the embedded image. Mutually exclusive with \&quot;audio_url\&quot; and \&quot;image_url\&quot;
   * @return documentUrl
  **/
  @ApiModelProperty(value = "URL for the embedded image. Mutually exclusive with \"audio_url\" and \"image_url\"")
  public String getDocumentUrl() {
    return documentUrl;
  }

  public void setDocumentUrl(String documentUrl) {
    this.documentUrl = documentUrl;
  }

  public Telegram audioUrl(String audioUrl) {
    this.audioUrl = audioUrl;
    return this;
  }

   /**
   * URL for the embedded image. Mutually exclusive with \&quot;document_url\&quot; and \&quot;image_url\&quot;
   * @return audioUrl
  **/
  @ApiModelProperty(value = "URL for the embedded image. Mutually exclusive with \"document_url\" and \"image_url\"")
  public String getAudioUrl() {
    return audioUrl;
  }

  public void setAudioUrl(String audioUrl) {
    this.audioUrl = audioUrl;
  }

  public Telegram channel(ChannelEnum channel) {
    this.channel = channel;
    return this;
  }

   /**
   * The channel used to deliver the message
   * @return channel
  **/
  @ApiModelProperty(value = "The channel used to deliver the message")
  public ChannelEnum getChannel() {
    return channel;
  }

  public void setChannel(ChannelEnum channel) {
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
    Telegram telegram = (Telegram) o;
    return Objects.equals(this.sender, telegram.sender) &&
        Objects.equals(this.validity, telegram.validity) &&
        Objects.equals(this.text, telegram.text) &&
        Objects.equals(this.imageUrl, telegram.imageUrl) &&
        Objects.equals(this.documentUrl, telegram.documentUrl) &&
        Objects.equals(this.audioUrl, telegram.audioUrl) &&
        Objects.equals(this.channel, telegram.channel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sender, validity, text, imageUrl, documentUrl, audioUrl, channel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Telegram {\n");
    
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    documentUrl: ").append(toIndentedString(documentUrl)).append("\n");
    sb.append("    audioUrl: ").append(toIndentedString(audioUrl)).append("\n");
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

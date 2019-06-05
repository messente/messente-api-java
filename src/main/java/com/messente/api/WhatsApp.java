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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.messente.api.WhatsAppAudio;
import com.messente.api.WhatsAppDocument;
import com.messente.api.WhatsAppImage;
import com.messente.api.WhatsAppText;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WhatsApp message content.   Only one of \&quot;text\&quot;, \&quot;image\&quot;, \&quot;document\&quot; or \&quot;audio\&quot; can be provided
 */
@ApiModel(description = "WhatsApp message content.   Only one of \"text\", \"image\", \"document\" or \"audio\" can be provided")

public class WhatsApp {
  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  private String sender;

  public static final String SERIALIZED_NAME_VALIDITY = "validity";
  @SerializedName(SERIALIZED_NAME_VALIDITY)
  private Integer validity;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private WhatsAppText text = null;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private WhatsAppImage image = null;

  public static final String SERIALIZED_NAME_DOCUMENT = "document";
  @SerializedName(SERIALIZED_NAME_DOCUMENT)
  private WhatsAppDocument document = null;

  public static final String SERIALIZED_NAME_AUDIO = "audio";
  @SerializedName(SERIALIZED_NAME_AUDIO)
  private WhatsAppAudio audio = null;

  /**
   * The channel used to deliver the message
   */
  @JsonAdapter(ChannelEnum.Adapter.class)
  public enum ChannelEnum {
    WHATSAPP("whatsapp");

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
  private ChannelEnum channel = ChannelEnum.WHATSAPP;

  public WhatsApp sender(String sender) {
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

  public WhatsApp validity(Integer validity) {
    this.validity = validity;
    return this;
  }

   /**
   * After how many minutes this channel is   considered as failed and the next channel is attempted
   * @return validity
  **/
  @ApiModelProperty(example = "360", value = "After how many minutes this channel is   considered as failed and the next channel is attempted")
  public Integer getValidity() {
    return validity;
  }

  public void setValidity(Integer validity) {
    this.validity = validity;
  }

  public WhatsApp text(WhatsAppText text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(value = "")
  public WhatsAppText getText() {
    return text;
  }

  public void setText(WhatsAppText text) {
    this.text = text;
  }

  public WhatsApp image(WhatsAppImage image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(value = "")
  public WhatsAppImage getImage() {
    return image;
  }

  public void setImage(WhatsAppImage image) {
    this.image = image;
  }

  public WhatsApp document(WhatsAppDocument document) {
    this.document = document;
    return this;
  }

   /**
   * Get document
   * @return document
  **/
  @ApiModelProperty(value = "")
  public WhatsAppDocument getDocument() {
    return document;
  }

  public void setDocument(WhatsAppDocument document) {
    this.document = document;
  }

  public WhatsApp audio(WhatsAppAudio audio) {
    this.audio = audio;
    return this;
  }

   /**
   * Get audio
   * @return audio
  **/
  @ApiModelProperty(value = "")
  public WhatsAppAudio getAudio() {
    return audio;
  }

  public void setAudio(WhatsAppAudio audio) {
    this.audio = audio;
  }

  public WhatsApp channel(ChannelEnum channel) {
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
    WhatsApp whatsApp = (WhatsApp) o;
    return Objects.equals(this.sender, whatsApp.sender) &&
        Objects.equals(this.validity, whatsApp.validity) &&
        Objects.equals(this.text, whatsApp.text) &&
        Objects.equals(this.image, whatsApp.image) &&
        Objects.equals(this.document, whatsApp.document) &&
        Objects.equals(this.audio, whatsApp.audio) &&
        Objects.equals(this.channel, whatsApp.channel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sender, validity, text, image, document, audio, channel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsApp {\n");
    
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
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


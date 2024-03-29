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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.messente.JSON;

/**
 * Telegram message content
 */
@ApiModel(description = "Telegram message content")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
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

    public static ChannelEnum fromValue(String value) {
      for (ChannelEnum b : ChannelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ChannelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChannelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChannelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ChannelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private ChannelEnum channel = ChannelEnum.TELEGRAM;

  public Telegram() { 
  }

  public Telegram sender(String sender) {
    
    this.sender = sender;
    return this;
  }

   /**
   * Phone number or alphanumeric sender name
   * @return sender
  **/
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The channel used to deliver the message")

  public ChannelEnum getChannel() {
    return channel;
  }


  public void setChannel(ChannelEnum channel) {
    this.channel = channel;
  }



  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("sender");
    openapiFields.add("validity");
    openapiFields.add("text");
    openapiFields.add("image_url");
    openapiFields.add("document_url");
    openapiFields.add("audio_url");
    openapiFields.add("channel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Telegram
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Telegram.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Telegram is not found in the empty JSON string", Telegram.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Telegram.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Telegram` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("sender") != null && !jsonObj.get("sender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sender").toString()));
      }
      if (jsonObj.get("text") != null && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if (jsonObj.get("image_url") != null && !jsonObj.get("image_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image_url").toString()));
      }
      if (jsonObj.get("document_url") != null && !jsonObj.get("document_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `document_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("document_url").toString()));
      }
      if (jsonObj.get("audio_url") != null && !jsonObj.get("audio_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audio_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audio_url").toString()));
      }
      if (jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Telegram.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Telegram' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Telegram> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Telegram.class));

       return (TypeAdapter<T>) new TypeAdapter<Telegram>() {
           @Override
           public void write(JsonWriter out, Telegram value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Telegram read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Telegram given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Telegram
  * @throws IOException if the JSON string is invalid with respect to Telegram
  */
  public static Telegram fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Telegram.class);
  }

 /**
  * Convert an instance of Telegram to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


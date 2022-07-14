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
 * Viber message content
 */
@ApiModel(description = "Viber message content")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Viber {
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

  public static final String SERIALIZED_NAME_BUTTON_URL = "button_url";
  @SerializedName(SERIALIZED_NAME_BUTTON_URL)
  private String buttonUrl;

  public static final String SERIALIZED_NAME_BUTTON_TEXT = "button_text";
  @SerializedName(SERIALIZED_NAME_BUTTON_TEXT)
  private String buttonText;

  /**
   * The channel used to deliver the message
   */
  @JsonAdapter(ChannelEnum.Adapter.class)
  public enum ChannelEnum {
    VIBER("viber");

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
  private ChannelEnum channel = ChannelEnum.VIBER;

  public Viber() { 
  }

  public Viber sender(String sender) {
    
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


  public Viber validity(Integer validity) {
    
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


  public Viber text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Plaintext content for Viber
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Plaintext content for Viber")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public Viber imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * URL for the embedded image    Valid combinations:    1) image_url,    2) text, image_url, button_url, button_text
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL for the embedded image    Valid combinations:    1) image_url,    2) text, image_url, button_url, button_text")

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public Viber buttonUrl(String buttonUrl) {
    
    this.buttonUrl = buttonUrl;
    return this;
  }

   /**
   * URL of the button, must be specified along with &#39;&#39;text&#39;&#39;, &#39;&#39;button_text&#39;&#39; and &#39;&#39;image_url&#39;&#39; (optional)
   * @return buttonUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL of the button, must be specified along with ''text'', ''button_text'' and ''image_url'' (optional)")

  public String getButtonUrl() {
    return buttonUrl;
  }


  public void setButtonUrl(String buttonUrl) {
    this.buttonUrl = buttonUrl;
  }


  public Viber buttonText(String buttonText) {
    
    this.buttonText = buttonText;
    return this;
  }

   /**
   * Must be specified along with &#39;&#39;text&#39;&#39;, &#39;&#39;button_url&#39;&#39;, &#39;&#39;button_text&#39;&#39;, &#39;&#39;image_url&#39;&#39; (optional)
   * @return buttonText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Must be specified along with ''text'', ''button_url'', ''button_text'', ''image_url'' (optional)")

  public String getButtonText() {
    return buttonText;
  }


  public void setButtonText(String buttonText) {
    this.buttonText = buttonText;
  }


  public Viber channel(ChannelEnum channel) {
    
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
    Viber viber = (Viber) o;
    return Objects.equals(this.sender, viber.sender) &&
        Objects.equals(this.validity, viber.validity) &&
        Objects.equals(this.text, viber.text) &&
        Objects.equals(this.imageUrl, viber.imageUrl) &&
        Objects.equals(this.buttonUrl, viber.buttonUrl) &&
        Objects.equals(this.buttonText, viber.buttonText) &&
        Objects.equals(this.channel, viber.channel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sender, validity, text, imageUrl, buttonUrl, buttonText, channel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Viber {\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    buttonUrl: ").append(toIndentedString(buttonUrl)).append("\n");
    sb.append("    buttonText: ").append(toIndentedString(buttonText)).append("\n");
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
    openapiFields.add("button_url");
    openapiFields.add("button_text");
    openapiFields.add("channel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Viber
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Viber.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Viber is not found in the empty JSON string", Viber.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Viber.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Viber` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if (jsonObj.get("button_url") != null && !jsonObj.get("button_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `button_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("button_url").toString()));
      }
      if (jsonObj.get("button_text") != null && !jsonObj.get("button_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `button_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("button_text").toString()));
      }
      if (jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Viber.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Viber' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Viber> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Viber.class));

       return (TypeAdapter<T>) new TypeAdapter<Viber>() {
           @Override
           public void write(JsonWriter out, Viber value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Viber read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Viber given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Viber
  * @throws IOException if the JSON string is invalid with respect to Viber
  */
  public static Viber fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Viber.class);
  }

 /**
  * Convert an instance of Viber to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A text
 */
@ApiModel(description = "A text")

public class WhatsAppText {
  public static final String SERIALIZED_NAME_PREVIEW_URL = "preview_url";
  @SerializedName(SERIALIZED_NAME_PREVIEW_URL)
  private Boolean previewUrl = true;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public WhatsAppText previewUrl(Boolean previewUrl) {
    this.previewUrl = previewUrl;
    return this;
  }

   /**
   * Whether to display link preview if the message contains a hyperlink
   * @return previewUrl
  **/
  @ApiModelProperty(value = "Whether to display link preview if the message contains a hyperlink")
  public Boolean getPreviewUrl() {
    return previewUrl;
  }

  public void setPreviewUrl(Boolean previewUrl) {
    this.previewUrl = previewUrl;
  }

  public WhatsAppText body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Plaintext content for WhatsApp, can contain URLs, emojis and formatting
   * @return body
  **/
  @ApiModelProperty(required = true, value = "Plaintext content for WhatsApp, can contain URLs, emojis and formatting")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsAppText whatsAppText = (WhatsAppText) o;
    return Objects.equals(this.previewUrl, whatsAppText.previewUrl) &&
        Objects.equals(this.body, whatsAppText.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(previewUrl, body);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppText {\n");
    
    sb.append("    previewUrl: ").append(toIndentedString(previewUrl)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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


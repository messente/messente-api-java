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
import com.messente.api.ErrorCodeOmnichannel;
import com.messente.api.ErrorTitleOmnichannel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A container for Omnichannel API error
 */
@ApiModel(description = "A container for Omnichannel API error")

public class ErrorItemOmnichannel {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private ErrorTitleOmnichannel title = null;

  public static final String SERIALIZED_NAME_DETAIL = "detail";
  @SerializedName(SERIALIZED_NAME_DETAIL)
  private String detail;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private ErrorCodeOmnichannel code = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public ErrorItemOmnichannel title(ErrorTitleOmnichannel title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(required = true, value = "")
  public ErrorTitleOmnichannel getTitle() {
    return title;
  }

  public void setTitle(ErrorTitleOmnichannel title) {
    this.title = title;
  }

  public ErrorItemOmnichannel detail(String detail) {
    this.detail = detail;
    return this;
  }

   /**
   * Free form more detailed description of the error
   * @return detail
  **/
  @ApiModelProperty(required = true, value = "Free form more detailed description of the error")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public ErrorItemOmnichannel code(ErrorCodeOmnichannel code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(required = true, value = "")
  public ErrorCodeOmnichannel getCode() {
    return code;
  }

  public void setCode(ErrorCodeOmnichannel code) {
    this.code = code;
  }

  public ErrorItemOmnichannel source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Describes which field is causing the issue in the payload, null for non 400 status code responses
   * @return source
  **/
  @ApiModelProperty(required = true, value = "Describes which field is causing the issue in the payload, null for non 400 status code responses")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorItemOmnichannel errorItemOmnichannel = (ErrorItemOmnichannel) o;
    return Objects.equals(this.title, errorItemOmnichannel.title) &&
        Objects.equals(this.detail, errorItemOmnichannel.detail) &&
        Objects.equals(this.code, errorItemOmnichannel.code) &&
        Objects.equals(this.source, errorItemOmnichannel.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, detail, code, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorItemOmnichannel {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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


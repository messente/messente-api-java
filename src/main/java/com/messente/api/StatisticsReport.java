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
 * Report for one country
 */
@ApiModel(description = "Report for one country")

public class StatisticsReport {
  public static final String SERIALIZED_NAME_TOTAL_MESSAGES = "total_messages";
  @SerializedName(SERIALIZED_NAME_TOTAL_MESSAGES)
  private Integer totalMessages;

  public static final String SERIALIZED_NAME_TOTAL_PRICE = "total_price";
  @SerializedName(SERIALIZED_NAME_TOTAL_PRICE)
  private String totalPrice;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public StatisticsReport totalMessages(Integer totalMessages) {
    this.totalMessages = totalMessages;
    return this;
  }

   /**
   * Sum of all messages
   * @return totalMessages
  **/
  @ApiModelProperty(required = true, value = "Sum of all messages")
  public Integer getTotalMessages() {
    return totalMessages;
  }

  public void setTotalMessages(Integer totalMessages) {
    this.totalMessages = totalMessages;
  }

  public StatisticsReport totalPrice(String totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

   /**
   * Price for all messages
   * @return totalPrice
  **/
  @ApiModelProperty(required = true, value = "Price for all messages")
  public String getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(String totalPrice) {
    this.totalPrice = totalPrice;
  }

  public StatisticsReport country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Target country of all messages
   * @return country
  **/
  @ApiModelProperty(required = true, value = "Target country of all messages")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatisticsReport statisticsReport = (StatisticsReport) o;
    return Objects.equals(this.totalMessages, statisticsReport.totalMessages) &&
        Objects.equals(this.totalPrice, statisticsReport.totalPrice) &&
        Objects.equals(this.country, statisticsReport.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalMessages, totalPrice, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticsReport {\n");
    
    sb.append("    totalMessages: ").append(toIndentedString(totalMessages)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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


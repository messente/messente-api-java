/*
 * Messente API
 * [Messente](https://messente.com) is a global provider of messaging and user verification services.  * Send and receive SMS, Viber, WhatsApp and Telegram messages. * Manage contacts and groups. * Fetch detailed info about phone numbers. * Blacklist phone numbers to make sure you're not sending any unwanted messages.  Messente builds [tools](https://messente.com/documentation) to help organizations connect their services to people anywhere in the world.
 *
 * OpenAPI spec version: 1.3.0
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
import com.messente.api.DeliveryResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A container for successful delivery report response
 */
@ApiModel(description = "A container for successful delivery report response")

public class DeliveryReportResponse {
  public static final String SERIALIZED_NAME_STATUSES = "statuses";
  @SerializedName(SERIALIZED_NAME_STATUSES)
  private List<DeliveryResult> statuses = new ArrayList<DeliveryResult>();

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_OMNIMESSAGE_ID = "omnimessage_id";
  @SerializedName(SERIALIZED_NAME_OMNIMESSAGE_ID)
  private String omnimessageId;

  public DeliveryReportResponse statuses(List<DeliveryResult> statuses) {
    this.statuses = statuses;
    return this;
  }

  public DeliveryReportResponse addStatusesItem(DeliveryResult statusesItem) {
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * Contains the delivery reports for each channel, ordered by send order
   * @return statuses
  **/
  @ApiModelProperty(required = true, value = "Contains the delivery reports for each channel, ordered by send order")
  public List<DeliveryResult> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<DeliveryResult> statuses) {
    this.statuses = statuses;
  }

  public DeliveryReportResponse to(String to) {
    this.to = to;
    return this;
  }

   /**
   * Phone number in e.164 format
   * @return to
  **/
  @ApiModelProperty(required = true, value = "Phone number in e.164 format")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public DeliveryReportResponse omnimessageId(String omnimessageId) {
    this.omnimessageId = omnimessageId;
    return this;
  }

   /**
   * Unique identifier for the omnimessage
   * @return omnimessageId
  **/
  @ApiModelProperty(required = true, value = "Unique identifier for the omnimessage")
  public String getOmnimessageId() {
    return omnimessageId;
  }

  public void setOmnimessageId(String omnimessageId) {
    this.omnimessageId = omnimessageId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryReportResponse deliveryReportResponse = (DeliveryReportResponse) o;
    return Objects.equals(this.statuses, deliveryReportResponse.statuses) &&
        Objects.equals(this.to, deliveryReportResponse.to) &&
        Objects.equals(this.omnimessageId, deliveryReportResponse.omnimessageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statuses, to, omnimessageId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryReportResponse {\n");
    
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    omnimessageId: ").append(toIndentedString(omnimessageId)).append("\n");
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


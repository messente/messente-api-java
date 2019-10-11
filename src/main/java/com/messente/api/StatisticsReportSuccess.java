/*
 * Messente API
 * [Messente](https://messente.com) is a global provider of messaging and user verification services.  * Send and receive SMS, Viber, WhatsApp and Telegram messages. * Manage contacts and groups. * Fetch detailed info about phone numbers. * Blacklist phone numbers to make sure you're not sending any unwanted messages.  Messente builds [tools](https://messente.com/documentation) to help organizations connect their services to people anywhere in the world.
 *
 * OpenAPI spec version: 1.1.1
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
import com.messente.api.StatisticsReport;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A container for statistics reports
 */
@ApiModel(description = "A container for statistics reports")

public class StatisticsReportSuccess {
  public static final String SERIALIZED_NAME_REPORTS = "reports";
  @SerializedName(SERIALIZED_NAME_REPORTS)
  private List<StatisticsReport> reports = new ArrayList<StatisticsReport>();

  public StatisticsReportSuccess reports(List<StatisticsReport> reports) {
    this.reports = reports;
    return this;
  }

  public StatisticsReportSuccess addReportsItem(StatisticsReport reportsItem) {
    this.reports.add(reportsItem);
    return this;
  }

   /**
   * Array of report objects
   * @return reports
  **/
  @ApiModelProperty(required = true, value = "Array of report objects")
  public List<StatisticsReport> getReports() {
    return reports;
  }

  public void setReports(List<StatisticsReport> reports) {
    this.reports = reports;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatisticsReportSuccess statisticsReportSuccess = (StatisticsReportSuccess) o;
    return Objects.equals(this.reports, statisticsReportSuccess.reports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reports);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticsReportSuccess {\n");
    
    sb.append("    reports: ").append(toIndentedString(reports)).append("\n");
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


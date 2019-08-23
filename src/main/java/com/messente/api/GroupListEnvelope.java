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
import com.messente.api.GroupResponseFields;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A container for groups
 */
@ApiModel(description = "A container for groups")

public class GroupListEnvelope {
  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<GroupResponseFields> groups = null;

  public GroupListEnvelope groups(List<GroupResponseFields> groups) {
    this.groups = groups;
    return this;
  }

  public GroupListEnvelope addGroupsItem(GroupResponseFields groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<GroupResponseFields>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * An array of groups
   * @return groups
  **/
  @ApiModelProperty(value = "An array of groups")
  public List<GroupResponseFields> getGroups() {
    return groups;
  }

  public void setGroups(List<GroupResponseFields> groups) {
    this.groups = groups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupListEnvelope groupListEnvelope = (GroupListEnvelope) o;
    return Objects.equals(this.groups, groupListEnvelope.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupListEnvelope {\n");
    
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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


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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GroupResponseFields
 */

public class GroupResponseFields {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CREATED_ON = "createdOn";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private String createdOn;

  public static final String SERIALIZED_NAME_CONTACTS_COUNT = "contactsCount";
  @SerializedName(SERIALIZED_NAME_CONTACTS_COUNT)
  private Integer contactsCount;

  public GroupResponseFields id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id string in UUID format
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Id string in UUID format")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GroupResponseFields name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GroupResponseFields createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Format %Y-%m-%dT%H:%M:%S.%fZ
   * @return createdOn
  **/
  @ApiModelProperty(value = "Format %Y-%m-%dT%H:%M:%S.%fZ")
  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public GroupResponseFields contactsCount(Integer contactsCount) {
    this.contactsCount = contactsCount;
    return this;
  }

   /**
   * Get contactsCount
   * @return contactsCount
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getContactsCount() {
    return contactsCount;
  }

  public void setContactsCount(Integer contactsCount) {
    this.contactsCount = contactsCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupResponseFields groupResponseFields = (GroupResponseFields) o;
    return Objects.equals(this.id, groupResponseFields.id) &&
        Objects.equals(this.name, groupResponseFields.name) &&
        Objects.equals(this.createdOn, groupResponseFields.createdOn) &&
        Objects.equals(this.contactsCount, groupResponseFields.contactsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, createdOn, contactsCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupResponseFields {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    contactsCount: ").append(toIndentedString(contactsCount)).append("\n");
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


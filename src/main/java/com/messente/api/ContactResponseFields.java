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
import org.threeten.bp.LocalDate;

/**
 * A container for response fields of a contact
 */
@ApiModel(description = "A container for response fields of a contact")

public class ContactResponseFields {
  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private String company;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_CUSTOM = "custom";
  @SerializedName(SERIALIZED_NAME_CUSTOM)
  private String custom;

  public static final String SERIALIZED_NAME_CUSTOM2 = "custom2";
  @SerializedName(SERIALIZED_NAME_CUSTOM2)
  private String custom2;

  public static final String SERIALIZED_NAME_CUSTOM3 = "custom3";
  @SerializedName(SERIALIZED_NAME_CUSTOM3)
  private String custom3;

  public static final String SERIALIZED_NAME_CUSTOM4 = "custom4";
  @SerializedName(SERIALIZED_NAME_CUSTOM4)
  private String custom4;

  public static final String SERIALIZED_NAME_SCHEDULED_DELETION_DATE = "scheduledDeletionDate";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_DELETION_DATE)
  private LocalDate scheduledDeletionDate;

  public ContactResponseFields phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Phone number in e.164 format
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "Phone number in e.164 format")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public ContactResponseFields email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email of the contact
   * @return email
  **/
  @ApiModelProperty(value = "The email of the contact")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ContactResponseFields firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name of the contact
   * @return firstName
  **/
  @ApiModelProperty(value = "The first name of the contact")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ContactResponseFields lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name of the contact
   * @return lastName
  **/
  @ApiModelProperty(value = "The last name of the contact")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ContactResponseFields company(String company) {
    this.company = company;
    return this;
  }

   /**
   * The company of the contact
   * @return company
  **/
  @ApiModelProperty(value = "The company of the contact")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public ContactResponseFields title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the contact
   * @return title
  **/
  @ApiModelProperty(value = "The title of the contact")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ContactResponseFields custom(String custom) {
    this.custom = custom;
    return this;
  }

   /**
   * The first custom field
   * @return custom
  **/
  @ApiModelProperty(value = "The first custom field")
  public String getCustom() {
    return custom;
  }

  public void setCustom(String custom) {
    this.custom = custom;
  }

  public ContactResponseFields custom2(String custom2) {
    this.custom2 = custom2;
    return this;
  }

   /**
   * The second custom field
   * @return custom2
  **/
  @ApiModelProperty(value = "The second custom field")
  public String getCustom2() {
    return custom2;
  }

  public void setCustom2(String custom2) {
    this.custom2 = custom2;
  }

  public ContactResponseFields custom3(String custom3) {
    this.custom3 = custom3;
    return this;
  }

   /**
   * The third custom field
   * @return custom3
  **/
  @ApiModelProperty(value = "The third custom field")
  public String getCustom3() {
    return custom3;
  }

  public void setCustom3(String custom3) {
    this.custom3 = custom3;
  }

  public ContactResponseFields custom4(String custom4) {
    this.custom4 = custom4;
    return this;
  }

   /**
   * The fourth custom field
   * @return custom4
  **/
  @ApiModelProperty(value = "The fourth custom field")
  public String getCustom4() {
    return custom4;
  }

  public void setCustom4(String custom4) {
    this.custom4 = custom4;
  }

  public ContactResponseFields scheduledDeletionDate(LocalDate scheduledDeletionDate) {
    this.scheduledDeletionDate = scheduledDeletionDate;
    return this;
  }

   /**
   * The date in ISO 8601 format, YYYY-MM-DD,  on which the contact is going to be deleted  because it has not belonged to a group for 30 days
   * @return scheduledDeletionDate
  **/
  @ApiModelProperty(value = "The date in ISO 8601 format, YYYY-MM-DD,  on which the contact is going to be deleted  because it has not belonged to a group for 30 days")
  public LocalDate getScheduledDeletionDate() {
    return scheduledDeletionDate;
  }

  public void setScheduledDeletionDate(LocalDate scheduledDeletionDate) {
    this.scheduledDeletionDate = scheduledDeletionDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactResponseFields contactResponseFields = (ContactResponseFields) o;
    return Objects.equals(this.phoneNumber, contactResponseFields.phoneNumber) &&
        Objects.equals(this.email, contactResponseFields.email) &&
        Objects.equals(this.firstName, contactResponseFields.firstName) &&
        Objects.equals(this.lastName, contactResponseFields.lastName) &&
        Objects.equals(this.company, contactResponseFields.company) &&
        Objects.equals(this.title, contactResponseFields.title) &&
        Objects.equals(this.custom, contactResponseFields.custom) &&
        Objects.equals(this.custom2, contactResponseFields.custom2) &&
        Objects.equals(this.custom3, contactResponseFields.custom3) &&
        Objects.equals(this.custom4, contactResponseFields.custom4) &&
        Objects.equals(this.scheduledDeletionDate, contactResponseFields.scheduledDeletionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, email, firstName, lastName, company, title, custom, custom2, custom3, custom4, scheduledDeletionDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactResponseFields {\n");
    
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    custom2: ").append(toIndentedString(custom2)).append("\n");
    sb.append("    custom3: ").append(toIndentedString(custom3)).append("\n");
    sb.append("    custom4: ").append(toIndentedString(custom4)).append("\n");
    sb.append("    scheduledDeletionDate: ").append(toIndentedString(scheduledDeletionDate)).append("\n");
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

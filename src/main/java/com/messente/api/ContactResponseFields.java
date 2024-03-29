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
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * A container for response fields of a contact
 */
@ApiModel(description = "A container for response fields of a contact")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
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

  public ContactResponseFields() { 
  }

  public ContactResponseFields phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Phone number in e.164 format
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date in ISO 8601 format, YYYY-MM-DD,  on which the contact is going to be deleted  because it has not belonged to a group for 30 days")

  public LocalDate getScheduledDeletionDate() {
    return scheduledDeletionDate;
  }


  public void setScheduledDeletionDate(LocalDate scheduledDeletionDate) {
    this.scheduledDeletionDate = scheduledDeletionDate;
  }



  @Override
  public boolean equals(Object o) {
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

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, email, firstName, lastName, company, title, custom, custom2, custom3, custom4, scheduledDeletionDate);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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
    openapiFields.add("phoneNumber");
    openapiFields.add("email");
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("company");
    openapiFields.add("title");
    openapiFields.add("custom");
    openapiFields.add("custom2");
    openapiFields.add("custom3");
    openapiFields.add("custom4");
    openapiFields.add("scheduledDeletionDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ContactResponseFields
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ContactResponseFields.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContactResponseFields is not found in the empty JSON string", ContactResponseFields.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ContactResponseFields.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContactResponseFields` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("phoneNumber") != null && !jsonObj.get("phoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumber").toString()));
      }
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if (jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if (jsonObj.get("company") != null && !jsonObj.get("company").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company").toString()));
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (jsonObj.get("custom") != null && !jsonObj.get("custom").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom").toString()));
      }
      if (jsonObj.get("custom2") != null && !jsonObj.get("custom2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom2").toString()));
      }
      if (jsonObj.get("custom3") != null && !jsonObj.get("custom3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom3").toString()));
      }
      if (jsonObj.get("custom4") != null && !jsonObj.get("custom4").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom4` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom4").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContactResponseFields.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContactResponseFields' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContactResponseFields> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContactResponseFields.class));

       return (TypeAdapter<T>) new TypeAdapter<ContactResponseFields>() {
           @Override
           public void write(JsonWriter out, ContactResponseFields value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContactResponseFields read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ContactResponseFields given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContactResponseFields
  * @throws IOException if the JSON string is invalid with respect to ContactResponseFields
  */
  public static ContactResponseFields fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContactResponseFields.class);
  }

 /**
  * Convert an instance of ContactResponseFields to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


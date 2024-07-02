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
import com.messente.api.ContactResponseFields;
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
 * A container for a contact
 */
@ApiModel(description = "A container for a contact")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContactEnvelope {
  public static final String SERIALIZED_NAME_CONTACT = "contact";
  @SerializedName(SERIALIZED_NAME_CONTACT)
  private ContactResponseFields contact;

  public ContactEnvelope() { 
  }

  public ContactEnvelope contact(ContactResponseFields contact) {
    
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContactResponseFields getContact() {
    return contact;
  }


  public void setContact(ContactResponseFields contact) {
    this.contact = contact;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactEnvelope contactEnvelope = (ContactEnvelope) o;
    return Objects.equals(this.contact, contactEnvelope.contact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contact);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactEnvelope {\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
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
    openapiFields.add("contact");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ContactEnvelope
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ContactEnvelope.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContactEnvelope is not found in the empty JSON string", ContactEnvelope.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ContactEnvelope.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContactEnvelope` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `contact`
      if (jsonObj.getAsJsonObject("contact") != null) {
        ContactResponseFields.validateJsonObject(jsonObj.getAsJsonObject("contact"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContactEnvelope.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContactEnvelope' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContactEnvelope> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContactEnvelope.class));

       return (TypeAdapter<T>) new TypeAdapter<ContactEnvelope>() {
           @Override
           public void write(JsonWriter out, ContactEnvelope value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContactEnvelope read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ContactEnvelope given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContactEnvelope
  * @throws IOException if the JSON string is invalid with respect to ContactEnvelope
  */
  public static ContactEnvelope fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContactEnvelope.class);
  }

 /**
  * Convert an instance of ContactEnvelope to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


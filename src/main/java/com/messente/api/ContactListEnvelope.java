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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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
 * A container for contacts
 */
@ApiModel(description = "A container for contacts")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContactListEnvelope {
  public static final String SERIALIZED_NAME_CONTACTS = "contacts";
  @SerializedName(SERIALIZED_NAME_CONTACTS)
  private Set<ContactResponseFields> contacts = null;

  public ContactListEnvelope() { 
  }

  public ContactListEnvelope contacts(Set<ContactResponseFields> contacts) {
    
    this.contacts = contacts;
    return this;
  }

  public ContactListEnvelope addContactsItem(ContactResponseFields contactsItem) {
    if (this.contacts == null) {
      this.contacts = new LinkedHashSet<>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

   /**
   * An array of contacts
   * @return contacts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of contacts")

  public Set<ContactResponseFields> getContacts() {
    return contacts;
  }


  public void setContacts(Set<ContactResponseFields> contacts) {
    this.contacts = contacts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactListEnvelope contactListEnvelope = (ContactListEnvelope) o;
    return Objects.equals(this.contacts, contactListEnvelope.contacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contacts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactListEnvelope {\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
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
    openapiFields.add("contacts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ContactListEnvelope
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ContactListEnvelope.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContactListEnvelope is not found in the empty JSON string", ContactListEnvelope.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ContactListEnvelope.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContactListEnvelope` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraycontacts = jsonObj.getAsJsonArray("contacts");
      if (jsonArraycontacts != null) {
        // ensure the json data is an array
        if (!jsonObj.get("contacts").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `contacts` to be an array in the JSON string but got `%s`", jsonObj.get("contacts").toString()));
        }

        // validate the optional field `contacts` (array)
        for (int i = 0; i < jsonArraycontacts.size(); i++) {
          ContactResponseFields.validateJsonObject(jsonArraycontacts.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContactListEnvelope.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContactListEnvelope' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContactListEnvelope> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContactListEnvelope.class));

       return (TypeAdapter<T>) new TypeAdapter<ContactListEnvelope>() {
           @Override
           public void write(JsonWriter out, ContactListEnvelope value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContactListEnvelope read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ContactListEnvelope given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContactListEnvelope
  * @throws IOException if the JSON string is invalid with respect to ContactListEnvelope
  */
  public static ContactListEnvelope fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContactListEnvelope.class);
  }

 /**
  * Convert an instance of ContactListEnvelope to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


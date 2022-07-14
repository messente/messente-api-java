/*
 * Messente API
 * [Messente](https://messente.com) is a global provider of messaging and user verification services.  * Send and receive SMS, Viber, WhatsApp and Telegram messages. * Manage contacts and groups. * Fetch detailed info about phone numbers. * Blacklist phone numbers to make sure you're not sending any unwanted messages.  Messente builds [tools](https://messente.com/documentation) to help organizations connect their services to people anywhere in the world.
 *
 * The version of the OpenAPI document: 1.4.0
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
import com.messente.api.SMS;
import com.messente.api.Telegram;
import com.messente.api.Viber;
import com.messente.api.WhatsApp;
import com.messente.api.WhatsAppAudio;
import com.messente.api.WhatsAppDocument;
import com.messente.api.WhatsAppImage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import com.messente.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OmnimessageMessagesInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(OmnimessageMessagesInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!OmnimessageMessagesInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'OmnimessageMessagesInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SMS> adapterSMS = gson.getDelegateAdapter(this, TypeToken.get(SMS.class));
            final TypeAdapter<Telegram> adapterTelegram = gson.getDelegateAdapter(this, TypeToken.get(Telegram.class));
            final TypeAdapter<Viber> adapterViber = gson.getDelegateAdapter(this, TypeToken.get(Viber.class));
            final TypeAdapter<WhatsApp> adapterWhatsApp = gson.getDelegateAdapter(this, TypeToken.get(WhatsApp.class));

            return (TypeAdapter<T>) new TypeAdapter<OmnimessageMessagesInner>() {
                @Override
                public void write(JsonWriter out, OmnimessageMessagesInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `SMS`
                    if (value.getActualInstance() instanceof SMS) {
                        JsonObject obj = adapterSMS.toJsonTree((SMS)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `Telegram`
                    if (value.getActualInstance() instanceof Telegram) {
                        JsonObject obj = adapterTelegram.toJsonTree((Telegram)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `Viber`
                    if (value.getActualInstance() instanceof Viber) {
                        JsonObject obj = adapterViber.toJsonTree((Viber)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `WhatsApp`
                    if (value.getActualInstance() instanceof WhatsApp) {
                        JsonObject obj = adapterWhatsApp.toJsonTree((WhatsApp)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: SMS, Telegram, Viber, WhatsApp");
                }

                @Override
                public OmnimessageMessagesInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize SMS
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SMS.validateJsonObject(jsonObject);
                        actualAdapter = adapterSMS;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'SMS'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for SMS failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'SMS'", e);
                    }

                    // deserialize Telegram
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Telegram.validateJsonObject(jsonObject);
                        actualAdapter = adapterTelegram;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Telegram'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Telegram failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Telegram'", e);
                    }

                    // deserialize Viber
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Viber.validateJsonObject(jsonObject);
                        actualAdapter = adapterViber;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Viber'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Viber failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Viber'", e);
                    }

                    // deserialize WhatsApp
                    try {
                        // validate the JSON object to see if any exception is thrown
                        WhatsApp.validateJsonObject(jsonObject);
                        actualAdapter = adapterWhatsApp;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'WhatsApp'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for WhatsApp failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'WhatsApp'", e);
                    }

                    if (match == 1) {
                        OmnimessageMessagesInner ret = new OmnimessageMessagesInner();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for OmnimessageMessagesInner: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public OmnimessageMessagesInner() {
        super("oneOf", Boolean.FALSE);
    }

    public OmnimessageMessagesInner(SMS o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public OmnimessageMessagesInner(Telegram o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public OmnimessageMessagesInner(Viber o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public OmnimessageMessagesInner(WhatsApp o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("SMS", new GenericType<SMS>() {
        });
        schemas.put("Telegram", new GenericType<Telegram>() {
        });
        schemas.put("Viber", new GenericType<Viber>() {
        });
        schemas.put("WhatsApp", new GenericType<WhatsApp>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return OmnimessageMessagesInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * SMS, Telegram, Viber, WhatsApp
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof SMS) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Telegram) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Viber) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof WhatsApp) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be SMS, Telegram, Viber, WhatsApp");
    }

    /**
     * Get the actual instance, which can be the following:
     * SMS, Telegram, Viber, WhatsApp
     *
     * @return The actual instance (SMS, Telegram, Viber, WhatsApp)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `SMS`. If the actual instance is not `SMS`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SMS`
     * @throws ClassCastException if the instance is not `SMS`
     */
    public SMS getSMS() throws ClassCastException {
        return (SMS)super.getActualInstance();
    }

    /**
     * Get the actual instance of `Telegram`. If the actual instance is not `Telegram`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Telegram`
     * @throws ClassCastException if the instance is not `Telegram`
     */
    public Telegram getTelegram() throws ClassCastException {
        return (Telegram)super.getActualInstance();
    }

    /**
     * Get the actual instance of `Viber`. If the actual instance is not `Viber`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Viber`
     * @throws ClassCastException if the instance is not `Viber`
     */
    public Viber getViber() throws ClassCastException {
        return (Viber)super.getActualInstance();
    }

    /**
     * Get the actual instance of `WhatsApp`. If the actual instance is not `WhatsApp`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WhatsApp`
     * @throws ClassCastException if the instance is not `WhatsApp`
     */
    public WhatsApp getWhatsApp() throws ClassCastException {
        return (WhatsApp)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OmnimessageMessagesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with SMS
    try {
      SMS.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for SMS failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with Telegram
    try {
      Telegram.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for Telegram failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with Viber
    try {
      Viber.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for Viber failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with WhatsApp
    try {
      WhatsApp.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for WhatsApp failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for OmnimessageMessagesInner with oneOf schemas: SMS, Telegram, Viber, WhatsApp. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of OmnimessageMessagesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OmnimessageMessagesInner
  * @throws IOException if the JSON string is invalid with respect to OmnimessageMessagesInner
  */
  public static OmnimessageMessagesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OmnimessageMessagesInner.class);
  }

 /**
  * Convert an instance of OmnimessageMessagesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


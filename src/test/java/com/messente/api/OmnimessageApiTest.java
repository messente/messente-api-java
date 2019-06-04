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

import com.messente.ApiException;
import com.messente.api.ErrorOmnichannel;
import com.messente.api.OmniMessageCreateSuccessResponse;
import com.messente.api.Omnimessage;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OmnimessageApi
 */
@Ignore
public class OmnimessageApiTest {

    private final OmnimessageApi api = new OmnimessageApi();

    
    /**
     * Cancels a scheduled Omnimessage
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelScheduledMessageTest() throws ApiException {
        UUID omnimessageId = null;
        api.cancelScheduledMessage(omnimessageId);

        // TODO: test validations
    }
    
    /**
     * Sends an Omnimessage
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendOmnimessageTest() throws ApiException {
        Omnimessage omnimessage = null;
        OmniMessageCreateSuccessResponse response = api.sendOmnimessage(omnimessage);

        // TODO: test validations
    }
    
}

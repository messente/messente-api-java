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


package com.messente;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Configuration {
    private static ApiClient defaultApiClient = new ApiClient();

    /**
     * Get the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @return Default API client
     */
    public static ApiClient getDefaultApiClient() {
        return defaultApiClient;
    }

    /**
     * Set the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @param apiClient API client
     */
    public static void setDefaultApiClient(ApiClient apiClient) {
        defaultApiClient = apiClient;
    }
}

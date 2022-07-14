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

import com.messente.ApiCallback;
import com.messente.ApiClient;
import com.messente.ApiException;
import com.messente.ApiResponse;
import com.messente.Configuration;
import com.messente.Pair;
import com.messente.ProgressRequestBody;
import com.messente.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.messente.api.ErrorOmnichannel;
import com.messente.api.OmniMessageCreateSuccessResponse;
import com.messente.api.Omnimessage;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class OmnimessageApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public OmnimessageApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OmnimessageApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for cancelScheduledMessage
     * @param omnimessageId UUID of the scheduled omnimessage to be cancelled (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Scheduled omnimessage successfully cancelled </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> If the omnimessage has already been sent or no such message exists </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cancelScheduledMessageCall(UUID omnimessageId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/omnimessage/{omnimessageId}"
            .replaceAll("\\{" + "omnimessageId" + "\\}", localVarApiClient.escapeString(omnimessageId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call cancelScheduledMessageValidateBeforeCall(UUID omnimessageId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'omnimessageId' is set
        if (omnimessageId == null) {
            throw new ApiException("Missing the required parameter 'omnimessageId' when calling cancelScheduledMessage(Async)");
        }
        

        okhttp3.Call localVarCall = cancelScheduledMessageCall(omnimessageId, _callback);
        return localVarCall;

    }

    /**
     * Cancels a scheduled Omnimessage
     * 
     * @param omnimessageId UUID of the scheduled omnimessage to be cancelled (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Scheduled omnimessage successfully cancelled </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> If the omnimessage has already been sent or no such message exists </td><td>  -  </td></tr>
     </table>
     */
    public Object cancelScheduledMessage(UUID omnimessageId) throws ApiException {
        ApiResponse<Object> localVarResp = cancelScheduledMessageWithHttpInfo(omnimessageId);
        return localVarResp.getData();
    }

    /**
     * Cancels a scheduled Omnimessage
     * 
     * @param omnimessageId UUID of the scheduled omnimessage to be cancelled (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Scheduled omnimessage successfully cancelled </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> If the omnimessage has already been sent or no such message exists </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> cancelScheduledMessageWithHttpInfo(UUID omnimessageId) throws ApiException {
        okhttp3.Call localVarCall = cancelScheduledMessageValidateBeforeCall(omnimessageId, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Cancels a scheduled Omnimessage (asynchronously)
     * 
     * @param omnimessageId UUID of the scheduled omnimessage to be cancelled (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Scheduled omnimessage successfully cancelled </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> If the omnimessage has already been sent or no such message exists </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cancelScheduledMessageAsync(UUID omnimessageId, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = cancelScheduledMessageValidateBeforeCall(omnimessageId, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for sendOmnimessage
     * @param omnimessage Omnimessage to be sent (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Omnimessage success response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sendOmnimessageCall(Omnimessage omnimessage, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = omnimessage;

        // create path and map variables
        String localVarPath = "/omnimessage";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call sendOmnimessageValidateBeforeCall(Omnimessage omnimessage, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'omnimessage' is set
        if (omnimessage == null) {
            throw new ApiException("Missing the required parameter 'omnimessage' when calling sendOmnimessage(Async)");
        }
        

        okhttp3.Call localVarCall = sendOmnimessageCall(omnimessage, _callback);
        return localVarCall;

    }

    /**
     * Sends an Omnimessage
     * 
     * @param omnimessage Omnimessage to be sent (required)
     * @return OmniMessageCreateSuccessResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Omnimessage success response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input </td><td>  -  </td></tr>
     </table>
     */
    public OmniMessageCreateSuccessResponse sendOmnimessage(Omnimessage omnimessage) throws ApiException {
        ApiResponse<OmniMessageCreateSuccessResponse> localVarResp = sendOmnimessageWithHttpInfo(omnimessage);
        return localVarResp.getData();
    }

    /**
     * Sends an Omnimessage
     * 
     * @param omnimessage Omnimessage to be sent (required)
     * @return ApiResponse&lt;OmniMessageCreateSuccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Omnimessage success response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OmniMessageCreateSuccessResponse> sendOmnimessageWithHttpInfo(Omnimessage omnimessage) throws ApiException {
        okhttp3.Call localVarCall = sendOmnimessageValidateBeforeCall(omnimessage, null);
        Type localVarReturnType = new TypeToken<OmniMessageCreateSuccessResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Sends an Omnimessage (asynchronously)
     * 
     * @param omnimessage Omnimessage to be sent (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Omnimessage success response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sendOmnimessageAsync(Omnimessage omnimessage, final ApiCallback<OmniMessageCreateSuccessResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = sendOmnimessageValidateBeforeCall(omnimessage, _callback);
        Type localVarReturnType = new TypeToken<OmniMessageCreateSuccessResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

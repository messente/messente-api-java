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


import com.messente.api.BulkOmniMessageCreateSuccessResponse;
import com.messente.api.BulkOmnimessage;
import com.messente.api.ErrorOmnichannel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BulkMessagingApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BulkMessagingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BulkMessagingApi(ApiClient apiClient) {
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
     * Build call for sendBulkOmnimessage
     * @param bulkOmnimessage Bulk Omnimessage to be sent (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Bulk Omnimessage success response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sendBulkOmnimessageCall(BulkOmnimessage bulkOmnimessage, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = bulkOmnimessage;

        // create path and map variables
        String localVarPath = "/omnimessages";

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
    private okhttp3.Call sendBulkOmnimessageValidateBeforeCall(BulkOmnimessage bulkOmnimessage, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'bulkOmnimessage' is set
        if (bulkOmnimessage == null) {
            throw new ApiException("Missing the required parameter 'bulkOmnimessage' when calling sendBulkOmnimessage(Async)");
        }

        return sendBulkOmnimessageCall(bulkOmnimessage, _callback);

    }

    /**
     * Sends a bulk Omnimessage
     * 
     * @param bulkOmnimessage Bulk Omnimessage to be sent (required)
     * @return BulkOmniMessageCreateSuccessResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Bulk Omnimessage success response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public BulkOmniMessageCreateSuccessResponse sendBulkOmnimessage(BulkOmnimessage bulkOmnimessage) throws ApiException {
        ApiResponse<BulkOmniMessageCreateSuccessResponse> localVarResp = sendBulkOmnimessageWithHttpInfo(bulkOmnimessage);
        return localVarResp.getData();
    }

    /**
     * Sends a bulk Omnimessage
     * 
     * @param bulkOmnimessage Bulk Omnimessage to be sent (required)
     * @return ApiResponse&lt;BulkOmniMessageCreateSuccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Bulk Omnimessage success response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BulkOmniMessageCreateSuccessResponse> sendBulkOmnimessageWithHttpInfo(BulkOmnimessage bulkOmnimessage) throws ApiException {
        okhttp3.Call localVarCall = sendBulkOmnimessageValidateBeforeCall(bulkOmnimessage, null);
        Type localVarReturnType = new TypeToken<BulkOmniMessageCreateSuccessResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Sends a bulk Omnimessage (asynchronously)
     * 
     * @param bulkOmnimessage Bulk Omnimessage to be sent (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Bulk Omnimessage success response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sendBulkOmnimessageAsync(BulkOmnimessage bulkOmnimessage, final ApiCallback<BulkOmniMessageCreateSuccessResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = sendBulkOmnimessageValidateBeforeCall(bulkOmnimessage, _callback);
        Type localVarReturnType = new TypeToken<BulkOmniMessageCreateSuccessResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
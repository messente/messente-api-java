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


import com.messente.api.DeliveryReportResponse;
import com.messente.api.ErrorOmnichannel;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class DeliveryReportApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DeliveryReportApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DeliveryReportApi(ApiClient apiClient) {
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
     * Build call for retrieveDeliveryReport
     * @param omnimessageId UUID of the omnimessage to for which the delivery report is to be retrieved (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delivery report success </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> If no such message exists or you do not have access to the particular message </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call retrieveDeliveryReportCall(UUID omnimessageId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/omnimessage/{omnimessageId}/status"
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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call retrieveDeliveryReportValidateBeforeCall(UUID omnimessageId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'omnimessageId' is set
        if (omnimessageId == null) {
            throw new ApiException("Missing the required parameter 'omnimessageId' when calling retrieveDeliveryReport(Async)");
        }
        

        okhttp3.Call localVarCall = retrieveDeliveryReportCall(omnimessageId, _callback);
        return localVarCall;

    }

    /**
     * Retrieves the delivery report for the Omnimessage
     * 
     * @param omnimessageId UUID of the omnimessage to for which the delivery report is to be retrieved (required)
     * @return DeliveryReportResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delivery report success </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> If no such message exists or you do not have access to the particular message </td><td>  -  </td></tr>
     </table>
     */
    public DeliveryReportResponse retrieveDeliveryReport(UUID omnimessageId) throws ApiException {
        ApiResponse<DeliveryReportResponse> localVarResp = retrieveDeliveryReportWithHttpInfo(omnimessageId);
        return localVarResp.getData();
    }

    /**
     * Retrieves the delivery report for the Omnimessage
     * 
     * @param omnimessageId UUID of the omnimessage to for which the delivery report is to be retrieved (required)
     * @return ApiResponse&lt;DeliveryReportResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delivery report success </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> If no such message exists or you do not have access to the particular message </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeliveryReportResponse> retrieveDeliveryReportWithHttpInfo(UUID omnimessageId) throws ApiException {
        okhttp3.Call localVarCall = retrieveDeliveryReportValidateBeforeCall(omnimessageId, null);
        Type localVarReturnType = new TypeToken<DeliveryReportResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieves the delivery report for the Omnimessage (asynchronously)
     * 
     * @param omnimessageId UUID of the omnimessage to for which the delivery report is to be retrieved (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delivery report success </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> If no such message exists or you do not have access to the particular message </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call retrieveDeliveryReportAsync(UUID omnimessageId, final ApiCallback<DeliveryReportResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = retrieveDeliveryReportValidateBeforeCall(omnimessageId, _callback);
        Type localVarReturnType = new TypeToken<DeliveryReportResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

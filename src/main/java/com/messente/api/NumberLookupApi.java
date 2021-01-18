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


import com.messente.api.ErrorNumberLookup;
import com.messente.api.NumbersToInvestigate;
import com.messente.api.SyncNumberLookupSuccess;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberLookupApi {
    private ApiClient localVarApiClient;

    public NumberLookupApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NumberLookupApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for fetchInfo
     * @param numbersToInvestigate Numbers for lookup (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Info about phone numbers returned </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Failed crediting </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call fetchInfoCall(NumbersToInvestigate numbersToInvestigate, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = numbersToInvestigate;

        // create path and map variables
        String localVarPath = "/hlr/sync";

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
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call fetchInfoValidateBeforeCall(NumbersToInvestigate numbersToInvestigate, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'numbersToInvestigate' is set
        if (numbersToInvestigate == null) {
            throw new ApiException("Missing the required parameter 'numbersToInvestigate' when calling fetchInfo(Async)");
        }
        

        okhttp3.Call localVarCall = fetchInfoCall(numbersToInvestigate, _callback);
        return localVarCall;

    }

    /**
     * Requests info about phone numbers
     * 
     * @param numbersToInvestigate Numbers for lookup (required)
     * @return SyncNumberLookupSuccess
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Info about phone numbers returned </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Failed crediting </td><td>  -  </td></tr>
     </table>
     */
    public SyncNumberLookupSuccess fetchInfo(NumbersToInvestigate numbersToInvestigate) throws ApiException {
        ApiResponse<SyncNumberLookupSuccess> localVarResp = fetchInfoWithHttpInfo(numbersToInvestigate);
        return localVarResp.getData();
    }

    /**
     * Requests info about phone numbers
     * 
     * @param numbersToInvestigate Numbers for lookup (required)
     * @return ApiResponse&lt;SyncNumberLookupSuccess&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Info about phone numbers returned </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Failed crediting </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SyncNumberLookupSuccess> fetchInfoWithHttpInfo(NumbersToInvestigate numbersToInvestigate) throws ApiException {
        okhttp3.Call localVarCall = fetchInfoValidateBeforeCall(numbersToInvestigate, null);
        Type localVarReturnType = new TypeToken<SyncNumberLookupSuccess>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Requests info about phone numbers (asynchronously)
     * 
     * @param numbersToInvestigate Numbers for lookup (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Info about phone numbers returned </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Failed crediting </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call fetchInfoAsync(NumbersToInvestigate numbersToInvestigate, final ApiCallback<SyncNumberLookupSuccess> _callback) throws ApiException {

        okhttp3.Call localVarCall = fetchInfoValidateBeforeCall(numbersToInvestigate, _callback);
        Type localVarReturnType = new TypeToken<SyncNumberLookupSuccess>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

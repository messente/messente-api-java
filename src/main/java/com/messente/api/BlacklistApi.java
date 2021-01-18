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


import com.messente.api.ErrorPhonebook;
import com.messente.api.FetchBlacklistSuccess;
import com.messente.api.NumberToBlacklist;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BlacklistApi {
    private ApiClient localVarApiClient;

    public BlacklistApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BlacklistApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for addToBlacklist
     * @param numberToBlacklist Phone number to be blacklisted (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Phone number added to the blacklist </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid phone number provided </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Phone number already blacklisted </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> General error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addToBlacklistCall(NumberToBlacklist numberToBlacklist, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = numberToBlacklist;

        // create path and map variables
        String localVarPath = "/phonebook/blacklist";

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
    private okhttp3.Call addToBlacklistValidateBeforeCall(NumberToBlacklist numberToBlacklist, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'numberToBlacklist' is set
        if (numberToBlacklist == null) {
            throw new ApiException("Missing the required parameter 'numberToBlacklist' when calling addToBlacklist(Async)");
        }
        

        okhttp3.Call localVarCall = addToBlacklistCall(numberToBlacklist, _callback);
        return localVarCall;

    }

    /**
     * Adds a phone number to the blacklist
     * 
     * @param numberToBlacklist Phone number to be blacklisted (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Phone number added to the blacklist </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid phone number provided </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Phone number already blacklisted </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> General error </td><td>  -  </td></tr>
     </table>
     */
    public void addToBlacklist(NumberToBlacklist numberToBlacklist) throws ApiException {
        addToBlacklistWithHttpInfo(numberToBlacklist);
    }

    /**
     * Adds a phone number to the blacklist
     * 
     * @param numberToBlacklist Phone number to be blacklisted (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Phone number added to the blacklist </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid phone number provided </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Phone number already blacklisted </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> General error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> addToBlacklistWithHttpInfo(NumberToBlacklist numberToBlacklist) throws ApiException {
        okhttp3.Call localVarCall = addToBlacklistValidateBeforeCall(numberToBlacklist, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Adds a phone number to the blacklist (asynchronously)
     * 
     * @param numberToBlacklist Phone number to be blacklisted (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Phone number added to the blacklist </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid phone number provided </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Phone number already blacklisted </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> General error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addToBlacklistAsync(NumberToBlacklist numberToBlacklist, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = addToBlacklistValidateBeforeCall(numberToBlacklist, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteFromBlacklist
     * @param phone A phone number (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Phone number deleted from the blacklist </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid phone number provided </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Phone number is not in the blacklist </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> General error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteFromBlacklistCall(String phone, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/phonebook/blacklist/{phone}"
            .replaceAll("\\{" + "phone" + "\\}", localVarApiClient.escapeString(phone.toString()));

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
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteFromBlacklistValidateBeforeCall(String phone, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'phone' is set
        if (phone == null) {
            throw new ApiException("Missing the required parameter 'phone' when calling deleteFromBlacklist(Async)");
        }
        

        okhttp3.Call localVarCall = deleteFromBlacklistCall(phone, _callback);
        return localVarCall;

    }

    /**
     * Deletes a phone number from the blacklist
     * 
     * @param phone A phone number (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Phone number deleted from the blacklist </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid phone number provided </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Phone number is not in the blacklist </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> General error </td><td>  -  </td></tr>
     </table>
     */
    public void deleteFromBlacklist(String phone) throws ApiException {
        deleteFromBlacklistWithHttpInfo(phone);
    }

    /**
     * Deletes a phone number from the blacklist
     * 
     * @param phone A phone number (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Phone number deleted from the blacklist </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid phone number provided </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Phone number is not in the blacklist </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> General error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteFromBlacklistWithHttpInfo(String phone) throws ApiException {
        okhttp3.Call localVarCall = deleteFromBlacklistValidateBeforeCall(phone, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Deletes a phone number from the blacklist (asynchronously)
     * 
     * @param phone A phone number (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Phone number deleted from the blacklist </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid phone number provided </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Phone number is not in the blacklist </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> General error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteFromBlacklistAsync(String phone, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteFromBlacklistValidateBeforeCall(phone, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for fetchBlacklist
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> An object containing a list of blacklisted phone numbers </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> General error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call fetchBlacklistCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/phonebook/blacklist";

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
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call fetchBlacklistValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = fetchBlacklistCall(_callback);
        return localVarCall;

    }

    /**
     * Returns all blacklisted phone numbers
     * 
     * @return FetchBlacklistSuccess
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> An object containing a list of blacklisted phone numbers </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> General error </td><td>  -  </td></tr>
     </table>
     */
    public FetchBlacklistSuccess fetchBlacklist() throws ApiException {
        ApiResponse<FetchBlacklistSuccess> localVarResp = fetchBlacklistWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Returns all blacklisted phone numbers
     * 
     * @return ApiResponse&lt;FetchBlacklistSuccess&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> An object containing a list of blacklisted phone numbers </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> General error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FetchBlacklistSuccess> fetchBlacklistWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = fetchBlacklistValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<FetchBlacklistSuccess>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns all blacklisted phone numbers (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> An object containing a list of blacklisted phone numbers </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> General error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call fetchBlacklistAsync(final ApiCallback<FetchBlacklistSuccess> _callback) throws ApiException {

        okhttp3.Call localVarCall = fetchBlacklistValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<FetchBlacklistSuccess>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for isBlacklisted
     * @param phone A phone number (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Phone number is in the blacklist </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid phone number provided </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Phone number is not in the blacklist </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call isBlacklistedCall(String phone, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/phonebook/blacklist/{phone}"
            .replaceAll("\\{" + "phone" + "\\}", localVarApiClient.escapeString(phone.toString()));

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
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call isBlacklistedValidateBeforeCall(String phone, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'phone' is set
        if (phone == null) {
            throw new ApiException("Missing the required parameter 'phone' when calling isBlacklisted(Async)");
        }
        

        okhttp3.Call localVarCall = isBlacklistedCall(phone, _callback);
        return localVarCall;

    }

    /**
     * Checks if a phone number is blacklisted
     * 
     * @param phone A phone number (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Phone number is in the blacklist </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid phone number provided </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Phone number is not in the blacklist </td><td>  -  </td></tr>
     </table>
     */
    public void isBlacklisted(String phone) throws ApiException {
        isBlacklistedWithHttpInfo(phone);
    }

    /**
     * Checks if a phone number is blacklisted
     * 
     * @param phone A phone number (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Phone number is in the blacklist </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid phone number provided </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Phone number is not in the blacklist </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> isBlacklistedWithHttpInfo(String phone) throws ApiException {
        okhttp3.Call localVarCall = isBlacklistedValidateBeforeCall(phone, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Checks if a phone number is blacklisted (asynchronously)
     * 
     * @param phone A phone number (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Phone number is in the blacklist </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid phone number provided </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Phone number is not in the blacklist </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call isBlacklistedAsync(String phone, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = isBlacklistedValidateBeforeCall(phone, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}

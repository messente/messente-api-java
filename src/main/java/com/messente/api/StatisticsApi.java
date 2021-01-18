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


import com.messente.api.ErrorStatistics;
import com.messente.api.StatisticsReportSettings;
import com.messente.api.StatisticsReportSuccess;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatisticsApi {
    private ApiClient localVarApiClient;

    public StatisticsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StatisticsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createStatisticsReport
     * @param statisticsReportSettings Settings for statistics report (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Created reports by countries </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Client Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Invalid data </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createStatisticsReportCall(StatisticsReportSettings statisticsReportSettings, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = statisticsReportSettings;

        // create path and map variables
        String localVarPath = "/statistics/reports";

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
    private okhttp3.Call createStatisticsReportValidateBeforeCall(StatisticsReportSettings statisticsReportSettings, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'statisticsReportSettings' is set
        if (statisticsReportSettings == null) {
            throw new ApiException("Missing the required parameter 'statisticsReportSettings' when calling createStatisticsReport(Async)");
        }
        

        okhttp3.Call localVarCall = createStatisticsReportCall(statisticsReportSettings, _callback);
        return localVarCall;

    }

    /**
     * Requests statistics reports for each country
     * 
     * @param statisticsReportSettings Settings for statistics report (required)
     * @return StatisticsReportSuccess
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Created reports by countries </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Client Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Invalid data </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public StatisticsReportSuccess createStatisticsReport(StatisticsReportSettings statisticsReportSettings) throws ApiException {
        ApiResponse<StatisticsReportSuccess> localVarResp = createStatisticsReportWithHttpInfo(statisticsReportSettings);
        return localVarResp.getData();
    }

    /**
     * Requests statistics reports for each country
     * 
     * @param statisticsReportSettings Settings for statistics report (required)
     * @return ApiResponse&lt;StatisticsReportSuccess&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Created reports by countries </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Client Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Invalid data </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StatisticsReportSuccess> createStatisticsReportWithHttpInfo(StatisticsReportSettings statisticsReportSettings) throws ApiException {
        okhttp3.Call localVarCall = createStatisticsReportValidateBeforeCall(statisticsReportSettings, null);
        Type localVarReturnType = new TypeToken<StatisticsReportSuccess>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Requests statistics reports for each country (asynchronously)
     * 
     * @param statisticsReportSettings Settings for statistics report (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Created reports by countries </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Client Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Invalid data </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createStatisticsReportAsync(StatisticsReportSettings statisticsReportSettings, final ApiCallback<StatisticsReportSuccess> _callback) throws ApiException {

        okhttp3.Call localVarCall = createStatisticsReportValidateBeforeCall(statisticsReportSettings, _callback);
        Type localVarReturnType = new TypeToken<StatisticsReportSuccess>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

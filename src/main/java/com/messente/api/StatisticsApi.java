/*
 * Messente API
 * [Messente](https://messente.com) is a global provider of messaging and user verification services.  * Send and receive SMS, Viber, WhatsApp and Telegram messages. * Manage contacts and groups. * Fetch detailed info about phone numbers. * Blacklist phone numbers to make sure you're not sending any unwanted messages.  Messente builds [tools](https://messente.com/documentation) to help organizations connect their services to people anywhere in the world.
 *
 * OpenAPI spec version: 1.2.0
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
    private ApiClient apiClient;

    public StatisticsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StatisticsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createStatisticsReport
     * @param statisticsReportSettings Settings for statistics report (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createStatisticsReportCall(StatisticsReportSettings statisticsReportSettings, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = statisticsReportSettings;

        // create path and map variables
        String localVarPath = "/statistics/reports";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createStatisticsReportValidateBeforeCall(StatisticsReportSettings statisticsReportSettings, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'statisticsReportSettings' is set
        if (statisticsReportSettings == null) {
            throw new ApiException("Missing the required parameter 'statisticsReportSettings' when calling createStatisticsReport(Async)");
        }
        

        com.squareup.okhttp.Call call = createStatisticsReportCall(statisticsReportSettings, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Requests statistics reports for each country
     * 
     * @param statisticsReportSettings Settings for statistics report (required)
     * @return StatisticsReportSuccess
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public StatisticsReportSuccess createStatisticsReport(StatisticsReportSettings statisticsReportSettings) throws ApiException {
        ApiResponse<StatisticsReportSuccess> resp = createStatisticsReportWithHttpInfo(statisticsReportSettings);
        return resp.getData();
    }

    /**
     * Requests statistics reports for each country
     * 
     * @param statisticsReportSettings Settings for statistics report (required)
     * @return ApiResponse&lt;StatisticsReportSuccess&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<StatisticsReportSuccess> createStatisticsReportWithHttpInfo(StatisticsReportSettings statisticsReportSettings) throws ApiException {
        com.squareup.okhttp.Call call = createStatisticsReportValidateBeforeCall(statisticsReportSettings, null, null);
        Type localVarReturnType = new TypeToken<StatisticsReportSuccess>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Requests statistics reports for each country (asynchronously)
     * 
     * @param statisticsReportSettings Settings for statistics report (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createStatisticsReportAsync(StatisticsReportSettings statisticsReportSettings, final ApiCallback<StatisticsReportSuccess> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createStatisticsReportValidateBeforeCall(statisticsReportSettings, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<StatisticsReportSuccess>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

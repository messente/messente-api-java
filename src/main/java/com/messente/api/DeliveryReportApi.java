/*
 * Messente API
 * [Messente](https://messente.com) is a global provider of messaging and user verification services. Use Messente API library to send and receive SMS, Viber and WhatsApp messages, blacklist phone numbers to make sure you're not sending any unwanted messages, manage contacts and groups.  Messente builds [tools](https://messente.com/documentation) to help organizations connect their services to people anywhere in the world.
 *
 * OpenAPI spec version: 0.0.1
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

public class DeliveryReportApi {
    private ApiClient apiClient;

    public DeliveryReportApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DeliveryReportApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for retrieveDeliveryReport
     * @param omnimessageId UUID of the Omnimessage to for which the delivery report is to be retrieved (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call retrieveDeliveryReportCall(UUID omnimessageId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/omnimessage/{omnimessageId}/status"
            .replaceAll("\\{" + "omnimessageId" + "\\}", apiClient.escapeString(omnimessageId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.setHttpClient(apiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            }).build());
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call retrieveDeliveryReportValidateBeforeCall(UUID omnimessageId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'omnimessageId' is set
        if (omnimessageId == null) {
            throw new ApiException("Missing the required parameter 'omnimessageId' when calling retrieveDeliveryReport(Async)");
        }
        

        okhttp3.Call call = retrieveDeliveryReportCall(omnimessageId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves the delivery report for the Omnimessage
     * 
     * @param omnimessageId UUID of the Omnimessage to for which the delivery report is to be retrieved (required)
     * @return DeliveryReportResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeliveryReportResponse retrieveDeliveryReport(UUID omnimessageId) throws ApiException {
        ApiResponse<DeliveryReportResponse> resp = retrieveDeliveryReportWithHttpInfo(omnimessageId);
        return resp.getData();
    }

    /**
     * Retrieves the delivery report for the Omnimessage
     * 
     * @param omnimessageId UUID of the Omnimessage to for which the delivery report is to be retrieved (required)
     * @return ApiResponse&lt;DeliveryReportResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeliveryReportResponse> retrieveDeliveryReportWithHttpInfo(UUID omnimessageId) throws ApiException {
        okhttp3.Call call = retrieveDeliveryReportValidateBeforeCall(omnimessageId, null, null);
        Type localVarReturnType = new TypeToken<DeliveryReportResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves the delivery report for the Omnimessage (asynchronously)
     * 
     * @param omnimessageId UUID of the Omnimessage to for which the delivery report is to be retrieved (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call retrieveDeliveryReportAsync(UUID omnimessageId, final ApiCallback<DeliveryReportResponse> callback) throws ApiException {

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

        okhttp3.Call call = retrieveDeliveryReportValidateBeforeCall(omnimessageId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeliveryReportResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

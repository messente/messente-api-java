/*
 * Messente API
 * [Messente](https://messente.com) is a global provider of messaging and user verification services.  * Send and receive SMS, Viber, WhatsApp and Telegram messages. * Manage contacts and groups. * Fetch detailed info about phone numbers. * Blacklist phone numbers to make sure you're not sending any unwanted messages.  Messente builds [tools](https://messente.com/documentation) to help organizations connect their services to people anywhere in the world.
 *
 * OpenAPI spec version: 1.4.0
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


import com.messente.api.EmptyObject;
import com.messente.api.ErrorOmnichannel;
import com.messente.api.OmniMessageCreateSuccessResponse;
import com.messente.api.Omnimessage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OmnimessageApi {
    private ApiClient apiClient;

    public OmnimessageApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OmnimessageApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for cancelScheduledMessage
     * @param omnimessageId UUID of the scheduled omnimessage to be cancelled (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cancelScheduledMessageCall(String omnimessageId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/omnimessage/{omnimessageId}"
            .replaceAll("\\{" + "omnimessageId" + "\\}", apiClient.escapeString(omnimessageId.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call cancelScheduledMessageValidateBeforeCall(String omnimessageId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'omnimessageId' is set
        if (omnimessageId == null) {
            throw new ApiException("Missing the required parameter 'omnimessageId' when calling cancelScheduledMessage(Async)");
        }
        

        com.squareup.okhttp.Call call = cancelScheduledMessageCall(omnimessageId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Cancels a scheduled Omnimessage
     * 
     * @param omnimessageId UUID of the scheduled omnimessage to be cancelled (required)
     * @return EmptyObject
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EmptyObject cancelScheduledMessage(String omnimessageId) throws ApiException {
        ApiResponse<EmptyObject> resp = cancelScheduledMessageWithHttpInfo(omnimessageId);
        return resp.getData();
    }

    /**
     * Cancels a scheduled Omnimessage
     * 
     * @param omnimessageId UUID of the scheduled omnimessage to be cancelled (required)
     * @return ApiResponse&lt;EmptyObject&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EmptyObject> cancelScheduledMessageWithHttpInfo(String omnimessageId) throws ApiException {
        com.squareup.okhttp.Call call = cancelScheduledMessageValidateBeforeCall(omnimessageId, null, null);
        Type localVarReturnType = new TypeToken<EmptyObject>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Cancels a scheduled Omnimessage (asynchronously)
     * 
     * @param omnimessageId UUID of the scheduled omnimessage to be cancelled (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cancelScheduledMessageAsync(String omnimessageId, final ApiCallback<EmptyObject> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cancelScheduledMessageValidateBeforeCall(omnimessageId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EmptyObject>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for sendOmnimessage
     * @param omnimessage Omnimessage to be sent (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call sendOmnimessageCall(Omnimessage omnimessage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = omnimessage;

        // create path and map variables
        String localVarPath = "/omnimessage";

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
    private com.squareup.okhttp.Call sendOmnimessageValidateBeforeCall(Omnimessage omnimessage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'omnimessage' is set
        if (omnimessage == null) {
            throw new ApiException("Missing the required parameter 'omnimessage' when calling sendOmnimessage(Async)");
        }
        

        com.squareup.okhttp.Call call = sendOmnimessageCall(omnimessage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Sends an Omnimessage
     * 
     * @param omnimessage Omnimessage to be sent (required)
     * @return OmniMessageCreateSuccessResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OmniMessageCreateSuccessResponse sendOmnimessage(Omnimessage omnimessage) throws ApiException {
        ApiResponse<OmniMessageCreateSuccessResponse> resp = sendOmnimessageWithHttpInfo(omnimessage);
        return resp.getData();
    }

    /**
     * Sends an Omnimessage
     * 
     * @param omnimessage Omnimessage to be sent (required)
     * @return ApiResponse&lt;OmniMessageCreateSuccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OmniMessageCreateSuccessResponse> sendOmnimessageWithHttpInfo(Omnimessage omnimessage) throws ApiException {
        com.squareup.okhttp.Call call = sendOmnimessageValidateBeforeCall(omnimessage, null, null);
        Type localVarReturnType = new TypeToken<OmniMessageCreateSuccessResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Sends an Omnimessage (asynchronously)
     * 
     * @param omnimessage Omnimessage to be sent (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call sendOmnimessageAsync(Omnimessage omnimessage, final ApiCallback<OmniMessageCreateSuccessResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = sendOmnimessageValidateBeforeCall(omnimessage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OmniMessageCreateSuccessResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

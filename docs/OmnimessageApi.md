# OmnimessageApi

All URIs are relative to *https://api.messente.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelScheduledMessage**](OmnimessageApi.md#cancelScheduledMessage) | **DELETE** /omnimessage/{omnimessageId} | Cancels a scheduled Omnimessage
[**sendOmnimessage**](OmnimessageApi.md#sendOmnimessage) | **POST** /omnimessage | Sends an Omnimessage


<a name="cancelScheduledMessage"></a>
# **cancelScheduledMessage**
> cancelScheduledMessage(omnimessageId)

Cancels a scheduled Omnimessage

### Example
```java
// Import classes:
//import com.messente.ApiClient;
//import com.messente.ApiException;
//import com.messente.Configuration;
//import com.messente.auth.*;
//import com.messente.api.OmnimessageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

OmnimessageApi apiInstance = new OmnimessageApi();
String omnimessageId = "omnimessageId_example"; // String | UUID of the scheduled omnimessage to be cancelled
try {
    apiInstance.cancelScheduledMessage(omnimessageId);
} catch (ApiException e) {
    System.err.println("Exception when calling OmnimessageApi#cancelScheduledMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **omnimessageId** | **String**| UUID of the scheduled omnimessage to be cancelled |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sendOmnimessage"></a>
# **sendOmnimessage**
> OmniMessageCreateSuccessResponse sendOmnimessage(omnimessage)

Sends an Omnimessage

### Example
```java
// Import classes:
//import com.messente.ApiClient;
//import com.messente.ApiException;
//import com.messente.Configuration;
//import com.messente.auth.*;
//import com.messente.api.OmnimessageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

OmnimessageApi apiInstance = new OmnimessageApi();
Omnimessage omnimessage = new Omnimessage(); // Omnimessage | Omnimessage to be sent
try {
    OmniMessageCreateSuccessResponse result = apiInstance.sendOmnimessage(omnimessage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OmnimessageApi#sendOmnimessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **omnimessage** | [**Omnimessage**](Omnimessage.md)| Omnimessage to be sent |

### Return type

[**OmniMessageCreateSuccessResponse**](OmniMessageCreateSuccessResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


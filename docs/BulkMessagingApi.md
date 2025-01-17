# BulkMessagingApi

All URIs are relative to *https://api.messente.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sendBulkOmnimessage**](BulkMessagingApi.md#sendBulkOmnimessage) | **POST** /omnimessages | Sends a bulk Omnimessage |


<a id="sendBulkOmnimessage"></a>
# **sendBulkOmnimessage**
> BulkOmniMessageCreateSuccessResponse sendBulkOmnimessage(bulkOmnimessage)

Sends a bulk Omnimessage

### Example
```java
// Import classes:
import com.messente.ApiClient;
import com.messente.ApiException;
import com.messente.Configuration;
import com.messente.auth.*;
import com.messente.models.*;
import com.messente.api.BulkMessagingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.messente.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BulkMessagingApi apiInstance = new BulkMessagingApi(defaultClient);
    BulkOmnimessage bulkOmnimessage = new BulkOmnimessage(); // BulkOmnimessage | Bulk Omnimessage to be sent
    try {
      BulkOmniMessageCreateSuccessResponse result = apiInstance.sendBulkOmnimessage(bulkOmnimessage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkMessagingApi#sendBulkOmnimessage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bulkOmnimessage** | [**BulkOmnimessage**](BulkOmnimessage.md)| Bulk Omnimessage to be sent | |

### Return type

[**BulkOmniMessageCreateSuccessResponse**](BulkOmniMessageCreateSuccessResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Bulk Omnimessage success response |  -  |
| **400** | Invalid input |  -  |
| **401** | Unauthorized |  -  |


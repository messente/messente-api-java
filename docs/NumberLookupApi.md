# NumberLookupApi

All URIs are relative to *https://api.messente.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fetchInfo**](NumberLookupApi.md#fetchInfo) | **POST** /hlr/sync | Requests info about phone numbers |


<a id="fetchInfo"></a>
# **fetchInfo**
> SyncNumberLookupSuccess fetchInfo(numbersToInvestigate)

Requests info about phone numbers

### Example
```java
// Import classes:
import com.messente.ApiClient;
import com.messente.ApiException;
import com.messente.Configuration;
import com.messente.auth.*;
import com.messente.models.*;
import com.messente.api.NumberLookupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.messente.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    NumberLookupApi apiInstance = new NumberLookupApi(defaultClient);
    NumbersToInvestigate numbersToInvestigate = new NumbersToInvestigate(); // NumbersToInvestigate | Numbers for lookup
    try {
      SyncNumberLookupSuccess result = apiInstance.fetchInfo(numbersToInvestigate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NumberLookupApi#fetchInfo");
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
| **numbersToInvestigate** | [**NumbersToInvestigate**](NumbersToInvestigate.md)| Numbers for lookup | |

### Return type

[**SyncNumberLookupSuccess**](SyncNumberLookupSuccess.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Info about phone numbers returned |  -  |
| **400** | Invalid request |  -  |
| **401** | Unauthorized |  -  |
| **402** | Failed crediting |  -  |


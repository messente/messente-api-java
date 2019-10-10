# NumberLookupApi

All URIs are relative to *https://api.messente.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**syncNumberLookup**](NumberLookupApi.md#syncNumberLookup) | **POST** /hlr/sync | Requests info about a phone number


<a name="syncNumberLookup"></a>
# **syncNumberLookup**
> SyncNumberLookupSuccess syncNumberLookup(syncNumberLookup)

Requests info about a phone number

### Example
```java
// Import classes:
//import com.messente.ApiClient;
//import com.messente.ApiException;
//import com.messente.Configuration;
//import com.messente.auth.*;
//import com.messente.api.NumberLookupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NumberLookupApi apiInstance = new NumberLookupApi();
SyncNumberLookup syncNumberLookup = {"numbers":["+37251000000","+37251000001"]}; // SyncNumberLookup | Numbers to lookup
try {
    SyncNumberLookupSuccess result = apiInstance.syncNumberLookup(syncNumberLookup);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberLookupApi#syncNumberLookup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **syncNumberLookup** | [**SyncNumberLookup**](SyncNumberLookup.md)| Numbers to lookup |

### Return type

[**SyncNumberLookupSuccess**](SyncNumberLookupSuccess.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


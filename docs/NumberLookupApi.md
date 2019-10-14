# NumberLookupApi

All URIs are relative to *https://api.messente.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchInfo**](NumberLookupApi.md#fetchInfo) | **POST** /hlr/sync | Requests info about phone numbers


<a name="fetchInfo"></a>
# **fetchInfo**
> SyncNumberLookupSuccess fetchInfo(numbersToInvestigate)

Requests info about phone numbers

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
NumbersToInvestigate numbersToInvestigate = {"numbers":["+37251000000","+37251000001"]}; // NumbersToInvestigate | Numbers for lookup
try {
    SyncNumberLookupSuccess result = apiInstance.fetchInfo(numbersToInvestigate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberLookupApi#fetchInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **numbersToInvestigate** | [**NumbersToInvestigate**](NumbersToInvestigate.md)| Numbers for lookup |

### Return type

[**SyncNumberLookupSuccess**](SyncNumberLookupSuccess.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


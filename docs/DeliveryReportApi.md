# DeliveryReportApi

All URIs are relative to *https://api.messente.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveDeliveryReport**](DeliveryReportApi.md#retrieveDeliveryReport) | **GET** /omnimessage/{omnimessageId}/status | Retrieves the delivery report for the Omnimessage


<a name="retrieveDeliveryReport"></a>
# **retrieveDeliveryReport**
> DeliveryReportResponse retrieveDeliveryReport(omnimessageId)

Retrieves the delivery report for the Omnimessage

### Example
```java
// Import classes:
//import com.messente.ApiClient;
//import com.messente.ApiException;
//import com.messente.Configuration;
//import com.messente.auth.*;
//import com.messente.api.DeliveryReportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DeliveryReportApi apiInstance = new DeliveryReportApi();
String omnimessageId = "omnimessageId_example"; // String | UUID of the omnimessage to for which the delivery report is to be retrieved
try {
    DeliveryReportResponse result = apiInstance.retrieveDeliveryReport(omnimessageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryReportApi#retrieveDeliveryReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **omnimessageId** | **String**| UUID of the omnimessage to for which the delivery report is to be retrieved |

### Return type

[**DeliveryReportResponse**](DeliveryReportResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


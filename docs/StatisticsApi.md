# StatisticsApi

All URIs are relative to *https://api.messente.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createStatisticsReport**](StatisticsApi.md#createStatisticsReport) | **POST** /statistics/reports | Requests statistics reports for each country


<a name="createStatisticsReport"></a>
# **createStatisticsReport**
> StatisticsReportSuccess createStatisticsReport(statisticsReportSettings)

Requests statistics reports for each country

### Example
```java
// Import classes:
//import com.messente.ApiClient;
//import com.messente.ApiException;
//import com.messente.Configuration;
//import com.messente.auth.*;
//import com.messente.api.StatisticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StatisticsApi apiInstance = new StatisticsApi();
StatisticsReportSettings statisticsReportSettings = {"start_date":"2017-01-01","end_date":"2019-06-20","message_types":["sms"]}; // StatisticsReportSettings | Settings for statistics report
try {
    StatisticsReportSuccess result = apiInstance.createStatisticsReport(statisticsReportSettings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatisticsApi#createStatisticsReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statisticsReportSettings** | [**StatisticsReportSettings**](StatisticsReportSettings.md)| Settings for statistics report |

### Return type

[**StatisticsReportSuccess**](StatisticsReportSuccess.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


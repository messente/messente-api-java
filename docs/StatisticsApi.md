# StatisticsApi

All URIs are relative to *https://api.messente.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createStatisticsReport**](StatisticsApi.md#createStatisticsReport) | **POST** /statistics/reports | Requests statistics reports for each country |


<a id="createStatisticsReport"></a>
# **createStatisticsReport**
> StatisticsReportSuccess createStatisticsReport(statisticsReportSettings)

Requests statistics reports for each country

### Example
```java
// Import classes:
import com.messente.ApiClient;
import com.messente.ApiException;
import com.messente.Configuration;
import com.messente.auth.*;
import com.messente.models.*;
import com.messente.api.StatisticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.messente.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    StatisticsApi apiInstance = new StatisticsApi(defaultClient);
    StatisticsReportSettings statisticsReportSettings = new StatisticsReportSettings(); // StatisticsReportSettings | Settings for statistics report
    try {
      StatisticsReportSuccess result = apiInstance.createStatisticsReport(statisticsReportSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#createStatisticsReport");
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
| **statisticsReportSettings** | [**StatisticsReportSettings**](StatisticsReportSettings.md)| Settings for statistics report | |

### Return type

[**StatisticsReportSuccess**](StatisticsReportSuccess.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Created reports by countries |  -  |
| **400** | Client Error |  -  |
| **401** | Unauthorized |  -  |
| **422** | Invalid data |  -  |
| **500** | Internal Server Error |  -  |


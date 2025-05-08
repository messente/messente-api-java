# PricingApi

All URIs are relative to *https://api.messente.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPricelist**](PricingApi.md#getPricelist) | **GET** /pricelist | Get pricelist for account |
| [**getPrices**](PricingApi.md#getPrices) | **GET** /prices | Get pricing for a specific country |


<a id="getPricelist"></a>
# **getPricelist**
> String getPricelist(username, password)

Get pricelist for account

### Example
```java
// Import classes:
import com.messente.ApiClient;
import com.messente.ApiException;
import com.messente.Configuration;
import com.messente.auth.*;
import com.messente.models.*;
import com.messente.api.PricingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.messente.com/v1");
    
    // Configure API key authorization: apiPassword
    ApiKeyAuth apiPassword = (ApiKeyAuth) defaultClient.getAuthentication("apiPassword");
    apiPassword.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiPassword.setApiKeyPrefix("Token");

    // Configure API key authorization: apiUsername
    ApiKeyAuth apiUsername = (ApiKeyAuth) defaultClient.getAuthentication("apiUsername");
    apiUsername.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiUsername.setApiKeyPrefix("Token");

    PricingApi apiInstance = new PricingApi(defaultClient);
    String username = "username_example"; // String | The API username
    String password = "password_example"; // String | The API password
    try {
      String result = apiInstance.getPricelist(username, password);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricingApi#getPricelist");
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
| **username** | **String**| The API username | |
| **password** | **String**| The API password | |

### Return type

**String**

### Authorization

[apiPassword](../README.md#apiPassword), [apiUsername](../README.md#apiUsername)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Both errors and success responses are returned as plain text with HTTP status 200. Unsuccessful responses contain the error code, while successful ones contain the pricelist in CSV format.  |  -  |

<a id="getPrices"></a>
# **getPrices**
> Price getPrices(username, password, country, format)

Get pricing for a specific country

### Example
```java
// Import classes:
import com.messente.ApiClient;
import com.messente.ApiException;
import com.messente.Configuration;
import com.messente.auth.*;
import com.messente.models.*;
import com.messente.api.PricingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.messente.com/v1");
    
    // Configure API key authorization: apiPassword
    ApiKeyAuth apiPassword = (ApiKeyAuth) defaultClient.getAuthentication("apiPassword");
    apiPassword.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiPassword.setApiKeyPrefix("Token");

    // Configure API key authorization: apiUsername
    ApiKeyAuth apiUsername = (ApiKeyAuth) defaultClient.getAuthentication("apiUsername");
    apiUsername.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiUsername.setApiKeyPrefix("Token");

    PricingApi apiInstance = new PricingApi(defaultClient);
    String username = "username_example"; // String | The API username
    String password = "password_example"; // String | The API password
    String country = "country_example"; // String | The country code, for which to get the prices
    String format = "format_example"; // String | The format of the response. Can be either 'json' or 'xml'. If not specified, defaults to 'json'.
    try {
      Price result = apiInstance.getPrices(username, password, country, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricingApi#getPrices");
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
| **username** | **String**| The API username | |
| **password** | **String**| The API password | |
| **country** | **String**| The country code, for which to get the prices | |
| **format** | **String**| The format of the response. Can be either &#39;json&#39; or &#39;xml&#39;. If not specified, defaults to &#39;json&#39;. | [optional] |

### Return type

[**Price**](Price.md)

### Authorization

[apiPassword](../README.md#apiPassword), [apiUsername](../README.md#apiUsername)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Unsuccessful responses are returned as plain text with an error code, while successful ones contain either JSON or XML depending on the user&#39;s choice. |  -  |


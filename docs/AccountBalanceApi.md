# AccountBalanceApi

All URIs are relative to *https://api.messente.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAccountBalance**](AccountBalanceApi.md#getAccountBalance) | **GET** /get_balance | Get account balance |
| [**getAccountBalanceUsingPost**](AccountBalanceApi.md#getAccountBalanceUsingPost) | **POST** /get_balance | Get account balance |


<a id="getAccountBalance"></a>
# **getAccountBalance**
> String getAccountBalance(username, password)

Get account balance

### Example
```java
// Import classes:
import com.messente.ApiClient;
import com.messente.ApiException;
import com.messente.Configuration;
import com.messente.auth.*;
import com.messente.models.*;
import com.messente.api.AccountBalanceApi;

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

    AccountBalanceApi apiInstance = new AccountBalanceApi(defaultClient);
    String username = "username_example"; // String | The API username
    String password = "password_example"; // String | The API password
    try {
      String result = apiInstance.getAccountBalance(username, password);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountBalanceApi#getAccountBalance");
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
| **200** | Both errors and success responses are returned as plain text with HTTP status 200. |  -  |

<a id="getAccountBalanceUsingPost"></a>
# **getAccountBalanceUsingPost**
> String getAccountBalanceUsingPost(username, password)

Get account balance

### Example
```java
// Import classes:
import com.messente.ApiClient;
import com.messente.ApiException;
import com.messente.Configuration;
import com.messente.auth.*;
import com.messente.models.*;
import com.messente.api.AccountBalanceApi;

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

    AccountBalanceApi apiInstance = new AccountBalanceApi(defaultClient);
    String username = "username_example"; // String | The API username
    String password = "password_example"; // String | The API password
    try {
      String result = apiInstance.getAccountBalanceUsingPost(username, password);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountBalanceApi#getAccountBalanceUsingPost");
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
| **200** | Both errors and success responses are returned as plain text with HTTP status 200. |  -  |


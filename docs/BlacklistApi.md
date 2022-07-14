# BlacklistApi

All URIs are relative to *https://api.messente.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addToBlacklist**](BlacklistApi.md#addToBlacklist) | **POST** /phonebook/blacklist | Adds a phone number to the blacklist |
| [**deleteFromBlacklist**](BlacklistApi.md#deleteFromBlacklist) | **DELETE** /phonebook/blacklist/{phone} | Deletes a phone number from the blacklist |
| [**fetchBlacklist**](BlacklistApi.md#fetchBlacklist) | **GET** /phonebook/blacklist | Returns all blacklisted phone numbers |
| [**isBlacklisted**](BlacklistApi.md#isBlacklisted) | **GET** /phonebook/blacklist/{phone} | Checks if a phone number is blacklisted |


<a name="addToBlacklist"></a>
# **addToBlacklist**
> addToBlacklist(numberToBlacklist)

Adds a phone number to the blacklist

### Example
```java
// Import classes:
import com.messente.ApiClient;
import com.messente.ApiException;
import com.messente.Configuration;
import com.messente.auth.*;
import com.messente.models.*;
import com.messente.api.BlacklistApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.messente.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BlacklistApi apiInstance = new BlacklistApi(defaultClient);
    NumberToBlacklist numberToBlacklist = new NumberToBlacklist(); // NumberToBlacklist | Phone number to be blacklisted
    try {
      apiInstance.addToBlacklist(numberToBlacklist);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlacklistApi#addToBlacklist");
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
| **numberToBlacklist** | [**NumberToBlacklist**](NumberToBlacklist.md)| Phone number to be blacklisted | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Phone number added to the blacklist |  -  |
| **400** | Invalid phone number provided |  -  |
| **401** | Unauthorized |  -  |
| **409** | Phone number already blacklisted |  -  |
| **0** | General error |  -  |

<a name="deleteFromBlacklist"></a>
# **deleteFromBlacklist**
> deleteFromBlacklist(phone)

Deletes a phone number from the blacklist

### Example
```java
// Import classes:
import com.messente.ApiClient;
import com.messente.ApiException;
import com.messente.Configuration;
import com.messente.auth.*;
import com.messente.models.*;
import com.messente.api.BlacklistApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.messente.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BlacklistApi apiInstance = new BlacklistApi(defaultClient);
    String phone = "+37251000000"; // String | A phone number
    try {
      apiInstance.deleteFromBlacklist(phone);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlacklistApi#deleteFromBlacklist");
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
| **phone** | **String**| A phone number | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Phone number deleted from the blacklist |  -  |
| **400** | Invalid phone number provided |  -  |
| **401** | Unauthorized |  -  |
| **404** | Phone number is not in the blacklist |  -  |
| **0** | General error |  -  |

<a name="fetchBlacklist"></a>
# **fetchBlacklist**
> FetchBlacklistSuccess fetchBlacklist()

Returns all blacklisted phone numbers

### Example
```java
// Import classes:
import com.messente.ApiClient;
import com.messente.ApiException;
import com.messente.Configuration;
import com.messente.auth.*;
import com.messente.models.*;
import com.messente.api.BlacklistApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.messente.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BlacklistApi apiInstance = new BlacklistApi(defaultClient);
    try {
      FetchBlacklistSuccess result = apiInstance.fetchBlacklist();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlacklistApi#fetchBlacklist");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FetchBlacklistSuccess**](FetchBlacklistSuccess.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An object containing a list of blacklisted phone numbers |  -  |
| **401** | Unauthorized |  -  |
| **0** | General error |  -  |

<a name="isBlacklisted"></a>
# **isBlacklisted**
> isBlacklisted(phone)

Checks if a phone number is blacklisted

### Example
```java
// Import classes:
import com.messente.ApiClient;
import com.messente.ApiException;
import com.messente.Configuration;
import com.messente.auth.*;
import com.messente.models.*;
import com.messente.api.BlacklistApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.messente.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BlacklistApi apiInstance = new BlacklistApi(defaultClient);
    String phone = "+37251000000"; // String | A phone number
    try {
      apiInstance.isBlacklisted(phone);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlacklistApi#isBlacklisted");
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
| **phone** | **String**| A phone number | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Phone number is in the blacklist |  -  |
| **400** | Invalid phone number provided |  -  |
| **401** | Unauthorized |  -  |
| **404** | Phone number is not in the blacklist |  -  |


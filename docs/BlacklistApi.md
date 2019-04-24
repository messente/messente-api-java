# BlacklistApi

All URIs are relative to *https://api.messente.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addToBlacklist**](BlacklistApi.md#addToBlacklist) | **POST** /phonebook/blacklist | Adds a phone number to the blacklist.
[**deleteFromBlacklist**](BlacklistApi.md#deleteFromBlacklist) | **DELETE** /blacklist/{phone} | Deletes a phone number from the blacklist.
[**fetchBlacklist**](BlacklistApi.md#fetchBlacklist) | **GET** /phonebook/blacklist | Returns all blacklisted phone numbers.
[**isBlacklisted**](BlacklistApi.md#isBlacklisted) | **GET** /blacklist/{phone} | Checks if a phone number is blacklisted.


<a name="addToBlacklist"></a>
# **addToBlacklist**
> addToBlacklist(numberToBlacklist)

Adds a phone number to the blacklist.

### Example
```java
// Import classes:
//import com.messente.ApiClient;
//import com.messente.ApiException;
//import com.messente.Configuration;
//import com.messente.auth.*;
//import com.messente.api.BlacklistApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BlacklistApi apiInstance = new BlacklistApi();
NumberToBlacklist numberToBlacklist = new NumberToBlacklist(); // NumberToBlacklist | Phone number to be blacklisted
try {
    apiInstance.addToBlacklist(numberToBlacklist);
} catch (ApiException e) {
    System.err.println("Exception when calling BlacklistApi#addToBlacklist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **numberToBlacklist** | [**NumberToBlacklist**](NumberToBlacklist.md)| Phone number to be blacklisted |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFromBlacklist"></a>
# **deleteFromBlacklist**
> deleteFromBlacklist(phone)

Deletes a phone number from the blacklist.

### Example
```java
// Import classes:
//import com.messente.ApiClient;
//import com.messente.ApiException;
//import com.messente.Configuration;
//import com.messente.auth.*;
//import com.messente.api.BlacklistApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BlacklistApi apiInstance = new BlacklistApi();
String phone = "phone_example"; // String | A phone number
try {
    apiInstance.deleteFromBlacklist(phone);
} catch (ApiException e) {
    System.err.println("Exception when calling BlacklistApi#deleteFromBlacklist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone** | **String**| A phone number |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchBlacklist"></a>
# **fetchBlacklist**
> FetchBlacklistSuccess fetchBlacklist()

Returns all blacklisted phone numbers.

### Example
```java
// Import classes:
//import com.messente.ApiClient;
//import com.messente.ApiException;
//import com.messente.Configuration;
//import com.messente.auth.*;
//import com.messente.api.BlacklistApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BlacklistApi apiInstance = new BlacklistApi();
try {
    FetchBlacklistSuccess result = apiInstance.fetchBlacklist();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlacklistApi#fetchBlacklist");
    e.printStackTrace();
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

<a name="isBlacklisted"></a>
# **isBlacklisted**
> isBlacklisted(phone)

Checks if a phone number is blacklisted.

### Example
```java
// Import classes:
//import com.messente.ApiClient;
//import com.messente.ApiException;
//import com.messente.Configuration;
//import com.messente.auth.*;
//import com.messente.api.BlacklistApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BlacklistApi apiInstance = new BlacklistApi();
String phone = "phone_example"; // String | A phone number
try {
    apiInstance.isBlacklisted(phone);
} catch (ApiException e) {
    System.err.println("Exception when calling BlacklistApi#isBlacklisted");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone** | **String**| A phone number |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


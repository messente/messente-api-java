# GroupsApi

All URIs are relative to *https://api.messente.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGroup**](GroupsApi.md#createGroup) | **POST** /groups | Creates a new group with the provided name
[**deleteGroup**](GroupsApi.md#deleteGroup) | **DELETE** /groups/{groupId} | Deletes a group
[**fetchGroup**](GroupsApi.md#fetchGroup) | **GET** /groups/{groupId} | Lists a group
[**fetchGroups**](GroupsApi.md#fetchGroups) | **GET** /groups | Returns all groups
[**updateGroup**](GroupsApi.md#updateGroup) | **PUT** /groups/{groupId} | Updates a group with the provided name


<a name="createGroup"></a>
# **createGroup**
> GroupEnvelope createGroup(groupName)

Creates a new group with the provided name

### Example
```java
// Import classes:
//import com.messente.ApiClient;
//import com.messente.ApiException;
//import com.messente.Configuration;
//import com.messente.auth.*;
//import com.messente.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

GroupsApi apiInstance = new GroupsApi();
GroupName groupName = new GroupName(); // GroupName | 
try {
    GroupEnvelope result = apiInstance.createGroup(groupName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#createGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupName** | [**GroupName**](GroupName.md)|  |

### Return type

[**GroupEnvelope**](GroupEnvelope.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteGroup"></a>
# **deleteGroup**
> deleteGroup(groupId)

Deletes a group

### Example
```java
// Import classes:
//import com.messente.ApiClient;
//import com.messente.ApiException;
//import com.messente.Configuration;
//import com.messente.auth.*;
//import com.messente.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

GroupsApi apiInstance = new GroupsApi();
String groupId = "groupId_example"; // String | String in UUID format
try {
    apiInstance.deleteGroup(groupId);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#deleteGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| String in UUID format |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchGroup"></a>
# **fetchGroup**
> GroupEnvelope fetchGroup(groupId)

Lists a group

### Example
```java
// Import classes:
//import com.messente.ApiClient;
//import com.messente.ApiException;
//import com.messente.Configuration;
//import com.messente.auth.*;
//import com.messente.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

GroupsApi apiInstance = new GroupsApi();
String groupId = "groupId_example"; // String | String in UUID format
try {
    GroupEnvelope result = apiInstance.fetchGroup(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#fetchGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| String in UUID format |

### Return type

[**GroupEnvelope**](GroupEnvelope.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchGroups"></a>
# **fetchGroups**
> GroupListEnvelope fetchGroups()

Returns all groups

### Example
```java
// Import classes:
//import com.messente.ApiClient;
//import com.messente.ApiException;
//import com.messente.Configuration;
//import com.messente.auth.*;
//import com.messente.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

GroupsApi apiInstance = new GroupsApi();
try {
    GroupListEnvelope result = apiInstance.fetchGroups();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#fetchGroups");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GroupListEnvelope**](GroupListEnvelope.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateGroup"></a>
# **updateGroup**
> GroupEnvelope updateGroup(groupId, groupName)

Updates a group with the provided name

### Example
```java
// Import classes:
//import com.messente.ApiClient;
//import com.messente.ApiException;
//import com.messente.Configuration;
//import com.messente.auth.*;
//import com.messente.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

GroupsApi apiInstance = new GroupsApi();
String groupId = "groupId_example"; // String | String in UUID format
GroupName groupName = new GroupName(); // GroupName | 
try {
    GroupEnvelope result = apiInstance.updateGroup(groupId, groupName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#updateGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| String in UUID format |
 **groupName** | [**GroupName**](GroupName.md)|  |

### Return type

[**GroupEnvelope**](GroupEnvelope.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


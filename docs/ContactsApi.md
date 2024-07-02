# ContactsApi

All URIs are relative to *https://api.messente.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addContactToGroup**](ContactsApi.md#addContactToGroup) | **POST** /phonebook/groups/{groupId}/contacts/{phone} | Adds a contact to a group |
| [**createContact**](ContactsApi.md#createContact) | **POST** /phonebook/contacts | Creates a new contact |
| [**deleteContact**](ContactsApi.md#deleteContact) | **DELETE** /phonebook/contacts/{phone} | Deletes a contact |
| [**fetchContact**](ContactsApi.md#fetchContact) | **GET** /phonebook/contacts/{phone} | Lists a contact |
| [**fetchContactGroups**](ContactsApi.md#fetchContactGroups) | **GET** /phonebook/contacts/{phone}/groups | Lists groups of a contact |
| [**fetchContacts**](ContactsApi.md#fetchContacts) | **GET** /phonebook/contacts | Returns all contacts |
| [**removeContactFromGroup**](ContactsApi.md#removeContactFromGroup) | **DELETE** /phonebook/groups/{groupId}/contacts/{phone} | Removes a contact from a group |
| [**updateContact**](ContactsApi.md#updateContact) | **PATCH** /phonebook/contacts/{phone} | Updates a contact |


<a name="addContactToGroup"></a>
# **addContactToGroup**
> Object addContactToGroup(groupId, phone)

Adds a contact to a group

### Example
```java
// Import classes:
import com.messente.ApiClient;
import com.messente.ApiException;
import com.messente.Configuration;
import com.messente.auth.*;
import com.messente.models.*;
import com.messente.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.messente.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    String groupId = "5792a02a-e5c2-422b-a0a0-0ae65d814663"; // String | String in UUID format
    String phone = "+37251000000"; // String | A phone number
    try {
      Object result = apiInstance.addContactToGroup(groupId, phone);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#addContactToGroup");
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
| **groupId** | **String**| String in UUID format | |
| **phone** | **String**| A phone number | |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | An empty object |  -  |
| **400** | Invalid phone number provided |  -  |
| **401** | Unauthorized |  -  |
| **404** | Contact or group is missing |  -  |
| **409** | Contact already added to group |  -  |
| **0** | General error |  -  |

<a name="createContact"></a>
# **createContact**
> ContactEnvelope createContact(contactFields)

Creates a new contact

### Example
```java
// Import classes:
import com.messente.ApiClient;
import com.messente.ApiException;
import com.messente.Configuration;
import com.messente.auth.*;
import com.messente.models.*;
import com.messente.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.messente.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    ContactFields contactFields = new ContactFields(); // ContactFields | 
    try {
      ContactEnvelope result = apiInstance.createContact(contactFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#createContact");
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
| **contactFields** | [**ContactFields**](ContactFields.md)|  | |

### Return type

[**ContactEnvelope**](ContactEnvelope.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | An object containing a contact object |  -  |
| **400** | Invalid phone number provided |  -  |
| **401** | Unauthorized |  -  |
| **409** | Contact with phone already created |  -  |
| **0** | General error |  -  |

<a name="deleteContact"></a>
# **deleteContact**
> deleteContact(phone)

Deletes a contact

### Example
```java
// Import classes:
import com.messente.ApiClient;
import com.messente.ApiException;
import com.messente.Configuration;
import com.messente.auth.*;
import com.messente.models.*;
import com.messente.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.messente.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    String phone = "+37251000000"; // String | A phone number
    try {
      apiInstance.deleteContact(phone);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#deleteContact");
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
| **204** | Contact deleted |  -  |
| **400** | Invalid phone number provided |  -  |
| **401** | Unauthorized |  -  |
| **404** | Contact missing |  -  |
| **0** | General error |  -  |

<a name="fetchContact"></a>
# **fetchContact**
> ContactEnvelope fetchContact(phone)

Lists a contact

### Example
```java
// Import classes:
import com.messente.ApiClient;
import com.messente.ApiException;
import com.messente.Configuration;
import com.messente.auth.*;
import com.messente.models.*;
import com.messente.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.messente.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    String phone = "+37251000000"; // String | A phone number
    try {
      ContactEnvelope result = apiInstance.fetchContact(phone);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#fetchContact");
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

[**ContactEnvelope**](ContactEnvelope.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An object containing a contact object |  -  |
| **400** | Invalid phone number provided |  -  |
| **401** | Unauthorized |  -  |
| **404** | Contact missing |  -  |

<a name="fetchContactGroups"></a>
# **fetchContactGroups**
> GroupListEnvelope fetchContactGroups(phone)

Lists groups of a contact

### Example
```java
// Import classes:
import com.messente.ApiClient;
import com.messente.ApiException;
import com.messente.Configuration;
import com.messente.auth.*;
import com.messente.models.*;
import com.messente.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.messente.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    String phone = "+37251000000"; // String | A phone number
    try {
      GroupListEnvelope result = apiInstance.fetchContactGroups(phone);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#fetchContactGroups");
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

[**GroupListEnvelope**](GroupListEnvelope.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An object containing a list of group objects |  -  |
| **400** | Invalid phone number provided |  -  |
| **401** | Unauthorized |  -  |
| **404** | Contact missing |  -  |

<a name="fetchContacts"></a>
# **fetchContacts**
> ContactListEnvelope fetchContacts(groupIds)

Returns all contacts

### Example
```java
// Import classes:
import com.messente.ApiClient;
import com.messente.ApiException;
import com.messente.Configuration;
import com.messente.auth.*;
import com.messente.models.*;
import com.messente.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.messente.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    List<String> groupIds = Arrays.asList(); // List<String> | Optional one or many group id strings in UUID format. For example: \"/contacts?groupIds=group_id_one&groupIds=group_id_two\" 
    try {
      ContactListEnvelope result = apiInstance.fetchContacts(groupIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#fetchContacts");
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
| **groupIds** | [**List&lt;String&gt;**](String.md)| Optional one or many group id strings in UUID format. For example: \&quot;/contacts?groupIds&#x3D;group_id_one&amp;groupIds&#x3D;group_id_two\&quot;  | [optional] |

### Return type

[**ContactListEnvelope**](ContactListEnvelope.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An object containing a list of contact objects |  -  |
| **400** | Invalid \&quot;groupIds\&quot; parameters provided |  -  |
| **401** | Unauthorized |  -  |
| **0** | General error |  -  |

<a name="removeContactFromGroup"></a>
# **removeContactFromGroup**
> removeContactFromGroup(groupId, phone)

Removes a contact from a group

### Example
```java
// Import classes:
import com.messente.ApiClient;
import com.messente.ApiException;
import com.messente.Configuration;
import com.messente.auth.*;
import com.messente.models.*;
import com.messente.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.messente.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    String groupId = "5792a02a-e5c2-422b-a0a0-0ae65d814663"; // String | String in UUID format
    String phone = "+37251000000"; // String | A phone number
    try {
      apiInstance.removeContactFromGroup(groupId, phone);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#removeContactFromGroup");
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
| **groupId** | **String**| String in UUID format | |
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
| **204** | Contact removed from group |  -  |
| **400** | Invalid phone number provided |  -  |
| **401** | Unauthorized |  -  |
| **404** | Contact or group is missing or contact is missing from group |  -  |
| **0** | General error |  -  |

<a name="updateContact"></a>
# **updateContact**
> ContactEnvelope updateContact(phone, contactUpdateFields)

Updates a contact

### Example
```java
// Import classes:
import com.messente.ApiClient;
import com.messente.ApiException;
import com.messente.Configuration;
import com.messente.auth.*;
import com.messente.models.*;
import com.messente.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.messente.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    String phone = "+37251000000"; // String | A phone number
    ContactUpdateFields contactUpdateFields = new ContactUpdateFields(); // ContactUpdateFields | 
    try {
      ContactEnvelope result = apiInstance.updateContact(phone, contactUpdateFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#updateContact");
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
| **contactUpdateFields** | [**ContactUpdateFields**](ContactUpdateFields.md)|  | |

### Return type

[**ContactEnvelope**](ContactEnvelope.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An object containing a contact object |  -  |
| **400** | Invalid phone number or empty patch body or unknown fields provided |  -  |
| **401** | Unauthorized |  -  |
| **404** | Contact missing |  -  |
| **0** | General error |  -  |


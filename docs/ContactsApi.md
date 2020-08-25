# ContactsApi

All URIs are relative to *https://api.messente.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addContactToGroup**](ContactsApi.md#addContactToGroup) | **POST** /phonebook/groups/{groupId}/contacts/{phone} | Adds a contact to a group
[**createContact**](ContactsApi.md#createContact) | **POST** /phonebook/contacts | Creates a new contact
[**deleteContact**](ContactsApi.md#deleteContact) | **DELETE** /phonebook/contacts/{phone} | Deletes a contact
[**fetchContact**](ContactsApi.md#fetchContact) | **GET** /phonebook/contacts/{phone} | Lists a contact
[**fetchContactGroups**](ContactsApi.md#fetchContactGroups) | **GET** /phonebook/contacts/{phone}/groups | Lists groups of a contact
[**fetchContacts**](ContactsApi.md#fetchContacts) | **GET** /phonebook/contacts | Returns all contacts
[**removeContactFromGroup**](ContactsApi.md#removeContactFromGroup) | **DELETE** /phonebook/groups/{groupId}/contacts/{phone} | Removes a contact from a group
[**updateContact**](ContactsApi.md#updateContact) | **PATCH** /phonebook/contacts/{phone} | Updates a contact


<a name="addContactToGroup"></a>
# **addContactToGroup**
> EmptyObject addContactToGroup(groupId, phone)

Adds a contact to a group

### Example
```java
// Import classes:
//import com.messente.ApiClient;
//import com.messente.ApiException;
//import com.messente.Configuration;
//import com.messente.auth.*;
//import com.messente.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
String groupId = 5792a02a-e5c2-422b-a0a0-0ae65d814663; // String | String in UUID format
String phone = +37251000000; // String | A phone number
try {
    EmptyObject result = apiInstance.addContactToGroup(groupId, phone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#addContactToGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| String in UUID format |
 **phone** | **String**| A phone number |

### Return type

[**EmptyObject**](EmptyObject.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createContact"></a>
# **createContact**
> ContactEnvelope createContact(contactFields)

Creates a new contact

### Example
```java
// Import classes:
//import com.messente.ApiClient;
//import com.messente.ApiException;
//import com.messente.Configuration;
//import com.messente.auth.*;
//import com.messente.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
ContactFields contactFields = {"phoneNumber":"+37251000000","email":"anyone@messente.com","firstName":"Any","lastName":"One","company":"Messente","title":"Sir","custom":"Any custom","custom2":"Any custom two","custom3":"Any custom three","custom4":"Any custom four"}; // ContactFields | 
try {
    ContactEnvelope result = apiInstance.createContact(contactFields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#createContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactFields** | [**ContactFields**](ContactFields.md)|  |

### Return type

[**ContactEnvelope**](ContactEnvelope.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteContact"></a>
# **deleteContact**
> deleteContact(phone)

Deletes a contact

### Example
```java
// Import classes:
//import com.messente.ApiClient;
//import com.messente.ApiException;
//import com.messente.Configuration;
//import com.messente.auth.*;
//import com.messente.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
String phone = +37251000000; // String | A phone number
try {
    apiInstance.deleteContact(phone);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#deleteContact");
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

<a name="fetchContact"></a>
# **fetchContact**
> ContactEnvelope fetchContact(phone)

Lists a contact

### Example
```java
// Import classes:
//import com.messente.ApiClient;
//import com.messente.ApiException;
//import com.messente.Configuration;
//import com.messente.auth.*;
//import com.messente.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
String phone = +37251000000; // String | A phone number
try {
    ContactEnvelope result = apiInstance.fetchContact(phone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#fetchContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone** | **String**| A phone number |

### Return type

[**ContactEnvelope**](ContactEnvelope.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchContactGroups"></a>
# **fetchContactGroups**
> GroupListEnvelope fetchContactGroups(phone)

Lists groups of a contact

### Example
```java
// Import classes:
//import com.messente.ApiClient;
//import com.messente.ApiException;
//import com.messente.Configuration;
//import com.messente.auth.*;
//import com.messente.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
String phone = +37251000000; // String | A phone number
try {
    GroupListEnvelope result = apiInstance.fetchContactGroups(phone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#fetchContactGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone** | **String**| A phone number |

### Return type

[**GroupListEnvelope**](GroupListEnvelope.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchContacts"></a>
# **fetchContacts**
> ContactListEnvelope fetchContacts(groupIds)

Returns all contacts

### Example
```java
// Import classes:
//import com.messente.ApiClient;
//import com.messente.ApiException;
//import com.messente.Configuration;
//import com.messente.auth.*;
//import com.messente.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
List<String> groupIds = ["5792a02a-e5c2-422b-a0a0-0ae65d814663","4792a02a-e5c2-422b-a0a0-0ae65d814662"]; // List<String> | Optional one or many group id strings in UUID format. For example: \"/contacts?groupIds=group_id_one&groupIds=group_id_two\" 
try {
    ContactListEnvelope result = apiInstance.fetchContacts(groupIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#fetchContacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupIds** | [**List&lt;String&gt;**](String.md)| Optional one or many group id strings in UUID format. For example: \&quot;/contacts?groupIds&#x3D;group_id_one&amp;groupIds&#x3D;group_id_two\&quot;  | [optional]

### Return type

[**ContactListEnvelope**](ContactListEnvelope.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeContactFromGroup"></a>
# **removeContactFromGroup**
> removeContactFromGroup(groupId, phone)

Removes a contact from a group

### Example
```java
// Import classes:
//import com.messente.ApiClient;
//import com.messente.ApiException;
//import com.messente.Configuration;
//import com.messente.auth.*;
//import com.messente.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
String groupId = 5792a02a-e5c2-422b-a0a0-0ae65d814663; // String | String in UUID format
String phone = +37251000000; // String | A phone number
try {
    apiInstance.removeContactFromGroup(groupId, phone);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#removeContactFromGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| String in UUID format |
 **phone** | **String**| A phone number |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateContact"></a>
# **updateContact**
> ContactEnvelope updateContact(phone, contactUpdateFields)

Updates a contact

### Example
```java
// Import classes:
//import com.messente.ApiClient;
//import com.messente.ApiException;
//import com.messente.Configuration;
//import com.messente.auth.*;
//import com.messente.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
String phone = +37251000000; // String | A phone number
ContactUpdateFields contactUpdateFields = {"email":"anyone@messente.com","firstName":"Any","lastName":"One","company":"Messente","title":"Sir","custom":"Any custom","custom2":"Any custom two","custom3":"Any custom three","custom4":"Any custom four"}; // ContactUpdateFields | 
try {
    ContactEnvelope result = apiInstance.updateContact(phone, contactUpdateFields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#updateContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone** | **String**| A phone number |
 **contactUpdateFields** | [**ContactUpdateFields**](ContactUpdateFields.md)|  |

### Return type

[**ContactEnvelope**](ContactEnvelope.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


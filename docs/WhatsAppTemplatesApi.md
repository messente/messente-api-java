# WhatsAppTemplatesApi

All URIs are relative to *https://api.messente.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWhatsappTemplate**](WhatsAppTemplatesApi.md#createWhatsappTemplate) | **POST** /whatsapp/wabas/{wabaId}/templates | Creates a WhatsApp template |
| [**deleteWhatsappTemplate**](WhatsAppTemplatesApi.md#deleteWhatsappTemplate) | **DELETE** /whatsapp/wabas/{wabaId}/templates | Deletes a WhatsApp template |
| [**getWhatsappTemplateById**](WhatsAppTemplatesApi.md#getWhatsappTemplateById) | **GET** /whatsapp/wabas/{wabaId}/templates/{templateId} | Requests a WhatsApp template with the given ID |
| [**listWhatsappTemplates**](WhatsAppTemplatesApi.md#listWhatsappTemplates) | **GET** /whatsapp/wabas/{wabaId}/templates | Requests a list of WhatsApp templates |
| [**updateWhatsappTemplate**](WhatsAppTemplatesApi.md#updateWhatsappTemplate) | **PUT** /whatsapp/wabas/{wabaId}/templates/{templateId} | Updates a WhatsApp template |


<a id="createWhatsappTemplate"></a>
# **createWhatsappTemplate**
> WhatsappCreateTemplateResponse createWhatsappTemplate(wabaId, whatsappCreateTemplateRequest)

Creates a WhatsApp template

### Example
```java
// Import classes:
import com.messente.ApiClient;
import com.messente.ApiException;
import com.messente.Configuration;
import com.messente.auth.*;
import com.messente.models.*;
import com.messente.api.WhatsAppTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.messente.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    WhatsAppTemplatesApi apiInstance = new WhatsAppTemplatesApi(defaultClient);
    String wabaId = "wabaId_example"; // String | The ID of the WABA
    WhatsappCreateTemplateRequest whatsappCreateTemplateRequest = new WhatsappCreateTemplateRequest(); // WhatsappCreateTemplateRequest | The WhatsApp template to create
    try {
      WhatsappCreateTemplateResponse result = apiInstance.createWhatsappTemplate(wabaId, whatsappCreateTemplateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsAppTemplatesApi#createWhatsappTemplate");
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
| **wabaId** | **String**| The ID of the WABA | |
| **whatsappCreateTemplateRequest** | [**WhatsappCreateTemplateRequest**](WhatsappCreateTemplateRequest.md)| The WhatsApp template to create | |

### Return type

[**WhatsappCreateTemplateResponse**](WhatsappCreateTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid input |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

<a id="deleteWhatsappTemplate"></a>
# **deleteWhatsappTemplate**
> Map&lt;String, Object&gt; deleteWhatsappTemplate(wabaId, name, hsmId)

Deletes a WhatsApp template

### Example
```java
// Import classes:
import com.messente.ApiClient;
import com.messente.ApiException;
import com.messente.Configuration;
import com.messente.auth.*;
import com.messente.models.*;
import com.messente.api.WhatsAppTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.messente.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    WhatsAppTemplatesApi apiInstance = new WhatsAppTemplatesApi(defaultClient);
    String wabaId = "wabaId_example"; // String | The ID of the WABA
    String name = "template_name"; // String | The name of the template to delete
    String hsmId = "1"; // String | The ID of the template to delete
    try {
      Map<String, Object> result = apiInstance.deleteWhatsappTemplate(wabaId, name, hsmId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsAppTemplatesApi#deleteWhatsappTemplate");
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
| **wabaId** | **String**| The ID of the WABA | |
| **name** | **String**| The name of the template to delete | |
| **hsmId** | **String**| The ID of the template to delete | [optional] |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid input |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

<a id="getWhatsappTemplateById"></a>
# **getWhatsappTemplateById**
> WhatsappTemplateResponse getWhatsappTemplateById(wabaId, templateId)

Requests a WhatsApp template with the given ID

### Example
```java
// Import classes:
import com.messente.ApiClient;
import com.messente.ApiException;
import com.messente.Configuration;
import com.messente.auth.*;
import com.messente.models.*;
import com.messente.api.WhatsAppTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.messente.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    WhatsAppTemplatesApi apiInstance = new WhatsAppTemplatesApi(defaultClient);
    String wabaId = "wabaId_example"; // String | The ID of the WABA
    String templateId = "templateId_example"; // String | The ID of the template to retrieve
    try {
      WhatsappTemplateResponse result = apiInstance.getWhatsappTemplateById(wabaId, templateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsAppTemplatesApi#getWhatsappTemplateById");
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
| **wabaId** | **String**| The ID of the WABA | |
| **templateId** | **String**| The ID of the template to retrieve | |

### Return type

[**WhatsappTemplateResponse**](WhatsappTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid input |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

<a id="listWhatsappTemplates"></a>
# **listWhatsappTemplates**
> WhatsappListTemplatesResponse listWhatsappTemplates(wabaId, limit, before, after, category, content, language, name, status)

Requests a list of WhatsApp templates

### Example
```java
// Import classes:
import com.messente.ApiClient;
import com.messente.ApiException;
import com.messente.Configuration;
import com.messente.auth.*;
import com.messente.models.*;
import com.messente.api.WhatsAppTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.messente.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    WhatsAppTemplatesApi apiInstance = new WhatsAppTemplatesApi(defaultClient);
    String wabaId = "wabaId_example"; // String | The ID of the WABA
    Integer limit = 25; // Integer | The number of templates to return in the list. Although the max size is 500, for large datasets it is recommended to use a lower limit and instead use pagination to avoid potential timeouts. Defaults to 25.
    String before = "MAZDZD"; // String | A cursor point used for a paginated request to indicate the template to paginate backwards from.
    String after = "MjQZD"; // String | A cursor point used for a paginated request to indicate the template to paginate forwards from.
    WhatsappTemplateCategory category = WhatsappTemplateCategory.fromValue("authentication"); // WhatsappTemplateCategory | A filter for returning only templates matching a specific category.
    String content = "special offer"; // String | A search filter representing the content of a template. Only matching templates will be returned in the list.
    String language = "en"; // String | A filter  for returning only templates matching a specific language code. A list of supported languages is available in the [WhatsApp documentation](https://developers.facebook.com/docs/whatsapp/api/messages/message-templates/) 
    String name = "Sample Template"; // String | A search filter representing the name, either full or partial, of a template. Only matching templates will be returned in the list.
    WhatsappTemplateStatus status = WhatsappTemplateStatus.fromValue("approved"); // WhatsappTemplateStatus | A filter for returning only templates matching a specific status.
    try {
      WhatsappListTemplatesResponse result = apiInstance.listWhatsappTemplates(wabaId, limit, before, after, category, content, language, name, status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsAppTemplatesApi#listWhatsappTemplates");
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
| **wabaId** | **String**| The ID of the WABA | |
| **limit** | **Integer**| The number of templates to return in the list. Although the max size is 500, for large datasets it is recommended to use a lower limit and instead use pagination to avoid potential timeouts. Defaults to 25. | [optional] [default to 25] |
| **before** | **String**| A cursor point used for a paginated request to indicate the template to paginate backwards from. | [optional] |
| **after** | **String**| A cursor point used for a paginated request to indicate the template to paginate forwards from. | [optional] |
| **category** | [**WhatsappTemplateCategory**](.md)| A filter for returning only templates matching a specific category. | [optional] [enum: authentication, marketing, utility] |
| **content** | **String**| A search filter representing the content of a template. Only matching templates will be returned in the list. | [optional] |
| **language** | **String**| A filter  for returning only templates matching a specific language code. A list of supported languages is available in the [WhatsApp documentation](https://developers.facebook.com/docs/whatsapp/api/messages/message-templates/)  | [optional] |
| **name** | **String**| A search filter representing the name, either full or partial, of a template. Only matching templates will be returned in the list. | [optional] |
| **status** | [**WhatsappTemplateStatus**](.md)| A filter for returning only templates matching a specific status. | [optional] [enum: approved, in_appeal, rejected, pending, pending_deletion, deleted, disabled, paused, limit_exceeded] |

### Return type

[**WhatsappListTemplatesResponse**](WhatsappListTemplatesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid input |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

<a id="updateWhatsappTemplate"></a>
# **updateWhatsappTemplate**
> Map&lt;String, Object&gt; updateWhatsappTemplate(wabaId, templateId, whatsappUpdateTemplateRequest)

Updates a WhatsApp template

### Example
```java
// Import classes:
import com.messente.ApiClient;
import com.messente.ApiException;
import com.messente.Configuration;
import com.messente.auth.*;
import com.messente.models.*;
import com.messente.api.WhatsAppTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.messente.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    WhatsAppTemplatesApi apiInstance = new WhatsAppTemplatesApi(defaultClient);
    String wabaId = "wabaId_example"; // String | The ID of the WABA
    String templateId = "templateId_example"; // String | The ID of the template to update
    WhatsappUpdateTemplateRequest whatsappUpdateTemplateRequest = new WhatsappUpdateTemplateRequest(); // WhatsappUpdateTemplateRequest | The template data to be updated
    try {
      Map<String, Object> result = apiInstance.updateWhatsappTemplate(wabaId, templateId, whatsappUpdateTemplateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WhatsAppTemplatesApi#updateWhatsappTemplate");
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
| **wabaId** | **String**| The ID of the WABA | |
| **templateId** | **String**| The ID of the template to update | |
| **whatsappUpdateTemplateRequest** | [**WhatsappUpdateTemplateRequest**](WhatsappUpdateTemplateRequest.md)| The template data to be updated | |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid input |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |


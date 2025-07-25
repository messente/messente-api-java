# NumberVerificationApi

All URIs are relative to *https://api.messente.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**verifyNumber**](NumberVerificationApi.md#verifyNumber) | **POST** /verify/start | verify number |
| [**verifyPin**](NumberVerificationApi.md#verifyPin) | **POST** /verify/pin | verified the PIN code entered by the user. |


<a id="verifyNumber"></a>
# **verifyNumber**
> String verifyNumber(username, password, to, template, pinLength, from, maxTries, retryDelay, validity, ip, browser, cookie)

verify number

### Example
```java
// Import classes:
import com.messente.ApiClient;
import com.messente.ApiException;
import com.messente.Configuration;
import com.messente.auth.*;
import com.messente.models.*;
import com.messente.api.NumberVerificationApi;

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

    NumberVerificationApi apiInstance = new NumberVerificationApi(defaultClient);
    String username = "username_example"; // String | The API username
    String password = "password_example"; // String | The API password
    String to = "to_example"; // String | Receiver's phone number with the country code
    String template = "template_example"; // String | Template of the message, including PIN code. Placeholder for PIN code is <PIN>. When not set, default template is used: \"Your Verification PIN code is <PIN>\". 
    String pinLength = "pinLength_example"; // String | Length of the PIN code. Minumum 4 digits, maximum 16. Defaults to 4.
    String from = "from_example"; // String | Sender name. When not set, the default Sender name \"Verigator\" is used. This sender ID also needs to be added to your account beforehand.
    String maxTries = "maxTries_example"; // String | Maximum number of times the PIN code is sent in total. Defaults to \"2\" - initial PIN code and one retry. It is discouraged to set this value to \"1\" as only the initial PIN code is sent and retry is disabled.  
    String retryDelay = "retryDelay_example"; // String | For how long (in seconds) to wait for next retry, if the correct PIN code has not been entered yet? Defaults to 30 seconds.
    String validity = "validity_example"; // String | For how long (in seconds) is the PIN code valid. Defaults to 5 minutes (300 seconds). Maximum 30 minutes (1800 seconds).
    String ip = "ip_example"; // String | IP address of the client making verification request.
    String browser = "browser_example"; // String | User Agent of the browser. For example \"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.130 Safari/537.36\".
    String cookie = "cookie_example"; // String | Unique cookie assigned to this session. If a user tries logging in with the same cookie present, user is automatically logged in and no PIN code verification is needed.
    try {
      String result = apiInstance.verifyNumber(username, password, to, template, pinLength, from, maxTries, retryDelay, validity, ip, browser, cookie);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NumberVerificationApi#verifyNumber");
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
| **to** | **String**| Receiver&#39;s phone number with the country code | |
| **template** | **String**| Template of the message, including PIN code. Placeholder for PIN code is &lt;PIN&gt;. When not set, default template is used: \&quot;Your Verification PIN code is &lt;PIN&gt;\&quot;.  | [optional] |
| **pinLength** | **String**| Length of the PIN code. Minumum 4 digits, maximum 16. Defaults to 4. | [optional] |
| **from** | **String**| Sender name. When not set, the default Sender name \&quot;Verigator\&quot; is used. This sender ID also needs to be added to your account beforehand. | [optional] |
| **maxTries** | **String**| Maximum number of times the PIN code is sent in total. Defaults to \&quot;2\&quot; - initial PIN code and one retry. It is discouraged to set this value to \&quot;1\&quot; as only the initial PIN code is sent and retry is disabled.   | [optional] |
| **retryDelay** | **String**| For how long (in seconds) to wait for next retry, if the correct PIN code has not been entered yet? Defaults to 30 seconds. | [optional] |
| **validity** | **String**| For how long (in seconds) is the PIN code valid. Defaults to 5 minutes (300 seconds). Maximum 30 minutes (1800 seconds). | [optional] |
| **ip** | **String**| IP address of the client making verification request. | [optional] |
| **browser** | **String**| User Agent of the browser. For example \&quot;Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.130 Safari/537.36\&quot;. | [optional] |
| **cookie** | **String**| Unique cookie assigned to this session. If a user tries logging in with the same cookie present, user is automatically logged in and no PIN code verification is needed. | [optional] |

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

<a id="verifyPin"></a>
# **verifyPin**
> String verifyPin(username, password, verificationId, pin, ip, browser, cookie)

verified the PIN code entered by the user.

### Example
```java
// Import classes:
import com.messente.ApiClient;
import com.messente.ApiException;
import com.messente.Configuration;
import com.messente.auth.*;
import com.messente.models.*;
import com.messente.api.NumberVerificationApi;

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

    NumberVerificationApi apiInstance = new NumberVerificationApi(defaultClient);
    String username = "username_example"; // String | The API username
    String password = "password_example"; // String | The API password
    String verificationId = "verificationId_example"; // String | Verification ID returned by the successful verification request.
    String pin = "pin_example"; // String | PIN code entered by the user.
    String ip = "ip_example"; // String | IP address of the client making verification request. If the IP address is from another country, PIN is required even if the cookies match.
    String browser = "browser_example"; // String | User Agent of the browser. For example \"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.130 Safari/537.36\".
    String cookie = "cookie_example"; // String | Unique cookie assigned to this session. If a user tries logging in with the same cookie present, user is automatically logged in and no PIN code verification is needed.
    try {
      String result = apiInstance.verifyPin(username, password, verificationId, pin, ip, browser, cookie);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NumberVerificationApi#verifyPin");
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
| **verificationId** | **String**| Verification ID returned by the successful verification request. | |
| **pin** | **String**| PIN code entered by the user. | |
| **ip** | **String**| IP address of the client making verification request. If the IP address is from another country, PIN is required even if the cookies match. | [optional] |
| **browser** | **String**| User Agent of the browser. For example \&quot;Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.130 Safari/537.36\&quot;. | [optional] |
| **cookie** | **String**| Unique cookie assigned to this session. If a user tries logging in with the same cookie present, user is automatically logged in and no PIN code verification is needed. | [optional] |

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


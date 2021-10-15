# ActionMenuApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**actionMenuConnIdClosePost**](ActionMenuApi.md#actionMenuConnIdClosePost) | **POST** /action-menu/{conn_id}/close | Close the active menu associated with a connection
[**actionMenuConnIdFetchPost**](ActionMenuApi.md#actionMenuConnIdFetchPost) | **POST** /action-menu/{conn_id}/fetch | Fetch the active menu
[**actionMenuConnIdPerformPost**](ActionMenuApi.md#actionMenuConnIdPerformPost) | **POST** /action-menu/{conn_id}/perform | Perform an action associated with the active menu
[**actionMenuConnIdRequestPost**](ActionMenuApi.md#actionMenuConnIdRequestPost) | **POST** /action-menu/{conn_id}/request | Request the active menu
[**actionMenuConnIdSendMenuPost**](ActionMenuApi.md#actionMenuConnIdSendMenuPost) | **POST** /action-menu/{conn_id}/send-menu | Send an action menu to a connection



## actionMenuConnIdClosePost

> Object actionMenuConnIdClosePost(connId)

Close the active menu associated with a connection

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.ActionMenuApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        ActionMenuApi apiInstance = new ActionMenuApi(defaultClient);
        String connId = "connId_example"; // String | Connection identifier
        try {
            Object result = apiInstance.actionMenuConnIdClosePost(connId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActionMenuApi#actionMenuConnIdClosePost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connId** | **String**| Connection identifier |

### Return type

**Object**

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## actionMenuConnIdFetchPost

> ActionMenuFetchResult actionMenuConnIdFetchPost(connId)

Fetch the active menu

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.ActionMenuApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        ActionMenuApi apiInstance = new ActionMenuApi(defaultClient);
        String connId = "connId_example"; // String | Connection identifier
        try {
            ActionMenuFetchResult result = apiInstance.actionMenuConnIdFetchPost(connId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActionMenuApi#actionMenuConnIdFetchPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connId** | **String**| Connection identifier |

### Return type

[**ActionMenuFetchResult**](ActionMenuFetchResult.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## actionMenuConnIdPerformPost

> Object actionMenuConnIdPerformPost(connId, body)

Perform an action associated with the active menu

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.ActionMenuApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        ActionMenuApi apiInstance = new ActionMenuApi(defaultClient);
        String connId = "connId_example"; // String | Connection identifier
        PerformRequest body = new PerformRequest(); // PerformRequest | 
        try {
            Object result = apiInstance.actionMenuConnIdPerformPost(connId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActionMenuApi#actionMenuConnIdPerformPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connId** | **String**| Connection identifier |
 **body** | [**PerformRequest**](PerformRequest.md)|  | [optional]

### Return type

**Object**

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## actionMenuConnIdRequestPost

> Object actionMenuConnIdRequestPost(connId)

Request the active menu

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.ActionMenuApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        ActionMenuApi apiInstance = new ActionMenuApi(defaultClient);
        String connId = "connId_example"; // String | Connection identifier
        try {
            Object result = apiInstance.actionMenuConnIdRequestPost(connId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActionMenuApi#actionMenuConnIdRequestPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connId** | **String**| Connection identifier |

### Return type

**Object**

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## actionMenuConnIdSendMenuPost

> Object actionMenuConnIdSendMenuPost(connId, body)

Send an action menu to a connection

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.ActionMenuApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        ActionMenuApi apiInstance = new ActionMenuApi(defaultClient);
        String connId = "connId_example"; // String | Connection identifier
        SendMenu body = new SendMenu(); // SendMenu | 
        try {
            Object result = apiInstance.actionMenuConnIdSendMenuPost(connId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActionMenuApi#actionMenuConnIdSendMenuPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connId** | **String**| Connection identifier |
 **body** | [**SendMenu**](SendMenu.md)|  | [optional]

### Return type

**Object**

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


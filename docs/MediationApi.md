# MediationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mediationDefaultMediatorDelete**](MediationApi.md#mediationDefaultMediatorDelete) | **DELETE** /mediation/default-mediator | Clear default mediator
[**mediationDefaultMediatorGet**](MediationApi.md#mediationDefaultMediatorGet) | **GET** /mediation/default-mediator | Get default mediator
[**mediationKeylistsGet**](MediationApi.md#mediationKeylistsGet) | **GET** /mediation/keylists | Retrieve keylists by connection or role
[**mediationKeylistsMediationIdSendKeylistQueryPost**](MediationApi.md#mediationKeylistsMediationIdSendKeylistQueryPost) | **POST** /mediation/keylists/{mediation_id}/send-keylist-query | Send keylist query to mediator
[**mediationKeylistsMediationIdSendKeylistUpdatePost**](MediationApi.md#mediationKeylistsMediationIdSendKeylistUpdatePost) | **POST** /mediation/keylists/{mediation_id}/send-keylist-update | Send keylist update to mediator
[**mediationMediationIdDefaultMediatorPut**](MediationApi.md#mediationMediationIdDefaultMediatorPut) | **PUT** /mediation/{mediation_id}/default-mediator | Set default mediator
[**mediationRequestConnIdPost**](MediationApi.md#mediationRequestConnIdPost) | **POST** /mediation/request/{conn_id} | Request mediation from connection
[**mediationRequestsGet**](MediationApi.md#mediationRequestsGet) | **GET** /mediation/requests | Query mediation requests, returns list of all mediation records
[**mediationRequestsMediationIdDelete**](MediationApi.md#mediationRequestsMediationIdDelete) | **DELETE** /mediation/requests/{mediation_id} | Delete mediation request by ID
[**mediationRequestsMediationIdDenyPost**](MediationApi.md#mediationRequestsMediationIdDenyPost) | **POST** /mediation/requests/{mediation_id}/deny | Deny a stored mediation request
[**mediationRequestsMediationIdGet**](MediationApi.md#mediationRequestsMediationIdGet) | **GET** /mediation/requests/{mediation_id} | Retrieve mediation request record
[**mediationRequestsMediationIdGrantPost**](MediationApi.md#mediationRequestsMediationIdGrantPost) | **POST** /mediation/requests/{mediation_id}/grant | Grant received mediation



## mediationDefaultMediatorDelete

> MediationRecord mediationDefaultMediatorDelete()

Clear default mediator

### Example

```java
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.MediationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        MediationApi apiInstance = new MediationApi(defaultClient);
        try {
            MediationRecord result = apiInstance.mediationDefaultMediatorDelete();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediationApi#mediationDefaultMediatorDelete");
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

[**MediationRecord**](MediationRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | null |  -  |


## mediationDefaultMediatorGet

> MediationRecord mediationDefaultMediatorGet()

Get default mediator

### Example

```java
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.MediationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        MediationApi apiInstance = new MediationApi(defaultClient);
        try {
            MediationRecord result = apiInstance.mediationDefaultMediatorGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediationApi#mediationDefaultMediatorGet");
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

[**MediationRecord**](MediationRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | null |  -  |


## mediationKeylistsGet

> Keylist mediationKeylistsGet(connId, role)

Retrieve keylists by connection or role

### Example

```java
import java.util.UUID;
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.MediationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        MediationApi apiInstance = new MediationApi(defaultClient);
        UUID connId = new UUID(); // UUID | Connection identifier (optional)
        String role = "server"; // String | Filer on role, 'client' for keys         mediated by other agents, 'server' for keys         mediated by this agent
        try {
            Keylist result = apiInstance.mediationKeylistsGet(connId, role);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediationApi#mediationKeylistsGet");
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
 **connId** | **UUID**| Connection identifier (optional) | [optional]
 **role** | **String**| Filer on role, &#39;client&#39; for keys         mediated by other agents, &#39;server&#39; for keys         mediated by this agent | [optional] [default to server] [enum: client, server]

### Return type

[**Keylist**](Keylist.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | null |  -  |


## mediationKeylistsMediationIdSendKeylistQueryPost

> KeylistQuery mediationKeylistsMediationIdSendKeylistQueryPost(mediationId, paginateLimit, paginateOffset, body)

Send keylist query to mediator

### Example

```java
import java.util.UUID;
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.MediationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        MediationApi apiInstance = new MediationApi(defaultClient);
        UUID mediationId = new UUID(); // UUID | Mediation record identifier
        Integer paginateLimit = -1; // Integer | limit number of results
        Integer paginateOffset = 0; // Integer | offset to use in pagination
        KeylistQueryFilterRequest body = new KeylistQueryFilterRequest(); // KeylistQueryFilterRequest | 
        try {
            KeylistQuery result = apiInstance.mediationKeylistsMediationIdSendKeylistQueryPost(mediationId, paginateLimit, paginateOffset, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediationApi#mediationKeylistsMediationIdSendKeylistQueryPost");
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
 **mediationId** | **UUID**| Mediation record identifier |
 **paginateLimit** | **Integer**| limit number of results | [optional] [default to -1]
 **paginateOffset** | **Integer**| offset to use in pagination | [optional] [default to 0]
 **body** | [**KeylistQueryFilterRequest**](KeylistQueryFilterRequest.md)|  | [optional]

### Return type

[**KeylistQuery**](KeylistQuery.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | null |  -  |


## mediationKeylistsMediationIdSendKeylistUpdatePost

> KeylistUpdate mediationKeylistsMediationIdSendKeylistUpdatePost(mediationId, body)

Send keylist update to mediator

### Example

```java
import java.util.UUID;
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.MediationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        MediationApi apiInstance = new MediationApi(defaultClient);
        UUID mediationId = new UUID(); // UUID | Mediation record identifier
        KeylistUpdateRequest body = new KeylistUpdateRequest(); // KeylistUpdateRequest | 
        try {
            KeylistUpdate result = apiInstance.mediationKeylistsMediationIdSendKeylistUpdatePost(mediationId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediationApi#mediationKeylistsMediationIdSendKeylistUpdatePost");
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
 **mediationId** | **UUID**| Mediation record identifier |
 **body** | [**KeylistUpdateRequest**](KeylistUpdateRequest.md)|  | [optional]

### Return type

[**KeylistUpdate**](KeylistUpdate.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | null |  -  |


## mediationMediationIdDefaultMediatorPut

> MediationRecord mediationMediationIdDefaultMediatorPut(mediationId)

Set default mediator

### Example

```java
import java.util.UUID;
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.MediationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        MediationApi apiInstance = new MediationApi(defaultClient);
        UUID mediationId = new UUID(); // UUID | Mediation record identifier
        try {
            MediationRecord result = apiInstance.mediationMediationIdDefaultMediatorPut(mediationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediationApi#mediationMediationIdDefaultMediatorPut");
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
 **mediationId** | **UUID**| Mediation record identifier |

### Return type

[**MediationRecord**](MediationRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | null |  -  |


## mediationRequestConnIdPost

> MediationRecord mediationRequestConnIdPost(connId, body)

Request mediation from connection

### Example

```java
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.MediationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        MediationApi apiInstance = new MediationApi(defaultClient);
        String connId = "connId_example"; // String | Connection identifier
        MediationCreateRequest body = new MediationCreateRequest(); // MediationCreateRequest | 
        try {
            MediationRecord result = apiInstance.mediationRequestConnIdPost(connId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediationApi#mediationRequestConnIdPost");
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
 **body** | [**MediationCreateRequest**](MediationCreateRequest.md)|  | [optional]

### Return type

[**MediationRecord**](MediationRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | null |  -  |


## mediationRequestsGet

> MediationList mediationRequestsGet(connId, mediatorTerms, recipientTerms, state)

Query mediation requests, returns list of all mediation records

### Example

```java
import java.util.UUID;
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.MediationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        MediationApi apiInstance = new MediationApi(defaultClient);
        UUID connId = new UUID(); // UUID | Connection identifier (optional)
        List<String> mediatorTerms = Arrays.asList(); // List<String> | List of mediator rules for recipient
        List<String> recipientTerms = Arrays.asList(); // List<String> | List of recipient rules for mediation
        String state = "state_example"; // String | Mediation state (optional)
        try {
            MediationList result = apiInstance.mediationRequestsGet(connId, mediatorTerms, recipientTerms, state);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediationApi#mediationRequestsGet");
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
 **connId** | **UUID**| Connection identifier (optional) | [optional]
 **mediatorTerms** | **List&lt;String&gt;**| List of mediator rules for recipient | [optional]
 **recipientTerms** | **List&lt;String&gt;**| List of recipient rules for mediation | [optional]
 **state** | **String**| Mediation state (optional) | [optional] [enum: request, granted, denied]

### Return type

[**MediationList**](MediationList.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | null |  -  |


## mediationRequestsMediationIdDelete

> MediationRecord mediationRequestsMediationIdDelete(mediationId)

Delete mediation request by ID

### Example

```java
import java.util.UUID;
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.MediationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        MediationApi apiInstance = new MediationApi(defaultClient);
        UUID mediationId = new UUID(); // UUID | Mediation record identifier
        try {
            MediationRecord result = apiInstance.mediationRequestsMediationIdDelete(mediationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediationApi#mediationRequestsMediationIdDelete");
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
 **mediationId** | **UUID**| Mediation record identifier |

### Return type

[**MediationRecord**](MediationRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | null |  -  |


## mediationRequestsMediationIdDenyPost

> MediationDeny mediationRequestsMediationIdDenyPost(mediationId, body)

Deny a stored mediation request

### Example

```java
import java.util.UUID;
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.MediationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        MediationApi apiInstance = new MediationApi(defaultClient);
        UUID mediationId = new UUID(); // UUID | Mediation record identifier
        AdminMediationDeny body = new AdminMediationDeny(); // AdminMediationDeny | 
        try {
            MediationDeny result = apiInstance.mediationRequestsMediationIdDenyPost(mediationId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediationApi#mediationRequestsMediationIdDenyPost");
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
 **mediationId** | **UUID**| Mediation record identifier |
 **body** | [**AdminMediationDeny**](AdminMediationDeny.md)|  | [optional]

### Return type

[**MediationDeny**](MediationDeny.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | null |  -  |


## mediationRequestsMediationIdGet

> MediationRecord mediationRequestsMediationIdGet(mediationId)

Retrieve mediation request record

### Example

```java
import java.util.UUID;
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.MediationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        MediationApi apiInstance = new MediationApi(defaultClient);
        UUID mediationId = new UUID(); // UUID | Mediation record identifier
        try {
            MediationRecord result = apiInstance.mediationRequestsMediationIdGet(mediationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediationApi#mediationRequestsMediationIdGet");
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
 **mediationId** | **UUID**| Mediation record identifier |

### Return type

[**MediationRecord**](MediationRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | null |  -  |


## mediationRequestsMediationIdGrantPost

> MediationGrant mediationRequestsMediationIdGrantPost(mediationId)

Grant received mediation

### Example

```java
import java.util.UUID;
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.MediationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        MediationApi apiInstance = new MediationApi(defaultClient);
        UUID mediationId = new UUID(); // UUID | Mediation record identifier
        try {
            MediationGrant result = apiInstance.mediationRequestsMediationIdGrantPost(mediationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediationApi#mediationRequestsMediationIdGrantPost");
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
 **mediationId** | **UUID**| Mediation record identifier |

### Return type

[**MediationGrant**](MediationGrant.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | null |  -  |


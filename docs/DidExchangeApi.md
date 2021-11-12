# DidExchangeApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**didexchangeConnIdAcceptInvitationPost**](DidExchangeApi.md#didexchangeConnIdAcceptInvitationPost) | **POST** /didexchange/{conn_id}/accept-invitation | Accept a stored connection invitation
[**didexchangeConnIdAcceptRequestPost**](DidExchangeApi.md#didexchangeConnIdAcceptRequestPost) | **POST** /didexchange/{conn_id}/accept-request | Accept a stored connection request
[**didexchangeCreateRequestPost**](DidExchangeApi.md#didexchangeCreateRequestPost) | **POST** /didexchange/create-request | Create and send a request against public DID&#39;s implicit invitation
[**didexchangeReceiveRequestPost**](DidExchangeApi.md#didexchangeReceiveRequestPost) | **POST** /didexchange/receive-request | Receive request against public DID&#39;s implicit invitation



## didexchangeConnIdAcceptInvitationPost

> ConnRecord didexchangeConnIdAcceptInvitationPost(connId, myEndpoint, myLabel)

Accept a stored connection invitation

### Example

```java
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.DidExchangeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        DidExchangeApi apiInstance = new DidExchangeApi(defaultClient);
        String connId = "connId_example"; // String | Connection identifier
        String myEndpoint = "myEndpoint_example"; // String | My URL endpoint
        String myLabel = "myLabel_example"; // String | Label for connection request
        try {
            ConnRecord result = apiInstance.didexchangeConnIdAcceptInvitationPost(connId, myEndpoint, myLabel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DidExchangeApi#didexchangeConnIdAcceptInvitationPost");
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
 **myEndpoint** | **String**| My URL endpoint | [optional]
 **myLabel** | **String**| Label for connection request | [optional]

### Return type

[**ConnRecord**](ConnRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## didexchangeConnIdAcceptRequestPost

> ConnRecord didexchangeConnIdAcceptRequestPost(connId, mediationId, myEndpoint)

Accept a stored connection request

### Example

```java
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.DidExchangeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        DidExchangeApi apiInstance = new DidExchangeApi(defaultClient);
        String connId = "connId_example"; // String | Connection identifier
        String mediationId = "mediationId_example"; // String | Identifier for active mediation record to be used
        String myEndpoint = "myEndpoint_example"; // String | My URL endpoint
        try {
            ConnRecord result = apiInstance.didexchangeConnIdAcceptRequestPost(connId, mediationId, myEndpoint);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DidExchangeApi#didexchangeConnIdAcceptRequestPost");
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
 **mediationId** | **String**| Identifier for active mediation record to be used | [optional]
 **myEndpoint** | **String**| My URL endpoint | [optional]

### Return type

[**ConnRecord**](ConnRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## didexchangeCreateRequestPost

> ConnRecord didexchangeCreateRequestPost(theirPublicDid, mediationId, myEndpoint, myLabel, usePublicDid)

Create and send a request against public DID&#39;s implicit invitation

### Example

```java
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.DidExchangeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        DidExchangeApi apiInstance = new DidExchangeApi(defaultClient);
        String theirPublicDid = "theirPublicDid_example"; // String | Qualified public DID to which to request connection
        String mediationId = "mediationId_example"; // String | Identifier for active mediation record to be used
        String myEndpoint = "myEndpoint_example"; // String | My URL endpoint
        String myLabel = "myLabel_example"; // String | Label for connection request
        Boolean usePublicDid = true; // Boolean | Use public DID for this connection
        try {
            ConnRecord result = apiInstance.didexchangeCreateRequestPost(theirPublicDid, mediationId, myEndpoint, myLabel, usePublicDid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DidExchangeApi#didexchangeCreateRequestPost");
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
 **theirPublicDid** | **String**| Qualified public DID to which to request connection |
 **mediationId** | **String**| Identifier for active mediation record to be used | [optional]
 **myEndpoint** | **String**| My URL endpoint | [optional]
 **myLabel** | **String**| Label for connection request | [optional]
 **usePublicDid** | **Boolean**| Use public DID for this connection | [optional]

### Return type

[**ConnRecord**](ConnRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## didexchangeReceiveRequestPost

> ConnRecord didexchangeReceiveRequestPost(alias, autoAccept, mediationId, myEndpoint, body)

Receive request against public DID&#39;s implicit invitation

### Example

```java
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.DidExchangeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        DidExchangeApi apiInstance = new DidExchangeApi(defaultClient);
        String alias = "alias_example"; // String | Alias for connection
        Boolean autoAccept = true; // Boolean | Auto-accept connection (defaults to configuration)
        String mediationId = "mediationId_example"; // String | Identifier for active mediation record to be used
        String myEndpoint = "myEndpoint_example"; // String | My URL endpoint
        DIDXRequest body = new DIDXRequest(); // DIDXRequest | 
        try {
            ConnRecord result = apiInstance.didexchangeReceiveRequestPost(alias, autoAccept, mediationId, myEndpoint, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DidExchangeApi#didexchangeReceiveRequestPost");
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
 **alias** | **String**| Alias for connection | [optional]
 **autoAccept** | **Boolean**| Auto-accept connection (defaults to configuration) | [optional]
 **mediationId** | **String**| Identifier for active mediation record to be used | [optional]
 **myEndpoint** | **String**| My URL endpoint | [optional]
 **body** | [**DIDXRequest**](DIDXRequest.md)|  | [optional]

### Return type

[**ConnRecord**](ConnRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


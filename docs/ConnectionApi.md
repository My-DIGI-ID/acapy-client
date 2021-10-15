# ConnectionApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**connectionsConnIdAcceptInvitationPost**](ConnectionApi.md#connectionsConnIdAcceptInvitationPost) | **POST** /connections/{conn_id}/accept-invitation | Accept a stored connection invitation
[**connectionsConnIdAcceptRequestPost**](ConnectionApi.md#connectionsConnIdAcceptRequestPost) | **POST** /connections/{conn_id}/accept-request | Accept a stored connection request
[**connectionsConnIdDelete**](ConnectionApi.md#connectionsConnIdDelete) | **DELETE** /connections/{conn_id} | Remove an existing connection record
[**connectionsConnIdEndpointsGet**](ConnectionApi.md#connectionsConnIdEndpointsGet) | **GET** /connections/{conn_id}/endpoints | Fetch connection remote endpoint
[**connectionsConnIdEstablishInboundRefIdPost**](ConnectionApi.md#connectionsConnIdEstablishInboundRefIdPost) | **POST** /connections/{conn_id}/establish-inbound/{ref_id} | Assign another connection as the inbound connection
[**connectionsConnIdGet**](ConnectionApi.md#connectionsConnIdGet) | **GET** /connections/{conn_id} | Fetch a single connection record
[**connectionsConnIdMetadataGet**](ConnectionApi.md#connectionsConnIdMetadataGet) | **GET** /connections/{conn_id}/metadata | Fetch connection metadata
[**connectionsConnIdMetadataPost**](ConnectionApi.md#connectionsConnIdMetadataPost) | **POST** /connections/{conn_id}/metadata | Set connection metadata
[**connectionsCreateInvitationPost**](ConnectionApi.md#connectionsCreateInvitationPost) | **POST** /connections/create-invitation | Create a new connection invitation
[**connectionsCreateStaticPost**](ConnectionApi.md#connectionsCreateStaticPost) | **POST** /connections/create-static | Create a new static connection
[**connectionsGet**](ConnectionApi.md#connectionsGet) | **GET** /connections | Query agent-to-agent connections
[**connectionsReceiveInvitationPost**](ConnectionApi.md#connectionsReceiveInvitationPost) | **POST** /connections/receive-invitation | Receive a new connection invitation



## connectionsConnIdAcceptInvitationPost

> ConnRecord connectionsConnIdAcceptInvitationPost(connId, mediationId, myEndpoint, myLabel)

Accept a stored connection invitation

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.ConnectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        ConnectionApi apiInstance = new ConnectionApi(defaultClient);
        String connId = "connId_example"; // String | Connection identifier
        String mediationId = "mediationId_example"; // String | Identifier for active mediation record to be used
        String myEndpoint = "myEndpoint_example"; // String | My URL endpoint
        String myLabel = "myLabel_example"; // String | Label for connection
        try {
            ConnRecord result = apiInstance.connectionsConnIdAcceptInvitationPost(connId, mediationId, myEndpoint, myLabel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectionApi#connectionsConnIdAcceptInvitationPost");
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
 **myLabel** | **String**| Label for connection | [optional]

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


## connectionsConnIdAcceptRequestPost

> ConnRecord connectionsConnIdAcceptRequestPost(connId, myEndpoint)

Accept a stored connection request

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.ConnectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        ConnectionApi apiInstance = new ConnectionApi(defaultClient);
        String connId = "connId_example"; // String | Connection identifier
        String myEndpoint = "myEndpoint_example"; // String | My URL endpoint
        try {
            ConnRecord result = apiInstance.connectionsConnIdAcceptRequestPost(connId, myEndpoint);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectionApi#connectionsConnIdAcceptRequestPost");
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


## connectionsConnIdDelete

> Object connectionsConnIdDelete(connId)

Remove an existing connection record

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.ConnectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        ConnectionApi apiInstance = new ConnectionApi(defaultClient);
        String connId = "connId_example"; // String | Connection identifier
        try {
            Object result = apiInstance.connectionsConnIdDelete(connId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectionApi#connectionsConnIdDelete");
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


## connectionsConnIdEndpointsGet

> EndpointsResult connectionsConnIdEndpointsGet(connId)

Fetch connection remote endpoint

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.ConnectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        ConnectionApi apiInstance = new ConnectionApi(defaultClient);
        String connId = "connId_example"; // String | Connection identifier
        try {
            EndpointsResult result = apiInstance.connectionsConnIdEndpointsGet(connId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectionApi#connectionsConnIdEndpointsGet");
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

[**EndpointsResult**](EndpointsResult.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## connectionsConnIdEstablishInboundRefIdPost

> Object connectionsConnIdEstablishInboundRefIdPost(connId, refId)

Assign another connection as the inbound connection

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.ConnectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        ConnectionApi apiInstance = new ConnectionApi(defaultClient);
        String connId = "connId_example"; // String | Connection identifier
        String refId = "refId_example"; // String | Inbound connection identifier
        try {
            Object result = apiInstance.connectionsConnIdEstablishInboundRefIdPost(connId, refId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectionApi#connectionsConnIdEstablishInboundRefIdPost");
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
 **refId** | **String**| Inbound connection identifier |

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


## connectionsConnIdGet

> ConnRecord connectionsConnIdGet(connId)

Fetch a single connection record

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.ConnectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        ConnectionApi apiInstance = new ConnectionApi(defaultClient);
        String connId = "connId_example"; // String | Connection identifier
        try {
            ConnRecord result = apiInstance.connectionsConnIdGet(connId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectionApi#connectionsConnIdGet");
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


## connectionsConnIdMetadataGet

> ConnectionMetadata connectionsConnIdMetadataGet(connId, key)

Fetch connection metadata

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.ConnectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        ConnectionApi apiInstance = new ConnectionApi(defaultClient);
        String connId = "connId_example"; // String | Connection identifier
        String key = "key_example"; // String | Key to retrieve.
        try {
            ConnectionMetadata result = apiInstance.connectionsConnIdMetadataGet(connId, key);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectionApi#connectionsConnIdMetadataGet");
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
 **key** | **String**| Key to retrieve. | [optional]

### Return type

[**ConnectionMetadata**](ConnectionMetadata.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## connectionsConnIdMetadataPost

> ConnectionMetadata connectionsConnIdMetadataPost(connId, body)

Set connection metadata

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.ConnectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        ConnectionApi apiInstance = new ConnectionApi(defaultClient);
        String connId = "connId_example"; // String | Connection identifier
        ConnectionMetadataSetRequest body = new ConnectionMetadataSetRequest(); // ConnectionMetadataSetRequest | 
        try {
            ConnectionMetadata result = apiInstance.connectionsConnIdMetadataPost(connId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectionApi#connectionsConnIdMetadataPost");
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
 **body** | [**ConnectionMetadataSetRequest**](ConnectionMetadataSetRequest.md)|  | [optional]

### Return type

[**ConnectionMetadata**](ConnectionMetadata.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## connectionsCreateInvitationPost

> InvitationResult connectionsCreateInvitationPost(alias, autoAccept, multiUse, _public, body)

Create a new connection invitation

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.ConnectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        ConnectionApi apiInstance = new ConnectionApi(defaultClient);
        String alias = "alias_example"; // String | Alias
        Boolean autoAccept = true; // Boolean | Auto-accept connection (defaults to configuration)
        Boolean multiUse = true; // Boolean | Create invitation for multiple use (default false)
        Boolean _public = true; // Boolean | Create invitation from public DID (default false)
        CreateInvitationRequest body = new CreateInvitationRequest(); // CreateInvitationRequest | 
        try {
            InvitationResult result = apiInstance.connectionsCreateInvitationPost(alias, autoAccept, multiUse, _public, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectionApi#connectionsCreateInvitationPost");
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
 **alias** | **String**| Alias | [optional]
 **autoAccept** | **Boolean**| Auto-accept connection (defaults to configuration) | [optional]
 **multiUse** | **Boolean**| Create invitation for multiple use (default false) | [optional]
 **_public** | **Boolean**| Create invitation from public DID (default false) | [optional]
 **body** | [**CreateInvitationRequest**](CreateInvitationRequest.md)|  | [optional]

### Return type

[**InvitationResult**](InvitationResult.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## connectionsCreateStaticPost

> ConnectionStaticResult connectionsCreateStaticPost(body)

Create a new static connection

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.ConnectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        ConnectionApi apiInstance = new ConnectionApi(defaultClient);
        ConnectionStaticRequest body = new ConnectionStaticRequest(); // ConnectionStaticRequest | 
        try {
            ConnectionStaticResult result = apiInstance.connectionsCreateStaticPost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectionApi#connectionsCreateStaticPost");
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
 **body** | [**ConnectionStaticRequest**](ConnectionStaticRequest.md)|  | [optional]

### Return type

[**ConnectionStaticResult**](ConnectionStaticResult.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## connectionsGet

> ConnectionList connectionsGet(alias, connectionProtocol, invitationKey, myDid, state, theirDid, theirRole)

Query agent-to-agent connections

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.ConnectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        ConnectionApi apiInstance = new ConnectionApi(defaultClient);
        String alias = "alias_example"; // String | Alias
        String connectionProtocol = "connectionProtocol_example"; // String | Connection protocol used
        String invitationKey = "invitationKey_example"; // String | invitation key
        String myDid = "myDid_example"; // String | My DID
        String state = "state_example"; // String | Connection state
        String theirDid = "theirDid_example"; // String | Their DID
        String theirRole = "theirRole_example"; // String | Their role in the connection protocol
        try {
            ConnectionList result = apiInstance.connectionsGet(alias, connectionProtocol, invitationKey, myDid, state, theirDid, theirRole);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectionApi#connectionsGet");
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
 **alias** | **String**| Alias | [optional]
 **connectionProtocol** | **String**| Connection protocol used | [optional] [enum: connections/1.0, didexchange/1.0]
 **invitationKey** | **String**| invitation key | [optional]
 **myDid** | **String**| My DID | [optional]
 **state** | **String**| Connection state | [optional] [enum: start, request, init, response, completed, active, abandoned, error, invitation]
 **theirDid** | **String**| Their DID | [optional]
 **theirRole** | **String**| Their role in the connection protocol | [optional] [enum: invitee, requester, inviter, responder]

### Return type

[**ConnectionList**](ConnectionList.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## connectionsReceiveInvitationPost

> ConnRecord connectionsReceiveInvitationPost(alias, autoAccept, mediationId, body)

Receive a new connection invitation

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.ConnectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        ConnectionApi apiInstance = new ConnectionApi(defaultClient);
        String alias = "alias_example"; // String | Alias
        Boolean autoAccept = true; // Boolean | Auto-accept connection (defaults to configuration)
        String mediationId = "mediationId_example"; // String | Identifier for active mediation record to be used
        ReceiveInvitationRequest body = new ReceiveInvitationRequest(); // ReceiveInvitationRequest | 
        try {
            ConnRecord result = apiInstance.connectionsReceiveInvitationPost(alias, autoAccept, mediationId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectionApi#connectionsReceiveInvitationPost");
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
 **alias** | **String**| Alias | [optional]
 **autoAccept** | **Boolean**| Auto-accept connection (defaults to configuration) | [optional]
 **mediationId** | **String**| Identifier for active mediation record to be used | [optional]
 **body** | [**ReceiveInvitationRequest**](ReceiveInvitationRequest.md)|  | [optional]

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


# LedgerApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ledgerDidEndpointGet**](LedgerApi.md#ledgerDidEndpointGet) | **GET** /ledger/did-endpoint | Get the endpoint for a DID from the ledger.
[**ledgerDidVerkeyGet**](LedgerApi.md#ledgerDidVerkeyGet) | **GET** /ledger/did-verkey | Get the verkey for a DID from the ledger.
[**ledgerGetNymRoleGet**](LedgerApi.md#ledgerGetNymRoleGet) | **GET** /ledger/get-nym-role | Get the role from the NYM registration of a public DID.
[**ledgerRegisterNymPost**](LedgerApi.md#ledgerRegisterNymPost) | **POST** /ledger/register-nym | Send a NYM registration to the ledger.
[**ledgerRotatePublicDidKeypairPatch**](LedgerApi.md#ledgerRotatePublicDidKeypairPatch) | **PATCH** /ledger/rotate-public-did-keypair | Rotate key pair for public DID.
[**ledgerTaaAcceptPost**](LedgerApi.md#ledgerTaaAcceptPost) | **POST** /ledger/taa/accept | Accept the transaction author agreement
[**ledgerTaaGet**](LedgerApi.md#ledgerTaaGet) | **GET** /ledger/taa | Fetch the current transaction author agreement, if any



## ledgerDidEndpointGet

> GetDIDEndpointResponse ledgerDidEndpointGet(did, endpointType)

Get the endpoint for a DID from the ledger.

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.LedgerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        LedgerApi apiInstance = new LedgerApi(defaultClient);
        String did = "did_example"; // String | DID of interest
        String endpointType = "endpointType_example"; // String | Endpoint type of interest (default 'Endpoint')
        try {
            GetDIDEndpointResponse result = apiInstance.ledgerDidEndpointGet(did, endpointType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LedgerApi#ledgerDidEndpointGet");
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
 **did** | **String**| DID of interest |
 **endpointType** | **String**| Endpoint type of interest (default &#39;Endpoint&#39;) | [optional] [enum: Endpoint, Profile, LinkedDomains]

### Return type

[**GetDIDEndpointResponse**](GetDIDEndpointResponse.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## ledgerDidVerkeyGet

> GetDIDVerkeyResponse ledgerDidVerkeyGet(did)

Get the verkey for a DID from the ledger.

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.LedgerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        LedgerApi apiInstance = new LedgerApi(defaultClient);
        String did = "did_example"; // String | DID of interest
        try {
            GetDIDVerkeyResponse result = apiInstance.ledgerDidVerkeyGet(did);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LedgerApi#ledgerDidVerkeyGet");
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
 **did** | **String**| DID of interest |

### Return type

[**GetDIDVerkeyResponse**](GetDIDVerkeyResponse.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## ledgerGetNymRoleGet

> GetNymRoleResponse ledgerGetNymRoleGet(did)

Get the role from the NYM registration of a public DID.

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.LedgerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        LedgerApi apiInstance = new LedgerApi(defaultClient);
        String did = "did_example"; // String | DID of interest
        try {
            GetNymRoleResponse result = apiInstance.ledgerGetNymRoleGet(did);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LedgerApi#ledgerGetNymRoleGet");
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
 **did** | **String**| DID of interest |

### Return type

[**GetNymRoleResponse**](GetNymRoleResponse.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## ledgerRegisterNymPost

> RegisterLedgerNymResponse ledgerRegisterNymPost(did, verkey, alias, role)

Send a NYM registration to the ledger.

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.LedgerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        LedgerApi apiInstance = new LedgerApi(defaultClient);
        String did = "did_example"; // String | DID to register
        String verkey = "verkey_example"; // String | Verification key
        String alias = "alias_example"; // String | Alias
        String role = "role_example"; // String | Role
        try {
            RegisterLedgerNymResponse result = apiInstance.ledgerRegisterNymPost(did, verkey, alias, role);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LedgerApi#ledgerRegisterNymPost");
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
 **did** | **String**| DID to register |
 **verkey** | **String**| Verification key |
 **alias** | **String**| Alias | [optional]
 **role** | **String**| Role | [optional] [enum: STEWARD, TRUSTEE, ENDORSER, NETWORK_MONITOR, reset]

### Return type

[**RegisterLedgerNymResponse**](RegisterLedgerNymResponse.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## ledgerRotatePublicDidKeypairPatch

> Object ledgerRotatePublicDidKeypairPatch()

Rotate key pair for public DID.

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.LedgerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        LedgerApi apiInstance = new LedgerApi(defaultClient);
        try {
            Object result = apiInstance.ledgerRotatePublicDidKeypairPatch();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LedgerApi#ledgerRotatePublicDidKeypairPatch");
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


## ledgerTaaAcceptPost

> Object ledgerTaaAcceptPost(body)

Accept the transaction author agreement

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.LedgerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        LedgerApi apiInstance = new LedgerApi(defaultClient);
        TAAAccept body = new TAAAccept(); // TAAAccept | 
        try {
            Object result = apiInstance.ledgerTaaAcceptPost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LedgerApi#ledgerTaaAcceptPost");
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
 **body** | [**TAAAccept**](TAAAccept.md)|  | [optional]

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


## ledgerTaaGet

> TAAResult ledgerTaaGet()

Fetch the current transaction author agreement, if any

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.LedgerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        LedgerApi apiInstance = new LedgerApi(defaultClient);
        try {
            TAAResult result = apiInstance.ledgerTaaGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LedgerApi#ledgerTaaGet");
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

[**TAAResult**](TAAResult.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


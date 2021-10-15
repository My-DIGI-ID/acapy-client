# WalletApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**walletDidCreatePost**](WalletApi.md#walletDidCreatePost) | **POST** /wallet/did/create | Create a local DID
[**walletDidGet**](WalletApi.md#walletDidGet) | **GET** /wallet/did | List wallet DIDs
[**walletDidLocalRotateKeypairPatch**](WalletApi.md#walletDidLocalRotateKeypairPatch) | **PATCH** /wallet/did/local/rotate-keypair | Rotate keypair for a DID not posted to the ledger
[**walletDidPublicGet**](WalletApi.md#walletDidPublicGet) | **GET** /wallet/did/public | Fetch the current public DID
[**walletDidPublicPost**](WalletApi.md#walletDidPublicPost) | **POST** /wallet/did/public | Assign the current public DID
[**walletGetDidEndpointGet**](WalletApi.md#walletGetDidEndpointGet) | **GET** /wallet/get-did-endpoint | Query DID endpoint in wallet
[**walletSetDidEndpointPost**](WalletApi.md#walletSetDidEndpointPost) | **POST** /wallet/set-did-endpoint | Update endpoint in wallet and on ledger if posted to it



## walletDidCreatePost

> DIDResult walletDidCreatePost(body)

Create a local DID

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.WalletApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        WalletApi apiInstance = new WalletApi(defaultClient);
        DIDCreate body = new DIDCreate(); // DIDCreate | 
        try {
            DIDResult result = apiInstance.walletDidCreatePost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletApi#walletDidCreatePost");
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
 **body** | [**DIDCreate**](DIDCreate.md)|  | [optional]

### Return type

[**DIDResult**](DIDResult.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## walletDidGet

> DIDList walletDidGet(did, keyType, method, posture, verkey)

List wallet DIDs

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.WalletApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        WalletApi apiInstance = new WalletApi(defaultClient);
        String did = "did_example"; // String | DID of interest
        String keyType = "keyType_example"; // String | Key type to query for.
        String method = "method_example"; // String | DID method to query for. e.g. sov to only fetch indy/sov DIDs
        String posture = "posture_example"; // String | Whether DID is current public DID, posted to ledger but current public DID, or local to the wallet
        String verkey = "verkey_example"; // String | Verification key of interest
        try {
            DIDList result = apiInstance.walletDidGet(did, keyType, method, posture, verkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletApi#walletDidGet");
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
 **did** | **String**| DID of interest | [optional]
 **keyType** | **String**| Key type to query for. | [optional] [enum: ed25519, bls12381g2]
 **method** | **String**| DID method to query for. e.g. sov to only fetch indy/sov DIDs | [optional] [enum: key, sov]
 **posture** | **String**| Whether DID is current public DID, posted to ledger but current public DID, or local to the wallet | [optional] [enum: public, posted, wallet_only]
 **verkey** | **String**| Verification key of interest | [optional]

### Return type

[**DIDList**](DIDList.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## walletDidLocalRotateKeypairPatch

> Object walletDidLocalRotateKeypairPatch(did)

Rotate keypair for a DID not posted to the ledger

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.WalletApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        WalletApi apiInstance = new WalletApi(defaultClient);
        String did = "did_example"; // String | DID of interest
        try {
            Object result = apiInstance.walletDidLocalRotateKeypairPatch(did);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletApi#walletDidLocalRotateKeypairPatch");
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


## walletDidPublicGet

> DIDResult walletDidPublicGet()

Fetch the current public DID

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.WalletApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        WalletApi apiInstance = new WalletApi(defaultClient);
        try {
            DIDResult result = apiInstance.walletDidPublicGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletApi#walletDidPublicGet");
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

[**DIDResult**](DIDResult.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## walletDidPublicPost

> DIDResult walletDidPublicPost(did)

Assign the current public DID

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.WalletApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        WalletApi apiInstance = new WalletApi(defaultClient);
        String did = "did_example"; // String | DID of interest
        try {
            DIDResult result = apiInstance.walletDidPublicPost(did);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletApi#walletDidPublicPost");
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

[**DIDResult**](DIDResult.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## walletGetDidEndpointGet

> DIDEndpoint walletGetDidEndpointGet(did)

Query DID endpoint in wallet

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.WalletApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        WalletApi apiInstance = new WalletApi(defaultClient);
        String did = "did_example"; // String | DID of interest
        try {
            DIDEndpoint result = apiInstance.walletGetDidEndpointGet(did);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletApi#walletGetDidEndpointGet");
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

[**DIDEndpoint**](DIDEndpoint.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## walletSetDidEndpointPost

> Object walletSetDidEndpointPost(body)

Update endpoint in wallet and on ledger if posted to it

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.WalletApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        WalletApi apiInstance = new WalletApi(defaultClient);
        DIDEndpointWithType body = new DIDEndpointWithType(); // DIDEndpointWithType | 
        try {
            Object result = apiInstance.walletSetDidEndpointPost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletApi#walletSetDidEndpointPost");
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
 **body** | [**DIDEndpointWithType**](DIDEndpointWithType.md)|  | [optional]

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


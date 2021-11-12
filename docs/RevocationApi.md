# RevocationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**revocationActiveRegistryCredDefIdGet**](RevocationApi.md#revocationActiveRegistryCredDefIdGet) | **GET** /revocation/active-registry/{cred_def_id} | Get current active revocation registry by credential definition id
[**revocationClearPendingRevocationsPost**](RevocationApi.md#revocationClearPendingRevocationsPost) | **POST** /revocation/clear-pending-revocations | Clear pending revocations
[**revocationCreateRegistryPost**](RevocationApi.md#revocationCreateRegistryPost) | **POST** /revocation/create-registry | Creates a new revocation registry
[**revocationCredentialRecordGet**](RevocationApi.md#revocationCredentialRecordGet) | **GET** /revocation/credential-record | Get credential revocation status
[**revocationPublishRevocationsPost**](RevocationApi.md#revocationPublishRevocationsPost) | **POST** /revocation/publish-revocations | Publish pending revocations to ledger
[**revocationRegistriesCreatedGet**](RevocationApi.md#revocationRegistriesCreatedGet) | **GET** /revocation/registries/created | Search for matching revocation registries that current agent created
[**revocationRegistryRevRegIdDefinitionPost**](RevocationApi.md#revocationRegistryRevRegIdDefinitionPost) | **POST** /revocation/registry/{rev_reg_id}/definition | Send revocation registry definition to ledger
[**revocationRegistryRevRegIdEntryPost**](RevocationApi.md#revocationRegistryRevRegIdEntryPost) | **POST** /revocation/registry/{rev_reg_id}/entry | Send revocation registry entry to ledger
[**revocationRegistryRevRegIdGet**](RevocationApi.md#revocationRegistryRevRegIdGet) | **GET** /revocation/registry/{rev_reg_id} | Get revocation registry by revocation registry id
[**revocationRegistryRevRegIdIssuedGet**](RevocationApi.md#revocationRegistryRevRegIdIssuedGet) | **GET** /revocation/registry/{rev_reg_id}/issued | Get number of credentials issued against revocation registry
[**revocationRegistryRevRegIdPatch**](RevocationApi.md#revocationRegistryRevRegIdPatch) | **PATCH** /revocation/registry/{rev_reg_id} | Update revocation registry with new public URI to its tails file
[**revocationRegistryRevRegIdSetStatePatch**](RevocationApi.md#revocationRegistryRevRegIdSetStatePatch) | **PATCH** /revocation/registry/{rev_reg_id}/set-state | Set revocation registry state manually
[**revocationRegistryRevRegIdTailsFileGet**](RevocationApi.md#revocationRegistryRevRegIdTailsFileGet) | **GET** /revocation/registry/{rev_reg_id}/tails-file | Download tails file
[**revocationRegistryRevRegIdTailsFilePut**](RevocationApi.md#revocationRegistryRevRegIdTailsFilePut) | **PUT** /revocation/registry/{rev_reg_id}/tails-file | Upload local tails file to server
[**revocationRevokePost**](RevocationApi.md#revocationRevokePost) | **POST** /revocation/revoke | Revoke an issued credential



## revocationActiveRegistryCredDefIdGet

> RevRegResult revocationActiveRegistryCredDefIdGet(credDefId)

Get current active revocation registry by credential definition id

### Example

```java
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.RevocationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        RevocationApi apiInstance = new RevocationApi(defaultClient);
        String credDefId = "credDefId_example"; // String | Credential definition identifier
        try {
            RevRegResult result = apiInstance.revocationActiveRegistryCredDefIdGet(credDefId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RevocationApi#revocationActiveRegistryCredDefIdGet");
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
 **credDefId** | **String**| Credential definition identifier |

### Return type

[**RevRegResult**](RevRegResult.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## revocationClearPendingRevocationsPost

> PublishRevocations revocationClearPendingRevocationsPost(body)

Clear pending revocations

### Example

```java
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.RevocationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        RevocationApi apiInstance = new RevocationApi(defaultClient);
        ClearPendingRevocationsRequest body = new ClearPendingRevocationsRequest(); // ClearPendingRevocationsRequest | 
        try {
            PublishRevocations result = apiInstance.revocationClearPendingRevocationsPost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RevocationApi#revocationClearPendingRevocationsPost");
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
 **body** | [**ClearPendingRevocationsRequest**](ClearPendingRevocationsRequest.md)|  | [optional]

### Return type

[**PublishRevocations**](PublishRevocations.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## revocationCreateRegistryPost

> RevRegResult revocationCreateRegistryPost(body)

Creates a new revocation registry

### Example

```java
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.RevocationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        RevocationApi apiInstance = new RevocationApi(defaultClient);
        RevRegCreateRequest body = new RevRegCreateRequest(); // RevRegCreateRequest | 
        try {
            RevRegResult result = apiInstance.revocationCreateRegistryPost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RevocationApi#revocationCreateRegistryPost");
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
 **body** | [**RevRegCreateRequest**](RevRegCreateRequest.md)|  | [optional]

### Return type

[**RevRegResult**](RevRegResult.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## revocationCredentialRecordGet

> CredRevRecordResult revocationCredentialRecordGet(credExId, credRevId, revRegId)

Get credential revocation status

### Example

```java
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.RevocationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        RevocationApi apiInstance = new RevocationApi(defaultClient);
        String credExId = "credExId_example"; // String | Credential exchange identifier
        String credRevId = "credRevId_example"; // String | Credential revocation identifier
        String revRegId = "revRegId_example"; // String | Revocation registry identifier
        try {
            CredRevRecordResult result = apiInstance.revocationCredentialRecordGet(credExId, credRevId, revRegId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RevocationApi#revocationCredentialRecordGet");
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
 **credExId** | **String**| Credential exchange identifier | [optional]
 **credRevId** | **String**| Credential revocation identifier | [optional]
 **revRegId** | **String**| Revocation registry identifier | [optional]

### Return type

[**CredRevRecordResult**](CredRevRecordResult.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## revocationPublishRevocationsPost

> TxnOrPublishRevocationsResult revocationPublishRevocationsPost(connId, createTransactionForEndorser, body)

Publish pending revocations to ledger

### Example

```java
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.RevocationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        RevocationApi apiInstance = new RevocationApi(defaultClient);
        String connId = "connId_example"; // String | Connection identifier
        Boolean createTransactionForEndorser = true; // Boolean | Create Transaction For Endorser's signature
        PublishRevocations body = new PublishRevocations(); // PublishRevocations | 
        try {
            TxnOrPublishRevocationsResult result = apiInstance.revocationPublishRevocationsPost(connId, createTransactionForEndorser, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RevocationApi#revocationPublishRevocationsPost");
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
 **connId** | **String**| Connection identifier | [optional]
 **createTransactionForEndorser** | **Boolean**| Create Transaction For Endorser&#39;s signature | [optional]
 **body** | [**PublishRevocations**](PublishRevocations.md)|  | [optional]

### Return type

[**TxnOrPublishRevocationsResult**](TxnOrPublishRevocationsResult.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## revocationRegistriesCreatedGet

> RevRegsCreated revocationRegistriesCreatedGet(credDefId, state)

Search for matching revocation registries that current agent created

### Example

```java
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.RevocationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        RevocationApi apiInstance = new RevocationApi(defaultClient);
        String credDefId = "credDefId_example"; // String | Credential definition identifier
        String state = "state_example"; // String | Revocation registry state
        try {
            RevRegsCreated result = apiInstance.revocationRegistriesCreatedGet(credDefId, state);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RevocationApi#revocationRegistriesCreatedGet");
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
 **credDefId** | **String**| Credential definition identifier | [optional]
 **state** | **String**| Revocation registry state | [optional] [enum: init, generated, posted, active, full]

### Return type

[**RevRegsCreated**](RevRegsCreated.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## revocationRegistryRevRegIdDefinitionPost

> TxnOrRevRegResult revocationRegistryRevRegIdDefinitionPost(revRegId, connId, createTransactionForEndorser)

Send revocation registry definition to ledger

### Example

```java
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.RevocationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        RevocationApi apiInstance = new RevocationApi(defaultClient);
        String revRegId = "revRegId_example"; // String | Revocation Registry identifier
        String connId = "connId_example"; // String | Connection identifier
        Boolean createTransactionForEndorser = true; // Boolean | Create Transaction For Endorser's signature
        try {
            TxnOrRevRegResult result = apiInstance.revocationRegistryRevRegIdDefinitionPost(revRegId, connId, createTransactionForEndorser);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RevocationApi#revocationRegistryRevRegIdDefinitionPost");
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
 **revRegId** | **String**| Revocation Registry identifier |
 **connId** | **String**| Connection identifier | [optional]
 **createTransactionForEndorser** | **Boolean**| Create Transaction For Endorser&#39;s signature | [optional]

### Return type

[**TxnOrRevRegResult**](TxnOrRevRegResult.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## revocationRegistryRevRegIdEntryPost

> RevRegResult revocationRegistryRevRegIdEntryPost(revRegId, connId, createTransactionForEndorser)

Send revocation registry entry to ledger

### Example

```java
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.RevocationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        RevocationApi apiInstance = new RevocationApi(defaultClient);
        String revRegId = "revRegId_example"; // String | Revocation Registry identifier
        String connId = "connId_example"; // String | Connection identifier
        Boolean createTransactionForEndorser = true; // Boolean | Create Transaction For Endorser's signature
        try {
            RevRegResult result = apiInstance.revocationRegistryRevRegIdEntryPost(revRegId, connId, createTransactionForEndorser);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RevocationApi#revocationRegistryRevRegIdEntryPost");
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
 **revRegId** | **String**| Revocation Registry identifier |
 **connId** | **String**| Connection identifier | [optional]
 **createTransactionForEndorser** | **Boolean**| Create Transaction For Endorser&#39;s signature | [optional]

### Return type

[**RevRegResult**](RevRegResult.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## revocationRegistryRevRegIdGet

> RevRegResult revocationRegistryRevRegIdGet(revRegId)

Get revocation registry by revocation registry id

### Example

```java
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.RevocationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        RevocationApi apiInstance = new RevocationApi(defaultClient);
        String revRegId = "revRegId_example"; // String | Revocation Registry identifier
        try {
            RevRegResult result = apiInstance.revocationRegistryRevRegIdGet(revRegId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RevocationApi#revocationRegistryRevRegIdGet");
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
 **revRegId** | **String**| Revocation Registry identifier |

### Return type

[**RevRegResult**](RevRegResult.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## revocationRegistryRevRegIdIssuedGet

> RevRegIssuedResult revocationRegistryRevRegIdIssuedGet(revRegId)

Get number of credentials issued against revocation registry

### Example

```java
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.RevocationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        RevocationApi apiInstance = new RevocationApi(defaultClient);
        String revRegId = "revRegId_example"; // String | Revocation Registry identifier
        try {
            RevRegIssuedResult result = apiInstance.revocationRegistryRevRegIdIssuedGet(revRegId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RevocationApi#revocationRegistryRevRegIdIssuedGet");
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
 **revRegId** | **String**| Revocation Registry identifier |

### Return type

[**RevRegIssuedResult**](RevRegIssuedResult.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## revocationRegistryRevRegIdPatch

> RevRegResult revocationRegistryRevRegIdPatch(revRegId, body)

Update revocation registry with new public URI to its tails file

### Example

```java
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.RevocationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        RevocationApi apiInstance = new RevocationApi(defaultClient);
        String revRegId = "revRegId_example"; // String | Revocation Registry identifier
        RevRegUpdateTailsFileUri body = new RevRegUpdateTailsFileUri(); // RevRegUpdateTailsFileUri | 
        try {
            RevRegResult result = apiInstance.revocationRegistryRevRegIdPatch(revRegId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RevocationApi#revocationRegistryRevRegIdPatch");
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
 **revRegId** | **String**| Revocation Registry identifier |
 **body** | [**RevRegUpdateTailsFileUri**](RevRegUpdateTailsFileUri.md)|  | [optional]

### Return type

[**RevRegResult**](RevRegResult.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## revocationRegistryRevRegIdSetStatePatch

> RevRegResult revocationRegistryRevRegIdSetStatePatch(revRegId, state)

Set revocation registry state manually

### Example

```java
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.RevocationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        RevocationApi apiInstance = new RevocationApi(defaultClient);
        String revRegId = "revRegId_example"; // String | Revocation Registry identifier
        String state = "state_example"; // String | Revocation registry state to set
        try {
            RevRegResult result = apiInstance.revocationRegistryRevRegIdSetStatePatch(revRegId, state);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RevocationApi#revocationRegistryRevRegIdSetStatePatch");
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
 **revRegId** | **String**| Revocation Registry identifier |
 **state** | **String**| Revocation registry state to set | [enum: init, generated, posted, active, full]

### Return type

[**RevRegResult**](RevRegResult.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## revocationRegistryRevRegIdTailsFileGet

> File revocationRegistryRevRegIdTailsFileGet(revRegId)

Download tails file

### Example

```java
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.RevocationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        RevocationApi apiInstance = new RevocationApi(defaultClient);
        String revRegId = "revRegId_example"; // String | Revocation Registry identifier
        try {
            File result = apiInstance.revocationRegistryRevRegIdTailsFileGet(revRegId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RevocationApi#revocationRegistryRevRegIdTailsFileGet");
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
 **revRegId** | **String**| Revocation Registry identifier |

### Return type

[**File**](File.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | tails file |  -  |


## revocationRegistryRevRegIdTailsFilePut

> Object revocationRegistryRevRegIdTailsFilePut(revRegId)

Upload local tails file to server

### Example

```java
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.RevocationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        RevocationApi apiInstance = new RevocationApi(defaultClient);
        String revRegId = "revRegId_example"; // String | Revocation Registry identifier
        try {
            Object result = apiInstance.revocationRegistryRevRegIdTailsFilePut(revRegId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RevocationApi#revocationRegistryRevRegIdTailsFilePut");
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
 **revRegId** | **String**| Revocation Registry identifier |

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


## revocationRevokePost

> Object revocationRevokePost(body)

Revoke an issued credential

### Example

```java
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.RevocationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        RevocationApi apiInstance = new RevocationApi(defaultClient);
        RevokeRequest body = new RevokeRequest(); // RevokeRequest | 
        try {
            Object result = apiInstance.revocationRevokePost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RevocationApi#revocationRevokePost");
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
 **body** | [**RevokeRequest**](RevokeRequest.md)|  | [optional]

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


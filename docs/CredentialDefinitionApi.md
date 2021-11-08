# CredentialDefinitionApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**credentialDefinitionsCreatedGet**](CredentialDefinitionApi.md#credentialDefinitionsCreatedGet) | **GET** /credential-definitions/created | Search for matching credential definitions that agent originated
[**credentialDefinitionsCredDefIdGet**](CredentialDefinitionApi.md#credentialDefinitionsCredDefIdGet) | **GET** /credential-definitions/{cred_def_id} | Gets a credential definition from the ledger
[**credentialDefinitionsPost**](CredentialDefinitionApi.md#credentialDefinitionsPost) | **POST** /credential-definitions | Sends a credential definition to the ledger



## credentialDefinitionsCreatedGet

> CredentialDefinitionsCreatedResult credentialDefinitionsCreatedGet(credDefId, issuerDid, schemaId, schemaIssuerDid, schemaName, schemaVersion)

Search for matching credential definitions that agent originated

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.CredentialDefinitionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        CredentialDefinitionApi apiInstance = new CredentialDefinitionApi(defaultClient);
        String credDefId = "credDefId_example"; // String | Credential definition id
        String issuerDid = "issuerDid_example"; // String | Issuer DID
        String schemaId = "schemaId_example"; // String | Schema identifier
        String schemaIssuerDid = "schemaIssuerDid_example"; // String | Schema issuer DID
        String schemaName = "schemaName_example"; // String | Schema name
        String schemaVersion = "schemaVersion_example"; // String | Schema version
        try {
            CredentialDefinitionsCreatedResult result = apiInstance.credentialDefinitionsCreatedGet(credDefId, issuerDid, schemaId, schemaIssuerDid, schemaName, schemaVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialDefinitionApi#credentialDefinitionsCreatedGet");
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
 **credDefId** | **String**| Credential definition id | [optional]
 **issuerDid** | **String**| Issuer DID | [optional]
 **schemaId** | **String**| Schema identifier | [optional]
 **schemaIssuerDid** | **String**| Schema issuer DID | [optional]
 **schemaName** | **String**| Schema name | [optional]
 **schemaVersion** | **String**| Schema version | [optional]

### Return type

[**CredentialDefinitionsCreatedResult**](CredentialDefinitionsCreatedResult.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## credentialDefinitionsCredDefIdGet

> CredentialDefinitionGetResult credentialDefinitionsCredDefIdGet(credDefId)

Gets a credential definition from the ledger

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.CredentialDefinitionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        CredentialDefinitionApi apiInstance = new CredentialDefinitionApi(defaultClient);
        String credDefId = "credDefId_example"; // String | Credential definition identifier
        try {
            CredentialDefinitionGetResult result = apiInstance.credentialDefinitionsCredDefIdGet(credDefId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialDefinitionApi#credentialDefinitionsCredDefIdGet");
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

[**CredentialDefinitionGetResult**](CredentialDefinitionGetResult.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## credentialDefinitionsPost

> TxnOrCredentialDefinitionSendResult credentialDefinitionsPost(connId, createTransactionForEndorser, body)

Sends a credential definition to the ledger

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.CredentialDefinitionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        CredentialDefinitionApi apiInstance = new CredentialDefinitionApi(defaultClient);
        String connId = "connId_example"; // String | Connection identifier
        Boolean createTransactionForEndorser = true; // Boolean | Create Transaction For Endorser's signature
        CredentialDefinitionSendRequest body = new CredentialDefinitionSendRequest(); // CredentialDefinitionSendRequest | 
        try {
            TxnOrCredentialDefinitionSendResult result = apiInstance.credentialDefinitionsPost(connId, createTransactionForEndorser, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialDefinitionApi#credentialDefinitionsPost");
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
 **body** | [**CredentialDefinitionSendRequest**](CredentialDefinitionSendRequest.md)|  | [optional]

### Return type

[**TxnOrCredentialDefinitionSendResult**](TxnOrCredentialDefinitionSendResult.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


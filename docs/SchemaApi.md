# SchemaApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**schemasCreatedGet**](SchemaApi.md#schemasCreatedGet) | **GET** /schemas/created | Search for matching schema that agent originated
[**schemasPost**](SchemaApi.md#schemasPost) | **POST** /schemas | Sends a schema to the ledger
[**schemasSchemaIdGet**](SchemaApi.md#schemasSchemaIdGet) | **GET** /schemas/{schema_id} | Gets a schema from the ledger



## schemasCreatedGet

> SchemasCreatedResult schemasCreatedGet(schemaId, schemaIssuerDid, schemaName, schemaVersion)

Search for matching schema that agent originated

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.SchemaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        SchemaApi apiInstance = new SchemaApi(defaultClient);
        String schemaId = "schemaId_example"; // String | Schema identifier
        String schemaIssuerDid = "schemaIssuerDid_example"; // String | Schema issuer DID
        String schemaName = "schemaName_example"; // String | Schema name
        String schemaVersion = "schemaVersion_example"; // String | Schema version
        try {
            SchemasCreatedResult result = apiInstance.schemasCreatedGet(schemaId, schemaIssuerDid, schemaName, schemaVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SchemaApi#schemasCreatedGet");
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
 **schemaId** | **String**| Schema identifier | [optional]
 **schemaIssuerDid** | **String**| Schema issuer DID | [optional]
 **schemaName** | **String**| Schema name | [optional]
 **schemaVersion** | **String**| Schema version | [optional]

### Return type

[**SchemasCreatedResult**](SchemasCreatedResult.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## schemasPost

> TxnOrSchemaSendResult schemasPost(connId, createTransactionForEndorser, body)

Sends a schema to the ledger

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.SchemaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        SchemaApi apiInstance = new SchemaApi(defaultClient);
        String connId = "connId_example"; // String | Connection identifier
        Boolean createTransactionForEndorser = true; // Boolean | Create Transaction For Endorser's signature
        SchemaSendRequest body = new SchemaSendRequest(); // SchemaSendRequest | 
        try {
            TxnOrSchemaSendResult result = apiInstance.schemasPost(connId, createTransactionForEndorser, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SchemaApi#schemasPost");
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
 **body** | [**SchemaSendRequest**](SchemaSendRequest.md)|  | [optional]

### Return type

[**TxnOrSchemaSendResult**](TxnOrSchemaSendResult.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## schemasSchemaIdGet

> SchemaGetResult schemasSchemaIdGet(schemaId)

Gets a schema from the ledger

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.SchemaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        SchemaApi apiInstance = new SchemaApi(defaultClient);
        String schemaId = "schemaId_example"; // String | Schema identifier
        try {
            SchemaGetResult result = apiInstance.schemasSchemaIdGet(schemaId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SchemaApi#schemasSchemaIdGet");
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
 **schemaId** | **String**| Schema identifier |

### Return type

[**SchemaGetResult**](SchemaGetResult.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


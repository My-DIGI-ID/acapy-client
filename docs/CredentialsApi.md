# CredentialsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**credentialCredentialIdDelete**](CredentialsApi.md#credentialCredentialIdDelete) | **DELETE** /credential/{credential_id} | Remove credential from wallet by id
[**credentialCredentialIdGet**](CredentialsApi.md#credentialCredentialIdGet) | **GET** /credential/{credential_id} | Fetch credential from wallet by id
[**credentialMimeTypesCredentialIdGet**](CredentialsApi.md#credentialMimeTypesCredentialIdGet) | **GET** /credential/mime-types/{credential_id} | Get attribute MIME types from wallet
[**credentialRevokedCredentialIdGet**](CredentialsApi.md#credentialRevokedCredentialIdGet) | **GET** /credential/revoked/{credential_id} | Query credential revocation status by id
[**credentialW3cCredentialIdDelete**](CredentialsApi.md#credentialW3cCredentialIdDelete) | **DELETE** /credential/w3c/{credential_id} | Remove W3C credential from wallet by id
[**credentialW3cCredentialIdGet**](CredentialsApi.md#credentialW3cCredentialIdGet) | **GET** /credential/w3c/{credential_id} | Fetch W3C credential from wallet by id
[**credentialsGet**](CredentialsApi.md#credentialsGet) | **GET** /credentials | Fetch credentials from wallet
[**credentialsW3cPost**](CredentialsApi.md#credentialsW3cPost) | **POST** /credentials/w3c | Fetch W3C credentials from wallet



## credentialCredentialIdDelete

> Object credentialCredentialIdDelete(credentialId)

Remove credential from wallet by id

### Example

```java
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.CredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        CredentialsApi apiInstance = new CredentialsApi(defaultClient);
        String credentialId = "credentialId_example"; // String | Credential identifier
        try {
            Object result = apiInstance.credentialCredentialIdDelete(credentialId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialsApi#credentialCredentialIdDelete");
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
 **credentialId** | **String**| Credential identifier |

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


## credentialCredentialIdGet

> IndyCredInfo credentialCredentialIdGet(credentialId)

Fetch credential from wallet by id

### Example

```java
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.CredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        CredentialsApi apiInstance = new CredentialsApi(defaultClient);
        String credentialId = "credentialId_example"; // String | Credential identifier
        try {
            IndyCredInfo result = apiInstance.credentialCredentialIdGet(credentialId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialsApi#credentialCredentialIdGet");
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
 **credentialId** | **String**| Credential identifier |

### Return type

[**IndyCredInfo**](IndyCredInfo.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## credentialMimeTypesCredentialIdGet

> AttributeMimeTypesResult credentialMimeTypesCredentialIdGet(credentialId)

Get attribute MIME types from wallet

### Example

```java
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.CredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        CredentialsApi apiInstance = new CredentialsApi(defaultClient);
        String credentialId = "credentialId_example"; // String | Credential identifier
        try {
            AttributeMimeTypesResult result = apiInstance.credentialMimeTypesCredentialIdGet(credentialId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialsApi#credentialMimeTypesCredentialIdGet");
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
 **credentialId** | **String**| Credential identifier |

### Return type

[**AttributeMimeTypesResult**](AttributeMimeTypesResult.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## credentialRevokedCredentialIdGet

> CredRevokedResult credentialRevokedCredentialIdGet(credentialId, from, to)

Query credential revocation status by id

### Example

```java
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.CredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        CredentialsApi apiInstance = new CredentialsApi(defaultClient);
        String credentialId = "credentialId_example"; // String | Credential identifier
        String from = "from_example"; // String | Earliest epoch of revocation status interval of interest
        String to = "to_example"; // String | Latest epoch of revocation status interval of interest
        try {
            CredRevokedResult result = apiInstance.credentialRevokedCredentialIdGet(credentialId, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialsApi#credentialRevokedCredentialIdGet");
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
 **credentialId** | **String**| Credential identifier |
 **from** | **String**| Earliest epoch of revocation status interval of interest | [optional]
 **to** | **String**| Latest epoch of revocation status interval of interest | [optional]

### Return type

[**CredRevokedResult**](CredRevokedResult.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## credentialW3cCredentialIdDelete

> Object credentialW3cCredentialIdDelete(credentialId)

Remove W3C credential from wallet by id

### Example

```java
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.CredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        CredentialsApi apiInstance = new CredentialsApi(defaultClient);
        String credentialId = "credentialId_example"; // String | Credential identifier
        try {
            Object result = apiInstance.credentialW3cCredentialIdDelete(credentialId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialsApi#credentialW3cCredentialIdDelete");
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
 **credentialId** | **String**| Credential identifier |

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


## credentialW3cCredentialIdGet

> VCRecord credentialW3cCredentialIdGet(credentialId)

Fetch W3C credential from wallet by id

### Example

```java
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.CredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        CredentialsApi apiInstance = new CredentialsApi(defaultClient);
        String credentialId = "credentialId_example"; // String | Credential identifier
        try {
            VCRecord result = apiInstance.credentialW3cCredentialIdGet(credentialId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialsApi#credentialW3cCredentialIdGet");
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
 **credentialId** | **String**| Credential identifier |

### Return type

[**VCRecord**](VCRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## credentialsGet

> CredInfoList credentialsGet(count, start, wql)

Fetch credentials from wallet

### Example

```java
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.CredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        CredentialsApi apiInstance = new CredentialsApi(defaultClient);
        String count = "count_example"; // String | Maximum number to retrieve
        String start = "start_example"; // String | Start index
        String wql = "wql_example"; // String | (JSON) WQL query
        try {
            CredInfoList result = apiInstance.credentialsGet(count, start, wql);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialsApi#credentialsGet");
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
 **count** | **String**| Maximum number to retrieve | [optional]
 **start** | **String**| Start index | [optional]
 **wql** | **String**| (JSON) WQL query | [optional]

### Return type

[**CredInfoList**](CredInfoList.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## credentialsW3cPost

> VCRecordList credentialsW3cPost(count, start, wql, body)

Fetch W3C credentials from wallet

### Example

```java
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.CredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        CredentialsApi apiInstance = new CredentialsApi(defaultClient);
        String count = "count_example"; // String | Maximum number to retrieve
        String start = "start_example"; // String | Start index
        String wql = "wql_example"; // String | (JSON) WQL query
        W3CCredentialsListRequest body = new W3CCredentialsListRequest(); // W3CCredentialsListRequest | 
        try {
            VCRecordList result = apiInstance.credentialsW3cPost(count, start, wql, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialsApi#credentialsW3cPost");
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
 **count** | **String**| Maximum number to retrieve | [optional]
 **start** | **String**| Start index | [optional]
 **wql** | **String**| (JSON) WQL query | [optional]
 **body** | [**W3CCredentialsListRequest**](W3CCredentialsListRequest.md)|  | [optional]

### Return type

[**VCRecordList**](VCRecordList.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


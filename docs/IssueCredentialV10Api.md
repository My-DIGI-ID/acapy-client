# IssueCredentialV10Api

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**issueCredentialCreateOfferPost**](IssueCredentialV10Api.md#issueCredentialCreateOfferPost) | **POST** /issue-credential/create-offer | Create a credential offer, independent of any proposal or connection
[**issueCredentialCreatePost**](IssueCredentialV10Api.md#issueCredentialCreatePost) | **POST** /issue-credential/create | Send holder a credential, automating entire flow
[**issueCredentialRecordsCredExIdDelete**](IssueCredentialV10Api.md#issueCredentialRecordsCredExIdDelete) | **DELETE** /issue-credential/records/{cred_ex_id} | Remove an existing credential exchange record
[**issueCredentialRecordsCredExIdGet**](IssueCredentialV10Api.md#issueCredentialRecordsCredExIdGet) | **GET** /issue-credential/records/{cred_ex_id} | Fetch a single credential exchange record
[**issueCredentialRecordsCredExIdIssuePost**](IssueCredentialV10Api.md#issueCredentialRecordsCredExIdIssuePost) | **POST** /issue-credential/records/{cred_ex_id}/issue | Send holder a credential
[**issueCredentialRecordsCredExIdProblemReportPost**](IssueCredentialV10Api.md#issueCredentialRecordsCredExIdProblemReportPost) | **POST** /issue-credential/records/{cred_ex_id}/problem-report | Send a problem report for credential exchange
[**issueCredentialRecordsCredExIdSendOfferPost**](IssueCredentialV10Api.md#issueCredentialRecordsCredExIdSendOfferPost) | **POST** /issue-credential/records/{cred_ex_id}/send-offer | Send holder a credential offer in reference to a proposal with preview
[**issueCredentialRecordsCredExIdSendRequestPost**](IssueCredentialV10Api.md#issueCredentialRecordsCredExIdSendRequestPost) | **POST** /issue-credential/records/{cred_ex_id}/send-request | Send issuer a credential request
[**issueCredentialRecordsCredExIdStorePost**](IssueCredentialV10Api.md#issueCredentialRecordsCredExIdStorePost) | **POST** /issue-credential/records/{cred_ex_id}/store | Store a received credential
[**issueCredentialRecordsGet**](IssueCredentialV10Api.md#issueCredentialRecordsGet) | **GET** /issue-credential/records | Fetch all credential exchange records
[**issueCredentialSendOfferPost**](IssueCredentialV10Api.md#issueCredentialSendOfferPost) | **POST** /issue-credential/send-offer | Send holder a credential offer, independent of any proposal
[**issueCredentialSendPost**](IssueCredentialV10Api.md#issueCredentialSendPost) | **POST** /issue-credential/send | Send holder a credential, automating entire flow
[**issueCredentialSendProposalPost**](IssueCredentialV10Api.md#issueCredentialSendProposalPost) | **POST** /issue-credential/send-proposal | Send issuer a credential proposal



## issueCredentialCreateOfferPost

> V10CredentialExchange issueCredentialCreateOfferPost(body)

Create a credential offer, independent of any proposal or connection

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.IssueCredentialV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        IssueCredentialV10Api apiInstance = new IssueCredentialV10Api(defaultClient);
        V10CredentialConnFreeOfferRequest body = new V10CredentialConnFreeOfferRequest(); // V10CredentialConnFreeOfferRequest | 
        try {
            V10CredentialExchange result = apiInstance.issueCredentialCreateOfferPost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IssueCredentialV10Api#issueCredentialCreateOfferPost");
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
 **body** | [**V10CredentialConnFreeOfferRequest**](V10CredentialConnFreeOfferRequest.md)|  | [optional]

### Return type

[**V10CredentialExchange**](V10CredentialExchange.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## issueCredentialCreatePost

> V10CredentialExchange issueCredentialCreatePost(body)

Send holder a credential, automating entire flow

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.IssueCredentialV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        IssueCredentialV10Api apiInstance = new IssueCredentialV10Api(defaultClient);
        V10CredentialCreate body = new V10CredentialCreate(); // V10CredentialCreate | 
        try {
            V10CredentialExchange result = apiInstance.issueCredentialCreatePost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IssueCredentialV10Api#issueCredentialCreatePost");
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
 **body** | [**V10CredentialCreate**](V10CredentialCreate.md)|  | [optional]

### Return type

[**V10CredentialExchange**](V10CredentialExchange.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## issueCredentialRecordsCredExIdDelete

> Object issueCredentialRecordsCredExIdDelete(credExId)

Remove an existing credential exchange record

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.IssueCredentialV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        IssueCredentialV10Api apiInstance = new IssueCredentialV10Api(defaultClient);
        String credExId = "credExId_example"; // String | Credential exchange identifier
        try {
            Object result = apiInstance.issueCredentialRecordsCredExIdDelete(credExId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IssueCredentialV10Api#issueCredentialRecordsCredExIdDelete");
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
 **credExId** | **String**| Credential exchange identifier |

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


## issueCredentialRecordsCredExIdGet

> V10CredentialExchange issueCredentialRecordsCredExIdGet(credExId)

Fetch a single credential exchange record

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.IssueCredentialV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        IssueCredentialV10Api apiInstance = new IssueCredentialV10Api(defaultClient);
        String credExId = "credExId_example"; // String | Credential exchange identifier
        try {
            V10CredentialExchange result = apiInstance.issueCredentialRecordsCredExIdGet(credExId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IssueCredentialV10Api#issueCredentialRecordsCredExIdGet");
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
 **credExId** | **String**| Credential exchange identifier |

### Return type

[**V10CredentialExchange**](V10CredentialExchange.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## issueCredentialRecordsCredExIdIssuePost

> V10CredentialExchange issueCredentialRecordsCredExIdIssuePost(credExId, body)

Send holder a credential

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.IssueCredentialV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        IssueCredentialV10Api apiInstance = new IssueCredentialV10Api(defaultClient);
        String credExId = "credExId_example"; // String | Credential exchange identifier
        V10CredentialIssueRequest body = new V10CredentialIssueRequest(); // V10CredentialIssueRequest | 
        try {
            V10CredentialExchange result = apiInstance.issueCredentialRecordsCredExIdIssuePost(credExId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IssueCredentialV10Api#issueCredentialRecordsCredExIdIssuePost");
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
 **credExId** | **String**| Credential exchange identifier |
 **body** | [**V10CredentialIssueRequest**](V10CredentialIssueRequest.md)|  | [optional]

### Return type

[**V10CredentialExchange**](V10CredentialExchange.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## issueCredentialRecordsCredExIdProblemReportPost

> Object issueCredentialRecordsCredExIdProblemReportPost(credExId, body)

Send a problem report for credential exchange

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.IssueCredentialV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        IssueCredentialV10Api apiInstance = new IssueCredentialV10Api(defaultClient);
        String credExId = "credExId_example"; // String | Credential exchange identifier
        V10CredentialProblemReportRequest body = new V10CredentialProblemReportRequest(); // V10CredentialProblemReportRequest | 
        try {
            Object result = apiInstance.issueCredentialRecordsCredExIdProblemReportPost(credExId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IssueCredentialV10Api#issueCredentialRecordsCredExIdProblemReportPost");
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
 **credExId** | **String**| Credential exchange identifier |
 **body** | [**V10CredentialProblemReportRequest**](V10CredentialProblemReportRequest.md)|  | [optional]

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


## issueCredentialRecordsCredExIdSendOfferPost

> V10CredentialExchange issueCredentialRecordsCredExIdSendOfferPost(credExId, body)

Send holder a credential offer in reference to a proposal with preview

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.IssueCredentialV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        IssueCredentialV10Api apiInstance = new IssueCredentialV10Api(defaultClient);
        String credExId = "credExId_example"; // String | Credential exchange identifier
        V10CredentialBoundOfferRequest body = new V10CredentialBoundOfferRequest(); // V10CredentialBoundOfferRequest | 
        try {
            V10CredentialExchange result = apiInstance.issueCredentialRecordsCredExIdSendOfferPost(credExId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IssueCredentialV10Api#issueCredentialRecordsCredExIdSendOfferPost");
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
 **credExId** | **String**| Credential exchange identifier |
 **body** | [**V10CredentialBoundOfferRequest**](V10CredentialBoundOfferRequest.md)|  | [optional]

### Return type

[**V10CredentialExchange**](V10CredentialExchange.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## issueCredentialRecordsCredExIdSendRequestPost

> V10CredentialExchange issueCredentialRecordsCredExIdSendRequestPost(credExId)

Send issuer a credential request

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.IssueCredentialV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        IssueCredentialV10Api apiInstance = new IssueCredentialV10Api(defaultClient);
        String credExId = "credExId_example"; // String | Credential exchange identifier
        try {
            V10CredentialExchange result = apiInstance.issueCredentialRecordsCredExIdSendRequestPost(credExId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IssueCredentialV10Api#issueCredentialRecordsCredExIdSendRequestPost");
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
 **credExId** | **String**| Credential exchange identifier |

### Return type

[**V10CredentialExchange**](V10CredentialExchange.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## issueCredentialRecordsCredExIdStorePost

> V10CredentialExchange issueCredentialRecordsCredExIdStorePost(credExId, body)

Store a received credential

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.IssueCredentialV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        IssueCredentialV10Api apiInstance = new IssueCredentialV10Api(defaultClient);
        String credExId = "credExId_example"; // String | Credential exchange identifier
        V10CredentialStoreRequest body = new V10CredentialStoreRequest(); // V10CredentialStoreRequest | 
        try {
            V10CredentialExchange result = apiInstance.issueCredentialRecordsCredExIdStorePost(credExId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IssueCredentialV10Api#issueCredentialRecordsCredExIdStorePost");
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
 **credExId** | **String**| Credential exchange identifier |
 **body** | [**V10CredentialStoreRequest**](V10CredentialStoreRequest.md)|  | [optional]

### Return type

[**V10CredentialExchange**](V10CredentialExchange.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## issueCredentialRecordsGet

> V10CredentialExchangeListResult issueCredentialRecordsGet(connectionId, role, state, threadId)

Fetch all credential exchange records

### Example

```java
import java.util.UUID;
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.IssueCredentialV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        IssueCredentialV10Api apiInstance = new IssueCredentialV10Api(defaultClient);
        UUID connectionId = new UUID(); // UUID | Connection identifier
        String role = "role_example"; // String | Role assigned in credential exchange
        String state = "state_example"; // String | Credential exchange state
        UUID threadId = new UUID(); // UUID | Thread identifier
        try {
            V10CredentialExchangeListResult result = apiInstance.issueCredentialRecordsGet(connectionId, role, state, threadId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IssueCredentialV10Api#issueCredentialRecordsGet");
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
 **connectionId** | **UUID**| Connection identifier | [optional]
 **role** | **String**| Role assigned in credential exchange | [optional] [enum: issuer, holder]
 **state** | **String**| Credential exchange state | [optional] [enum: proposal_sent, proposal_received, offer_sent, offer_received, request_sent, request_received, credential_issued, credential_received, credential_acked]
 **threadId** | **UUID**| Thread identifier | [optional]

### Return type

[**V10CredentialExchangeListResult**](V10CredentialExchangeListResult.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## issueCredentialSendOfferPost

> V10CredentialExchange issueCredentialSendOfferPost(body)

Send holder a credential offer, independent of any proposal

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.IssueCredentialV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        IssueCredentialV10Api apiInstance = new IssueCredentialV10Api(defaultClient);
        V10CredentialFreeOfferRequest body = new V10CredentialFreeOfferRequest(); // V10CredentialFreeOfferRequest | 
        try {
            V10CredentialExchange result = apiInstance.issueCredentialSendOfferPost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IssueCredentialV10Api#issueCredentialSendOfferPost");
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
 **body** | [**V10CredentialFreeOfferRequest**](V10CredentialFreeOfferRequest.md)|  | [optional]

### Return type

[**V10CredentialExchange**](V10CredentialExchange.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## issueCredentialSendPost

> V10CredentialExchange issueCredentialSendPost(body)

Send holder a credential, automating entire flow

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.IssueCredentialV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        IssueCredentialV10Api apiInstance = new IssueCredentialV10Api(defaultClient);
        V10CredentialProposalRequestMand body = new V10CredentialProposalRequestMand(); // V10CredentialProposalRequestMand | 
        try {
            V10CredentialExchange result = apiInstance.issueCredentialSendPost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IssueCredentialV10Api#issueCredentialSendPost");
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
 **body** | [**V10CredentialProposalRequestMand**](V10CredentialProposalRequestMand.md)|  | [optional]

### Return type

[**V10CredentialExchange**](V10CredentialExchange.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## issueCredentialSendProposalPost

> V10CredentialExchange issueCredentialSendProposalPost(body)

Send issuer a credential proposal

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.IssueCredentialV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        IssueCredentialV10Api apiInstance = new IssueCredentialV10Api(defaultClient);
        V10CredentialProposalRequestOpt body = new V10CredentialProposalRequestOpt(); // V10CredentialProposalRequestOpt | 
        try {
            V10CredentialExchange result = apiInstance.issueCredentialSendProposalPost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IssueCredentialV10Api#issueCredentialSendProposalPost");
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
 **body** | [**V10CredentialProposalRequestOpt**](V10CredentialProposalRequestOpt.md)|  | [optional]

### Return type

[**V10CredentialExchange**](V10CredentialExchange.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


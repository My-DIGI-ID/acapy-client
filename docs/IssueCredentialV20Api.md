# IssueCredentialV20Api

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**issueCredential20CreateOfferPost**](IssueCredentialV20Api.md#issueCredential20CreateOfferPost) | **POST** /issue-credential-2.0/create-offer | Create a credential offer, independent of any proposal or connection
[**issueCredential20CreatePost**](IssueCredentialV20Api.md#issueCredential20CreatePost) | **POST** /issue-credential-2.0/create | Create credential from attribute values
[**issueCredential20RecordsCredExIdDelete**](IssueCredentialV20Api.md#issueCredential20RecordsCredExIdDelete) | **DELETE** /issue-credential-2.0/records/{cred_ex_id} | Remove an existing credential exchange record
[**issueCredential20RecordsCredExIdGet**](IssueCredentialV20Api.md#issueCredential20RecordsCredExIdGet) | **GET** /issue-credential-2.0/records/{cred_ex_id} | Fetch a single credential exchange record
[**issueCredential20RecordsCredExIdIssuePost**](IssueCredentialV20Api.md#issueCredential20RecordsCredExIdIssuePost) | **POST** /issue-credential-2.0/records/{cred_ex_id}/issue | Send holder a credential
[**issueCredential20RecordsCredExIdProblemReportPost**](IssueCredentialV20Api.md#issueCredential20RecordsCredExIdProblemReportPost) | **POST** /issue-credential-2.0/records/{cred_ex_id}/problem-report | Send a problem report for credential exchange
[**issueCredential20RecordsCredExIdSendOfferPost**](IssueCredentialV20Api.md#issueCredential20RecordsCredExIdSendOfferPost) | **POST** /issue-credential-2.0/records/{cred_ex_id}/send-offer | Send holder a credential offer in reference to a proposal with preview
[**issueCredential20RecordsCredExIdSendRequestPost**](IssueCredentialV20Api.md#issueCredential20RecordsCredExIdSendRequestPost) | **POST** /issue-credential-2.0/records/{cred_ex_id}/send-request | Send issuer a credential request
[**issueCredential20RecordsCredExIdStorePost**](IssueCredentialV20Api.md#issueCredential20RecordsCredExIdStorePost) | **POST** /issue-credential-2.0/records/{cred_ex_id}/store | Store a received credential
[**issueCredential20RecordsGet**](IssueCredentialV20Api.md#issueCredential20RecordsGet) | **GET** /issue-credential-2.0/records | Fetch all credential exchange records
[**issueCredential20SendOfferPost**](IssueCredentialV20Api.md#issueCredential20SendOfferPost) | **POST** /issue-credential-2.0/send-offer | Send holder a credential offer, independent of any proposal
[**issueCredential20SendPost**](IssueCredentialV20Api.md#issueCredential20SendPost) | **POST** /issue-credential-2.0/send | Send holder a credential, automating entire flow
[**issueCredential20SendProposalPost**](IssueCredentialV20Api.md#issueCredential20SendProposalPost) | **POST** /issue-credential-2.0/send-proposal | Send issuer a credential proposal
[**issueCredential20SendRequestPost**](IssueCredentialV20Api.md#issueCredential20SendRequestPost) | **POST** /issue-credential-2.0/send-request | Send issuer a credential request not bound to an existing thread. Indy credentials cannot start at a request



## issueCredential20CreateOfferPost

> V20CredExRecord issueCredential20CreateOfferPost(body)

Create a credential offer, independent of any proposal or connection

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.IssueCredentialV20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        IssueCredentialV20Api apiInstance = new IssueCredentialV20Api(defaultClient);
        V20CredOfferConnFreeRequest body = new V20CredOfferConnFreeRequest(); // V20CredOfferConnFreeRequest | 
        try {
            V20CredExRecord result = apiInstance.issueCredential20CreateOfferPost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IssueCredentialV20Api#issueCredential20CreateOfferPost");
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
 **body** | [**V20CredOfferConnFreeRequest**](V20CredOfferConnFreeRequest.md)|  | [optional]

### Return type

[**V20CredExRecord**](V20CredExRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## issueCredential20CreatePost

> V20CredExRecord issueCredential20CreatePost(body)

Create credential from attribute values

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.IssueCredentialV20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        IssueCredentialV20Api apiInstance = new IssueCredentialV20Api(defaultClient);
        V20IssueCredSchemaCore body = new V20IssueCredSchemaCore(); // V20IssueCredSchemaCore | 
        try {
            V20CredExRecord result = apiInstance.issueCredential20CreatePost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IssueCredentialV20Api#issueCredential20CreatePost");
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
 **body** | [**V20IssueCredSchemaCore**](V20IssueCredSchemaCore.md)|  | [optional]

### Return type

[**V20CredExRecord**](V20CredExRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## issueCredential20RecordsCredExIdDelete

> Object issueCredential20RecordsCredExIdDelete(credExId)

Remove an existing credential exchange record

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.IssueCredentialV20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        IssueCredentialV20Api apiInstance = new IssueCredentialV20Api(defaultClient);
        String credExId = "credExId_example"; // String | Credential exchange identifier
        try {
            Object result = apiInstance.issueCredential20RecordsCredExIdDelete(credExId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IssueCredentialV20Api#issueCredential20RecordsCredExIdDelete");
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


## issueCredential20RecordsCredExIdGet

> V20CredExRecordDetail issueCredential20RecordsCredExIdGet(credExId)

Fetch a single credential exchange record

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.IssueCredentialV20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        IssueCredentialV20Api apiInstance = new IssueCredentialV20Api(defaultClient);
        String credExId = "credExId_example"; // String | Credential exchange identifier
        try {
            V20CredExRecordDetail result = apiInstance.issueCredential20RecordsCredExIdGet(credExId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IssueCredentialV20Api#issueCredential20RecordsCredExIdGet");
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

[**V20CredExRecordDetail**](V20CredExRecordDetail.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## issueCredential20RecordsCredExIdIssuePost

> V20CredExRecordDetail issueCredential20RecordsCredExIdIssuePost(credExId, body)

Send holder a credential

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.IssueCredentialV20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        IssueCredentialV20Api apiInstance = new IssueCredentialV20Api(defaultClient);
        String credExId = "credExId_example"; // String | Credential exchange identifier
        V20CredIssueRequest body = new V20CredIssueRequest(); // V20CredIssueRequest | 
        try {
            V20CredExRecordDetail result = apiInstance.issueCredential20RecordsCredExIdIssuePost(credExId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IssueCredentialV20Api#issueCredential20RecordsCredExIdIssuePost");
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
 **body** | [**V20CredIssueRequest**](V20CredIssueRequest.md)|  | [optional]

### Return type

[**V20CredExRecordDetail**](V20CredExRecordDetail.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## issueCredential20RecordsCredExIdProblemReportPost

> Object issueCredential20RecordsCredExIdProblemReportPost(credExId, body)

Send a problem report for credential exchange

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.IssueCredentialV20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        IssueCredentialV20Api apiInstance = new IssueCredentialV20Api(defaultClient);
        String credExId = "credExId_example"; // String | Credential exchange identifier
        V20CredIssueProblemReportRequest body = new V20CredIssueProblemReportRequest(); // V20CredIssueProblemReportRequest | 
        try {
            Object result = apiInstance.issueCredential20RecordsCredExIdProblemReportPost(credExId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IssueCredentialV20Api#issueCredential20RecordsCredExIdProblemReportPost");
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
 **body** | [**V20CredIssueProblemReportRequest**](V20CredIssueProblemReportRequest.md)|  | [optional]

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


## issueCredential20RecordsCredExIdSendOfferPost

> V20CredExRecord issueCredential20RecordsCredExIdSendOfferPost(credExId, body)

Send holder a credential offer in reference to a proposal with preview

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.IssueCredentialV20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        IssueCredentialV20Api apiInstance = new IssueCredentialV20Api(defaultClient);
        String credExId = "credExId_example"; // String | Credential exchange identifier
        V20CredBoundOfferRequest body = new V20CredBoundOfferRequest(); // V20CredBoundOfferRequest | 
        try {
            V20CredExRecord result = apiInstance.issueCredential20RecordsCredExIdSendOfferPost(credExId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IssueCredentialV20Api#issueCredential20RecordsCredExIdSendOfferPost");
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
 **body** | [**V20CredBoundOfferRequest**](V20CredBoundOfferRequest.md)|  | [optional]

### Return type

[**V20CredExRecord**](V20CredExRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## issueCredential20RecordsCredExIdSendRequestPost

> V20CredExRecord issueCredential20RecordsCredExIdSendRequestPost(credExId, body)

Send issuer a credential request

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.IssueCredentialV20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        IssueCredentialV20Api apiInstance = new IssueCredentialV20Api(defaultClient);
        String credExId = "credExId_example"; // String | Credential exchange identifier
        V20CredRequestRequest body = new V20CredRequestRequest(); // V20CredRequestRequest | 
        try {
            V20CredExRecord result = apiInstance.issueCredential20RecordsCredExIdSendRequestPost(credExId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IssueCredentialV20Api#issueCredential20RecordsCredExIdSendRequestPost");
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
 **body** | [**V20CredRequestRequest**](V20CredRequestRequest.md)|  | [optional]

### Return type

[**V20CredExRecord**](V20CredExRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## issueCredential20RecordsCredExIdStorePost

> V20CredExRecordDetail issueCredential20RecordsCredExIdStorePost(credExId, body)

Store a received credential

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.IssueCredentialV20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        IssueCredentialV20Api apiInstance = new IssueCredentialV20Api(defaultClient);
        String credExId = "credExId_example"; // String | Credential exchange identifier
        V20CredStoreRequest body = new V20CredStoreRequest(); // V20CredStoreRequest | 
        try {
            V20CredExRecordDetail result = apiInstance.issueCredential20RecordsCredExIdStorePost(credExId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IssueCredentialV20Api#issueCredential20RecordsCredExIdStorePost");
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
 **body** | [**V20CredStoreRequest**](V20CredStoreRequest.md)|  | [optional]

### Return type

[**V20CredExRecordDetail**](V20CredExRecordDetail.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## issueCredential20RecordsGet

> V20CredExRecordListResult issueCredential20RecordsGet(connectionId, role, state, threadId)

Fetch all credential exchange records

### Example

```java
import java.util.UUID;
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.IssueCredentialV20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        IssueCredentialV20Api apiInstance = new IssueCredentialV20Api(defaultClient);
        UUID connectionId = new UUID(); // UUID | Connection identifier
        String role = "role_example"; // String | Role assigned in credential exchange
        String state = "state_example"; // String | Credential exchange state
        UUID threadId = new UUID(); // UUID | Thread identifier
        try {
            V20CredExRecordListResult result = apiInstance.issueCredential20RecordsGet(connectionId, role, state, threadId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IssueCredentialV20Api#issueCredential20RecordsGet");
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
 **state** | **String**| Credential exchange state | [optional] [enum: proposal-sent, proposal-received, offer-sent, offer-received, request-sent, request-received, credential-issued, credential-received, done]
 **threadId** | **UUID**| Thread identifier | [optional]

### Return type

[**V20CredExRecordListResult**](V20CredExRecordListResult.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## issueCredential20SendOfferPost

> V20CredExRecord issueCredential20SendOfferPost(body)

Send holder a credential offer, independent of any proposal

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.IssueCredentialV20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        IssueCredentialV20Api apiInstance = new IssueCredentialV20Api(defaultClient);
        V20CredOfferRequest body = new V20CredOfferRequest(); // V20CredOfferRequest | 
        try {
            V20CredExRecord result = apiInstance.issueCredential20SendOfferPost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IssueCredentialV20Api#issueCredential20SendOfferPost");
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
 **body** | [**V20CredOfferRequest**](V20CredOfferRequest.md)|  | [optional]

### Return type

[**V20CredExRecord**](V20CredExRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## issueCredential20SendPost

> V20CredExRecord issueCredential20SendPost(body)

Send holder a credential, automating entire flow

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.IssueCredentialV20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        IssueCredentialV20Api apiInstance = new IssueCredentialV20Api(defaultClient);
        V20CredSendRequest body = new V20CredSendRequest(); // V20CredSendRequest | 
        try {
            V20CredExRecord result = apiInstance.issueCredential20SendPost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IssueCredentialV20Api#issueCredential20SendPost");
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
 **body** | [**V20CredSendRequest**](V20CredSendRequest.md)|  | [optional]

### Return type

[**V20CredExRecord**](V20CredExRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## issueCredential20SendProposalPost

> V20CredExRecord issueCredential20SendProposalPost(body)

Send issuer a credential proposal

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.IssueCredentialV20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        IssueCredentialV20Api apiInstance = new IssueCredentialV20Api(defaultClient);
        V20IssueCredSchemaCore body = new V20IssueCredSchemaCore(); // V20IssueCredSchemaCore | 
        try {
            V20CredExRecord result = apiInstance.issueCredential20SendProposalPost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IssueCredentialV20Api#issueCredential20SendProposalPost");
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
 **body** | [**V20IssueCredSchemaCore**](V20IssueCredSchemaCore.md)|  | [optional]

### Return type

[**V20CredExRecord**](V20CredExRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## issueCredential20SendRequestPost

> V20CredExRecord issueCredential20SendRequestPost(body)

Send issuer a credential request not bound to an existing thread. Indy credentials cannot start at a request

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.IssueCredentialV20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        IssueCredentialV20Api apiInstance = new IssueCredentialV20Api(defaultClient);
        V20CredRequestFree body = new V20CredRequestFree(); // V20CredRequestFree | 
        try {
            V20CredExRecord result = apiInstance.issueCredential20SendRequestPost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IssueCredentialV20Api#issueCredential20SendRequestPost");
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
 **body** | [**V20CredRequestFree**](V20CredRequestFree.md)|  | [optional]

### Return type

[**V20CredExRecord**](V20CredExRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


# PresentProofV20Api

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**presentProof20CreateRequestPost**](PresentProofV20Api.md#presentProof20CreateRequestPost) | **POST** /present-proof-2.0/create-request | Creates a presentation request not bound to any proposal or connection
[**presentProof20RecordsGet**](PresentProofV20Api.md#presentProof20RecordsGet) | **GET** /present-proof-2.0/records | Fetch all present-proof exchange records
[**presentProof20RecordsPresExIdCredentialsGet**](PresentProofV20Api.md#presentProof20RecordsPresExIdCredentialsGet) | **GET** /present-proof-2.0/records/{pres_ex_id}/credentials | Fetch credentials from wallet for presentation request
[**presentProof20RecordsPresExIdDelete**](PresentProofV20Api.md#presentProof20RecordsPresExIdDelete) | **DELETE** /present-proof-2.0/records/{pres_ex_id} | Remove an existing presentation exchange record
[**presentProof20RecordsPresExIdGet**](PresentProofV20Api.md#presentProof20RecordsPresExIdGet) | **GET** /present-proof-2.0/records/{pres_ex_id} | Fetch a single presentation exchange record
[**presentProof20RecordsPresExIdProblemReportPost**](PresentProofV20Api.md#presentProof20RecordsPresExIdProblemReportPost) | **POST** /present-proof-2.0/records/{pres_ex_id}/problem-report | Send a problem report for presentation exchange
[**presentProof20RecordsPresExIdSendPresentationPost**](PresentProofV20Api.md#presentProof20RecordsPresExIdSendPresentationPost) | **POST** /present-proof-2.0/records/{pres_ex_id}/send-presentation | Sends a proof presentation
[**presentProof20RecordsPresExIdSendRequestPost**](PresentProofV20Api.md#presentProof20RecordsPresExIdSendRequestPost) | **POST** /present-proof-2.0/records/{pres_ex_id}/send-request | Sends a presentation request in reference to a proposal
[**presentProof20RecordsPresExIdVerifyPresentationPost**](PresentProofV20Api.md#presentProof20RecordsPresExIdVerifyPresentationPost) | **POST** /present-proof-2.0/records/{pres_ex_id}/verify-presentation | Verify a received presentation
[**presentProof20SendProposalPost**](PresentProofV20Api.md#presentProof20SendProposalPost) | **POST** /present-proof-2.0/send-proposal | Sends a presentation proposal
[**presentProof20SendRequestPost**](PresentProofV20Api.md#presentProof20SendRequestPost) | **POST** /present-proof-2.0/send-request | Sends a free presentation request not bound to any proposal



## presentProof20CreateRequestPost

> V20PresExRecord presentProof20CreateRequestPost(body)

Creates a presentation request not bound to any proposal or connection

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.PresentProofV20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        PresentProofV20Api apiInstance = new PresentProofV20Api(defaultClient);
        V20PresCreateRequestRequest body = new V20PresCreateRequestRequest(); // V20PresCreateRequestRequest | 
        try {
            V20PresExRecord result = apiInstance.presentProof20CreateRequestPost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PresentProofV20Api#presentProof20CreateRequestPost");
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
 **body** | [**V20PresCreateRequestRequest**](V20PresCreateRequestRequest.md)|  | [optional]

### Return type

[**V20PresExRecord**](V20PresExRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## presentProof20RecordsGet

> V20PresExRecordList presentProof20RecordsGet(connectionId, role, state, threadId)

Fetch all present-proof exchange records

### Example

```java
import java.util.UUID;
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.PresentProofV20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        PresentProofV20Api apiInstance = new PresentProofV20Api(defaultClient);
        UUID connectionId = new UUID(); // UUID | Connection identifier
        String role = "role_example"; // String | Role assigned in presentation exchange
        String state = "state_example"; // String | Presentation exchange state
        UUID threadId = new UUID(); // UUID | Thread identifier
        try {
            V20PresExRecordList result = apiInstance.presentProof20RecordsGet(connectionId, role, state, threadId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PresentProofV20Api#presentProof20RecordsGet");
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
 **role** | **String**| Role assigned in presentation exchange | [optional] [enum: prover, verifier]
 **state** | **String**| Presentation exchange state | [optional] [enum: proposal-sent, proposal-received, request-sent, request-received, presentation-sent, presentation-received, done, abandoned]
 **threadId** | **UUID**| Thread identifier | [optional]

### Return type

[**V20PresExRecordList**](V20PresExRecordList.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## presentProof20RecordsPresExIdCredentialsGet

> List&lt;IndyCredPrecis&gt; presentProof20RecordsPresExIdCredentialsGet(presExId, count, extraQuery, referent, start)

Fetch credentials from wallet for presentation request

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.PresentProofV20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        PresentProofV20Api apiInstance = new PresentProofV20Api(defaultClient);
        String presExId = "presExId_example"; // String | Presentation exchange identifier
        String count = "count_example"; // String | Maximum number to retrieve
        String extraQuery = "extraQuery_example"; // String | (JSON) object mapping referents to extra WQL queries
        String referent = "referent_example"; // String | Proof request referents of interest, comma-separated
        String start = "start_example"; // String | Start index
        try {
            List<IndyCredPrecis> result = apiInstance.presentProof20RecordsPresExIdCredentialsGet(presExId, count, extraQuery, referent, start);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PresentProofV20Api#presentProof20RecordsPresExIdCredentialsGet");
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
 **presExId** | **String**| Presentation exchange identifier |
 **count** | **String**| Maximum number to retrieve | [optional]
 **extraQuery** | **String**| (JSON) object mapping referents to extra WQL queries | [optional]
 **referent** | **String**| Proof request referents of interest, comma-separated | [optional]
 **start** | **String**| Start index | [optional]

### Return type

[**List&lt;IndyCredPrecis&gt;**](IndyCredPrecis.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## presentProof20RecordsPresExIdDelete

> Object presentProof20RecordsPresExIdDelete(presExId)

Remove an existing presentation exchange record

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.PresentProofV20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        PresentProofV20Api apiInstance = new PresentProofV20Api(defaultClient);
        String presExId = "presExId_example"; // String | Presentation exchange identifier
        try {
            Object result = apiInstance.presentProof20RecordsPresExIdDelete(presExId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PresentProofV20Api#presentProof20RecordsPresExIdDelete");
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
 **presExId** | **String**| Presentation exchange identifier |

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


## presentProof20RecordsPresExIdGet

> V20PresExRecord presentProof20RecordsPresExIdGet(presExId)

Fetch a single presentation exchange record

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.PresentProofV20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        PresentProofV20Api apiInstance = new PresentProofV20Api(defaultClient);
        String presExId = "presExId_example"; // String | Presentation exchange identifier
        try {
            V20PresExRecord result = apiInstance.presentProof20RecordsPresExIdGet(presExId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PresentProofV20Api#presentProof20RecordsPresExIdGet");
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
 **presExId** | **String**| Presentation exchange identifier |

### Return type

[**V20PresExRecord**](V20PresExRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## presentProof20RecordsPresExIdProblemReportPost

> Object presentProof20RecordsPresExIdProblemReportPost(presExId, body)

Send a problem report for presentation exchange

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.PresentProofV20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        PresentProofV20Api apiInstance = new PresentProofV20Api(defaultClient);
        String presExId = "presExId_example"; // String | Presentation exchange identifier
        V20PresProblemReportRequest body = new V20PresProblemReportRequest(); // V20PresProblemReportRequest | 
        try {
            Object result = apiInstance.presentProof20RecordsPresExIdProblemReportPost(presExId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PresentProofV20Api#presentProof20RecordsPresExIdProblemReportPost");
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
 **presExId** | **String**| Presentation exchange identifier |
 **body** | [**V20PresProblemReportRequest**](V20PresProblemReportRequest.md)|  | [optional]

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


## presentProof20RecordsPresExIdSendPresentationPost

> V20PresExRecord presentProof20RecordsPresExIdSendPresentationPost(presExId, body)

Sends a proof presentation

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.PresentProofV20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        PresentProofV20Api apiInstance = new PresentProofV20Api(defaultClient);
        String presExId = "presExId_example"; // String | Presentation exchange identifier
        V20PresSpecByFormatRequest body = new V20PresSpecByFormatRequest(); // V20PresSpecByFormatRequest | 
        try {
            V20PresExRecord result = apiInstance.presentProof20RecordsPresExIdSendPresentationPost(presExId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PresentProofV20Api#presentProof20RecordsPresExIdSendPresentationPost");
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
 **presExId** | **String**| Presentation exchange identifier |
 **body** | [**V20PresSpecByFormatRequest**](V20PresSpecByFormatRequest.md)|  | [optional]

### Return type

[**V20PresExRecord**](V20PresExRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## presentProof20RecordsPresExIdSendRequestPost

> V20PresExRecord presentProof20RecordsPresExIdSendRequestPost(presExId, body)

Sends a presentation request in reference to a proposal

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.PresentProofV20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        PresentProofV20Api apiInstance = new PresentProofV20Api(defaultClient);
        String presExId = "presExId_example"; // String | Presentation exchange identifier
        AdminAPIMessageTracing body = new AdminAPIMessageTracing(); // AdminAPIMessageTracing | 
        try {
            V20PresExRecord result = apiInstance.presentProof20RecordsPresExIdSendRequestPost(presExId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PresentProofV20Api#presentProof20RecordsPresExIdSendRequestPost");
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
 **presExId** | **String**| Presentation exchange identifier |
 **body** | [**AdminAPIMessageTracing**](AdminAPIMessageTracing.md)|  | [optional]

### Return type

[**V20PresExRecord**](V20PresExRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## presentProof20RecordsPresExIdVerifyPresentationPost

> V20PresExRecord presentProof20RecordsPresExIdVerifyPresentationPost(presExId)

Verify a received presentation

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.PresentProofV20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        PresentProofV20Api apiInstance = new PresentProofV20Api(defaultClient);
        String presExId = "presExId_example"; // String | Presentation exchange identifier
        try {
            V20PresExRecord result = apiInstance.presentProof20RecordsPresExIdVerifyPresentationPost(presExId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PresentProofV20Api#presentProof20RecordsPresExIdVerifyPresentationPost");
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
 **presExId** | **String**| Presentation exchange identifier |

### Return type

[**V20PresExRecord**](V20PresExRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## presentProof20SendProposalPost

> V20PresExRecord presentProof20SendProposalPost(body)

Sends a presentation proposal

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.PresentProofV20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        PresentProofV20Api apiInstance = new PresentProofV20Api(defaultClient);
        V20PresProposalRequest body = new V20PresProposalRequest(); // V20PresProposalRequest | 
        try {
            V20PresExRecord result = apiInstance.presentProof20SendProposalPost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PresentProofV20Api#presentProof20SendProposalPost");
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
 **body** | [**V20PresProposalRequest**](V20PresProposalRequest.md)|  | [optional]

### Return type

[**V20PresExRecord**](V20PresExRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## presentProof20SendRequestPost

> V20PresExRecord presentProof20SendRequestPost(body)

Sends a free presentation request not bound to any proposal

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.PresentProofV20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        PresentProofV20Api apiInstance = new PresentProofV20Api(defaultClient);
        V20PresSendRequestRequest body = new V20PresSendRequestRequest(); // V20PresSendRequestRequest | 
        try {
            V20PresExRecord result = apiInstance.presentProof20SendRequestPost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PresentProofV20Api#presentProof20SendRequestPost");
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
 **body** | [**V20PresSendRequestRequest**](V20PresSendRequestRequest.md)|  | [optional]

### Return type

[**V20PresExRecord**](V20PresExRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


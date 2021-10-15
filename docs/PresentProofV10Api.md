# PresentProofV10Api

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**presentProofCreateRequestPost**](PresentProofV10Api.md#presentProofCreateRequestPost) | **POST** /present-proof/create-request | Creates a presentation request not bound to any proposal or connection
[**presentProofRecordsGet**](PresentProofV10Api.md#presentProofRecordsGet) | **GET** /present-proof/records | Fetch all present-proof exchange records
[**presentProofRecordsPresExIdCredentialsGet**](PresentProofV10Api.md#presentProofRecordsPresExIdCredentialsGet) | **GET** /present-proof/records/{pres_ex_id}/credentials | Fetch credentials for a presentation request from wallet
[**presentProofRecordsPresExIdDelete**](PresentProofV10Api.md#presentProofRecordsPresExIdDelete) | **DELETE** /present-proof/records/{pres_ex_id} | Remove an existing presentation exchange record
[**presentProofRecordsPresExIdGet**](PresentProofV10Api.md#presentProofRecordsPresExIdGet) | **GET** /present-proof/records/{pres_ex_id} | Fetch a single presentation exchange record
[**presentProofRecordsPresExIdProblemReportPost**](PresentProofV10Api.md#presentProofRecordsPresExIdProblemReportPost) | **POST** /present-proof/records/{pres_ex_id}/problem-report | Send a problem report for presentation exchange
[**presentProofRecordsPresExIdSendPresentationPost**](PresentProofV10Api.md#presentProofRecordsPresExIdSendPresentationPost) | **POST** /present-proof/records/{pres_ex_id}/send-presentation | Sends a proof presentation
[**presentProofRecordsPresExIdSendRequestPost**](PresentProofV10Api.md#presentProofRecordsPresExIdSendRequestPost) | **POST** /present-proof/records/{pres_ex_id}/send-request | Sends a presentation request in reference to a proposal
[**presentProofRecordsPresExIdVerifyPresentationPost**](PresentProofV10Api.md#presentProofRecordsPresExIdVerifyPresentationPost) | **POST** /present-proof/records/{pres_ex_id}/verify-presentation | Verify a received presentation
[**presentProofSendProposalPost**](PresentProofV10Api.md#presentProofSendProposalPost) | **POST** /present-proof/send-proposal | Sends a presentation proposal
[**presentProofSendRequestPost**](PresentProofV10Api.md#presentProofSendRequestPost) | **POST** /present-proof/send-request | Sends a free presentation request not bound to any proposal



## presentProofCreateRequestPost

> V10PresentationExchange presentProofCreateRequestPost(body)

Creates a presentation request not bound to any proposal or connection

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.PresentProofV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        PresentProofV10Api apiInstance = new PresentProofV10Api(defaultClient);
        V10PresentationCreateRequestRequest body = new V10PresentationCreateRequestRequest(); // V10PresentationCreateRequestRequest | 
        try {
            V10PresentationExchange result = apiInstance.presentProofCreateRequestPost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PresentProofV10Api#presentProofCreateRequestPost");
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
 **body** | [**V10PresentationCreateRequestRequest**](V10PresentationCreateRequestRequest.md)|  | [optional]

### Return type

[**V10PresentationExchange**](V10PresentationExchange.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## presentProofRecordsGet

> V10PresentationExchangeList presentProofRecordsGet(connectionId, role, state, threadId)

Fetch all present-proof exchange records

### Example

```java
import java.util.UUID;
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.PresentProofV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        PresentProofV10Api apiInstance = new PresentProofV10Api(defaultClient);
        UUID connectionId = new UUID(); // UUID | Connection identifier
        String role = "role_example"; // String | Role assigned in presentation exchange
        String state = "state_example"; // String | Presentation exchange state
        UUID threadId = new UUID(); // UUID | Thread identifier
        try {
            V10PresentationExchangeList result = apiInstance.presentProofRecordsGet(connectionId, role, state, threadId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PresentProofV10Api#presentProofRecordsGet");
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
 **state** | **String**| Presentation exchange state | [optional] [enum: proposal_sent, proposal_received, request_sent, request_received, presentation_sent, presentation_received, verified, presentation_acked]
 **threadId** | **UUID**| Thread identifier | [optional]

### Return type

[**V10PresentationExchangeList**](V10PresentationExchangeList.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## presentProofRecordsPresExIdCredentialsGet

> List&lt;IndyCredPrecis&gt; presentProofRecordsPresExIdCredentialsGet(presExId, count, extraQuery, referent, start)

Fetch credentials for a presentation request from wallet

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.PresentProofV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        PresentProofV10Api apiInstance = new PresentProofV10Api(defaultClient);
        String presExId = "presExId_example"; // String | Presentation exchange identifier
        String count = "count_example"; // String | Maximum number to retrieve
        String extraQuery = "extraQuery_example"; // String | (JSON) object mapping referents to extra WQL queries
        String referent = "referent_example"; // String | Proof request referents of interest, comma-separated
        String start = "start_example"; // String | Start index
        try {
            List<IndyCredPrecis> result = apiInstance.presentProofRecordsPresExIdCredentialsGet(presExId, count, extraQuery, referent, start);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PresentProofV10Api#presentProofRecordsPresExIdCredentialsGet");
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


## presentProofRecordsPresExIdDelete

> Object presentProofRecordsPresExIdDelete(presExId)

Remove an existing presentation exchange record

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.PresentProofV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        PresentProofV10Api apiInstance = new PresentProofV10Api(defaultClient);
        String presExId = "presExId_example"; // String | Presentation exchange identifier
        try {
            Object result = apiInstance.presentProofRecordsPresExIdDelete(presExId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PresentProofV10Api#presentProofRecordsPresExIdDelete");
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


## presentProofRecordsPresExIdGet

> V10PresentationExchange presentProofRecordsPresExIdGet(presExId)

Fetch a single presentation exchange record

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.PresentProofV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        PresentProofV10Api apiInstance = new PresentProofV10Api(defaultClient);
        String presExId = "presExId_example"; // String | Presentation exchange identifier
        try {
            V10PresentationExchange result = apiInstance.presentProofRecordsPresExIdGet(presExId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PresentProofV10Api#presentProofRecordsPresExIdGet");
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

[**V10PresentationExchange**](V10PresentationExchange.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## presentProofRecordsPresExIdProblemReportPost

> Object presentProofRecordsPresExIdProblemReportPost(presExId, body)

Send a problem report for presentation exchange

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.PresentProofV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        PresentProofV10Api apiInstance = new PresentProofV10Api(defaultClient);
        String presExId = "presExId_example"; // String | Presentation exchange identifier
        V10PresentationProblemReportRequest body = new V10PresentationProblemReportRequest(); // V10PresentationProblemReportRequest | 
        try {
            Object result = apiInstance.presentProofRecordsPresExIdProblemReportPost(presExId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PresentProofV10Api#presentProofRecordsPresExIdProblemReportPost");
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
 **body** | [**V10PresentationProblemReportRequest**](V10PresentationProblemReportRequest.md)|  | [optional]

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


## presentProofRecordsPresExIdSendPresentationPost

> V10PresentationExchange presentProofRecordsPresExIdSendPresentationPost(presExId, body)

Sends a proof presentation

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.PresentProofV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        PresentProofV10Api apiInstance = new PresentProofV10Api(defaultClient);
        String presExId = "presExId_example"; // String | Presentation exchange identifier
        IndyPresSpec body = new IndyPresSpec(); // IndyPresSpec | 
        try {
            V10PresentationExchange result = apiInstance.presentProofRecordsPresExIdSendPresentationPost(presExId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PresentProofV10Api#presentProofRecordsPresExIdSendPresentationPost");
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
 **body** | [**IndyPresSpec**](IndyPresSpec.md)|  | [optional]

### Return type

[**V10PresentationExchange**](V10PresentationExchange.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## presentProofRecordsPresExIdSendRequestPost

> V10PresentationExchange presentProofRecordsPresExIdSendRequestPost(presExId, body)

Sends a presentation request in reference to a proposal

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.PresentProofV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        PresentProofV10Api apiInstance = new PresentProofV10Api(defaultClient);
        String presExId = "presExId_example"; // String | Presentation exchange identifier
        AdminAPIMessageTracing body = new AdminAPIMessageTracing(); // AdminAPIMessageTracing | 
        try {
            V10PresentationExchange result = apiInstance.presentProofRecordsPresExIdSendRequestPost(presExId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PresentProofV10Api#presentProofRecordsPresExIdSendRequestPost");
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

[**V10PresentationExchange**](V10PresentationExchange.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## presentProofRecordsPresExIdVerifyPresentationPost

> V10PresentationExchange presentProofRecordsPresExIdVerifyPresentationPost(presExId)

Verify a received presentation

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.PresentProofV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        PresentProofV10Api apiInstance = new PresentProofV10Api(defaultClient);
        String presExId = "presExId_example"; // String | Presentation exchange identifier
        try {
            V10PresentationExchange result = apiInstance.presentProofRecordsPresExIdVerifyPresentationPost(presExId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PresentProofV10Api#presentProofRecordsPresExIdVerifyPresentationPost");
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

[**V10PresentationExchange**](V10PresentationExchange.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## presentProofSendProposalPost

> V10PresentationExchange presentProofSendProposalPost(body)

Sends a presentation proposal

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.PresentProofV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        PresentProofV10Api apiInstance = new PresentProofV10Api(defaultClient);
        V10PresentationProposalRequest body = new V10PresentationProposalRequest(); // V10PresentationProposalRequest | 
        try {
            V10PresentationExchange result = apiInstance.presentProofSendProposalPost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PresentProofV10Api#presentProofSendProposalPost");
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
 **body** | [**V10PresentationProposalRequest**](V10PresentationProposalRequest.md)|  | [optional]

### Return type

[**V10PresentationExchange**](V10PresentationExchange.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## presentProofSendRequestPost

> V10PresentationExchange presentProofSendRequestPost(body)

Sends a free presentation request not bound to any proposal

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.PresentProofV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        PresentProofV10Api apiInstance = new PresentProofV10Api(defaultClient);
        V10PresentationSendRequestRequest body = new V10PresentationSendRequestRequest(); // V10PresentationSendRequestRequest | 
        try {
            V10PresentationExchange result = apiInstance.presentProofSendRequestPost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PresentProofV10Api#presentProofSendRequestPost");
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
 **body** | [**V10PresentationSendRequestRequest**](V10PresentationSendRequestRequest.md)|  | [optional]

### Return type

[**V10PresentationExchange**](V10PresentationExchange.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


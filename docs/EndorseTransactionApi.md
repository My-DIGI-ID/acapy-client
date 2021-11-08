# EndorseTransactionApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transactionTranIdResendPost**](EndorseTransactionApi.md#transactionTranIdResendPost) | **POST** /transaction/{tran_id}/resend | For Author to resend a particular transaction request
[**transactionsConnIdSetEndorserInfoPost**](EndorseTransactionApi.md#transactionsConnIdSetEndorserInfoPost) | **POST** /transactions/{conn_id}/set-endorser-info | Set Endorser Info
[**transactionsConnIdSetEndorserRolePost**](EndorseTransactionApi.md#transactionsConnIdSetEndorserRolePost) | **POST** /transactions/{conn_id}/set-endorser-role | Set transaction jobs
[**transactionsCreateRequestPost**](EndorseTransactionApi.md#transactionsCreateRequestPost) | **POST** /transactions/create-request | For author to send a transaction request
[**transactionsGet**](EndorseTransactionApi.md#transactionsGet) | **GET** /transactions | Query transactions
[**transactionsTranIdCancelPost**](EndorseTransactionApi.md#transactionsTranIdCancelPost) | **POST** /transactions/{tran_id}/cancel | For Author to cancel a particular transaction request
[**transactionsTranIdEndorsePost**](EndorseTransactionApi.md#transactionsTranIdEndorsePost) | **POST** /transactions/{tran_id}/endorse | For Endorser to endorse a particular transaction record
[**transactionsTranIdGet**](EndorseTransactionApi.md#transactionsTranIdGet) | **GET** /transactions/{tran_id} | Fetch a single transaction record
[**transactionsTranIdRefusePost**](EndorseTransactionApi.md#transactionsTranIdRefusePost) | **POST** /transactions/{tran_id}/refuse | For Endorser to refuse a particular transaction record
[**transactionsTranIdWritePost**](EndorseTransactionApi.md#transactionsTranIdWritePost) | **POST** /transactions/{tran_id}/write | For Author / Endorser to write an endorsed transaction to the ledger



## transactionTranIdResendPost

> TransactionRecord transactionTranIdResendPost(tranId)

For Author to resend a particular transaction request

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.EndorseTransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        EndorseTransactionApi apiInstance = new EndorseTransactionApi(defaultClient);
        String tranId = "tranId_example"; // String | Transaction identifier
        try {
            TransactionRecord result = apiInstance.transactionTranIdResendPost(tranId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EndorseTransactionApi#transactionTranIdResendPost");
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
 **tranId** | **String**| Transaction identifier |

### Return type

[**TransactionRecord**](TransactionRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | null |  -  |


## transactionsConnIdSetEndorserInfoPost

> EndorserInfo transactionsConnIdSetEndorserInfoPost(connId, endorserDid, endorserName)

Set Endorser Info

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.EndorseTransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        EndorseTransactionApi apiInstance = new EndorseTransactionApi(defaultClient);
        String connId = "connId_example"; // String | Connection identifier
        String endorserDid = "endorserDid_example"; // String | Endorser DID
        String endorserName = "endorserName_example"; // String | Endorser Name
        try {
            EndorserInfo result = apiInstance.transactionsConnIdSetEndorserInfoPost(connId, endorserDid, endorserName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EndorseTransactionApi#transactionsConnIdSetEndorserInfoPost");
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
 **connId** | **String**| Connection identifier |
 **endorserDid** | **String**| Endorser DID |
 **endorserName** | **String**| Endorser Name | [optional]

### Return type

[**EndorserInfo**](EndorserInfo.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | null |  -  |


## transactionsConnIdSetEndorserRolePost

> TransactionJobs transactionsConnIdSetEndorserRolePost(connId, transactionMyJob)

Set transaction jobs

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.EndorseTransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        EndorseTransactionApi apiInstance = new EndorseTransactionApi(defaultClient);
        String connId = "connId_example"; // String | Connection identifier
        String transactionMyJob = "transactionMyJob_example"; // String | Transaction related jobs
        try {
            TransactionJobs result = apiInstance.transactionsConnIdSetEndorserRolePost(connId, transactionMyJob);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EndorseTransactionApi#transactionsConnIdSetEndorserRolePost");
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
 **connId** | **String**| Connection identifier |
 **transactionMyJob** | **String**| Transaction related jobs | [optional] [enum: TRANSACTION_AUTHOR, TRANSACTION_ENDORSER, reset]

### Return type

[**TransactionJobs**](TransactionJobs.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | null |  -  |


## transactionsCreateRequestPost

> TransactionRecord transactionsCreateRequestPost(tranId, endorserWriteTxn, body)

For author to send a transaction request

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.EndorseTransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        EndorseTransactionApi apiInstance = new EndorseTransactionApi(defaultClient);
        String tranId = "tranId_example"; // String | Transaction identifier
        Boolean endorserWriteTxn = true; // Boolean | Endorser will write the transaction after endorsing it
        java.util.Date body = new java.util.Date(); // java.util.Date | 
        try {
            TransactionRecord result = apiInstance.transactionsCreateRequestPost(tranId, endorserWriteTxn, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EndorseTransactionApi#transactionsCreateRequestPost");
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
 **tranId** | **String**| Transaction identifier |
 **endorserWriteTxn** | **Boolean**| Endorser will write the transaction after endorsing it | [optional]
 **body** | [**java.util.Date**](java.util.Date.md)|  | [optional]

### Return type

[**TransactionRecord**](TransactionRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | null |  -  |


## transactionsGet

> TransactionList transactionsGet()

Query transactions

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.EndorseTransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        EndorseTransactionApi apiInstance = new EndorseTransactionApi(defaultClient);
        try {
            TransactionList result = apiInstance.transactionsGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EndorseTransactionApi#transactionsGet");
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

[**TransactionList**](TransactionList.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | null |  -  |


## transactionsTranIdCancelPost

> TransactionRecord transactionsTranIdCancelPost(tranId)

For Author to cancel a particular transaction request

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.EndorseTransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        EndorseTransactionApi apiInstance = new EndorseTransactionApi(defaultClient);
        String tranId = "tranId_example"; // String | Transaction identifier
        try {
            TransactionRecord result = apiInstance.transactionsTranIdCancelPost(tranId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EndorseTransactionApi#transactionsTranIdCancelPost");
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
 **tranId** | **String**| Transaction identifier |

### Return type

[**TransactionRecord**](TransactionRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | null |  -  |


## transactionsTranIdEndorsePost

> TransactionRecord transactionsTranIdEndorsePost(tranId)

For Endorser to endorse a particular transaction record

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.EndorseTransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        EndorseTransactionApi apiInstance = new EndorseTransactionApi(defaultClient);
        String tranId = "tranId_example"; // String | Transaction identifier
        try {
            TransactionRecord result = apiInstance.transactionsTranIdEndorsePost(tranId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EndorseTransactionApi#transactionsTranIdEndorsePost");
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
 **tranId** | **String**| Transaction identifier |

### Return type

[**TransactionRecord**](TransactionRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | null |  -  |


## transactionsTranIdGet

> TransactionRecord transactionsTranIdGet(tranId)

Fetch a single transaction record

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.EndorseTransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        EndorseTransactionApi apiInstance = new EndorseTransactionApi(defaultClient);
        String tranId = "tranId_example"; // String | Transaction identifier
        try {
            TransactionRecord result = apiInstance.transactionsTranIdGet(tranId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EndorseTransactionApi#transactionsTranIdGet");
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
 **tranId** | **String**| Transaction identifier |

### Return type

[**TransactionRecord**](TransactionRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | null |  -  |


## transactionsTranIdRefusePost

> TransactionRecord transactionsTranIdRefusePost(tranId)

For Endorser to refuse a particular transaction record

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.EndorseTransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        EndorseTransactionApi apiInstance = new EndorseTransactionApi(defaultClient);
        String tranId = "tranId_example"; // String | Transaction identifier
        try {
            TransactionRecord result = apiInstance.transactionsTranIdRefusePost(tranId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EndorseTransactionApi#transactionsTranIdRefusePost");
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
 **tranId** | **String**| Transaction identifier |

### Return type

[**TransactionRecord**](TransactionRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | null |  -  |


## transactionsTranIdWritePost

> TransactionRecord transactionsTranIdWritePost(tranId)

For Author / Endorser to write an endorsed transaction to the ledger

### Example

```java
// Import classes:
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.auth.*;
import com.my_digi_id.acapy_client.invoker.model.*;
import com.my_digi_id.acapy_client.api.EndorseTransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        EndorseTransactionApi apiInstance = new EndorseTransactionApi(defaultClient);
        String tranId = "tranId_example"; // String | Transaction identifier
        try {
            TransactionRecord result = apiInstance.transactionsTranIdWritePost(tranId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EndorseTransactionApi#transactionsTranIdWritePost");
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
 **tranId** | **String**| Transaction identifier |

### Return type

[**TransactionRecord**](TransactionRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | null |  -  |


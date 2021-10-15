# JsonldApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**jsonldSignPost**](JsonldApi.md#jsonldSignPost) | **POST** /jsonld/sign | Sign a JSON-LD structure and return it
[**jsonldVerifyPost**](JsonldApi.md#jsonldVerifyPost) | **POST** /jsonld/verify | Verify a JSON-LD structure.



## jsonldSignPost

> SignResponse jsonldSignPost(body)

Sign a JSON-LD structure and return it

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.JsonldApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        JsonldApi apiInstance = new JsonldApi(defaultClient);
        SignRequest body = new SignRequest(); // SignRequest | 
        try {
            SignResponse result = apiInstance.jsonldSignPost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JsonldApi#jsonldSignPost");
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
 **body** | [**SignRequest**](SignRequest.md)|  | [optional]

### Return type

[**SignResponse**](SignResponse.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## jsonldVerifyPost

> VerifyResponse jsonldVerifyPost(body)

Verify a JSON-LD structure.

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.JsonldApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        JsonldApi apiInstance = new JsonldApi(defaultClient);
        VerifyRequest body = new VerifyRequest(); // VerifyRequest | 
        try {
            VerifyResponse result = apiInstance.jsonldVerifyPost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JsonldApi#jsonldVerifyPost");
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
 **body** | [**VerifyRequest**](VerifyRequest.md)|  | [optional]

### Return type

[**VerifyResponse**](VerifyResponse.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


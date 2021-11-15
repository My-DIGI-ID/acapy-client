# ResolverApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**resolverResolveDidGet**](ResolverApi.md#resolverResolveDidGet) | **GET** /resolver/resolve/{did} | Retrieve doc for requested did



## resolverResolveDidGet

> ResolutionResult resolverResolveDidGet(did)

Retrieve doc for requested did

### Example

```java
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.ResolverApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        ResolverApi apiInstance = new ResolverApi(defaultClient);
        String did = "did_example"; // String | DID
        try {
            ResolutionResult result = apiInstance.resolverResolveDidGet(did);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ResolverApi#resolverResolveDidGet");
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
 **did** | **String**| DID |

### Return type

[**ResolutionResult**](ResolutionResult.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | null |  -  |


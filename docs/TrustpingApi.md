# TrustpingApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**connectionsConnIdSendPingPost**](TrustpingApi.md#connectionsConnIdSendPingPost) | **POST** /connections/{conn_id}/send-ping | Send a trust ping to a connection



## connectionsConnIdSendPingPost

> PingRequestResponse connectionsConnIdSendPingPost(connId, body)

Send a trust ping to a connection

### Example

```java
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.TrustpingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        TrustpingApi apiInstance = new TrustpingApi(defaultClient);
        String connId = "connId_example"; // String | Connection identifier
        PingRequest body = new PingRequest(); // PingRequest | 
        try {
            PingRequestResponse result = apiInstance.connectionsConnIdSendPingPost(connId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrustpingApi#connectionsConnIdSendPingPost");
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
 **body** | [**PingRequest**](PingRequest.md)|  | [optional]

### Return type

[**PingRequestResponse**](PingRequestResponse.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


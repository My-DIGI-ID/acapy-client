# IntroductionApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**connectionsConnIdStartIntroductionPost**](IntroductionApi.md#connectionsConnIdStartIntroductionPost) | **POST** /connections/{conn_id}/start-introduction | Start an introduction between two connections



## connectionsConnIdStartIntroductionPost

> Object connectionsConnIdStartIntroductionPost(connId, targetConnectionId, message)

Start an introduction between two connections

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.IntroductionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        IntroductionApi apiInstance = new IntroductionApi(defaultClient);
        String connId = "connId_example"; // String | Connection identifier
        String targetConnectionId = "targetConnectionId_example"; // String | Target connection identifier
        String message = "message_example"; // String | Message
        try {
            Object result = apiInstance.connectionsConnIdStartIntroductionPost(connId, targetConnectionId, message);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntroductionApi#connectionsConnIdStartIntroductionPost");
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
 **targetConnectionId** | **String**| Target connection identifier |
 **message** | **String**| Message | [optional]

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


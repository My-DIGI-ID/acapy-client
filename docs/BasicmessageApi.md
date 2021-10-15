# BasicmessageApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**connectionsConnIdSendMessagePost**](BasicmessageApi.md#connectionsConnIdSendMessagePost) | **POST** /connections/{conn_id}/send-message | Send a basic message to a connection



## connectionsConnIdSendMessagePost

> Object connectionsConnIdSendMessagePost(connId, body)

Send a basic message to a connection

### Example

```java
// Import classes:
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.invoker.model.*;
import com.ibm.ssi.acapy_client.api.BasicmessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        BasicmessageApi apiInstance = new BasicmessageApi(defaultClient);
        String connId = "connId_example"; // String | Connection identifier
        SendMessage body = new SendMessage(); // SendMessage | 
        try {
            Object result = apiInstance.connectionsConnIdSendMessagePost(connId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BasicmessageApi#connectionsConnIdSendMessagePost");
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
 **body** | [**SendMessage**](SendMessage.md)|  | [optional]

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


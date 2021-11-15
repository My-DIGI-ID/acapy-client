# OutOfBandApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**outOfBandCreateInvitationPost**](OutOfBandApi.md#outOfBandCreateInvitationPost) | **POST** /out-of-band/create-invitation | Create a new connection invitation
[**outOfBandReceiveInvitationPost**](OutOfBandApi.md#outOfBandReceiveInvitationPost) | **POST** /out-of-band/receive-invitation | Receive a new connection invitation



## outOfBandCreateInvitationPost

> InvitationRecord outOfBandCreateInvitationPost(autoAccept, multiUse, body)

Create a new connection invitation

### Example

```java
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.OutOfBandApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        OutOfBandApi apiInstance = new OutOfBandApi(defaultClient);
        Boolean autoAccept = true; // Boolean | Auto-accept connection (defaults to configuration)
        Boolean multiUse = true; // Boolean | Create invitation for multiple use (default false)
        InvitationCreateRequest body = new InvitationCreateRequest(); // InvitationCreateRequest | 
        try {
            InvitationRecord result = apiInstance.outOfBandCreateInvitationPost(autoAccept, multiUse, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OutOfBandApi#outOfBandCreateInvitationPost");
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
 **autoAccept** | **Boolean**| Auto-accept connection (defaults to configuration) | [optional]
 **multiUse** | **Boolean**| Create invitation for multiple use (default false) | [optional]
 **body** | [**InvitationCreateRequest**](InvitationCreateRequest.md)|  | [optional]

### Return type

[**InvitationRecord**](InvitationRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## outOfBandReceiveInvitationPost

> ConnRecord outOfBandReceiveInvitationPost(alias, autoAccept, mediationId, useExistingConnection, body)

Receive a new connection invitation

### Example

```java
// Import classes:
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.auth.*;
import io.github.my_digi_id.acapy_client.invoker.model.*;
import io.github.my_digi_id.acapy_client.api.OutOfBandApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        OutOfBandApi apiInstance = new OutOfBandApi(defaultClient);
        String alias = "alias_example"; // String | Alias for connection
        Boolean autoAccept = true; // Boolean | Auto-accept connection (defaults to configuration)
        String mediationId = "mediationId_example"; // String | Identifier for active mediation record to be used
        Boolean useExistingConnection = true; // Boolean | Use an existing connection, if possible
        InvitationMessage body = new InvitationMessage(); // InvitationMessage | 
        try {
            ConnRecord result = apiInstance.outOfBandReceiveInvitationPost(alias, autoAccept, mediationId, useExistingConnection, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OutOfBandApi#outOfBandReceiveInvitationPost");
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
 **alias** | **String**| Alias for connection | [optional]
 **autoAccept** | **Boolean**| Auto-accept connection (defaults to configuration) | [optional]
 **mediationId** | **String**| Identifier for active mediation record to be used | [optional]
 **useExistingConnection** | **Boolean**| Use an existing connection, if possible | [optional]
 **body** | [**InvitationMessage**](InvitationMessage.md)|  | [optional]

### Return type

[**ConnRecord**](ConnRecord.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


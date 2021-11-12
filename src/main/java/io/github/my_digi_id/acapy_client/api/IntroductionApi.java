package io.github.my_digi_id.acapy_client.api;

import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiResponse;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.Pair;

import javax.ws.rs.core.GenericType;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-12T14:46:41.984298+01:00[Europe/Berlin]")
public class IntroductionApi {
  private ApiClient apiClient;

  public IntroductionApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IntroductionApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API cilent
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API cilent
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Start an introduction between two connections
   * 
   * @param connId Connection identifier (required)
   * @param targetConnectionId Target connection identifier (required)
   * @param message Message (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public Object connectionsConnIdStartIntroductionPost(String connId, String targetConnectionId, String message) throws ApiException {
    return connectionsConnIdStartIntroductionPostWithHttpInfo(connId, targetConnectionId, message).getData();
  }

  /**
   * Start an introduction between two connections
   * 
   * @param connId Connection identifier (required)
   * @param targetConnectionId Target connection identifier (required)
   * @param message Message (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> connectionsConnIdStartIntroductionPostWithHttpInfo(String connId, String targetConnectionId, String message) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connId' is set
    if (connId == null) {
      throw new ApiException(400, "Missing the required parameter 'connId' when calling connectionsConnIdStartIntroductionPost");
    }
    
    // verify the required parameter 'targetConnectionId' is set
    if (targetConnectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'targetConnectionId' when calling connectionsConnIdStartIntroductionPost");
    }
    
    // create path and map variables
    String localVarPath = "/connections/{conn_id}/start-introduction"
      .replaceAll("\\{" + "conn_id" + "\\}", apiClient.escapeString(connId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "target_connection_id", targetConnectionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "message", message));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("IntroductionApi.connectionsConnIdStartIntroductionPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}

package com.my_digi_id.acapy_client.api;

import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiResponse;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.my_digi_id.acapy_client.model.SendMessage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-08T11:11:35.214106+01:00[Europe/Berlin]")
public class BasicmessageApi {
  private ApiClient apiClient;

  public BasicmessageApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BasicmessageApi(ApiClient apiClient) {
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
   * Send a basic message to a connection
   * 
   * @param connId Connection identifier (required)
   * @param body  (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public Object connectionsConnIdSendMessagePost(String connId, SendMessage body) throws ApiException {
    return connectionsConnIdSendMessagePostWithHttpInfo(connId, body).getData();
  }

  /**
   * Send a basic message to a connection
   * 
   * @param connId Connection identifier (required)
   * @param body  (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> connectionsConnIdSendMessagePostWithHttpInfo(String connId, SendMessage body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'connId' is set
    if (connId == null) {
      throw new ApiException(400, "Missing the required parameter 'connId' when calling connectionsConnIdSendMessagePost");
    }
    
    // create path and map variables
    String localVarPath = "/connections/{conn_id}/send-message"
      .replaceAll("\\{" + "conn_id" + "\\}", apiClient.escapeString(connId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("BasicmessageApi.connectionsConnIdSendMessagePost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}

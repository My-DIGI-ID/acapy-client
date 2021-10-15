package com.ibm.ssi.acapy_client.api;

import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiResponse;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.ibm.ssi.acapy_client.model.PingRequest;
import com.ibm.ssi.acapy_client.model.PingRequestResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class TrustpingApi {
  private ApiClient apiClient;

  public TrustpingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TrustpingApi(ApiClient apiClient) {
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
   * Send a trust ping to a connection
   * 
   * @param connId Connection identifier (required)
   * @param body  (optional)
   * @return PingRequestResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public PingRequestResponse connectionsConnIdSendPingPost(String connId, PingRequest body) throws ApiException {
    return connectionsConnIdSendPingPostWithHttpInfo(connId, body).getData();
  }

  /**
   * Send a trust ping to a connection
   * 
   * @param connId Connection identifier (required)
   * @param body  (optional)
   * @return ApiResponse&lt;PingRequestResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PingRequestResponse> connectionsConnIdSendPingPostWithHttpInfo(String connId, PingRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'connId' is set
    if (connId == null) {
      throw new ApiException(400, "Missing the required parameter 'connId' when calling connectionsConnIdSendPingPost");
    }
    
    // create path and map variables
    String localVarPath = "/connections/{conn_id}/send-ping"
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

    GenericType<PingRequestResponse> localVarReturnType = new GenericType<PingRequestResponse>() {};

    return apiClient.invokeAPI("TrustpingApi.connectionsConnIdSendPingPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}

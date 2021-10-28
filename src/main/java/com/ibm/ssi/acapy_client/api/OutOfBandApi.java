package com.ibm.ssi.acapy_client.api;

import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiResponse;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.ibm.ssi.acapy_client.model.ConnRecord;
import com.ibm.ssi.acapy_client.model.InvitationCreateRequest;
import com.ibm.ssi.acapy_client.model.InvitationMessage;
import com.ibm.ssi.acapy_client.model.InvitationRecord;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-28T08:24:27.640452+02:00[Europe/Berlin]")
public class OutOfBandApi {
  private ApiClient apiClient;

  public OutOfBandApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OutOfBandApi(ApiClient apiClient) {
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
   * Create a new connection invitation
   * 
   * @param autoAccept Auto-accept connection (defaults to configuration) (optional)
   * @param multiUse Create invitation for multiple use (default false) (optional)
   * @param body  (optional)
   * @return InvitationRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public InvitationRecord outOfBandCreateInvitationPost(Boolean autoAccept, Boolean multiUse, InvitationCreateRequest body) throws ApiException {
    return outOfBandCreateInvitationPostWithHttpInfo(autoAccept, multiUse, body).getData();
  }

  /**
   * Create a new connection invitation
   * 
   * @param autoAccept Auto-accept connection (defaults to configuration) (optional)
   * @param multiUse Create invitation for multiple use (default false) (optional)
   * @param body  (optional)
   * @return ApiResponse&lt;InvitationRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InvitationRecord> outOfBandCreateInvitationPostWithHttpInfo(Boolean autoAccept, Boolean multiUse, InvitationCreateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/out-of-band/create-invitation";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "auto_accept", autoAccept));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "multi_use", multiUse));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<InvitationRecord> localVarReturnType = new GenericType<InvitationRecord>() {};

    return apiClient.invokeAPI("OutOfBandApi.outOfBandCreateInvitationPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Receive a new connection invitation
   * 
   * @param alias Alias for connection (optional)
   * @param autoAccept Auto-accept connection (defaults to configuration) (optional)
   * @param mediationId Identifier for active mediation record to be used (optional)
   * @param useExistingConnection Use an existing connection, if possible (optional)
   * @param body  (optional)
   * @return ConnRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ConnRecord outOfBandReceiveInvitationPost(String alias, Boolean autoAccept, String mediationId, Boolean useExistingConnection, InvitationMessage body) throws ApiException {
    return outOfBandReceiveInvitationPostWithHttpInfo(alias, autoAccept, mediationId, useExistingConnection, body).getData();
  }

  /**
   * Receive a new connection invitation
   * 
   * @param alias Alias for connection (optional)
   * @param autoAccept Auto-accept connection (defaults to configuration) (optional)
   * @param mediationId Identifier for active mediation record to be used (optional)
   * @param useExistingConnection Use an existing connection, if possible (optional)
   * @param body  (optional)
   * @return ApiResponse&lt;ConnRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConnRecord> outOfBandReceiveInvitationPostWithHttpInfo(String alias, Boolean autoAccept, String mediationId, Boolean useExistingConnection, InvitationMessage body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/out-of-band/receive-invitation";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "alias", alias));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "auto_accept", autoAccept));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mediation_id", mediationId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "use_existing_connection", useExistingConnection));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<ConnRecord> localVarReturnType = new GenericType<ConnRecord>() {};

    return apiClient.invokeAPI("OutOfBandApi.outOfBandReceiveInvitationPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}

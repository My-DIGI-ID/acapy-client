package io.github.my_digi_id.acapy_client.api;

import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiResponse;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.Pair;

import javax.ws.rs.core.GenericType;

import io.github.my_digi_id.acapy_client.model.ConnRecord;
import io.github.my_digi_id.acapy_client.model.DIDXRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-12T14:46:41.984298+01:00[Europe/Berlin]")
public class DidExchangeApi {
  private ApiClient apiClient;

  public DidExchangeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DidExchangeApi(ApiClient apiClient) {
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
   * Accept a stored connection invitation
   * 
   * @param connId Connection identifier (required)
   * @param myEndpoint My URL endpoint (optional)
   * @param myLabel Label for connection request (optional)
   * @return ConnRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ConnRecord didexchangeConnIdAcceptInvitationPost(String connId, String myEndpoint, String myLabel) throws ApiException {
    return didexchangeConnIdAcceptInvitationPostWithHttpInfo(connId, myEndpoint, myLabel).getData();
  }

  /**
   * Accept a stored connection invitation
   * 
   * @param connId Connection identifier (required)
   * @param myEndpoint My URL endpoint (optional)
   * @param myLabel Label for connection request (optional)
   * @return ApiResponse&lt;ConnRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConnRecord> didexchangeConnIdAcceptInvitationPostWithHttpInfo(String connId, String myEndpoint, String myLabel) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connId' is set
    if (connId == null) {
      throw new ApiException(400, "Missing the required parameter 'connId' when calling didexchangeConnIdAcceptInvitationPost");
    }
    
    // create path and map variables
    String localVarPath = "/didexchange/{conn_id}/accept-invitation"
      .replaceAll("\\{" + "conn_id" + "\\}", apiClient.escapeString(connId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "my_endpoint", myEndpoint));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "my_label", myLabel));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<ConnRecord> localVarReturnType = new GenericType<ConnRecord>() {};

    return apiClient.invokeAPI("DidExchangeApi.didexchangeConnIdAcceptInvitationPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Accept a stored connection request
   * 
   * @param connId Connection identifier (required)
   * @param mediationId Identifier for active mediation record to be used (optional)
   * @param myEndpoint My URL endpoint (optional)
   * @return ConnRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ConnRecord didexchangeConnIdAcceptRequestPost(String connId, String mediationId, String myEndpoint) throws ApiException {
    return didexchangeConnIdAcceptRequestPostWithHttpInfo(connId, mediationId, myEndpoint).getData();
  }

  /**
   * Accept a stored connection request
   * 
   * @param connId Connection identifier (required)
   * @param mediationId Identifier for active mediation record to be used (optional)
   * @param myEndpoint My URL endpoint (optional)
   * @return ApiResponse&lt;ConnRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConnRecord> didexchangeConnIdAcceptRequestPostWithHttpInfo(String connId, String mediationId, String myEndpoint) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connId' is set
    if (connId == null) {
      throw new ApiException(400, "Missing the required parameter 'connId' when calling didexchangeConnIdAcceptRequestPost");
    }
    
    // create path and map variables
    String localVarPath = "/didexchange/{conn_id}/accept-request"
      .replaceAll("\\{" + "conn_id" + "\\}", apiClient.escapeString(connId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mediation_id", mediationId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "my_endpoint", myEndpoint));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<ConnRecord> localVarReturnType = new GenericType<ConnRecord>() {};

    return apiClient.invokeAPI("DidExchangeApi.didexchangeConnIdAcceptRequestPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create and send a request against public DID&#39;s implicit invitation
   * 
   * @param theirPublicDid Qualified public DID to which to request connection (required)
   * @param mediationId Identifier for active mediation record to be used (optional)
   * @param myEndpoint My URL endpoint (optional)
   * @param myLabel Label for connection request (optional)
   * @param usePublicDid Use public DID for this connection (optional)
   * @return ConnRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ConnRecord didexchangeCreateRequestPost(String theirPublicDid, String mediationId, String myEndpoint, String myLabel, Boolean usePublicDid) throws ApiException {
    return didexchangeCreateRequestPostWithHttpInfo(theirPublicDid, mediationId, myEndpoint, myLabel, usePublicDid).getData();
  }

  /**
   * Create and send a request against public DID&#39;s implicit invitation
   * 
   * @param theirPublicDid Qualified public DID to which to request connection (required)
   * @param mediationId Identifier for active mediation record to be used (optional)
   * @param myEndpoint My URL endpoint (optional)
   * @param myLabel Label for connection request (optional)
   * @param usePublicDid Use public DID for this connection (optional)
   * @return ApiResponse&lt;ConnRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConnRecord> didexchangeCreateRequestPostWithHttpInfo(String theirPublicDid, String mediationId, String myEndpoint, String myLabel, Boolean usePublicDid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'theirPublicDid' is set
    if (theirPublicDid == null) {
      throw new ApiException(400, "Missing the required parameter 'theirPublicDid' when calling didexchangeCreateRequestPost");
    }
    
    // create path and map variables
    String localVarPath = "/didexchange/create-request";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "their_public_did", theirPublicDid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mediation_id", mediationId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "my_endpoint", myEndpoint));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "my_label", myLabel));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "use_public_did", usePublicDid));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<ConnRecord> localVarReturnType = new GenericType<ConnRecord>() {};

    return apiClient.invokeAPI("DidExchangeApi.didexchangeCreateRequestPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Receive request against public DID&#39;s implicit invitation
   * 
   * @param alias Alias for connection (optional)
   * @param autoAccept Auto-accept connection (defaults to configuration) (optional)
   * @param mediationId Identifier for active mediation record to be used (optional)
   * @param myEndpoint My URL endpoint (optional)
   * @param body  (optional)
   * @return ConnRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ConnRecord didexchangeReceiveRequestPost(String alias, Boolean autoAccept, String mediationId, String myEndpoint, DIDXRequest body) throws ApiException {
    return didexchangeReceiveRequestPostWithHttpInfo(alias, autoAccept, mediationId, myEndpoint, body).getData();
  }

  /**
   * Receive request against public DID&#39;s implicit invitation
   * 
   * @param alias Alias for connection (optional)
   * @param autoAccept Auto-accept connection (defaults to configuration) (optional)
   * @param mediationId Identifier for active mediation record to be used (optional)
   * @param myEndpoint My URL endpoint (optional)
   * @param body  (optional)
   * @return ApiResponse&lt;ConnRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConnRecord> didexchangeReceiveRequestPostWithHttpInfo(String alias, Boolean autoAccept, String mediationId, String myEndpoint, DIDXRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/didexchange/receive-request";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "alias", alias));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "auto_accept", autoAccept));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mediation_id", mediationId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "my_endpoint", myEndpoint));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<ConnRecord> localVarReturnType = new GenericType<ConnRecord>() {};

    return apiClient.invokeAPI("DidExchangeApi.didexchangeReceiveRequestPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}

package com.my_digi_id.acapy_client.api;

import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiResponse;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.my_digi_id.acapy_client.model.ConnRecord;
import com.my_digi_id.acapy_client.model.ConnectionList;
import com.my_digi_id.acapy_client.model.ConnectionMetadata;
import com.my_digi_id.acapy_client.model.ConnectionMetadataSetRequest;
import com.my_digi_id.acapy_client.model.ConnectionStaticRequest;
import com.my_digi_id.acapy_client.model.ConnectionStaticResult;
import com.my_digi_id.acapy_client.model.CreateInvitationRequest;
import com.my_digi_id.acapy_client.model.EndpointsResult;
import com.my_digi_id.acapy_client.model.InvitationResult;
import com.my_digi_id.acapy_client.model.ReceiveInvitationRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-08T11:11:35.214106+01:00[Europe/Berlin]")
public class ConnectionApi {
  private ApiClient apiClient;

  public ConnectionApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConnectionApi(ApiClient apiClient) {
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
   * @param mediationId Identifier for active mediation record to be used (optional)
   * @param myEndpoint My URL endpoint (optional)
   * @param myLabel Label for connection (optional)
   * @return ConnRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ConnRecord connectionsConnIdAcceptInvitationPost(String connId, String mediationId, String myEndpoint, String myLabel) throws ApiException {
    return connectionsConnIdAcceptInvitationPostWithHttpInfo(connId, mediationId, myEndpoint, myLabel).getData();
  }

  /**
   * Accept a stored connection invitation
   * 
   * @param connId Connection identifier (required)
   * @param mediationId Identifier for active mediation record to be used (optional)
   * @param myEndpoint My URL endpoint (optional)
   * @param myLabel Label for connection (optional)
   * @return ApiResponse&lt;ConnRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConnRecord> connectionsConnIdAcceptInvitationPostWithHttpInfo(String connId, String mediationId, String myEndpoint, String myLabel) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connId' is set
    if (connId == null) {
      throw new ApiException(400, "Missing the required parameter 'connId' when calling connectionsConnIdAcceptInvitationPost");
    }
    
    // create path and map variables
    String localVarPath = "/connections/{conn_id}/accept-invitation"
      .replaceAll("\\{" + "conn_id" + "\\}", apiClient.escapeString(connId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mediation_id", mediationId));
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

    return apiClient.invokeAPI("ConnectionApi.connectionsConnIdAcceptInvitationPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Accept a stored connection request
   * 
   * @param connId Connection identifier (required)
   * @param myEndpoint My URL endpoint (optional)
   * @return ConnRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ConnRecord connectionsConnIdAcceptRequestPost(String connId, String myEndpoint) throws ApiException {
    return connectionsConnIdAcceptRequestPostWithHttpInfo(connId, myEndpoint).getData();
  }

  /**
   * Accept a stored connection request
   * 
   * @param connId Connection identifier (required)
   * @param myEndpoint My URL endpoint (optional)
   * @return ApiResponse&lt;ConnRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConnRecord> connectionsConnIdAcceptRequestPostWithHttpInfo(String connId, String myEndpoint) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connId' is set
    if (connId == null) {
      throw new ApiException(400, "Missing the required parameter 'connId' when calling connectionsConnIdAcceptRequestPost");
    }
    
    // create path and map variables
    String localVarPath = "/connections/{conn_id}/accept-request"
      .replaceAll("\\{" + "conn_id" + "\\}", apiClient.escapeString(connId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    return apiClient.invokeAPI("ConnectionApi.connectionsConnIdAcceptRequestPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Remove an existing connection record
   * 
   * @param connId Connection identifier (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public Object connectionsConnIdDelete(String connId) throws ApiException {
    return connectionsConnIdDeleteWithHttpInfo(connId).getData();
  }

  /**
   * Remove an existing connection record
   * 
   * @param connId Connection identifier (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> connectionsConnIdDeleteWithHttpInfo(String connId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connId' is set
    if (connId == null) {
      throw new ApiException(400, "Missing the required parameter 'connId' when calling connectionsConnIdDelete");
    }
    
    // create path and map variables
    String localVarPath = "/connections/{conn_id}"
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

    return apiClient.invokeAPI("ConnectionApi.connectionsConnIdDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Fetch connection remote endpoint
   * 
   * @param connId Connection identifier (required)
   * @return EndpointsResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public EndpointsResult connectionsConnIdEndpointsGet(String connId) throws ApiException {
    return connectionsConnIdEndpointsGetWithHttpInfo(connId).getData();
  }

  /**
   * Fetch connection remote endpoint
   * 
   * @param connId Connection identifier (required)
   * @return ApiResponse&lt;EndpointsResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EndpointsResult> connectionsConnIdEndpointsGetWithHttpInfo(String connId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connId' is set
    if (connId == null) {
      throw new ApiException(400, "Missing the required parameter 'connId' when calling connectionsConnIdEndpointsGet");
    }
    
    // create path and map variables
    String localVarPath = "/connections/{conn_id}/endpoints"
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

    GenericType<EndpointsResult> localVarReturnType = new GenericType<EndpointsResult>() {};

    return apiClient.invokeAPI("ConnectionApi.connectionsConnIdEndpointsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Assign another connection as the inbound connection
   * 
   * @param connId Connection identifier (required)
   * @param refId Inbound connection identifier (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public Object connectionsConnIdEstablishInboundRefIdPost(String connId, String refId) throws ApiException {
    return connectionsConnIdEstablishInboundRefIdPostWithHttpInfo(connId, refId).getData();
  }

  /**
   * Assign another connection as the inbound connection
   * 
   * @param connId Connection identifier (required)
   * @param refId Inbound connection identifier (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> connectionsConnIdEstablishInboundRefIdPostWithHttpInfo(String connId, String refId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connId' is set
    if (connId == null) {
      throw new ApiException(400, "Missing the required parameter 'connId' when calling connectionsConnIdEstablishInboundRefIdPost");
    }
    
    // verify the required parameter 'refId' is set
    if (refId == null) {
      throw new ApiException(400, "Missing the required parameter 'refId' when calling connectionsConnIdEstablishInboundRefIdPost");
    }
    
    // create path and map variables
    String localVarPath = "/connections/{conn_id}/establish-inbound/{ref_id}"
      .replaceAll("\\{" + "conn_id" + "\\}", apiClient.escapeString(connId.toString()))
      .replaceAll("\\{" + "ref_id" + "\\}", apiClient.escapeString(refId.toString()));

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

    return apiClient.invokeAPI("ConnectionApi.connectionsConnIdEstablishInboundRefIdPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Fetch a single connection record
   * 
   * @param connId Connection identifier (required)
   * @return ConnRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ConnRecord connectionsConnIdGet(String connId) throws ApiException {
    return connectionsConnIdGetWithHttpInfo(connId).getData();
  }

  /**
   * Fetch a single connection record
   * 
   * @param connId Connection identifier (required)
   * @return ApiResponse&lt;ConnRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConnRecord> connectionsConnIdGetWithHttpInfo(String connId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connId' is set
    if (connId == null) {
      throw new ApiException(400, "Missing the required parameter 'connId' when calling connectionsConnIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/connections/{conn_id}"
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

    GenericType<ConnRecord> localVarReturnType = new GenericType<ConnRecord>() {};

    return apiClient.invokeAPI("ConnectionApi.connectionsConnIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Fetch connection metadata
   * 
   * @param connId Connection identifier (required)
   * @param key Key to retrieve. (optional)
   * @return ConnectionMetadata
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ConnectionMetadata connectionsConnIdMetadataGet(String connId, String key) throws ApiException {
    return connectionsConnIdMetadataGetWithHttpInfo(connId, key).getData();
  }

  /**
   * Fetch connection metadata
   * 
   * @param connId Connection identifier (required)
   * @param key Key to retrieve. (optional)
   * @return ApiResponse&lt;ConnectionMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConnectionMetadata> connectionsConnIdMetadataGetWithHttpInfo(String connId, String key) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connId' is set
    if (connId == null) {
      throw new ApiException(400, "Missing the required parameter 'connId' when calling connectionsConnIdMetadataGet");
    }
    
    // create path and map variables
    String localVarPath = "/connections/{conn_id}/metadata"
      .replaceAll("\\{" + "conn_id" + "\\}", apiClient.escapeString(connId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "key", key));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<ConnectionMetadata> localVarReturnType = new GenericType<ConnectionMetadata>() {};

    return apiClient.invokeAPI("ConnectionApi.connectionsConnIdMetadataGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Set connection metadata
   * 
   * @param connId Connection identifier (required)
   * @param body  (optional)
   * @return ConnectionMetadata
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ConnectionMetadata connectionsConnIdMetadataPost(String connId, ConnectionMetadataSetRequest body) throws ApiException {
    return connectionsConnIdMetadataPostWithHttpInfo(connId, body).getData();
  }

  /**
   * Set connection metadata
   * 
   * @param connId Connection identifier (required)
   * @param body  (optional)
   * @return ApiResponse&lt;ConnectionMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConnectionMetadata> connectionsConnIdMetadataPostWithHttpInfo(String connId, ConnectionMetadataSetRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'connId' is set
    if (connId == null) {
      throw new ApiException(400, "Missing the required parameter 'connId' when calling connectionsConnIdMetadataPost");
    }
    
    // create path and map variables
    String localVarPath = "/connections/{conn_id}/metadata"
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

    GenericType<ConnectionMetadata> localVarReturnType = new GenericType<ConnectionMetadata>() {};

    return apiClient.invokeAPI("ConnectionApi.connectionsConnIdMetadataPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a new connection invitation
   * 
   * @param alias Alias (optional)
   * @param autoAccept Auto-accept connection (defaults to configuration) (optional)
   * @param multiUse Create invitation for multiple use (default false) (optional)
   * @param _public Create invitation from public DID (default false) (optional)
   * @param body  (optional)
   * @return InvitationResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public InvitationResult connectionsCreateInvitationPost(String alias, Boolean autoAccept, Boolean multiUse, Boolean _public, CreateInvitationRequest body) throws ApiException {
    return connectionsCreateInvitationPostWithHttpInfo(alias, autoAccept, multiUse, _public, body).getData();
  }

  /**
   * Create a new connection invitation
   * 
   * @param alias Alias (optional)
   * @param autoAccept Auto-accept connection (defaults to configuration) (optional)
   * @param multiUse Create invitation for multiple use (default false) (optional)
   * @param _public Create invitation from public DID (default false) (optional)
   * @param body  (optional)
   * @return ApiResponse&lt;InvitationResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InvitationResult> connectionsCreateInvitationPostWithHttpInfo(String alias, Boolean autoAccept, Boolean multiUse, Boolean _public, CreateInvitationRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/connections/create-invitation";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "alias", alias));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "auto_accept", autoAccept));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "multi_use", multiUse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "public", _public));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<InvitationResult> localVarReturnType = new GenericType<InvitationResult>() {};

    return apiClient.invokeAPI("ConnectionApi.connectionsCreateInvitationPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a new static connection
   * 
   * @param body  (optional)
   * @return ConnectionStaticResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ConnectionStaticResult connectionsCreateStaticPost(ConnectionStaticRequest body) throws ApiException {
    return connectionsCreateStaticPostWithHttpInfo(body).getData();
  }

  /**
   * Create a new static connection
   * 
   * @param body  (optional)
   * @return ApiResponse&lt;ConnectionStaticResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConnectionStaticResult> connectionsCreateStaticPostWithHttpInfo(ConnectionStaticRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/connections/create-static";

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

    GenericType<ConnectionStaticResult> localVarReturnType = new GenericType<ConnectionStaticResult>() {};

    return apiClient.invokeAPI("ConnectionApi.connectionsCreateStaticPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Query agent-to-agent connections
   * 
   * @param alias Alias (optional)
   * @param connectionProtocol Connection protocol used (optional)
   * @param invitationKey invitation key (optional)
   * @param myDid My DID (optional)
   * @param state Connection state (optional)
   * @param theirDid Their DID (optional)
   * @param theirRole Their role in the connection protocol (optional)
   * @return ConnectionList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ConnectionList connectionsGet(String alias, String connectionProtocol, String invitationKey, String myDid, String state, String theirDid, String theirRole) throws ApiException {
    return connectionsGetWithHttpInfo(alias, connectionProtocol, invitationKey, myDid, state, theirDid, theirRole).getData();
  }

  /**
   * Query agent-to-agent connections
   * 
   * @param alias Alias (optional)
   * @param connectionProtocol Connection protocol used (optional)
   * @param invitationKey invitation key (optional)
   * @param myDid My DID (optional)
   * @param state Connection state (optional)
   * @param theirDid Their DID (optional)
   * @param theirRole Their role in the connection protocol (optional)
   * @return ApiResponse&lt;ConnectionList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConnectionList> connectionsGetWithHttpInfo(String alias, String connectionProtocol, String invitationKey, String myDid, String state, String theirDid, String theirRole) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/connections";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "alias", alias));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "connection_protocol", connectionProtocol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "invitation_key", invitationKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "my_did", myDid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "state", state));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "their_did", theirDid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "their_role", theirRole));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<ConnectionList> localVarReturnType = new GenericType<ConnectionList>() {};

    return apiClient.invokeAPI("ConnectionApi.connectionsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Receive a new connection invitation
   * 
   * @param alias Alias (optional)
   * @param autoAccept Auto-accept connection (defaults to configuration) (optional)
   * @param mediationId Identifier for active mediation record to be used (optional)
   * @param body  (optional)
   * @return ConnRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ConnRecord connectionsReceiveInvitationPost(String alias, Boolean autoAccept, String mediationId, ReceiveInvitationRequest body) throws ApiException {
    return connectionsReceiveInvitationPostWithHttpInfo(alias, autoAccept, mediationId, body).getData();
  }

  /**
   * Receive a new connection invitation
   * 
   * @param alias Alias (optional)
   * @param autoAccept Auto-accept connection (defaults to configuration) (optional)
   * @param mediationId Identifier for active mediation record to be used (optional)
   * @param body  (optional)
   * @return ApiResponse&lt;ConnRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConnRecord> connectionsReceiveInvitationPostWithHttpInfo(String alias, Boolean autoAccept, String mediationId, ReceiveInvitationRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/connections/receive-invitation";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "alias", alias));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "auto_accept", autoAccept));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mediation_id", mediationId));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<ConnRecord> localVarReturnType = new GenericType<ConnRecord>() {};

    return apiClient.invokeAPI("ConnectionApi.connectionsReceiveInvitationPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}

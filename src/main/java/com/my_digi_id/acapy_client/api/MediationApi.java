package com.my_digi_id.acapy_client.api;

import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiResponse;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.my_digi_id.acapy_client.model.AdminMediationDeny;
import com.my_digi_id.acapy_client.model.Keylist;
import com.my_digi_id.acapy_client.model.KeylistQuery;
import com.my_digi_id.acapy_client.model.KeylistQueryFilterRequest;
import com.my_digi_id.acapy_client.model.KeylistUpdate;
import com.my_digi_id.acapy_client.model.KeylistUpdateRequest;
import com.my_digi_id.acapy_client.model.MediationCreateRequest;
import com.my_digi_id.acapy_client.model.MediationDeny;
import com.my_digi_id.acapy_client.model.MediationGrant;
import com.my_digi_id.acapy_client.model.MediationList;
import com.my_digi_id.acapy_client.model.MediationRecord;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-08T11:11:35.214106+01:00[Europe/Berlin]")
public class MediationApi {
  private ApiClient apiClient;

  public MediationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MediationApi(ApiClient apiClient) {
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
   * Clear default mediator
   * 
   * @return MediationRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public MediationRecord mediationDefaultMediatorDelete() throws ApiException {
    return mediationDefaultMediatorDeleteWithHttpInfo().getData();
  }

  /**
   * Clear default mediator
   * 
   * @return ApiResponse&lt;MediationRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MediationRecord> mediationDefaultMediatorDeleteWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/mediation/default-mediator";

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

    GenericType<MediationRecord> localVarReturnType = new GenericType<MediationRecord>() {};

    return apiClient.invokeAPI("MediationApi.mediationDefaultMediatorDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get default mediator
   * 
   * @return MediationRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public MediationRecord mediationDefaultMediatorGet() throws ApiException {
    return mediationDefaultMediatorGetWithHttpInfo().getData();
  }

  /**
   * Get default mediator
   * 
   * @return ApiResponse&lt;MediationRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MediationRecord> mediationDefaultMediatorGetWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/mediation/default-mediator";

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

    GenericType<MediationRecord> localVarReturnType = new GenericType<MediationRecord>() {};

    return apiClient.invokeAPI("MediationApi.mediationDefaultMediatorGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve keylists by connection or role
   * 
   * @param connId Connection identifier (optional) (optional)
   * @param role Filer on role, &#39;client&#39; for keys         mediated by other agents, &#39;server&#39; for keys         mediated by this agent (optional, default to server)
   * @return Keylist
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public Keylist mediationKeylistsGet(UUID connId, String role) throws ApiException {
    return mediationKeylistsGetWithHttpInfo(connId, role).getData();
  }

  /**
   * Retrieve keylists by connection or role
   * 
   * @param connId Connection identifier (optional) (optional)
   * @param role Filer on role, &#39;client&#39; for keys         mediated by other agents, &#39;server&#39; for keys         mediated by this agent (optional, default to server)
   * @return ApiResponse&lt;Keylist&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Keylist> mediationKeylistsGetWithHttpInfo(UUID connId, String role) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/mediation/keylists";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "conn_id", connId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "role", role));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<Keylist> localVarReturnType = new GenericType<Keylist>() {};

    return apiClient.invokeAPI("MediationApi.mediationKeylistsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Send keylist query to mediator
   * 
   * @param mediationId Mediation record identifier (required)
   * @param paginateLimit limit number of results (optional, default to -1)
   * @param paginateOffset offset to use in pagination (optional, default to 0)
   * @param body  (optional)
   * @return KeylistQuery
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public KeylistQuery mediationKeylistsMediationIdSendKeylistQueryPost(UUID mediationId, Integer paginateLimit, Integer paginateOffset, KeylistQueryFilterRequest body) throws ApiException {
    return mediationKeylistsMediationIdSendKeylistQueryPostWithHttpInfo(mediationId, paginateLimit, paginateOffset, body).getData();
  }

  /**
   * Send keylist query to mediator
   * 
   * @param mediationId Mediation record identifier (required)
   * @param paginateLimit limit number of results (optional, default to -1)
   * @param paginateOffset offset to use in pagination (optional, default to 0)
   * @param body  (optional)
   * @return ApiResponse&lt;KeylistQuery&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<KeylistQuery> mediationKeylistsMediationIdSendKeylistQueryPostWithHttpInfo(UUID mediationId, Integer paginateLimit, Integer paginateOffset, KeylistQueryFilterRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'mediationId' is set
    if (mediationId == null) {
      throw new ApiException(400, "Missing the required parameter 'mediationId' when calling mediationKeylistsMediationIdSendKeylistQueryPost");
    }
    
    // create path and map variables
    String localVarPath = "/mediation/keylists/{mediation_id}/send-keylist-query"
      .replaceAll("\\{" + "mediation_id" + "\\}", apiClient.escapeString(mediationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "paginate_limit", paginateLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "paginate_offset", paginateOffset));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<KeylistQuery> localVarReturnType = new GenericType<KeylistQuery>() {};

    return apiClient.invokeAPI("MediationApi.mediationKeylistsMediationIdSendKeylistQueryPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Send keylist update to mediator
   * 
   * @param mediationId Mediation record identifier (required)
   * @param body  (optional)
   * @return KeylistUpdate
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public KeylistUpdate mediationKeylistsMediationIdSendKeylistUpdatePost(UUID mediationId, KeylistUpdateRequest body) throws ApiException {
    return mediationKeylistsMediationIdSendKeylistUpdatePostWithHttpInfo(mediationId, body).getData();
  }

  /**
   * Send keylist update to mediator
   * 
   * @param mediationId Mediation record identifier (required)
   * @param body  (optional)
   * @return ApiResponse&lt;KeylistUpdate&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<KeylistUpdate> mediationKeylistsMediationIdSendKeylistUpdatePostWithHttpInfo(UUID mediationId, KeylistUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'mediationId' is set
    if (mediationId == null) {
      throw new ApiException(400, "Missing the required parameter 'mediationId' when calling mediationKeylistsMediationIdSendKeylistUpdatePost");
    }
    
    // create path and map variables
    String localVarPath = "/mediation/keylists/{mediation_id}/send-keylist-update"
      .replaceAll("\\{" + "mediation_id" + "\\}", apiClient.escapeString(mediationId.toString()));

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

    GenericType<KeylistUpdate> localVarReturnType = new GenericType<KeylistUpdate>() {};

    return apiClient.invokeAPI("MediationApi.mediationKeylistsMediationIdSendKeylistUpdatePost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Set default mediator
   * 
   * @param mediationId Mediation record identifier (required)
   * @return MediationRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public MediationRecord mediationMediationIdDefaultMediatorPut(UUID mediationId) throws ApiException {
    return mediationMediationIdDefaultMediatorPutWithHttpInfo(mediationId).getData();
  }

  /**
   * Set default mediator
   * 
   * @param mediationId Mediation record identifier (required)
   * @return ApiResponse&lt;MediationRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MediationRecord> mediationMediationIdDefaultMediatorPutWithHttpInfo(UUID mediationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'mediationId' is set
    if (mediationId == null) {
      throw new ApiException(400, "Missing the required parameter 'mediationId' when calling mediationMediationIdDefaultMediatorPut");
    }
    
    // create path and map variables
    String localVarPath = "/mediation/{mediation_id}/default-mediator"
      .replaceAll("\\{" + "mediation_id" + "\\}", apiClient.escapeString(mediationId.toString()));

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

    GenericType<MediationRecord> localVarReturnType = new GenericType<MediationRecord>() {};

    return apiClient.invokeAPI("MediationApi.mediationMediationIdDefaultMediatorPut", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Request mediation from connection
   * 
   * @param connId Connection identifier (required)
   * @param body  (optional)
   * @return MediationRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public MediationRecord mediationRequestConnIdPost(String connId, MediationCreateRequest body) throws ApiException {
    return mediationRequestConnIdPostWithHttpInfo(connId, body).getData();
  }

  /**
   * Request mediation from connection
   * 
   * @param connId Connection identifier (required)
   * @param body  (optional)
   * @return ApiResponse&lt;MediationRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MediationRecord> mediationRequestConnIdPostWithHttpInfo(String connId, MediationCreateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'connId' is set
    if (connId == null) {
      throw new ApiException(400, "Missing the required parameter 'connId' when calling mediationRequestConnIdPost");
    }
    
    // create path and map variables
    String localVarPath = "/mediation/request/{conn_id}"
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

    GenericType<MediationRecord> localVarReturnType = new GenericType<MediationRecord>() {};

    return apiClient.invokeAPI("MediationApi.mediationRequestConnIdPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Query mediation requests, returns list of all mediation records
   * 
   * @param connId Connection identifier (optional) (optional)
   * @param mediatorTerms List of mediator rules for recipient (optional)
   * @param recipientTerms List of recipient rules for mediation (optional)
   * @param state Mediation state (optional) (optional)
   * @return MediationList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public MediationList mediationRequestsGet(UUID connId, List<String> mediatorTerms, List<String> recipientTerms, String state) throws ApiException {
    return mediationRequestsGetWithHttpInfo(connId, mediatorTerms, recipientTerms, state).getData();
  }

  /**
   * Query mediation requests, returns list of all mediation records
   * 
   * @param connId Connection identifier (optional) (optional)
   * @param mediatorTerms List of mediator rules for recipient (optional)
   * @param recipientTerms List of recipient rules for mediation (optional)
   * @param state Mediation state (optional) (optional)
   * @return ApiResponse&lt;MediationList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MediationList> mediationRequestsGetWithHttpInfo(UUID connId, List<String> mediatorTerms, List<String> recipientTerms, String state) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/mediation/requests";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "conn_id", connId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "mediator_terms", mediatorTerms));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "recipient_terms", recipientTerms));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "state", state));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<MediationList> localVarReturnType = new GenericType<MediationList>() {};

    return apiClient.invokeAPI("MediationApi.mediationRequestsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete mediation request by ID
   * 
   * @param mediationId Mediation record identifier (required)
   * @return MediationRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public MediationRecord mediationRequestsMediationIdDelete(UUID mediationId) throws ApiException {
    return mediationRequestsMediationIdDeleteWithHttpInfo(mediationId).getData();
  }

  /**
   * Delete mediation request by ID
   * 
   * @param mediationId Mediation record identifier (required)
   * @return ApiResponse&lt;MediationRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MediationRecord> mediationRequestsMediationIdDeleteWithHttpInfo(UUID mediationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'mediationId' is set
    if (mediationId == null) {
      throw new ApiException(400, "Missing the required parameter 'mediationId' when calling mediationRequestsMediationIdDelete");
    }
    
    // create path and map variables
    String localVarPath = "/mediation/requests/{mediation_id}"
      .replaceAll("\\{" + "mediation_id" + "\\}", apiClient.escapeString(mediationId.toString()));

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

    GenericType<MediationRecord> localVarReturnType = new GenericType<MediationRecord>() {};

    return apiClient.invokeAPI("MediationApi.mediationRequestsMediationIdDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Deny a stored mediation request
   * 
   * @param mediationId Mediation record identifier (required)
   * @param body  (optional)
   * @return MediationDeny
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public MediationDeny mediationRequestsMediationIdDenyPost(UUID mediationId, AdminMediationDeny body) throws ApiException {
    return mediationRequestsMediationIdDenyPostWithHttpInfo(mediationId, body).getData();
  }

  /**
   * Deny a stored mediation request
   * 
   * @param mediationId Mediation record identifier (required)
   * @param body  (optional)
   * @return ApiResponse&lt;MediationDeny&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MediationDeny> mediationRequestsMediationIdDenyPostWithHttpInfo(UUID mediationId, AdminMediationDeny body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'mediationId' is set
    if (mediationId == null) {
      throw new ApiException(400, "Missing the required parameter 'mediationId' when calling mediationRequestsMediationIdDenyPost");
    }
    
    // create path and map variables
    String localVarPath = "/mediation/requests/{mediation_id}/deny"
      .replaceAll("\\{" + "mediation_id" + "\\}", apiClient.escapeString(mediationId.toString()));

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

    GenericType<MediationDeny> localVarReturnType = new GenericType<MediationDeny>() {};

    return apiClient.invokeAPI("MediationApi.mediationRequestsMediationIdDenyPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve mediation request record
   * 
   * @param mediationId Mediation record identifier (required)
   * @return MediationRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public MediationRecord mediationRequestsMediationIdGet(UUID mediationId) throws ApiException {
    return mediationRequestsMediationIdGetWithHttpInfo(mediationId).getData();
  }

  /**
   * Retrieve mediation request record
   * 
   * @param mediationId Mediation record identifier (required)
   * @return ApiResponse&lt;MediationRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MediationRecord> mediationRequestsMediationIdGetWithHttpInfo(UUID mediationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'mediationId' is set
    if (mediationId == null) {
      throw new ApiException(400, "Missing the required parameter 'mediationId' when calling mediationRequestsMediationIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/mediation/requests/{mediation_id}"
      .replaceAll("\\{" + "mediation_id" + "\\}", apiClient.escapeString(mediationId.toString()));

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

    GenericType<MediationRecord> localVarReturnType = new GenericType<MediationRecord>() {};

    return apiClient.invokeAPI("MediationApi.mediationRequestsMediationIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Grant received mediation
   * 
   * @param mediationId Mediation record identifier (required)
   * @return MediationGrant
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public MediationGrant mediationRequestsMediationIdGrantPost(UUID mediationId) throws ApiException {
    return mediationRequestsMediationIdGrantPostWithHttpInfo(mediationId).getData();
  }

  /**
   * Grant received mediation
   * 
   * @param mediationId Mediation record identifier (required)
   * @return ApiResponse&lt;MediationGrant&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MediationGrant> mediationRequestsMediationIdGrantPostWithHttpInfo(UUID mediationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'mediationId' is set
    if (mediationId == null) {
      throw new ApiException(400, "Missing the required parameter 'mediationId' when calling mediationRequestsMediationIdGrantPost");
    }
    
    // create path and map variables
    String localVarPath = "/mediation/requests/{mediation_id}/grant"
      .replaceAll("\\{" + "mediation_id" + "\\}", apiClient.escapeString(mediationId.toString()));

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

    GenericType<MediationGrant> localVarReturnType = new GenericType<MediationGrant>() {};

    return apiClient.invokeAPI("MediationApi.mediationRequestsMediationIdGrantPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}

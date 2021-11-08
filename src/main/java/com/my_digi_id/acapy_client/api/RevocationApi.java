package com.my_digi_id.acapy_client.api;

import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiResponse;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.my_digi_id.acapy_client.model.ClearPendingRevocationsRequest;
import com.my_digi_id.acapy_client.model.CredRevRecordResult;
import java.io.File;
import com.my_digi_id.acapy_client.model.PublishRevocations;
import com.my_digi_id.acapy_client.model.RevRegCreateRequest;
import com.my_digi_id.acapy_client.model.RevRegIssuedResult;
import com.my_digi_id.acapy_client.model.RevRegResult;
import com.my_digi_id.acapy_client.model.RevRegUpdateTailsFileUri;
import com.my_digi_id.acapy_client.model.RevRegsCreated;
import com.my_digi_id.acapy_client.model.RevokeRequest;
import com.my_digi_id.acapy_client.model.TxnOrPublishRevocationsResult;
import com.my_digi_id.acapy_client.model.TxnOrRevRegResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-08T11:11:35.214106+01:00[Europe/Berlin]")
public class RevocationApi {
  private ApiClient apiClient;

  public RevocationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RevocationApi(ApiClient apiClient) {
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
   * Get current active revocation registry by credential definition id
   * 
   * @param credDefId Credential definition identifier (required)
   * @return RevRegResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public RevRegResult revocationActiveRegistryCredDefIdGet(String credDefId) throws ApiException {
    return revocationActiveRegistryCredDefIdGetWithHttpInfo(credDefId).getData();
  }

  /**
   * Get current active revocation registry by credential definition id
   * 
   * @param credDefId Credential definition identifier (required)
   * @return ApiResponse&lt;RevRegResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RevRegResult> revocationActiveRegistryCredDefIdGetWithHttpInfo(String credDefId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'credDefId' is set
    if (credDefId == null) {
      throw new ApiException(400, "Missing the required parameter 'credDefId' when calling revocationActiveRegistryCredDefIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/revocation/active-registry/{cred_def_id}"
      .replaceAll("\\{" + "cred_def_id" + "\\}", apiClient.escapeString(credDefId.toString()));

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

    GenericType<RevRegResult> localVarReturnType = new GenericType<RevRegResult>() {};

    return apiClient.invokeAPI("RevocationApi.revocationActiveRegistryCredDefIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Clear pending revocations
   * 
   * @param body  (optional)
   * @return PublishRevocations
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public PublishRevocations revocationClearPendingRevocationsPost(ClearPendingRevocationsRequest body) throws ApiException {
    return revocationClearPendingRevocationsPostWithHttpInfo(body).getData();
  }

  /**
   * Clear pending revocations
   * 
   * @param body  (optional)
   * @return ApiResponse&lt;PublishRevocations&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PublishRevocations> revocationClearPendingRevocationsPostWithHttpInfo(ClearPendingRevocationsRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/revocation/clear-pending-revocations";

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

    GenericType<PublishRevocations> localVarReturnType = new GenericType<PublishRevocations>() {};

    return apiClient.invokeAPI("RevocationApi.revocationClearPendingRevocationsPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Creates a new revocation registry
   * 
   * @param body  (optional)
   * @return RevRegResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public RevRegResult revocationCreateRegistryPost(RevRegCreateRequest body) throws ApiException {
    return revocationCreateRegistryPostWithHttpInfo(body).getData();
  }

  /**
   * Creates a new revocation registry
   * 
   * @param body  (optional)
   * @return ApiResponse&lt;RevRegResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RevRegResult> revocationCreateRegistryPostWithHttpInfo(RevRegCreateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/revocation/create-registry";

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

    GenericType<RevRegResult> localVarReturnType = new GenericType<RevRegResult>() {};

    return apiClient.invokeAPI("RevocationApi.revocationCreateRegistryPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get credential revocation status
   * 
   * @param credExId Credential exchange identifier (optional)
   * @param credRevId Credential revocation identifier (optional)
   * @param revRegId Revocation registry identifier (optional)
   * @return CredRevRecordResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public CredRevRecordResult revocationCredentialRecordGet(String credExId, String credRevId, String revRegId) throws ApiException {
    return revocationCredentialRecordGetWithHttpInfo(credExId, credRevId, revRegId).getData();
  }

  /**
   * Get credential revocation status
   * 
   * @param credExId Credential exchange identifier (optional)
   * @param credRevId Credential revocation identifier (optional)
   * @param revRegId Revocation registry identifier (optional)
   * @return ApiResponse&lt;CredRevRecordResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CredRevRecordResult> revocationCredentialRecordGetWithHttpInfo(String credExId, String credRevId, String revRegId) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/revocation/credential-record";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cred_ex_id", credExId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cred_rev_id", credRevId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "rev_reg_id", revRegId));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<CredRevRecordResult> localVarReturnType = new GenericType<CredRevRecordResult>() {};

    return apiClient.invokeAPI("RevocationApi.revocationCredentialRecordGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Publish pending revocations to ledger
   * 
   * @param connId Connection identifier (optional)
   * @param createTransactionForEndorser Create Transaction For Endorser&#39;s signature (optional)
   * @param body  (optional)
   * @return TxnOrPublishRevocationsResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public TxnOrPublishRevocationsResult revocationPublishRevocationsPost(String connId, Boolean createTransactionForEndorser, PublishRevocations body) throws ApiException {
    return revocationPublishRevocationsPostWithHttpInfo(connId, createTransactionForEndorser, body).getData();
  }

  /**
   * Publish pending revocations to ledger
   * 
   * @param connId Connection identifier (optional)
   * @param createTransactionForEndorser Create Transaction For Endorser&#39;s signature (optional)
   * @param body  (optional)
   * @return ApiResponse&lt;TxnOrPublishRevocationsResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TxnOrPublishRevocationsResult> revocationPublishRevocationsPostWithHttpInfo(String connId, Boolean createTransactionForEndorser, PublishRevocations body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/revocation/publish-revocations";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "conn_id", connId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "create_transaction_for_endorser", createTransactionForEndorser));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<TxnOrPublishRevocationsResult> localVarReturnType = new GenericType<TxnOrPublishRevocationsResult>() {};

    return apiClient.invokeAPI("RevocationApi.revocationPublishRevocationsPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Search for matching revocation registries that current agent created
   * 
   * @param credDefId Credential definition identifier (optional)
   * @param state Revocation registry state (optional)
   * @return RevRegsCreated
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public RevRegsCreated revocationRegistriesCreatedGet(String credDefId, String state) throws ApiException {
    return revocationRegistriesCreatedGetWithHttpInfo(credDefId, state).getData();
  }

  /**
   * Search for matching revocation registries that current agent created
   * 
   * @param credDefId Credential definition identifier (optional)
   * @param state Revocation registry state (optional)
   * @return ApiResponse&lt;RevRegsCreated&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RevRegsCreated> revocationRegistriesCreatedGetWithHttpInfo(String credDefId, String state) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/revocation/registries/created";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cred_def_id", credDefId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "state", state));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<RevRegsCreated> localVarReturnType = new GenericType<RevRegsCreated>() {};

    return apiClient.invokeAPI("RevocationApi.revocationRegistriesCreatedGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Send revocation registry definition to ledger
   * 
   * @param revRegId Revocation Registry identifier (required)
   * @param connId Connection identifier (optional)
   * @param createTransactionForEndorser Create Transaction For Endorser&#39;s signature (optional)
   * @return TxnOrRevRegResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public TxnOrRevRegResult revocationRegistryRevRegIdDefinitionPost(String revRegId, String connId, Boolean createTransactionForEndorser) throws ApiException {
    return revocationRegistryRevRegIdDefinitionPostWithHttpInfo(revRegId, connId, createTransactionForEndorser).getData();
  }

  /**
   * Send revocation registry definition to ledger
   * 
   * @param revRegId Revocation Registry identifier (required)
   * @param connId Connection identifier (optional)
   * @param createTransactionForEndorser Create Transaction For Endorser&#39;s signature (optional)
   * @return ApiResponse&lt;TxnOrRevRegResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TxnOrRevRegResult> revocationRegistryRevRegIdDefinitionPostWithHttpInfo(String revRegId, String connId, Boolean createTransactionForEndorser) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'revRegId' is set
    if (revRegId == null) {
      throw new ApiException(400, "Missing the required parameter 'revRegId' when calling revocationRegistryRevRegIdDefinitionPost");
    }
    
    // create path and map variables
    String localVarPath = "/revocation/registry/{rev_reg_id}/definition"
      .replaceAll("\\{" + "rev_reg_id" + "\\}", apiClient.escapeString(revRegId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "conn_id", connId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "create_transaction_for_endorser", createTransactionForEndorser));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<TxnOrRevRegResult> localVarReturnType = new GenericType<TxnOrRevRegResult>() {};

    return apiClient.invokeAPI("RevocationApi.revocationRegistryRevRegIdDefinitionPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Send revocation registry entry to ledger
   * 
   * @param revRegId Revocation Registry identifier (required)
   * @param connId Connection identifier (optional)
   * @param createTransactionForEndorser Create Transaction For Endorser&#39;s signature (optional)
   * @return RevRegResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public RevRegResult revocationRegistryRevRegIdEntryPost(String revRegId, String connId, Boolean createTransactionForEndorser) throws ApiException {
    return revocationRegistryRevRegIdEntryPostWithHttpInfo(revRegId, connId, createTransactionForEndorser).getData();
  }

  /**
   * Send revocation registry entry to ledger
   * 
   * @param revRegId Revocation Registry identifier (required)
   * @param connId Connection identifier (optional)
   * @param createTransactionForEndorser Create Transaction For Endorser&#39;s signature (optional)
   * @return ApiResponse&lt;RevRegResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RevRegResult> revocationRegistryRevRegIdEntryPostWithHttpInfo(String revRegId, String connId, Boolean createTransactionForEndorser) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'revRegId' is set
    if (revRegId == null) {
      throw new ApiException(400, "Missing the required parameter 'revRegId' when calling revocationRegistryRevRegIdEntryPost");
    }
    
    // create path and map variables
    String localVarPath = "/revocation/registry/{rev_reg_id}/entry"
      .replaceAll("\\{" + "rev_reg_id" + "\\}", apiClient.escapeString(revRegId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "conn_id", connId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "create_transaction_for_endorser", createTransactionForEndorser));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<RevRegResult> localVarReturnType = new GenericType<RevRegResult>() {};

    return apiClient.invokeAPI("RevocationApi.revocationRegistryRevRegIdEntryPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get revocation registry by revocation registry id
   * 
   * @param revRegId Revocation Registry identifier (required)
   * @return RevRegResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public RevRegResult revocationRegistryRevRegIdGet(String revRegId) throws ApiException {
    return revocationRegistryRevRegIdGetWithHttpInfo(revRegId).getData();
  }

  /**
   * Get revocation registry by revocation registry id
   * 
   * @param revRegId Revocation Registry identifier (required)
   * @return ApiResponse&lt;RevRegResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RevRegResult> revocationRegistryRevRegIdGetWithHttpInfo(String revRegId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'revRegId' is set
    if (revRegId == null) {
      throw new ApiException(400, "Missing the required parameter 'revRegId' when calling revocationRegistryRevRegIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/revocation/registry/{rev_reg_id}"
      .replaceAll("\\{" + "rev_reg_id" + "\\}", apiClient.escapeString(revRegId.toString()));

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

    GenericType<RevRegResult> localVarReturnType = new GenericType<RevRegResult>() {};

    return apiClient.invokeAPI("RevocationApi.revocationRegistryRevRegIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get number of credentials issued against revocation registry
   * 
   * @param revRegId Revocation Registry identifier (required)
   * @return RevRegIssuedResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public RevRegIssuedResult revocationRegistryRevRegIdIssuedGet(String revRegId) throws ApiException {
    return revocationRegistryRevRegIdIssuedGetWithHttpInfo(revRegId).getData();
  }

  /**
   * Get number of credentials issued against revocation registry
   * 
   * @param revRegId Revocation Registry identifier (required)
   * @return ApiResponse&lt;RevRegIssuedResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RevRegIssuedResult> revocationRegistryRevRegIdIssuedGetWithHttpInfo(String revRegId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'revRegId' is set
    if (revRegId == null) {
      throw new ApiException(400, "Missing the required parameter 'revRegId' when calling revocationRegistryRevRegIdIssuedGet");
    }
    
    // create path and map variables
    String localVarPath = "/revocation/registry/{rev_reg_id}/issued"
      .replaceAll("\\{" + "rev_reg_id" + "\\}", apiClient.escapeString(revRegId.toString()));

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

    GenericType<RevRegIssuedResult> localVarReturnType = new GenericType<RevRegIssuedResult>() {};

    return apiClient.invokeAPI("RevocationApi.revocationRegistryRevRegIdIssuedGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update revocation registry with new public URI to its tails file
   * 
   * @param revRegId Revocation Registry identifier (required)
   * @param body  (optional)
   * @return RevRegResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public RevRegResult revocationRegistryRevRegIdPatch(String revRegId, RevRegUpdateTailsFileUri body) throws ApiException {
    return revocationRegistryRevRegIdPatchWithHttpInfo(revRegId, body).getData();
  }

  /**
   * Update revocation registry with new public URI to its tails file
   * 
   * @param revRegId Revocation Registry identifier (required)
   * @param body  (optional)
   * @return ApiResponse&lt;RevRegResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RevRegResult> revocationRegistryRevRegIdPatchWithHttpInfo(String revRegId, RevRegUpdateTailsFileUri body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'revRegId' is set
    if (revRegId == null) {
      throw new ApiException(400, "Missing the required parameter 'revRegId' when calling revocationRegistryRevRegIdPatch");
    }
    
    // create path and map variables
    String localVarPath = "/revocation/registry/{rev_reg_id}"
      .replaceAll("\\{" + "rev_reg_id" + "\\}", apiClient.escapeString(revRegId.toString()));

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

    GenericType<RevRegResult> localVarReturnType = new GenericType<RevRegResult>() {};

    return apiClient.invokeAPI("RevocationApi.revocationRegistryRevRegIdPatch", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Set revocation registry state manually
   * 
   * @param revRegId Revocation Registry identifier (required)
   * @param state Revocation registry state to set (required)
   * @return RevRegResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public RevRegResult revocationRegistryRevRegIdSetStatePatch(String revRegId, String state) throws ApiException {
    return revocationRegistryRevRegIdSetStatePatchWithHttpInfo(revRegId, state).getData();
  }

  /**
   * Set revocation registry state manually
   * 
   * @param revRegId Revocation Registry identifier (required)
   * @param state Revocation registry state to set (required)
   * @return ApiResponse&lt;RevRegResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RevRegResult> revocationRegistryRevRegIdSetStatePatchWithHttpInfo(String revRegId, String state) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'revRegId' is set
    if (revRegId == null) {
      throw new ApiException(400, "Missing the required parameter 'revRegId' when calling revocationRegistryRevRegIdSetStatePatch");
    }
    
    // verify the required parameter 'state' is set
    if (state == null) {
      throw new ApiException(400, "Missing the required parameter 'state' when calling revocationRegistryRevRegIdSetStatePatch");
    }
    
    // create path and map variables
    String localVarPath = "/revocation/registry/{rev_reg_id}/set-state"
      .replaceAll("\\{" + "rev_reg_id" + "\\}", apiClient.escapeString(revRegId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "state", state));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<RevRegResult> localVarReturnType = new GenericType<RevRegResult>() {};

    return apiClient.invokeAPI("RevocationApi.revocationRegistryRevRegIdSetStatePatch", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Download tails file
   * 
   * @param revRegId Revocation Registry identifier (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> tails file </td><td>  -  </td></tr>
     </table>
   */
  public File revocationRegistryRevRegIdTailsFileGet(String revRegId) throws ApiException {
    return revocationRegistryRevRegIdTailsFileGetWithHttpInfo(revRegId).getData();
  }

  /**
   * Download tails file
   * 
   * @param revRegId Revocation Registry identifier (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> tails file </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> revocationRegistryRevRegIdTailsFileGetWithHttpInfo(String revRegId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'revRegId' is set
    if (revRegId == null) {
      throw new ApiException(400, "Missing the required parameter 'revRegId' when calling revocationRegistryRevRegIdTailsFileGet");
    }
    
    // create path and map variables
    String localVarPath = "/revocation/registry/{rev_reg_id}/tails-file"
      .replaceAll("\\{" + "rev_reg_id" + "\\}", apiClient.escapeString(revRegId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/octet-stream"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<File> localVarReturnType = new GenericType<File>() {};

    return apiClient.invokeAPI("RevocationApi.revocationRegistryRevRegIdTailsFileGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Upload local tails file to server
   * 
   * @param revRegId Revocation Registry identifier (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public Object revocationRegistryRevRegIdTailsFilePut(String revRegId) throws ApiException {
    return revocationRegistryRevRegIdTailsFilePutWithHttpInfo(revRegId).getData();
  }

  /**
   * Upload local tails file to server
   * 
   * @param revRegId Revocation Registry identifier (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> revocationRegistryRevRegIdTailsFilePutWithHttpInfo(String revRegId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'revRegId' is set
    if (revRegId == null) {
      throw new ApiException(400, "Missing the required parameter 'revRegId' when calling revocationRegistryRevRegIdTailsFilePut");
    }
    
    // create path and map variables
    String localVarPath = "/revocation/registry/{rev_reg_id}/tails-file"
      .replaceAll("\\{" + "rev_reg_id" + "\\}", apiClient.escapeString(revRegId.toString()));

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

    return apiClient.invokeAPI("RevocationApi.revocationRegistryRevRegIdTailsFilePut", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Revoke an issued credential
   * 
   * @param body  (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public Object revocationRevokePost(RevokeRequest body) throws ApiException {
    return revocationRevokePostWithHttpInfo(body).getData();
  }

  /**
   * Revoke an issued credential
   * 
   * @param body  (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> revocationRevokePostWithHttpInfo(RevokeRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/revocation/revoke";

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

    return apiClient.invokeAPI("RevocationApi.revocationRevokePost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}

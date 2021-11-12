package io.github.my_digi_id.acapy_client.api;

import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiResponse;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.Pair;

import javax.ws.rs.core.GenericType;

import io.github.my_digi_id.acapy_client.model.CredentialDefinitionGetResult;
import io.github.my_digi_id.acapy_client.model.CredentialDefinitionSendRequest;
import io.github.my_digi_id.acapy_client.model.CredentialDefinitionsCreatedResult;
import io.github.my_digi_id.acapy_client.model.TxnOrCredentialDefinitionSendResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-12T14:46:41.984298+01:00[Europe/Berlin]")
public class CredentialDefinitionApi {
  private ApiClient apiClient;

  public CredentialDefinitionApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CredentialDefinitionApi(ApiClient apiClient) {
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
   * Search for matching credential definitions that agent originated
   * 
   * @param credDefId Credential definition id (optional)
   * @param issuerDid Issuer DID (optional)
   * @param schemaId Schema identifier (optional)
   * @param schemaIssuerDid Schema issuer DID (optional)
   * @param schemaName Schema name (optional)
   * @param schemaVersion Schema version (optional)
   * @return CredentialDefinitionsCreatedResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public CredentialDefinitionsCreatedResult credentialDefinitionsCreatedGet(String credDefId, String issuerDid, String schemaId, String schemaIssuerDid, String schemaName, String schemaVersion) throws ApiException {
    return credentialDefinitionsCreatedGetWithHttpInfo(credDefId, issuerDid, schemaId, schemaIssuerDid, schemaName, schemaVersion).getData();
  }

  /**
   * Search for matching credential definitions that agent originated
   * 
   * @param credDefId Credential definition id (optional)
   * @param issuerDid Issuer DID (optional)
   * @param schemaId Schema identifier (optional)
   * @param schemaIssuerDid Schema issuer DID (optional)
   * @param schemaName Schema name (optional)
   * @param schemaVersion Schema version (optional)
   * @return ApiResponse&lt;CredentialDefinitionsCreatedResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CredentialDefinitionsCreatedResult> credentialDefinitionsCreatedGetWithHttpInfo(String credDefId, String issuerDid, String schemaId, String schemaIssuerDid, String schemaName, String schemaVersion) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/credential-definitions/created";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cred_def_id", credDefId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "issuer_did", issuerDid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "schema_id", schemaId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "schema_issuer_did", schemaIssuerDid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "schema_name", schemaName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "schema_version", schemaVersion));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<CredentialDefinitionsCreatedResult> localVarReturnType = new GenericType<CredentialDefinitionsCreatedResult>() {};

    return apiClient.invokeAPI("CredentialDefinitionApi.credentialDefinitionsCreatedGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Gets a credential definition from the ledger
   * 
   * @param credDefId Credential definition identifier (required)
   * @return CredentialDefinitionGetResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public CredentialDefinitionGetResult credentialDefinitionsCredDefIdGet(String credDefId) throws ApiException {
    return credentialDefinitionsCredDefIdGetWithHttpInfo(credDefId).getData();
  }

  /**
   * Gets a credential definition from the ledger
   * 
   * @param credDefId Credential definition identifier (required)
   * @return ApiResponse&lt;CredentialDefinitionGetResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CredentialDefinitionGetResult> credentialDefinitionsCredDefIdGetWithHttpInfo(String credDefId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'credDefId' is set
    if (credDefId == null) {
      throw new ApiException(400, "Missing the required parameter 'credDefId' when calling credentialDefinitionsCredDefIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/credential-definitions/{cred_def_id}"
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

    GenericType<CredentialDefinitionGetResult> localVarReturnType = new GenericType<CredentialDefinitionGetResult>() {};

    return apiClient.invokeAPI("CredentialDefinitionApi.credentialDefinitionsCredDefIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Sends a credential definition to the ledger
   * 
   * @param connId Connection identifier (optional)
   * @param createTransactionForEndorser Create Transaction For Endorser&#39;s signature (optional)
   * @param body  (optional)
   * @return TxnOrCredentialDefinitionSendResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public TxnOrCredentialDefinitionSendResult credentialDefinitionsPost(String connId, Boolean createTransactionForEndorser, CredentialDefinitionSendRequest body) throws ApiException {
    return credentialDefinitionsPostWithHttpInfo(connId, createTransactionForEndorser, body).getData();
  }

  /**
   * Sends a credential definition to the ledger
   * 
   * @param connId Connection identifier (optional)
   * @param createTransactionForEndorser Create Transaction For Endorser&#39;s signature (optional)
   * @param body  (optional)
   * @return ApiResponse&lt;TxnOrCredentialDefinitionSendResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TxnOrCredentialDefinitionSendResult> credentialDefinitionsPostWithHttpInfo(String connId, Boolean createTransactionForEndorser, CredentialDefinitionSendRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/credential-definitions";

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

    GenericType<TxnOrCredentialDefinitionSendResult> localVarReturnType = new GenericType<TxnOrCredentialDefinitionSendResult>() {};

    return apiClient.invokeAPI("CredentialDefinitionApi.credentialDefinitionsPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}

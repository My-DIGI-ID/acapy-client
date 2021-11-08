package com.my_digi_id.acapy_client.api;

import com.my_digi_id.acapy_client.invoker.ApiException;
import com.my_digi_id.acapy_client.invoker.ApiClient;
import com.my_digi_id.acapy_client.invoker.ApiResponse;
import com.my_digi_id.acapy_client.invoker.Configuration;
import com.my_digi_id.acapy_client.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.my_digi_id.acapy_client.model.SchemaGetResult;
import com.my_digi_id.acapy_client.model.SchemaSendRequest;
import com.my_digi_id.acapy_client.model.SchemasCreatedResult;
import com.my_digi_id.acapy_client.model.TxnOrSchemaSendResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-08T11:11:35.214106+01:00[Europe/Berlin]")
public class SchemaApi {
  private ApiClient apiClient;

  public SchemaApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SchemaApi(ApiClient apiClient) {
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
   * Search for matching schema that agent originated
   * 
   * @param schemaId Schema identifier (optional)
   * @param schemaIssuerDid Schema issuer DID (optional)
   * @param schemaName Schema name (optional)
   * @param schemaVersion Schema version (optional)
   * @return SchemasCreatedResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public SchemasCreatedResult schemasCreatedGet(String schemaId, String schemaIssuerDid, String schemaName, String schemaVersion) throws ApiException {
    return schemasCreatedGetWithHttpInfo(schemaId, schemaIssuerDid, schemaName, schemaVersion).getData();
  }

  /**
   * Search for matching schema that agent originated
   * 
   * @param schemaId Schema identifier (optional)
   * @param schemaIssuerDid Schema issuer DID (optional)
   * @param schemaName Schema name (optional)
   * @param schemaVersion Schema version (optional)
   * @return ApiResponse&lt;SchemasCreatedResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SchemasCreatedResult> schemasCreatedGetWithHttpInfo(String schemaId, String schemaIssuerDid, String schemaName, String schemaVersion) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/schemas/created";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<SchemasCreatedResult> localVarReturnType = new GenericType<SchemasCreatedResult>() {};

    return apiClient.invokeAPI("SchemaApi.schemasCreatedGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Sends a schema to the ledger
   * 
   * @param connId Connection identifier (optional)
   * @param createTransactionForEndorser Create Transaction For Endorser&#39;s signature (optional)
   * @param body  (optional)
   * @return TxnOrSchemaSendResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public TxnOrSchemaSendResult schemasPost(String connId, Boolean createTransactionForEndorser, SchemaSendRequest body) throws ApiException {
    return schemasPostWithHttpInfo(connId, createTransactionForEndorser, body).getData();
  }

  /**
   * Sends a schema to the ledger
   * 
   * @param connId Connection identifier (optional)
   * @param createTransactionForEndorser Create Transaction For Endorser&#39;s signature (optional)
   * @param body  (optional)
   * @return ApiResponse&lt;TxnOrSchemaSendResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TxnOrSchemaSendResult> schemasPostWithHttpInfo(String connId, Boolean createTransactionForEndorser, SchemaSendRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/schemas";

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

    GenericType<TxnOrSchemaSendResult> localVarReturnType = new GenericType<TxnOrSchemaSendResult>() {};

    return apiClient.invokeAPI("SchemaApi.schemasPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Gets a schema from the ledger
   * 
   * @param schemaId Schema identifier (required)
   * @return SchemaGetResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public SchemaGetResult schemasSchemaIdGet(String schemaId) throws ApiException {
    return schemasSchemaIdGetWithHttpInfo(schemaId).getData();
  }

  /**
   * Gets a schema from the ledger
   * 
   * @param schemaId Schema identifier (required)
   * @return ApiResponse&lt;SchemaGetResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SchemaGetResult> schemasSchemaIdGetWithHttpInfo(String schemaId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'schemaId' is set
    if (schemaId == null) {
      throw new ApiException(400, "Missing the required parameter 'schemaId' when calling schemasSchemaIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/schemas/{schema_id}"
      .replaceAll("\\{" + "schema_id" + "\\}", apiClient.escapeString(schemaId.toString()));

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

    GenericType<SchemaGetResult> localVarReturnType = new GenericType<SchemaGetResult>() {};

    return apiClient.invokeAPI("SchemaApi.schemasSchemaIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}

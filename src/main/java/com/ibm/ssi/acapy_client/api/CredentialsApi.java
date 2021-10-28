package com.ibm.ssi.acapy_client.api;

import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiResponse;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.ibm.ssi.acapy_client.model.AttributeMimeTypesResult;
import com.ibm.ssi.acapy_client.model.CredInfoList;
import com.ibm.ssi.acapy_client.model.CredRevokedResult;
import com.ibm.ssi.acapy_client.model.IndyCredInfo;
import com.ibm.ssi.acapy_client.model.VCRecord;
import com.ibm.ssi.acapy_client.model.VCRecordList;
import com.ibm.ssi.acapy_client.model.W3CCredentialsListRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-28T08:24:27.640452+02:00[Europe/Berlin]")
public class CredentialsApi {
  private ApiClient apiClient;

  public CredentialsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CredentialsApi(ApiClient apiClient) {
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
   * Remove credential from wallet by id
   * 
   * @param credentialId Credential identifier (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public Object credentialCredentialIdDelete(String credentialId) throws ApiException {
    return credentialCredentialIdDeleteWithHttpInfo(credentialId).getData();
  }

  /**
   * Remove credential from wallet by id
   * 
   * @param credentialId Credential identifier (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> credentialCredentialIdDeleteWithHttpInfo(String credentialId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'credentialId' is set
    if (credentialId == null) {
      throw new ApiException(400, "Missing the required parameter 'credentialId' when calling credentialCredentialIdDelete");
    }
    
    // create path and map variables
    String localVarPath = "/credential/{credential_id}"
      .replaceAll("\\{" + "credential_id" + "\\}", apiClient.escapeString(credentialId.toString()));

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

    return apiClient.invokeAPI("CredentialsApi.credentialCredentialIdDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Fetch credential from wallet by id
   * 
   * @param credentialId Credential identifier (required)
   * @return IndyCredInfo
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public IndyCredInfo credentialCredentialIdGet(String credentialId) throws ApiException {
    return credentialCredentialIdGetWithHttpInfo(credentialId).getData();
  }

  /**
   * Fetch credential from wallet by id
   * 
   * @param credentialId Credential identifier (required)
   * @return ApiResponse&lt;IndyCredInfo&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<IndyCredInfo> credentialCredentialIdGetWithHttpInfo(String credentialId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'credentialId' is set
    if (credentialId == null) {
      throw new ApiException(400, "Missing the required parameter 'credentialId' when calling credentialCredentialIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/credential/{credential_id}"
      .replaceAll("\\{" + "credential_id" + "\\}", apiClient.escapeString(credentialId.toString()));

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

    GenericType<IndyCredInfo> localVarReturnType = new GenericType<IndyCredInfo>() {};

    return apiClient.invokeAPI("CredentialsApi.credentialCredentialIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get attribute MIME types from wallet
   * 
   * @param credentialId Credential identifier (required)
   * @return AttributeMimeTypesResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public AttributeMimeTypesResult credentialMimeTypesCredentialIdGet(String credentialId) throws ApiException {
    return credentialMimeTypesCredentialIdGetWithHttpInfo(credentialId).getData();
  }

  /**
   * Get attribute MIME types from wallet
   * 
   * @param credentialId Credential identifier (required)
   * @return ApiResponse&lt;AttributeMimeTypesResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AttributeMimeTypesResult> credentialMimeTypesCredentialIdGetWithHttpInfo(String credentialId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'credentialId' is set
    if (credentialId == null) {
      throw new ApiException(400, "Missing the required parameter 'credentialId' when calling credentialMimeTypesCredentialIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/credential/mime-types/{credential_id}"
      .replaceAll("\\{" + "credential_id" + "\\}", apiClient.escapeString(credentialId.toString()));

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

    GenericType<AttributeMimeTypesResult> localVarReturnType = new GenericType<AttributeMimeTypesResult>() {};

    return apiClient.invokeAPI("CredentialsApi.credentialMimeTypesCredentialIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Query credential revocation status by id
   * 
   * @param credentialId Credential identifier (required)
   * @param from Earliest epoch of revocation status interval of interest (optional)
   * @param to Latest epoch of revocation status interval of interest (optional)
   * @return CredRevokedResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public CredRevokedResult credentialRevokedCredentialIdGet(String credentialId, String from, String to) throws ApiException {
    return credentialRevokedCredentialIdGetWithHttpInfo(credentialId, from, to).getData();
  }

  /**
   * Query credential revocation status by id
   * 
   * @param credentialId Credential identifier (required)
   * @param from Earliest epoch of revocation status interval of interest (optional)
   * @param to Latest epoch of revocation status interval of interest (optional)
   * @return ApiResponse&lt;CredRevokedResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CredRevokedResult> credentialRevokedCredentialIdGetWithHttpInfo(String credentialId, String from, String to) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'credentialId' is set
    if (credentialId == null) {
      throw new ApiException(400, "Missing the required parameter 'credentialId' when calling credentialRevokedCredentialIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/credential/revoked/{credential_id}"
      .replaceAll("\\{" + "credential_id" + "\\}", apiClient.escapeString(credentialId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<CredRevokedResult> localVarReturnType = new GenericType<CredRevokedResult>() {};

    return apiClient.invokeAPI("CredentialsApi.credentialRevokedCredentialIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Remove W3C credential from wallet by id
   * 
   * @param credentialId Credential identifier (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public Object credentialW3cCredentialIdDelete(String credentialId) throws ApiException {
    return credentialW3cCredentialIdDeleteWithHttpInfo(credentialId).getData();
  }

  /**
   * Remove W3C credential from wallet by id
   * 
   * @param credentialId Credential identifier (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> credentialW3cCredentialIdDeleteWithHttpInfo(String credentialId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'credentialId' is set
    if (credentialId == null) {
      throw new ApiException(400, "Missing the required parameter 'credentialId' when calling credentialW3cCredentialIdDelete");
    }
    
    // create path and map variables
    String localVarPath = "/credential/w3c/{credential_id}"
      .replaceAll("\\{" + "credential_id" + "\\}", apiClient.escapeString(credentialId.toString()));

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

    return apiClient.invokeAPI("CredentialsApi.credentialW3cCredentialIdDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Fetch W3C credential from wallet by id
   * 
   * @param credentialId Credential identifier (required)
   * @return VCRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public VCRecord credentialW3cCredentialIdGet(String credentialId) throws ApiException {
    return credentialW3cCredentialIdGetWithHttpInfo(credentialId).getData();
  }

  /**
   * Fetch W3C credential from wallet by id
   * 
   * @param credentialId Credential identifier (required)
   * @return ApiResponse&lt;VCRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VCRecord> credentialW3cCredentialIdGetWithHttpInfo(String credentialId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'credentialId' is set
    if (credentialId == null) {
      throw new ApiException(400, "Missing the required parameter 'credentialId' when calling credentialW3cCredentialIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/credential/w3c/{credential_id}"
      .replaceAll("\\{" + "credential_id" + "\\}", apiClient.escapeString(credentialId.toString()));

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

    GenericType<VCRecord> localVarReturnType = new GenericType<VCRecord>() {};

    return apiClient.invokeAPI("CredentialsApi.credentialW3cCredentialIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Fetch credentials from wallet
   * 
   * @param count Maximum number to retrieve (optional)
   * @param start Start index (optional)
   * @param wql (JSON) WQL query (optional)
   * @return CredInfoList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public CredInfoList credentialsGet(String count, String start, String wql) throws ApiException {
    return credentialsGetWithHttpInfo(count, start, wql).getData();
  }

  /**
   * Fetch credentials from wallet
   * 
   * @param count Maximum number to retrieve (optional)
   * @param start Start index (optional)
   * @param wql (JSON) WQL query (optional)
   * @return ApiResponse&lt;CredInfoList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CredInfoList> credentialsGetWithHttpInfo(String count, String start, String wql) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/credentials";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "wql", wql));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<CredInfoList> localVarReturnType = new GenericType<CredInfoList>() {};

    return apiClient.invokeAPI("CredentialsApi.credentialsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Fetch W3C credentials from wallet
   * 
   * @param count Maximum number to retrieve (optional)
   * @param start Start index (optional)
   * @param wql (JSON) WQL query (optional)
   * @param body  (optional)
   * @return VCRecordList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public VCRecordList credentialsW3cPost(String count, String start, String wql, W3CCredentialsListRequest body) throws ApiException {
    return credentialsW3cPostWithHttpInfo(count, start, wql, body).getData();
  }

  /**
   * Fetch W3C credentials from wallet
   * 
   * @param count Maximum number to retrieve (optional)
   * @param start Start index (optional)
   * @param wql (JSON) WQL query (optional)
   * @param body  (optional)
   * @return ApiResponse&lt;VCRecordList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VCRecordList> credentialsW3cPostWithHttpInfo(String count, String start, String wql, W3CCredentialsListRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/credentials/w3c";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "wql", wql));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<VCRecordList> localVarReturnType = new GenericType<VCRecordList>() {};

    return apiClient.invokeAPI("CredentialsApi.credentialsW3cPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}

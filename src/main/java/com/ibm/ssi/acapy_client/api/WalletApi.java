package com.ibm.ssi.acapy_client.api;

import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiResponse;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.ibm.ssi.acapy_client.model.DIDCreate;
import com.ibm.ssi.acapy_client.model.DIDEndpoint;
import com.ibm.ssi.acapy_client.model.DIDEndpointWithType;
import com.ibm.ssi.acapy_client.model.DIDList;
import com.ibm.ssi.acapy_client.model.DIDResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-28T08:24:27.640452+02:00[Europe/Berlin]")
public class WalletApi {
  private ApiClient apiClient;

  public WalletApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WalletApi(ApiClient apiClient) {
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
   * Create a local DID
   * 
   * @param body  (optional)
   * @return DIDResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public DIDResult walletDidCreatePost(DIDCreate body) throws ApiException {
    return walletDidCreatePostWithHttpInfo(body).getData();
  }

  /**
   * Create a local DID
   * 
   * @param body  (optional)
   * @return ApiResponse&lt;DIDResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DIDResult> walletDidCreatePostWithHttpInfo(DIDCreate body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/wallet/did/create";

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

    GenericType<DIDResult> localVarReturnType = new GenericType<DIDResult>() {};

    return apiClient.invokeAPI("WalletApi.walletDidCreatePost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List wallet DIDs
   * 
   * @param did DID of interest (optional)
   * @param keyType Key type to query for. (optional)
   * @param method DID method to query for. e.g. sov to only fetch indy/sov DIDs (optional)
   * @param posture Whether DID is current public DID, posted to ledger but current public DID, or local to the wallet (optional)
   * @param verkey Verification key of interest (optional)
   * @return DIDList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public DIDList walletDidGet(String did, String keyType, String method, String posture, String verkey) throws ApiException {
    return walletDidGetWithHttpInfo(did, keyType, method, posture, verkey).getData();
  }

  /**
   * List wallet DIDs
   * 
   * @param did DID of interest (optional)
   * @param keyType Key type to query for. (optional)
   * @param method DID method to query for. e.g. sov to only fetch indy/sov DIDs (optional)
   * @param posture Whether DID is current public DID, posted to ledger but current public DID, or local to the wallet (optional)
   * @param verkey Verification key of interest (optional)
   * @return ApiResponse&lt;DIDList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DIDList> walletDidGetWithHttpInfo(String did, String keyType, String method, String posture, String verkey) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/wallet/did";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "did", did));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "key_type", keyType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "method", method));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "posture", posture));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "verkey", verkey));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<DIDList> localVarReturnType = new GenericType<DIDList>() {};

    return apiClient.invokeAPI("WalletApi.walletDidGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Rotate keypair for a DID not posted to the ledger
   * 
   * @param did DID of interest (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public Object walletDidLocalRotateKeypairPatch(String did) throws ApiException {
    return walletDidLocalRotateKeypairPatchWithHttpInfo(did).getData();
  }

  /**
   * Rotate keypair for a DID not posted to the ledger
   * 
   * @param did DID of interest (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> walletDidLocalRotateKeypairPatchWithHttpInfo(String did) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'did' is set
    if (did == null) {
      throw new ApiException(400, "Missing the required parameter 'did' when calling walletDidLocalRotateKeypairPatch");
    }
    
    // create path and map variables
    String localVarPath = "/wallet/did/local/rotate-keypair";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "did", did));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("WalletApi.walletDidLocalRotateKeypairPatch", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Fetch the current public DID
   * 
   * @return DIDResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public DIDResult walletDidPublicGet() throws ApiException {
    return walletDidPublicGetWithHttpInfo().getData();
  }

  /**
   * Fetch the current public DID
   * 
   * @return ApiResponse&lt;DIDResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DIDResult> walletDidPublicGetWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/wallet/did/public";

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

    GenericType<DIDResult> localVarReturnType = new GenericType<DIDResult>() {};

    return apiClient.invokeAPI("WalletApi.walletDidPublicGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Assign the current public DID
   * 
   * @param did DID of interest (required)
   * @return DIDResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public DIDResult walletDidPublicPost(String did) throws ApiException {
    return walletDidPublicPostWithHttpInfo(did).getData();
  }

  /**
   * Assign the current public DID
   * 
   * @param did DID of interest (required)
   * @return ApiResponse&lt;DIDResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DIDResult> walletDidPublicPostWithHttpInfo(String did) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'did' is set
    if (did == null) {
      throw new ApiException(400, "Missing the required parameter 'did' when calling walletDidPublicPost");
    }
    
    // create path and map variables
    String localVarPath = "/wallet/did/public";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "did", did));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<DIDResult> localVarReturnType = new GenericType<DIDResult>() {};

    return apiClient.invokeAPI("WalletApi.walletDidPublicPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Query DID endpoint in wallet
   * 
   * @param did DID of interest (required)
   * @return DIDEndpoint
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public DIDEndpoint walletGetDidEndpointGet(String did) throws ApiException {
    return walletGetDidEndpointGetWithHttpInfo(did).getData();
  }

  /**
   * Query DID endpoint in wallet
   * 
   * @param did DID of interest (required)
   * @return ApiResponse&lt;DIDEndpoint&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DIDEndpoint> walletGetDidEndpointGetWithHttpInfo(String did) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'did' is set
    if (did == null) {
      throw new ApiException(400, "Missing the required parameter 'did' when calling walletGetDidEndpointGet");
    }
    
    // create path and map variables
    String localVarPath = "/wallet/get-did-endpoint";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "did", did));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<DIDEndpoint> localVarReturnType = new GenericType<DIDEndpoint>() {};

    return apiClient.invokeAPI("WalletApi.walletGetDidEndpointGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update endpoint in wallet and on ledger if posted to it
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
  public Object walletSetDidEndpointPost(DIDEndpointWithType body) throws ApiException {
    return walletSetDidEndpointPostWithHttpInfo(body).getData();
  }

  /**
   * Update endpoint in wallet and on ledger if posted to it
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
  public ApiResponse<Object> walletSetDidEndpointPostWithHttpInfo(DIDEndpointWithType body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/wallet/set-did-endpoint";

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

    return apiClient.invokeAPI("WalletApi.walletSetDidEndpointPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}

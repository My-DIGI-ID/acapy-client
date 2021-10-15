package com.ibm.ssi.acapy_client.api;

import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiResponse;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.ibm.ssi.acapy_client.model.GetDIDEndpointResponse;
import com.ibm.ssi.acapy_client.model.GetDIDVerkeyResponse;
import com.ibm.ssi.acapy_client.model.GetNymRoleResponse;
import com.ibm.ssi.acapy_client.model.RegisterLedgerNymResponse;
import com.ibm.ssi.acapy_client.model.TAAAccept;
import com.ibm.ssi.acapy_client.model.TAAResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class LedgerApi {
  private ApiClient apiClient;

  public LedgerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LedgerApi(ApiClient apiClient) {
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
   * Get the endpoint for a DID from the ledger.
   * 
   * @param did DID of interest (required)
   * @param endpointType Endpoint type of interest (default &#39;Endpoint&#39;) (optional)
   * @return GetDIDEndpointResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public GetDIDEndpointResponse ledgerDidEndpointGet(String did, String endpointType) throws ApiException {
    return ledgerDidEndpointGetWithHttpInfo(did, endpointType).getData();
  }

  /**
   * Get the endpoint for a DID from the ledger.
   * 
   * @param did DID of interest (required)
   * @param endpointType Endpoint type of interest (default &#39;Endpoint&#39;) (optional)
   * @return ApiResponse&lt;GetDIDEndpointResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetDIDEndpointResponse> ledgerDidEndpointGetWithHttpInfo(String did, String endpointType) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'did' is set
    if (did == null) {
      throw new ApiException(400, "Missing the required parameter 'did' when calling ledgerDidEndpointGet");
    }
    
    // create path and map variables
    String localVarPath = "/ledger/did-endpoint";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "did", did));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endpoint_type", endpointType));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<GetDIDEndpointResponse> localVarReturnType = new GenericType<GetDIDEndpointResponse>() {};

    return apiClient.invokeAPI("LedgerApi.ledgerDidEndpointGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get the verkey for a DID from the ledger.
   * 
   * @param did DID of interest (required)
   * @return GetDIDVerkeyResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public GetDIDVerkeyResponse ledgerDidVerkeyGet(String did) throws ApiException {
    return ledgerDidVerkeyGetWithHttpInfo(did).getData();
  }

  /**
   * Get the verkey for a DID from the ledger.
   * 
   * @param did DID of interest (required)
   * @return ApiResponse&lt;GetDIDVerkeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetDIDVerkeyResponse> ledgerDidVerkeyGetWithHttpInfo(String did) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'did' is set
    if (did == null) {
      throw new ApiException(400, "Missing the required parameter 'did' when calling ledgerDidVerkeyGet");
    }
    
    // create path and map variables
    String localVarPath = "/ledger/did-verkey";

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

    GenericType<GetDIDVerkeyResponse> localVarReturnType = new GenericType<GetDIDVerkeyResponse>() {};

    return apiClient.invokeAPI("LedgerApi.ledgerDidVerkeyGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get the role from the NYM registration of a public DID.
   * 
   * @param did DID of interest (required)
   * @return GetNymRoleResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public GetNymRoleResponse ledgerGetNymRoleGet(String did) throws ApiException {
    return ledgerGetNymRoleGetWithHttpInfo(did).getData();
  }

  /**
   * Get the role from the NYM registration of a public DID.
   * 
   * @param did DID of interest (required)
   * @return ApiResponse&lt;GetNymRoleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetNymRoleResponse> ledgerGetNymRoleGetWithHttpInfo(String did) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'did' is set
    if (did == null) {
      throw new ApiException(400, "Missing the required parameter 'did' when calling ledgerGetNymRoleGet");
    }
    
    // create path and map variables
    String localVarPath = "/ledger/get-nym-role";

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

    GenericType<GetNymRoleResponse> localVarReturnType = new GenericType<GetNymRoleResponse>() {};

    return apiClient.invokeAPI("LedgerApi.ledgerGetNymRoleGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Send a NYM registration to the ledger.
   * 
   * @param did DID to register (required)
   * @param verkey Verification key (required)
   * @param alias Alias (optional)
   * @param role Role (optional)
   * @return RegisterLedgerNymResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public RegisterLedgerNymResponse ledgerRegisterNymPost(String did, String verkey, String alias, String role) throws ApiException {
    return ledgerRegisterNymPostWithHttpInfo(did, verkey, alias, role).getData();
  }

  /**
   * Send a NYM registration to the ledger.
   * 
   * @param did DID to register (required)
   * @param verkey Verification key (required)
   * @param alias Alias (optional)
   * @param role Role (optional)
   * @return ApiResponse&lt;RegisterLedgerNymResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RegisterLedgerNymResponse> ledgerRegisterNymPostWithHttpInfo(String did, String verkey, String alias, String role) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'did' is set
    if (did == null) {
      throw new ApiException(400, "Missing the required parameter 'did' when calling ledgerRegisterNymPost");
    }
    
    // verify the required parameter 'verkey' is set
    if (verkey == null) {
      throw new ApiException(400, "Missing the required parameter 'verkey' when calling ledgerRegisterNymPost");
    }
    
    // create path and map variables
    String localVarPath = "/ledger/register-nym";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "did", did));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "verkey", verkey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "alias", alias));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "role", role));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<RegisterLedgerNymResponse> localVarReturnType = new GenericType<RegisterLedgerNymResponse>() {};

    return apiClient.invokeAPI("LedgerApi.ledgerRegisterNymPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Rotate key pair for public DID.
   * 
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public Object ledgerRotatePublicDidKeypairPatch() throws ApiException {
    return ledgerRotatePublicDidKeypairPatchWithHttpInfo().getData();
  }

  /**
   * Rotate key pair for public DID.
   * 
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> ledgerRotatePublicDidKeypairPatchWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/ledger/rotate-public-did-keypair";

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

    return apiClient.invokeAPI("LedgerApi.ledgerRotatePublicDidKeypairPatch", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Accept the transaction author agreement
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
  public Object ledgerTaaAcceptPost(TAAAccept body) throws ApiException {
    return ledgerTaaAcceptPostWithHttpInfo(body).getData();
  }

  /**
   * Accept the transaction author agreement
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
  public ApiResponse<Object> ledgerTaaAcceptPostWithHttpInfo(TAAAccept body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/ledger/taa/accept";

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

    return apiClient.invokeAPI("LedgerApi.ledgerTaaAcceptPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Fetch the current transaction author agreement, if any
   * 
   * @return TAAResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public TAAResult ledgerTaaGet() throws ApiException {
    return ledgerTaaGetWithHttpInfo().getData();
  }

  /**
   * Fetch the current transaction author agreement, if any
   * 
   * @return ApiResponse&lt;TAAResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TAAResult> ledgerTaaGetWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/ledger/taa";

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

    GenericType<TAAResult> localVarReturnType = new GenericType<TAAResult>() {};

    return apiClient.invokeAPI("LedgerApi.ledgerTaaGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}

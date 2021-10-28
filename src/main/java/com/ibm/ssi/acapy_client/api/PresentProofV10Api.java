package com.ibm.ssi.acapy_client.api;

import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiResponse;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.ibm.ssi.acapy_client.model.AdminAPIMessageTracing;
import com.ibm.ssi.acapy_client.model.IndyCredPrecis;
import com.ibm.ssi.acapy_client.model.IndyPresSpec;
import java.util.UUID;
import com.ibm.ssi.acapy_client.model.V10PresentationCreateRequestRequest;
import com.ibm.ssi.acapy_client.model.V10PresentationExchange;
import com.ibm.ssi.acapy_client.model.V10PresentationExchangeList;
import com.ibm.ssi.acapy_client.model.V10PresentationProblemReportRequest;
import com.ibm.ssi.acapy_client.model.V10PresentationProposalRequest;
import com.ibm.ssi.acapy_client.model.V10PresentationSendRequestRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-28T08:24:27.640452+02:00[Europe/Berlin]")
public class PresentProofV10Api {
  private ApiClient apiClient;

  public PresentProofV10Api() {
    this(Configuration.getDefaultApiClient());
  }

  public PresentProofV10Api(ApiClient apiClient) {
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
   * Creates a presentation request not bound to any proposal or connection
   * 
   * @param body  (optional)
   * @return V10PresentationExchange
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V10PresentationExchange presentProofCreateRequestPost(V10PresentationCreateRequestRequest body) throws ApiException {
    return presentProofCreateRequestPostWithHttpInfo(body).getData();
  }

  /**
   * Creates a presentation request not bound to any proposal or connection
   * 
   * @param body  (optional)
   * @return ApiResponse&lt;V10PresentationExchange&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V10PresentationExchange> presentProofCreateRequestPostWithHttpInfo(V10PresentationCreateRequestRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/present-proof/create-request";

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

    GenericType<V10PresentationExchange> localVarReturnType = new GenericType<V10PresentationExchange>() {};

    return apiClient.invokeAPI("PresentProofV10Api.presentProofCreateRequestPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Fetch all present-proof exchange records
   * 
   * @param connectionId Connection identifier (optional)
   * @param role Role assigned in presentation exchange (optional)
   * @param state Presentation exchange state (optional)
   * @param threadId Thread identifier (optional)
   * @return V10PresentationExchangeList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V10PresentationExchangeList presentProofRecordsGet(UUID connectionId, String role, String state, UUID threadId) throws ApiException {
    return presentProofRecordsGetWithHttpInfo(connectionId, role, state, threadId).getData();
  }

  /**
   * Fetch all present-proof exchange records
   * 
   * @param connectionId Connection identifier (optional)
   * @param role Role assigned in presentation exchange (optional)
   * @param state Presentation exchange state (optional)
   * @param threadId Thread identifier (optional)
   * @return ApiResponse&lt;V10PresentationExchangeList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V10PresentationExchangeList> presentProofRecordsGetWithHttpInfo(UUID connectionId, String role, String state, UUID threadId) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/present-proof/records";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "connection_id", connectionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "role", role));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "state", state));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "thread_id", threadId));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<V10PresentationExchangeList> localVarReturnType = new GenericType<V10PresentationExchangeList>() {};

    return apiClient.invokeAPI("PresentProofV10Api.presentProofRecordsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Fetch credentials for a presentation request from wallet
   * 
   * @param presExId Presentation exchange identifier (required)
   * @param count Maximum number to retrieve (optional)
   * @param extraQuery (JSON) object mapping referents to extra WQL queries (optional)
   * @param referent Proof request referents of interest, comma-separated (optional)
   * @param start Start index (optional)
   * @return List&lt;IndyCredPrecis&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public List<IndyCredPrecis> presentProofRecordsPresExIdCredentialsGet(String presExId, String count, String extraQuery, String referent, String start) throws ApiException {
    return presentProofRecordsPresExIdCredentialsGetWithHttpInfo(presExId, count, extraQuery, referent, start).getData();
  }

  /**
   * Fetch credentials for a presentation request from wallet
   * 
   * @param presExId Presentation exchange identifier (required)
   * @param count Maximum number to retrieve (optional)
   * @param extraQuery (JSON) object mapping referents to extra WQL queries (optional)
   * @param referent Proof request referents of interest, comma-separated (optional)
   * @param start Start index (optional)
   * @return ApiResponse&lt;List&lt;IndyCredPrecis&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<IndyCredPrecis>> presentProofRecordsPresExIdCredentialsGetWithHttpInfo(String presExId, String count, String extraQuery, String referent, String start) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'presExId' is set
    if (presExId == null) {
      throw new ApiException(400, "Missing the required parameter 'presExId' when calling presentProofRecordsPresExIdCredentialsGet");
    }
    
    // create path and map variables
    String localVarPath = "/present-proof/records/{pres_ex_id}/credentials"
      .replaceAll("\\{" + "pres_ex_id" + "\\}", apiClient.escapeString(presExId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "extra_query", extraQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "referent", referent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<List<IndyCredPrecis>> localVarReturnType = new GenericType<List<IndyCredPrecis>>() {};

    return apiClient.invokeAPI("PresentProofV10Api.presentProofRecordsPresExIdCredentialsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Remove an existing presentation exchange record
   * 
   * @param presExId Presentation exchange identifier (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public Object presentProofRecordsPresExIdDelete(String presExId) throws ApiException {
    return presentProofRecordsPresExIdDeleteWithHttpInfo(presExId).getData();
  }

  /**
   * Remove an existing presentation exchange record
   * 
   * @param presExId Presentation exchange identifier (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> presentProofRecordsPresExIdDeleteWithHttpInfo(String presExId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'presExId' is set
    if (presExId == null) {
      throw new ApiException(400, "Missing the required parameter 'presExId' when calling presentProofRecordsPresExIdDelete");
    }
    
    // create path and map variables
    String localVarPath = "/present-proof/records/{pres_ex_id}"
      .replaceAll("\\{" + "pres_ex_id" + "\\}", apiClient.escapeString(presExId.toString()));

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

    return apiClient.invokeAPI("PresentProofV10Api.presentProofRecordsPresExIdDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Fetch a single presentation exchange record
   * 
   * @param presExId Presentation exchange identifier (required)
   * @return V10PresentationExchange
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V10PresentationExchange presentProofRecordsPresExIdGet(String presExId) throws ApiException {
    return presentProofRecordsPresExIdGetWithHttpInfo(presExId).getData();
  }

  /**
   * Fetch a single presentation exchange record
   * 
   * @param presExId Presentation exchange identifier (required)
   * @return ApiResponse&lt;V10PresentationExchange&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V10PresentationExchange> presentProofRecordsPresExIdGetWithHttpInfo(String presExId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'presExId' is set
    if (presExId == null) {
      throw new ApiException(400, "Missing the required parameter 'presExId' when calling presentProofRecordsPresExIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/present-proof/records/{pres_ex_id}"
      .replaceAll("\\{" + "pres_ex_id" + "\\}", apiClient.escapeString(presExId.toString()));

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

    GenericType<V10PresentationExchange> localVarReturnType = new GenericType<V10PresentationExchange>() {};

    return apiClient.invokeAPI("PresentProofV10Api.presentProofRecordsPresExIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Send a problem report for presentation exchange
   * 
   * @param presExId Presentation exchange identifier (required)
   * @param body  (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public Object presentProofRecordsPresExIdProblemReportPost(String presExId, V10PresentationProblemReportRequest body) throws ApiException {
    return presentProofRecordsPresExIdProblemReportPostWithHttpInfo(presExId, body).getData();
  }

  /**
   * Send a problem report for presentation exchange
   * 
   * @param presExId Presentation exchange identifier (required)
   * @param body  (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> presentProofRecordsPresExIdProblemReportPostWithHttpInfo(String presExId, V10PresentationProblemReportRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'presExId' is set
    if (presExId == null) {
      throw new ApiException(400, "Missing the required parameter 'presExId' when calling presentProofRecordsPresExIdProblemReportPost");
    }
    
    // create path and map variables
    String localVarPath = "/present-proof/records/{pres_ex_id}/problem-report"
      .replaceAll("\\{" + "pres_ex_id" + "\\}", apiClient.escapeString(presExId.toString()));

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

    return apiClient.invokeAPI("PresentProofV10Api.presentProofRecordsPresExIdProblemReportPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Sends a proof presentation
   * 
   * @param presExId Presentation exchange identifier (required)
   * @param body  (optional)
   * @return V10PresentationExchange
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V10PresentationExchange presentProofRecordsPresExIdSendPresentationPost(String presExId, IndyPresSpec body) throws ApiException {
    return presentProofRecordsPresExIdSendPresentationPostWithHttpInfo(presExId, body).getData();
  }

  /**
   * Sends a proof presentation
   * 
   * @param presExId Presentation exchange identifier (required)
   * @param body  (optional)
   * @return ApiResponse&lt;V10PresentationExchange&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V10PresentationExchange> presentProofRecordsPresExIdSendPresentationPostWithHttpInfo(String presExId, IndyPresSpec body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'presExId' is set
    if (presExId == null) {
      throw new ApiException(400, "Missing the required parameter 'presExId' when calling presentProofRecordsPresExIdSendPresentationPost");
    }
    
    // create path and map variables
    String localVarPath = "/present-proof/records/{pres_ex_id}/send-presentation"
      .replaceAll("\\{" + "pres_ex_id" + "\\}", apiClient.escapeString(presExId.toString()));

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

    GenericType<V10PresentationExchange> localVarReturnType = new GenericType<V10PresentationExchange>() {};

    return apiClient.invokeAPI("PresentProofV10Api.presentProofRecordsPresExIdSendPresentationPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Sends a presentation request in reference to a proposal
   * 
   * @param presExId Presentation exchange identifier (required)
   * @param body  (optional)
   * @return V10PresentationExchange
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V10PresentationExchange presentProofRecordsPresExIdSendRequestPost(String presExId, AdminAPIMessageTracing body) throws ApiException {
    return presentProofRecordsPresExIdSendRequestPostWithHttpInfo(presExId, body).getData();
  }

  /**
   * Sends a presentation request in reference to a proposal
   * 
   * @param presExId Presentation exchange identifier (required)
   * @param body  (optional)
   * @return ApiResponse&lt;V10PresentationExchange&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V10PresentationExchange> presentProofRecordsPresExIdSendRequestPostWithHttpInfo(String presExId, AdminAPIMessageTracing body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'presExId' is set
    if (presExId == null) {
      throw new ApiException(400, "Missing the required parameter 'presExId' when calling presentProofRecordsPresExIdSendRequestPost");
    }
    
    // create path and map variables
    String localVarPath = "/present-proof/records/{pres_ex_id}/send-request"
      .replaceAll("\\{" + "pres_ex_id" + "\\}", apiClient.escapeString(presExId.toString()));

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

    GenericType<V10PresentationExchange> localVarReturnType = new GenericType<V10PresentationExchange>() {};

    return apiClient.invokeAPI("PresentProofV10Api.presentProofRecordsPresExIdSendRequestPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Verify a received presentation
   * 
   * @param presExId Presentation exchange identifier (required)
   * @return V10PresentationExchange
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V10PresentationExchange presentProofRecordsPresExIdVerifyPresentationPost(String presExId) throws ApiException {
    return presentProofRecordsPresExIdVerifyPresentationPostWithHttpInfo(presExId).getData();
  }

  /**
   * Verify a received presentation
   * 
   * @param presExId Presentation exchange identifier (required)
   * @return ApiResponse&lt;V10PresentationExchange&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V10PresentationExchange> presentProofRecordsPresExIdVerifyPresentationPostWithHttpInfo(String presExId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'presExId' is set
    if (presExId == null) {
      throw new ApiException(400, "Missing the required parameter 'presExId' when calling presentProofRecordsPresExIdVerifyPresentationPost");
    }
    
    // create path and map variables
    String localVarPath = "/present-proof/records/{pres_ex_id}/verify-presentation"
      .replaceAll("\\{" + "pres_ex_id" + "\\}", apiClient.escapeString(presExId.toString()));

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

    GenericType<V10PresentationExchange> localVarReturnType = new GenericType<V10PresentationExchange>() {};

    return apiClient.invokeAPI("PresentProofV10Api.presentProofRecordsPresExIdVerifyPresentationPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Sends a presentation proposal
   * 
   * @param body  (optional)
   * @return V10PresentationExchange
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V10PresentationExchange presentProofSendProposalPost(V10PresentationProposalRequest body) throws ApiException {
    return presentProofSendProposalPostWithHttpInfo(body).getData();
  }

  /**
   * Sends a presentation proposal
   * 
   * @param body  (optional)
   * @return ApiResponse&lt;V10PresentationExchange&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V10PresentationExchange> presentProofSendProposalPostWithHttpInfo(V10PresentationProposalRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/present-proof/send-proposal";

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

    GenericType<V10PresentationExchange> localVarReturnType = new GenericType<V10PresentationExchange>() {};

    return apiClient.invokeAPI("PresentProofV10Api.presentProofSendProposalPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Sends a free presentation request not bound to any proposal
   * 
   * @param body  (optional)
   * @return V10PresentationExchange
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V10PresentationExchange presentProofSendRequestPost(V10PresentationSendRequestRequest body) throws ApiException {
    return presentProofSendRequestPostWithHttpInfo(body).getData();
  }

  /**
   * Sends a free presentation request not bound to any proposal
   * 
   * @param body  (optional)
   * @return ApiResponse&lt;V10PresentationExchange&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V10PresentationExchange> presentProofSendRequestPostWithHttpInfo(V10PresentationSendRequestRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/present-proof/send-request";

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

    GenericType<V10PresentationExchange> localVarReturnType = new GenericType<V10PresentationExchange>() {};

    return apiClient.invokeAPI("PresentProofV10Api.presentProofSendRequestPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}

package com.ibm.ssi.acapy_client.api;

import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiResponse;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.ibm.ssi.acapy_client.model.AdminAPIMessageTracing;
import com.ibm.ssi.acapy_client.model.IndyCredPrecis;
import java.util.UUID;
import com.ibm.ssi.acapy_client.model.V20PresCreateRequestRequest;
import com.ibm.ssi.acapy_client.model.V20PresExRecord;
import com.ibm.ssi.acapy_client.model.V20PresExRecordList;
import com.ibm.ssi.acapy_client.model.V20PresProblemReportRequest;
import com.ibm.ssi.acapy_client.model.V20PresProposalRequest;
import com.ibm.ssi.acapy_client.model.V20PresSendRequestRequest;
import com.ibm.ssi.acapy_client.model.V20PresSpecByFormatRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class PresentProofV20Api {
  private ApiClient apiClient;

  public PresentProofV20Api() {
    this(Configuration.getDefaultApiClient());
  }

  public PresentProofV20Api(ApiClient apiClient) {
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
   * @return V20PresExRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V20PresExRecord presentProof20CreateRequestPost(V20PresCreateRequestRequest body) throws ApiException {
    return presentProof20CreateRequestPostWithHttpInfo(body).getData();
  }

  /**
   * Creates a presentation request not bound to any proposal or connection
   * 
   * @param body  (optional)
   * @return ApiResponse&lt;V20PresExRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V20PresExRecord> presentProof20CreateRequestPostWithHttpInfo(V20PresCreateRequestRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/present-proof-2.0/create-request";

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

    GenericType<V20PresExRecord> localVarReturnType = new GenericType<V20PresExRecord>() {};

    return apiClient.invokeAPI("PresentProofV20Api.presentProof20CreateRequestPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
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
   * @return V20PresExRecordList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V20PresExRecordList presentProof20RecordsGet(UUID connectionId, String role, String state, UUID threadId) throws ApiException {
    return presentProof20RecordsGetWithHttpInfo(connectionId, role, state, threadId).getData();
  }

  /**
   * Fetch all present-proof exchange records
   * 
   * @param connectionId Connection identifier (optional)
   * @param role Role assigned in presentation exchange (optional)
   * @param state Presentation exchange state (optional)
   * @param threadId Thread identifier (optional)
   * @return ApiResponse&lt;V20PresExRecordList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V20PresExRecordList> presentProof20RecordsGetWithHttpInfo(UUID connectionId, String role, String state, UUID threadId) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/present-proof-2.0/records";

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

    GenericType<V20PresExRecordList> localVarReturnType = new GenericType<V20PresExRecordList>() {};

    return apiClient.invokeAPI("PresentProofV20Api.presentProof20RecordsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Fetch credentials from wallet for presentation request
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
  public List<IndyCredPrecis> presentProof20RecordsPresExIdCredentialsGet(String presExId, String count, String extraQuery, String referent, String start) throws ApiException {
    return presentProof20RecordsPresExIdCredentialsGetWithHttpInfo(presExId, count, extraQuery, referent, start).getData();
  }

  /**
   * Fetch credentials from wallet for presentation request
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
  public ApiResponse<List<IndyCredPrecis>> presentProof20RecordsPresExIdCredentialsGetWithHttpInfo(String presExId, String count, String extraQuery, String referent, String start) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'presExId' is set
    if (presExId == null) {
      throw new ApiException(400, "Missing the required parameter 'presExId' when calling presentProof20RecordsPresExIdCredentialsGet");
    }
    
    // create path and map variables
    String localVarPath = "/present-proof-2.0/records/{pres_ex_id}/credentials"
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

    return apiClient.invokeAPI("PresentProofV20Api.presentProof20RecordsPresExIdCredentialsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
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
  public Object presentProof20RecordsPresExIdDelete(String presExId) throws ApiException {
    return presentProof20RecordsPresExIdDeleteWithHttpInfo(presExId).getData();
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
  public ApiResponse<Object> presentProof20RecordsPresExIdDeleteWithHttpInfo(String presExId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'presExId' is set
    if (presExId == null) {
      throw new ApiException(400, "Missing the required parameter 'presExId' when calling presentProof20RecordsPresExIdDelete");
    }
    
    // create path and map variables
    String localVarPath = "/present-proof-2.0/records/{pres_ex_id}"
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

    return apiClient.invokeAPI("PresentProofV20Api.presentProof20RecordsPresExIdDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Fetch a single presentation exchange record
   * 
   * @param presExId Presentation exchange identifier (required)
   * @return V20PresExRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V20PresExRecord presentProof20RecordsPresExIdGet(String presExId) throws ApiException {
    return presentProof20RecordsPresExIdGetWithHttpInfo(presExId).getData();
  }

  /**
   * Fetch a single presentation exchange record
   * 
   * @param presExId Presentation exchange identifier (required)
   * @return ApiResponse&lt;V20PresExRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V20PresExRecord> presentProof20RecordsPresExIdGetWithHttpInfo(String presExId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'presExId' is set
    if (presExId == null) {
      throw new ApiException(400, "Missing the required parameter 'presExId' when calling presentProof20RecordsPresExIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/present-proof-2.0/records/{pres_ex_id}"
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

    GenericType<V20PresExRecord> localVarReturnType = new GenericType<V20PresExRecord>() {};

    return apiClient.invokeAPI("PresentProofV20Api.presentProof20RecordsPresExIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
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
  public Object presentProof20RecordsPresExIdProblemReportPost(String presExId, V20PresProblemReportRequest body) throws ApiException {
    return presentProof20RecordsPresExIdProblemReportPostWithHttpInfo(presExId, body).getData();
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
  public ApiResponse<Object> presentProof20RecordsPresExIdProblemReportPostWithHttpInfo(String presExId, V20PresProblemReportRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'presExId' is set
    if (presExId == null) {
      throw new ApiException(400, "Missing the required parameter 'presExId' when calling presentProof20RecordsPresExIdProblemReportPost");
    }
    
    // create path and map variables
    String localVarPath = "/present-proof-2.0/records/{pres_ex_id}/problem-report"
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

    return apiClient.invokeAPI("PresentProofV20Api.presentProof20RecordsPresExIdProblemReportPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Sends a proof presentation
   * 
   * @param presExId Presentation exchange identifier (required)
   * @param body  (optional)
   * @return V20PresExRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V20PresExRecord presentProof20RecordsPresExIdSendPresentationPost(String presExId, V20PresSpecByFormatRequest body) throws ApiException {
    return presentProof20RecordsPresExIdSendPresentationPostWithHttpInfo(presExId, body).getData();
  }

  /**
   * Sends a proof presentation
   * 
   * @param presExId Presentation exchange identifier (required)
   * @param body  (optional)
   * @return ApiResponse&lt;V20PresExRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V20PresExRecord> presentProof20RecordsPresExIdSendPresentationPostWithHttpInfo(String presExId, V20PresSpecByFormatRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'presExId' is set
    if (presExId == null) {
      throw new ApiException(400, "Missing the required parameter 'presExId' when calling presentProof20RecordsPresExIdSendPresentationPost");
    }
    
    // create path and map variables
    String localVarPath = "/present-proof-2.0/records/{pres_ex_id}/send-presentation"
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

    GenericType<V20PresExRecord> localVarReturnType = new GenericType<V20PresExRecord>() {};

    return apiClient.invokeAPI("PresentProofV20Api.presentProof20RecordsPresExIdSendPresentationPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Sends a presentation request in reference to a proposal
   * 
   * @param presExId Presentation exchange identifier (required)
   * @param body  (optional)
   * @return V20PresExRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V20PresExRecord presentProof20RecordsPresExIdSendRequestPost(String presExId, AdminAPIMessageTracing body) throws ApiException {
    return presentProof20RecordsPresExIdSendRequestPostWithHttpInfo(presExId, body).getData();
  }

  /**
   * Sends a presentation request in reference to a proposal
   * 
   * @param presExId Presentation exchange identifier (required)
   * @param body  (optional)
   * @return ApiResponse&lt;V20PresExRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V20PresExRecord> presentProof20RecordsPresExIdSendRequestPostWithHttpInfo(String presExId, AdminAPIMessageTracing body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'presExId' is set
    if (presExId == null) {
      throw new ApiException(400, "Missing the required parameter 'presExId' when calling presentProof20RecordsPresExIdSendRequestPost");
    }
    
    // create path and map variables
    String localVarPath = "/present-proof-2.0/records/{pres_ex_id}/send-request"
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

    GenericType<V20PresExRecord> localVarReturnType = new GenericType<V20PresExRecord>() {};

    return apiClient.invokeAPI("PresentProofV20Api.presentProof20RecordsPresExIdSendRequestPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Verify a received presentation
   * 
   * @param presExId Presentation exchange identifier (required)
   * @return V20PresExRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V20PresExRecord presentProof20RecordsPresExIdVerifyPresentationPost(String presExId) throws ApiException {
    return presentProof20RecordsPresExIdVerifyPresentationPostWithHttpInfo(presExId).getData();
  }

  /**
   * Verify a received presentation
   * 
   * @param presExId Presentation exchange identifier (required)
   * @return ApiResponse&lt;V20PresExRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V20PresExRecord> presentProof20RecordsPresExIdVerifyPresentationPostWithHttpInfo(String presExId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'presExId' is set
    if (presExId == null) {
      throw new ApiException(400, "Missing the required parameter 'presExId' when calling presentProof20RecordsPresExIdVerifyPresentationPost");
    }
    
    // create path and map variables
    String localVarPath = "/present-proof-2.0/records/{pres_ex_id}/verify-presentation"
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

    GenericType<V20PresExRecord> localVarReturnType = new GenericType<V20PresExRecord>() {};

    return apiClient.invokeAPI("PresentProofV20Api.presentProof20RecordsPresExIdVerifyPresentationPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Sends a presentation proposal
   * 
   * @param body  (optional)
   * @return V20PresExRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V20PresExRecord presentProof20SendProposalPost(V20PresProposalRequest body) throws ApiException {
    return presentProof20SendProposalPostWithHttpInfo(body).getData();
  }

  /**
   * Sends a presentation proposal
   * 
   * @param body  (optional)
   * @return ApiResponse&lt;V20PresExRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V20PresExRecord> presentProof20SendProposalPostWithHttpInfo(V20PresProposalRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/present-proof-2.0/send-proposal";

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

    GenericType<V20PresExRecord> localVarReturnType = new GenericType<V20PresExRecord>() {};

    return apiClient.invokeAPI("PresentProofV20Api.presentProof20SendProposalPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Sends a free presentation request not bound to any proposal
   * 
   * @param body  (optional)
   * @return V20PresExRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V20PresExRecord presentProof20SendRequestPost(V20PresSendRequestRequest body) throws ApiException {
    return presentProof20SendRequestPostWithHttpInfo(body).getData();
  }

  /**
   * Sends a free presentation request not bound to any proposal
   * 
   * @param body  (optional)
   * @return ApiResponse&lt;V20PresExRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V20PresExRecord> presentProof20SendRequestPostWithHttpInfo(V20PresSendRequestRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/present-proof-2.0/send-request";

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

    GenericType<V20PresExRecord> localVarReturnType = new GenericType<V20PresExRecord>() {};

    return apiClient.invokeAPI("PresentProofV20Api.presentProof20SendRequestPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}

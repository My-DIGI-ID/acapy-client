package com.ibm.ssi.acapy_client.api;

import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiResponse;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.Pair;

import javax.ws.rs.core.GenericType;

import java.util.UUID;
import com.ibm.ssi.acapy_client.model.V10CredentialBoundOfferRequest;
import com.ibm.ssi.acapy_client.model.V10CredentialConnFreeOfferRequest;
import com.ibm.ssi.acapy_client.model.V10CredentialCreate;
import com.ibm.ssi.acapy_client.model.V10CredentialExchange;
import com.ibm.ssi.acapy_client.model.V10CredentialExchangeListResult;
import com.ibm.ssi.acapy_client.model.V10CredentialFreeOfferRequest;
import com.ibm.ssi.acapy_client.model.V10CredentialIssueRequest;
import com.ibm.ssi.acapy_client.model.V10CredentialProblemReportRequest;
import com.ibm.ssi.acapy_client.model.V10CredentialProposalRequestMand;
import com.ibm.ssi.acapy_client.model.V10CredentialProposalRequestOpt;
import com.ibm.ssi.acapy_client.model.V10CredentialStoreRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class IssueCredentialV10Api {
  private ApiClient apiClient;

  public IssueCredentialV10Api() {
    this(Configuration.getDefaultApiClient());
  }

  public IssueCredentialV10Api(ApiClient apiClient) {
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
   * Create a credential offer, independent of any proposal or connection
   * 
   * @param body  (optional)
   * @return V10CredentialExchange
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V10CredentialExchange issueCredentialCreateOfferPost(V10CredentialConnFreeOfferRequest body) throws ApiException {
    return issueCredentialCreateOfferPostWithHttpInfo(body).getData();
  }

  /**
   * Create a credential offer, independent of any proposal or connection
   * 
   * @param body  (optional)
   * @return ApiResponse&lt;V10CredentialExchange&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V10CredentialExchange> issueCredentialCreateOfferPostWithHttpInfo(V10CredentialConnFreeOfferRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/issue-credential/create-offer";

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

    GenericType<V10CredentialExchange> localVarReturnType = new GenericType<V10CredentialExchange>() {};

    return apiClient.invokeAPI("IssueCredentialV10Api.issueCredentialCreateOfferPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Send holder a credential, automating entire flow
   * 
   * @param body  (optional)
   * @return V10CredentialExchange
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V10CredentialExchange issueCredentialCreatePost(V10CredentialCreate body) throws ApiException {
    return issueCredentialCreatePostWithHttpInfo(body).getData();
  }

  /**
   * Send holder a credential, automating entire flow
   * 
   * @param body  (optional)
   * @return ApiResponse&lt;V10CredentialExchange&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V10CredentialExchange> issueCredentialCreatePostWithHttpInfo(V10CredentialCreate body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/issue-credential/create";

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

    GenericType<V10CredentialExchange> localVarReturnType = new GenericType<V10CredentialExchange>() {};

    return apiClient.invokeAPI("IssueCredentialV10Api.issueCredentialCreatePost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Remove an existing credential exchange record
   * 
   * @param credExId Credential exchange identifier (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public Object issueCredentialRecordsCredExIdDelete(String credExId) throws ApiException {
    return issueCredentialRecordsCredExIdDeleteWithHttpInfo(credExId).getData();
  }

  /**
   * Remove an existing credential exchange record
   * 
   * @param credExId Credential exchange identifier (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> issueCredentialRecordsCredExIdDeleteWithHttpInfo(String credExId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'credExId' is set
    if (credExId == null) {
      throw new ApiException(400, "Missing the required parameter 'credExId' when calling issueCredentialRecordsCredExIdDelete");
    }
    
    // create path and map variables
    String localVarPath = "/issue-credential/records/{cred_ex_id}"
      .replaceAll("\\{" + "cred_ex_id" + "\\}", apiClient.escapeString(credExId.toString()));

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

    return apiClient.invokeAPI("IssueCredentialV10Api.issueCredentialRecordsCredExIdDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Fetch a single credential exchange record
   * 
   * @param credExId Credential exchange identifier (required)
   * @return V10CredentialExchange
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V10CredentialExchange issueCredentialRecordsCredExIdGet(String credExId) throws ApiException {
    return issueCredentialRecordsCredExIdGetWithHttpInfo(credExId).getData();
  }

  /**
   * Fetch a single credential exchange record
   * 
   * @param credExId Credential exchange identifier (required)
   * @return ApiResponse&lt;V10CredentialExchange&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V10CredentialExchange> issueCredentialRecordsCredExIdGetWithHttpInfo(String credExId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'credExId' is set
    if (credExId == null) {
      throw new ApiException(400, "Missing the required parameter 'credExId' when calling issueCredentialRecordsCredExIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/issue-credential/records/{cred_ex_id}"
      .replaceAll("\\{" + "cred_ex_id" + "\\}", apiClient.escapeString(credExId.toString()));

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

    GenericType<V10CredentialExchange> localVarReturnType = new GenericType<V10CredentialExchange>() {};

    return apiClient.invokeAPI("IssueCredentialV10Api.issueCredentialRecordsCredExIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Send holder a credential
   * 
   * @param credExId Credential exchange identifier (required)
   * @param body  (optional)
   * @return V10CredentialExchange
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V10CredentialExchange issueCredentialRecordsCredExIdIssuePost(String credExId, V10CredentialIssueRequest body) throws ApiException {
    return issueCredentialRecordsCredExIdIssuePostWithHttpInfo(credExId, body).getData();
  }

  /**
   * Send holder a credential
   * 
   * @param credExId Credential exchange identifier (required)
   * @param body  (optional)
   * @return ApiResponse&lt;V10CredentialExchange&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V10CredentialExchange> issueCredentialRecordsCredExIdIssuePostWithHttpInfo(String credExId, V10CredentialIssueRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'credExId' is set
    if (credExId == null) {
      throw new ApiException(400, "Missing the required parameter 'credExId' when calling issueCredentialRecordsCredExIdIssuePost");
    }
    
    // create path and map variables
    String localVarPath = "/issue-credential/records/{cred_ex_id}/issue"
      .replaceAll("\\{" + "cred_ex_id" + "\\}", apiClient.escapeString(credExId.toString()));

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

    GenericType<V10CredentialExchange> localVarReturnType = new GenericType<V10CredentialExchange>() {};

    return apiClient.invokeAPI("IssueCredentialV10Api.issueCredentialRecordsCredExIdIssuePost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Send a problem report for credential exchange
   * 
   * @param credExId Credential exchange identifier (required)
   * @param body  (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public Object issueCredentialRecordsCredExIdProblemReportPost(String credExId, V10CredentialProblemReportRequest body) throws ApiException {
    return issueCredentialRecordsCredExIdProblemReportPostWithHttpInfo(credExId, body).getData();
  }

  /**
   * Send a problem report for credential exchange
   * 
   * @param credExId Credential exchange identifier (required)
   * @param body  (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> issueCredentialRecordsCredExIdProblemReportPostWithHttpInfo(String credExId, V10CredentialProblemReportRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'credExId' is set
    if (credExId == null) {
      throw new ApiException(400, "Missing the required parameter 'credExId' when calling issueCredentialRecordsCredExIdProblemReportPost");
    }
    
    // create path and map variables
    String localVarPath = "/issue-credential/records/{cred_ex_id}/problem-report"
      .replaceAll("\\{" + "cred_ex_id" + "\\}", apiClient.escapeString(credExId.toString()));

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

    return apiClient.invokeAPI("IssueCredentialV10Api.issueCredentialRecordsCredExIdProblemReportPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Send holder a credential offer in reference to a proposal with preview
   * 
   * @param credExId Credential exchange identifier (required)
   * @param body  (optional)
   * @return V10CredentialExchange
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V10CredentialExchange issueCredentialRecordsCredExIdSendOfferPost(String credExId, V10CredentialBoundOfferRequest body) throws ApiException {
    return issueCredentialRecordsCredExIdSendOfferPostWithHttpInfo(credExId, body).getData();
  }

  /**
   * Send holder a credential offer in reference to a proposal with preview
   * 
   * @param credExId Credential exchange identifier (required)
   * @param body  (optional)
   * @return ApiResponse&lt;V10CredentialExchange&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V10CredentialExchange> issueCredentialRecordsCredExIdSendOfferPostWithHttpInfo(String credExId, V10CredentialBoundOfferRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'credExId' is set
    if (credExId == null) {
      throw new ApiException(400, "Missing the required parameter 'credExId' when calling issueCredentialRecordsCredExIdSendOfferPost");
    }
    
    // create path and map variables
    String localVarPath = "/issue-credential/records/{cred_ex_id}/send-offer"
      .replaceAll("\\{" + "cred_ex_id" + "\\}", apiClient.escapeString(credExId.toString()));

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

    GenericType<V10CredentialExchange> localVarReturnType = new GenericType<V10CredentialExchange>() {};

    return apiClient.invokeAPI("IssueCredentialV10Api.issueCredentialRecordsCredExIdSendOfferPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Send issuer a credential request
   * 
   * @param credExId Credential exchange identifier (required)
   * @return V10CredentialExchange
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V10CredentialExchange issueCredentialRecordsCredExIdSendRequestPost(String credExId) throws ApiException {
    return issueCredentialRecordsCredExIdSendRequestPostWithHttpInfo(credExId).getData();
  }

  /**
   * Send issuer a credential request
   * 
   * @param credExId Credential exchange identifier (required)
   * @return ApiResponse&lt;V10CredentialExchange&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V10CredentialExchange> issueCredentialRecordsCredExIdSendRequestPostWithHttpInfo(String credExId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'credExId' is set
    if (credExId == null) {
      throw new ApiException(400, "Missing the required parameter 'credExId' when calling issueCredentialRecordsCredExIdSendRequestPost");
    }
    
    // create path and map variables
    String localVarPath = "/issue-credential/records/{cred_ex_id}/send-request"
      .replaceAll("\\{" + "cred_ex_id" + "\\}", apiClient.escapeString(credExId.toString()));

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

    GenericType<V10CredentialExchange> localVarReturnType = new GenericType<V10CredentialExchange>() {};

    return apiClient.invokeAPI("IssueCredentialV10Api.issueCredentialRecordsCredExIdSendRequestPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Store a received credential
   * 
   * @param credExId Credential exchange identifier (required)
   * @param body  (optional)
   * @return V10CredentialExchange
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V10CredentialExchange issueCredentialRecordsCredExIdStorePost(String credExId, V10CredentialStoreRequest body) throws ApiException {
    return issueCredentialRecordsCredExIdStorePostWithHttpInfo(credExId, body).getData();
  }

  /**
   * Store a received credential
   * 
   * @param credExId Credential exchange identifier (required)
   * @param body  (optional)
   * @return ApiResponse&lt;V10CredentialExchange&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V10CredentialExchange> issueCredentialRecordsCredExIdStorePostWithHttpInfo(String credExId, V10CredentialStoreRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'credExId' is set
    if (credExId == null) {
      throw new ApiException(400, "Missing the required parameter 'credExId' when calling issueCredentialRecordsCredExIdStorePost");
    }
    
    // create path and map variables
    String localVarPath = "/issue-credential/records/{cred_ex_id}/store"
      .replaceAll("\\{" + "cred_ex_id" + "\\}", apiClient.escapeString(credExId.toString()));

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

    GenericType<V10CredentialExchange> localVarReturnType = new GenericType<V10CredentialExchange>() {};

    return apiClient.invokeAPI("IssueCredentialV10Api.issueCredentialRecordsCredExIdStorePost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Fetch all credential exchange records
   * 
   * @param connectionId Connection identifier (optional)
   * @param role Role assigned in credential exchange (optional)
   * @param state Credential exchange state (optional)
   * @param threadId Thread identifier (optional)
   * @return V10CredentialExchangeListResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V10CredentialExchangeListResult issueCredentialRecordsGet(UUID connectionId, String role, String state, UUID threadId) throws ApiException {
    return issueCredentialRecordsGetWithHttpInfo(connectionId, role, state, threadId).getData();
  }

  /**
   * Fetch all credential exchange records
   * 
   * @param connectionId Connection identifier (optional)
   * @param role Role assigned in credential exchange (optional)
   * @param state Credential exchange state (optional)
   * @param threadId Thread identifier (optional)
   * @return ApiResponse&lt;V10CredentialExchangeListResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V10CredentialExchangeListResult> issueCredentialRecordsGetWithHttpInfo(UUID connectionId, String role, String state, UUID threadId) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/issue-credential/records";

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

    GenericType<V10CredentialExchangeListResult> localVarReturnType = new GenericType<V10CredentialExchangeListResult>() {};

    return apiClient.invokeAPI("IssueCredentialV10Api.issueCredentialRecordsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Send holder a credential offer, independent of any proposal
   * 
   * @param body  (optional)
   * @return V10CredentialExchange
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V10CredentialExchange issueCredentialSendOfferPost(V10CredentialFreeOfferRequest body) throws ApiException {
    return issueCredentialSendOfferPostWithHttpInfo(body).getData();
  }

  /**
   * Send holder a credential offer, independent of any proposal
   * 
   * @param body  (optional)
   * @return ApiResponse&lt;V10CredentialExchange&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V10CredentialExchange> issueCredentialSendOfferPostWithHttpInfo(V10CredentialFreeOfferRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/issue-credential/send-offer";

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

    GenericType<V10CredentialExchange> localVarReturnType = new GenericType<V10CredentialExchange>() {};

    return apiClient.invokeAPI("IssueCredentialV10Api.issueCredentialSendOfferPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Send holder a credential, automating entire flow
   * 
   * @param body  (optional)
   * @return V10CredentialExchange
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V10CredentialExchange issueCredentialSendPost(V10CredentialProposalRequestMand body) throws ApiException {
    return issueCredentialSendPostWithHttpInfo(body).getData();
  }

  /**
   * Send holder a credential, automating entire flow
   * 
   * @param body  (optional)
   * @return ApiResponse&lt;V10CredentialExchange&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V10CredentialExchange> issueCredentialSendPostWithHttpInfo(V10CredentialProposalRequestMand body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/issue-credential/send";

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

    GenericType<V10CredentialExchange> localVarReturnType = new GenericType<V10CredentialExchange>() {};

    return apiClient.invokeAPI("IssueCredentialV10Api.issueCredentialSendPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Send issuer a credential proposal
   * 
   * @param body  (optional)
   * @return V10CredentialExchange
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V10CredentialExchange issueCredentialSendProposalPost(V10CredentialProposalRequestOpt body) throws ApiException {
    return issueCredentialSendProposalPostWithHttpInfo(body).getData();
  }

  /**
   * Send issuer a credential proposal
   * 
   * @param body  (optional)
   * @return ApiResponse&lt;V10CredentialExchange&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V10CredentialExchange> issueCredentialSendProposalPostWithHttpInfo(V10CredentialProposalRequestOpt body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/issue-credential/send-proposal";

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

    GenericType<V10CredentialExchange> localVarReturnType = new GenericType<V10CredentialExchange>() {};

    return apiClient.invokeAPI("IssueCredentialV10Api.issueCredentialSendProposalPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}

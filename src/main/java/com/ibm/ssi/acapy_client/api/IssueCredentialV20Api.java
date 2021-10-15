package com.ibm.ssi.acapy_client.api;

import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiResponse;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.Pair;

import javax.ws.rs.core.GenericType;

import java.util.UUID;
import com.ibm.ssi.acapy_client.model.V20CredBoundOfferRequest;
import com.ibm.ssi.acapy_client.model.V20CredExRecord;
import com.ibm.ssi.acapy_client.model.V20CredExRecordDetail;
import com.ibm.ssi.acapy_client.model.V20CredExRecordListResult;
import com.ibm.ssi.acapy_client.model.V20CredIssueProblemReportRequest;
import com.ibm.ssi.acapy_client.model.V20CredIssueRequest;
import com.ibm.ssi.acapy_client.model.V20CredOfferConnFreeRequest;
import com.ibm.ssi.acapy_client.model.V20CredOfferRequest;
import com.ibm.ssi.acapy_client.model.V20CredRequestFree;
import com.ibm.ssi.acapy_client.model.V20CredRequestRequest;
import com.ibm.ssi.acapy_client.model.V20CredSendRequest;
import com.ibm.ssi.acapy_client.model.V20CredStoreRequest;
import com.ibm.ssi.acapy_client.model.V20IssueCredSchemaCore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class IssueCredentialV20Api {
  private ApiClient apiClient;

  public IssueCredentialV20Api() {
    this(Configuration.getDefaultApiClient());
  }

  public IssueCredentialV20Api(ApiClient apiClient) {
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
   * @return V20CredExRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V20CredExRecord issueCredential20CreateOfferPost(V20CredOfferConnFreeRequest body) throws ApiException {
    return issueCredential20CreateOfferPostWithHttpInfo(body).getData();
  }

  /**
   * Create a credential offer, independent of any proposal or connection
   * 
   * @param body  (optional)
   * @return ApiResponse&lt;V20CredExRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V20CredExRecord> issueCredential20CreateOfferPostWithHttpInfo(V20CredOfferConnFreeRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/issue-credential-2.0/create-offer";

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

    GenericType<V20CredExRecord> localVarReturnType = new GenericType<V20CredExRecord>() {};

    return apiClient.invokeAPI("IssueCredentialV20Api.issueCredential20CreateOfferPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create credential from attribute values
   * 
   * @param body  (optional)
   * @return V20CredExRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V20CredExRecord issueCredential20CreatePost(V20IssueCredSchemaCore body) throws ApiException {
    return issueCredential20CreatePostWithHttpInfo(body).getData();
  }

  /**
   * Create credential from attribute values
   * 
   * @param body  (optional)
   * @return ApiResponse&lt;V20CredExRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V20CredExRecord> issueCredential20CreatePostWithHttpInfo(V20IssueCredSchemaCore body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/issue-credential-2.0/create";

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

    GenericType<V20CredExRecord> localVarReturnType = new GenericType<V20CredExRecord>() {};

    return apiClient.invokeAPI("IssueCredentialV20Api.issueCredential20CreatePost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
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
  public Object issueCredential20RecordsCredExIdDelete(String credExId) throws ApiException {
    return issueCredential20RecordsCredExIdDeleteWithHttpInfo(credExId).getData();
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
  public ApiResponse<Object> issueCredential20RecordsCredExIdDeleteWithHttpInfo(String credExId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'credExId' is set
    if (credExId == null) {
      throw new ApiException(400, "Missing the required parameter 'credExId' when calling issueCredential20RecordsCredExIdDelete");
    }
    
    // create path and map variables
    String localVarPath = "/issue-credential-2.0/records/{cred_ex_id}"
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

    return apiClient.invokeAPI("IssueCredentialV20Api.issueCredential20RecordsCredExIdDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Fetch a single credential exchange record
   * 
   * @param credExId Credential exchange identifier (required)
   * @return V20CredExRecordDetail
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V20CredExRecordDetail issueCredential20RecordsCredExIdGet(String credExId) throws ApiException {
    return issueCredential20RecordsCredExIdGetWithHttpInfo(credExId).getData();
  }

  /**
   * Fetch a single credential exchange record
   * 
   * @param credExId Credential exchange identifier (required)
   * @return ApiResponse&lt;V20CredExRecordDetail&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V20CredExRecordDetail> issueCredential20RecordsCredExIdGetWithHttpInfo(String credExId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'credExId' is set
    if (credExId == null) {
      throw new ApiException(400, "Missing the required parameter 'credExId' when calling issueCredential20RecordsCredExIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/issue-credential-2.0/records/{cred_ex_id}"
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

    GenericType<V20CredExRecordDetail> localVarReturnType = new GenericType<V20CredExRecordDetail>() {};

    return apiClient.invokeAPI("IssueCredentialV20Api.issueCredential20RecordsCredExIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Send holder a credential
   * 
   * @param credExId Credential exchange identifier (required)
   * @param body  (optional)
   * @return V20CredExRecordDetail
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V20CredExRecordDetail issueCredential20RecordsCredExIdIssuePost(String credExId, V20CredIssueRequest body) throws ApiException {
    return issueCredential20RecordsCredExIdIssuePostWithHttpInfo(credExId, body).getData();
  }

  /**
   * Send holder a credential
   * 
   * @param credExId Credential exchange identifier (required)
   * @param body  (optional)
   * @return ApiResponse&lt;V20CredExRecordDetail&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V20CredExRecordDetail> issueCredential20RecordsCredExIdIssuePostWithHttpInfo(String credExId, V20CredIssueRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'credExId' is set
    if (credExId == null) {
      throw new ApiException(400, "Missing the required parameter 'credExId' when calling issueCredential20RecordsCredExIdIssuePost");
    }
    
    // create path and map variables
    String localVarPath = "/issue-credential-2.0/records/{cred_ex_id}/issue"
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

    GenericType<V20CredExRecordDetail> localVarReturnType = new GenericType<V20CredExRecordDetail>() {};

    return apiClient.invokeAPI("IssueCredentialV20Api.issueCredential20RecordsCredExIdIssuePost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
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
  public Object issueCredential20RecordsCredExIdProblemReportPost(String credExId, V20CredIssueProblemReportRequest body) throws ApiException {
    return issueCredential20RecordsCredExIdProblemReportPostWithHttpInfo(credExId, body).getData();
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
  public ApiResponse<Object> issueCredential20RecordsCredExIdProblemReportPostWithHttpInfo(String credExId, V20CredIssueProblemReportRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'credExId' is set
    if (credExId == null) {
      throw new ApiException(400, "Missing the required parameter 'credExId' when calling issueCredential20RecordsCredExIdProblemReportPost");
    }
    
    // create path and map variables
    String localVarPath = "/issue-credential-2.0/records/{cred_ex_id}/problem-report"
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

    return apiClient.invokeAPI("IssueCredentialV20Api.issueCredential20RecordsCredExIdProblemReportPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Send holder a credential offer in reference to a proposal with preview
   * 
   * @param credExId Credential exchange identifier (required)
   * @param body  (optional)
   * @return V20CredExRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V20CredExRecord issueCredential20RecordsCredExIdSendOfferPost(String credExId, V20CredBoundOfferRequest body) throws ApiException {
    return issueCredential20RecordsCredExIdSendOfferPostWithHttpInfo(credExId, body).getData();
  }

  /**
   * Send holder a credential offer in reference to a proposal with preview
   * 
   * @param credExId Credential exchange identifier (required)
   * @param body  (optional)
   * @return ApiResponse&lt;V20CredExRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V20CredExRecord> issueCredential20RecordsCredExIdSendOfferPostWithHttpInfo(String credExId, V20CredBoundOfferRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'credExId' is set
    if (credExId == null) {
      throw new ApiException(400, "Missing the required parameter 'credExId' when calling issueCredential20RecordsCredExIdSendOfferPost");
    }
    
    // create path and map variables
    String localVarPath = "/issue-credential-2.0/records/{cred_ex_id}/send-offer"
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

    GenericType<V20CredExRecord> localVarReturnType = new GenericType<V20CredExRecord>() {};

    return apiClient.invokeAPI("IssueCredentialV20Api.issueCredential20RecordsCredExIdSendOfferPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Send issuer a credential request
   * 
   * @param credExId Credential exchange identifier (required)
   * @param body  (optional)
   * @return V20CredExRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V20CredExRecord issueCredential20RecordsCredExIdSendRequestPost(String credExId, V20CredRequestRequest body) throws ApiException {
    return issueCredential20RecordsCredExIdSendRequestPostWithHttpInfo(credExId, body).getData();
  }

  /**
   * Send issuer a credential request
   * 
   * @param credExId Credential exchange identifier (required)
   * @param body  (optional)
   * @return ApiResponse&lt;V20CredExRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V20CredExRecord> issueCredential20RecordsCredExIdSendRequestPostWithHttpInfo(String credExId, V20CredRequestRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'credExId' is set
    if (credExId == null) {
      throw new ApiException(400, "Missing the required parameter 'credExId' when calling issueCredential20RecordsCredExIdSendRequestPost");
    }
    
    // create path and map variables
    String localVarPath = "/issue-credential-2.0/records/{cred_ex_id}/send-request"
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

    GenericType<V20CredExRecord> localVarReturnType = new GenericType<V20CredExRecord>() {};

    return apiClient.invokeAPI("IssueCredentialV20Api.issueCredential20RecordsCredExIdSendRequestPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Store a received credential
   * 
   * @param credExId Credential exchange identifier (required)
   * @param body  (optional)
   * @return V20CredExRecordDetail
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V20CredExRecordDetail issueCredential20RecordsCredExIdStorePost(String credExId, V20CredStoreRequest body) throws ApiException {
    return issueCredential20RecordsCredExIdStorePostWithHttpInfo(credExId, body).getData();
  }

  /**
   * Store a received credential
   * 
   * @param credExId Credential exchange identifier (required)
   * @param body  (optional)
   * @return ApiResponse&lt;V20CredExRecordDetail&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V20CredExRecordDetail> issueCredential20RecordsCredExIdStorePostWithHttpInfo(String credExId, V20CredStoreRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'credExId' is set
    if (credExId == null) {
      throw new ApiException(400, "Missing the required parameter 'credExId' when calling issueCredential20RecordsCredExIdStorePost");
    }
    
    // create path and map variables
    String localVarPath = "/issue-credential-2.0/records/{cred_ex_id}/store"
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

    GenericType<V20CredExRecordDetail> localVarReturnType = new GenericType<V20CredExRecordDetail>() {};

    return apiClient.invokeAPI("IssueCredentialV20Api.issueCredential20RecordsCredExIdStorePost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
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
   * @return V20CredExRecordListResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V20CredExRecordListResult issueCredential20RecordsGet(UUID connectionId, String role, String state, UUID threadId) throws ApiException {
    return issueCredential20RecordsGetWithHttpInfo(connectionId, role, state, threadId).getData();
  }

  /**
   * Fetch all credential exchange records
   * 
   * @param connectionId Connection identifier (optional)
   * @param role Role assigned in credential exchange (optional)
   * @param state Credential exchange state (optional)
   * @param threadId Thread identifier (optional)
   * @return ApiResponse&lt;V20CredExRecordListResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V20CredExRecordListResult> issueCredential20RecordsGetWithHttpInfo(UUID connectionId, String role, String state, UUID threadId) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/issue-credential-2.0/records";

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

    GenericType<V20CredExRecordListResult> localVarReturnType = new GenericType<V20CredExRecordListResult>() {};

    return apiClient.invokeAPI("IssueCredentialV20Api.issueCredential20RecordsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Send holder a credential offer, independent of any proposal
   * 
   * @param body  (optional)
   * @return V20CredExRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V20CredExRecord issueCredential20SendOfferPost(V20CredOfferRequest body) throws ApiException {
    return issueCredential20SendOfferPostWithHttpInfo(body).getData();
  }

  /**
   * Send holder a credential offer, independent of any proposal
   * 
   * @param body  (optional)
   * @return ApiResponse&lt;V20CredExRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V20CredExRecord> issueCredential20SendOfferPostWithHttpInfo(V20CredOfferRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/issue-credential-2.0/send-offer";

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

    GenericType<V20CredExRecord> localVarReturnType = new GenericType<V20CredExRecord>() {};

    return apiClient.invokeAPI("IssueCredentialV20Api.issueCredential20SendOfferPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Send holder a credential, automating entire flow
   * 
   * @param body  (optional)
   * @return V20CredExRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V20CredExRecord issueCredential20SendPost(V20CredSendRequest body) throws ApiException {
    return issueCredential20SendPostWithHttpInfo(body).getData();
  }

  /**
   * Send holder a credential, automating entire flow
   * 
   * @param body  (optional)
   * @return ApiResponse&lt;V20CredExRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V20CredExRecord> issueCredential20SendPostWithHttpInfo(V20CredSendRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/issue-credential-2.0/send";

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

    GenericType<V20CredExRecord> localVarReturnType = new GenericType<V20CredExRecord>() {};

    return apiClient.invokeAPI("IssueCredentialV20Api.issueCredential20SendPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Send issuer a credential proposal
   * 
   * @param body  (optional)
   * @return V20CredExRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V20CredExRecord issueCredential20SendProposalPost(V20IssueCredSchemaCore body) throws ApiException {
    return issueCredential20SendProposalPostWithHttpInfo(body).getData();
  }

  /**
   * Send issuer a credential proposal
   * 
   * @param body  (optional)
   * @return ApiResponse&lt;V20CredExRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V20CredExRecord> issueCredential20SendProposalPostWithHttpInfo(V20IssueCredSchemaCore body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/issue-credential-2.0/send-proposal";

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

    GenericType<V20CredExRecord> localVarReturnType = new GenericType<V20CredExRecord>() {};

    return apiClient.invokeAPI("IssueCredentialV20Api.issueCredential20SendProposalPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Send issuer a credential request not bound to an existing thread. Indy credentials cannot start at a request
   * 
   * @param body  (optional)
   * @return V20CredExRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public V20CredExRecord issueCredential20SendRequestPost(V20CredRequestFree body) throws ApiException {
    return issueCredential20SendRequestPostWithHttpInfo(body).getData();
  }

  /**
   * Send issuer a credential request not bound to an existing thread. Indy credentials cannot start at a request
   * 
   * @param body  (optional)
   * @return ApiResponse&lt;V20CredExRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<V20CredExRecord> issueCredential20SendRequestPostWithHttpInfo(V20CredRequestFree body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/issue-credential-2.0/send-request";

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

    GenericType<V20CredExRecord> localVarReturnType = new GenericType<V20CredExRecord>() {};

    return apiClient.invokeAPI("IssueCredentialV20Api.issueCredential20SendRequestPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}

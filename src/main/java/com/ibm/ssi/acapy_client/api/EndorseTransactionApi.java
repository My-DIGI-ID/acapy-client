package com.ibm.ssi.acapy_client.api;

import com.ibm.ssi.acapy_client.invoker.ApiException;
import com.ibm.ssi.acapy_client.invoker.ApiClient;
import com.ibm.ssi.acapy_client.invoker.ApiResponse;
import com.ibm.ssi.acapy_client.invoker.Configuration;
import com.ibm.ssi.acapy_client.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.ibm.ssi.acapy_client.model.EndorserInfo;
import com.ibm.ssi.acapy_client.model.TransactionJobs;
import com.ibm.ssi.acapy_client.model.TransactionList;
import com.ibm.ssi.acapy_client.model.TransactionRecord;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-28T08:24:27.640452+02:00[Europe/Berlin]")
public class EndorseTransactionApi {
  private ApiClient apiClient;

  public EndorseTransactionApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EndorseTransactionApi(ApiClient apiClient) {
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
   * For Author to resend a particular transaction request
   * 
   * @param tranId Transaction identifier (required)
   * @return TransactionRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public TransactionRecord transactionTranIdResendPost(String tranId) throws ApiException {
    return transactionTranIdResendPostWithHttpInfo(tranId).getData();
  }

  /**
   * For Author to resend a particular transaction request
   * 
   * @param tranId Transaction identifier (required)
   * @return ApiResponse&lt;TransactionRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TransactionRecord> transactionTranIdResendPostWithHttpInfo(String tranId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tranId' is set
    if (tranId == null) {
      throw new ApiException(400, "Missing the required parameter 'tranId' when calling transactionTranIdResendPost");
    }
    
    // create path and map variables
    String localVarPath = "/transaction/{tran_id}/resend"
      .replaceAll("\\{" + "tran_id" + "\\}", apiClient.escapeString(tranId.toString()));

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

    GenericType<TransactionRecord> localVarReturnType = new GenericType<TransactionRecord>() {};

    return apiClient.invokeAPI("EndorseTransactionApi.transactionTranIdResendPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Set Endorser Info
   * 
   * @param connId Connection identifier (required)
   * @param endorserDid Endorser DID (required)
   * @param endorserName Endorser Name (optional)
   * @return EndorserInfo
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public EndorserInfo transactionsConnIdSetEndorserInfoPost(String connId, String endorserDid, String endorserName) throws ApiException {
    return transactionsConnIdSetEndorserInfoPostWithHttpInfo(connId, endorserDid, endorserName).getData();
  }

  /**
   * Set Endorser Info
   * 
   * @param connId Connection identifier (required)
   * @param endorserDid Endorser DID (required)
   * @param endorserName Endorser Name (optional)
   * @return ApiResponse&lt;EndorserInfo&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EndorserInfo> transactionsConnIdSetEndorserInfoPostWithHttpInfo(String connId, String endorserDid, String endorserName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connId' is set
    if (connId == null) {
      throw new ApiException(400, "Missing the required parameter 'connId' when calling transactionsConnIdSetEndorserInfoPost");
    }
    
    // verify the required parameter 'endorserDid' is set
    if (endorserDid == null) {
      throw new ApiException(400, "Missing the required parameter 'endorserDid' when calling transactionsConnIdSetEndorserInfoPost");
    }
    
    // create path and map variables
    String localVarPath = "/transactions/{conn_id}/set-endorser-info"
      .replaceAll("\\{" + "conn_id" + "\\}", apiClient.escapeString(connId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endorser_did", endorserDid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endorser_name", endorserName));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<EndorserInfo> localVarReturnType = new GenericType<EndorserInfo>() {};

    return apiClient.invokeAPI("EndorseTransactionApi.transactionsConnIdSetEndorserInfoPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Set transaction jobs
   * 
   * @param connId Connection identifier (required)
   * @param transactionMyJob Transaction related jobs (optional)
   * @return TransactionJobs
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public TransactionJobs transactionsConnIdSetEndorserRolePost(String connId, String transactionMyJob) throws ApiException {
    return transactionsConnIdSetEndorserRolePostWithHttpInfo(connId, transactionMyJob).getData();
  }

  /**
   * Set transaction jobs
   * 
   * @param connId Connection identifier (required)
   * @param transactionMyJob Transaction related jobs (optional)
   * @return ApiResponse&lt;TransactionJobs&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TransactionJobs> transactionsConnIdSetEndorserRolePostWithHttpInfo(String connId, String transactionMyJob) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connId' is set
    if (connId == null) {
      throw new ApiException(400, "Missing the required parameter 'connId' when calling transactionsConnIdSetEndorserRolePost");
    }
    
    // create path and map variables
    String localVarPath = "/transactions/{conn_id}/set-endorser-role"
      .replaceAll("\\{" + "conn_id" + "\\}", apiClient.escapeString(connId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "transaction_my_job", transactionMyJob));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<TransactionJobs> localVarReturnType = new GenericType<TransactionJobs>() {};

    return apiClient.invokeAPI("EndorseTransactionApi.transactionsConnIdSetEndorserRolePost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * For author to send a transaction request
   * 
   * @param tranId Transaction identifier (required)
   * @param endorserWriteTxn Endorser will write the transaction after endorsing it (optional)
   * @param body  (optional)
   * @return TransactionRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public TransactionRecord transactionsCreateRequestPost(String tranId, Boolean endorserWriteTxn, java.util.Date body) throws ApiException {
    return transactionsCreateRequestPostWithHttpInfo(tranId, endorserWriteTxn, body).getData();
  }

  /**
   * For author to send a transaction request
   * 
   * @param tranId Transaction identifier (required)
   * @param endorserWriteTxn Endorser will write the transaction after endorsing it (optional)
   * @param body  (optional)
   * @return ApiResponse&lt;TransactionRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TransactionRecord> transactionsCreateRequestPostWithHttpInfo(String tranId, Boolean endorserWriteTxn, java.util.Date body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'tranId' is set
    if (tranId == null) {
      throw new ApiException(400, "Missing the required parameter 'tranId' when calling transactionsCreateRequestPost");
    }
    
    // create path and map variables
    String localVarPath = "/transactions/create-request";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tran_id", tranId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endorser_write_txn", endorserWriteTxn));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyHeader" };

    GenericType<TransactionRecord> localVarReturnType = new GenericType<TransactionRecord>() {};

    return apiClient.invokeAPI("EndorseTransactionApi.transactionsCreateRequestPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Query transactions
   * 
   * @return TransactionList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public TransactionList transactionsGet() throws ApiException {
    return transactionsGetWithHttpInfo().getData();
  }

  /**
   * Query transactions
   * 
   * @return ApiResponse&lt;TransactionList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TransactionList> transactionsGetWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/transactions";

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

    GenericType<TransactionList> localVarReturnType = new GenericType<TransactionList>() {};

    return apiClient.invokeAPI("EndorseTransactionApi.transactionsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * For Author to cancel a particular transaction request
   * 
   * @param tranId Transaction identifier (required)
   * @return TransactionRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public TransactionRecord transactionsTranIdCancelPost(String tranId) throws ApiException {
    return transactionsTranIdCancelPostWithHttpInfo(tranId).getData();
  }

  /**
   * For Author to cancel a particular transaction request
   * 
   * @param tranId Transaction identifier (required)
   * @return ApiResponse&lt;TransactionRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TransactionRecord> transactionsTranIdCancelPostWithHttpInfo(String tranId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tranId' is set
    if (tranId == null) {
      throw new ApiException(400, "Missing the required parameter 'tranId' when calling transactionsTranIdCancelPost");
    }
    
    // create path and map variables
    String localVarPath = "/transactions/{tran_id}/cancel"
      .replaceAll("\\{" + "tran_id" + "\\}", apiClient.escapeString(tranId.toString()));

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

    GenericType<TransactionRecord> localVarReturnType = new GenericType<TransactionRecord>() {};

    return apiClient.invokeAPI("EndorseTransactionApi.transactionsTranIdCancelPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * For Endorser to endorse a particular transaction record
   * 
   * @param tranId Transaction identifier (required)
   * @return TransactionRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public TransactionRecord transactionsTranIdEndorsePost(String tranId) throws ApiException {
    return transactionsTranIdEndorsePostWithHttpInfo(tranId).getData();
  }

  /**
   * For Endorser to endorse a particular transaction record
   * 
   * @param tranId Transaction identifier (required)
   * @return ApiResponse&lt;TransactionRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TransactionRecord> transactionsTranIdEndorsePostWithHttpInfo(String tranId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tranId' is set
    if (tranId == null) {
      throw new ApiException(400, "Missing the required parameter 'tranId' when calling transactionsTranIdEndorsePost");
    }
    
    // create path and map variables
    String localVarPath = "/transactions/{tran_id}/endorse"
      .replaceAll("\\{" + "tran_id" + "\\}", apiClient.escapeString(tranId.toString()));

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

    GenericType<TransactionRecord> localVarReturnType = new GenericType<TransactionRecord>() {};

    return apiClient.invokeAPI("EndorseTransactionApi.transactionsTranIdEndorsePost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Fetch a single transaction record
   * 
   * @param tranId Transaction identifier (required)
   * @return TransactionRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public TransactionRecord transactionsTranIdGet(String tranId) throws ApiException {
    return transactionsTranIdGetWithHttpInfo(tranId).getData();
  }

  /**
   * Fetch a single transaction record
   * 
   * @param tranId Transaction identifier (required)
   * @return ApiResponse&lt;TransactionRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TransactionRecord> transactionsTranIdGetWithHttpInfo(String tranId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tranId' is set
    if (tranId == null) {
      throw new ApiException(400, "Missing the required parameter 'tranId' when calling transactionsTranIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/transactions/{tran_id}"
      .replaceAll("\\{" + "tran_id" + "\\}", apiClient.escapeString(tranId.toString()));

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

    GenericType<TransactionRecord> localVarReturnType = new GenericType<TransactionRecord>() {};

    return apiClient.invokeAPI("EndorseTransactionApi.transactionsTranIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * For Endorser to refuse a particular transaction record
   * 
   * @param tranId Transaction identifier (required)
   * @return TransactionRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public TransactionRecord transactionsTranIdRefusePost(String tranId) throws ApiException {
    return transactionsTranIdRefusePostWithHttpInfo(tranId).getData();
  }

  /**
   * For Endorser to refuse a particular transaction record
   * 
   * @param tranId Transaction identifier (required)
   * @return ApiResponse&lt;TransactionRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TransactionRecord> transactionsTranIdRefusePostWithHttpInfo(String tranId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tranId' is set
    if (tranId == null) {
      throw new ApiException(400, "Missing the required parameter 'tranId' when calling transactionsTranIdRefusePost");
    }
    
    // create path and map variables
    String localVarPath = "/transactions/{tran_id}/refuse"
      .replaceAll("\\{" + "tran_id" + "\\}", apiClient.escapeString(tranId.toString()));

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

    GenericType<TransactionRecord> localVarReturnType = new GenericType<TransactionRecord>() {};

    return apiClient.invokeAPI("EndorseTransactionApi.transactionsTranIdRefusePost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * For Author / Endorser to write an endorsed transaction to the ledger
   * 
   * @param tranId Transaction identifier (required)
   * @return TransactionRecord
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public TransactionRecord transactionsTranIdWritePost(String tranId) throws ApiException {
    return transactionsTranIdWritePostWithHttpInfo(tranId).getData();
  }

  /**
   * For Author / Endorser to write an endorsed transaction to the ledger
   * 
   * @param tranId Transaction identifier (required)
   * @return ApiResponse&lt;TransactionRecord&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TransactionRecord> transactionsTranIdWritePostWithHttpInfo(String tranId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tranId' is set
    if (tranId == null) {
      throw new ApiException(400, "Missing the required parameter 'tranId' when calling transactionsTranIdWritePost");
    }
    
    // create path and map variables
    String localVarPath = "/transactions/{tran_id}/write"
      .replaceAll("\\{" + "tran_id" + "\\}", apiClient.escapeString(tranId.toString()));

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

    GenericType<TransactionRecord> localVarReturnType = new GenericType<TransactionRecord>() {};

    return apiClient.invokeAPI("EndorseTransactionApi.transactionsTranIdWritePost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}

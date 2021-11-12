package io.github.my_digi_id.acapy_client.api;

import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiResponse;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.Pair;

import javax.ws.rs.core.GenericType;

import io.github.my_digi_id.acapy_client.model.ActionMenuFetchResult;
import io.github.my_digi_id.acapy_client.model.PerformRequest;
import io.github.my_digi_id.acapy_client.model.SendMenu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-12T14:46:41.984298+01:00[Europe/Berlin]")
public class ActionMenuApi {
  private ApiClient apiClient;

  public ActionMenuApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ActionMenuApi(ApiClient apiClient) {
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
   * Close the active menu associated with a connection
   * 
   * @param connId Connection identifier (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public Object actionMenuConnIdClosePost(String connId) throws ApiException {
    return actionMenuConnIdClosePostWithHttpInfo(connId).getData();
  }

  /**
   * Close the active menu associated with a connection
   * 
   * @param connId Connection identifier (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> actionMenuConnIdClosePostWithHttpInfo(String connId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connId' is set
    if (connId == null) {
      throw new ApiException(400, "Missing the required parameter 'connId' when calling actionMenuConnIdClosePost");
    }
    
    // create path and map variables
    String localVarPath = "/action-menu/{conn_id}/close"
      .replaceAll("\\{" + "conn_id" + "\\}", apiClient.escapeString(connId.toString()));

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

    return apiClient.invokeAPI("ActionMenuApi.actionMenuConnIdClosePost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Fetch the active menu
   * 
   * @param connId Connection identifier (required)
   * @return ActionMenuFetchResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ActionMenuFetchResult actionMenuConnIdFetchPost(String connId) throws ApiException {
    return actionMenuConnIdFetchPostWithHttpInfo(connId).getData();
  }

  /**
   * Fetch the active menu
   * 
   * @param connId Connection identifier (required)
   * @return ApiResponse&lt;ActionMenuFetchResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ActionMenuFetchResult> actionMenuConnIdFetchPostWithHttpInfo(String connId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connId' is set
    if (connId == null) {
      throw new ApiException(400, "Missing the required parameter 'connId' when calling actionMenuConnIdFetchPost");
    }
    
    // create path and map variables
    String localVarPath = "/action-menu/{conn_id}/fetch"
      .replaceAll("\\{" + "conn_id" + "\\}", apiClient.escapeString(connId.toString()));

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

    GenericType<ActionMenuFetchResult> localVarReturnType = new GenericType<ActionMenuFetchResult>() {};

    return apiClient.invokeAPI("ActionMenuApi.actionMenuConnIdFetchPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Perform an action associated with the active menu
   * 
   * @param connId Connection identifier (required)
   * @param body  (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public Object actionMenuConnIdPerformPost(String connId, PerformRequest body) throws ApiException {
    return actionMenuConnIdPerformPostWithHttpInfo(connId, body).getData();
  }

  /**
   * Perform an action associated with the active menu
   * 
   * @param connId Connection identifier (required)
   * @param body  (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> actionMenuConnIdPerformPostWithHttpInfo(String connId, PerformRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'connId' is set
    if (connId == null) {
      throw new ApiException(400, "Missing the required parameter 'connId' when calling actionMenuConnIdPerformPost");
    }
    
    // create path and map variables
    String localVarPath = "/action-menu/{conn_id}/perform"
      .replaceAll("\\{" + "conn_id" + "\\}", apiClient.escapeString(connId.toString()));

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

    return apiClient.invokeAPI("ActionMenuApi.actionMenuConnIdPerformPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Request the active menu
   * 
   * @param connId Connection identifier (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public Object actionMenuConnIdRequestPost(String connId) throws ApiException {
    return actionMenuConnIdRequestPostWithHttpInfo(connId).getData();
  }

  /**
   * Request the active menu
   * 
   * @param connId Connection identifier (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> actionMenuConnIdRequestPostWithHttpInfo(String connId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connId' is set
    if (connId == null) {
      throw new ApiException(400, "Missing the required parameter 'connId' when calling actionMenuConnIdRequestPost");
    }
    
    // create path and map variables
    String localVarPath = "/action-menu/{conn_id}/request"
      .replaceAll("\\{" + "conn_id" + "\\}", apiClient.escapeString(connId.toString()));

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

    return apiClient.invokeAPI("ActionMenuApi.actionMenuConnIdRequestPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Send an action menu to a connection
   * 
   * @param connId Connection identifier (required)
   * @param body  (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public Object actionMenuConnIdSendMenuPost(String connId, SendMenu body) throws ApiException {
    return actionMenuConnIdSendMenuPostWithHttpInfo(connId, body).getData();
  }

  /**
   * Send an action menu to a connection
   * 
   * @param connId Connection identifier (required)
   * @param body  (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> actionMenuConnIdSendMenuPostWithHttpInfo(String connId, SendMenu body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'connId' is set
    if (connId == null) {
      throw new ApiException(400, "Missing the required parameter 'connId' when calling actionMenuConnIdSendMenuPost");
    }
    
    // create path and map variables
    String localVarPath = "/action-menu/{conn_id}/send-menu"
      .replaceAll("\\{" + "conn_id" + "\\}", apiClient.escapeString(connId.toString()));

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

    return apiClient.invokeAPI("ActionMenuApi.actionMenuConnIdSendMenuPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}

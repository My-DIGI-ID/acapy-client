package io.github.my_digi_id.acapy_client.api;

import io.github.my_digi_id.acapy_client.invoker.ApiException;
import io.github.my_digi_id.acapy_client.invoker.ApiClient;
import io.github.my_digi_id.acapy_client.invoker.ApiResponse;
import io.github.my_digi_id.acapy_client.invoker.Configuration;
import io.github.my_digi_id.acapy_client.invoker.Pair;

import javax.ws.rs.core.GenericType;

import io.github.my_digi_id.acapy_client.model.ResolutionResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-12T14:46:41.984298+01:00[Europe/Berlin]")
public class ResolverApi {
  private ApiClient apiClient;

  public ResolverApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ResolverApi(ApiClient apiClient) {
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
   * Retrieve doc for requested did
   * 
   * @param did DID (required)
   * @return ResolutionResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public ResolutionResult resolverResolveDidGet(String did) throws ApiException {
    return resolverResolveDidGetWithHttpInfo(did).getData();
  }

  /**
   * Retrieve doc for requested did
   * 
   * @param did DID (required)
   * @return ApiResponse&lt;ResolutionResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> null </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ResolutionResult> resolverResolveDidGetWithHttpInfo(String did) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'did' is set
    if (did == null) {
      throw new ApiException(400, "Missing the required parameter 'did' when calling resolverResolveDidGet");
    }
    
    // create path and map variables
    String localVarPath = "/resolver/resolve/{did}"
      .replaceAll("\\{" + "did" + "\\}", apiClient.escapeString(did.toString()));

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

    GenericType<ResolutionResult> localVarReturnType = new GenericType<ResolutionResult>() {};

    return apiClient.invokeAPI("ResolverApi.resolverResolveDidGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}

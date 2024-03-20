/*
 * Delphix DCT API
 * Delphix DCT API
 *
 * The version of the OpenAPI document: 3.3.0
 * Contact: support@delphix.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.delphix.dct.api;

import com.delphix.dct.ApiCallback;
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.ApiResponse;
import com.delphix.dct.Configuration;
import com.delphix.dct.Pair;
import com.delphix.dct.ProgressRequestBody;
import com.delphix.dct.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.delphix.dct.models.AccountLoginParameter;
import com.delphix.dct.models.ErrorResponse;
import com.delphix.dct.models.LoginToken;
import com.delphix.dct.models.TokenInfoRequest;
import com.delphix.dct.models.TokenInfoResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoginApi {
    private ApiClient localVarApiClient;

    public LoginApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LoginApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for accountLogin
     * @param accountLoginParameter  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Account Login Successful </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accountLoginCall(AccountLoginParameter accountLoginParameter, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = accountLoginParameter;

        // create path and map variables
        String localVarPath = "/login";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call accountLoginValidateBeforeCall(AccountLoginParameter accountLoginParameter, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'accountLoginParameter' is set
        if (accountLoginParameter == null) {
            throw new ApiException("Missing the required parameter 'accountLoginParameter' when calling accountLogin(Async)");
        }
        

        okhttp3.Call localVarCall = accountLoginCall(accountLoginParameter, _callback);
        return localVarCall;

    }

    /**
     * Login to Account with Username and Password 
     * 
     * @param accountLoginParameter  (required)
     * @return LoginToken
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Account Login Successful </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public LoginToken accountLogin(AccountLoginParameter accountLoginParameter) throws ApiException {
        ApiResponse<LoginToken> localVarResp = accountLoginWithHttpInfo(accountLoginParameter);
        return localVarResp.getData();
    }

    /**
     * Login to Account with Username and Password 
     * 
     * @param accountLoginParameter  (required)
     * @return ApiResponse&lt;LoginToken&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Account Login Successful </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<LoginToken> accountLoginWithHttpInfo(AccountLoginParameter accountLoginParameter) throws ApiException {
        okhttp3.Call localVarCall = accountLoginValidateBeforeCall(accountLoginParameter, null);
        Type localVarReturnType = new TypeToken<LoginToken>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Login to Account with Username and Password  (asynchronously)
     * 
     * @param accountLoginParameter  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Account Login Successful </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accountLoginAsync(AccountLoginParameter accountLoginParameter, final ApiCallback<LoginToken> _callback) throws ApiException {

        okhttp3.Call localVarCall = accountLoginValidateBeforeCall(accountLoginParameter, _callback);
        Type localVarReturnType = new TypeToken<LoginToken>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for accountLogout
     * @param authorization Access token (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Logged out </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accountLogoutCall(String authorization, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/logout";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (authorization != null) {
            localVarHeaderParams.put("Authorization", localVarApiClient.parameterToString(authorization));
        }

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call accountLogoutValidateBeforeCall(String authorization, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling accountLogout(Async)");
        }
        

        okhttp3.Call localVarCall = accountLogoutCall(authorization, _callback);
        return localVarCall;

    }

    /**
     * Invalidates username/password and SSO login session.
     * 
     * @param authorization Access token (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Logged out </td><td>  -  </td></tr>
     </table>
     */
    public void accountLogout(String authorization) throws ApiException {
        accountLogoutWithHttpInfo(authorization);
    }

    /**
     * Invalidates username/password and SSO login session.
     * 
     * @param authorization Access token (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Logged out </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> accountLogoutWithHttpInfo(String authorization) throws ApiException {
        okhttp3.Call localVarCall = accountLogoutValidateBeforeCall(authorization, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Invalidates username/password and SSO login session. (asynchronously)
     * 
     * @param authorization Access token (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Logged out </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accountLogoutAsync(String authorization, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = accountLogoutValidateBeforeCall(authorization, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for tokenInfo
     * @param tokenInfoRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tokenInfoCall(TokenInfoRequest tokenInfoRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = tokenInfoRequest;

        // create path and map variables
        String localVarPath = "/token-info";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call tokenInfoValidateBeforeCall(TokenInfoRequest tokenInfoRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = tokenInfoCall(tokenInfoRequest, _callback);
        return localVarCall;

    }

    /**
     * Get Token Information 
     * 
     * @param tokenInfoRequest  (optional)
     * @return TokenInfoResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public TokenInfoResponse tokenInfo(TokenInfoRequest tokenInfoRequest) throws ApiException {
        ApiResponse<TokenInfoResponse> localVarResp = tokenInfoWithHttpInfo(tokenInfoRequest);
        return localVarResp.getData();
    }

    /**
     * Get Token Information 
     * 
     * @param tokenInfoRequest  (optional)
     * @return ApiResponse&lt;TokenInfoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TokenInfoResponse> tokenInfoWithHttpInfo(TokenInfoRequest tokenInfoRequest) throws ApiException {
        okhttp3.Call localVarCall = tokenInfoValidateBeforeCall(tokenInfoRequest, null);
        Type localVarReturnType = new TypeToken<TokenInfoResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Token Information  (asynchronously)
     * 
     * @param tokenInfoRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tokenInfoAsync(TokenInfoRequest tokenInfoRequest, final ApiCallback<TokenInfoResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = tokenInfoValidateBeforeCall(tokenInfoRequest, _callback);
        Type localVarReturnType = new TypeToken<TokenInfoResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

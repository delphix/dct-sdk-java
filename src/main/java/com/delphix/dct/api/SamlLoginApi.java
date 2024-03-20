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


import com.delphix.dct.models.ErrorResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SamlLoginApi {
    private ApiClient localVarApiClient;

    public SamlLoginApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SamlLoginApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for checkSaml
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> SAML is enabled </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> SAML is not enabled </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call checkSamlCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/is-saml-enabled";

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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call checkSamlValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = checkSamlCall(_callback);
        return localVarCall;

    }

    /**
     * Check if SAML is enabled 
     * 
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> SAML is enabled </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> SAML is not enabled </td><td>  -  </td></tr>
     </table>
     */
    public void checkSaml() throws ApiException {
        checkSamlWithHttpInfo();
    }

    /**
     * Check if SAML is enabled 
     * 
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> SAML is enabled </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> SAML is not enabled </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> checkSamlWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = checkSamlValidateBeforeCall(null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Check if SAML is enabled  (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> SAML is enabled </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> SAML is not enabled </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call checkSamlAsync(final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = checkSamlValidateBeforeCall(_callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}

/*
 * Delphix DCT API
 * Delphix DCT API
 *
 * The version of the OpenAPI document: 3.10.0
 * Contact: support@delphix.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.delphix.dct.api;

import com.delphix.dct.ApiException;
import com.delphix.dct.models.ErrorResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SamlLoginApi
 */
@Disabled
public class SamlLoginApiTest {

    private final SamlLoginApi api = new SamlLoginApi();

    /**
     * Check if SAML is enabled 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void checkSamlTest() throws ApiException {
        api.checkSaml();
        // TODO: test validations
    }

}

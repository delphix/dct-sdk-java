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
import com.delphix.dct.models.APIClassificationConfig;
import com.delphix.dct.models.AutoTaggingConfig;
import com.delphix.dct.models.BundleUploadEvent;
import com.delphix.dct.models.DeleteEngineResponse;
import com.delphix.dct.models.DeleteTag;
import com.delphix.dct.models.EngineRegistrationParameter;
import com.delphix.dct.models.GlobalProperties;
import com.delphix.dct.models.HashicorpVault;
import com.delphix.dct.models.LDAPConfigParams;
import com.delphix.dct.models.LdapConfigValidateParameter;
import com.delphix.dct.models.LdapValidateResponse;
import com.delphix.dct.models.ListHashicorpVaultsResponse;
import com.delphix.dct.models.ListRegisteredEnginesResponse;
import com.delphix.dct.models.MetadataDbInfo;
import com.delphix.dct.models.ProductRegistrationOfflinePayload;
import com.delphix.dct.models.ProductRegistrationOnlinePayload;
import com.delphix.dct.models.ProxyConfiguration;
import com.delphix.dct.models.RegisteredEngine;
import com.delphix.dct.models.SAMLConfigParams;
import com.delphix.dct.models.SMTPConfigParams;
import com.delphix.dct.models.SMTPConfigValidate;
import com.delphix.dct.models.SearchBody;
import com.delphix.dct.models.SearchEnginesResponse;
import com.delphix.dct.models.SearchHashicorpVaultsResponse;
import com.delphix.dct.models.TagsRequest;
import com.delphix.dct.models.TagsResponse;
import com.delphix.dct.models.UpdateEngineAutoTaggingConfigResponse;
import com.delphix.dct.models.ValidateJavaParameters;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManagementApi
 */
@Disabled
public class ManagementApiTest {

    private final ManagementApi api = new ManagementApi();

    /**
     * Create tags for an Engine.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createEngineTagsTest() throws ApiException {
        String engineId = null;
        TagsRequest tagsRequest = null;
        TagsResponse response = api.createEngineTags(engineId, tagsRequest);
        // TODO: test validations
    }

    /**
     * Configure a new Hashicorp Vault
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createHashicorpVaultTest() throws ApiException {
        HashicorpVault hashicorpVault = null;
        HashicorpVault response = api.createHashicorpVault(hashicorpVault);
        // TODO: test validations
    }

    /**
     * Create tags for a Hashicorp vault.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createHashicorpVaultTagsTest() throws ApiException {
        Long vaultId = null;
        TagsRequest tagsRequest = null;
        TagsResponse response = api.createHashicorpVaultTags(vaultId, tagsRequest);
        // TODO: test validations
    }

    /**
     * Delete tags for an Engine.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteEngineTagsTest() throws ApiException {
        String engineId = null;
        DeleteTag deleteTag = null;
        api.deleteEngineTags(engineId, deleteTag);
        // TODO: test validations
    }

    /**
     * Delete a Hashicorp vault by id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteHashicorpVaultTest() throws ApiException {
        Long vaultId = null;
        api.deleteHashicorpVault(vaultId);
        // TODO: test validations
    }

    /**
     * Delete tags for a Hashicorp vault.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteHashicorpVaultTagTest() throws ApiException {
        Long vaultId = null;
        DeleteTag deleteTag = null;
        api.deleteHashicorpVaultTag(vaultId, deleteTag);
        // TODO: test validations
    }

    /**
     * Get api classification.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getApiClassificationTest() throws ApiException {
        APIClassificationConfig response = api.getApiClassification();
        // TODO: test validations
    }

    /**
     * Returns the engine&#39;s auto tagging configuration.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEngineAutoTaggingConfigTest() throws ApiException {
        String engineId = null;
        AutoTaggingConfig response = api.getEngineAutoTaggingConfig(engineId);
        // TODO: test validations
    }

    /**
     * Get tags for a Engine.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEngineTagsTest() throws ApiException {
        String engineId = null;
        TagsResponse response = api.getEngineTags(engineId);
        // TODO: test validations
    }

    /**
     * Get a Hashicorp vault by id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getHashicorpVaultTest() throws ApiException {
        Long vaultId = null;
        HashicorpVault response = api.getHashicorpVault(vaultId);
        // TODO: test validations
    }

    /**
     * Get tags for a Hashicorp vault.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getHashicorpVaultTagsTest() throws ApiException {
        Long vaultId = null;
        TagsResponse response = api.getHashicorpVaultTags(vaultId);
        // TODO: test validations
    }

    /**
     * Returns a list of configured Hashicorp vaults.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getHashicorpVaultsTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        ListHashicorpVaultsResponse response = api.getHashicorpVaults(limit, cursor, sort);
        // TODO: test validations
    }

    /**
     * Returns the LDAP configuration
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLdapConfigTest() throws ApiException {
        LDAPConfigParams response = api.getLdapConfig();
        // TODO: test validations
    }

    /**
     * Returns configuration information about the metadata database which stores the product data.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMetadataDatabaseTest() throws ApiException {
        MetadataDbInfo response = api.getMetadataDatabase();
        // TODO: test validations
    }

    /**
     * Returns previous bundle upload events
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPhonehomeEventsTest() throws ApiException {
        Integer limit = null;
        List<BundleUploadEvent> response = api.getPhonehomeEvents(limit);
        // TODO: test validations
    }

    /**
     * Returns True if Delphix services are reachable for product registration.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProductRegistrationDelphixConnectivityCheckTest() throws ApiException {
        Boolean response = api.getProductRegistrationDelphixConnectivityCheck();
        // TODO: test validations
    }

    /**
     * Generates and returns a public key that can be used to register the product.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProductRegistrationKeyTest() throws ApiException {
        String response = api.getProductRegistrationKey();
        // TODO: test validations
    }

    /**
     * Returns the product registration status.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProductRegistrationStatusTest() throws ApiException {
        Boolean response = api.getProductRegistrationStatus();
        // TODO: test validations
    }

    /**
     * Returns the current web proxy configuration to use to connect to Delphix services.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProxyConfigurationTest() throws ApiException {
        ProxyConfiguration response = api.getProxyConfiguration();
        // TODO: test validations
    }

    /**
     * Returns a registered engine by ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRegisteredEngineTest() throws ApiException {
        String engineId = null;
        RegisteredEngine response = api.getRegisteredEngine(engineId);
        // TODO: test validations
    }

    /**
     * Returns a list of registered engines.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRegisteredEnginesTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        ListRegisteredEnginesResponse response = api.getRegisteredEngines(limit, cursor, sort);
        // TODO: test validations
    }

    /**
     * Returns the SAML configuration
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSamlConfigTest() throws ApiException {
        SAMLConfigParams response = api.getSamlConfig();
        // TODO: test validations
    }

    /**
     * Returns the SMTP configuration
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSmtpConfigTest() throws ApiException {
        SMTPConfigParams response = api.getSmtpConfig();
        // TODO: test validations
    }

    /**
     * Get global properties.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listPropertiesTest() throws ApiException {
        GlobalProperties response = api.listProperties();
        // TODO: test validations
    }

    /**
     * Register an engine.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void registerEngineTest() throws ApiException {
        EngineRegistrationParameter engineRegistrationParameter = null;
        RegisteredEngine response = api.registerEngine(engineRegistrationParameter);
        // TODO: test validations
    }

    /**
     * Registers the product using a manually generated payload.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void registerProductOfflineTest() throws ApiException {
        ProductRegistrationOfflinePayload productRegistrationOfflinePayload = null;
        api.registerProductOffline(productRegistrationOfflinePayload);
        // TODO: test validations
    }

    /**
     * Registers the product using the provided credentials.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void registerProductOnlineTest() throws ApiException {
        ProductRegistrationOnlinePayload productRegistrationOnlinePayload = null;
        api.registerProductOnline(productRegistrationOnlinePayload);
        // TODO: test validations
    }

    /**
     * Search for engines.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchEnginesTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        SearchBody searchBody = null;
        SearchEnginesResponse response = api.searchEngines(limit, cursor, sort, searchBody);
        // TODO: test validations
    }

    /**
     * Search for configured Hashicorp vaults.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchHashicorpVaultsTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        SearchBody searchBody = null;
        SearchHashicorpVaultsResponse response = api.searchHashicorpVaults(limit, cursor, sort, searchBody);
        // TODO: test validations
    }

    /**
     * Unregister an engine.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unregisterEngineTest() throws ApiException {
        String engineId = null;
        DeleteEngineResponse response = api.unregisterEngine(engineId);
        // TODO: test validations
    }

    /**
     * Update the api classification to new version.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateApiClassificationTest() throws ApiException {
        APIClassificationConfig apIClassificationConfig = null;
        APIClassificationConfig response = api.updateApiClassification(apIClassificationConfig);
        // TODO: test validations
    }

    /**
     * Update the engine&#39;s auto tagging configuration.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateEngineAutoTaggingConfigTest() throws ApiException {
        String engineId = null;
        AutoTaggingConfig autoTaggingConfig = null;
        UpdateEngineAutoTaggingConfigResponse response = api.updateEngineAutoTaggingConfig(engineId, autoTaggingConfig);
        // TODO: test validations
    }

    /**
     * Update LDAP Config.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateLdapConfigTest() throws ApiException {
        LDAPConfigParams ldAPConfigParams = null;
        LDAPConfigParams response = api.updateLdapConfig(ldAPConfigParams);
        // TODO: test validations
    }

    /**
     * Update value of predefined properties.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updatePropertiesTest() throws ApiException {
        GlobalProperties globalProperties = null;
        GlobalProperties response = api.updateProperties(globalProperties);
        // TODO: test validations
    }

    /**
     * Update the web proxy configuration to use to connect to Delphix services.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateProxyConfigurationTest() throws ApiException {
        ProxyConfiguration proxyConfiguration = null;
        ProxyConfiguration response = api.updateProxyConfiguration(proxyConfiguration);
        // TODO: test validations
    }

    /**
     * Update a registered engine.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateRegisteredEngineTest() throws ApiException {
        String engineId = null;
        RegisteredEngine registeredEngine = null;
        RegisteredEngine response = api.updateRegisteredEngine(engineId, registeredEngine);
        // TODO: test validations
    }

    /**
     * Update a registered engine.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateRegisteredEnginePartialTest() throws ApiException {
        String engineId = null;
        RegisteredEngine registeredEngine = null;
        RegisteredEngine response = api.updateRegisteredEnginePartial(engineId, registeredEngine);
        // TODO: test validations
    }

    /**
     * Update SAML Config.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateSamlConfigTest() throws ApiException {
        SAMLConfigParams saMLConfigParams = null;
        SAMLConfigParams response = api.updateSamlConfig(saMLConfigParams);
        // TODO: test validations
    }

    /**
     * Update SMTP Config.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateSmtpConfigTest() throws ApiException {
        SMTPConfigParams smTPConfigParams = null;
        SMTPConfigParams response = api.updateSmtpConfig(smTPConfigParams);
        // TODO: test validations
    }

    /**
     * Validate java path for the remote host machine.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void validateJavaPathTest() throws ApiException {
        String engineId = null;
        ValidateJavaParameters validateJavaParameters = null;
        api.validateJavaPath(engineId, validateJavaParameters);
        // TODO: test validations
    }

    /**
     * Validate LDAP Config. Without username/password, DCT performs an anonymous bind against the LDAP server. If credentials are provided DCT validates that authentication and mapping of optional properties are actually working with provided credentials. LDAP search is only validated if search attributes are set.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void validateLdapConfigTest() throws ApiException {
        LdapConfigValidateParameter ldapConfigValidateParameter = null;
        LdapValidateResponse response = api.validateLdapConfig(ldapConfigValidateParameter);
        // TODO: test validations
    }

    /**
     * Validate SMTP Config.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void validateSmtpConfigTest() throws ApiException {
        SMTPConfigValidate smTPConfigValidate = null;
        api.validateSmtpConfig(smTPConfigValidate);
        // TODO: test validations
    }

}

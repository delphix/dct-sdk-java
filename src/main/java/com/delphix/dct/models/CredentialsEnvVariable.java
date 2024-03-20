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


package com.delphix.dct.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CredentialsEnvVariable
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-19T18:53:50.335381+05:30[Asia/Kolkata]")
public class CredentialsEnvVariable {
  public static final String SERIALIZED_NAME_BASE_VAR_NAME = "base_var_name";
  @SerializedName(SERIALIZED_NAME_BASE_VAR_NAME)
  private String baseVarName;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_VAULT = "vault";
  @SerializedName(SERIALIZED_NAME_VAULT)
  private String vault;

  public static final String SERIALIZED_NAME_HASHICORP_VAULT_ENGINE = "hashicorp_vault_engine";
  @SerializedName(SERIALIZED_NAME_HASHICORP_VAULT_ENGINE)
  private String hashicorpVaultEngine;

  public static final String SERIALIZED_NAME_HASHICORP_VAULT_SECRET_PATH = "hashicorp_vault_secret_path";
  @SerializedName(SERIALIZED_NAME_HASHICORP_VAULT_SECRET_PATH)
  private String hashicorpVaultSecretPath;

  public static final String SERIALIZED_NAME_HASHICORP_VAULT_USERNAME_KEY = "hashicorp_vault_username_key";
  @SerializedName(SERIALIZED_NAME_HASHICORP_VAULT_USERNAME_KEY)
  private String hashicorpVaultUsernameKey;

  public static final String SERIALIZED_NAME_HASHICORP_VAULT_SECRET_KEY = "hashicorp_vault_secret_key";
  @SerializedName(SERIALIZED_NAME_HASHICORP_VAULT_SECRET_KEY)
  private String hashicorpVaultSecretKey;

  public static final String SERIALIZED_NAME_AZURE_VAULT_NAME = "azure_vault_name";
  @SerializedName(SERIALIZED_NAME_AZURE_VAULT_NAME)
  private String azureVaultName;

  public static final String SERIALIZED_NAME_AZURE_VAULT_USERNAME_KEY = "azure_vault_username_key";
  @SerializedName(SERIALIZED_NAME_AZURE_VAULT_USERNAME_KEY)
  private String azureVaultUsernameKey;

  public static final String SERIALIZED_NAME_AZURE_VAULT_SECRET_KEY = "azure_vault_secret_key";
  @SerializedName(SERIALIZED_NAME_AZURE_VAULT_SECRET_KEY)
  private String azureVaultSecretKey;

  public static final String SERIALIZED_NAME_CYBERARK_VAULT_QUERY_STRING = "cyberark_vault_query_string";
  @SerializedName(SERIALIZED_NAME_CYBERARK_VAULT_QUERY_STRING)
  private String cyberarkVaultQueryString;


  public CredentialsEnvVariable baseVarName(String baseVarName) {
    
    this.baseVarName = baseVarName;
    return this;
  }

   /**
   * Base name of the environment variables. Variables are named by appending &#39;_USER&#39;, &#39;_PASSWORD&#39;, &#39;_PUBKEY&#39; and &#39;_PRIVKEY&#39; to this base name, respectively. Variables whose values are not entered or are not present in the type of credential or vault selected, will not be set.
   * @return baseVarName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Base name of the environment variables. Variables are named by appending '_USER', '_PASSWORD', '_PUBKEY' and '_PRIVKEY' to this base name, respectively. Variables whose values are not entered or are not present in the type of credential or vault selected, will not be set.")

  public String getBaseVarName() {
    return baseVarName;
  }


  public void setBaseVarName(String baseVarName) {
    this.baseVarName = baseVarName;
  }


  public CredentialsEnvVariable password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Password to assign to the environment variables.
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "password", value = "Password to assign to the environment variables.")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public CredentialsEnvVariable vault(String vault) {
    
    this.vault = vault;
    return this;
  }

   /**
   * The name or reference of the vault to assign to the environment variables.
   * @return vault
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "my-vault", value = "The name or reference of the vault to assign to the environment variables.")

  public String getVault() {
    return vault;
  }


  public void setVault(String vault) {
    this.vault = vault;
  }


  public CredentialsEnvVariable hashicorpVaultEngine(String hashicorpVaultEngine) {
    
    this.hashicorpVaultEngine = hashicorpVaultEngine;
    return this;
  }

   /**
   * Vault engine name where the credential is stored.
   * @return hashicorpVaultEngine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "kv", value = "Vault engine name where the credential is stored.")

  public String getHashicorpVaultEngine() {
    return hashicorpVaultEngine;
  }


  public void setHashicorpVaultEngine(String hashicorpVaultEngine) {
    this.hashicorpVaultEngine = hashicorpVaultEngine;
  }


  public CredentialsEnvVariable hashicorpVaultSecretPath(String hashicorpVaultSecretPath) {
    
    this.hashicorpVaultSecretPath = hashicorpVaultSecretPath;
    return this;
  }

   /**
   * Path in the vault engine where the credential is stored.
   * @return hashicorpVaultSecretPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "oracle-env", value = "Path in the vault engine where the credential is stored.")

  public String getHashicorpVaultSecretPath() {
    return hashicorpVaultSecretPath;
  }


  public void setHashicorpVaultSecretPath(String hashicorpVaultSecretPath) {
    this.hashicorpVaultSecretPath = hashicorpVaultSecretPath;
  }


  public CredentialsEnvVariable hashicorpVaultUsernameKey(String hashicorpVaultUsernameKey) {
    
    this.hashicorpVaultUsernameKey = hashicorpVaultUsernameKey;
    return this;
  }

   /**
   * Hashicorp vault key for the username in the key-value store.
   * @return hashicorpVaultUsernameKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "username", value = "Hashicorp vault key for the username in the key-value store.")

  public String getHashicorpVaultUsernameKey() {
    return hashicorpVaultUsernameKey;
  }


  public void setHashicorpVaultUsernameKey(String hashicorpVaultUsernameKey) {
    this.hashicorpVaultUsernameKey = hashicorpVaultUsernameKey;
  }


  public CredentialsEnvVariable hashicorpVaultSecretKey(String hashicorpVaultSecretKey) {
    
    this.hashicorpVaultSecretKey = hashicorpVaultSecretKey;
    return this;
  }

   /**
   * Hashicorp vault key for the password in the key-value store.
   * @return hashicorpVaultSecretKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "secret", value = "Hashicorp vault key for the password in the key-value store.")

  public String getHashicorpVaultSecretKey() {
    return hashicorpVaultSecretKey;
  }


  public void setHashicorpVaultSecretKey(String hashicorpVaultSecretKey) {
    this.hashicorpVaultSecretKey = hashicorpVaultSecretKey;
  }


  public CredentialsEnvVariable azureVaultName(String azureVaultName) {
    
    this.azureVaultName = azureVaultName;
    return this;
  }

   /**
   * Azure key vault name.
   * @return azureVaultName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "azure_vault", value = "Azure key vault name.")

  public String getAzureVaultName() {
    return azureVaultName;
  }


  public void setAzureVaultName(String azureVaultName) {
    this.azureVaultName = azureVaultName;
  }


  public CredentialsEnvVariable azureVaultUsernameKey(String azureVaultUsernameKey) {
    
    this.azureVaultUsernameKey = azureVaultUsernameKey;
    return this;
  }

   /**
   * Azure vault key in the key-value store.
   * @return azureVaultUsernameKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "username", value = "Azure vault key in the key-value store.")

  public String getAzureVaultUsernameKey() {
    return azureVaultUsernameKey;
  }


  public void setAzureVaultUsernameKey(String azureVaultUsernameKey) {
    this.azureVaultUsernameKey = azureVaultUsernameKey;
  }


  public CredentialsEnvVariable azureVaultSecretKey(String azureVaultSecretKey) {
    
    this.azureVaultSecretKey = azureVaultSecretKey;
    return this;
  }

   /**
   * Azure vault key in the key-value store.
   * @return azureVaultSecretKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "secret", value = "Azure vault key in the key-value store.")

  public String getAzureVaultSecretKey() {
    return azureVaultSecretKey;
  }


  public void setAzureVaultSecretKey(String azureVaultSecretKey) {
    this.azureVaultSecretKey = azureVaultSecretKey;
  }


  public CredentialsEnvVariable cyberarkVaultQueryString(String cyberarkVaultQueryString) {
    
    this.cyberarkVaultQueryString = cyberarkVaultQueryString;
    return this;
  }

   /**
   * Query to find a credential in the CyberArk vault.
   * @return cyberarkVaultQueryString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Safe=Test;Folder=Test;Object=Test", value = "Query to find a credential in the CyberArk vault.")

  public String getCyberarkVaultQueryString() {
    return cyberarkVaultQueryString;
  }


  public void setCyberarkVaultQueryString(String cyberarkVaultQueryString) {
    this.cyberarkVaultQueryString = cyberarkVaultQueryString;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialsEnvVariable credentialsEnvVariable = (CredentialsEnvVariable) o;
    return Objects.equals(this.baseVarName, credentialsEnvVariable.baseVarName) &&
        Objects.equals(this.password, credentialsEnvVariable.password) &&
        Objects.equals(this.vault, credentialsEnvVariable.vault) &&
        Objects.equals(this.hashicorpVaultEngine, credentialsEnvVariable.hashicorpVaultEngine) &&
        Objects.equals(this.hashicorpVaultSecretPath, credentialsEnvVariable.hashicorpVaultSecretPath) &&
        Objects.equals(this.hashicorpVaultUsernameKey, credentialsEnvVariable.hashicorpVaultUsernameKey) &&
        Objects.equals(this.hashicorpVaultSecretKey, credentialsEnvVariable.hashicorpVaultSecretKey) &&
        Objects.equals(this.azureVaultName, credentialsEnvVariable.azureVaultName) &&
        Objects.equals(this.azureVaultUsernameKey, credentialsEnvVariable.azureVaultUsernameKey) &&
        Objects.equals(this.azureVaultSecretKey, credentialsEnvVariable.azureVaultSecretKey) &&
        Objects.equals(this.cyberarkVaultQueryString, credentialsEnvVariable.cyberarkVaultQueryString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseVarName, password, vault, hashicorpVaultEngine, hashicorpVaultSecretPath, hashicorpVaultUsernameKey, hashicorpVaultSecretKey, azureVaultName, azureVaultUsernameKey, azureVaultSecretKey, cyberarkVaultQueryString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialsEnvVariable {\n");
    sb.append("    baseVarName: ").append(toIndentedString(baseVarName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    vault: ").append(toIndentedString(vault)).append("\n");
    sb.append("    hashicorpVaultEngine: ").append(toIndentedString(hashicorpVaultEngine)).append("\n");
    sb.append("    hashicorpVaultSecretPath: ").append(toIndentedString(hashicorpVaultSecretPath)).append("\n");
    sb.append("    hashicorpVaultUsernameKey: ").append(toIndentedString(hashicorpVaultUsernameKey)).append("\n");
    sb.append("    hashicorpVaultSecretKey: ").append(toIndentedString(hashicorpVaultSecretKey)).append("\n");
    sb.append("    azureVaultName: ").append(toIndentedString(azureVaultName)).append("\n");
    sb.append("    azureVaultUsernameKey: ").append(toIndentedString(azureVaultUsernameKey)).append("\n");
    sb.append("    azureVaultSecretKey: ").append(toIndentedString(azureVaultSecretKey)).append("\n");
    sb.append("    cyberarkVaultQueryString: ").append(toIndentedString(cyberarkVaultQueryString)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


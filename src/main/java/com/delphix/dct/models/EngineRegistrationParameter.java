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
import com.delphix.dct.models.Tag;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Parameters to register and authenticate an engine.
 */
@ApiModel(description = "Parameters to register and authenticate an engine.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-19T18:53:50.335381+05:30[Asia/Kolkata]")
public class EngineRegistrationParameter {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_MASKING_USERNAME = "masking_username";
  @SerializedName(SERIALIZED_NAME_MASKING_USERNAME)
  private String maskingUsername;

  public static final String SERIALIZED_NAME_MASKING_PASSWORD = "masking_password";
  @SerializedName(SERIALIZED_NAME_MASKING_PASSWORD)
  private String maskingPassword;

  public static final String SERIALIZED_NAME_HASHICORP_VAULT_USERNAME_COMMAND_ARGS = "hashicorp_vault_username_command_args";
  @SerializedName(SERIALIZED_NAME_HASHICORP_VAULT_USERNAME_COMMAND_ARGS)
  private List<String> hashicorpVaultUsernameCommandArgs = null;

  public static final String SERIALIZED_NAME_HASHICORP_VAULT_MASKING_USERNAME_COMMAND_ARGS = "hashicorp_vault_masking_username_command_args";
  @SerializedName(SERIALIZED_NAME_HASHICORP_VAULT_MASKING_USERNAME_COMMAND_ARGS)
  private List<String> hashicorpVaultMaskingUsernameCommandArgs = null;

  public static final String SERIALIZED_NAME_HASHICORP_VAULT_PASSWORD_COMMAND_ARGS = "hashicorp_vault_password_command_args";
  @SerializedName(SERIALIZED_NAME_HASHICORP_VAULT_PASSWORD_COMMAND_ARGS)
  private List<String> hashicorpVaultPasswordCommandArgs = null;

  public static final String SERIALIZED_NAME_HASHICORP_VAULT_MASKING_PASSWORD_COMMAND_ARGS = "hashicorp_vault_masking_password_command_args";
  @SerializedName(SERIALIZED_NAME_HASHICORP_VAULT_MASKING_PASSWORD_COMMAND_ARGS)
  private List<String> hashicorpVaultMaskingPasswordCommandArgs = null;

  public static final String SERIALIZED_NAME_HASHICORP_VAULT_ID = "hashicorp_vault_id";
  @SerializedName(SERIALIZED_NAME_HASHICORP_VAULT_ID)
  private Long hashicorpVaultId;

  public static final String SERIALIZED_NAME_MASKING_HASHICORP_VAULT_ID = "masking_hashicorp_vault_id";
  @SerializedName(SERIALIZED_NAME_MASKING_HASHICORP_VAULT_ID)
  private Long maskingHashicorpVaultId;

  public static final String SERIALIZED_NAME_INSECURE_SSL = "insecure_ssl";
  @SerializedName(SERIALIZED_NAME_INSECURE_SSL)
  private Boolean insecureSsl = false;

  public static final String SERIALIZED_NAME_UNSAFE_SSL_HOSTNAME_CHECK = "unsafe_ssl_hostname_check";
  @SerializedName(SERIALIZED_NAME_UNSAFE_SSL_HOSTNAME_CHECK)
  private Boolean unsafeSslHostnameCheck = false;

  public static final String SERIALIZED_NAME_TRUSTSTORE_FILENAME = "truststore_filename";
  @SerializedName(SERIALIZED_NAME_TRUSTSTORE_FILENAME)
  private String truststoreFilename;

  public static final String SERIALIZED_NAME_TRUSTSTORE_PASSWORD = "truststore_password";
  @SerializedName(SERIALIZED_NAME_TRUSTSTORE_PASSWORD)
  private String truststorePassword;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<Tag> tags = null;


  public EngineRegistrationParameter name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public EngineRegistrationParameter hostname(String hostname) {
    
    this.hostname = hostname;
    return this;
  }

   /**
   * Get hostname
   * @return hostname
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getHostname() {
    return hostname;
  }


  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public EngineRegistrationParameter username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * The virtualization domain admin username.
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The virtualization domain admin username.")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public EngineRegistrationParameter password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * The virtualization domain admin password.
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The virtualization domain admin password.")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public EngineRegistrationParameter maskingUsername(String maskingUsername) {
    
    this.maskingUsername = maskingUsername;
    return this;
  }

   /**
   * The masking admin username.
   * @return maskingUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The masking admin username.")

  public String getMaskingUsername() {
    return maskingUsername;
  }


  public void setMaskingUsername(String maskingUsername) {
    this.maskingUsername = maskingUsername;
  }


  public EngineRegistrationParameter maskingPassword(String maskingPassword) {
    
    this.maskingPassword = maskingPassword;
    return this;
  }

   /**
   * The masking admin password.
   * @return maskingPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The masking admin password.")

  public String getMaskingPassword() {
    return maskingPassword;
  }


  public void setMaskingPassword(String maskingPassword) {
    this.maskingPassword = maskingPassword;
  }


  public EngineRegistrationParameter hashicorpVaultUsernameCommandArgs(List<String> hashicorpVaultUsernameCommandArgs) {
    
    this.hashicorpVaultUsernameCommandArgs = hashicorpVaultUsernameCommandArgs;
    return this;
  }

  public EngineRegistrationParameter addHashicorpVaultUsernameCommandArgsItem(String hashicorpVaultUsernameCommandArgsItem) {
    if (this.hashicorpVaultUsernameCommandArgs == null) {
      this.hashicorpVaultUsernameCommandArgs = new ArrayList<String>();
    }
    this.hashicorpVaultUsernameCommandArgs.add(hashicorpVaultUsernameCommandArgsItem);
    return this;
  }

   /**
   * Arguments to pass to the Vault CLI tool to retrieve the virtualzation username for the engine.
   * @return hashicorpVaultUsernameCommandArgs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"kv\",\"get\",\"-field=username\",\"kv-v2/delphix-secrets/delphixUser\"]", value = "Arguments to pass to the Vault CLI tool to retrieve the virtualzation username for the engine.")

  public List<String> getHashicorpVaultUsernameCommandArgs() {
    return hashicorpVaultUsernameCommandArgs;
  }


  public void setHashicorpVaultUsernameCommandArgs(List<String> hashicorpVaultUsernameCommandArgs) {
    this.hashicorpVaultUsernameCommandArgs = hashicorpVaultUsernameCommandArgs;
  }


  public EngineRegistrationParameter hashicorpVaultMaskingUsernameCommandArgs(List<String> hashicorpVaultMaskingUsernameCommandArgs) {
    
    this.hashicorpVaultMaskingUsernameCommandArgs = hashicorpVaultMaskingUsernameCommandArgs;
    return this;
  }

  public EngineRegistrationParameter addHashicorpVaultMaskingUsernameCommandArgsItem(String hashicorpVaultMaskingUsernameCommandArgsItem) {
    if (this.hashicorpVaultMaskingUsernameCommandArgs == null) {
      this.hashicorpVaultMaskingUsernameCommandArgs = new ArrayList<String>();
    }
    this.hashicorpVaultMaskingUsernameCommandArgs.add(hashicorpVaultMaskingUsernameCommandArgsItem);
    return this;
  }

   /**
   * Arguments to pass to the Vault CLI tool to retrieve the masking username for the engine.
   * @return hashicorpVaultMaskingUsernameCommandArgs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[[\"kv\",\"get\",\"-field=username\",\"kv-v2/delphix-secrets/delphixUser\"]]", value = "Arguments to pass to the Vault CLI tool to retrieve the masking username for the engine.")

  public List<String> getHashicorpVaultMaskingUsernameCommandArgs() {
    return hashicorpVaultMaskingUsernameCommandArgs;
  }


  public void setHashicorpVaultMaskingUsernameCommandArgs(List<String> hashicorpVaultMaskingUsernameCommandArgs) {
    this.hashicorpVaultMaskingUsernameCommandArgs = hashicorpVaultMaskingUsernameCommandArgs;
  }


  public EngineRegistrationParameter hashicorpVaultPasswordCommandArgs(List<String> hashicorpVaultPasswordCommandArgs) {
    
    this.hashicorpVaultPasswordCommandArgs = hashicorpVaultPasswordCommandArgs;
    return this;
  }

  public EngineRegistrationParameter addHashicorpVaultPasswordCommandArgsItem(String hashicorpVaultPasswordCommandArgsItem) {
    if (this.hashicorpVaultPasswordCommandArgs == null) {
      this.hashicorpVaultPasswordCommandArgs = new ArrayList<String>();
    }
    this.hashicorpVaultPasswordCommandArgs.add(hashicorpVaultPasswordCommandArgsItem);
    return this;
  }

   /**
   * Arguments to pass to the Vault CLI tool to retrieve the virtualization password for the engine.
   * @return hashicorpVaultPasswordCommandArgs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"kv\",\"get\",\"-field=password\",\"kv-v2/delphix-secrets/delphixUser\"]", value = "Arguments to pass to the Vault CLI tool to retrieve the virtualization password for the engine.")

  public List<String> getHashicorpVaultPasswordCommandArgs() {
    return hashicorpVaultPasswordCommandArgs;
  }


  public void setHashicorpVaultPasswordCommandArgs(List<String> hashicorpVaultPasswordCommandArgs) {
    this.hashicorpVaultPasswordCommandArgs = hashicorpVaultPasswordCommandArgs;
  }


  public EngineRegistrationParameter hashicorpVaultMaskingPasswordCommandArgs(List<String> hashicorpVaultMaskingPasswordCommandArgs) {
    
    this.hashicorpVaultMaskingPasswordCommandArgs = hashicorpVaultMaskingPasswordCommandArgs;
    return this;
  }

  public EngineRegistrationParameter addHashicorpVaultMaskingPasswordCommandArgsItem(String hashicorpVaultMaskingPasswordCommandArgsItem) {
    if (this.hashicorpVaultMaskingPasswordCommandArgs == null) {
      this.hashicorpVaultMaskingPasswordCommandArgs = new ArrayList<String>();
    }
    this.hashicorpVaultMaskingPasswordCommandArgs.add(hashicorpVaultMaskingPasswordCommandArgsItem);
    return this;
  }

   /**
   * Arguments to pass to the Vault CLI tool to retrieve the masking password for the engine.
   * @return hashicorpVaultMaskingPasswordCommandArgs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[[\"kv\",\"get\",\"-field=password\",\"kv-v2/delphix-secrets/delphixUser\"]]", value = "Arguments to pass to the Vault CLI tool to retrieve the masking password for the engine.")

  public List<String> getHashicorpVaultMaskingPasswordCommandArgs() {
    return hashicorpVaultMaskingPasswordCommandArgs;
  }


  public void setHashicorpVaultMaskingPasswordCommandArgs(List<String> hashicorpVaultMaskingPasswordCommandArgs) {
    this.hashicorpVaultMaskingPasswordCommandArgs = hashicorpVaultMaskingPasswordCommandArgs;
  }


  public EngineRegistrationParameter hashicorpVaultId(Long hashicorpVaultId) {
    
    this.hashicorpVaultId = hashicorpVaultId;
    return this;
  }

   /**
   * Reference to the Hashicorp vault to use to retrieve virtualization engine credentials.
   * @return hashicorpVaultId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reference to the Hashicorp vault to use to retrieve virtualization engine credentials.")

  public Long getHashicorpVaultId() {
    return hashicorpVaultId;
  }


  public void setHashicorpVaultId(Long hashicorpVaultId) {
    this.hashicorpVaultId = hashicorpVaultId;
  }


  public EngineRegistrationParameter maskingHashicorpVaultId(Long maskingHashicorpVaultId) {
    
    this.maskingHashicorpVaultId = maskingHashicorpVaultId;
    return this;
  }

   /**
   * Reference to the Hashicorp vault to use to retrieve masking engine credentials.
   * @return maskingHashicorpVaultId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reference to the Hashicorp vault to use to retrieve masking engine credentials.")

  public Long getMaskingHashicorpVaultId() {
    return maskingHashicorpVaultId;
  }


  public void setMaskingHashicorpVaultId(Long maskingHashicorpVaultId) {
    this.maskingHashicorpVaultId = maskingHashicorpVaultId;
  }


  public EngineRegistrationParameter insecureSsl(Boolean insecureSsl) {
    
    this.insecureSsl = insecureSsl;
    return this;
  }

   /**
   * Allow connections to the engine over HTTPs without validating the TLS certificate. Even though the connection to the engine might be performed over HTTPs, setting this property eliminates the protection against a man-in-the-middle attach for connections to this engine. Instead, consider creating a truststore with a Certificate Authority to validate the engine&#39;s certificate, and set the truststore_path propery. 
   * @return insecureSsl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow connections to the engine over HTTPs without validating the TLS certificate. Even though the connection to the engine might be performed over HTTPs, setting this property eliminates the protection against a man-in-the-middle attach for connections to this engine. Instead, consider creating a truststore with a Certificate Authority to validate the engine's certificate, and set the truststore_path propery. ")

  public Boolean getInsecureSsl() {
    return insecureSsl;
  }


  public void setInsecureSsl(Boolean insecureSsl) {
    this.insecureSsl = insecureSsl;
  }


  public EngineRegistrationParameter unsafeSslHostnameCheck(Boolean unsafeSslHostnameCheck) {
    
    this.unsafeSslHostnameCheck = unsafeSslHostnameCheck;
    return this;
  }

   /**
   * Ignore validation of the name associated to the TLS certificate when connecting to the engine over HTTPs. Setting this value must only be done if the TLS certificate of the engine does not match the hostname, and the TLS configuration of the engine cannot be fixed. Setting this property reduces the protection against a man-in-the-middle attack for connections to this engine. This is ignored if insecure_ssl is set. 
   * @return unsafeSslHostnameCheck
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ignore validation of the name associated to the TLS certificate when connecting to the engine over HTTPs. Setting this value must only be done if the TLS certificate of the engine does not match the hostname, and the TLS configuration of the engine cannot be fixed. Setting this property reduces the protection against a man-in-the-middle attack for connections to this engine. This is ignored if insecure_ssl is set. ")

  public Boolean getUnsafeSslHostnameCheck() {
    return unsafeSslHostnameCheck;
  }


  public void setUnsafeSslHostnameCheck(Boolean unsafeSslHostnameCheck) {
    this.unsafeSslHostnameCheck = unsafeSslHostnameCheck;
  }


  public EngineRegistrationParameter truststoreFilename(String truststoreFilename) {
    
    this.truststoreFilename = truststoreFilename;
    return this;
  }

   /**
   * File name of a truststore which can be used to validate the TLS certificate of the engine. The truststore must be available at /etc/config/certs/&lt;truststore_filename&gt; 
   * @return truststoreFilename
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "File name of a truststore which can be used to validate the TLS certificate of the engine. The truststore must be available at /etc/config/certs/<truststore_filename> ")

  public String getTruststoreFilename() {
    return truststoreFilename;
  }


  public void setTruststoreFilename(String truststoreFilename) {
    this.truststoreFilename = truststoreFilename;
  }


  public EngineRegistrationParameter truststorePassword(String truststorePassword) {
    
    this.truststorePassword = truststorePassword;
    return this;
  }

   /**
   * Password to read the truststore. 
   * @return truststorePassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Password to read the truststore. ")

  public String getTruststorePassword() {
    return truststorePassword;
  }


  public void setTruststorePassword(String truststorePassword) {
    this.truststorePassword = truststorePassword;
  }


  public EngineRegistrationParameter tags(List<Tag> tags) {
    
    this.tags = tags;
    return this;
  }

  public EngineRegistrationParameter addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The tags to be created for this engine.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tags to be created for this engine.")

  public List<Tag> getTags() {
    return tags;
  }


  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EngineRegistrationParameter engineRegistrationParameter = (EngineRegistrationParameter) o;
    return Objects.equals(this.name, engineRegistrationParameter.name) &&
        Objects.equals(this.hostname, engineRegistrationParameter.hostname) &&
        Objects.equals(this.username, engineRegistrationParameter.username) &&
        Objects.equals(this.password, engineRegistrationParameter.password) &&
        Objects.equals(this.maskingUsername, engineRegistrationParameter.maskingUsername) &&
        Objects.equals(this.maskingPassword, engineRegistrationParameter.maskingPassword) &&
        Objects.equals(this.hashicorpVaultUsernameCommandArgs, engineRegistrationParameter.hashicorpVaultUsernameCommandArgs) &&
        Objects.equals(this.hashicorpVaultMaskingUsernameCommandArgs, engineRegistrationParameter.hashicorpVaultMaskingUsernameCommandArgs) &&
        Objects.equals(this.hashicorpVaultPasswordCommandArgs, engineRegistrationParameter.hashicorpVaultPasswordCommandArgs) &&
        Objects.equals(this.hashicorpVaultMaskingPasswordCommandArgs, engineRegistrationParameter.hashicorpVaultMaskingPasswordCommandArgs) &&
        Objects.equals(this.hashicorpVaultId, engineRegistrationParameter.hashicorpVaultId) &&
        Objects.equals(this.maskingHashicorpVaultId, engineRegistrationParameter.maskingHashicorpVaultId) &&
        Objects.equals(this.insecureSsl, engineRegistrationParameter.insecureSsl) &&
        Objects.equals(this.unsafeSslHostnameCheck, engineRegistrationParameter.unsafeSslHostnameCheck) &&
        Objects.equals(this.truststoreFilename, engineRegistrationParameter.truststoreFilename) &&
        Objects.equals(this.truststorePassword, engineRegistrationParameter.truststorePassword) &&
        Objects.equals(this.tags, engineRegistrationParameter.tags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && a.get().getClass().isArray() ? Arrays.equals((T[])a.get(), (T[])b.get()) : Objects.equals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, hostname, username, password, maskingUsername, maskingPassword, hashicorpVaultUsernameCommandArgs, hashicorpVaultMaskingUsernameCommandArgs, hashicorpVaultPasswordCommandArgs, hashicorpVaultMaskingPasswordCommandArgs, hashicorpVaultId, maskingHashicorpVaultId, insecureSsl, unsafeSslHostnameCheck, truststoreFilename, truststorePassword, tags);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent()
      ? (a.get().getClass().isArray() ? Arrays.hashCode((T[])a.get()) : Objects.hashCode(a.get()))
      : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EngineRegistrationParameter {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    maskingUsername: ").append(toIndentedString(maskingUsername)).append("\n");
    sb.append("    maskingPassword: ").append(toIndentedString(maskingPassword)).append("\n");
    sb.append("    hashicorpVaultUsernameCommandArgs: ").append(toIndentedString(hashicorpVaultUsernameCommandArgs)).append("\n");
    sb.append("    hashicorpVaultMaskingUsernameCommandArgs: ").append(toIndentedString(hashicorpVaultMaskingUsernameCommandArgs)).append("\n");
    sb.append("    hashicorpVaultPasswordCommandArgs: ").append(toIndentedString(hashicorpVaultPasswordCommandArgs)).append("\n");
    sb.append("    hashicorpVaultMaskingPasswordCommandArgs: ").append(toIndentedString(hashicorpVaultMaskingPasswordCommandArgs)).append("\n");
    sb.append("    hashicorpVaultId: ").append(toIndentedString(hashicorpVaultId)).append("\n");
    sb.append("    maskingHashicorpVaultId: ").append(toIndentedString(maskingHashicorpVaultId)).append("\n");
    sb.append("    insecureSsl: ").append(toIndentedString(insecureSsl)).append("\n");
    sb.append("    unsafeSslHostnameCheck: ").append(toIndentedString(unsafeSslHostnameCheck)).append("\n");
    sb.append("    truststoreFilename: ").append(toIndentedString(truststoreFilename)).append("\n");
    sb.append("    truststorePassword: ").append(toIndentedString(truststorePassword)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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


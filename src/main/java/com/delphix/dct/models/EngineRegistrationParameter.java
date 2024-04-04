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


package com.delphix.dct.models;

import java.util.Objects;
import com.delphix.dct.models.Tag;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.delphix.dct.JSON;

/**
 * Parameters to register and authenticate an engine.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
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
  private List<String> hashicorpVaultUsernameCommandArgs;

  public static final String SERIALIZED_NAME_HASHICORP_VAULT_MASKING_USERNAME_COMMAND_ARGS = "hashicorp_vault_masking_username_command_args";
  @SerializedName(SERIALIZED_NAME_HASHICORP_VAULT_MASKING_USERNAME_COMMAND_ARGS)
  private List<String> hashicorpVaultMaskingUsernameCommandArgs;

  public static final String SERIALIZED_NAME_HASHICORP_VAULT_PASSWORD_COMMAND_ARGS = "hashicorp_vault_password_command_args";
  @SerializedName(SERIALIZED_NAME_HASHICORP_VAULT_PASSWORD_COMMAND_ARGS)
  private List<String> hashicorpVaultPasswordCommandArgs;

  public static final String SERIALIZED_NAME_HASHICORP_VAULT_MASKING_PASSWORD_COMMAND_ARGS = "hashicorp_vault_masking_password_command_args";
  @SerializedName(SERIALIZED_NAME_HASHICORP_VAULT_MASKING_PASSWORD_COMMAND_ARGS)
  private List<String> hashicorpVaultMaskingPasswordCommandArgs;

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
  private List<Tag> tags;

  public EngineRegistrationParameter() {
  }

  public EngineRegistrationParameter name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
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
      this.hashicorpVaultUsernameCommandArgs = new ArrayList<>();
    }
    this.hashicorpVaultUsernameCommandArgs.add(hashicorpVaultUsernameCommandArgsItem);
    return this;
  }

   /**
   * Arguments to pass to the Vault CLI tool to retrieve the virtualzation username for the engine.
   * @return hashicorpVaultUsernameCommandArgs
  **/
  @javax.annotation.Nullable
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
      this.hashicorpVaultMaskingUsernameCommandArgs = new ArrayList<>();
    }
    this.hashicorpVaultMaskingUsernameCommandArgs.add(hashicorpVaultMaskingUsernameCommandArgsItem);
    return this;
  }

   /**
   * Arguments to pass to the Vault CLI tool to retrieve the masking username for the engine.
   * @return hashicorpVaultMaskingUsernameCommandArgs
  **/
  @javax.annotation.Nullable
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
      this.hashicorpVaultPasswordCommandArgs = new ArrayList<>();
    }
    this.hashicorpVaultPasswordCommandArgs.add(hashicorpVaultPasswordCommandArgsItem);
    return this;
  }

   /**
   * Arguments to pass to the Vault CLI tool to retrieve the virtualization password for the engine.
   * @return hashicorpVaultPasswordCommandArgs
  **/
  @javax.annotation.Nullable
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
      this.hashicorpVaultMaskingPasswordCommandArgs = new ArrayList<>();
    }
    this.hashicorpVaultMaskingPasswordCommandArgs.add(hashicorpVaultMaskingPasswordCommandArgsItem);
    return this;
  }

   /**
   * Arguments to pass to the Vault CLI tool to retrieve the masking password for the engine.
   * @return hashicorpVaultMaskingPasswordCommandArgs
  **/
  @javax.annotation.Nullable
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
   * Allow connections to the engine over HTTPs without validating the TLS certificate. Even though the connection to the engine might be performed over HTTPs, setting this property eliminates the protection against a man-in-the-middle attach for connections to this engine. Instead, consider creating a truststore with a Certificate Authority to validate the engine&#39;s certificate, and set the truststore_filename property. 
   * @return insecureSsl
  **/
  @javax.annotation.Nullable
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
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The tags to be created for this engine.
   * @return tags
  **/
  @javax.annotation.Nullable
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
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, hostname, username, password, maskingUsername, maskingPassword, hashicorpVaultUsernameCommandArgs, hashicorpVaultMaskingUsernameCommandArgs, hashicorpVaultPasswordCommandArgs, hashicorpVaultMaskingPasswordCommandArgs, hashicorpVaultId, maskingHashicorpVaultId, insecureSsl, unsafeSslHostnameCheck, truststoreFilename, truststorePassword, tags);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("name");
    openapiFields.add("hostname");
    openapiFields.add("username");
    openapiFields.add("password");
    openapiFields.add("masking_username");
    openapiFields.add("masking_password");
    openapiFields.add("hashicorp_vault_username_command_args");
    openapiFields.add("hashicorp_vault_masking_username_command_args");
    openapiFields.add("hashicorp_vault_password_command_args");
    openapiFields.add("hashicorp_vault_masking_password_command_args");
    openapiFields.add("hashicorp_vault_id");
    openapiFields.add("masking_hashicorp_vault_id");
    openapiFields.add("insecure_ssl");
    openapiFields.add("unsafe_ssl_hostname_check");
    openapiFields.add("truststore_filename");
    openapiFields.add("truststore_password");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("hostname");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EngineRegistrationParameter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EngineRegistrationParameter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EngineRegistrationParameter is not found in the empty JSON string", EngineRegistrationParameter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EngineRegistrationParameter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EngineRegistrationParameter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EngineRegistrationParameter.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("hostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostname").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("masking_username") != null && !jsonObj.get("masking_username").isJsonNull()) && !jsonObj.get("masking_username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `masking_username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("masking_username").toString()));
      }
      if ((jsonObj.get("masking_password") != null && !jsonObj.get("masking_password").isJsonNull()) && !jsonObj.get("masking_password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `masking_password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("masking_password").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("hashicorp_vault_username_command_args") != null && !jsonObj.get("hashicorp_vault_username_command_args").isJsonNull() && !jsonObj.get("hashicorp_vault_username_command_args").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `hashicorp_vault_username_command_args` to be an array in the JSON string but got `%s`", jsonObj.get("hashicorp_vault_username_command_args").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("hashicorp_vault_masking_username_command_args") != null && !jsonObj.get("hashicorp_vault_masking_username_command_args").isJsonNull() && !jsonObj.get("hashicorp_vault_masking_username_command_args").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `hashicorp_vault_masking_username_command_args` to be an array in the JSON string but got `%s`", jsonObj.get("hashicorp_vault_masking_username_command_args").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("hashicorp_vault_password_command_args") != null && !jsonObj.get("hashicorp_vault_password_command_args").isJsonNull() && !jsonObj.get("hashicorp_vault_password_command_args").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `hashicorp_vault_password_command_args` to be an array in the JSON string but got `%s`", jsonObj.get("hashicorp_vault_password_command_args").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("hashicorp_vault_masking_password_command_args") != null && !jsonObj.get("hashicorp_vault_masking_password_command_args").isJsonNull() && !jsonObj.get("hashicorp_vault_masking_password_command_args").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `hashicorp_vault_masking_password_command_args` to be an array in the JSON string but got `%s`", jsonObj.get("hashicorp_vault_masking_password_command_args").toString()));
      }
      if ((jsonObj.get("truststore_filename") != null && !jsonObj.get("truststore_filename").isJsonNull()) && !jsonObj.get("truststore_filename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `truststore_filename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("truststore_filename").toString()));
      }
      if ((jsonObj.get("truststore_password") != null && !jsonObj.get("truststore_password").isJsonNull()) && !jsonObj.get("truststore_password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `truststore_password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("truststore_password").toString()));
      }
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
        if (jsonArraytags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
          }

          // validate the optional field `tags` (array)
          for (int i = 0; i < jsonArraytags.size(); i++) {
            Tag.validateJsonElement(jsonArraytags.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EngineRegistrationParameter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EngineRegistrationParameter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EngineRegistrationParameter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EngineRegistrationParameter.class));

       return (TypeAdapter<T>) new TypeAdapter<EngineRegistrationParameter>() {
           @Override
           public void write(JsonWriter out, EngineRegistrationParameter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EngineRegistrationParameter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EngineRegistrationParameter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EngineRegistrationParameter
  * @throws IOException if the JSON string is invalid with respect to EngineRegistrationParameter
  */
  public static EngineRegistrationParameter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EngineRegistrationParameter.class);
  }

 /**
  * Convert an instance of EngineRegistrationParameter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


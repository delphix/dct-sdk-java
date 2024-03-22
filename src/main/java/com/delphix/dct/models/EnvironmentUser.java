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
 * EnvironmentUser
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-19T18:53:50.335381+05:30[Asia/Kolkata]")
public class EnvironmentUser {
  public static final String SERIALIZED_NAME_USER_REF = "user_ref";
  @SerializedName(SERIALIZED_NAME_USER_REF)
  private String userRef;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_PRIMARY_USER = "primary_user";
  @SerializedName(SERIALIZED_NAME_PRIMARY_USER)
  private Boolean primaryUser;

  /**
   * Authentication type of this user. PasswordCredential indicates username and password are used, SystemKeyCredential indicates public key based security credential, KeyPairCredential indicates public key based security credential consisting of a user specified key pair, KerberosCredential indicates Kerberos authentication, CyberArkVaultCredential indicates CyberArk Vault is used and HashiCorpVaultCredential indicates that Hashicorp vault is used for authentication
   */
  @JsonAdapter(AuthTypeEnum.Adapter.class)
  public enum AuthTypeEnum {
    PASSWORDCREDENTIAL("PasswordCredential"),
    
    SYSTEMKEYCREDENTIAL("SystemKeyCredential"),
    
    KEYPAIRCREDENTIAL("KeyPairCredential"),
    
    KERBEROSCREDENTIAL("KerberosCredential"),
    
    CYBERARKVAULTCREDENTIAL("CyberArkVaultCredential"),
    
    HASHICORPVAULTCREDENTIAL("HashiCorpVaultCredential");

    private String value;

    AuthTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthTypeEnum fromValue(String value) {
      for (AuthTypeEnum b : AuthTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AuthTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AuthTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AUTH_TYPE = "auth_type";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  private AuthTypeEnum authType;


  public EnvironmentUser userRef(String userRef) {
    
    this.userRef = userRef;
    return this;
  }

   /**
   * Environment user reference
   * @return userRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user-ref-1", value = "Environment user reference")

  public String getUserRef() {
    return userRef;
  }


  public void setUserRef(String userRef) {
    this.userRef = userRef;
  }


  public EnvironmentUser username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Username of environment user
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "username-1", value = "Username of environment user")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public EnvironmentUser primaryUser(Boolean primaryUser) {
    
    this.primaryUser = primaryUser;
    return this;
  }

   /**
   * This indicates if this user is primary or not
   * @return primaryUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "This indicates if this user is primary or not")

  public Boolean getPrimaryUser() {
    return primaryUser;
  }


  public void setPrimaryUser(Boolean primaryUser) {
    this.primaryUser = primaryUser;
  }


  public EnvironmentUser authType(AuthTypeEnum authType) {
    
    this.authType = authType;
    return this;
  }

   /**
   * Authentication type of this user. PasswordCredential indicates username and password are used, SystemKeyCredential indicates public key based security credential, KeyPairCredential indicates public key based security credential consisting of a user specified key pair, KerberosCredential indicates Kerberos authentication, CyberArkVaultCredential indicates CyberArk Vault is used and HashiCorpVaultCredential indicates that Hashicorp vault is used for authentication
   * @return authType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Authentication type of this user. PasswordCredential indicates username and password are used, SystemKeyCredential indicates public key based security credential, KeyPairCredential indicates public key based security credential consisting of a user specified key pair, KerberosCredential indicates Kerberos authentication, CyberArkVaultCredential indicates CyberArk Vault is used and HashiCorpVaultCredential indicates that Hashicorp vault is used for authentication")

  public AuthTypeEnum getAuthType() {
    return authType;
  }


  public void setAuthType(AuthTypeEnum authType) {
    this.authType = authType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentUser environmentUser = (EnvironmentUser) o;
    return Objects.equals(this.userRef, environmentUser.userRef) &&
        Objects.equals(this.username, environmentUser.username) &&
        Objects.equals(this.primaryUser, environmentUser.primaryUser) &&
        Objects.equals(this.authType, environmentUser.authType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userRef, username, primaryUser, authType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentUser {\n");
    sb.append("    userRef: ").append(toIndentedString(userRef)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    primaryUser: ").append(toIndentedString(primaryUser)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
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


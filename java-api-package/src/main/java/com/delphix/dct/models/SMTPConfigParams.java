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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
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
 * Parameters to read or update SMTP Config
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:02:33.321319+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class SMTPConfigParams {
  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled = false;

  public static final String SERIALIZED_NAME_SERVER = "server";
  @SerializedName(SERIALIZED_NAME_SERVER)
  private String server;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_AUTHENTICATION_ENABLED = "authentication_enabled";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_ENABLED)
  private Boolean authenticationEnabled = false;

  public static final String SERIALIZED_NAME_TLS_ENABLED = "tls_enabled";
  @SerializedName(SERIALIZED_NAME_TLS_ENABLED)
  private Boolean tlsEnabled = false;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_FROM_ADDRESS = "from_address";
  @SerializedName(SERIALIZED_NAME_FROM_ADDRESS)
  private String fromAddress;

  public static final String SERIALIZED_NAME_SEND_TIMEOUT = "send_timeout";
  @SerializedName(SERIALIZED_NAME_SEND_TIMEOUT)
  private Integer sendTimeout;

  public SMTPConfigParams() {
  }

  public SMTPConfigParams enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * True if outbound email is enabled.
   * @return enabled
  **/
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public SMTPConfigParams server(String server) {
    this.server = server;
    return this;
  }

   /**
   * IP address or hostname of SMTP relay server.
   * @return server
  **/
  @javax.annotation.Nullable
  public String getServer() {
    return server;
  }

  public void setServer(String server) {
    this.server = server;
  }


  public SMTPConfigParams port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Port number to use. A value of -1 indicates the default (25 or 587 for TLS).
   * minimum: 1
   * maximum: 65535
   * @return port
  **/
  @javax.annotation.Nullable
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }


  public SMTPConfigParams authenticationEnabled(Boolean authenticationEnabled) {
    this.authenticationEnabled = authenticationEnabled;
    return this;
  }

   /**
   * True if username/password authentication should be used.
   * @return authenticationEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getAuthenticationEnabled() {
    return authenticationEnabled;
  }

  public void setAuthenticationEnabled(Boolean authenticationEnabled) {
    this.authenticationEnabled = authenticationEnabled;
  }


  public SMTPConfigParams tlsEnabled(Boolean tlsEnabled) {
    this.tlsEnabled = tlsEnabled;
    return this;
  }

   /**
   * True if TLS (transport layer security) should be used.
   * @return tlsEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getTlsEnabled() {
    return tlsEnabled;
  }

  public void setTlsEnabled(Boolean tlsEnabled) {
    this.tlsEnabled = tlsEnabled;
  }


  public SMTPConfigParams username(String username) {
    this.username = username;
    return this;
  }

   /**
   * If authentication is enabled, username to use when authenticating to the server.
   * @return username
  **/
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public SMTPConfigParams password(String password) {
    this.password = password;
    return this;
  }

   /**
   * If authentication is enabled, password to use when authenticating to the server.
   * @return password
  **/
  @javax.annotation.Nullable
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public SMTPConfigParams fromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }

   /**
   * From address to use when sending mail. If unspecified, &#39;noreply@delphix.com&#39; is used.
   * @return fromAddress
  **/
  @javax.annotation.Nullable
  public String getFromAddress() {
    return fromAddress;
  }

  public void setFromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
  }


  public SMTPConfigParams sendTimeout(Integer sendTimeout) {
    this.sendTimeout = sendTimeout;
    return this;
  }

   /**
   * Maximum timeout to wait, in seconds, when sending mail.
   * minimum: 0
   * maximum: 300
   * @return sendTimeout
  **/
  @javax.annotation.Nullable
  public Integer getSendTimeout() {
    return sendTimeout;
  }

  public void setSendTimeout(Integer sendTimeout) {
    this.sendTimeout = sendTimeout;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SMTPConfigParams smTPConfigParams = (SMTPConfigParams) o;
    return Objects.equals(this.enabled, smTPConfigParams.enabled) &&
        Objects.equals(this.server, smTPConfigParams.server) &&
        Objects.equals(this.port, smTPConfigParams.port) &&
        Objects.equals(this.authenticationEnabled, smTPConfigParams.authenticationEnabled) &&
        Objects.equals(this.tlsEnabled, smTPConfigParams.tlsEnabled) &&
        Objects.equals(this.username, smTPConfigParams.username) &&
        Objects.equals(this.password, smTPConfigParams.password) &&
        Objects.equals(this.fromAddress, smTPConfigParams.fromAddress) &&
        Objects.equals(this.sendTimeout, smTPConfigParams.sendTimeout);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, server, port, authenticationEnabled, tlsEnabled, username, password, fromAddress, sendTimeout);
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
    sb.append("class SMTPConfigParams {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    authenticationEnabled: ").append(toIndentedString(authenticationEnabled)).append("\n");
    sb.append("    tlsEnabled: ").append(toIndentedString(tlsEnabled)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    sendTimeout: ").append(toIndentedString(sendTimeout)).append("\n");
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
    openapiFields.add("enabled");
    openapiFields.add("server");
    openapiFields.add("port");
    openapiFields.add("authentication_enabled");
    openapiFields.add("tls_enabled");
    openapiFields.add("username");
    openapiFields.add("password");
    openapiFields.add("from_address");
    openapiFields.add("send_timeout");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SMTPConfigParams
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SMTPConfigParams.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SMTPConfigParams is not found in the empty JSON string", SMTPConfigParams.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SMTPConfigParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SMTPConfigParams` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("server") != null && !jsonObj.get("server").isJsonNull()) && !jsonObj.get("server").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `server` to be a primitive type in the JSON string but got `%s`", jsonObj.get("server").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("from_address") != null && !jsonObj.get("from_address").isJsonNull()) && !jsonObj.get("from_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `from_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("from_address").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SMTPConfigParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SMTPConfigParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SMTPConfigParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SMTPConfigParams.class));

       return (TypeAdapter<T>) new TypeAdapter<SMTPConfigParams>() {
           @Override
           public void write(JsonWriter out, SMTPConfigParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SMTPConfigParams read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SMTPConfigParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SMTPConfigParams
  * @throws IOException if the JSON string is invalid with respect to SMTPConfigParams
  */
  public static SMTPConfigParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SMTPConfigParams.class);
  }

 /**
  * Convert an instance of SMTPConfigParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


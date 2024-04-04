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
 * ApiUsageData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:02:33.321319+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class ApiUsageData {
  public static final String SERIALIZED_NAME_API_ENDPOINT = "api_endpoint";
  @SerializedName(SERIALIZED_NAME_API_ENDPOINT)
  private String apiEndpoint;

  public static final String SERIALIZED_NAME_API_METHOD = "api_method";
  @SerializedName(SERIALIZED_NAME_API_METHOD)
  private String apiMethod;

  public static final String SERIALIZED_NAME_API_COUNT = "api_count";
  @SerializedName(SERIALIZED_NAME_API_COUNT)
  private Long apiCount;

  /**
   * Whether the API calls are of kind automation or governance
   */
  @JsonAdapter(KindEnum.Adapter.class)
  public enum KindEnum {
    AUTOMATION("automation"),
    
    GOVERNANCE("governance");

    private String value;

    KindEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KindEnum fromValue(String value) {
      for (KindEnum b : KindEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<KindEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KindEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KindEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return KindEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      KindEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private KindEnum kind;

  public static final String SERIALIZED_NAME_CLIENT_NAME = "client_name";
  @SerializedName(SERIALIZED_NAME_CLIENT_NAME)
  private String clientName;

  public static final String SERIALIZED_NAME_USER_AGENT = "user_agent";
  @SerializedName(SERIALIZED_NAME_USER_AGENT)
  private String userAgent;

  public static final String SERIALIZED_NAME_DCT_VERSION = "dct_version";
  @SerializedName(SERIALIZED_NAME_DCT_VERSION)
  private String dctVersion;

  public ApiUsageData() {
  }

  public ApiUsageData apiEndpoint(String apiEndpoint) {
    this.apiEndpoint = apiEndpoint;
    return this;
  }

   /**
   * API called.
   * @return apiEndpoint
  **/
  @javax.annotation.Nullable
  public String getApiEndpoint() {
    return apiEndpoint;
  }

  public void setApiEndpoint(String apiEndpoint) {
    this.apiEndpoint = apiEndpoint;
  }


  public ApiUsageData apiMethod(String apiMethod) {
    this.apiMethod = apiMethod;
    return this;
  }

   /**
   * HTTP method for API called.
   * @return apiMethod
  **/
  @javax.annotation.Nullable
  public String getApiMethod() {
    return apiMethod;
  }

  public void setApiMethod(String apiMethod) {
    this.apiMethod = apiMethod;
  }


  public ApiUsageData apiCount(Long apiCount) {
    this.apiCount = apiCount;
    return this;
  }

   /**
   * Count of API calls over the requested timeframe.
   * @return apiCount
  **/
  @javax.annotation.Nonnull
  public Long getApiCount() {
    return apiCount;
  }

  public void setApiCount(Long apiCount) {
    this.apiCount = apiCount;
  }


  public ApiUsageData kind(KindEnum kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Whether the API calls are of kind automation or governance
   * @return kind
  **/
  @javax.annotation.Nullable
  public KindEnum getKind() {
    return kind;
  }

  public void setKind(KindEnum kind) {
    this.kind = kind;
  }


  public ApiUsageData clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

   /**
   * Name of the api client that called the API endpoint
   * @return clientName
  **/
  @javax.annotation.Nullable
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }


  public ApiUsageData userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

   /**
   * Version of the api client that called the API endpoint
   * @return userAgent
  **/
  @javax.annotation.Nullable
  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }


  public ApiUsageData dctVersion(String dctVersion) {
    this.dctVersion = dctVersion;
    return this;
  }

   /**
   * DCT version at the time of api call
   * @return dctVersion
  **/
  @javax.annotation.Nullable
  public String getDctVersion() {
    return dctVersion;
  }

  public void setDctVersion(String dctVersion) {
    this.dctVersion = dctVersion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiUsageData apiUsageData = (ApiUsageData) o;
    return Objects.equals(this.apiEndpoint, apiUsageData.apiEndpoint) &&
        Objects.equals(this.apiMethod, apiUsageData.apiMethod) &&
        Objects.equals(this.apiCount, apiUsageData.apiCount) &&
        Objects.equals(this.kind, apiUsageData.kind) &&
        Objects.equals(this.clientName, apiUsageData.clientName) &&
        Objects.equals(this.userAgent, apiUsageData.userAgent) &&
        Objects.equals(this.dctVersion, apiUsageData.dctVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiEndpoint, apiMethod, apiCount, kind, clientName, userAgent, dctVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiUsageData {\n");
    sb.append("    apiEndpoint: ").append(toIndentedString(apiEndpoint)).append("\n");
    sb.append("    apiMethod: ").append(toIndentedString(apiMethod)).append("\n");
    sb.append("    apiCount: ").append(toIndentedString(apiCount)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    dctVersion: ").append(toIndentedString(dctVersion)).append("\n");
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
    openapiFields.add("api_endpoint");
    openapiFields.add("api_method");
    openapiFields.add("api_count");
    openapiFields.add("kind");
    openapiFields.add("client_name");
    openapiFields.add("user_agent");
    openapiFields.add("dct_version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("api_count");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ApiUsageData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiUsageData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiUsageData is not found in the empty JSON string", ApiUsageData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiUsageData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiUsageData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApiUsageData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("api_endpoint") != null && !jsonObj.get("api_endpoint").isJsonNull()) && !jsonObj.get("api_endpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `api_endpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("api_endpoint").toString()));
      }
      if ((jsonObj.get("api_method") != null && !jsonObj.get("api_method").isJsonNull()) && !jsonObj.get("api_method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `api_method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("api_method").toString()));
      }
      if ((jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) && !jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
      // validate the optional field `kind`
      if (jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) {
        KindEnum.validateJsonElement(jsonObj.get("kind"));
      }
      if ((jsonObj.get("client_name") != null && !jsonObj.get("client_name").isJsonNull()) && !jsonObj.get("client_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_name").toString()));
      }
      if ((jsonObj.get("user_agent") != null && !jsonObj.get("user_agent").isJsonNull()) && !jsonObj.get("user_agent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_agent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_agent").toString()));
      }
      if ((jsonObj.get("dct_version") != null && !jsonObj.get("dct_version").isJsonNull()) && !jsonObj.get("dct_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dct_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dct_version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiUsageData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiUsageData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiUsageData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiUsageData.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiUsageData>() {
           @Override
           public void write(JsonWriter out, ApiUsageData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiUsageData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiUsageData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiUsageData
  * @throws IOException if the JSON string is invalid with respect to ApiUsageData
  */
  public static ApiUsageData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiUsageData.class);
  }

 /**
  * Convert an instance of ApiUsageData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


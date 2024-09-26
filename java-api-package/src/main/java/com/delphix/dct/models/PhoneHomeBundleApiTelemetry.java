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
 * Telemetry data for an HTTP API call.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:02:33.321319+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class PhoneHomeBundleApiTelemetry {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_API_ENDPOINT = "api_endpoint";
  @SerializedName(SERIALIZED_NAME_API_ENDPOINT)
  private String apiEndpoint;

  /**
   * The HTTP method used to call the API endpoint.
   */
  @JsonAdapter(ApiMethodEnum.Adapter.class)
  public enum ApiMethodEnum {
    GET("GET"),
    
    POST("POST"),
    
    PUT("PUT"),
    
    PATCH("PATCH"),
    
    DELETE("DELETE");

    private String value;

    ApiMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ApiMethodEnum fromValue(String value) {
      for (ApiMethodEnum b : ApiMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ApiMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ApiMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ApiMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ApiMethodEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ApiMethodEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_API_METHOD = "api_method";
  @SerializedName(SERIALIZED_NAME_API_METHOD)
  private ApiMethodEnum apiMethod;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_RESPONSE_STATUS = "response_status";
  @SerializedName(SERIALIZED_NAME_RESPONSE_STATUS)
  private Integer responseStatus;

  public static final String SERIALIZED_NAME_USER_AGENT = "user_agent";
  @SerializedName(SERIALIZED_NAME_USER_AGENT)
  private String userAgent;

  public static final String SERIALIZED_NAME_CLIENT_NAME = "client_name";
  @SerializedName(SERIALIZED_NAME_CLIENT_NAME)
  private String clientName;

  public static final String SERIALIZED_NAME_IS_AUTOMATION = "is_automation";
  @SerializedName(SERIALIZED_NAME_IS_AUTOMATION)
  private Boolean isAutomation;

  public static final String SERIALIZED_NAME_DCT_VERSION = "dct_version";
  @SerializedName(SERIALIZED_NAME_DCT_VERSION)
  private String dctVersion;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId;

  public PhoneHomeBundleApiTelemetry() {
  }

  public PhoneHomeBundleApiTelemetry id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * A programmatically-generated and auto-incrementing ID number for the API call.
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public PhoneHomeBundleApiTelemetry apiEndpoint(String apiEndpoint) {
    this.apiEndpoint = apiEndpoint;
    return this;
  }

   /**
   * The template of the API endpoint path that was called.
   * @return apiEndpoint
  **/
  @javax.annotation.Nonnull
  public String getApiEndpoint() {
    return apiEndpoint;
  }

  public void setApiEndpoint(String apiEndpoint) {
    this.apiEndpoint = apiEndpoint;
  }


  public PhoneHomeBundleApiTelemetry apiMethod(ApiMethodEnum apiMethod) {
    this.apiMethod = apiMethod;
    return this;
  }

   /**
   * The HTTP method used to call the API endpoint.
   * @return apiMethod
  **/
  @javax.annotation.Nonnull
  public ApiMethodEnum getApiMethod() {
    return apiMethod;
  }

  public void setApiMethod(ApiMethodEnum apiMethod) {
    this.apiMethod = apiMethod;
  }


  public PhoneHomeBundleApiTelemetry startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * UTC time the API call was initiated (ISO 8601 format)
   * @return startTime
  **/
  @javax.annotation.Nonnull
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public PhoneHomeBundleApiTelemetry endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * UTC time the API call returned a response (ISO 8601 format)
   * @return endTime
  **/
  @javax.annotation.Nonnull
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public PhoneHomeBundleApiTelemetry responseStatus(Integer responseStatus) {
    this.responseStatus = responseStatus;
    return this;
  }

   /**
   * The HTTP status code of the response.
   * @return responseStatus
  **/
  @javax.annotation.Nonnull
  public Integer getResponseStatus() {
    return responseStatus;
  }

  public void setResponseStatus(Integer responseStatus) {
    this.responseStatus = responseStatus;
  }


  public PhoneHomeBundleApiTelemetry userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

   /**
   * The value of the \&quot;User-Agent\&quot; header in the request, if present.
   * @return userAgent
  **/
  @javax.annotation.Nonnull
  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }


  public PhoneHomeBundleApiTelemetry clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

   /**
   * The DCT client name (X-Dct-Client-Name HTTP header).
   * @return clientName
  **/
  @javax.annotation.Nonnull
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }


  public PhoneHomeBundleApiTelemetry isAutomation(Boolean isAutomation) {
    this.isAutomation = isAutomation;
    return this;
  }

   /**
   * True if the API is classified as an automation API.
   * @return isAutomation
  **/
  @javax.annotation.Nonnull
  public Boolean getIsAutomation() {
    return isAutomation;
  }

  public void setIsAutomation(Boolean isAutomation) {
    this.isAutomation = isAutomation;
  }


  public PhoneHomeBundleApiTelemetry dctVersion(String dctVersion) {
    this.dctVersion = dctVersion;
    return this;
  }

   /**
   * The version of this Data Control Tower instance at the time the API was called.
   * @return dctVersion
  **/
  @javax.annotation.Nonnull
  public String getDctVersion() {
    return dctVersion;
  }

  public void setDctVersion(String dctVersion) {
    this.dctVersion = dctVersion;
  }


  public PhoneHomeBundleApiTelemetry accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * A number to distinguish the user account that performed this API call.
   * @return accountId
  **/
  @javax.annotation.Nonnull
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneHomeBundleApiTelemetry phoneHomeBundleApiTelemetry = (PhoneHomeBundleApiTelemetry) o;
    return Objects.equals(this.id, phoneHomeBundleApiTelemetry.id) &&
        Objects.equals(this.apiEndpoint, phoneHomeBundleApiTelemetry.apiEndpoint) &&
        Objects.equals(this.apiMethod, phoneHomeBundleApiTelemetry.apiMethod) &&
        Objects.equals(this.startTime, phoneHomeBundleApiTelemetry.startTime) &&
        Objects.equals(this.endTime, phoneHomeBundleApiTelemetry.endTime) &&
        Objects.equals(this.responseStatus, phoneHomeBundleApiTelemetry.responseStatus) &&
        Objects.equals(this.userAgent, phoneHomeBundleApiTelemetry.userAgent) &&
        Objects.equals(this.clientName, phoneHomeBundleApiTelemetry.clientName) &&
        Objects.equals(this.isAutomation, phoneHomeBundleApiTelemetry.isAutomation) &&
        Objects.equals(this.dctVersion, phoneHomeBundleApiTelemetry.dctVersion) &&
        Objects.equals(this.accountId, phoneHomeBundleApiTelemetry.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, apiEndpoint, apiMethod, startTime, endTime, responseStatus, userAgent, clientName, isAutomation, dctVersion, accountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneHomeBundleApiTelemetry {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    apiEndpoint: ").append(toIndentedString(apiEndpoint)).append("\n");
    sb.append("    apiMethod: ").append(toIndentedString(apiMethod)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    responseStatus: ").append(toIndentedString(responseStatus)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    isAutomation: ").append(toIndentedString(isAutomation)).append("\n");
    sb.append("    dctVersion: ").append(toIndentedString(dctVersion)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("api_endpoint");
    openapiFields.add("api_method");
    openapiFields.add("start_time");
    openapiFields.add("end_time");
    openapiFields.add("response_status");
    openapiFields.add("user_agent");
    openapiFields.add("client_name");
    openapiFields.add("is_automation");
    openapiFields.add("dct_version");
    openapiFields.add("account_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("api_endpoint");
    openapiRequiredFields.add("api_method");
    openapiRequiredFields.add("start_time");
    openapiRequiredFields.add("end_time");
    openapiRequiredFields.add("response_status");
    openapiRequiredFields.add("user_agent");
    openapiRequiredFields.add("client_name");
    openapiRequiredFields.add("is_automation");
    openapiRequiredFields.add("dct_version");
    openapiRequiredFields.add("account_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PhoneHomeBundleApiTelemetry
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PhoneHomeBundleApiTelemetry.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PhoneHomeBundleApiTelemetry is not found in the empty JSON string", PhoneHomeBundleApiTelemetry.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PhoneHomeBundleApiTelemetry.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PhoneHomeBundleApiTelemetry` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PhoneHomeBundleApiTelemetry.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("api_endpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `api_endpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("api_endpoint").toString()));
      }
      if (!jsonObj.get("api_method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `api_method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("api_method").toString()));
      }
      // validate the required field `api_method`
      ApiMethodEnum.validateJsonElement(jsonObj.get("api_method"));
      if (!jsonObj.get("start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_time").toString()));
      }
      if (!jsonObj.get("end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_time").toString()));
      }
      if (!jsonObj.get("user_agent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_agent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_agent").toString()));
      }
      if (!jsonObj.get("client_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_name").toString()));
      }
      if (!jsonObj.get("dct_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dct_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dct_version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PhoneHomeBundleApiTelemetry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PhoneHomeBundleApiTelemetry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PhoneHomeBundleApiTelemetry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PhoneHomeBundleApiTelemetry.class));

       return (TypeAdapter<T>) new TypeAdapter<PhoneHomeBundleApiTelemetry>() {
           @Override
           public void write(JsonWriter out, PhoneHomeBundleApiTelemetry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PhoneHomeBundleApiTelemetry read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PhoneHomeBundleApiTelemetry given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PhoneHomeBundleApiTelemetry
  * @throws IOException if the JSON string is invalid with respect to PhoneHomeBundleApiTelemetry
  */
  public static PhoneHomeBundleApiTelemetry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PhoneHomeBundleApiTelemetry.class);
  }

 /**
  * Convert an instance of PhoneHomeBundleApiTelemetry to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


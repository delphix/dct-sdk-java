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
 * The summary of actions performed by an account.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class AuditLogsSummary {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId;

  public static final String SERIALIZED_NAME_ACCOUNT_FIRST_NAME = "account_first_name";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_FIRST_NAME)
  private String accountFirstName;

  public static final String SERIALIZED_NAME_ACCOUNT_LAST_NAME = "account_last_name";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_LAST_NAME)
  private String accountLastName;

  public static final String SERIALIZED_NAME_VDB_REFRESHES = "vdb_refreshes";
  @SerializedName(SERIALIZED_NAME_VDB_REFRESHES)
  private Integer vdbRefreshes;

  public static final String SERIALIZED_NAME_MASKING_JOBS = "masking_jobs";
  @SerializedName(SERIALIZED_NAME_MASKING_JOBS)
  private Integer maskingJobs;

  public AuditLogsSummary() {
  }

  public AuditLogsSummary accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @javax.annotation.Nullable
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public AuditLogsSummary accountFirstName(String accountFirstName) {
    this.accountFirstName = accountFirstName;
    return this;
  }

   /**
   * Get accountFirstName
   * @return accountFirstName
  **/
  @javax.annotation.Nullable
  public String getAccountFirstName() {
    return accountFirstName;
  }

  public void setAccountFirstName(String accountFirstName) {
    this.accountFirstName = accountFirstName;
  }


  public AuditLogsSummary accountLastName(String accountLastName) {
    this.accountLastName = accountLastName;
    return this;
  }

   /**
   * Get accountLastName
   * @return accountLastName
  **/
  @javax.annotation.Nullable
  public String getAccountLastName() {
    return accountLastName;
  }

  public void setAccountLastName(String accountLastName) {
    this.accountLastName = accountLastName;
  }


  public AuditLogsSummary vdbRefreshes(Integer vdbRefreshes) {
    this.vdbRefreshes = vdbRefreshes;
    return this;
  }

   /**
   * The number of VDB refreshes performed by the account.
   * @return vdbRefreshes
  **/
  @javax.annotation.Nullable
  public Integer getVdbRefreshes() {
    return vdbRefreshes;
  }

  public void setVdbRefreshes(Integer vdbRefreshes) {
    this.vdbRefreshes = vdbRefreshes;
  }


  public AuditLogsSummary maskingJobs(Integer maskingJobs) {
    this.maskingJobs = maskingJobs;
    return this;
  }

   /**
   * The number of compliance jobs executed by the account.
   * @return maskingJobs
  **/
  @javax.annotation.Nullable
  public Integer getMaskingJobs() {
    return maskingJobs;
  }

  public void setMaskingJobs(Integer maskingJobs) {
    this.maskingJobs = maskingJobs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogsSummary auditLogsSummary = (AuditLogsSummary) o;
    return Objects.equals(this.accountId, auditLogsSummary.accountId) &&
        Objects.equals(this.accountFirstName, auditLogsSummary.accountFirstName) &&
        Objects.equals(this.accountLastName, auditLogsSummary.accountLastName) &&
        Objects.equals(this.vdbRefreshes, auditLogsSummary.vdbRefreshes) &&
        Objects.equals(this.maskingJobs, auditLogsSummary.maskingJobs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountFirstName, accountLastName, vdbRefreshes, maskingJobs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogsSummary {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountFirstName: ").append(toIndentedString(accountFirstName)).append("\n");
    sb.append("    accountLastName: ").append(toIndentedString(accountLastName)).append("\n");
    sb.append("    vdbRefreshes: ").append(toIndentedString(vdbRefreshes)).append("\n");
    sb.append("    maskingJobs: ").append(toIndentedString(maskingJobs)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("account_first_name");
    openapiFields.add("account_last_name");
    openapiFields.add("vdb_refreshes");
    openapiFields.add("masking_jobs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AuditLogsSummary
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AuditLogsSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuditLogsSummary is not found in the empty JSON string", AuditLogsSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AuditLogsSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuditLogsSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("account_first_name") != null && !jsonObj.get("account_first_name").isJsonNull()) && !jsonObj.get("account_first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_first_name").toString()));
      }
      if ((jsonObj.get("account_last_name") != null && !jsonObj.get("account_last_name").isJsonNull()) && !jsonObj.get("account_last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_last_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuditLogsSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuditLogsSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuditLogsSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuditLogsSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<AuditLogsSummary>() {
           @Override
           public void write(JsonWriter out, AuditLogsSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuditLogsSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuditLogsSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuditLogsSummary
  * @throws IOException if the JSON string is invalid with respect to AuditLogsSummary
  */
  public static AuditLogsSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuditLogsSummary.class);
  }

 /**
  * Convert an instance of AuditLogsSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import com.delphix.dct.models.ProductHistory;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * Product Information Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class ProductInfo {
  public static final String SERIALIZED_NAME_API_VERSION = "api_version";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_PRODUCT_VERSION = "product_version";
  @SerializedName(SERIALIZED_NAME_PRODUCT_VERSION)
  private String productVersion;

  public static final String SERIALIZED_NAME_SYSTEM_UUID = "system_uuid";
  @SerializedName(SERIALIZED_NAME_SYSTEM_UUID)
  private String systemUuid;

  public static final String SERIALIZED_NAME_PRODUCT_UPGRADE_HISTORY = "product_upgrade_history";
  @SerializedName(SERIALIZED_NAME_PRODUCT_UPGRADE_HISTORY)
  private List<ProductHistory> productUpgradeHistory;

  public static final String SERIALIZED_NAME_SUPPORTED_API_VERSIONS = "supported_api_versions";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_API_VERSIONS)
  private List<String> supportedApiVersions;

  public ProductInfo() {
  }

  public ProductInfo apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * Current API version.
   * @return apiVersion
  **/
  @javax.annotation.Nullable
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public ProductInfo productVersion(String productVersion) {
    this.productVersion = productVersion;
    return this;
  }

   /**
   * Current installed product version.
   * @return productVersion
  **/
  @javax.annotation.Nullable
  public String getProductVersion() {
    return productVersion;
  }

  public void setProductVersion(String productVersion) {
    this.productVersion = productVersion;
  }


  public ProductInfo systemUuid(String systemUuid) {
    this.systemUuid = systemUuid;
    return this;
  }

   /**
   * System UUID
   * @return systemUuid
  **/
  @javax.annotation.Nullable
  public String getSystemUuid() {
    return systemUuid;
  }

  public void setSystemUuid(String systemUuid) {
    this.systemUuid = systemUuid;
  }


  public ProductInfo productUpgradeHistory(List<ProductHistory> productUpgradeHistory) {
    this.productUpgradeHistory = productUpgradeHistory;
    return this;
  }

  public ProductInfo addProductUpgradeHistoryItem(ProductHistory productUpgradeHistoryItem) {
    if (this.productUpgradeHistory == null) {
      this.productUpgradeHistory = new ArrayList<>();
    }
    this.productUpgradeHistory.add(productUpgradeHistoryItem);
    return this;
  }

   /**
   * Product upgrade history.
   * @return productUpgradeHistory
  **/
  @javax.annotation.Nullable
  public List<ProductHistory> getProductUpgradeHistory() {
    return productUpgradeHistory;
  }

  public void setProductUpgradeHistory(List<ProductHistory> productUpgradeHistory) {
    this.productUpgradeHistory = productUpgradeHistory;
  }


  public ProductInfo supportedApiVersions(List<String> supportedApiVersions) {
    this.supportedApiVersions = supportedApiVersions;
    return this;
  }

  public ProductInfo addSupportedApiVersionsItem(String supportedApiVersionsItem) {
    if (this.supportedApiVersions == null) {
      this.supportedApiVersions = new ArrayList<>();
    }
    this.supportedApiVersions.add(supportedApiVersionsItem);
    return this;
  }

   /**
   * All the supported API versions.
   * @return supportedApiVersions
  **/
  @javax.annotation.Nullable
  public List<String> getSupportedApiVersions() {
    return supportedApiVersions;
  }

  public void setSupportedApiVersions(List<String> supportedApiVersions) {
    this.supportedApiVersions = supportedApiVersions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductInfo productInfo = (ProductInfo) o;
    return Objects.equals(this.apiVersion, productInfo.apiVersion) &&
        Objects.equals(this.productVersion, productInfo.productVersion) &&
        Objects.equals(this.systemUuid, productInfo.systemUuid) &&
        Objects.equals(this.productUpgradeHistory, productInfo.productUpgradeHistory) &&
        Objects.equals(this.supportedApiVersions, productInfo.supportedApiVersions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, productVersion, systemUuid, productUpgradeHistory, supportedApiVersions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductInfo {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    productVersion: ").append(toIndentedString(productVersion)).append("\n");
    sb.append("    systemUuid: ").append(toIndentedString(systemUuid)).append("\n");
    sb.append("    productUpgradeHistory: ").append(toIndentedString(productUpgradeHistory)).append("\n");
    sb.append("    supportedApiVersions: ").append(toIndentedString(supportedApiVersions)).append("\n");
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
    openapiFields.add("api_version");
    openapiFields.add("product_version");
    openapiFields.add("system_uuid");
    openapiFields.add("product_upgrade_history");
    openapiFields.add("supported_api_versions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductInfo is not found in the empty JSON string", ProductInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("api_version") != null && !jsonObj.get("api_version").isJsonNull()) && !jsonObj.get("api_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `api_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("api_version").toString()));
      }
      if ((jsonObj.get("product_version") != null && !jsonObj.get("product_version").isJsonNull()) && !jsonObj.get("product_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_version").toString()));
      }
      if ((jsonObj.get("system_uuid") != null && !jsonObj.get("system_uuid").isJsonNull()) && !jsonObj.get("system_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `system_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("system_uuid").toString()));
      }
      if (jsonObj.get("product_upgrade_history") != null && !jsonObj.get("product_upgrade_history").isJsonNull()) {
        JsonArray jsonArrayproductUpgradeHistory = jsonObj.getAsJsonArray("product_upgrade_history");
        if (jsonArrayproductUpgradeHistory != null) {
          // ensure the json data is an array
          if (!jsonObj.get("product_upgrade_history").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `product_upgrade_history` to be an array in the JSON string but got `%s`", jsonObj.get("product_upgrade_history").toString()));
          }

          // validate the optional field `product_upgrade_history` (array)
          for (int i = 0; i < jsonArrayproductUpgradeHistory.size(); i++) {
            ProductHistory.validateJsonElement(jsonArrayproductUpgradeHistory.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("supported_api_versions") != null && !jsonObj.get("supported_api_versions").isJsonNull() && !jsonObj.get("supported_api_versions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `supported_api_versions` to be an array in the JSON string but got `%s`", jsonObj.get("supported_api_versions").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductInfo>() {
           @Override
           public void write(JsonWriter out, ProductInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductInfo
  * @throws IOException if the JSON string is invalid with respect to ProductInfo
  */
  public static ProductInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductInfo.class);
  }

 /**
  * Convert an instance of ProductInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


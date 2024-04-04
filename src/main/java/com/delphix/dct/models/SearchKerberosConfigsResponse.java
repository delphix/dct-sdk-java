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
import com.delphix.dct.models.KerberosConfig;
import com.delphix.dct.models.PaginatedResponseMetadata;
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
 * SearchKerberosConfigsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:02:33.321319+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class SearchKerberosConfigsResponse {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<KerberosConfig> items;

  public static final String SERIALIZED_NAME_RESPONSE_METADATA = "response_metadata";
  @SerializedName(SERIALIZED_NAME_RESPONSE_METADATA)
  private PaginatedResponseMetadata responseMetadata;

  public SearchKerberosConfigsResponse() {
  }

  public SearchKerberosConfigsResponse items(List<KerberosConfig> items) {
    this.items = items;
    return this;
  }

  public SearchKerberosConfigsResponse addItemsItem(KerberosConfig itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  public List<KerberosConfig> getItems() {
    return items;
  }

  public void setItems(List<KerberosConfig> items) {
    this.items = items;
  }


  public SearchKerberosConfigsResponse responseMetadata(PaginatedResponseMetadata responseMetadata) {
    this.responseMetadata = responseMetadata;
    return this;
  }

   /**
   * Get responseMetadata
   * @return responseMetadata
  **/
  @javax.annotation.Nullable
  public PaginatedResponseMetadata getResponseMetadata() {
    return responseMetadata;
  }

  public void setResponseMetadata(PaginatedResponseMetadata responseMetadata) {
    this.responseMetadata = responseMetadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchKerberosConfigsResponse searchKerberosConfigsResponse = (SearchKerberosConfigsResponse) o;
    return Objects.equals(this.items, searchKerberosConfigsResponse.items) &&
        Objects.equals(this.responseMetadata, searchKerberosConfigsResponse.responseMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, responseMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchKerberosConfigsResponse {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    responseMetadata: ").append(toIndentedString(responseMetadata)).append("\n");
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
    openapiFields.add("items");
    openapiFields.add("response_metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SearchKerberosConfigsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SearchKerberosConfigsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchKerberosConfigsResponse is not found in the empty JSON string", SearchKerberosConfigsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SearchKerberosConfigsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchKerberosConfigsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) {
        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
        if (jsonArrayitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
          }

          // validate the optional field `items` (array)
          for (int i = 0; i < jsonArrayitems.size(); i++) {
            KerberosConfig.validateJsonElement(jsonArrayitems.get(i));
          };
        }
      }
      // validate the optional field `response_metadata`
      if (jsonObj.get("response_metadata") != null && !jsonObj.get("response_metadata").isJsonNull()) {
        PaginatedResponseMetadata.validateJsonElement(jsonObj.get("response_metadata"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchKerberosConfigsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchKerberosConfigsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchKerberosConfigsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchKerberosConfigsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchKerberosConfigsResponse>() {
           @Override
           public void write(JsonWriter out, SearchKerberosConfigsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchKerberosConfigsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchKerberosConfigsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchKerberosConfigsResponse
  * @throws IOException if the JSON string is invalid with respect to SearchKerberosConfigsResponse
  */
  public static SearchKerberosConfigsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchKerberosConfigsResponse.class);
  }

 /**
  * Convert an instance of SearchKerberosConfigsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


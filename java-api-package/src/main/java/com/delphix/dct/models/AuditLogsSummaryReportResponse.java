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
import com.delphix.dct.models.AuditLogsSummary;
import com.delphix.dct.models.AuditLogsSummaryTotals;
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
 * AuditLogsSummaryReportResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:02:33.321319+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class AuditLogsSummaryReportResponse {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<AuditLogsSummary> items;

  public static final String SERIALIZED_NAME_RESPONSE_METADATA = "response_metadata";
  @SerializedName(SERIALIZED_NAME_RESPONSE_METADATA)
  private PaginatedResponseMetadata responseMetadata;

  public static final String SERIALIZED_NAME_TOTALS = "totals";
  @SerializedName(SERIALIZED_NAME_TOTALS)
  private AuditLogsSummaryTotals totals;

  public AuditLogsSummaryReportResponse() {
  }

  public AuditLogsSummaryReportResponse items(List<AuditLogsSummary> items) {
    this.items = items;
    return this;
  }

  public AuditLogsSummaryReportResponse addItemsItem(AuditLogsSummary itemsItem) {
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
  public List<AuditLogsSummary> getItems() {
    return items;
  }

  public void setItems(List<AuditLogsSummary> items) {
    this.items = items;
  }


  public AuditLogsSummaryReportResponse responseMetadata(PaginatedResponseMetadata responseMetadata) {
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


  public AuditLogsSummaryReportResponse totals(AuditLogsSummaryTotals totals) {
    this.totals = totals;
    return this;
  }

   /**
   * Get totals
   * @return totals
  **/
  @javax.annotation.Nullable
  public AuditLogsSummaryTotals getTotals() {
    return totals;
  }

  public void setTotals(AuditLogsSummaryTotals totals) {
    this.totals = totals;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogsSummaryReportResponse auditLogsSummaryReportResponse = (AuditLogsSummaryReportResponse) o;
    return Objects.equals(this.items, auditLogsSummaryReportResponse.items) &&
        Objects.equals(this.responseMetadata, auditLogsSummaryReportResponse.responseMetadata) &&
        Objects.equals(this.totals, auditLogsSummaryReportResponse.totals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, responseMetadata, totals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogsSummaryReportResponse {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    responseMetadata: ").append(toIndentedString(responseMetadata)).append("\n");
    sb.append("    totals: ").append(toIndentedString(totals)).append("\n");
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
    openapiFields.add("totals");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AuditLogsSummaryReportResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AuditLogsSummaryReportResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuditLogsSummaryReportResponse is not found in the empty JSON string", AuditLogsSummaryReportResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AuditLogsSummaryReportResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuditLogsSummaryReportResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
            AuditLogsSummary.validateJsonElement(jsonArrayitems.get(i));
          };
        }
      }
      // validate the optional field `response_metadata`
      if (jsonObj.get("response_metadata") != null && !jsonObj.get("response_metadata").isJsonNull()) {
        PaginatedResponseMetadata.validateJsonElement(jsonObj.get("response_metadata"));
      }
      // validate the optional field `totals`
      if (jsonObj.get("totals") != null && !jsonObj.get("totals").isJsonNull()) {
        AuditLogsSummaryTotals.validateJsonElement(jsonObj.get("totals"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuditLogsSummaryReportResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuditLogsSummaryReportResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuditLogsSummaryReportResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuditLogsSummaryReportResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<AuditLogsSummaryReportResponse>() {
           @Override
           public void write(JsonWriter out, AuditLogsSummaryReportResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuditLogsSummaryReportResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuditLogsSummaryReportResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuditLogsSummaryReportResponse
  * @throws IOException if the JSON string is invalid with respect to AuditLogsSummaryReportResponse
  */
  public static AuditLogsSummaryReportResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuditLogsSummaryReportResponse.class);
  }

 /**
  * Convert an instance of AuditLogsSummaryReportResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


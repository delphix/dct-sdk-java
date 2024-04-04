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
import java.math.BigDecimal;
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
 * StorageSavingsReportSummarizedData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class StorageSavingsReportSummarizedData {
  public static final String SERIALIZED_NAME_VDB_COUNT = "vdb_count";
  @SerializedName(SERIALIZED_NAME_VDB_COUNT)
  private Integer vdbCount;

  public static final String SERIALIZED_NAME_DSOURCE_COUNT = "dsource_count";
  @SerializedName(SERIALIZED_NAME_DSOURCE_COUNT)
  private Integer dsourceCount;

  public static final String SERIALIZED_NAME_VIRTUALIZED_SPACE = "virtualized_space";
  @SerializedName(SERIALIZED_NAME_VIRTUALIZED_SPACE)
  private Long virtualizedSpace;

  public static final String SERIALIZED_NAME_UNVIRTUALIZED_SPACE = "unvirtualized_space";
  @SerializedName(SERIALIZED_NAME_UNVIRTUALIZED_SPACE)
  private Long unvirtualizedSpace;

  public static final String SERIALIZED_NAME_ESTIMATED_SAVINGS = "estimated_savings";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_SAVINGS)
  private Long estimatedSavings;

  public static final String SERIALIZED_NAME_ESTIMATED_SAVINGS_PERC = "estimated_savings_perc";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_SAVINGS_PERC)
  private BigDecimal estimatedSavingsPerc;

  public StorageSavingsReportSummarizedData() {
  }

  public StorageSavingsReportSummarizedData vdbCount(Integer vdbCount) {
    this.vdbCount = vdbCount;
    return this;
  }

   /**
   * The total VDB count
   * @return vdbCount
  **/
  @javax.annotation.Nullable
  public Integer getVdbCount() {
    return vdbCount;
  }

  public void setVdbCount(Integer vdbCount) {
    this.vdbCount = vdbCount;
  }


  public StorageSavingsReportSummarizedData dsourceCount(Integer dsourceCount) {
    this.dsourceCount = dsourceCount;
    return this;
  }

   /**
   * The total dSource count
   * @return dsourceCount
  **/
  @javax.annotation.Nullable
  public Integer getDsourceCount() {
    return dsourceCount;
  }

  public void setDsourceCount(Integer dsourceCount) {
    this.dsourceCount = dsourceCount;
  }


  public StorageSavingsReportSummarizedData virtualizedSpace(Long virtualizedSpace) {
    this.virtualizedSpace = virtualizedSpace;
    return this;
  }

   /**
   * Total Virtualized Space. This is the sum of storage size from dSources and their dependant VDBs.
   * @return virtualizedSpace
  **/
  @javax.annotation.Nullable
  public Long getVirtualizedSpace() {
    return virtualizedSpace;
  }

  public void setVirtualizedSpace(Long virtualizedSpace) {
    this.virtualizedSpace = virtualizedSpace;
  }


  public StorageSavingsReportSummarizedData unvirtualizedSpace(Long unvirtualizedSpace) {
    this.unvirtualizedSpace = unvirtualizedSpace;
    return this;
  }

   /**
   * Total Unvirtualized Space. This is the sum of un-virtualized space from the dependants VDBs of the dSource.
   * @return unvirtualizedSpace
  **/
  @javax.annotation.Nullable
  public Long getUnvirtualizedSpace() {
    return unvirtualizedSpace;
  }

  public void setUnvirtualizedSpace(Long unvirtualizedSpace) {
    this.unvirtualizedSpace = unvirtualizedSpace;
  }


  public StorageSavingsReportSummarizedData estimatedSavings(Long estimatedSavings) {
    this.estimatedSavings = estimatedSavings;
    return this;
  }

   /**
   * The disk space that has been saved by using Delphix virtualization, in bytes.
   * @return estimatedSavings
  **/
  @javax.annotation.Nullable
  public Long getEstimatedSavings() {
    return estimatedSavings;
  }

  public void setEstimatedSavings(Long estimatedSavings) {
    this.estimatedSavings = estimatedSavings;
  }


  public StorageSavingsReportSummarizedData estimatedSavingsPerc(BigDecimal estimatedSavingsPerc) {
    this.estimatedSavingsPerc = estimatedSavingsPerc;
    return this;
  }

   /**
   * The disk space that has been saved by using Delphix virtualization, in percentage.
   * @return estimatedSavingsPerc
  **/
  @javax.annotation.Nullable
  public BigDecimal getEstimatedSavingsPerc() {
    return estimatedSavingsPerc;
  }

  public void setEstimatedSavingsPerc(BigDecimal estimatedSavingsPerc) {
    this.estimatedSavingsPerc = estimatedSavingsPerc;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageSavingsReportSummarizedData storageSavingsReportSummarizedData = (StorageSavingsReportSummarizedData) o;
    return Objects.equals(this.vdbCount, storageSavingsReportSummarizedData.vdbCount) &&
        Objects.equals(this.dsourceCount, storageSavingsReportSummarizedData.dsourceCount) &&
        Objects.equals(this.virtualizedSpace, storageSavingsReportSummarizedData.virtualizedSpace) &&
        Objects.equals(this.unvirtualizedSpace, storageSavingsReportSummarizedData.unvirtualizedSpace) &&
        Objects.equals(this.estimatedSavings, storageSavingsReportSummarizedData.estimatedSavings) &&
        Objects.equals(this.estimatedSavingsPerc, storageSavingsReportSummarizedData.estimatedSavingsPerc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vdbCount, dsourceCount, virtualizedSpace, unvirtualizedSpace, estimatedSavings, estimatedSavingsPerc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageSavingsReportSummarizedData {\n");
    sb.append("    vdbCount: ").append(toIndentedString(vdbCount)).append("\n");
    sb.append("    dsourceCount: ").append(toIndentedString(dsourceCount)).append("\n");
    sb.append("    virtualizedSpace: ").append(toIndentedString(virtualizedSpace)).append("\n");
    sb.append("    unvirtualizedSpace: ").append(toIndentedString(unvirtualizedSpace)).append("\n");
    sb.append("    estimatedSavings: ").append(toIndentedString(estimatedSavings)).append("\n");
    sb.append("    estimatedSavingsPerc: ").append(toIndentedString(estimatedSavingsPerc)).append("\n");
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
    openapiFields.add("vdb_count");
    openapiFields.add("dsource_count");
    openapiFields.add("virtualized_space");
    openapiFields.add("unvirtualized_space");
    openapiFields.add("estimated_savings");
    openapiFields.add("estimated_savings_perc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to StorageSavingsReportSummarizedData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StorageSavingsReportSummarizedData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StorageSavingsReportSummarizedData is not found in the empty JSON string", StorageSavingsReportSummarizedData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StorageSavingsReportSummarizedData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StorageSavingsReportSummarizedData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StorageSavingsReportSummarizedData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StorageSavingsReportSummarizedData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StorageSavingsReportSummarizedData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StorageSavingsReportSummarizedData.class));

       return (TypeAdapter<T>) new TypeAdapter<StorageSavingsReportSummarizedData>() {
           @Override
           public void write(JsonWriter out, StorageSavingsReportSummarizedData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StorageSavingsReportSummarizedData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StorageSavingsReportSummarizedData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StorageSavingsReportSummarizedData
  * @throws IOException if the JSON string is invalid with respect to StorageSavingsReportSummarizedData
  */
  public static StorageSavingsReportSummarizedData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StorageSavingsReportSummarizedData.class);
  }

 /**
  * Convert an instance of StorageSavingsReportSummarizedData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


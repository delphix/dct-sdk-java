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
import com.delphix.dct.models.EnginePerformanceAnalyticTrendDatapointInner;
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
 * EnginePerformanceAnalyticTrend
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class EnginePerformanceAnalyticTrend {
  /**
   * Gets or Sets trendType
   */
  @JsonAdapter(TrendTypeEnum.Adapter.class)
  public enum TrendTypeEnum {
    CPU_UTILIZATION("CPU_UTILIZATION"),
    
    NETWORK_THROUGHPUT_TRANSMIT("NETWORK_THROUGHPUT_TRANSMIT"),
    
    NETWORK_THROUGHPUT_RECEIVE("NETWORK_THROUGHPUT_RECEIVE"),
    
    DISK_LATENCY_WRITE("DISK_LATENCY_WRITE"),
    
    DISK_LATENCY_READ("DISK_LATENCY_READ"),
    
    DISK_LATENCY_TOTAL("DISK_LATENCY_TOTAL"),
    
    DISK_THROUGHPUT_WRITE("DISK_THROUGHPUT_WRITE"),
    
    DISK_THROUGHPUT_READ("DISK_THROUGHPUT_READ"),
    
    DISK_THROUGHPUT_TOTAL("DISK_THROUGHPUT_TOTAL"),
    
    DISK_IOPS_READ("DISK_IOPS_READ"),
    
    DISK_IOPS_WRITE("DISK_IOPS_WRITE"),
    
    DISK_IOPS_TOTAL("DISK_IOPS_TOTAL"),
    
    NFS_LATENCY_WRITE("NFS_LATENCY_WRITE"),
    
    NFS_LATENCY_READ("NFS_LATENCY_READ"),
    
    NFS_LATENCY_TOTAL("NFS_LATENCY_TOTAL"),
    
    NFS_THROUGHPUT_WRITE("NFS_THROUGHPUT_WRITE"),
    
    NFS_THROUGHPUT_READ("NFS_THROUGHPUT_READ"),
    
    NFS_THROUGHPUT_TOTAL("NFS_THROUGHPUT_TOTAL"),
    
    NFS_IOPS_WRITE("NFS_IOPS_WRITE"),
    
    NFS_IOPS_READ("NFS_IOPS_READ"),
    
    NFS_IOPS_TOTAL("NFS_IOPS_TOTAL"),
    
    ISCSI_LATENCY_WRITE("iSCSI_LATENCY_WRITE"),
    
    ISCSI_LATENCY_READ("iSCSI_LATENCY_READ"),
    
    ISCSI_LATENCY_TOTAL("iSCSI_LATENCY_TOTAL"),
    
    ISCSI_THROUGHPUT_WRITE("iSCSI_THROUGHPUT_WRITE"),
    
    ISCSI_THROUGHPUT_READ("iSCSI_THROUGHPUT_READ"),
    
    ISCSI_THROUGHPUT_TOTAL("iSCSI_THROUGHPUT_TOTAL"),
    
    ISCSI_IOPS_WRITE("iSCSI_IOPS_WRITE"),
    
    ISCSI_IOPS_READ("iSCSI_IOPS_READ"),
    
    ISCSI_IOPS_TOTAL("iSCSI_IOPS_TOTAL");

    private String value;

    TrendTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TrendTypeEnum fromValue(String value) {
      for (TrendTypeEnum b : TrendTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TrendTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TrendTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TrendTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TrendTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TrendTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TREND_TYPE = "trend_type";
  @SerializedName(SERIALIZED_NAME_TREND_TYPE)
  private TrendTypeEnum trendType;

  public static final String SERIALIZED_NAME_ENGINE_ID = "engine_id";
  @SerializedName(SERIALIZED_NAME_ENGINE_ID)
  private String engineId;

  public static final String SERIALIZED_NAME_AGGREGATION_PERIOD = "aggregation_period";
  @SerializedName(SERIALIZED_NAME_AGGREGATION_PERIOD)
  private Integer aggregationPeriod;

  public static final String SERIALIZED_NAME_DATAPOINT = "datapoint";
  @SerializedName(SERIALIZED_NAME_DATAPOINT)
  private List<EnginePerformanceAnalyticTrendDatapointInner> datapoint;

  public EnginePerformanceAnalyticTrend() {
  }

  public EnginePerformanceAnalyticTrend trendType(TrendTypeEnum trendType) {
    this.trendType = trendType;
    return this;
  }

   /**
   * Get trendType
   * @return trendType
  **/
  @javax.annotation.Nullable
  public TrendTypeEnum getTrendType() {
    return trendType;
  }

  public void setTrendType(TrendTypeEnum trendType) {
    this.trendType = trendType;
  }


  public EnginePerformanceAnalyticTrend engineId(String engineId) {
    this.engineId = engineId;
    return this;
  }

   /**
   * The engine id.
   * @return engineId
  **/
  @javax.annotation.Nullable
  public String getEngineId() {
    return engineId;
  }

  public void setEngineId(String engineId) {
    this.engineId = engineId;
  }


  public EnginePerformanceAnalyticTrend aggregationPeriod(Integer aggregationPeriod) {
    this.aggregationPeriod = aggregationPeriod;
    return this;
  }

   /**
   * The time period by which engine performance analytics data is being aggregated, in hours.
   * @return aggregationPeriod
  **/
  @javax.annotation.Nullable
  public Integer getAggregationPeriod() {
    return aggregationPeriod;
  }

  public void setAggregationPeriod(Integer aggregationPeriod) {
    this.aggregationPeriod = aggregationPeriod;
  }


  public EnginePerformanceAnalyticTrend datapoint(List<EnginePerformanceAnalyticTrendDatapointInner> datapoint) {
    this.datapoint = datapoint;
    return this;
  }

  public EnginePerformanceAnalyticTrend addDatapointItem(EnginePerformanceAnalyticTrendDatapointInner datapointItem) {
    if (this.datapoint == null) {
      this.datapoint = new ArrayList<>();
    }
    this.datapoint.add(datapointItem);
    return this;
  }

   /**
   * Get datapoint
   * @return datapoint
  **/
  @javax.annotation.Nullable
  public List<EnginePerformanceAnalyticTrendDatapointInner> getDatapoint() {
    return datapoint;
  }

  public void setDatapoint(List<EnginePerformanceAnalyticTrendDatapointInner> datapoint) {
    this.datapoint = datapoint;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnginePerformanceAnalyticTrend enginePerformanceAnalyticTrend = (EnginePerformanceAnalyticTrend) o;
    return Objects.equals(this.trendType, enginePerformanceAnalyticTrend.trendType) &&
        Objects.equals(this.engineId, enginePerformanceAnalyticTrend.engineId) &&
        Objects.equals(this.aggregationPeriod, enginePerformanceAnalyticTrend.aggregationPeriod) &&
        Objects.equals(this.datapoint, enginePerformanceAnalyticTrend.datapoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trendType, engineId, aggregationPeriod, datapoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnginePerformanceAnalyticTrend {\n");
    sb.append("    trendType: ").append(toIndentedString(trendType)).append("\n");
    sb.append("    engineId: ").append(toIndentedString(engineId)).append("\n");
    sb.append("    aggregationPeriod: ").append(toIndentedString(aggregationPeriod)).append("\n");
    sb.append("    datapoint: ").append(toIndentedString(datapoint)).append("\n");
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
    openapiFields.add("trend_type");
    openapiFields.add("engine_id");
    openapiFields.add("aggregation_period");
    openapiFields.add("datapoint");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EnginePerformanceAnalyticTrend
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EnginePerformanceAnalyticTrend.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnginePerformanceAnalyticTrend is not found in the empty JSON string", EnginePerformanceAnalyticTrend.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EnginePerformanceAnalyticTrend.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnginePerformanceAnalyticTrend` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("trend_type") != null && !jsonObj.get("trend_type").isJsonNull()) && !jsonObj.get("trend_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trend_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trend_type").toString()));
      }
      // validate the optional field `trend_type`
      if (jsonObj.get("trend_type") != null && !jsonObj.get("trend_type").isJsonNull()) {
        TrendTypeEnum.validateJsonElement(jsonObj.get("trend_type"));
      }
      if ((jsonObj.get("engine_id") != null && !jsonObj.get("engine_id").isJsonNull()) && !jsonObj.get("engine_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `engine_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("engine_id").toString()));
      }
      if (jsonObj.get("datapoint") != null && !jsonObj.get("datapoint").isJsonNull()) {
        JsonArray jsonArraydatapoint = jsonObj.getAsJsonArray("datapoint");
        if (jsonArraydatapoint != null) {
          // ensure the json data is an array
          if (!jsonObj.get("datapoint").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `datapoint` to be an array in the JSON string but got `%s`", jsonObj.get("datapoint").toString()));
          }

          // validate the optional field `datapoint` (array)
          for (int i = 0; i < jsonArraydatapoint.size(); i++) {
            EnginePerformanceAnalyticTrendDatapointInner.validateJsonElement(jsonArraydatapoint.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnginePerformanceAnalyticTrend.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnginePerformanceAnalyticTrend' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnginePerformanceAnalyticTrend> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnginePerformanceAnalyticTrend.class));

       return (TypeAdapter<T>) new TypeAdapter<EnginePerformanceAnalyticTrend>() {
           @Override
           public void write(JsonWriter out, EnginePerformanceAnalyticTrend value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnginePerformanceAnalyticTrend read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnginePerformanceAnalyticTrend given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnginePerformanceAnalyticTrend
  * @throws IOException if the JSON string is invalid with respect to EnginePerformanceAnalyticTrend
  */
  public static EnginePerformanceAnalyticTrend fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnginePerformanceAnalyticTrend.class);
  }

 /**
  * Convert an instance of EnginePerformanceAnalyticTrend to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


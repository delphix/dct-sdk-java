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
import org.threeten.bp.OffsetDateTime;

/**
 * TimestampCompatibleRepositoryRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-19T17:08:49.349376+05:30[Asia/Kolkata]")
public class TimestampCompatibleRepositoryRequest {
  public static final String SERIALIZED_NAME_SOURCE_DATA_ID = "source_data_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_DATA_ID)
  private String sourceDataId;

  public static final String SERIALIZED_NAME_ENGINE_ID = "engine_id";
  @SerializedName(SERIALIZED_NAME_ENGINE_ID)
  private String engineId;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_TIMEFLOW_ID = "timeflow_id";
  @SerializedName(SERIALIZED_NAME_TIMEFLOW_ID)
  private String timeflowId;

  public static final String SERIALIZED_NAME_ENVIRONMENT_ID = "environment_id";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_ID)
  private String environmentId;


  public TimestampCompatibleRepositoryRequest sourceDataId(String sourceDataId) {
    
    this.sourceDataId = sourceDataId;
    return this;
  }

   /**
   * The ID of the source object (dSource or VDB) to get the compatible repos. All other objects referenced by the parameters must live on the same engine as the source.
   * @return sourceDataId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "source-123", value = "The ID of the source object (dSource or VDB) to get the compatible repos. All other objects referenced by the parameters must live on the same engine as the source.")

  public String getSourceDataId() {
    return sourceDataId;
  }


  public void setSourceDataId(String sourceDataId) {
    this.sourceDataId = sourceDataId;
  }


  public TimestampCompatibleRepositoryRequest engineId(String engineId) {
    
    this.engineId = engineId;
    return this;
  }

   /**
   * The ID of the Engine from where to get the compatible repos. If the source ID unambiguously identifies a source object, this parameter is unnecessary and ignored.
   * @return engineId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "engine-123", value = "The ID of the Engine from where to get the compatible repos. If the source ID unambiguously identifies a source object, this parameter is unnecessary and ignored.")

  public String getEngineId() {
    return engineId;
  }


  public void setEngineId(String engineId) {
    this.engineId = engineId;
  }


  public TimestampCompatibleRepositoryRequest timestamp(OffsetDateTime timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The point in time from which to execute the operation. If the timestamp is not set, selects the latest point.
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-05-01T08:51:34.148Z", value = "The point in time from which to execute the operation. If the timestamp is not set, selects the latest point.")

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public TimestampCompatibleRepositoryRequest timeflowId(String timeflowId) {
    
    this.timeflowId = timeflowId;
    return this;
  }

   /**
   * ID of the timeflow from which compatible repos need to be fetched, mutually exclusive with source_data_id.
   * @return timeflowId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "timeflow_123", value = "ID of the timeflow from which compatible repos need to be fetched, mutually exclusive with source_data_id.")

  public String getTimeflowId() {
    return timeflowId;
  }


  public void setTimeflowId(String timeflowId) {
    this.timeflowId = timeflowId;
  }


  public TimestampCompatibleRepositoryRequest environmentId(String environmentId) {
    
    this.environmentId = environmentId;
    return this;
  }

   /**
   * The ID or name of the target environment.
   * @return environmentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1-UNIX_HOST_ENVIRONMENT-1", value = "The ID or name of the target environment.")

  public String getEnvironmentId() {
    return environmentId;
  }


  public void setEnvironmentId(String environmentId) {
    this.environmentId = environmentId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimestampCompatibleRepositoryRequest timestampCompatibleRepositoryRequest = (TimestampCompatibleRepositoryRequest) o;
    return Objects.equals(this.sourceDataId, timestampCompatibleRepositoryRequest.sourceDataId) &&
        Objects.equals(this.engineId, timestampCompatibleRepositoryRequest.engineId) &&
        Objects.equals(this.timestamp, timestampCompatibleRepositoryRequest.timestamp) &&
        Objects.equals(this.timeflowId, timestampCompatibleRepositoryRequest.timeflowId) &&
        Objects.equals(this.environmentId, timestampCompatibleRepositoryRequest.environmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceDataId, engineId, timestamp, timeflowId, environmentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimestampCompatibleRepositoryRequest {\n");
    sb.append("    sourceDataId: ").append(toIndentedString(sourceDataId)).append("\n");
    sb.append("    engineId: ").append(toIndentedString(engineId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    timeflowId: ").append(toIndentedString(timeflowId)).append("\n");
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
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


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
import com.delphix.dct.models.DataPointByTimestampParameters;
import com.delphix.dct.models.RefreshVDBByTimestampParametersAllOf;
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
 * RefreshVDBByTimestampParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-19T18:53:50.335381+05:30[Asia/Kolkata]")
public class RefreshVDBByTimestampParameters {
  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_TIMESTAMP_IN_DATABASE_TIMEZONE = "timestamp_in_database_timezone";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP_IN_DATABASE_TIMEZONE)
  private String timestampInDatabaseTimezone;

  public static final String SERIALIZED_NAME_TIMEFLOW_ID = "timeflow_id";
  @SerializedName(SERIALIZED_NAME_TIMEFLOW_ID)
  private String timeflowId;

  public static final String SERIALIZED_NAME_DATASET_ID = "dataset_id";
  @SerializedName(SERIALIZED_NAME_DATASET_ID)
  private String datasetId;


  public RefreshVDBByTimestampParameters timestamp(OffsetDateTime timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The point in time from which to execute the operation. Mutually exclusive with timestamp_in_database_timezone. If the timestamp is not set, selects the latest point.
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-05-01T08:51:34.148Z", value = "The point in time from which to execute the operation. Mutually exclusive with timestamp_in_database_timezone. If the timestamp is not set, selects the latest point.")

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public RefreshVDBByTimestampParameters timestampInDatabaseTimezone(String timestampInDatabaseTimezone) {
    
    this.timestampInDatabaseTimezone = timestampInDatabaseTimezone;
    return this;
  }

   /**
   * The point in time from which to execute the operation, expressed as a date-time in the timezone of the source database. Mutually exclusive with timestamp.
   * @return timestampInDatabaseTimezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-08-14T14:55:20.507", value = "The point in time from which to execute the operation, expressed as a date-time in the timezone of the source database. Mutually exclusive with timestamp.")

  public String getTimestampInDatabaseTimezone() {
    return timestampInDatabaseTimezone;
  }


  public void setTimestampInDatabaseTimezone(String timestampInDatabaseTimezone) {
    this.timestampInDatabaseTimezone = timestampInDatabaseTimezone;
  }


  public RefreshVDBByTimestampParameters timeflowId(String timeflowId) {
    
    this.timeflowId = timeflowId;
    return this;
  }

   /**
   * ID of the timeflow to refresh to, mutually exclusive with dataset_id.
   * @return timeflowId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "timeflow_123", value = "ID of the timeflow to refresh to, mutually exclusive with dataset_id.")

  public String getTimeflowId() {
    return timeflowId;
  }


  public void setTimeflowId(String timeflowId) {
    this.timeflowId = timeflowId;
  }


  public RefreshVDBByTimestampParameters datasetId(String datasetId) {
    
    this.datasetId = datasetId;
    return this;
  }

   /**
   * ID of the dataset to refresh to, mutually exclusive with timeflow_id.
   * @return datasetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123-CONTAINER_1", value = "ID of the dataset to refresh to, mutually exclusive with timeflow_id.")

  public String getDatasetId() {
    return datasetId;
  }


  public void setDatasetId(String datasetId) {
    this.datasetId = datasetId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefreshVDBByTimestampParameters refreshVDBByTimestampParameters = (RefreshVDBByTimestampParameters) o;
    return Objects.equals(this.timestamp, refreshVDBByTimestampParameters.timestamp) &&
        Objects.equals(this.timestampInDatabaseTimezone, refreshVDBByTimestampParameters.timestampInDatabaseTimezone) &&
        Objects.equals(this.timeflowId, refreshVDBByTimestampParameters.timeflowId) &&
        Objects.equals(this.datasetId, refreshVDBByTimestampParameters.datasetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, timestampInDatabaseTimezone, timeflowId, datasetId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefreshVDBByTimestampParameters {\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    timestampInDatabaseTimezone: ").append(toIndentedString(timestampInDatabaseTimezone)).append("\n");
    sb.append("    timeflowId: ").append(toIndentedString(timeflowId)).append("\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
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


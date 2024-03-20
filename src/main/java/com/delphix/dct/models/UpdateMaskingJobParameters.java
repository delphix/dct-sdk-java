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

/**
 * Parameters to update a MaskingJob.
 */
@ApiModel(description = "Parameters to update a MaskingJob.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-19T18:53:50.335381+05:30[Asia/Kolkata]")
public class UpdateMaskingJobParameters {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CONNECTOR_USERNAME = "connector_username";
  @SerializedName(SERIALIZED_NAME_CONNECTOR_USERNAME)
  private String connectorUsername;

  public static final String SERIALIZED_NAME_CONNECTOR_PASSWORD = "connector_password";
  @SerializedName(SERIALIZED_NAME_CONNECTOR_PASSWORD)
  private String connectorPassword;

  public static final String SERIALIZED_NAME_ON_THE_FLY_SOURCE_CONNECTOR_USERNAME = "on_the_fly_source_connector_username";
  @SerializedName(SERIALIZED_NAME_ON_THE_FLY_SOURCE_CONNECTOR_USERNAME)
  private String onTheFlySourceConnectorUsername;

  public static final String SERIALIZED_NAME_ON_THE_FLY_SOURCE_CONNECTOR_PASSWORD = "on_the_fly_source_connector_password";
  @SerializedName(SERIALIZED_NAME_ON_THE_FLY_SOURCE_CONNECTOR_PASSWORD)
  private String onTheFlySourceConnectorPassword;


  public UpdateMaskingJobParameters name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the MaskingJob.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My favorite MaskingJob", value = "The name of the MaskingJob.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateMaskingJobParameters connectorUsername(String connectorUsername) {
    
    this.connectorUsername = connectorUsername;
    return this;
  }

   /**
   * The username of the Connector used by the MaskingJob.
   * @return connectorUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user123", value = "The username of the Connector used by the MaskingJob.")

  public String getConnectorUsername() {
    return connectorUsername;
  }


  public void setConnectorUsername(String connectorUsername) {
    this.connectorUsername = connectorUsername;
  }


  public UpdateMaskingJobParameters connectorPassword(String connectorPassword) {
    
    this.connectorPassword = connectorPassword;
    return this;
  }

   /**
   * The password of the Connector used by the MaskingJob.
   * @return connectorPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "password123", value = "The password of the Connector used by the MaskingJob.")

  public String getConnectorPassword() {
    return connectorPassword;
  }


  public void setConnectorPassword(String connectorPassword) {
    this.connectorPassword = connectorPassword;
  }


  public UpdateMaskingJobParameters onTheFlySourceConnectorUsername(String onTheFlySourceConnectorUsername) {
    
    this.onTheFlySourceConnectorUsername = onTheFlySourceConnectorUsername;
    return this;
  }

   /**
   * The username of the source Connector used by the on-the-fly MaskingJob.
   * @return onTheFlySourceConnectorUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user123", value = "The username of the source Connector used by the on-the-fly MaskingJob.")

  public String getOnTheFlySourceConnectorUsername() {
    return onTheFlySourceConnectorUsername;
  }


  public void setOnTheFlySourceConnectorUsername(String onTheFlySourceConnectorUsername) {
    this.onTheFlySourceConnectorUsername = onTheFlySourceConnectorUsername;
  }


  public UpdateMaskingJobParameters onTheFlySourceConnectorPassword(String onTheFlySourceConnectorPassword) {
    
    this.onTheFlySourceConnectorPassword = onTheFlySourceConnectorPassword;
    return this;
  }

   /**
   * The password of the source Connector used by the on-the-fly MaskingJob.
   * @return onTheFlySourceConnectorPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "password123", value = "The password of the source Connector used by the on-the-fly MaskingJob.")

  public String getOnTheFlySourceConnectorPassword() {
    return onTheFlySourceConnectorPassword;
  }


  public void setOnTheFlySourceConnectorPassword(String onTheFlySourceConnectorPassword) {
    this.onTheFlySourceConnectorPassword = onTheFlySourceConnectorPassword;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMaskingJobParameters updateMaskingJobParameters = (UpdateMaskingJobParameters) o;
    return Objects.equals(this.name, updateMaskingJobParameters.name) &&
        Objects.equals(this.connectorUsername, updateMaskingJobParameters.connectorUsername) &&
        Objects.equals(this.connectorPassword, updateMaskingJobParameters.connectorPassword) &&
        Objects.equals(this.onTheFlySourceConnectorUsername, updateMaskingJobParameters.onTheFlySourceConnectorUsername) &&
        Objects.equals(this.onTheFlySourceConnectorPassword, updateMaskingJobParameters.onTheFlySourceConnectorPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, connectorUsername, connectorPassword, onTheFlySourceConnectorUsername, onTheFlySourceConnectorPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMaskingJobParameters {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    connectorUsername: ").append(toIndentedString(connectorUsername)).append("\n");
    sb.append("    connectorPassword: ").append(toIndentedString(connectorPassword)).append("\n");
    sb.append("    onTheFlySourceConnectorUsername: ").append(toIndentedString(onTheFlySourceConnectorUsername)).append("\n");
    sb.append("    onTheFlySourceConnectorPassword: ").append(toIndentedString(onTheFlySourceConnectorPassword)).append("\n");
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


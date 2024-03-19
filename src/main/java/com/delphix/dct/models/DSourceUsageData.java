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
 * DSourceUsageData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-19T17:08:49.349376+05:30[Asia/Kolkata]")
public class DSourceUsageData {
  public static final String SERIALIZED_NAME_ENGINE_NAME = "engine_name";
  @SerializedName(SERIALIZED_NAME_ENGINE_NAME)
  private String engineName;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_UNVIRTUALIZED_SPACE = "unvirtualized_space";
  @SerializedName(SERIALIZED_NAME_UNVIRTUALIZED_SPACE)
  private Long unvirtualizedSpace;

  public static final String SERIALIZED_NAME_ACTUAL_SPACE = "actual_space";
  @SerializedName(SERIALIZED_NAME_ACTUAL_SPACE)
  private Long actualSpace;

  public static final String SERIALIZED_NAME_DEPENDANT_VDBS = "dependant_vdbs";
  @SerializedName(SERIALIZED_NAME_DEPENDANT_VDBS)
  private Integer dependantVdbs;


  public DSourceUsageData engineName(String engineName) {
    
    this.engineName = engineName;
    return this;
  }

   /**
   * The name of the engine the dSource belongs to.
   * @return engineName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My favorite engine", value = "The name of the engine the dSource belongs to.")

  public String getEngineName() {
    return engineName;
  }


  public void setEngineName(String engineName) {
    this.engineName = engineName;
  }


  public DSourceUsageData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the dSource
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "prod01-main", value = "The name of the dSource")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DSourceUsageData unvirtualizedSpace(Long unvirtualizedSpace) {
    
    this.unvirtualizedSpace = unvirtualizedSpace;
    return this;
  }

   /**
   * The the disk space that would be required if not using Delphix virtualizion, in bytes.
   * @return unvirtualizedSpace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "109242677", value = "The the disk space that would be required if not using Delphix virtualizion, in bytes.")

  public Long getUnvirtualizedSpace() {
    return unvirtualizedSpace;
  }


  public void setUnvirtualizedSpace(Long unvirtualizedSpace) {
    this.unvirtualizedSpace = unvirtualizedSpace;
  }


  public DSourceUsageData actualSpace(Long actualSpace) {
    
    this.actualSpace = actualSpace;
    return this;
  }

   /**
   * The actual space used by this dSource, in bytes. This includes the disk space used by the current copy of the data as well as the snapshots and log files retained to enable provisioning from historical versions.
   * @return actualSpace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "339292672", value = "The actual space used by this dSource, in bytes. This includes the disk space used by the current copy of the data as well as the snapshots and log files retained to enable provisioning from historical versions.")

  public Long getActualSpace() {
    return actualSpace;
  }


  public void setActualSpace(Long actualSpace) {
    this.actualSpace = actualSpace;
  }


  public DSourceUsageData dependantVdbs(Integer dependantVdbs) {
    
    this.dependantVdbs = dependantVdbs;
    return this;
  }

   /**
   * The number of VDBs that are dependant on this dSource. This includes all VDB descendants that have this dSource as an ancestor.
   * @return dependantVdbs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "25", value = "The number of VDBs that are dependant on this dSource. This includes all VDB descendants that have this dSource as an ancestor.")

  public Integer getDependantVdbs() {
    return dependantVdbs;
  }


  public void setDependantVdbs(Integer dependantVdbs) {
    this.dependantVdbs = dependantVdbs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DSourceUsageData dsourceUsageData = (DSourceUsageData) o;
    return Objects.equals(this.engineName, dsourceUsageData.engineName) &&
        Objects.equals(this.name, dsourceUsageData.name) &&
        Objects.equals(this.unvirtualizedSpace, dsourceUsageData.unvirtualizedSpace) &&
        Objects.equals(this.actualSpace, dsourceUsageData.actualSpace) &&
        Objects.equals(this.dependantVdbs, dsourceUsageData.dependantVdbs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engineName, name, unvirtualizedSpace, actualSpace, dependantVdbs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSourceUsageData {\n");
    sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    unvirtualizedSpace: ").append(toIndentedString(unvirtualizedSpace)).append("\n");
    sb.append("    actualSpace: ").append(toIndentedString(actualSpace)).append("\n");
    sb.append("    dependantVdbs: ").append(toIndentedString(dependantVdbs)).append("\n");
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


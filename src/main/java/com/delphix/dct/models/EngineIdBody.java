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
 * The ID of the registered engine.
 */
@ApiModel(description = "The ID of the registered engine.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-19T18:53:50.335381+05:30[Asia/Kolkata]")
public class EngineIdBody {
  public static final String SERIALIZED_NAME_ENGINE_ID = "engine_id";
  @SerializedName(SERIALIZED_NAME_ENGINE_ID)
  private String engineId;


  public EngineIdBody engineId(String engineId) {
    
    this.engineId = engineId;
    return this;
  }

   /**
   * Get engineId
   * @return engineId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public String getEngineId() {
    return engineId;
  }


  public void setEngineId(String engineId) {
    this.engineId = engineId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EngineIdBody engineIdBody = (EngineIdBody) o;
    return Objects.equals(this.engineId, engineIdBody.engineId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engineId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EngineIdBody {\n");
    sb.append("    engineId: ").append(toIndentedString(engineId)).append("\n");
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


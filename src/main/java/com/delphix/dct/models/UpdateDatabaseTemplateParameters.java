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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters to update a Database Template.
 */
@ApiModel(description = "Parameters to update a Database Template.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-19T18:53:50.335381+05:30[Asia/Kolkata]")
public class UpdateDatabaseTemplateParameters {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * The type of the source associated with the template.
   */
  @JsonAdapter(SourceTypeEnum.Adapter.class)
  public enum SourceTypeEnum {
    ORACLEVIRTUALSOURCE("OracleVirtualSource"),
    
    ORACLELINKEDSOURCE("OracleLinkedSource"),
    
    MSSQLVIRTUALSOURCE("MSSqlVirtualSource"),
    
    MSSQLLINKEDSOURCE("MSSqlLinkedSource");

    private String value;

    SourceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SourceTypeEnum fromValue(String value) {
      for (SourceTypeEnum b : SourceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SourceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SourceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SourceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SourceTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SOURCE_TYPE = "source_type";
  @SerializedName(SERIALIZED_NAME_SOURCE_TYPE)
  private SourceTypeEnum sourceType;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private Map<String, String> parameters = null;


  public UpdateDatabaseTemplateParameters name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The DatabaseTemplate name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "template-name", value = "The DatabaseTemplate name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateDatabaseTemplateParameters description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * User provided description for this template.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Config params for prod01", value = "User provided description for this template.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public UpdateDatabaseTemplateParameters sourceType(SourceTypeEnum sourceType) {
    
    this.sourceType = sourceType;
    return this;
  }

   /**
   * The type of the source associated with the template.
   * @return sourceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OracleVirtualSource", value = "The type of the source associated with the template.")

  public SourceTypeEnum getSourceType() {
    return sourceType;
  }


  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }


  public UpdateDatabaseTemplateParameters parameters(Map<String, String> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public UpdateDatabaseTemplateParameters putParametersItem(String key, String parametersItem) {
    if (this.parameters == null) {
      this.parameters = new HashMap<String, String>();
    }
    this.parameters.put(key, parametersItem);
    return this;
  }

   /**
   * A name/value map of string configuration parameters.
   * @return parameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"configName1\":\"configValue1\",\"configName2\":\"configValue2\"}", value = "A name/value map of string configuration parameters.")

  public Map<String, String> getParameters() {
    return parameters;
  }


  public void setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDatabaseTemplateParameters updateDatabaseTemplateParameters = (UpdateDatabaseTemplateParameters) o;
    return Objects.equals(this.name, updateDatabaseTemplateParameters.name) &&
        Objects.equals(this.description, updateDatabaseTemplateParameters.description) &&
        Objects.equals(this.sourceType, updateDatabaseTemplateParameters.sourceType) &&
        Objects.equals(this.parameters, updateDatabaseTemplateParameters.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, sourceType, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDatabaseTemplateParameters {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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


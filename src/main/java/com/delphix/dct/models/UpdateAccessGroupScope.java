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
 * An Access group scope parameters that are allowed to update.
 */
@ApiModel(description = "An Access group scope parameters that are allowed to update.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-19T18:53:50.335381+05:30[Asia/Kolkata]")
public class UpdateAccessGroupScope {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Specifies the type of the scope. Scope of type SIMPLE would grant access to all DCT objects. Scope of type SCOPED would grant access to all objects based on objects and object-tags and permissions defined in linked role. Scope of type ADVANCED would grant access to DCT objects based on objects and object-tags and the individual permissions.
   */
  @JsonAdapter(ScopeTypeEnum.Adapter.class)
  public enum ScopeTypeEnum {
    SIMPLE("SIMPLE"),
    
    SCOPED("SCOPED"),
    
    ADVANCED("ADVANCED");

    private String value;

    ScopeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScopeTypeEnum fromValue(String value) {
      for (ScopeTypeEnum b : ScopeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ScopeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScopeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScopeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ScopeTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SCOPE_TYPE = "scope_type";
  @SerializedName(SERIALIZED_NAME_SCOPE_TYPE)
  private ScopeTypeEnum scopeType;


  public UpdateAccessGroupScope name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The Access group scope name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Access group scope name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateAccessGroupScope scopeType(ScopeTypeEnum scopeType) {
    
    this.scopeType = scopeType;
    return this;
  }

   /**
   * Specifies the type of the scope. Scope of type SIMPLE would grant access to all DCT objects. Scope of type SCOPED would grant access to all objects based on objects and object-tags and permissions defined in linked role. Scope of type ADVANCED would grant access to DCT objects based on objects and object-tags and the individual permissions.
   * @return scopeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SCOPED", value = "Specifies the type of the scope. Scope of type SIMPLE would grant access to all DCT objects. Scope of type SCOPED would grant access to all objects based on objects and object-tags and permissions defined in linked role. Scope of type ADVANCED would grant access to DCT objects based on objects and object-tags and the individual permissions.")

  public ScopeTypeEnum getScopeType() {
    return scopeType;
  }


  public void setScopeType(ScopeTypeEnum scopeType) {
    this.scopeType = scopeType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAccessGroupScope updateAccessGroupScope = (UpdateAccessGroupScope) o;
    return Objects.equals(this.name, updateAccessGroupScope.name) &&
        Objects.equals(this.scopeType, updateAccessGroupScope.scopeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, scopeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAccessGroupScope {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scopeType: ").append(toIndentedString(scopeType)).append("\n");
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


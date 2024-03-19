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
import com.delphix.dct.models.Tag;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A collection of virtual databases and datesets.
 */
@ApiModel(description = "A collection of virtual databases and datesets.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-19T17:08:49.349376+05:30[Asia/Kolkata]")
public class VDBGroup {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VDB_IDS = "vdb_ids";
  @SerializedName(SERIALIZED_NAME_VDB_IDS)
  private List<String> vdbIds = new ArrayList<String>();

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<Tag> tags = null;


   /**
   * A unique identifier for the entity.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "123", required = true, value = "A unique identifier for the entity.")

  public String getId() {
    return id;
  }




  public VDBGroup name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A unique name for the entity.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "my-first-vdb-group", required = true, value = "A unique name for the entity.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public VDBGroup vdbIds(List<String> vdbIds) {
    
    this.vdbIds = vdbIds;
    return this;
  }

  public VDBGroup addVdbIdsItem(String vdbIdsItem) {
    this.vdbIds.add(vdbIdsItem);
    return this;
  }

   /**
   * The list of VDB IDs in this VDBGroup.
   * @return vdbIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[\"vdb-123\",\"vdb-456\"]", required = true, value = "The list of VDB IDs in this VDBGroup.")

  public List<String> getVdbIds() {
    return vdbIds;
  }


  public void setVdbIds(List<String> vdbIds) {
    this.vdbIds = vdbIds;
  }


  public VDBGroup tags(List<Tag> tags) {
    
    this.tags = tags;
    return this;
  }

  public VDBGroup addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Tag> getTags() {
    return tags;
  }


  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VDBGroup vdBGroup = (VDBGroup) o;
    return Objects.equals(this.id, vdBGroup.id) &&
        Objects.equals(this.name, vdBGroup.name) &&
        Objects.equals(this.vdbIds, vdBGroup.vdbIds) &&
        Objects.equals(this.tags, vdBGroup.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, vdbIds, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VDBGroup {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    vdbIds: ").append(toIndentedString(vdbIds)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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


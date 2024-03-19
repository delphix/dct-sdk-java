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
import com.delphix.dct.models.BaseProvisionVDBParameters;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ProvisionVDBGroupFromBookmarkParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-19T17:08:49.349376+05:30[Asia/Kolkata]")
public class ProvisionVDBGroupFromBookmarkParameters {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_BOOKMARK_ID = "bookmark_id";
  @SerializedName(SERIALIZED_NAME_BOOKMARK_ID)
  private String bookmarkId;

  public static final String SERIALIZED_NAME_PROVISION_PARAMETERS = "provision_parameters";
  @SerializedName(SERIALIZED_NAME_PROVISION_PARAMETERS)
  private Map<String, BaseProvisionVDBParameters> provisionParameters = new HashMap<String, BaseProvisionVDBParameters>();

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<Tag> tags = null;

  public static final String SERIALIZED_NAME_MAKE_CURRENT_ACCOUNT_OWNER = "make_current_account_owner";
  @SerializedName(SERIALIZED_NAME_MAKE_CURRENT_ACCOUNT_OWNER)
  private Boolean makeCurrentAccountOwner = true;


  public ProvisionVDBGroupFromBookmarkParameters name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the created VDB group name.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the created VDB group name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ProvisionVDBGroupFromBookmarkParameters bookmarkId(String bookmarkId) {
    
    this.bookmarkId = bookmarkId;
    return this;
  }

   /**
   * ID of a bookmark to provision this VDB Group from.
   * @return bookmarkId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ID of a bookmark to provision this VDB Group from.")

  public String getBookmarkId() {
    return bookmarkId;
  }


  public void setBookmarkId(String bookmarkId) {
    this.bookmarkId = bookmarkId;
  }


  public ProvisionVDBGroupFromBookmarkParameters provisionParameters(Map<String, BaseProvisionVDBParameters> provisionParameters) {
    
    this.provisionParameters = provisionParameters;
    return this;
  }

  public ProvisionVDBGroupFromBookmarkParameters putProvisionParametersItem(String key, BaseProvisionVDBParameters provisionParametersItem) {
    this.provisionParameters.put(key, provisionParametersItem);
    return this;
  }

   /**
   * Provision parameters for each of the VDBs which will need to be provisioned. The key must be the vdb_id of the corresponding entry from the bookmark, and the value the provision parameters for the VDB which will be cloned from the bookmark.
   * @return provisionParameters
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Provision parameters for each of the VDBs which will need to be provisioned. The key must be the vdb_id of the corresponding entry from the bookmark, and the value the provision parameters for the VDB which will be cloned from the bookmark.")

  public Map<String, BaseProvisionVDBParameters> getProvisionParameters() {
    return provisionParameters;
  }


  public void setProvisionParameters(Map<String, BaseProvisionVDBParameters> provisionParameters) {
    this.provisionParameters = provisionParameters;
  }


  public ProvisionVDBGroupFromBookmarkParameters tags(List<Tag> tags) {
    
    this.tags = tags;
    return this;
  }

  public ProvisionVDBGroupFromBookmarkParameters addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The tags to be created for VDB Group.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tags to be created for VDB Group.")

  public List<Tag> getTags() {
    return tags;
  }


  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }


  public ProvisionVDBGroupFromBookmarkParameters makeCurrentAccountOwner(Boolean makeCurrentAccountOwner) {
    
    this.makeCurrentAccountOwner = makeCurrentAccountOwner;
    return this;
  }

   /**
   * Whether the account provisioning this VDB group must be configured as owner of the VDB group.
   * @return makeCurrentAccountOwner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the account provisioning this VDB group must be configured as owner of the VDB group.")

  public Boolean getMakeCurrentAccountOwner() {
    return makeCurrentAccountOwner;
  }


  public void setMakeCurrentAccountOwner(Boolean makeCurrentAccountOwner) {
    this.makeCurrentAccountOwner = makeCurrentAccountOwner;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvisionVDBGroupFromBookmarkParameters provisionVDBGroupFromBookmarkParameters = (ProvisionVDBGroupFromBookmarkParameters) o;
    return Objects.equals(this.name, provisionVDBGroupFromBookmarkParameters.name) &&
        Objects.equals(this.bookmarkId, provisionVDBGroupFromBookmarkParameters.bookmarkId) &&
        Objects.equals(this.provisionParameters, provisionVDBGroupFromBookmarkParameters.provisionParameters) &&
        Objects.equals(this.tags, provisionVDBGroupFromBookmarkParameters.tags) &&
        Objects.equals(this.makeCurrentAccountOwner, provisionVDBGroupFromBookmarkParameters.makeCurrentAccountOwner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, bookmarkId, provisionParameters, tags, makeCurrentAccountOwner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvisionVDBGroupFromBookmarkParameters {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bookmarkId: ").append(toIndentedString(bookmarkId)).append("\n");
    sb.append("    provisionParameters: ").append(toIndentedString(provisionParameters)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    makeCurrentAccountOwner: ").append(toIndentedString(makeCurrentAccountOwner)).append("\n");
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


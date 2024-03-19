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
import com.delphix.dct.models.SourceOperation;
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
 * BaseDSourceLinkSourceParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-19T17:08:49.349376+05:30[Asia/Kolkata]")
public class BaseDSourceLinkSourceParameters {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SOURCE_ID = "source_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private String sourceId;

  public static final String SERIALIZED_NAME_GROUP_ID = "group_id";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LOG_SYNC_ENABLED = "log_sync_enabled";
  @SerializedName(SERIALIZED_NAME_LOG_SYNC_ENABLED)
  private Boolean logSyncEnabled = false;

  public static final String SERIALIZED_NAME_EXTERNAL_FILE_PATH = "external_file_path";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_FILE_PATH)
  private String externalFilePath;

  public static final String SERIALIZED_NAME_MAKE_CURRENT_ACCOUNT_OWNER = "make_current_account_owner";
  @SerializedName(SERIALIZED_NAME_MAKE_CURRENT_ACCOUNT_OWNER)
  private Boolean makeCurrentAccountOwner = true;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<Tag> tags = null;

  public static final String SERIALIZED_NAME_OPS_PRE_SYNC = "ops_pre_sync";
  @SerializedName(SERIALIZED_NAME_OPS_PRE_SYNC)
  private List<SourceOperation> opsPreSync = null;

  public static final String SERIALIZED_NAME_OPS_POST_SYNC = "ops_post_sync";
  @SerializedName(SERIALIZED_NAME_OPS_POST_SYNC)
  private List<SourceOperation> opsPostSync = null;


  public BaseDSourceLinkSourceParameters name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the dSource to be created.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the dSource to be created.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public BaseDSourceLinkSourceParameters sourceId(String sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Id of the source to link.
   * @return sourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the source to link.")

  public String getSourceId() {
    return sourceId;
  }


  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  public BaseDSourceLinkSourceParameters groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Id of the dataset group where this dSource should belong to.
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the dataset group where this dSource should belong to.")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public BaseDSourceLinkSourceParameters description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The notes/description for the dSource.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The notes/description for the dSource.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public BaseDSourceLinkSourceParameters logSyncEnabled(Boolean logSyncEnabled) {
    
    this.logSyncEnabled = logSyncEnabled;
    return this;
  }

   /**
   * True if LogSync should run for this database.
   * @return logSyncEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if LogSync should run for this database.")

  public Boolean getLogSyncEnabled() {
    return logSyncEnabled;
  }


  public void setLogSyncEnabled(Boolean logSyncEnabled) {
    this.logSyncEnabled = logSyncEnabled;
  }


  public BaseDSourceLinkSourceParameters externalFilePath(String externalFilePath) {
    
    this.externalFilePath = externalFilePath;
    return this;
  }

   /**
   * External file path.
   * @return externalFilePath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "External file path.")

  public String getExternalFilePath() {
    return externalFilePath;
  }


  public void setExternalFilePath(String externalFilePath) {
    this.externalFilePath = externalFilePath;
  }


  public BaseDSourceLinkSourceParameters makeCurrentAccountOwner(Boolean makeCurrentAccountOwner) {
    
    this.makeCurrentAccountOwner = makeCurrentAccountOwner;
    return this;
  }

   /**
   * Whether the account creating this reporting schedule must be configured as owner of the reporting schedule.
   * @return makeCurrentAccountOwner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the account creating this reporting schedule must be configured as owner of the reporting schedule.")

  public Boolean getMakeCurrentAccountOwner() {
    return makeCurrentAccountOwner;
  }


  public void setMakeCurrentAccountOwner(Boolean makeCurrentAccountOwner) {
    this.makeCurrentAccountOwner = makeCurrentAccountOwner;
  }


  public BaseDSourceLinkSourceParameters tags(List<Tag> tags) {
    
    this.tags = tags;
    return this;
  }

  public BaseDSourceLinkSourceParameters addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The tags to be created for dSource.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tags to be created for dSource.")

  public List<Tag> getTags() {
    return tags;
  }


  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }


  public BaseDSourceLinkSourceParameters opsPreSync(List<SourceOperation> opsPreSync) {
    
    this.opsPreSync = opsPreSync;
    return this;
  }

  public BaseDSourceLinkSourceParameters addOpsPreSyncItem(SourceOperation opsPreSyncItem) {
    if (this.opsPreSync == null) {
      this.opsPreSync = new ArrayList<SourceOperation>();
    }
    this.opsPreSync.add(opsPreSyncItem);
    return this;
  }

   /**
   * Operations to perform before syncing the created dSource. These operations can quiesce any data prior to syncing.
   * @return opsPreSync
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Operations to perform before syncing the created dSource. These operations can quiesce any data prior to syncing.")

  public List<SourceOperation> getOpsPreSync() {
    return opsPreSync;
  }


  public void setOpsPreSync(List<SourceOperation> opsPreSync) {
    this.opsPreSync = opsPreSync;
  }


  public BaseDSourceLinkSourceParameters opsPostSync(List<SourceOperation> opsPostSync) {
    
    this.opsPostSync = opsPostSync;
    return this;
  }

  public BaseDSourceLinkSourceParameters addOpsPostSyncItem(SourceOperation opsPostSyncItem) {
    if (this.opsPostSync == null) {
      this.opsPostSync = new ArrayList<SourceOperation>();
    }
    this.opsPostSync.add(opsPostSyncItem);
    return this;
  }

   /**
   * Operations to perform after syncing a created dSource.
   * @return opsPostSync
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Operations to perform after syncing a created dSource.")

  public List<SourceOperation> getOpsPostSync() {
    return opsPostSync;
  }


  public void setOpsPostSync(List<SourceOperation> opsPostSync) {
    this.opsPostSync = opsPostSync;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseDSourceLinkSourceParameters baseDSourceLinkSourceParameters = (BaseDSourceLinkSourceParameters) o;
    return Objects.equals(this.name, baseDSourceLinkSourceParameters.name) &&
        Objects.equals(this.sourceId, baseDSourceLinkSourceParameters.sourceId) &&
        Objects.equals(this.groupId, baseDSourceLinkSourceParameters.groupId) &&
        Objects.equals(this.description, baseDSourceLinkSourceParameters.description) &&
        Objects.equals(this.logSyncEnabled, baseDSourceLinkSourceParameters.logSyncEnabled) &&
        Objects.equals(this.externalFilePath, baseDSourceLinkSourceParameters.externalFilePath) &&
        Objects.equals(this.makeCurrentAccountOwner, baseDSourceLinkSourceParameters.makeCurrentAccountOwner) &&
        Objects.equals(this.tags, baseDSourceLinkSourceParameters.tags) &&
        Objects.equals(this.opsPreSync, baseDSourceLinkSourceParameters.opsPreSync) &&
        Objects.equals(this.opsPostSync, baseDSourceLinkSourceParameters.opsPostSync);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sourceId, groupId, description, logSyncEnabled, externalFilePath, makeCurrentAccountOwner, tags, opsPreSync, opsPostSync);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseDSourceLinkSourceParameters {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    logSyncEnabled: ").append(toIndentedString(logSyncEnabled)).append("\n");
    sb.append("    externalFilePath: ").append(toIndentedString(externalFilePath)).append("\n");
    sb.append("    makeCurrentAccountOwner: ").append(toIndentedString(makeCurrentAccountOwner)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    opsPreSync: ").append(toIndentedString(opsPreSync)).append("\n");
    sb.append("    opsPostSync: ").append(toIndentedString(opsPostSync)).append("\n");
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


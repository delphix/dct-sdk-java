/*
 * Delphix DCT API
 * Delphix DCT API
 *
 * The version of the OpenAPI document: 3.10.0
 * Contact: support@delphix.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.delphix.dct.models;

import java.util.Objects;
import com.delphix.dct.models.SourceOperation;
import com.delphix.dct.models.Tag;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.delphix.dct.JSON;

/**
 * AppDataDSourceLinkSourceParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class AppDataDSourceLinkSourceParameters {
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

  public static final String SERIALIZED_NAME_SYNC_POLICY_ID = "sync_policy_id";
  @SerializedName(SERIALIZED_NAME_SYNC_POLICY_ID)
  private String syncPolicyId;

  public static final String SERIALIZED_NAME_RETENTION_POLICY_ID = "retention_policy_id";
  @SerializedName(SERIALIZED_NAME_RETENTION_POLICY_ID)
  private String retentionPolicyId;

  public static final String SERIALIZED_NAME_MAKE_CURRENT_ACCOUNT_OWNER = "make_current_account_owner";
  @SerializedName(SERIALIZED_NAME_MAKE_CURRENT_ACCOUNT_OWNER)
  private Boolean makeCurrentAccountOwner = true;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<Tag> tags;

  public static final String SERIALIZED_NAME_OPS_PRE_SYNC = "ops_pre_sync";
  @SerializedName(SERIALIZED_NAME_OPS_PRE_SYNC)
  private List<SourceOperation> opsPreSync;

  public static final String SERIALIZED_NAME_OPS_POST_SYNC = "ops_post_sync";
  @SerializedName(SERIALIZED_NAME_OPS_POST_SYNC)
  private List<SourceOperation> opsPostSync;

  /**
   * The type of link to create. Default is AppDataDirect. * &#x60;AppDataDirect&#x60; - Represents the AppData specific parameters of a link request for a source directly replicated into the Delphix Engine. * &#x60;AppDataStaged&#x60; - Represents the AppData specific parameters of a link request for a source with a staging source. 
   */
  @JsonAdapter(LinkTypeEnum.Adapter.class)
  public enum LinkTypeEnum {
    APPDATADIRECT("AppDataDirect"),
    
    APPDATASTAGED("AppDataStaged");

    private String value;

    LinkTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LinkTypeEnum fromValue(String value) {
      for (LinkTypeEnum b : LinkTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LinkTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LinkTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LinkTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LinkTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      LinkTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_LINK_TYPE = "link_type";
  @SerializedName(SERIALIZED_NAME_LINK_TYPE)
  private LinkTypeEnum linkType = LinkTypeEnum.APPDATADIRECT;

  public static final String SERIALIZED_NAME_STAGING_MOUNT_BASE = "staging_mount_base";
  @SerializedName(SERIALIZED_NAME_STAGING_MOUNT_BASE)
  private String stagingMountBase;

  public static final String SERIALIZED_NAME_STAGING_ENVIRONMENT = "staging_environment";
  @SerializedName(SERIALIZED_NAME_STAGING_ENVIRONMENT)
  private String stagingEnvironment;

  public static final String SERIALIZED_NAME_STAGING_ENVIRONMENT_USER = "staging_environment_user";
  @SerializedName(SERIALIZED_NAME_STAGING_ENVIRONMENT_USER)
  private String stagingEnvironmentUser;

  public static final String SERIALIZED_NAME_ENVIRONMENT_USER = "environment_user";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_USER)
  private String environmentUser;

  public static final String SERIALIZED_NAME_EXCLUDES = "excludes";
  @SerializedName(SERIALIZED_NAME_EXCLUDES)
  private List<String> excludes;

  public static final String SERIALIZED_NAME_FOLLOW_SYMLINKS = "follow_symlinks";
  @SerializedName(SERIALIZED_NAME_FOLLOW_SYMLINKS)
  private List<String> followSymlinks;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private Map<String, Object> parameters = new HashMap<>();

  public static final String SERIALIZED_NAME_SYNC_PARAMETERS = "sync_parameters";
  @SerializedName(SERIALIZED_NAME_SYNC_PARAMETERS)
  private Map<String, Object> syncParameters = new HashMap<>();

  public AppDataDSourceLinkSourceParameters() {
  }

  public AppDataDSourceLinkSourceParameters name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the dSource to be created.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AppDataDSourceLinkSourceParameters sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Id of the source to link.
   * @return sourceId
  **/
  @javax.annotation.Nullable
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  public AppDataDSourceLinkSourceParameters groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Id of the dataset group where this dSource should belong to.
   * @return groupId
  **/
  @javax.annotation.Nullable
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public AppDataDSourceLinkSourceParameters description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The notes/description for the dSource.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public AppDataDSourceLinkSourceParameters logSyncEnabled(Boolean logSyncEnabled) {
    this.logSyncEnabled = logSyncEnabled;
    return this;
  }

   /**
   * True if LogSync should run for this database.
   * @return logSyncEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getLogSyncEnabled() {
    return logSyncEnabled;
  }

  public void setLogSyncEnabled(Boolean logSyncEnabled) {
    this.logSyncEnabled = logSyncEnabled;
  }


  public AppDataDSourceLinkSourceParameters syncPolicyId(String syncPolicyId) {
    this.syncPolicyId = syncPolicyId;
    return this;
  }

   /**
   * The ID of the SnapSync policy for the dSource.
   * @return syncPolicyId
  **/
  @javax.annotation.Nullable
  public String getSyncPolicyId() {
    return syncPolicyId;
  }

  public void setSyncPolicyId(String syncPolicyId) {
    this.syncPolicyId = syncPolicyId;
  }


  public AppDataDSourceLinkSourceParameters retentionPolicyId(String retentionPolicyId) {
    this.retentionPolicyId = retentionPolicyId;
    return this;
  }

   /**
   * The ID of the Retention policy for the dSource.
   * @return retentionPolicyId
  **/
  @javax.annotation.Nullable
  public String getRetentionPolicyId() {
    return retentionPolicyId;
  }

  public void setRetentionPolicyId(String retentionPolicyId) {
    this.retentionPolicyId = retentionPolicyId;
  }


  public AppDataDSourceLinkSourceParameters makeCurrentAccountOwner(Boolean makeCurrentAccountOwner) {
    this.makeCurrentAccountOwner = makeCurrentAccountOwner;
    return this;
  }

   /**
   * Whether the account creating this reporting schedule must be configured as owner of the reporting schedule.
   * @return makeCurrentAccountOwner
  **/
  @javax.annotation.Nullable
  public Boolean getMakeCurrentAccountOwner() {
    return makeCurrentAccountOwner;
  }

  public void setMakeCurrentAccountOwner(Boolean makeCurrentAccountOwner) {
    this.makeCurrentAccountOwner = makeCurrentAccountOwner;
  }


  public AppDataDSourceLinkSourceParameters tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public AppDataDSourceLinkSourceParameters addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The tags to be created for dSource.
   * @return tags
  **/
  @javax.annotation.Nullable
  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }


  public AppDataDSourceLinkSourceParameters opsPreSync(List<SourceOperation> opsPreSync) {
    this.opsPreSync = opsPreSync;
    return this;
  }

  public AppDataDSourceLinkSourceParameters addOpsPreSyncItem(SourceOperation opsPreSyncItem) {
    if (this.opsPreSync == null) {
      this.opsPreSync = new ArrayList<>();
    }
    this.opsPreSync.add(opsPreSyncItem);
    return this;
  }

   /**
   * Operations to perform before syncing the created dSource. These operations can quiesce any data prior to syncing.
   * @return opsPreSync
  **/
  @javax.annotation.Nullable
  public List<SourceOperation> getOpsPreSync() {
    return opsPreSync;
  }

  public void setOpsPreSync(List<SourceOperation> opsPreSync) {
    this.opsPreSync = opsPreSync;
  }


  public AppDataDSourceLinkSourceParameters opsPostSync(List<SourceOperation> opsPostSync) {
    this.opsPostSync = opsPostSync;
    return this;
  }

  public AppDataDSourceLinkSourceParameters addOpsPostSyncItem(SourceOperation opsPostSyncItem) {
    if (this.opsPostSync == null) {
      this.opsPostSync = new ArrayList<>();
    }
    this.opsPostSync.add(opsPostSyncItem);
    return this;
  }

   /**
   * Operations to perform after syncing a created dSource.
   * @return opsPostSync
  **/
  @javax.annotation.Nullable
  public List<SourceOperation> getOpsPostSync() {
    return opsPostSync;
  }

  public void setOpsPostSync(List<SourceOperation> opsPostSync) {
    this.opsPostSync = opsPostSync;
  }


  public AppDataDSourceLinkSourceParameters linkType(LinkTypeEnum linkType) {
    this.linkType = linkType;
    return this;
  }

   /**
   * The type of link to create. Default is AppDataDirect. * &#x60;AppDataDirect&#x60; - Represents the AppData specific parameters of a link request for a source directly replicated into the Delphix Engine. * &#x60;AppDataStaged&#x60; - Represents the AppData specific parameters of a link request for a source with a staging source. 
   * @return linkType
  **/
  @javax.annotation.Nullable
  public LinkTypeEnum getLinkType() {
    return linkType;
  }

  public void setLinkType(LinkTypeEnum linkType) {
    this.linkType = linkType;
  }


  public AppDataDSourceLinkSourceParameters stagingMountBase(String stagingMountBase) {
    this.stagingMountBase = stagingMountBase;
    return this;
  }

   /**
   * The base mount point for the NFS mount on the staging environment [AppDataStaged only].
   * @return stagingMountBase
  **/
  @javax.annotation.Nullable
  public String getStagingMountBase() {
    return stagingMountBase;
  }

  public void setStagingMountBase(String stagingMountBase) {
    this.stagingMountBase = stagingMountBase;
  }


  public AppDataDSourceLinkSourceParameters stagingEnvironment(String stagingEnvironment) {
    this.stagingEnvironment = stagingEnvironment;
    return this;
  }

   /**
   * The environment used as an intermediate stage to pull data into Delphix [AppDataStaged only].
   * @return stagingEnvironment
  **/
  @javax.annotation.Nullable
  public String getStagingEnvironment() {
    return stagingEnvironment;
  }

  public void setStagingEnvironment(String stagingEnvironment) {
    this.stagingEnvironment = stagingEnvironment;
  }


  public AppDataDSourceLinkSourceParameters stagingEnvironmentUser(String stagingEnvironmentUser) {
    this.stagingEnvironmentUser = stagingEnvironmentUser;
    return this;
  }

   /**
   * The environment user used to access the staging environment [AppDataStaged only].
   * @return stagingEnvironmentUser
  **/
  @javax.annotation.Nullable
  public String getStagingEnvironmentUser() {
    return stagingEnvironmentUser;
  }

  public void setStagingEnvironmentUser(String stagingEnvironmentUser) {
    this.stagingEnvironmentUser = stagingEnvironmentUser;
  }


  public AppDataDSourceLinkSourceParameters environmentUser(String environmentUser) {
    this.environmentUser = environmentUser;
    return this;
  }

   /**
   * The OS user to use for linking.
   * @return environmentUser
  **/
  @javax.annotation.Nonnull
  public String getEnvironmentUser() {
    return environmentUser;
  }

  public void setEnvironmentUser(String environmentUser) {
    this.environmentUser = environmentUser;
  }


  public AppDataDSourceLinkSourceParameters excludes(List<String> excludes) {
    this.excludes = excludes;
    return this;
  }

  public AppDataDSourceLinkSourceParameters addExcludesItem(String excludesItem) {
    if (this.excludes == null) {
      this.excludes = new ArrayList<>();
    }
    this.excludes.add(excludesItem);
    return this;
  }

   /**
   * List of subdirectories in the source to exclude when syncing data. These paths are relative to the root of the source directory. [AppDataDirect only]
   * @return excludes
  **/
  @javax.annotation.Nullable
  public List<String> getExcludes() {
    return excludes;
  }

  public void setExcludes(List<String> excludes) {
    this.excludes = excludes;
  }


  public AppDataDSourceLinkSourceParameters followSymlinks(List<String> followSymlinks) {
    this.followSymlinks = followSymlinks;
    return this;
  }

  public AppDataDSourceLinkSourceParameters addFollowSymlinksItem(String followSymlinksItem) {
    if (this.followSymlinks == null) {
      this.followSymlinks = new ArrayList<>();
    }
    this.followSymlinks.add(followSymlinksItem);
    return this;
  }

   /**
   * List of symlinks in the source to follow when syncing data. These paths are relative to the root of the source directory. All other symlinks are preserved. [AppDataDirect only]
   * @return followSymlinks
  **/
  @javax.annotation.Nullable
  public List<String> getFollowSymlinks() {
    return followSymlinks;
  }

  public void setFollowSymlinks(List<String> followSymlinks) {
    this.followSymlinks = followSymlinks;
  }


  public AppDataDSourceLinkSourceParameters parameters(Map<String, Object> parameters) {
    this.parameters = parameters;
    return this;
  }

  public AppDataDSourceLinkSourceParameters putParametersItem(String key, Object parametersItem) {
    if (this.parameters == null) {
      this.parameters = new HashMap<>();
    }
    this.parameters.put(key, parametersItem);
    return this;
  }

   /**
   * The JSON payload conforming to the DraftV4 schema based on the type of application data being manipulated.
   * @return parameters
  **/
  @javax.annotation.Nonnull
  public Map<String, Object> getParameters() {
    return parameters;
  }

  public void setParameters(Map<String, Object> parameters) {
    this.parameters = parameters;
  }


  public AppDataDSourceLinkSourceParameters syncParameters(Map<String, Object> syncParameters) {
    this.syncParameters = syncParameters;
    return this;
  }

  public AppDataDSourceLinkSourceParameters putSyncParametersItem(String key, Object syncParametersItem) {
    if (this.syncParameters == null) {
      this.syncParameters = new HashMap<>();
    }
    this.syncParameters.put(key, syncParametersItem);
    return this;
  }

   /**
   * The JSON payload conforming to the snapshot parameters definition in a LUA toolkit or platform plugin.
   * @return syncParameters
  **/
  @javax.annotation.Nonnull
  public Map<String, Object> getSyncParameters() {
    return syncParameters;
  }

  public void setSyncParameters(Map<String, Object> syncParameters) {
    this.syncParameters = syncParameters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppDataDSourceLinkSourceParameters appDataDSourceLinkSourceParameters = (AppDataDSourceLinkSourceParameters) o;
    return Objects.equals(this.name, appDataDSourceLinkSourceParameters.name) &&
        Objects.equals(this.sourceId, appDataDSourceLinkSourceParameters.sourceId) &&
        Objects.equals(this.groupId, appDataDSourceLinkSourceParameters.groupId) &&
        Objects.equals(this.description, appDataDSourceLinkSourceParameters.description) &&
        Objects.equals(this.logSyncEnabled, appDataDSourceLinkSourceParameters.logSyncEnabled) &&
        Objects.equals(this.syncPolicyId, appDataDSourceLinkSourceParameters.syncPolicyId) &&
        Objects.equals(this.retentionPolicyId, appDataDSourceLinkSourceParameters.retentionPolicyId) &&
        Objects.equals(this.makeCurrentAccountOwner, appDataDSourceLinkSourceParameters.makeCurrentAccountOwner) &&
        Objects.equals(this.tags, appDataDSourceLinkSourceParameters.tags) &&
        Objects.equals(this.opsPreSync, appDataDSourceLinkSourceParameters.opsPreSync) &&
        Objects.equals(this.opsPostSync, appDataDSourceLinkSourceParameters.opsPostSync) &&
        Objects.equals(this.linkType, appDataDSourceLinkSourceParameters.linkType) &&
        Objects.equals(this.stagingMountBase, appDataDSourceLinkSourceParameters.stagingMountBase) &&
        Objects.equals(this.stagingEnvironment, appDataDSourceLinkSourceParameters.stagingEnvironment) &&
        Objects.equals(this.stagingEnvironmentUser, appDataDSourceLinkSourceParameters.stagingEnvironmentUser) &&
        Objects.equals(this.environmentUser, appDataDSourceLinkSourceParameters.environmentUser) &&
        Objects.equals(this.excludes, appDataDSourceLinkSourceParameters.excludes) &&
        Objects.equals(this.followSymlinks, appDataDSourceLinkSourceParameters.followSymlinks) &&
        Objects.equals(this.parameters, appDataDSourceLinkSourceParameters.parameters) &&
        Objects.equals(this.syncParameters, appDataDSourceLinkSourceParameters.syncParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sourceId, groupId, description, logSyncEnabled, syncPolicyId, retentionPolicyId, makeCurrentAccountOwner, tags, opsPreSync, opsPostSync, linkType, stagingMountBase, stagingEnvironment, stagingEnvironmentUser, environmentUser, excludes, followSymlinks, parameters, syncParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppDataDSourceLinkSourceParameters {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    logSyncEnabled: ").append(toIndentedString(logSyncEnabled)).append("\n");
    sb.append("    syncPolicyId: ").append(toIndentedString(syncPolicyId)).append("\n");
    sb.append("    retentionPolicyId: ").append(toIndentedString(retentionPolicyId)).append("\n");
    sb.append("    makeCurrentAccountOwner: ").append(toIndentedString(makeCurrentAccountOwner)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    opsPreSync: ").append(toIndentedString(opsPreSync)).append("\n");
    sb.append("    opsPostSync: ").append(toIndentedString(opsPostSync)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    stagingMountBase: ").append(toIndentedString(stagingMountBase)).append("\n");
    sb.append("    stagingEnvironment: ").append(toIndentedString(stagingEnvironment)).append("\n");
    sb.append("    stagingEnvironmentUser: ").append(toIndentedString(stagingEnvironmentUser)).append("\n");
    sb.append("    environmentUser: ").append(toIndentedString(environmentUser)).append("\n");
    sb.append("    excludes: ").append(toIndentedString(excludes)).append("\n");
    sb.append("    followSymlinks: ").append(toIndentedString(followSymlinks)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    syncParameters: ").append(toIndentedString(syncParameters)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("name");
    openapiFields.add("source_id");
    openapiFields.add("group_id");
    openapiFields.add("description");
    openapiFields.add("log_sync_enabled");
    openapiFields.add("sync_policy_id");
    openapiFields.add("retention_policy_id");
    openapiFields.add("make_current_account_owner");
    openapiFields.add("tags");
    openapiFields.add("ops_pre_sync");
    openapiFields.add("ops_post_sync");
    openapiFields.add("link_type");
    openapiFields.add("staging_mount_base");
    openapiFields.add("staging_environment");
    openapiFields.add("staging_environment_user");
    openapiFields.add("environment_user");
    openapiFields.add("excludes");
    openapiFields.add("follow_symlinks");
    openapiFields.add("parameters");
    openapiFields.add("sync_parameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("environment_user");
    openapiRequiredFields.add("parameters");
    openapiRequiredFields.add("sync_parameters");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AppDataDSourceLinkSourceParameters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AppDataDSourceLinkSourceParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppDataDSourceLinkSourceParameters is not found in the empty JSON string", AppDataDSourceLinkSourceParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AppDataDSourceLinkSourceParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppDataDSourceLinkSourceParameters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AppDataDSourceLinkSourceParameters.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("source_id") != null && !jsonObj.get("source_id").isJsonNull()) && !jsonObj.get("source_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_id").toString()));
      }
      if ((jsonObj.get("group_id") != null && !jsonObj.get("group_id").isJsonNull()) && !jsonObj.get("group_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group_id").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("sync_policy_id") != null && !jsonObj.get("sync_policy_id").isJsonNull()) && !jsonObj.get("sync_policy_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sync_policy_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sync_policy_id").toString()));
      }
      if ((jsonObj.get("retention_policy_id") != null && !jsonObj.get("retention_policy_id").isJsonNull()) && !jsonObj.get("retention_policy_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `retention_policy_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("retention_policy_id").toString()));
      }
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
        if (jsonArraytags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
          }

          // validate the optional field `tags` (array)
          for (int i = 0; i < jsonArraytags.size(); i++) {
            Tag.validateJsonElement(jsonArraytags.get(i));
          };
        }
      }
      if (jsonObj.get("ops_pre_sync") != null && !jsonObj.get("ops_pre_sync").isJsonNull()) {
        JsonArray jsonArrayopsPreSync = jsonObj.getAsJsonArray("ops_pre_sync");
        if (jsonArrayopsPreSync != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ops_pre_sync").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ops_pre_sync` to be an array in the JSON string but got `%s`", jsonObj.get("ops_pre_sync").toString()));
          }

          // validate the optional field `ops_pre_sync` (array)
          for (int i = 0; i < jsonArrayopsPreSync.size(); i++) {
            SourceOperation.validateJsonElement(jsonArrayopsPreSync.get(i));
          };
        }
      }
      if (jsonObj.get("ops_post_sync") != null && !jsonObj.get("ops_post_sync").isJsonNull()) {
        JsonArray jsonArrayopsPostSync = jsonObj.getAsJsonArray("ops_post_sync");
        if (jsonArrayopsPostSync != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ops_post_sync").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ops_post_sync` to be an array in the JSON string but got `%s`", jsonObj.get("ops_post_sync").toString()));
          }

          // validate the optional field `ops_post_sync` (array)
          for (int i = 0; i < jsonArrayopsPostSync.size(); i++) {
            SourceOperation.validateJsonElement(jsonArrayopsPostSync.get(i));
          };
        }
      }
      if ((jsonObj.get("link_type") != null && !jsonObj.get("link_type").isJsonNull()) && !jsonObj.get("link_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link_type").toString()));
      }
      // validate the optional field `link_type`
      if (jsonObj.get("link_type") != null && !jsonObj.get("link_type").isJsonNull()) {
        LinkTypeEnum.validateJsonElement(jsonObj.get("link_type"));
      }
      if ((jsonObj.get("staging_mount_base") != null && !jsonObj.get("staging_mount_base").isJsonNull()) && !jsonObj.get("staging_mount_base").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `staging_mount_base` to be a primitive type in the JSON string but got `%s`", jsonObj.get("staging_mount_base").toString()));
      }
      if ((jsonObj.get("staging_environment") != null && !jsonObj.get("staging_environment").isJsonNull()) && !jsonObj.get("staging_environment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `staging_environment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("staging_environment").toString()));
      }
      if ((jsonObj.get("staging_environment_user") != null && !jsonObj.get("staging_environment_user").isJsonNull()) && !jsonObj.get("staging_environment_user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `staging_environment_user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("staging_environment_user").toString()));
      }
      if (!jsonObj.get("environment_user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environment_user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environment_user").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("excludes") != null && !jsonObj.get("excludes").isJsonNull() && !jsonObj.get("excludes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `excludes` to be an array in the JSON string but got `%s`", jsonObj.get("excludes").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("follow_symlinks") != null && !jsonObj.get("follow_symlinks").isJsonNull() && !jsonObj.get("follow_symlinks").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `follow_symlinks` to be an array in the JSON string but got `%s`", jsonObj.get("follow_symlinks").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppDataDSourceLinkSourceParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppDataDSourceLinkSourceParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppDataDSourceLinkSourceParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppDataDSourceLinkSourceParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<AppDataDSourceLinkSourceParameters>() {
           @Override
           public void write(JsonWriter out, AppDataDSourceLinkSourceParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppDataDSourceLinkSourceParameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AppDataDSourceLinkSourceParameters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppDataDSourceLinkSourceParameters
  * @throws IOException if the JSON string is invalid with respect to AppDataDSourceLinkSourceParameters
  */
  public static AppDataDSourceLinkSourceParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppDataDSourceLinkSourceParameters.class);
  }

 /**
  * Convert an instance of AppDataDSourceLinkSourceParameters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


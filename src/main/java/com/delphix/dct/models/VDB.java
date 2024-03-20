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
import com.delphix.dct.models.AdditionalMountPoint;
import com.delphix.dct.models.Tag;
import com.delphix.dct.models.VirtualDatasetHooks;
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
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * A Delphix virtual database or dataset.
 */
@ApiModel(description = "A Delphix virtual database or dataset.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-19T18:53:50.335381+05:30[Asia/Kolkata]")
public class VDB {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DATABASE_TYPE = "database_type";
  @SerializedName(SERIALIZED_NAME_DATABASE_TYPE)
  private String databaseType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DATABASE_VERSION = "database_version";
  @SerializedName(SERIALIZED_NAME_DATABASE_VERSION)
  private String databaseVersion;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_STORAGE_SIZE = "storage_size";
  @SerializedName(SERIALIZED_NAME_STORAGE_SIZE)
  private Long storageSize;

  public static final String SERIALIZED_NAME_ENGINE_ID = "engine_id";
  @SerializedName(SERIALIZED_NAME_ENGINE_ID)
  private String engineId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_MASKED = "masked";
  @SerializedName(SERIALIZED_NAME_MASKED)
  private Boolean masked;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "content_type";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_PARENT_TIMEFLOW_TIMESTAMP = "parent_timeflow_timestamp";
  @SerializedName(SERIALIZED_NAME_PARENT_TIMEFLOW_TIMESTAMP)
  private OffsetDateTime parentTimeflowTimestamp;

  public static final String SERIALIZED_NAME_PARENT_TIMEFLOW_TIMEZONE = "parent_timeflow_timezone";
  @SerializedName(SERIALIZED_NAME_PARENT_TIMEFLOW_TIMEZONE)
  private String parentTimeflowTimezone;

  public static final String SERIALIZED_NAME_ENVIRONMENT_ID = "environment_id";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_ID)
  private String environmentId;

  public static final String SERIALIZED_NAME_IP_ADDRESS = "ip_address";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_FQDN = "fqdn";
  @SerializedName(SERIALIZED_NAME_FQDN)
  private String fqdn;

  public static final String SERIALIZED_NAME_PARENT_ID = "parent_id";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private String parentId;

  public static final String SERIALIZED_NAME_PARENT_DSOURCE_ID = "parent_dsource_id";
  @SerializedName(SERIALIZED_NAME_PARENT_DSOURCE_ID)
  private String parentDsourceId;

  public static final String SERIALIZED_NAME_GROUP_NAME = "group_name";
  @SerializedName(SERIALIZED_NAME_GROUP_NAME)
  private String groupName;

  public static final String SERIALIZED_NAME_ENGINE_NAME = "engine_name";
  @SerializedName(SERIALIZED_NAME_ENGINE_NAME)
  private String engineName;

  public static final String SERIALIZED_NAME_CDB_ID = "cdb_id";
  @SerializedName(SERIALIZED_NAME_CDB_ID)
  private String cdbId;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<Tag> tags = null;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creation_date";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_HOOKS = "hooks";
  @SerializedName(SERIALIZED_NAME_HOOKS)
  private VirtualDatasetHooks hooks;

  public static final String SERIALIZED_NAME_APPDATA_SOURCE_PARAMS = "appdata_source_params";
  @SerializedName(SERIALIZED_NAME_APPDATA_SOURCE_PARAMS)
  private Map<String, Object> appdataSourceParams = null;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

  public static final String SERIALIZED_NAME_CONFIG_PARAMS = "config_params";
  @SerializedName(SERIALIZED_NAME_CONFIG_PARAMS)
  private Map<String, Object> configParams = null;

  public static final String SERIALIZED_NAME_ADDITIONAL_MOUNT_POINTS = "additional_mount_points";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_MOUNT_POINTS)
  private List<AdditionalMountPoint> additionalMountPoints = null;

  public static final String SERIALIZED_NAME_APPDATA_CONFIG_PARAMS = "appdata_config_params";
  @SerializedName(SERIALIZED_NAME_APPDATA_CONFIG_PARAMS)
  private Map<String, Object> appdataConfigParams = null;

  public static final String SERIALIZED_NAME_MOUNT_POINT = "mount_point";
  @SerializedName(SERIALIZED_NAME_MOUNT_POINT)
  private String mountPoint;

  public static final String SERIALIZED_NAME_CURRENT_TIMEFLOW_ID = "current_timeflow_id";
  @SerializedName(SERIALIZED_NAME_CURRENT_TIMEFLOW_ID)
  private String currentTimeflowId;

  public static final String SERIALIZED_NAME_PREVIOUS_TIMEFLOW_ID = "previous_timeflow_id";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_TIMEFLOW_ID)
  private String previousTimeflowId;

  public static final String SERIALIZED_NAME_LAST_REFRESHED_DATE = "last_refreshed_date";
  @SerializedName(SERIALIZED_NAME_LAST_REFRESHED_DATE)
  private OffsetDateTime lastRefreshedDate;


  public VDB id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The VDB object entity ID.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The VDB object entity ID.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public VDB databaseType(String databaseType) {
    
    this.databaseType = databaseType;
    return this;
  }

   /**
   * The database type of this VDB.
   * @return databaseType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The database type of this VDB.")

  public String getDatabaseType() {
    return databaseType;
  }


  public void setDatabaseType(String databaseType) {
    this.databaseType = databaseType;
  }


  public VDB name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The container name of this VDB.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The container name of this VDB.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public VDB databaseVersion(String databaseVersion) {
    
    this.databaseVersion = databaseVersion;
    return this;
  }

   /**
   * The database version of this VDB.
   * @return databaseVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The database version of this VDB.")

  public String getDatabaseVersion() {
    return databaseVersion;
  }


  public void setDatabaseVersion(String databaseVersion) {
    this.databaseVersion = databaseVersion;
  }


  public VDB size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * The total size of this VDB, in bytes.
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total size of this VDB, in bytes.")

  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  public VDB storageSize(Long storageSize) {
    
    this.storageSize = storageSize;
    return this;
  }

   /**
   * The actual space used by this VDB, in bytes.
   * @return storageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The actual space used by this VDB, in bytes.")

  public Long getStorageSize() {
    return storageSize;
  }


  public void setStorageSize(Long storageSize) {
    this.storageSize = storageSize;
  }


  public VDB engineId(String engineId) {
    
    this.engineId = engineId;
    return this;
  }

   /**
   * A reference to the Engine that this VDB belongs to.
   * @return engineId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A reference to the Engine that this VDB belongs to.")

  public String getEngineId() {
    return engineId;
  }


  public void setEngineId(String engineId) {
    this.engineId = engineId;
  }


  public VDB status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The runtime status of the VDB. &#39;Unknown&#39; if all attempts to connect to the dataset failed.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The runtime status of the VDB. 'Unknown' if all attempts to connect to the dataset failed.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public VDB masked(Boolean masked) {
    
    this.masked = masked;
    return this;
  }

   /**
   * The VDB is masked or not.
   * @return masked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The VDB is masked or not.")

  public Boolean getMasked() {
    return masked;
  }


  public void setMasked(Boolean masked) {
    this.masked = masked;
  }


  public VDB contentType(String contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * The content type of the vdb.
   * @return contentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The content type of the vdb.")

  public String getContentType() {
    return contentType;
  }


  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public VDB parentTimeflowTimestamp(OffsetDateTime parentTimeflowTimestamp) {
    
    this.parentTimeflowTimestamp = parentTimeflowTimestamp;
    return this;
  }

   /**
   * The timestamp for parent timeflow.
   * @return parentTimeflowTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp for parent timeflow.")

  public OffsetDateTime getParentTimeflowTimestamp() {
    return parentTimeflowTimestamp;
  }


  public void setParentTimeflowTimestamp(OffsetDateTime parentTimeflowTimestamp) {
    this.parentTimeflowTimestamp = parentTimeflowTimestamp;
  }


  public VDB parentTimeflowTimezone(String parentTimeflowTimezone) {
    
    this.parentTimeflowTimezone = parentTimeflowTimezone;
    return this;
  }

   /**
   * The timezone for parent timeflow.
   * @return parentTimeflowTimezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timezone for parent timeflow.")

  public String getParentTimeflowTimezone() {
    return parentTimeflowTimezone;
  }


  public void setParentTimeflowTimezone(String parentTimeflowTimezone) {
    this.parentTimeflowTimezone = parentTimeflowTimezone;
  }


  public VDB environmentId(String environmentId) {
    
    this.environmentId = environmentId;
    return this;
  }

   /**
   * A reference to the Environment that hosts this VDB.
   * @return environmentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A reference to the Environment that hosts this VDB.")

  public String getEnvironmentId() {
    return environmentId;
  }


  public void setEnvironmentId(String environmentId) {
    this.environmentId = environmentId;
  }


  public VDB ipAddress(String ipAddress) {
    
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * The IP address of the VDB&#39;s host.
   * @return ipAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IP address of the VDB's host.")

  public String getIpAddress() {
    return ipAddress;
  }


  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public VDB fqdn(String fqdn) {
    
    this.fqdn = fqdn;
    return this;
  }

   /**
   * The FQDN of the VDB&#39;s host.
   * @return fqdn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The FQDN of the VDB's host.")

  public String getFqdn() {
    return fqdn;
  }


  public void setFqdn(String fqdn) {
    this.fqdn = fqdn;
  }


  public VDB parentId(String parentId) {
    
    this.parentId = parentId;
    return this;
  }

   /**
   * A reference to the parent dataset of this VDB.
   * @return parentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A reference to the parent dataset of this VDB.")

  public String getParentId() {
    return parentId;
  }


  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  public VDB parentDsourceId(String parentDsourceId) {
    
    this.parentDsourceId = parentDsourceId;
    return this;
  }

   /**
   * A reference to the parent dSource of this VDB.
   * @return parentDsourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A reference to the parent dSource of this VDB.")

  public String getParentDsourceId() {
    return parentDsourceId;
  }


  public void setParentDsourceId(String parentDsourceId) {
    this.parentDsourceId = parentDsourceId;
  }


  public VDB groupName(String groupName) {
    
    this.groupName = groupName;
    return this;
  }

   /**
   * The name of the group containing this VDB.
   * @return groupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the group containing this VDB.")

  public String getGroupName() {
    return groupName;
  }


  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public VDB engineName(String engineName) {
    
    this.engineName = engineName;
    return this;
  }

   /**
   * Name of the Engine where this VDB is hosted
   * @return engineName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the Engine where this VDB is hosted")

  public String getEngineName() {
    return engineName;
  }


  public void setEngineName(String engineName) {
    this.engineName = engineName;
  }


  public VDB cdbId(String cdbId) {
    
    this.cdbId = cdbId;
    return this;
  }

   /**
   * A reference to the CDB or VCDB associated with this VDB.
   * @return cdbId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A reference to the CDB or VCDB associated with this VDB.")

  public String getCdbId() {
    return cdbId;
  }


  public void setCdbId(String cdbId) {
    this.cdbId = cdbId;
  }


  public VDB tags(List<Tag> tags) {
    
    this.tags = tags;
    return this;
  }

  public VDB addTagsItem(Tag tagsItem) {
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


  public VDB creationDate(OffsetDateTime creationDate) {
    
    this.creationDate = creationDate;
    return this;
  }

   /**
   * The date this VDB was created.
   * @return creationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date this VDB was created.")

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }


  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }


  public VDB hooks(VirtualDatasetHooks hooks) {
    
    this.hooks = hooks;
    return this;
  }

   /**
   * Get hooks
   * @return hooks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualDatasetHooks getHooks() {
    return hooks;
  }


  public void setHooks(VirtualDatasetHooks hooks) {
    this.hooks = hooks;
  }


  public VDB appdataSourceParams(Map<String, Object> appdataSourceParams) {
    
    this.appdataSourceParams = appdataSourceParams;
    return this;
  }

  public VDB putAppdataSourceParamsItem(String key, Object appdataSourceParamsItem) {
    if (this.appdataSourceParams == null) {
      this.appdataSourceParams = new HashMap<String, Object>();
    }
    this.appdataSourceParams.put(key, appdataSourceParamsItem);
    return this;
  }

   /**
   * The JSON payload conforming to the DraftV4 schema based on the type of application data being manipulated.
   * @return appdataSourceParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The JSON payload conforming to the DraftV4 schema based on the type of application data being manipulated.")

  public Map<String, Object> getAppdataSourceParams() {
    return appdataSourceParams;
  }


  public void setAppdataSourceParams(Map<String, Object> appdataSourceParams) {
    this.appdataSourceParams = appdataSourceParams;
  }


  public VDB templateId(String templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * A reference to the Database Template.
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A reference to the Database Template.")

  public String getTemplateId() {
    return templateId;
  }


  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  public VDB configParams(Map<String, Object> configParams) {
    
    this.configParams = configParams;
    return this;
  }

  public VDB putConfigParamsItem(String key, Object configParamsItem) {
    if (this.configParams == null) {
      this.configParams = new HashMap<String, Object>();
    }
    this.configParams.put(key, configParamsItem);
    return this;
  }

   /**
   * Database configuration parameter overrides.
   * @return configParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Database configuration parameter overrides.")

  public Map<String, Object> getConfigParams() {
    return configParams;
  }


  public void setConfigParams(Map<String, Object> configParams) {
    this.configParams = configParams;
  }


  public VDB additionalMountPoints(List<AdditionalMountPoint> additionalMountPoints) {
    
    this.additionalMountPoints = additionalMountPoints;
    return this;
  }

  public VDB addAdditionalMountPointsItem(AdditionalMountPoint additionalMountPointsItem) {
    if (this.additionalMountPoints == null) {
      this.additionalMountPoints = new ArrayList<AdditionalMountPoint>();
    }
    this.additionalMountPoints.add(additionalMountPointsItem);
    return this;
  }

   /**
   * Specifies additional locations on which to mount a subdirectory of an AppData container. Can only be updated while the VDB is disabled.
   * @return additionalMountPoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies additional locations on which to mount a subdirectory of an AppData container. Can only be updated while the VDB is disabled.")

  public List<AdditionalMountPoint> getAdditionalMountPoints() {
    return additionalMountPoints;
  }


  public void setAdditionalMountPoints(List<AdditionalMountPoint> additionalMountPoints) {
    this.additionalMountPoints = additionalMountPoints;
  }


  public VDB appdataConfigParams(Map<String, Object> appdataConfigParams) {
    
    this.appdataConfigParams = appdataConfigParams;
    return this;
  }

  public VDB putAppdataConfigParamsItem(String key, Object appdataConfigParamsItem) {
    if (this.appdataConfigParams == null) {
      this.appdataConfigParams = new HashMap<String, Object>();
    }
    this.appdataConfigParams.put(key, appdataConfigParamsItem);
    return this;
  }

   /**
   * The parameters specified by the source config schema in the toolkit
   * @return appdataConfigParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The parameters specified by the source config schema in the toolkit")

  public Map<String, Object> getAppdataConfigParams() {
    return appdataConfigParams;
  }


  public void setAppdataConfigParams(Map<String, Object> appdataConfigParams) {
    this.appdataConfigParams = appdataConfigParams;
  }


  public VDB mountPoint(String mountPoint) {
    
    this.mountPoint = mountPoint;
    return this;
  }

   /**
   * Mount point for the VDB (Oracle, ASE, AppData).
   * @return mountPoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/var/mnt", value = "Mount point for the VDB (Oracle, ASE, AppData).")

  public String getMountPoint() {
    return mountPoint;
  }


  public void setMountPoint(String mountPoint) {
    this.mountPoint = mountPoint;
  }


  public VDB currentTimeflowId(String currentTimeflowId) {
    
    this.currentTimeflowId = currentTimeflowId;
    return this;
  }

   /**
   * A reference to the currently active timeflow for this VDB.
   * @return currentTimeflowId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "timeflow-456", value = "A reference to the currently active timeflow for this VDB.")

  public String getCurrentTimeflowId() {
    return currentTimeflowId;
  }


  public void setCurrentTimeflowId(String currentTimeflowId) {
    this.currentTimeflowId = currentTimeflowId;
  }


  public VDB previousTimeflowId(String previousTimeflowId) {
    
    this.previousTimeflowId = previousTimeflowId;
    return this;
  }

   /**
   * A reference to the previous timeflow for this VDB.
   * @return previousTimeflowId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "timeflow-123", value = "A reference to the previous timeflow for this VDB.")

  public String getPreviousTimeflowId() {
    return previousTimeflowId;
  }


  public void setPreviousTimeflowId(String previousTimeflowId) {
    this.previousTimeflowId = previousTimeflowId;
  }


  public VDB lastRefreshedDate(OffsetDateTime lastRefreshedDate) {
    
    this.lastRefreshedDate = lastRefreshedDate;
    return this;
  }

   /**
   * The date this VDB was last refreshed.
   * @return lastRefreshedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date this VDB was last refreshed.")

  public OffsetDateTime getLastRefreshedDate() {
    return lastRefreshedDate;
  }


  public void setLastRefreshedDate(OffsetDateTime lastRefreshedDate) {
    this.lastRefreshedDate = lastRefreshedDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VDB VDB = (VDB) o;
    return Objects.equals(this.id, VDB.id) &&
        Objects.equals(this.databaseType, VDB.databaseType) &&
        Objects.equals(this.name, VDB.name) &&
        Objects.equals(this.databaseVersion, VDB.databaseVersion) &&
        Objects.equals(this.size, VDB.size) &&
        Objects.equals(this.storageSize, VDB.storageSize) &&
        Objects.equals(this.engineId, VDB.engineId) &&
        Objects.equals(this.status, VDB.status) &&
        Objects.equals(this.masked, VDB.masked) &&
        Objects.equals(this.contentType, VDB.contentType) &&
        Objects.equals(this.parentTimeflowTimestamp, VDB.parentTimeflowTimestamp) &&
        Objects.equals(this.parentTimeflowTimezone, VDB.parentTimeflowTimezone) &&
        Objects.equals(this.environmentId, VDB.environmentId) &&
        Objects.equals(this.ipAddress, VDB.ipAddress) &&
        Objects.equals(this.fqdn, VDB.fqdn) &&
        Objects.equals(this.parentId, VDB.parentId) &&
        Objects.equals(this.parentDsourceId, VDB.parentDsourceId) &&
        Objects.equals(this.groupName, VDB.groupName) &&
        Objects.equals(this.engineName, VDB.engineName) &&
        Objects.equals(this.cdbId, VDB.cdbId) &&
        Objects.equals(this.tags, VDB.tags) &&
        Objects.equals(this.creationDate, VDB.creationDate) &&
        Objects.equals(this.hooks, VDB.hooks) &&
        Objects.equals(this.appdataSourceParams, VDB.appdataSourceParams) &&
        Objects.equals(this.templateId, VDB.templateId) &&
        Objects.equals(this.configParams, VDB.configParams) &&
        Objects.equals(this.additionalMountPoints, VDB.additionalMountPoints) &&
        Objects.equals(this.appdataConfigParams, VDB.appdataConfigParams) &&
        Objects.equals(this.mountPoint, VDB.mountPoint) &&
        Objects.equals(this.currentTimeflowId, VDB.currentTimeflowId) &&
        Objects.equals(this.previousTimeflowId, VDB.previousTimeflowId) &&
        Objects.equals(this.lastRefreshedDate, VDB.lastRefreshedDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && a.get().getClass().isArray() ? Arrays.equals((T[])a.get(), (T[])b.get()) : Objects.equals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, databaseType, name, databaseVersion, size, storageSize, engineId, status, masked, contentType, parentTimeflowTimestamp, parentTimeflowTimezone, environmentId, ipAddress, fqdn, parentId, parentDsourceId, groupName, engineName, cdbId, tags, creationDate, hooks, appdataSourceParams, templateId, configParams, additionalMountPoints, appdataConfigParams, mountPoint, currentTimeflowId, previousTimeflowId, lastRefreshedDate);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent()
      ? (a.get().getClass().isArray() ? Arrays.hashCode((T[])a.get()) : Objects.hashCode(a.get()))
      : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VDB {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    databaseType: ").append(toIndentedString(databaseType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    databaseVersion: ").append(toIndentedString(databaseVersion)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    storageSize: ").append(toIndentedString(storageSize)).append("\n");
    sb.append("    engineId: ").append(toIndentedString(engineId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    masked: ").append(toIndentedString(masked)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    parentTimeflowTimestamp: ").append(toIndentedString(parentTimeflowTimestamp)).append("\n");
    sb.append("    parentTimeflowTimezone: ").append(toIndentedString(parentTimeflowTimezone)).append("\n");
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    fqdn: ").append(toIndentedString(fqdn)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentDsourceId: ").append(toIndentedString(parentDsourceId)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
    sb.append("    cdbId: ").append(toIndentedString(cdbId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    hooks: ").append(toIndentedString(hooks)).append("\n");
    sb.append("    appdataSourceParams: ").append(toIndentedString(appdataSourceParams)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    configParams: ").append(toIndentedString(configParams)).append("\n");
    sb.append("    additionalMountPoints: ").append(toIndentedString(additionalMountPoints)).append("\n");
    sb.append("    appdataConfigParams: ").append(toIndentedString(appdataConfigParams)).append("\n");
    sb.append("    mountPoint: ").append(toIndentedString(mountPoint)).append("\n");
    sb.append("    currentTimeflowId: ").append(toIndentedString(currentTimeflowId)).append("\n");
    sb.append("    previousTimeflowId: ").append(toIndentedString(previousTimeflowId)).append("\n");
    sb.append("    lastRefreshedDate: ").append(toIndentedString(lastRefreshedDate)).append("\n");
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


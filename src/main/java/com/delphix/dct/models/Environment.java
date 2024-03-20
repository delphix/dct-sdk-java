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
import com.delphix.dct.models.Host;
import com.delphix.dct.models.OracleListener;
import com.delphix.dct.models.Repository;
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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * A grouping of a single host or a cluster of hosts.
 */
@ApiModel(description = "A grouping of a single host or a cluster of hosts.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-19T18:53:50.335381+05:30[Asia/Kolkata]")
public class Environment {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_ENGINE_ID = "engine_id";
  @SerializedName(SERIALIZED_NAME_ENGINE_ID)
  private String engineId;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_IS_CLUSTER = "is_cluster";
  @SerializedName(SERIALIZED_NAME_IS_CLUSTER)
  private Boolean isCluster;

  public static final String SERIALIZED_NAME_CLUSTER_HOME = "cluster_home";
  @SerializedName(SERIALIZED_NAME_CLUSTER_HOME)
  private String clusterHome;

  public static final String SERIALIZED_NAME_IS_WINDOWS_TARGET = "is_windows_target";
  @SerializedName(SERIALIZED_NAME_IS_WINDOWS_TARGET)
  private Boolean isWindowsTarget;

  public static final String SERIALIZED_NAME_STAGING_ENVIRONMENT = "staging_environment";
  @SerializedName(SERIALIZED_NAME_STAGING_ENVIRONMENT)
  private String stagingEnvironment;

  public static final String SERIALIZED_NAME_HOSTS = "hosts";
  @SerializedName(SERIALIZED_NAME_HOSTS)
  private List<Host> hosts = null;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<Tag> tags = null;

  public static final String SERIALIZED_NAME_REPOSITORIES = "repositories";
  @SerializedName(SERIALIZED_NAME_REPOSITORIES)
  private List<Repository> repositories = null;

  public static final String SERIALIZED_NAME_LISTENERS = "listeners";
  @SerializedName(SERIALIZED_NAME_LISTENERS)
  private List<OracleListener> listeners = null;


  public Environment id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The Environment object entity ID.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "environment-123", value = "The Environment object entity ID.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Environment name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of this environment.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Linux Test Host", value = "The name of this environment.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Environment namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * The namespace of this environment for replicated and restored objects.
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NAMESPACE-1", value = "The namespace of this environment for replicated and restored objects.")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public Environment engineId(String engineId) {
    
    this.engineId = engineId;
    return this;
  }

   /**
   * A reference to the Engine that this Environment connection is associated with.
   * @return engineId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "engine-123", value = "A reference to the Engine that this Environment connection is associated with.")

  public String getEngineId() {
    return engineId;
  }


  public void setEngineId(String engineId) {
    this.engineId = engineId;
  }


  public Environment enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * True if this environment is enabled.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "True if this environment is enabled.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public Environment isCluster(Boolean isCluster) {
    
    this.isCluster = isCluster;
    return this;
  }

   /**
   * True if this environment is a cluster of hosts.
   * @return isCluster
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "True if this environment is a cluster of hosts.")

  public Boolean getIsCluster() {
    return isCluster;
  }


  public void setIsCluster(Boolean isCluster) {
    this.isCluster = isCluster;
  }


  public Environment clusterHome(String clusterHome) {
    
    this.clusterHome = clusterHome;
    return this;
  }

   /**
   * Cluster home for RAC environment.
   * @return clusterHome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/u01/app/12.2.0.1/grid", value = "Cluster home for RAC environment.")

  public String getClusterHome() {
    return clusterHome;
  }


  public void setClusterHome(String clusterHome) {
    this.clusterHome = clusterHome;
  }


  public Environment isWindowsTarget(Boolean isWindowsTarget) {
    
    this.isWindowsTarget = isWindowsTarget;
    return this;
  }

   /**
   * True if this windows environment is a target environment.
   * @return isWindowsTarget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "True if this windows environment is a target environment.")

  public Boolean getIsWindowsTarget() {
    return isWindowsTarget;
  }


  public void setIsWindowsTarget(Boolean isWindowsTarget) {
    this.isWindowsTarget = isWindowsTarget;
  }


  public Environment stagingEnvironment(String stagingEnvironment) {
    
    this.stagingEnvironment = stagingEnvironment;
    return this;
  }

   /**
   * ID of the staging environment.
   * @return stagingEnvironment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1-WINDOWS_HOST-8", value = "ID of the staging environment.")

  public String getStagingEnvironment() {
    return stagingEnvironment;
  }


  public void setStagingEnvironment(String stagingEnvironment) {
    this.stagingEnvironment = stagingEnvironment;
  }


  public Environment hosts(List<Host> hosts) {
    
    this.hosts = hosts;
    return this;
  }

  public Environment addHostsItem(Host hostsItem) {
    if (this.hosts == null) {
      this.hosts = new ArrayList<Host>();
    }
    this.hosts.add(hostsItem);
    return this;
  }

   /**
   * The hosts that are part of this environment.
   * @return hosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The hosts that are part of this environment.")

  public List<Host> getHosts() {
    return hosts;
  }


  public void setHosts(List<Host> hosts) {
    this.hosts = hosts;
  }


  public Environment tags(List<Tag> tags) {
    
    this.tags = tags;
    return this;
  }

  public Environment addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The tags to be created for this environment.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tags to be created for this environment.")

  public List<Tag> getTags() {
    return tags;
  }


  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }


  public Environment repositories(List<Repository> repositories) {
    
    this.repositories = repositories;
    return this;
  }

  public Environment addRepositoriesItem(Repository repositoriesItem) {
    if (this.repositories == null) {
      this.repositories = new ArrayList<Repository>();
    }
    this.repositories.add(repositoriesItem);
    return this;
  }

   /**
   * Repositories associated with this environment. A Repository typically corresponds to a database installation.
   * @return repositories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Repositories associated with this environment. A Repository typically corresponds to a database installation.")

  public List<Repository> getRepositories() {
    return repositories;
  }


  public void setRepositories(List<Repository> repositories) {
    this.repositories = repositories;
  }


  public Environment listeners(List<OracleListener> listeners) {
    
    this.listeners = listeners;
    return this;
  }

  public Environment addListenersItem(OracleListener listenersItem) {
    if (this.listeners == null) {
      this.listeners = new ArrayList<OracleListener>();
    }
    this.listeners.add(listenersItem);
    return this;
  }

   /**
   * Oracle listeners associated with this environment.
   * @return listeners
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Oracle listeners associated with this environment.")

  public List<OracleListener> getListeners() {
    return listeners;
  }


  public void setListeners(List<OracleListener> listeners) {
    this.listeners = listeners;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Environment environment = (Environment) o;
    return Objects.equals(this.id, environment.id) &&
        Objects.equals(this.name, environment.name) &&
        Objects.equals(this.namespace, environment.namespace) &&
        Objects.equals(this.engineId, environment.engineId) &&
        Objects.equals(this.enabled, environment.enabled) &&
        Objects.equals(this.isCluster, environment.isCluster) &&
        Objects.equals(this.clusterHome, environment.clusterHome) &&
        Objects.equals(this.isWindowsTarget, environment.isWindowsTarget) &&
        Objects.equals(this.stagingEnvironment, environment.stagingEnvironment) &&
        Objects.equals(this.hosts, environment.hosts) &&
        Objects.equals(this.tags, environment.tags) &&
        Objects.equals(this.repositories, environment.repositories) &&
        Objects.equals(this.listeners, environment.listeners);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && a.get().getClass().isArray() ? Arrays.equals((T[])a.get(), (T[])b.get()) : Objects.equals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, namespace, engineId, enabled, isCluster, clusterHome, isWindowsTarget, stagingEnvironment, hosts, tags, repositories, listeners);
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
    sb.append("class Environment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    engineId: ").append(toIndentedString(engineId)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    isCluster: ").append(toIndentedString(isCluster)).append("\n");
    sb.append("    clusterHome: ").append(toIndentedString(clusterHome)).append("\n");
    sb.append("    isWindowsTarget: ").append(toIndentedString(isWindowsTarget)).append("\n");
    sb.append("    stagingEnvironment: ").append(toIndentedString(stagingEnvironment)).append("\n");
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
    sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
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


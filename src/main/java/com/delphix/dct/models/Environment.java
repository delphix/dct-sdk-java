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
import com.delphix.dct.models.Host;
import com.delphix.dct.models.OracleListener;
import com.delphix.dct.models.Repository;
import com.delphix.dct.models.Tag;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * A grouping of a single host or a cluster of hosts.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class Environment {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE_ID = "namespace_id";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_ID)
  private String namespaceId;

  public static final String SERIALIZED_NAME_NAMESPACE_NAME = "namespace_name";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_NAME)
  private String namespaceName;

  public static final String SERIALIZED_NAME_IS_REPLICA = "is_replica";
  @SerializedName(SERIALIZED_NAME_IS_REPLICA)
  private Boolean isReplica;

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
  private List<Host> hosts;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<Tag> tags;

  public static final String SERIALIZED_NAME_REPOSITORIES = "repositories";
  @SerializedName(SERIALIZED_NAME_REPOSITORIES)
  private List<Repository> repositories;

  public static final String SERIALIZED_NAME_LISTENERS = "listeners";
  @SerializedName(SERIALIZED_NAME_LISTENERS)
  private List<OracleListener> listeners;

  public Environment() {
  }

  public Environment id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The Environment object entity ID.
   * @return id
  **/
  @javax.annotation.Nullable
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
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Environment namespaceId(String namespaceId) {
    this.namespaceId = namespaceId;
    return this;
  }

   /**
   * The namespace id of this environment.
   * @return namespaceId
  **/
  @javax.annotation.Nullable
  public String getNamespaceId() {
    return namespaceId;
  }

  public void setNamespaceId(String namespaceId) {
    this.namespaceId = namespaceId;
  }


  public Environment namespaceName(String namespaceName) {
    this.namespaceName = namespaceName;
    return this;
  }

   /**
   * The namespace name of this environment.
   * @return namespaceName
  **/
  @javax.annotation.Nullable
  public String getNamespaceName() {
    return namespaceName;
  }

  public void setNamespaceName(String namespaceName) {
    this.namespaceName = namespaceName;
  }


  public Environment isReplica(Boolean isReplica) {
    this.isReplica = isReplica;
    return this;
  }

   /**
   * Is this a replicated object.
   * @return isReplica
  **/
  @javax.annotation.Nullable
  public Boolean getIsReplica() {
    return isReplica;
  }

  public void setIsReplica(Boolean isReplica) {
    this.isReplica = isReplica;
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
      this.hosts = new ArrayList<>();
    }
    this.hosts.add(hostsItem);
    return this;
  }

   /**
   * The hosts that are part of this environment.
   * @return hosts
  **/
  @javax.annotation.Nullable
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
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The tags to be created for this environment.
   * @return tags
  **/
  @javax.annotation.Nullable
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
      this.repositories = new ArrayList<>();
    }
    this.repositories.add(repositoriesItem);
    return this;
  }

   /**
   * Repositories associated with this environment. A Repository typically corresponds to a database installation.
   * @return repositories
  **/
  @javax.annotation.Nullable
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
      this.listeners = new ArrayList<>();
    }
    this.listeners.add(listenersItem);
    return this;
  }

   /**
   * Oracle listeners associated with this environment.
   * @return listeners
  **/
  @javax.annotation.Nullable
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
        Objects.equals(this.namespaceId, environment.namespaceId) &&
        Objects.equals(this.namespaceName, environment.namespaceName) &&
        Objects.equals(this.isReplica, environment.isReplica) &&
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
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, namespaceId, namespaceName, isReplica, namespace, engineId, enabled, isCluster, clusterHome, isWindowsTarget, stagingEnvironment, hosts, tags, repositories, listeners);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Environment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespaceId: ").append(toIndentedString(namespaceId)).append("\n");
    sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
    sb.append("    isReplica: ").append(toIndentedString(isReplica)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("namespace_id");
    openapiFields.add("namespace_name");
    openapiFields.add("is_replica");
    openapiFields.add("namespace");
    openapiFields.add("engine_id");
    openapiFields.add("enabled");
    openapiFields.add("is_cluster");
    openapiFields.add("cluster_home");
    openapiFields.add("is_windows_target");
    openapiFields.add("staging_environment");
    openapiFields.add("hosts");
    openapiFields.add("tags");
    openapiFields.add("repositories");
    openapiFields.add("listeners");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Environment
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Environment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Environment is not found in the empty JSON string", Environment.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Environment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Environment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("namespace_id") != null && !jsonObj.get("namespace_id").isJsonNull()) && !jsonObj.get("namespace_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace_id").toString()));
      }
      if ((jsonObj.get("namespace_name") != null && !jsonObj.get("namespace_name").isJsonNull()) && !jsonObj.get("namespace_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace_name").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if ((jsonObj.get("engine_id") != null && !jsonObj.get("engine_id").isJsonNull()) && !jsonObj.get("engine_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `engine_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("engine_id").toString()));
      }
      if ((jsonObj.get("cluster_home") != null && !jsonObj.get("cluster_home").isJsonNull()) && !jsonObj.get("cluster_home").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cluster_home` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cluster_home").toString()));
      }
      if ((jsonObj.get("staging_environment") != null && !jsonObj.get("staging_environment").isJsonNull()) && !jsonObj.get("staging_environment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `staging_environment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("staging_environment").toString()));
      }
      if (jsonObj.get("hosts") != null && !jsonObj.get("hosts").isJsonNull()) {
        JsonArray jsonArrayhosts = jsonObj.getAsJsonArray("hosts");
        if (jsonArrayhosts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("hosts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `hosts` to be an array in the JSON string but got `%s`", jsonObj.get("hosts").toString()));
          }

          // validate the optional field `hosts` (array)
          for (int i = 0; i < jsonArrayhosts.size(); i++) {
            Host.validateJsonElement(jsonArrayhosts.get(i));
          };
        }
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
      if (jsonObj.get("repositories") != null && !jsonObj.get("repositories").isJsonNull()) {
        JsonArray jsonArrayrepositories = jsonObj.getAsJsonArray("repositories");
        if (jsonArrayrepositories != null) {
          // ensure the json data is an array
          if (!jsonObj.get("repositories").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `repositories` to be an array in the JSON string but got `%s`", jsonObj.get("repositories").toString()));
          }

          // validate the optional field `repositories` (array)
          for (int i = 0; i < jsonArrayrepositories.size(); i++) {
            Repository.validateJsonElement(jsonArrayrepositories.get(i));
          };
        }
      }
      if (jsonObj.get("listeners") != null && !jsonObj.get("listeners").isJsonNull()) {
        JsonArray jsonArraylisteners = jsonObj.getAsJsonArray("listeners");
        if (jsonArraylisteners != null) {
          // ensure the json data is an array
          if (!jsonObj.get("listeners").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `listeners` to be an array in the JSON string but got `%s`", jsonObj.get("listeners").toString()));
          }

          // validate the optional field `listeners` (array)
          for (int i = 0; i < jsonArraylisteners.size(); i++) {
            OracleListener.validateJsonElement(jsonArraylisteners.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Environment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Environment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Environment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Environment.class));

       return (TypeAdapter<T>) new TypeAdapter<Environment>() {
           @Override
           public void write(JsonWriter out, Environment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Environment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Environment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Environment
  * @throws IOException if the JSON string is invalid with respect to Environment
  */
  public static Environment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Environment.class);
  }

 /**
  * Convert an instance of Environment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


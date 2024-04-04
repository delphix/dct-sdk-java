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
import com.delphix.dct.models.AlgorithmRevisionOriginEngine;
import com.delphix.dct.models.Tag;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * A masking algorithm revision.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class AlgorithmRevision {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  public static final String SERIALIZED_NAME_ALGORITHM_ID = "algorithm_id";
  @SerializedName(SERIALIZED_NAME_ALGORITHM_ID)
  private String algorithmId;

  public static final String SERIALIZED_NAME_PLUGIN_ID = "plugin_id";
  @SerializedName(SERIALIZED_NAME_PLUGIN_ID)
  private String pluginId;

  public static final String SERIALIZED_NAME_FRAMEWORK_ID = "framework_id";
  @SerializedName(SERIALIZED_NAME_FRAMEWORK_ID)
  private String frameworkId;

  public static final String SERIALIZED_NAME_IS_PRIMARY = "is_primary";
  @SerializedName(SERIALIZED_NAME_IS_PRIMARY)
  private Boolean isPrimary;

  public static final String SERIALIZED_NAME_IS_DEFAULT_INSTANCE = "is_default_instance";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT_INSTANCE)
  private Boolean isDefaultInstance;

  public static final String SERIALIZED_NAME_CREATE_DATE = "create_date";
  @SerializedName(SERIALIZED_NAME_CREATE_DATE)
  private OffsetDateTime createDate;

  public static final String SERIALIZED_NAME_ORIGIN_ENGINES = "origin_engines";
  @SerializedName(SERIALIZED_NAME_ORIGIN_ENGINES)
  private List<AlgorithmRevisionOriginEngine> originEngines;

  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private Map<String, Object> config = new HashMap<>();

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<Tag> tags;

  public AlgorithmRevision() {
  }

  public AlgorithmRevision id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The algorithm revision ID.
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public AlgorithmRevision name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of this algorithm revision.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AlgorithmRevision note(String note) {
    this.note = note;
    return this;
  }

   /**
   * A note of this algorithm.
   * @return note
  **/
  @javax.annotation.Nullable
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }


  public AlgorithmRevision algorithmId(String algorithmId) {
    this.algorithmId = algorithmId;
    return this;
  }

   /**
   * The id of the algorithm that this revision belongs to.
   * @return algorithmId
  **/
  @javax.annotation.Nonnull
  public String getAlgorithmId() {
    return algorithmId;
  }

  public void setAlgorithmId(String algorithmId) {
    this.algorithmId = algorithmId;
  }


  public AlgorithmRevision pluginId(String pluginId) {
    this.pluginId = pluginId;
    return this;
  }

   /**
   * The id of the plugin that this algorithm revision belongs to.
   * @return pluginId
  **/
  @javax.annotation.Nonnull
  public String getPluginId() {
    return pluginId;
  }

  public void setPluginId(String pluginId) {
    this.pluginId = pluginId;
  }


  public AlgorithmRevision frameworkId(String frameworkId) {
    this.frameworkId = frameworkId;
    return this;
  }

   /**
   * The id of the framework that this algorithm revision belongs to.
   * @return frameworkId
  **/
  @javax.annotation.Nonnull
  public String getFrameworkId() {
    return frameworkId;
  }

  public void setFrameworkId(String frameworkId) {
    this.frameworkId = frameworkId;
  }


  public AlgorithmRevision isPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
    return this;
  }

   /**
   * Whether this algorithm revision is the primary revision of its algorithm.
   * @return isPrimary
  **/
  @javax.annotation.Nonnull
  public Boolean getIsPrimary() {
    return isPrimary;
  }

  public void setIsPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
  }


  public AlgorithmRevision isDefaultInstance(Boolean isDefaultInstance) {
    this.isDefaultInstance = isDefaultInstance;
    return this;
  }

   /**
   * Whether this algorithm revision is defined in a plugin as a default instance.
   * @return isDefaultInstance
  **/
  @javax.annotation.Nonnull
  public Boolean getIsDefaultInstance() {
    return isDefaultInstance;
  }

  public void setIsDefaultInstance(Boolean isDefaultInstance) {
    this.isDefaultInstance = isDefaultInstance;
  }


  public AlgorithmRevision createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * The date and time this algorithm revision was created.
   * @return createDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }


  public AlgorithmRevision originEngines(List<AlgorithmRevisionOriginEngine> originEngines) {
    this.originEngines = originEngines;
    return this;
  }

  public AlgorithmRevision addOriginEnginesItem(AlgorithmRevisionOriginEngine originEnginesItem) {
    if (this.originEngines == null) {
      this.originEngines = new ArrayList<>();
    }
    this.originEngines.add(originEnginesItem);
    return this;
  }

   /**
   * The engines that this algorithm revision is originated from.
   * @return originEngines
  **/
  @javax.annotation.Nullable
  public List<AlgorithmRevisionOriginEngine> getOriginEngines() {
    return originEngines;
  }

  public void setOriginEngines(List<AlgorithmRevisionOriginEngine> originEngines) {
    this.originEngines = originEngines;
  }


  public AlgorithmRevision config(Map<String, Object> config) {
    this.config = config;
    return this;
  }

  public AlgorithmRevision putConfigItem(String key, Object configItem) {
    if (this.config == null) {
      this.config = new HashMap<>();
    }
    this.config.put(key, configItem);
    return this;
  }

   /**
   * The configuration of this algorithm revision.
   * @return config
  **/
  @javax.annotation.Nullable
  public Map<String, Object> getConfig() {
    return config;
  }

  public void setConfig(Map<String, Object> config) {
    this.config = config;
  }


  public AlgorithmRevision tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public AlgorithmRevision addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The tags of this algorithm revision.
   * @return tags
  **/
  @javax.annotation.Nullable
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
    AlgorithmRevision algorithmRevision = (AlgorithmRevision) o;
    return Objects.equals(this.id, algorithmRevision.id) &&
        Objects.equals(this.name, algorithmRevision.name) &&
        Objects.equals(this.note, algorithmRevision.note) &&
        Objects.equals(this.algorithmId, algorithmRevision.algorithmId) &&
        Objects.equals(this.pluginId, algorithmRevision.pluginId) &&
        Objects.equals(this.frameworkId, algorithmRevision.frameworkId) &&
        Objects.equals(this.isPrimary, algorithmRevision.isPrimary) &&
        Objects.equals(this.isDefaultInstance, algorithmRevision.isDefaultInstance) &&
        Objects.equals(this.createDate, algorithmRevision.createDate) &&
        Objects.equals(this.originEngines, algorithmRevision.originEngines) &&
        Objects.equals(this.config, algorithmRevision.config) &&
        Objects.equals(this.tags, algorithmRevision.tags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, note, algorithmId, pluginId, frameworkId, isPrimary, isDefaultInstance, createDate, originEngines, config, tags);
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
    sb.append("class AlgorithmRevision {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    algorithmId: ").append(toIndentedString(algorithmId)).append("\n");
    sb.append("    pluginId: ").append(toIndentedString(pluginId)).append("\n");
    sb.append("    frameworkId: ").append(toIndentedString(frameworkId)).append("\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
    sb.append("    isDefaultInstance: ").append(toIndentedString(isDefaultInstance)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    originEngines: ").append(toIndentedString(originEngines)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("note");
    openapiFields.add("algorithm_id");
    openapiFields.add("plugin_id");
    openapiFields.add("framework_id");
    openapiFields.add("is_primary");
    openapiFields.add("is_default_instance");
    openapiFields.add("create_date");
    openapiFields.add("origin_engines");
    openapiFields.add("config");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("algorithm_id");
    openapiRequiredFields.add("plugin_id");
    openapiRequiredFields.add("framework_id");
    openapiRequiredFields.add("is_primary");
    openapiRequiredFields.add("is_default_instance");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AlgorithmRevision
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AlgorithmRevision.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlgorithmRevision is not found in the empty JSON string", AlgorithmRevision.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AlgorithmRevision.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlgorithmRevision` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AlgorithmRevision.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("note") != null && !jsonObj.get("note").isJsonNull()) && !jsonObj.get("note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("note").toString()));
      }
      if (!jsonObj.get("algorithm_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `algorithm_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("algorithm_id").toString()));
      }
      if (!jsonObj.get("plugin_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plugin_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plugin_id").toString()));
      }
      if (!jsonObj.get("framework_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `framework_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("framework_id").toString()));
      }
      if (jsonObj.get("origin_engines") != null && !jsonObj.get("origin_engines").isJsonNull()) {
        JsonArray jsonArrayoriginEngines = jsonObj.getAsJsonArray("origin_engines");
        if (jsonArrayoriginEngines != null) {
          // ensure the json data is an array
          if (!jsonObj.get("origin_engines").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `origin_engines` to be an array in the JSON string but got `%s`", jsonObj.get("origin_engines").toString()));
          }

          // validate the optional field `origin_engines` (array)
          for (int i = 0; i < jsonArrayoriginEngines.size(); i++) {
            AlgorithmRevisionOriginEngine.validateJsonElement(jsonArrayoriginEngines.get(i));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlgorithmRevision.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlgorithmRevision' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlgorithmRevision> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlgorithmRevision.class));

       return (TypeAdapter<T>) new TypeAdapter<AlgorithmRevision>() {
           @Override
           public void write(JsonWriter out, AlgorithmRevision value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlgorithmRevision read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlgorithmRevision given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlgorithmRevision
  * @throws IOException if the JSON string is invalid with respect to AlgorithmRevision
  */
  public static AlgorithmRevision fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlgorithmRevision.class);
  }

 /**
  * Convert an instance of AlgorithmRevision to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


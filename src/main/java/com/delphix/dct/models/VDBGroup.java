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
 * A collection of virtual databases and datesets.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class VDBGroup {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VDB_IDS = "vdb_ids";
  @SerializedName(SERIALIZED_NAME_VDB_IDS)
  private List<String> vdbIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_IS_LOCKED = "is_locked";
  @SerializedName(SERIALIZED_NAME_IS_LOCKED)
  private Boolean isLocked;

  public static final String SERIALIZED_NAME_LOCKED_BY = "locked_by";
  @SerializedName(SERIALIZED_NAME_LOCKED_BY)
  private Long lockedBy;

  public static final String SERIALIZED_NAME_LOCKED_BY_NAME = "locked_by_name";
  @SerializedName(SERIALIZED_NAME_LOCKED_BY_NAME)
  private String lockedByName;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<Tag> tags;

  public VDBGroup() {
  }

  public VDBGroup(
     String id
  ) {
    this();
    this.id = id;
  }

   /**
   * A unique identifier for the entity.
   * @return id
  **/
  @javax.annotation.Nonnull
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
    if (this.vdbIds == null) {
      this.vdbIds = new ArrayList<>();
    }
    this.vdbIds.add(vdbIdsItem);
    return this;
  }

   /**
   * The list of VDB IDs in this VDBGroup.
   * @return vdbIds
  **/
  @javax.annotation.Nonnull
  public List<String> getVdbIds() {
    return vdbIds;
  }

  public void setVdbIds(List<String> vdbIds) {
    this.vdbIds = vdbIds;
  }


  public VDBGroup isLocked(Boolean isLocked) {
    this.isLocked = isLocked;
    return this;
  }

   /**
   * Indicates whether the VDBGroup is locked.
   * @return isLocked
  **/
  @javax.annotation.Nullable
  public Boolean getIsLocked() {
    return isLocked;
  }

  public void setIsLocked(Boolean isLocked) {
    this.isLocked = isLocked;
  }


  public VDBGroup lockedBy(Long lockedBy) {
    this.lockedBy = lockedBy;
    return this;
  }

   /**
   * The Id of the account that locked the VDBGroup.
   * @return lockedBy
  **/
  @javax.annotation.Nullable
  public Long getLockedBy() {
    return lockedBy;
  }

  public void setLockedBy(Long lockedBy) {
    this.lockedBy = lockedBy;
  }


  public VDBGroup lockedByName(String lockedByName) {
    this.lockedByName = lockedByName;
    return this;
  }

   /**
   * The name of the account that locked the VDBGroup.
   * @return lockedByName
  **/
  @javax.annotation.Nullable
  public String getLockedByName() {
    return lockedByName;
  }

  public void setLockedByName(String lockedByName) {
    this.lockedByName = lockedByName;
  }


  public VDBGroup tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public VDBGroup addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
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
    VDBGroup vdBGroup = (VDBGroup) o;
    return Objects.equals(this.id, vdBGroup.id) &&
        Objects.equals(this.name, vdBGroup.name) &&
        Objects.equals(this.vdbIds, vdBGroup.vdbIds) &&
        Objects.equals(this.isLocked, vdBGroup.isLocked) &&
        Objects.equals(this.lockedBy, vdBGroup.lockedBy) &&
        Objects.equals(this.lockedByName, vdBGroup.lockedByName) &&
        Objects.equals(this.tags, vdBGroup.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, vdbIds, isLocked, lockedBy, lockedByName, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VDBGroup {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    vdbIds: ").append(toIndentedString(vdbIds)).append("\n");
    sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
    sb.append("    lockedBy: ").append(toIndentedString(lockedBy)).append("\n");
    sb.append("    lockedByName: ").append(toIndentedString(lockedByName)).append("\n");
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
    openapiFields.add("vdb_ids");
    openapiFields.add("is_locked");
    openapiFields.add("locked_by");
    openapiFields.add("locked_by_name");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("vdb_ids");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VDBGroup
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VDBGroup.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VDBGroup is not found in the empty JSON string", VDBGroup.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VDBGroup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VDBGroup` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VDBGroup.openapiRequiredFields) {
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
      // ensure the required json array is present
      if (jsonObj.get("vdb_ids") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("vdb_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `vdb_ids` to be an array in the JSON string but got `%s`", jsonObj.get("vdb_ids").toString()));
      }
      if ((jsonObj.get("locked_by_name") != null && !jsonObj.get("locked_by_name").isJsonNull()) && !jsonObj.get("locked_by_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locked_by_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locked_by_name").toString()));
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
       if (!VDBGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VDBGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VDBGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VDBGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<VDBGroup>() {
           @Override
           public void write(JsonWriter out, VDBGroup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VDBGroup read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VDBGroup given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VDBGroup
  * @throws IOException if the JSON string is invalid with respect to VDBGroup
  */
  public static VDBGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VDBGroup.class);
  }

 /**
  * Convert an instance of VDBGroup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


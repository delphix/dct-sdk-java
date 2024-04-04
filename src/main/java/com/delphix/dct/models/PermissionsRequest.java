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
import com.delphix.dct.models.PermissionObject;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

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
 * PermissionsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class PermissionsRequest {
  public static final String SERIALIZED_NAME_PERMISSION_OBJECTS = "permission_objects";
  @SerializedName(SERIALIZED_NAME_PERMISSION_OBJECTS)
  private Set<PermissionObject> permissionObjects = new LinkedHashSet<>();

  public PermissionsRequest() {
  }

  public PermissionsRequest permissionObjects(Set<PermissionObject> permissionObjects) {
    this.permissionObjects = permissionObjects;
    return this;
  }

  public PermissionsRequest addPermissionObjectsItem(PermissionObject permissionObjectsItem) {
    if (this.permissionObjects == null) {
      this.permissionObjects = new LinkedHashSet<>();
    }
    this.permissionObjects.add(permissionObjectsItem);
    return this;
  }

   /**
   * Array of permissions with object type and their permission.
   * @return permissionObjects
  **/
  @javax.annotation.Nonnull
  public Set<PermissionObject> getPermissionObjects() {
    return permissionObjects;
  }

  public void setPermissionObjects(Set<PermissionObject> permissionObjects) {
    this.permissionObjects = permissionObjects;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionsRequest permissionsRequest = (PermissionsRequest) o;
    return Objects.equals(this.permissionObjects, permissionsRequest.permissionObjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionObjects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionsRequest {\n");
    sb.append("    permissionObjects: ").append(toIndentedString(permissionObjects)).append("\n");
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
    openapiFields.add("permission_objects");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("permission_objects");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PermissionsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PermissionsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PermissionsRequest is not found in the empty JSON string", PermissionsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PermissionsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PermissionsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PermissionsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("permission_objects").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `permission_objects` to be an array in the JSON string but got `%s`", jsonObj.get("permission_objects").toString()));
      }

      JsonArray jsonArraypermissionObjects = jsonObj.getAsJsonArray("permission_objects");
      // validate the required field `permission_objects` (array)
      for (int i = 0; i < jsonArraypermissionObjects.size(); i++) {
        PermissionObject.validateJsonElement(jsonArraypermissionObjects.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PermissionsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PermissionsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PermissionsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PermissionsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PermissionsRequest>() {
           @Override
           public void write(JsonWriter out, PermissionsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PermissionsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PermissionsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PermissionsRequest
  * @throws IOException if the JSON string is invalid with respect to PermissionsRequest
  */
  public static PermissionsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PermissionsRequest.class);
  }

 /**
  * Convert an instance of PermissionsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


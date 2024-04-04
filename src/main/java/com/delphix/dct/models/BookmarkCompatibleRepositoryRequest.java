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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
 * BookmarkCompatibleRepositoryRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class BookmarkCompatibleRepositoryRequest {
  public static final String SERIALIZED_NAME_BOOKMARK_ID = "bookmark_id";
  @SerializedName(SERIALIZED_NAME_BOOKMARK_ID)
  private String bookmarkId;

  public static final String SERIALIZED_NAME_ENVIRONMENT_ID = "environment_id";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_ID)
  private String environmentId;

  public BookmarkCompatibleRepositoryRequest() {
  }

  public BookmarkCompatibleRepositoryRequest bookmarkId(String bookmarkId) {
    this.bookmarkId = bookmarkId;
    return this;
  }

   /**
   * The ID of the bookmark from which to execute the operation. The bookmark must contain only one VDB.
   * @return bookmarkId
  **/
  @javax.annotation.Nonnull
  public String getBookmarkId() {
    return bookmarkId;
  }

  public void setBookmarkId(String bookmarkId) {
    this.bookmarkId = bookmarkId;
  }


  public BookmarkCompatibleRepositoryRequest environmentId(String environmentId) {
    this.environmentId = environmentId;
    return this;
  }

   /**
   * The ID or name of the target environment.
   * @return environmentId
  **/
  @javax.annotation.Nullable
  public String getEnvironmentId() {
    return environmentId;
  }

  public void setEnvironmentId(String environmentId) {
    this.environmentId = environmentId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookmarkCompatibleRepositoryRequest bookmarkCompatibleRepositoryRequest = (BookmarkCompatibleRepositoryRequest) o;
    return Objects.equals(this.bookmarkId, bookmarkCompatibleRepositoryRequest.bookmarkId) &&
        Objects.equals(this.environmentId, bookmarkCompatibleRepositoryRequest.environmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookmarkId, environmentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookmarkCompatibleRepositoryRequest {\n");
    sb.append("    bookmarkId: ").append(toIndentedString(bookmarkId)).append("\n");
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
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
    openapiFields.add("bookmark_id");
    openapiFields.add("environment_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("bookmark_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BookmarkCompatibleRepositoryRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BookmarkCompatibleRepositoryRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BookmarkCompatibleRepositoryRequest is not found in the empty JSON string", BookmarkCompatibleRepositoryRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BookmarkCompatibleRepositoryRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BookmarkCompatibleRepositoryRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BookmarkCompatibleRepositoryRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("bookmark_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bookmark_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bookmark_id").toString()));
      }
      if ((jsonObj.get("environment_id") != null && !jsonObj.get("environment_id").isJsonNull()) && !jsonObj.get("environment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environment_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BookmarkCompatibleRepositoryRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BookmarkCompatibleRepositoryRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BookmarkCompatibleRepositoryRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BookmarkCompatibleRepositoryRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<BookmarkCompatibleRepositoryRequest>() {
           @Override
           public void write(JsonWriter out, BookmarkCompatibleRepositoryRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BookmarkCompatibleRepositoryRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BookmarkCompatibleRepositoryRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BookmarkCompatibleRepositoryRequest
  * @throws IOException if the JSON string is invalid with respect to BookmarkCompatibleRepositoryRequest
  */
  public static BookmarkCompatibleRepositoryRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BookmarkCompatibleRepositoryRequest.class);
  }

 /**
  * Convert an instance of BookmarkCompatibleRepositoryRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


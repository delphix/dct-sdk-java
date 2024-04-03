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
import com.delphix.dct.models.MaskingFileUpload;
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
 * MaskingFileUploadResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:02:33.321319+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class MaskingFileUploadResponse {
  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private MaskingFileUpload _file;

  public MaskingFileUploadResponse() {
  }

  public MaskingFileUploadResponse _file(MaskingFileUpload _file) {
    this._file = _file;
    return this;
  }

   /**
   * Get _file
   * @return _file
  **/
  @javax.annotation.Nullable
  public MaskingFileUpload getFile() {
    return _file;
  }

  public void setFile(MaskingFileUpload _file) {
    this._file = _file;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaskingFileUploadResponse maskingFileUploadResponse = (MaskingFileUploadResponse) o;
    return Objects.equals(this._file, maskingFileUploadResponse._file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_file);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaskingFileUploadResponse {\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
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
    openapiFields.add("file");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MaskingFileUploadResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MaskingFileUploadResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MaskingFileUploadResponse is not found in the empty JSON string", MaskingFileUploadResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MaskingFileUploadResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MaskingFileUploadResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `file`
      if (jsonObj.get("file") != null && !jsonObj.get("file").isJsonNull()) {
        MaskingFileUpload.validateJsonElement(jsonObj.get("file"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MaskingFileUploadResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MaskingFileUploadResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MaskingFileUploadResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MaskingFileUploadResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<MaskingFileUploadResponse>() {
           @Override
           public void write(JsonWriter out, MaskingFileUploadResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MaskingFileUploadResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MaskingFileUploadResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MaskingFileUploadResponse
  * @throws IOException if the JSON string is invalid with respect to MaskingFileUploadResponse
  */
  public static MaskingFileUploadResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MaskingFileUploadResponse.class);
  }

 /**
  * Convert an instance of MaskingFileUploadResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


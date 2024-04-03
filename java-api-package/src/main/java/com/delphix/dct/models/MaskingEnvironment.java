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
 * MaskingEnvironment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:02:33.321319+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class MaskingEnvironment {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ENGINE_ID = "engine_id";
  @SerializedName(SERIALIZED_NAME_ENGINE_ID)
  private String engineId;

  public static final String SERIALIZED_NAME_ENGINE_NAME = "engine_name";
  @SerializedName(SERIALIZED_NAME_ENGINE_NAME)
  private String engineName;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * The purpose of this MaskingEnvironment. MaskingEnvironments with a &#39;MASK&#39; purpose will have access to Masking and Profiling jobs, whereas Environments with a &#39;TOKENIZE&#39; purpose will have access to Tokenization and Re-Identification jobs. Note that any custom purposes created through the UI will be represented as &#39;MASK&#39; purposes, due to the jobs that they have access to.
   */
  @JsonAdapter(PurposeEnum.Adapter.class)
  public enum PurposeEnum {
    MASK("MASK"),
    
    TOKENIZE("TOKENIZE");

    private String value;

    PurposeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PurposeEnum fromValue(String value) {
      for (PurposeEnum b : PurposeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PurposeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PurposeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PurposeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PurposeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PurposeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PURPOSE = "purpose";
  @SerializedName(SERIALIZED_NAME_PURPOSE)
  private PurposeEnum purpose;

  public static final String SERIALIZED_NAME_IS_WORKFLOW_ENABLED = "is_workflow_enabled";
  @SerializedName(SERIALIZED_NAME_IS_WORKFLOW_ENABLED)
  private Boolean isWorkflowEnabled;

  public MaskingEnvironment() {
  }

  public MaskingEnvironment id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The MaskingEnvironment entity ID.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public MaskingEnvironment engineId(String engineId) {
    this.engineId = engineId;
    return this;
  }

   /**
   * The ID of the Engine where this MaskingEnvironment resides.
   * @return engineId
  **/
  @javax.annotation.Nullable
  public String getEngineId() {
    return engineId;
  }

  public void setEngineId(String engineId) {
    this.engineId = engineId;
  }


  public MaskingEnvironment engineName(String engineName) {
    this.engineName = engineName;
    return this;
  }

   /**
   * The name of the Engine where this MaskingEnvironment resides.
   * @return engineName
  **/
  @javax.annotation.Nullable
  public String getEngineName() {
    return engineName;
  }

  public void setEngineName(String engineName) {
    this.engineName = engineName;
  }


  public MaskingEnvironment name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of this MaskingEnvironment.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public MaskingEnvironment purpose(PurposeEnum purpose) {
    this.purpose = purpose;
    return this;
  }

   /**
   * The purpose of this MaskingEnvironment. MaskingEnvironments with a &#39;MASK&#39; purpose will have access to Masking and Profiling jobs, whereas Environments with a &#39;TOKENIZE&#39; purpose will have access to Tokenization and Re-Identification jobs. Note that any custom purposes created through the UI will be represented as &#39;MASK&#39; purposes, due to the jobs that they have access to.
   * @return purpose
  **/
  @javax.annotation.Nullable
  public PurposeEnum getPurpose() {
    return purpose;
  }

  public void setPurpose(PurposeEnum purpose) {
    this.purpose = purpose;
  }


  public MaskingEnvironment isWorkflowEnabled(Boolean isWorkflowEnabled) {
    this.isWorkflowEnabled = isWorkflowEnabled;
    return this;
  }

   /**
   * Get isWorkflowEnabled
   * @return isWorkflowEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getIsWorkflowEnabled() {
    return isWorkflowEnabled;
  }

  public void setIsWorkflowEnabled(Boolean isWorkflowEnabled) {
    this.isWorkflowEnabled = isWorkflowEnabled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaskingEnvironment maskingEnvironment = (MaskingEnvironment) o;
    return Objects.equals(this.id, maskingEnvironment.id) &&
        Objects.equals(this.engineId, maskingEnvironment.engineId) &&
        Objects.equals(this.engineName, maskingEnvironment.engineName) &&
        Objects.equals(this.name, maskingEnvironment.name) &&
        Objects.equals(this.purpose, maskingEnvironment.purpose) &&
        Objects.equals(this.isWorkflowEnabled, maskingEnvironment.isWorkflowEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, engineId, engineName, name, purpose, isWorkflowEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaskingEnvironment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    engineId: ").append(toIndentedString(engineId)).append("\n");
    sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    isWorkflowEnabled: ").append(toIndentedString(isWorkflowEnabled)).append("\n");
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
    openapiFields.add("engine_id");
    openapiFields.add("engine_name");
    openapiFields.add("name");
    openapiFields.add("purpose");
    openapiFields.add("is_workflow_enabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MaskingEnvironment
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MaskingEnvironment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MaskingEnvironment is not found in the empty JSON string", MaskingEnvironment.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MaskingEnvironment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MaskingEnvironment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("engine_id") != null && !jsonObj.get("engine_id").isJsonNull()) && !jsonObj.get("engine_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `engine_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("engine_id").toString()));
      }
      if ((jsonObj.get("engine_name") != null && !jsonObj.get("engine_name").isJsonNull()) && !jsonObj.get("engine_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `engine_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("engine_name").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("purpose") != null && !jsonObj.get("purpose").isJsonNull()) && !jsonObj.get("purpose").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `purpose` to be a primitive type in the JSON string but got `%s`", jsonObj.get("purpose").toString()));
      }
      // validate the optional field `purpose`
      if (jsonObj.get("purpose") != null && !jsonObj.get("purpose").isJsonNull()) {
        PurposeEnum.validateJsonElement(jsonObj.get("purpose"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MaskingEnvironment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MaskingEnvironment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MaskingEnvironment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MaskingEnvironment.class));

       return (TypeAdapter<T>) new TypeAdapter<MaskingEnvironment>() {
           @Override
           public void write(JsonWriter out, MaskingEnvironment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MaskingEnvironment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MaskingEnvironment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MaskingEnvironment
  * @throws IOException if the JSON string is invalid with respect to MaskingEnvironment
  */
  public static MaskingEnvironment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MaskingEnvironment.class);
  }

 /**
  * Convert an instance of MaskingEnvironment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
 * An oracle cluster node instance.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:02:33.321319+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class OracleClusterNodeInstance {
  public static final String SERIALIZED_NAME_INSTANCE_NAME = "instance_name";
  @SerializedName(SERIALIZED_NAME_INSTANCE_NAME)
  private String instanceName;

  public static final String SERIALIZED_NAME_INSTANCE_NUMBER = "instance_number";
  @SerializedName(SERIALIZED_NAME_INSTANCE_NUMBER)
  private Integer instanceNumber;

  public static final String SERIALIZED_NAME_SOURCE_ID = "source_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private String sourceId;

  public OracleClusterNodeInstance() {
  }

  public OracleClusterNodeInstance instanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

   /**
   * The name of this instance.
   * @return instanceName
  **/
  @javax.annotation.Nullable
  public String getInstanceName() {
    return instanceName;
  }

  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
  }


  public OracleClusterNodeInstance instanceNumber(Integer instanceNumber) {
    this.instanceNumber = instanceNumber;
    return this;
  }

   /**
   * The number of this instance.
   * @return instanceNumber
  **/
  @javax.annotation.Nullable
  public Integer getInstanceNumber() {
    return instanceNumber;
  }

  public void setInstanceNumber(Integer instanceNumber) {
    this.instanceNumber = instanceNumber;
  }


  public OracleClusterNodeInstance sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * The id of Source this instance belongs to.
   * @return sourceId
  **/
  @javax.annotation.Nullable
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OracleClusterNodeInstance oracleClusterNodeInstance = (OracleClusterNodeInstance) o;
    return Objects.equals(this.instanceName, oracleClusterNodeInstance.instanceName) &&
        Objects.equals(this.instanceNumber, oracleClusterNodeInstance.instanceNumber) &&
        Objects.equals(this.sourceId, oracleClusterNodeInstance.sourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceName, instanceNumber, sourceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OracleClusterNodeInstance {\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    instanceNumber: ").append(toIndentedString(instanceNumber)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
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
    openapiFields.add("instance_name");
    openapiFields.add("instance_number");
    openapiFields.add("source_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OracleClusterNodeInstance
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OracleClusterNodeInstance.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OracleClusterNodeInstance is not found in the empty JSON string", OracleClusterNodeInstance.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OracleClusterNodeInstance.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OracleClusterNodeInstance` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("instance_name") != null && !jsonObj.get("instance_name").isJsonNull()) && !jsonObj.get("instance_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instance_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instance_name").toString()));
      }
      if ((jsonObj.get("source_id") != null && !jsonObj.get("source_id").isJsonNull()) && !jsonObj.get("source_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OracleClusterNodeInstance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OracleClusterNodeInstance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OracleClusterNodeInstance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OracleClusterNodeInstance.class));

       return (TypeAdapter<T>) new TypeAdapter<OracleClusterNodeInstance>() {
           @Override
           public void write(JsonWriter out, OracleClusterNodeInstance value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OracleClusterNodeInstance read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OracleClusterNodeInstance given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OracleClusterNodeInstance
  * @throws IOException if the JSON string is invalid with respect to OracleClusterNodeInstance
  */
  public static OracleClusterNodeInstance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OracleClusterNodeInstance.class);
  }

 /**
  * Convert an instance of OracleClusterNodeInstance to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


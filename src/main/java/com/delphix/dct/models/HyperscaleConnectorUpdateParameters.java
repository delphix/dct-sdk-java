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
import java.util.HashMap;
import java.util.Map;

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
 * The updatable properties of a Hyperscale Connector.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class HyperscaleConnectorUpdateParameters {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SOURCE_USERNAME = "source_username";
  @SerializedName(SERIALIZED_NAME_SOURCE_USERNAME)
  private String sourceUsername;

  public static final String SERIALIZED_NAME_SOURCE_PASSWORD = "source_password";
  @SerializedName(SERIALIZED_NAME_SOURCE_PASSWORD)
  private String sourcePassword;

  public static final String SERIALIZED_NAME_SOURCE_JDBC_URL = "source_jdbc_url";
  @SerializedName(SERIALIZED_NAME_SOURCE_JDBC_URL)
  private String sourceJdbcUrl;

  public static final String SERIALIZED_NAME_SOURCE_MONGO_URL = "source_mongo_url";
  @SerializedName(SERIALIZED_NAME_SOURCE_MONGO_URL)
  private String sourceMongoUrl;

  public static final String SERIALIZED_NAME_SOURCE_FILESYSTEM_PATH = "source_filesystem_path";
  @SerializedName(SERIALIZED_NAME_SOURCE_FILESYSTEM_PATH)
  private String sourceFilesystemPath;

  public static final String SERIALIZED_NAME_SOURCE_CONNECTION_PROPERTIES = "source_connection_properties";
  @SerializedName(SERIALIZED_NAME_SOURCE_CONNECTION_PROPERTIES)
  private Map<String, String> sourceConnectionProperties = new HashMap<>();

  public static final String SERIALIZED_NAME_TARGET_USERNAME = "target_username";
  @SerializedName(SERIALIZED_NAME_TARGET_USERNAME)
  private String targetUsername;

  public static final String SERIALIZED_NAME_TARGET_PASSWORD = "target_password";
  @SerializedName(SERIALIZED_NAME_TARGET_PASSWORD)
  private String targetPassword;

  public static final String SERIALIZED_NAME_TARGET_JDBC_URL = "target_jdbc_url";
  @SerializedName(SERIALIZED_NAME_TARGET_JDBC_URL)
  private String targetJdbcUrl;

  public static final String SERIALIZED_NAME_TARGET_MONGO_URL = "target_mongo_url";
  @SerializedName(SERIALIZED_NAME_TARGET_MONGO_URL)
  private String targetMongoUrl;

  public static final String SERIALIZED_NAME_TARGET_FILESYSTEM_PATH = "target_filesystem_path";
  @SerializedName(SERIALIZED_NAME_TARGET_FILESYSTEM_PATH)
  private String targetFilesystemPath;

  public static final String SERIALIZED_NAME_TARGET_CONNECTION_PROPERTIES = "target_connection_properties";
  @SerializedName(SERIALIZED_NAME_TARGET_CONNECTION_PROPERTIES)
  private Map<String, String> targetConnectionProperties = new HashMap<>();

  public HyperscaleConnectorUpdateParameters() {
  }

  public HyperscaleConnectorUpdateParameters name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public HyperscaleConnectorUpdateParameters sourceUsername(String sourceUsername) {
    this.sourceUsername = sourceUsername;
    return this;
  }

   /**
   * The username this Connector will use to connect to the source database.
   * @return sourceUsername
  **/
  @javax.annotation.Nullable
  public String getSourceUsername() {
    return sourceUsername;
  }

  public void setSourceUsername(String sourceUsername) {
    this.sourceUsername = sourceUsername;
  }


  public HyperscaleConnectorUpdateParameters sourcePassword(String sourcePassword) {
    this.sourcePassword = sourcePassword;
    return this;
  }

   /**
   * The password this Connector will use to connect to the source database.
   * @return sourcePassword
  **/
  @javax.annotation.Nullable
  public String getSourcePassword() {
    return sourcePassword;
  }

  public void setSourcePassword(String sourcePassword) {
    this.sourcePassword = sourcePassword;
  }


  public HyperscaleConnectorUpdateParameters sourceJdbcUrl(String sourceJdbcUrl) {
    this.sourceJdbcUrl = sourceJdbcUrl;
    return this;
  }

   /**
   * The JDBC URL used to connect to the source database.
   * @return sourceJdbcUrl
  **/
  @javax.annotation.Nullable
  public String getSourceJdbcUrl() {
    return sourceJdbcUrl;
  }

  public void setSourceJdbcUrl(String sourceJdbcUrl) {
    this.sourceJdbcUrl = sourceJdbcUrl;
  }


  public HyperscaleConnectorUpdateParameters sourceMongoUrl(String sourceMongoUrl) {
    this.sourceMongoUrl = sourceMongoUrl;
    return this;
  }

   /**
   * The MongoDB URL used to connect to the source database.
   * @return sourceMongoUrl
  **/
  @javax.annotation.Nullable
  public String getSourceMongoUrl() {
    return sourceMongoUrl;
  }

  public void setSourceMongoUrl(String sourceMongoUrl) {
    this.sourceMongoUrl = sourceMongoUrl;
  }


  public HyperscaleConnectorUpdateParameters sourceFilesystemPath(String sourceFilesystemPath) {
    this.sourceFilesystemPath = sourceFilesystemPath;
    return this;
  }

   /**
   * The path on the filesystem where source files must be read (Delimited files Only).
   * @return sourceFilesystemPath
  **/
  @javax.annotation.Nullable
  public String getSourceFilesystemPath() {
    return sourceFilesystemPath;
  }

  public void setSourceFilesystemPath(String sourceFilesystemPath) {
    this.sourceFilesystemPath = sourceFilesystemPath;
  }


  public HyperscaleConnectorUpdateParameters sourceConnectionProperties(Map<String, String> sourceConnectionProperties) {
    this.sourceConnectionProperties = sourceConnectionProperties;
    return this;
  }

  public HyperscaleConnectorUpdateParameters putSourceConnectionPropertiesItem(String key, String sourceConnectionPropertiesItem) {
    if (this.sourceConnectionProperties == null) {
      this.sourceConnectionProperties = new HashMap<>();
    }
    this.sourceConnectionProperties.put(key, sourceConnectionPropertiesItem);
    return this;
  }

   /**
   * Get sourceConnectionProperties
   * @return sourceConnectionProperties
  **/
  @javax.annotation.Nullable
  public Map<String, String> getSourceConnectionProperties() {
    return sourceConnectionProperties;
  }

  public void setSourceConnectionProperties(Map<String, String> sourceConnectionProperties) {
    this.sourceConnectionProperties = sourceConnectionProperties;
  }


  public HyperscaleConnectorUpdateParameters targetUsername(String targetUsername) {
    this.targetUsername = targetUsername;
    return this;
  }

   /**
   * The username this Connector will use to connect to the target database.
   * @return targetUsername
  **/
  @javax.annotation.Nullable
  public String getTargetUsername() {
    return targetUsername;
  }

  public void setTargetUsername(String targetUsername) {
    this.targetUsername = targetUsername;
  }


  public HyperscaleConnectorUpdateParameters targetPassword(String targetPassword) {
    this.targetPassword = targetPassword;
    return this;
  }

   /**
   * The username this Connector will use to connect to the target database.
   * @return targetPassword
  **/
  @javax.annotation.Nullable
  public String getTargetPassword() {
    return targetPassword;
  }

  public void setTargetPassword(String targetPassword) {
    this.targetPassword = targetPassword;
  }


  public HyperscaleConnectorUpdateParameters targetJdbcUrl(String targetJdbcUrl) {
    this.targetJdbcUrl = targetJdbcUrl;
    return this;
  }

   /**
   * The JDBC URL used to connect to the target database.
   * @return targetJdbcUrl
  **/
  @javax.annotation.Nullable
  public String getTargetJdbcUrl() {
    return targetJdbcUrl;
  }

  public void setTargetJdbcUrl(String targetJdbcUrl) {
    this.targetJdbcUrl = targetJdbcUrl;
  }


  public HyperscaleConnectorUpdateParameters targetMongoUrl(String targetMongoUrl) {
    this.targetMongoUrl = targetMongoUrl;
    return this;
  }

   /**
   * The MongoDB URL used to connect to the target database.
   * @return targetMongoUrl
  **/
  @javax.annotation.Nullable
  public String getTargetMongoUrl() {
    return targetMongoUrl;
  }

  public void setTargetMongoUrl(String targetMongoUrl) {
    this.targetMongoUrl = targetMongoUrl;
  }


  public HyperscaleConnectorUpdateParameters targetFilesystemPath(String targetFilesystemPath) {
    this.targetFilesystemPath = targetFilesystemPath;
    return this;
  }

   /**
   * The path on the filesystem where target files must be written (Delimited files Only).
   * @return targetFilesystemPath
  **/
  @javax.annotation.Nullable
  public String getTargetFilesystemPath() {
    return targetFilesystemPath;
  }

  public void setTargetFilesystemPath(String targetFilesystemPath) {
    this.targetFilesystemPath = targetFilesystemPath;
  }


  public HyperscaleConnectorUpdateParameters targetConnectionProperties(Map<String, String> targetConnectionProperties) {
    this.targetConnectionProperties = targetConnectionProperties;
    return this;
  }

  public HyperscaleConnectorUpdateParameters putTargetConnectionPropertiesItem(String key, String targetConnectionPropertiesItem) {
    if (this.targetConnectionProperties == null) {
      this.targetConnectionProperties = new HashMap<>();
    }
    this.targetConnectionProperties.put(key, targetConnectionPropertiesItem);
    return this;
  }

   /**
   * Get targetConnectionProperties
   * @return targetConnectionProperties
  **/
  @javax.annotation.Nullable
  public Map<String, String> getTargetConnectionProperties() {
    return targetConnectionProperties;
  }

  public void setTargetConnectionProperties(Map<String, String> targetConnectionProperties) {
    this.targetConnectionProperties = targetConnectionProperties;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HyperscaleConnectorUpdateParameters hyperscaleConnectorUpdateParameters = (HyperscaleConnectorUpdateParameters) o;
    return Objects.equals(this.name, hyperscaleConnectorUpdateParameters.name) &&
        Objects.equals(this.sourceUsername, hyperscaleConnectorUpdateParameters.sourceUsername) &&
        Objects.equals(this.sourcePassword, hyperscaleConnectorUpdateParameters.sourcePassword) &&
        Objects.equals(this.sourceJdbcUrl, hyperscaleConnectorUpdateParameters.sourceJdbcUrl) &&
        Objects.equals(this.sourceMongoUrl, hyperscaleConnectorUpdateParameters.sourceMongoUrl) &&
        Objects.equals(this.sourceFilesystemPath, hyperscaleConnectorUpdateParameters.sourceFilesystemPath) &&
        Objects.equals(this.sourceConnectionProperties, hyperscaleConnectorUpdateParameters.sourceConnectionProperties) &&
        Objects.equals(this.targetUsername, hyperscaleConnectorUpdateParameters.targetUsername) &&
        Objects.equals(this.targetPassword, hyperscaleConnectorUpdateParameters.targetPassword) &&
        Objects.equals(this.targetJdbcUrl, hyperscaleConnectorUpdateParameters.targetJdbcUrl) &&
        Objects.equals(this.targetMongoUrl, hyperscaleConnectorUpdateParameters.targetMongoUrl) &&
        Objects.equals(this.targetFilesystemPath, hyperscaleConnectorUpdateParameters.targetFilesystemPath) &&
        Objects.equals(this.targetConnectionProperties, hyperscaleConnectorUpdateParameters.targetConnectionProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sourceUsername, sourcePassword, sourceJdbcUrl, sourceMongoUrl, sourceFilesystemPath, sourceConnectionProperties, targetUsername, targetPassword, targetJdbcUrl, targetMongoUrl, targetFilesystemPath, targetConnectionProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HyperscaleConnectorUpdateParameters {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sourceUsername: ").append(toIndentedString(sourceUsername)).append("\n");
    sb.append("    sourcePassword: ").append(toIndentedString(sourcePassword)).append("\n");
    sb.append("    sourceJdbcUrl: ").append(toIndentedString(sourceJdbcUrl)).append("\n");
    sb.append("    sourceMongoUrl: ").append(toIndentedString(sourceMongoUrl)).append("\n");
    sb.append("    sourceFilesystemPath: ").append(toIndentedString(sourceFilesystemPath)).append("\n");
    sb.append("    sourceConnectionProperties: ").append(toIndentedString(sourceConnectionProperties)).append("\n");
    sb.append("    targetUsername: ").append(toIndentedString(targetUsername)).append("\n");
    sb.append("    targetPassword: ").append(toIndentedString(targetPassword)).append("\n");
    sb.append("    targetJdbcUrl: ").append(toIndentedString(targetJdbcUrl)).append("\n");
    sb.append("    targetMongoUrl: ").append(toIndentedString(targetMongoUrl)).append("\n");
    sb.append("    targetFilesystemPath: ").append(toIndentedString(targetFilesystemPath)).append("\n");
    sb.append("    targetConnectionProperties: ").append(toIndentedString(targetConnectionProperties)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("source_username");
    openapiFields.add("source_password");
    openapiFields.add("source_jdbc_url");
    openapiFields.add("source_mongo_url");
    openapiFields.add("source_filesystem_path");
    openapiFields.add("source_connection_properties");
    openapiFields.add("target_username");
    openapiFields.add("target_password");
    openapiFields.add("target_jdbc_url");
    openapiFields.add("target_mongo_url");
    openapiFields.add("target_filesystem_path");
    openapiFields.add("target_connection_properties");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to HyperscaleConnectorUpdateParameters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HyperscaleConnectorUpdateParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HyperscaleConnectorUpdateParameters is not found in the empty JSON string", HyperscaleConnectorUpdateParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HyperscaleConnectorUpdateParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HyperscaleConnectorUpdateParameters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("source_username") != null && !jsonObj.get("source_username").isJsonNull()) && !jsonObj.get("source_username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_username").toString()));
      }
      if ((jsonObj.get("source_password") != null && !jsonObj.get("source_password").isJsonNull()) && !jsonObj.get("source_password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_password").toString()));
      }
      if ((jsonObj.get("source_jdbc_url") != null && !jsonObj.get("source_jdbc_url").isJsonNull()) && !jsonObj.get("source_jdbc_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_jdbc_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_jdbc_url").toString()));
      }
      if ((jsonObj.get("source_mongo_url") != null && !jsonObj.get("source_mongo_url").isJsonNull()) && !jsonObj.get("source_mongo_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_mongo_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_mongo_url").toString()));
      }
      if ((jsonObj.get("source_filesystem_path") != null && !jsonObj.get("source_filesystem_path").isJsonNull()) && !jsonObj.get("source_filesystem_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_filesystem_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_filesystem_path").toString()));
      }
      if ((jsonObj.get("target_username") != null && !jsonObj.get("target_username").isJsonNull()) && !jsonObj.get("target_username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_username").toString()));
      }
      if ((jsonObj.get("target_password") != null && !jsonObj.get("target_password").isJsonNull()) && !jsonObj.get("target_password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_password").toString()));
      }
      if ((jsonObj.get("target_jdbc_url") != null && !jsonObj.get("target_jdbc_url").isJsonNull()) && !jsonObj.get("target_jdbc_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_jdbc_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_jdbc_url").toString()));
      }
      if ((jsonObj.get("target_mongo_url") != null && !jsonObj.get("target_mongo_url").isJsonNull()) && !jsonObj.get("target_mongo_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_mongo_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_mongo_url").toString()));
      }
      if ((jsonObj.get("target_filesystem_path") != null && !jsonObj.get("target_filesystem_path").isJsonNull()) && !jsonObj.get("target_filesystem_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_filesystem_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_filesystem_path").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HyperscaleConnectorUpdateParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HyperscaleConnectorUpdateParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HyperscaleConnectorUpdateParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HyperscaleConnectorUpdateParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<HyperscaleConnectorUpdateParameters>() {
           @Override
           public void write(JsonWriter out, HyperscaleConnectorUpdateParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HyperscaleConnectorUpdateParameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of HyperscaleConnectorUpdateParameters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HyperscaleConnectorUpdateParameters
  * @throws IOException if the JSON string is invalid with respect to HyperscaleConnectorUpdateParameters
  */
  public static HyperscaleConnectorUpdateParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HyperscaleConnectorUpdateParameters.class);
  }

 /**
  * Convert an instance of HyperscaleConnectorUpdateParameters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


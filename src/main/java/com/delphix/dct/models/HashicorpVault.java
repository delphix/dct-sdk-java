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
import java.util.HashMap;
import java.util.List;
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
 * Configuration required to connect and authenticate with an Hashicorp Vault which stores engines username and passwords.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class HashicorpVault {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_ENV_VARIABLES = "env_variables";
  @SerializedName(SERIALIZED_NAME_ENV_VARIABLES)
  private Map<String, String> envVariables = new HashMap<>();

  public static final String SERIALIZED_NAME_LOGIN_COMMAND_ARGS = "login_command_args";
  @SerializedName(SERIALIZED_NAME_LOGIN_COMMAND_ARGS)
  private List<String> loginCommandArgs;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<Tag> tags;

  public HashicorpVault() {
  }

  public HashicorpVault(
     Long id
  ) {
    this();
    this.id = id;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }



  public HashicorpVault envVariables(Map<String, String> envVariables) {
    this.envVariables = envVariables;
    return this;
  }

  public HashicorpVault putEnvVariablesItem(String key, String envVariablesItem) {
    if (this.envVariables == null) {
      this.envVariables = new HashMap<>();
    }
    this.envVariables.put(key, envVariablesItem);
    return this;
  }

   /**
   * Environment variables to set when invoking the Vault CLI tool. The environment variables will be used both to login to the vault (if this step is required) and to retrieve engine username and passwords. 
   * @return envVariables
  **/
  @javax.annotation.Nullable
  public Map<String, String> getEnvVariables() {
    return envVariables;
  }

  public void setEnvVariables(Map<String, String> envVariables) {
    this.envVariables = envVariables;
  }


  public HashicorpVault loginCommandArgs(List<String> loginCommandArgs) {
    this.loginCommandArgs = loginCommandArgs;
    return this;
  }

  public HashicorpVault addLoginCommandArgsItem(String loginCommandArgsItem) {
    if (this.loginCommandArgs == null) {
      this.loginCommandArgs = new ArrayList<>();
    }
    this.loginCommandArgs.add(loginCommandArgsItem);
    return this;
  }

   /**
   * Arguments to the \&quot;vault\&quot; CLI tool to be used to fetch a client token (or \&quot;login\&quot;). If supporting files, such as TLS certificates, must be used to authenticate, they can be mounted to the /etc/config directory. This property must not be set when using the TOKEN authentication method as login is not required. 
   * @return loginCommandArgs
  **/
  @javax.annotation.Nullable
  public List<String> getLoginCommandArgs() {
    return loginCommandArgs;
  }

  public void setLoginCommandArgs(List<String> loginCommandArgs) {
    this.loginCommandArgs = loginCommandArgs;
  }


  public HashicorpVault tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public HashicorpVault addTagsItem(Tag tagsItem) {
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
    HashicorpVault hashicorpVault = (HashicorpVault) o;
    return Objects.equals(this.id, hashicorpVault.id) &&
        Objects.equals(this.envVariables, hashicorpVault.envVariables) &&
        Objects.equals(this.loginCommandArgs, hashicorpVault.loginCommandArgs) &&
        Objects.equals(this.tags, hashicorpVault.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, envVariables, loginCommandArgs, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HashicorpVault {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    envVariables: ").append(toIndentedString(envVariables)).append("\n");
    sb.append("    loginCommandArgs: ").append(toIndentedString(loginCommandArgs)).append("\n");
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
    openapiFields.add("env_variables");
    openapiFields.add("login_command_args");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to HashicorpVault
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HashicorpVault.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HashicorpVault is not found in the empty JSON string", HashicorpVault.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HashicorpVault.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HashicorpVault` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("login_command_args") != null && !jsonObj.get("login_command_args").isJsonNull() && !jsonObj.get("login_command_args").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `login_command_args` to be an array in the JSON string but got `%s`", jsonObj.get("login_command_args").toString()));
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
       if (!HashicorpVault.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HashicorpVault' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HashicorpVault> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HashicorpVault.class));

       return (TypeAdapter<T>) new TypeAdapter<HashicorpVault>() {
           @Override
           public void write(JsonWriter out, HashicorpVault value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HashicorpVault read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of HashicorpVault given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HashicorpVault
  * @throws IOException if the JSON string is invalid with respect to HashicorpVault
  */
  public static HashicorpVault fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HashicorpVault.class);
  }

 /**
  * Convert an instance of HashicorpVault to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


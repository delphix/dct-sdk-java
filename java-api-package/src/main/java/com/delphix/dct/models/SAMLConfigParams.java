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
 * Parameters to read or update SAML Config
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:02:33.321319+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class SAMLConfigParams {
  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled = false;

  public static final String SERIALIZED_NAME_AUTO_CREATE_USERS = "auto_create_users";
  @SerializedName(SERIALIZED_NAME_AUTO_CREATE_USERS)
  private Boolean autoCreateUsers = true;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private String metadata;

  public static final String SERIALIZED_NAME_ENTITY_ID = "entity_id";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private String entityId;

  public static final String SERIALIZED_NAME_RESPONSE_SKEW = "response_skew";
  @SerializedName(SERIALIZED_NAME_RESPONSE_SKEW)
  private Integer responseSkew = 120;

  public static final String SERIALIZED_NAME_GROUP_ATTR = "group_attr";
  @SerializedName(SERIALIZED_NAME_GROUP_ATTR)
  private String groupAttr = "groups";

  public static final String SERIALIZED_NAME_FIRST_NAME_ATTR = "first_name_attr";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME_ATTR)
  private String firstNameAttr = "firstName";

  public static final String SERIALIZED_NAME_LAST_NAME_ATTR = "last_name_attr";
  @SerializedName(SERIALIZED_NAME_LAST_NAME_ATTR)
  private String lastNameAttr = "lastName";

  public SAMLConfigParams() {
  }

  public SAMLConfigParams enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * When set, SAML settings are enabled. False by default.
   * @return enabled
  **/
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public SAMLConfigParams autoCreateUsers(Boolean autoCreateUsers) {
    this.autoCreateUsers = autoCreateUsers;
    return this;
  }

   /**
   * When set, the system will automatically create new Accounts for those who have logged in using SAML. This must be true if SAML user is not already registered in system. True by default.
   * @return autoCreateUsers
  **/
  @javax.annotation.Nullable
  public Boolean getAutoCreateUsers() {
    return autoCreateUsers;
  }

  public void setAutoCreateUsers(Boolean autoCreateUsers) {
    this.autoCreateUsers = autoCreateUsers;
  }


  public SAMLConfigParams metadata(String metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * IdP metadata for this service provider. This is a required property for successful SAML authentication.
   * @return metadata
  **/
  @javax.annotation.Nullable
  public String getMetadata() {
    return metadata;
  }

  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }


  public SAMLConfigParams entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * Unique identifier of this instance as a SAML/SSO service provider.
   * @return entityId
  **/
  @javax.annotation.Nullable
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  public SAMLConfigParams responseSkew(Integer responseSkew) {
    this.responseSkew = responseSkew;
    return this;
  }

   /**
   * Maximum time difference allowed between a SAML response and the DCT&#39;s current time, in seconds. If not set, it defaults to 120 seconds.
   * @return responseSkew
  **/
  @javax.annotation.Nullable
  public Integer getResponseSkew() {
    return responseSkew;
  }

  public void setResponseSkew(Integer responseSkew) {
    this.responseSkew = responseSkew;
  }


  public SAMLConfigParams groupAttr(String groupAttr) {
    this.groupAttr = groupAttr;
    return this;
  }

   /**
   * Group mapped attribute on SAML to create account tags in DCT.
   * @return groupAttr
  **/
  @javax.annotation.Nullable
  public String getGroupAttr() {
    return groupAttr;
  }

  public void setGroupAttr(String groupAttr) {
    this.groupAttr = groupAttr;
  }


  public SAMLConfigParams firstNameAttr(String firstNameAttr) {
    this.firstNameAttr = firstNameAttr;
    return this;
  }

   /**
   * First name attribute mapped on SAML used for mapping on DCT account.
   * @return firstNameAttr
  **/
  @javax.annotation.Nullable
  public String getFirstNameAttr() {
    return firstNameAttr;
  }

  public void setFirstNameAttr(String firstNameAttr) {
    this.firstNameAttr = firstNameAttr;
  }


  public SAMLConfigParams lastNameAttr(String lastNameAttr) {
    this.lastNameAttr = lastNameAttr;
    return this;
  }

   /**
   * Last name attribute mapped on SAML used for mapping on DCT account.
   * @return lastNameAttr
  **/
  @javax.annotation.Nullable
  public String getLastNameAttr() {
    return lastNameAttr;
  }

  public void setLastNameAttr(String lastNameAttr) {
    this.lastNameAttr = lastNameAttr;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SAMLConfigParams saMLConfigParams = (SAMLConfigParams) o;
    return Objects.equals(this.enabled, saMLConfigParams.enabled) &&
        Objects.equals(this.autoCreateUsers, saMLConfigParams.autoCreateUsers) &&
        Objects.equals(this.metadata, saMLConfigParams.metadata) &&
        Objects.equals(this.entityId, saMLConfigParams.entityId) &&
        Objects.equals(this.responseSkew, saMLConfigParams.responseSkew) &&
        Objects.equals(this.groupAttr, saMLConfigParams.groupAttr) &&
        Objects.equals(this.firstNameAttr, saMLConfigParams.firstNameAttr) &&
        Objects.equals(this.lastNameAttr, saMLConfigParams.lastNameAttr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, autoCreateUsers, metadata, entityId, responseSkew, groupAttr, firstNameAttr, lastNameAttr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SAMLConfigParams {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    autoCreateUsers: ").append(toIndentedString(autoCreateUsers)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    responseSkew: ").append(toIndentedString(responseSkew)).append("\n");
    sb.append("    groupAttr: ").append(toIndentedString(groupAttr)).append("\n");
    sb.append("    firstNameAttr: ").append(toIndentedString(firstNameAttr)).append("\n");
    sb.append("    lastNameAttr: ").append(toIndentedString(lastNameAttr)).append("\n");
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
    openapiFields.add("enabled");
    openapiFields.add("auto_create_users");
    openapiFields.add("metadata");
    openapiFields.add("entity_id");
    openapiFields.add("response_skew");
    openapiFields.add("group_attr");
    openapiFields.add("first_name_attr");
    openapiFields.add("last_name_attr");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SAMLConfigParams
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SAMLConfigParams.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SAMLConfigParams is not found in the empty JSON string", SAMLConfigParams.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SAMLConfigParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SAMLConfigParams` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) && !jsonObj.get("metadata").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metadata").toString()));
      }
      if ((jsonObj.get("entity_id") != null && !jsonObj.get("entity_id").isJsonNull()) && !jsonObj.get("entity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity_id").toString()));
      }
      if ((jsonObj.get("group_attr") != null && !jsonObj.get("group_attr").isJsonNull()) && !jsonObj.get("group_attr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group_attr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group_attr").toString()));
      }
      if ((jsonObj.get("first_name_attr") != null && !jsonObj.get("first_name_attr").isJsonNull()) && !jsonObj.get("first_name_attr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name_attr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name_attr").toString()));
      }
      if ((jsonObj.get("last_name_attr") != null && !jsonObj.get("last_name_attr").isJsonNull()) && !jsonObj.get("last_name_attr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name_attr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name_attr").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SAMLConfigParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SAMLConfigParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SAMLConfigParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SAMLConfigParams.class));

       return (TypeAdapter<T>) new TypeAdapter<SAMLConfigParams>() {
           @Override
           public void write(JsonWriter out, SAMLConfigParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SAMLConfigParams read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SAMLConfigParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SAMLConfigParams
  * @throws IOException if the JSON string is invalid with respect to SAMLConfigParams
  */
  public static SAMLConfigParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SAMLConfigParams.class);
  }

 /**
  * Convert an instance of SAMLConfigParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import com.delphix.dct.models.ObjectPermissionAccessGroups;
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
 * The account details for object permission.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class ObjectPermissionAccount {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ACCESS_GROUPS = "access_groups";
  @SerializedName(SERIALIZED_NAME_ACCESS_GROUPS)
  private List<ObjectPermissionAccessGroups> accessGroups;

  public ObjectPermissionAccount() {
  }

  public ObjectPermissionAccount id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Numeric ID of the Account.
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public ObjectPermissionAccount firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of the Account.
   * @return firstName
  **/
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public ObjectPermissionAccount lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of the Account.
   * @return lastName
  **/
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public ObjectPermissionAccount email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email of the Account.
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public ObjectPermissionAccount accessGroups(List<ObjectPermissionAccessGroups> accessGroups) {
    this.accessGroups = accessGroups;
    return this;
  }

  public ObjectPermissionAccount addAccessGroupsItem(ObjectPermissionAccessGroups accessGroupsItem) {
    if (this.accessGroups == null) {
      this.accessGroups = new ArrayList<>();
    }
    this.accessGroups.add(accessGroupsItem);
    return this;
  }

   /**
   * Access groups of the Account.
   * @return accessGroups
  **/
  @javax.annotation.Nullable
  public List<ObjectPermissionAccessGroups> getAccessGroups() {
    return accessGroups;
  }

  public void setAccessGroups(List<ObjectPermissionAccessGroups> accessGroups) {
    this.accessGroups = accessGroups;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectPermissionAccount objectPermissionAccount = (ObjectPermissionAccount) o;
    return Objects.equals(this.id, objectPermissionAccount.id) &&
        Objects.equals(this.firstName, objectPermissionAccount.firstName) &&
        Objects.equals(this.lastName, objectPermissionAccount.lastName) &&
        Objects.equals(this.email, objectPermissionAccount.email) &&
        Objects.equals(this.accessGroups, objectPermissionAccount.accessGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, email, accessGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectPermissionAccount {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    accessGroups: ").append(toIndentedString(accessGroups)).append("\n");
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
    openapiFields.add("first_name");
    openapiFields.add("last_name");
    openapiFields.add("email");
    openapiFields.add("access_groups");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ObjectPermissionAccount
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ObjectPermissionAccount.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ObjectPermissionAccount is not found in the empty JSON string", ObjectPermissionAccount.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ObjectPermissionAccount.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ObjectPermissionAccount` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull()) && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if ((jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull()) && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (jsonObj.get("access_groups") != null && !jsonObj.get("access_groups").isJsonNull()) {
        JsonArray jsonArrayaccessGroups = jsonObj.getAsJsonArray("access_groups");
        if (jsonArrayaccessGroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("access_groups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `access_groups` to be an array in the JSON string but got `%s`", jsonObj.get("access_groups").toString()));
          }

          // validate the optional field `access_groups` (array)
          for (int i = 0; i < jsonArrayaccessGroups.size(); i++) {
            ObjectPermissionAccessGroups.validateJsonElement(jsonArrayaccessGroups.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ObjectPermissionAccount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ObjectPermissionAccount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ObjectPermissionAccount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ObjectPermissionAccount.class));

       return (TypeAdapter<T>) new TypeAdapter<ObjectPermissionAccount>() {
           @Override
           public void write(JsonWriter out, ObjectPermissionAccount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ObjectPermissionAccount read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ObjectPermissionAccount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ObjectPermissionAccount
  * @throws IOException if the JSON string is invalid with respect to ObjectPermissionAccount
  */
  public static ObjectPermissionAccount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ObjectPermissionAccount.class);
  }

 /**
  * Convert an instance of ObjectPermissionAccount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


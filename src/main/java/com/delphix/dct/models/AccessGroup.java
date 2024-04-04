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
import com.delphix.dct.models.AccessGroupScope;
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
 * An Access group is the DCT mechanism to grant roles to accounts. Each account has its own Access Group which can be used to manage permissions for that account, and an unlimited number of other Access groups can be created to manage permissions by groups of accounts.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:02:33.321319+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class AccessGroup {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SINGLE_ACCOUNT = "single_account";
  @SerializedName(SERIALIZED_NAME_SINGLE_ACCOUNT)
  private Boolean singleAccount;

  public static final String SERIALIZED_NAME_ACCOUNT_IDS = "account_ids";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_IDS)
  private List<Long> accountIds;

  public static final String SERIALIZED_NAME_TAGGED_ACCOUNT_IDS = "tagged_account_ids";
  @SerializedName(SERIALIZED_NAME_TAGGED_ACCOUNT_IDS)
  private List<Long> taggedAccountIds;

  public static final String SERIALIZED_NAME_ACCOUNT_TAGS = "account_tags";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TAGS)
  private List<Tag> accountTags;

  public static final String SERIALIZED_NAME_SCOPES = "scopes";
  @SerializedName(SERIALIZED_NAME_SCOPES)
  private List<AccessGroupScope> scopes;

  public AccessGroup() {
  }

  public AccessGroup(
     String id, 
     List<Long> taggedAccountIds
  ) {
    this();
    this.id = id;
    this.taggedAccountIds = taggedAccountIds;
  }

   /**
   * The Access group ID.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }



  public AccessGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The Access group name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AccessGroup singleAccount(Boolean singleAccount) {
    this.singleAccount = singleAccount;
    return this;
  }

   /**
   * Indicates that this Access group defines the permissions of a single account, and thus account and account tags cannot be modified. Instead create a new Access group to manage permissions of multiple accounts.
   * @return singleAccount
  **/
  @javax.annotation.Nullable
  public Boolean getSingleAccount() {
    return singleAccount;
  }

  public void setSingleAccount(Boolean singleAccount) {
    this.singleAccount = singleAccount;
  }


  public AccessGroup accountIds(List<Long> accountIds) {
    this.accountIds = accountIds;
    return this;
  }

  public AccessGroup addAccountIdsItem(Long accountIdsItem) {
    if (this.accountIds == null) {
      this.accountIds = new ArrayList<>();
    }
    this.accountIds.add(accountIdsItem);
    return this;
  }

   /**
   * List of accounts ids included individually (as opposed to added by tags) in the Access group.
   * @return accountIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAccountIds() {
    return accountIds;
  }

  public void setAccountIds(List<Long> accountIds) {
    this.accountIds = accountIds;
  }


   /**
   * List of accounts ids included by tags in the Access group.
   * @return taggedAccountIds
  **/
  @javax.annotation.Nullable
  public List<Long> getTaggedAccountIds() {
    return taggedAccountIds;
  }



  public AccessGroup accountTags(List<Tag> accountTags) {
    this.accountTags = accountTags;
    return this;
  }

  public AccessGroup addAccountTagsItem(Tag accountTagsItem) {
    if (this.accountTags == null) {
      this.accountTags = new ArrayList<>();
    }
    this.accountTags.add(accountTagsItem);
    return this;
  }

   /**
   * List of account tags. Accounts matching any of these tags will be automatically added to the Access group.
   * @return accountTags
  **/
  @javax.annotation.Nullable
  public List<Tag> getAccountTags() {
    return accountTags;
  }

  public void setAccountTags(List<Tag> accountTags) {
    this.accountTags = accountTags;
  }


  public AccessGroup scopes(List<AccessGroupScope> scopes) {
    this.scopes = scopes;
    return this;
  }

  public AccessGroup addScopesItem(AccessGroupScope scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * The Access group scopes.
   * @return scopes
  **/
  @javax.annotation.Nullable
  public List<AccessGroupScope> getScopes() {
    return scopes;
  }

  public void setScopes(List<AccessGroupScope> scopes) {
    this.scopes = scopes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessGroup accessGroup = (AccessGroup) o;
    return Objects.equals(this.id, accessGroup.id) &&
        Objects.equals(this.name, accessGroup.name) &&
        Objects.equals(this.singleAccount, accessGroup.singleAccount) &&
        Objects.equals(this.accountIds, accessGroup.accountIds) &&
        Objects.equals(this.taggedAccountIds, accessGroup.taggedAccountIds) &&
        Objects.equals(this.accountTags, accessGroup.accountTags) &&
        Objects.equals(this.scopes, accessGroup.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, singleAccount, accountIds, taggedAccountIds, accountTags, scopes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessGroup {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    singleAccount: ").append(toIndentedString(singleAccount)).append("\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
    sb.append("    taggedAccountIds: ").append(toIndentedString(taggedAccountIds)).append("\n");
    sb.append("    accountTags: ").append(toIndentedString(accountTags)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
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
    openapiFields.add("single_account");
    openapiFields.add("account_ids");
    openapiFields.add("tagged_account_ids");
    openapiFields.add("account_tags");
    openapiFields.add("scopes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccessGroup
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccessGroup.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessGroup is not found in the empty JSON string", AccessGroup.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccessGroup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccessGroup` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AccessGroup.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("account_ids") != null && !jsonObj.get("account_ids").isJsonNull() && !jsonObj.get("account_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_ids` to be an array in the JSON string but got `%s`", jsonObj.get("account_ids").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tagged_account_ids") != null && !jsonObj.get("tagged_account_ids").isJsonNull() && !jsonObj.get("tagged_account_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tagged_account_ids` to be an array in the JSON string but got `%s`", jsonObj.get("tagged_account_ids").toString()));
      }
      if (jsonObj.get("account_tags") != null && !jsonObj.get("account_tags").isJsonNull()) {
        JsonArray jsonArrayaccountTags = jsonObj.getAsJsonArray("account_tags");
        if (jsonArrayaccountTags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("account_tags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `account_tags` to be an array in the JSON string but got `%s`", jsonObj.get("account_tags").toString()));
          }

          // validate the optional field `account_tags` (array)
          for (int i = 0; i < jsonArrayaccountTags.size(); i++) {
            Tag.validateJsonElement(jsonArrayaccountTags.get(i));
          };
        }
      }
      if (jsonObj.get("scopes") != null && !jsonObj.get("scopes").isJsonNull()) {
        JsonArray jsonArrayscopes = jsonObj.getAsJsonArray("scopes");
        if (jsonArrayscopes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("scopes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `scopes` to be an array in the JSON string but got `%s`", jsonObj.get("scopes").toString()));
          }

          // validate the optional field `scopes` (array)
          for (int i = 0; i < jsonArrayscopes.size(); i++) {
            AccessGroupScope.validateJsonElement(jsonArrayscopes.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessGroup>() {
           @Override
           public void write(JsonWriter out, AccessGroup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccessGroup read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccessGroup given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessGroup
  * @throws IOException if the JSON string is invalid with respect to AccessGroup
  */
  public static AccessGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessGroup.class);
  }

 /**
  * Convert an instance of AccessGroup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


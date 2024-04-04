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
import com.delphix.dct.models.KDCServers;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * A Kerberos config object.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class KerberosConfig {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE_ID = "namespace_id";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_ID)
  private String namespaceId;

  public static final String SERIALIZED_NAME_NAMESPACE_NAME = "namespace_name";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_NAME)
  private String namespaceName;

  public static final String SERIALIZED_NAME_IS_REPLICA = "is_replica";
  @SerializedName(SERIALIZED_NAME_IS_REPLICA)
  private Boolean isReplica;

  public static final String SERIALIZED_NAME_ENGINE_ID = "engine_id";
  @SerializedName(SERIALIZED_NAME_ENGINE_ID)
  private String engineId;

  public static final String SERIALIZED_NAME_ENGINE_NAME = "engine_name";
  @SerializedName(SERIALIZED_NAME_ENGINE_NAME)
  private String engineName;

  public static final String SERIALIZED_NAME_REALM = "realm";
  @SerializedName(SERIALIZED_NAME_REALM)
  private String realm;

  public static final String SERIALIZED_NAME_PRINCIPAL = "principal";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL)
  private String principal;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_KEYTAB = "keytab";
  @SerializedName(SERIALIZED_NAME_KEYTAB)
  private String keytab;

  public static final String SERIALIZED_NAME_KDC_SERVERS = "kdc_servers";
  @SerializedName(SERIALIZED_NAME_KDC_SERVERS)
  private List<KDCServers> kdcServers;

  public KerberosConfig() {
  }

  public KerberosConfig id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The kerberos config ID.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public KerberosConfig name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the kerberos config object.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public KerberosConfig namespaceId(String namespaceId) {
    this.namespaceId = namespaceId;
    return this;
  }

   /**
   * The namespace id of this kerberos config object.
   * @return namespaceId
  **/
  @javax.annotation.Nullable
  public String getNamespaceId() {
    return namespaceId;
  }

  public void setNamespaceId(String namespaceId) {
    this.namespaceId = namespaceId;
  }


  public KerberosConfig namespaceName(String namespaceName) {
    this.namespaceName = namespaceName;
    return this;
  }

   /**
   * The namespace name of this kerberos config object.
   * @return namespaceName
  **/
  @javax.annotation.Nullable
  public String getNamespaceName() {
    return namespaceName;
  }

  public void setNamespaceName(String namespaceName) {
    this.namespaceName = namespaceName;
  }


  public KerberosConfig isReplica(Boolean isReplica) {
    this.isReplica = isReplica;
    return this;
  }

   /**
   * Is this a replicated object.
   * @return isReplica
  **/
  @javax.annotation.Nullable
  public Boolean getIsReplica() {
    return isReplica;
  }

  public void setIsReplica(Boolean isReplica) {
    this.isReplica = isReplica;
  }


  public KerberosConfig engineId(String engineId) {
    this.engineId = engineId;
    return this;
  }

   /**
   * Id of the Engine that this kerberos config object belongs to.
   * @return engineId
  **/
  @javax.annotation.Nullable
  public String getEngineId() {
    return engineId;
  }

  public void setEngineId(String engineId) {
    this.engineId = engineId;
  }


  public KerberosConfig engineName(String engineName) {
    this.engineName = engineName;
    return this;
  }

   /**
   * Name of the Engine that this kerberos config object belongs to.
   * @return engineName
  **/
  @javax.annotation.Nullable
  public String getEngineName() {
    return engineName;
  }

  public void setEngineName(String engineName) {
    this.engineName = engineName;
  }


  public KerberosConfig realm(String realm) {
    this.realm = realm;
    return this;
  }

   /**
   * Kerberos Realm name.
   * @return realm
  **/
  @javax.annotation.Nullable
  public String getRealm() {
    return realm;
  }

  public void setRealm(String realm) {
    this.realm = realm;
  }


  public KerberosConfig principal(String principal) {
    this.principal = principal;
    return this;
  }

   /**
   * Kerberos principal name.
   * @return principal
  **/
  @javax.annotation.Nullable
  public String getPrincipal() {
    return principal;
  }

  public void setPrincipal(String principal) {
    this.principal = principal;
  }


  public KerberosConfig enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * The kerberos is enabled or not.
   * @return enabled
  **/
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public KerberosConfig keytab(String keytab) {
    this.keytab = keytab;
    return this;
  }

   /**
   * Kerberos keytab.
   * @return keytab
  **/
  @javax.annotation.Nullable
  public String getKeytab() {
    return keytab;
  }

  public void setKeytab(String keytab) {
    this.keytab = keytab;
  }


  public KerberosConfig kdcServers(List<KDCServers> kdcServers) {
    this.kdcServers = kdcServers;
    return this;
  }

  public KerberosConfig addKdcServersItem(KDCServers kdcServersItem) {
    if (this.kdcServers == null) {
      this.kdcServers = new ArrayList<>();
    }
    this.kdcServers.add(kdcServersItem);
    return this;
  }

   /**
   * One of more KDC servers.
   * @return kdcServers
  **/
  @javax.annotation.Nullable
  public List<KDCServers> getKdcServers() {
    return kdcServers;
  }

  public void setKdcServers(List<KDCServers> kdcServers) {
    this.kdcServers = kdcServers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KerberosConfig kerberosConfig = (KerberosConfig) o;
    return Objects.equals(this.id, kerberosConfig.id) &&
        Objects.equals(this.name, kerberosConfig.name) &&
        Objects.equals(this.namespaceId, kerberosConfig.namespaceId) &&
        Objects.equals(this.namespaceName, kerberosConfig.namespaceName) &&
        Objects.equals(this.isReplica, kerberosConfig.isReplica) &&
        Objects.equals(this.engineId, kerberosConfig.engineId) &&
        Objects.equals(this.engineName, kerberosConfig.engineName) &&
        Objects.equals(this.realm, kerberosConfig.realm) &&
        Objects.equals(this.principal, kerberosConfig.principal) &&
        Objects.equals(this.enabled, kerberosConfig.enabled) &&
        Objects.equals(this.keytab, kerberosConfig.keytab) &&
        Objects.equals(this.kdcServers, kerberosConfig.kdcServers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, namespaceId, namespaceName, isReplica, engineId, engineName, realm, principal, enabled, keytab, kdcServers);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KerberosConfig {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespaceId: ").append(toIndentedString(namespaceId)).append("\n");
    sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
    sb.append("    isReplica: ").append(toIndentedString(isReplica)).append("\n");
    sb.append("    engineId: ").append(toIndentedString(engineId)).append("\n");
    sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
    sb.append("    realm: ").append(toIndentedString(realm)).append("\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    keytab: ").append(toIndentedString(keytab)).append("\n");
    sb.append("    kdcServers: ").append(toIndentedString(kdcServers)).append("\n");
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
    openapiFields.add("namespace_id");
    openapiFields.add("namespace_name");
    openapiFields.add("is_replica");
    openapiFields.add("engine_id");
    openapiFields.add("engine_name");
    openapiFields.add("realm");
    openapiFields.add("principal");
    openapiFields.add("enabled");
    openapiFields.add("keytab");
    openapiFields.add("kdc_servers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to KerberosConfig
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!KerberosConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KerberosConfig is not found in the empty JSON string", KerberosConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!KerberosConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KerberosConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("namespace_id") != null && !jsonObj.get("namespace_id").isJsonNull()) && !jsonObj.get("namespace_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace_id").toString()));
      }
      if ((jsonObj.get("namespace_name") != null && !jsonObj.get("namespace_name").isJsonNull()) && !jsonObj.get("namespace_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace_name").toString()));
      }
      if ((jsonObj.get("engine_id") != null && !jsonObj.get("engine_id").isJsonNull()) && !jsonObj.get("engine_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `engine_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("engine_id").toString()));
      }
      if ((jsonObj.get("engine_name") != null && !jsonObj.get("engine_name").isJsonNull()) && !jsonObj.get("engine_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `engine_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("engine_name").toString()));
      }
      if ((jsonObj.get("realm") != null && !jsonObj.get("realm").isJsonNull()) && !jsonObj.get("realm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `realm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("realm").toString()));
      }
      if ((jsonObj.get("principal") != null && !jsonObj.get("principal").isJsonNull()) && !jsonObj.get("principal").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `principal` to be a primitive type in the JSON string but got `%s`", jsonObj.get("principal").toString()));
      }
      if ((jsonObj.get("keytab") != null && !jsonObj.get("keytab").isJsonNull()) && !jsonObj.get("keytab").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keytab` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keytab").toString()));
      }
      if (jsonObj.get("kdc_servers") != null && !jsonObj.get("kdc_servers").isJsonNull()) {
        JsonArray jsonArraykdcServers = jsonObj.getAsJsonArray("kdc_servers");
        if (jsonArraykdcServers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("kdc_servers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `kdc_servers` to be an array in the JSON string but got `%s`", jsonObj.get("kdc_servers").toString()));
          }

          // validate the optional field `kdc_servers` (array)
          for (int i = 0; i < jsonArraykdcServers.size(); i++) {
            KDCServers.validateJsonElement(jsonArraykdcServers.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KerberosConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KerberosConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KerberosConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KerberosConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<KerberosConfig>() {
           @Override
           public void write(JsonWriter out, KerberosConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KerberosConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KerberosConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KerberosConfig
  * @throws IOException if the JSON string is invalid with respect to KerberosConfig
  */
  public static KerberosConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KerberosConfig.class);
  }

 /**
  * Convert an instance of KerberosConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


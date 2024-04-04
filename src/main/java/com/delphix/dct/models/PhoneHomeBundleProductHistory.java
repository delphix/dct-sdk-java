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
 * The product history data included in the phonehome bundle&#39;s product information.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:02:33.321319+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class PhoneHomeBundleProductHistory {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_INSTALLED_ON = "installed_on";
  @SerializedName(SERIALIZED_NAME_INSTALLED_ON)
  private String installedOn;

  public PhoneHomeBundleProductHistory() {
  }

  public PhoneHomeBundleProductHistory version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The product version.
   * @return version
  **/
  @javax.annotation.Nonnull
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  public PhoneHomeBundleProductHistory installedOn(String installedOn) {
    this.installedOn = installedOn;
    return this;
  }

   /**
   * The UTC time when the version was installed (ISO 8601 format)
   * @return installedOn
  **/
  @javax.annotation.Nonnull
  public String getInstalledOn() {
    return installedOn;
  }

  public void setInstalledOn(String installedOn) {
    this.installedOn = installedOn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneHomeBundleProductHistory phoneHomeBundleProductHistory = (PhoneHomeBundleProductHistory) o;
    return Objects.equals(this.version, phoneHomeBundleProductHistory.version) &&
        Objects.equals(this.installedOn, phoneHomeBundleProductHistory.installedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, installedOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneHomeBundleProductHistory {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    installedOn: ").append(toIndentedString(installedOn)).append("\n");
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
    openapiFields.add("version");
    openapiFields.add("installed_on");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("version");
    openapiRequiredFields.add("installed_on");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PhoneHomeBundleProductHistory
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PhoneHomeBundleProductHistory.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PhoneHomeBundleProductHistory is not found in the empty JSON string", PhoneHomeBundleProductHistory.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PhoneHomeBundleProductHistory.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PhoneHomeBundleProductHistory` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PhoneHomeBundleProductHistory.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if (!jsonObj.get("installed_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `installed_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("installed_on").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PhoneHomeBundleProductHistory.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PhoneHomeBundleProductHistory' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PhoneHomeBundleProductHistory> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PhoneHomeBundleProductHistory.class));

       return (TypeAdapter<T>) new TypeAdapter<PhoneHomeBundleProductHistory>() {
           @Override
           public void write(JsonWriter out, PhoneHomeBundleProductHistory value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PhoneHomeBundleProductHistory read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PhoneHomeBundleProductHistory given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PhoneHomeBundleProductHistory
  * @throws IOException if the JSON string is invalid with respect to PhoneHomeBundleProductHistory
  */
  public static PhoneHomeBundleProductHistory fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PhoneHomeBundleProductHistory.class);
  }

 /**
  * Convert an instance of PhoneHomeBundleProductHistory to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


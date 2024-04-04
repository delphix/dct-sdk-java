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
import com.delphix.dct.models.Connector;
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
 * Connector(s) for a masking job.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:02:33.321319+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class MaskingJobConnectorsResponse {
  public static final String SERIALIZED_NAME_CONNECTOR = "connector";
  @SerializedName(SERIALIZED_NAME_CONNECTOR)
  private Connector connector;

  public static final String SERIALIZED_NAME_ON_THE_FLY_CONNECTOR = "on_the_fly_connector";
  @SerializedName(SERIALIZED_NAME_ON_THE_FLY_CONNECTOR)
  private Connector onTheFlyConnector;

  public MaskingJobConnectorsResponse() {
  }

  public MaskingJobConnectorsResponse connector(Connector connector) {
    this.connector = connector;
    return this;
  }

   /**
   * Get connector
   * @return connector
  **/
  @javax.annotation.Nullable
  public Connector getConnector() {
    return connector;
  }

  public void setConnector(Connector connector) {
    this.connector = connector;
  }


  public MaskingJobConnectorsResponse onTheFlyConnector(Connector onTheFlyConnector) {
    this.onTheFlyConnector = onTheFlyConnector;
    return this;
  }

   /**
   * Get onTheFlyConnector
   * @return onTheFlyConnector
  **/
  @javax.annotation.Nullable
  public Connector getOnTheFlyConnector() {
    return onTheFlyConnector;
  }

  public void setOnTheFlyConnector(Connector onTheFlyConnector) {
    this.onTheFlyConnector = onTheFlyConnector;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaskingJobConnectorsResponse maskingJobConnectorsResponse = (MaskingJobConnectorsResponse) o;
    return Objects.equals(this.connector, maskingJobConnectorsResponse.connector) &&
        Objects.equals(this.onTheFlyConnector, maskingJobConnectorsResponse.onTheFlyConnector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connector, onTheFlyConnector);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaskingJobConnectorsResponse {\n");
    sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
    sb.append("    onTheFlyConnector: ").append(toIndentedString(onTheFlyConnector)).append("\n");
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
    openapiFields.add("connector");
    openapiFields.add("on_the_fly_connector");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MaskingJobConnectorsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MaskingJobConnectorsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MaskingJobConnectorsResponse is not found in the empty JSON string", MaskingJobConnectorsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MaskingJobConnectorsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MaskingJobConnectorsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `connector`
      if (jsonObj.get("connector") != null && !jsonObj.get("connector").isJsonNull()) {
        Connector.validateJsonElement(jsonObj.get("connector"));
      }
      // validate the optional field `on_the_fly_connector`
      if (jsonObj.get("on_the_fly_connector") != null && !jsonObj.get("on_the_fly_connector").isJsonNull()) {
        Connector.validateJsonElement(jsonObj.get("on_the_fly_connector"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MaskingJobConnectorsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MaskingJobConnectorsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MaskingJobConnectorsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MaskingJobConnectorsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<MaskingJobConnectorsResponse>() {
           @Override
           public void write(JsonWriter out, MaskingJobConnectorsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MaskingJobConnectorsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MaskingJobConnectorsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MaskingJobConnectorsResponse
  * @throws IOException if the JSON string is invalid with respect to MaskingJobConnectorsResponse
  */
  public static MaskingJobConnectorsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MaskingJobConnectorsResponse.class);
  }

 /**
  * Convert an instance of MaskingJobConnectorsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


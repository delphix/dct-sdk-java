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
import java.time.LocalDate;
import java.time.OffsetDateTime;
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
 * Bundle Upload Event
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-04T14:49:34.152994+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class BundleUploadEvent {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_GENERATION_START_TIME = "generationStartTime";
  @SerializedName(SERIALIZED_NAME_GENERATION_START_TIME)
  private OffsetDateTime generationStartTime;

  public static final String SERIALIZED_NAME_GENERATION_END_TIME = "generationEndTime";
  @SerializedName(SERIALIZED_NAME_GENERATION_END_TIME)
  private OffsetDateTime generationEndTime;

  public static final String SERIALIZED_NAME_ALL_GAPS_FILLED = "allGapsFilled";
  @SerializedName(SERIALIZED_NAME_ALL_GAPS_FILLED)
  private Boolean allGapsFilled;

  public static final String SERIALIZED_NAME_DATA_DATES = "dataDates";
  @SerializedName(SERIALIZED_NAME_DATA_DATES)
  private List<LocalDate> dataDates;

  public BundleUploadEvent() {
  }

  public BundleUploadEvent id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the bundle generation event.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public BundleUploadEvent generationStartTime(OffsetDateTime generationStartTime) {
    this.generationStartTime = generationStartTime;
    return this;
  }

   /**
   * The time when the bundle generation started.
   * @return generationStartTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getGenerationStartTime() {
    return generationStartTime;
  }

  public void setGenerationStartTime(OffsetDateTime generationStartTime) {
    this.generationStartTime = generationStartTime;
  }


  public BundleUploadEvent generationEndTime(OffsetDateTime generationEndTime) {
    this.generationEndTime = generationEndTime;
    return this;
  }

   /**
   * The time when the bundle generation ended.
   * @return generationEndTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getGenerationEndTime() {
    return generationEndTime;
  }

  public void setGenerationEndTime(OffsetDateTime generationEndTime) {
    this.generationEndTime = generationEndTime;
  }


  public BundleUploadEvent allGapsFilled(Boolean allGapsFilled) {
    this.allGapsFilled = allGapsFilled;
    return this;
  }

   /**
   * True if the bundle was fully built, False if it was trimmed short due to constraints
   * @return allGapsFilled
  **/
  @javax.annotation.Nullable
  public Boolean getAllGapsFilled() {
    return allGapsFilled;
  }

  public void setAllGapsFilled(Boolean allGapsFilled) {
    this.allGapsFilled = allGapsFilled;
  }


  public BundleUploadEvent dataDates(List<LocalDate> dataDates) {
    this.dataDates = dataDates;
    return this;
  }

  public BundleUploadEvent addDataDatesItem(LocalDate dataDatesItem) {
    if (this.dataDates == null) {
      this.dataDates = new ArrayList<>();
    }
    this.dataDates.add(dataDatesItem);
    return this;
  }

   /**
   * The list of dates for which the data is included in the bundle.
   * @return dataDates
  **/
  @javax.annotation.Nullable
  public List<LocalDate> getDataDates() {
    return dataDates;
  }

  public void setDataDates(List<LocalDate> dataDates) {
    this.dataDates = dataDates;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundleUploadEvent bundleUploadEvent = (BundleUploadEvent) o;
    return Objects.equals(this.id, bundleUploadEvent.id) &&
        Objects.equals(this.generationStartTime, bundleUploadEvent.generationStartTime) &&
        Objects.equals(this.generationEndTime, bundleUploadEvent.generationEndTime) &&
        Objects.equals(this.allGapsFilled, bundleUploadEvent.allGapsFilled) &&
        Objects.equals(this.dataDates, bundleUploadEvent.dataDates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, generationStartTime, generationEndTime, allGapsFilled, dataDates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundleUploadEvent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    generationStartTime: ").append(toIndentedString(generationStartTime)).append("\n");
    sb.append("    generationEndTime: ").append(toIndentedString(generationEndTime)).append("\n");
    sb.append("    allGapsFilled: ").append(toIndentedString(allGapsFilled)).append("\n");
    sb.append("    dataDates: ").append(toIndentedString(dataDates)).append("\n");
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
    openapiFields.add("generationStartTime");
    openapiFields.add("generationEndTime");
    openapiFields.add("allGapsFilled");
    openapiFields.add("dataDates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BundleUploadEvent
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BundleUploadEvent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BundleUploadEvent is not found in the empty JSON string", BundleUploadEvent.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BundleUploadEvent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BundleUploadEvent` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("dataDates") != null && !jsonObj.get("dataDates").isJsonNull() && !jsonObj.get("dataDates").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataDates` to be an array in the JSON string but got `%s`", jsonObj.get("dataDates").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BundleUploadEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BundleUploadEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BundleUploadEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BundleUploadEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<BundleUploadEvent>() {
           @Override
           public void write(JsonWriter out, BundleUploadEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BundleUploadEvent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BundleUploadEvent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BundleUploadEvent
  * @throws IOException if the JSON string is invalid with respect to BundleUploadEvent
  */
  public static BundleUploadEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BundleUploadEvent.class);
  }

 /**
  * Convert an instance of BundleUploadEvent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


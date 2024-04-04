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
 * Mechanism to use for ssh host verification.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-03T12:02:33.321319+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class SSHVerificationStrategy {
  /**
   * The name of the verification strategy.
   */
  @JsonAdapter(NameEnum.Adapter.class)
  public enum NameEnum {
    RAW_KEY("RAW_KEY"),
    
    FINGERPRINT("FINGERPRINT"),
    
    ACCEPT_ALWAYS("ACCEPT_ALWAYS");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NameEnum fromValue(String value) {
      for (NameEnum b : NameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NameEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NameEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      NameEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private NameEnum name;

  /**
   * The type of SSH key.
   */
  @JsonAdapter(KeyTypeEnum.Adapter.class)
  public enum KeyTypeEnum {
    RSA("RSA"),
    
    DSA("DSA"),
    
    ECDSA("ECDSA"),
    
    ED25519("ED25519");

    private String value;

    KeyTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KeyTypeEnum fromValue(String value) {
      for (KeyTypeEnum b : KeyTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<KeyTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KeyTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KeyTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return KeyTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      KeyTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_KEY_TYPE = "key_type";
  @SerializedName(SERIALIZED_NAME_KEY_TYPE)
  private KeyTypeEnum keyType;

  public static final String SERIALIZED_NAME_RAW_KEY = "raw_key";
  @SerializedName(SERIALIZED_NAME_RAW_KEY)
  private String rawKey;

  /**
   * Hash function for the fingerprint for FINGERPRINT verification.
   */
  @JsonAdapter(FingerprintTypeEnum.Adapter.class)
  public enum FingerprintTypeEnum {
    SHA256("SHA256"),
    
    SHA512("SHA512");

    private String value;

    FingerprintTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FingerprintTypeEnum fromValue(String value) {
      for (FingerprintTypeEnum b : FingerprintTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FingerprintTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FingerprintTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FingerprintTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FingerprintTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      FingerprintTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_FINGERPRINT_TYPE = "fingerprint_type";
  @SerializedName(SERIALIZED_NAME_FINGERPRINT_TYPE)
  private FingerprintTypeEnum fingerprintType;

  public static final String SERIALIZED_NAME_FINGERPRINT = "fingerprint";
  @SerializedName(SERIALIZED_NAME_FINGERPRINT)
  private String fingerprint;

  public SSHVerificationStrategy() {
  }

  public SSHVerificationStrategy name(NameEnum name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the verification strategy.
   * @return name
  **/
  @javax.annotation.Nonnull
  public NameEnum getName() {
    return name;
  }

  public void setName(NameEnum name) {
    this.name = name;
  }


  public SSHVerificationStrategy keyType(KeyTypeEnum keyType) {
    this.keyType = keyType;
    return this;
  }

   /**
   * The type of SSH key.
   * @return keyType
  **/
  @javax.annotation.Nullable
  public KeyTypeEnum getKeyType() {
    return keyType;
  }

  public void setKeyType(KeyTypeEnum keyType) {
    this.keyType = keyType;
  }


  public SSHVerificationStrategy rawKey(String rawKey) {
    this.rawKey = rawKey;
    return this;
  }

   /**
   * Base64-encoded ssh key of the host for RAW_KEY verification.
   * @return rawKey
  **/
  @javax.annotation.Nullable
  public String getRawKey() {
    return rawKey;
  }

  public void setRawKey(String rawKey) {
    this.rawKey = rawKey;
  }


  public SSHVerificationStrategy fingerprintType(FingerprintTypeEnum fingerprintType) {
    this.fingerprintType = fingerprintType;
    return this;
  }

   /**
   * Hash function for the fingerprint for FINGERPRINT verification.
   * @return fingerprintType
  **/
  @javax.annotation.Nullable
  public FingerprintTypeEnum getFingerprintType() {
    return fingerprintType;
  }

  public void setFingerprintType(FingerprintTypeEnum fingerprintType) {
    this.fingerprintType = fingerprintType;
  }


  public SSHVerificationStrategy fingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

   /**
   * Base-64 encoded fingerprint of the ssh key of the host for FINGERPRINT verification.
   * @return fingerprint
  **/
  @javax.annotation.Nullable
  public String getFingerprint() {
    return fingerprint;
  }

  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSHVerificationStrategy ssHVerificationStrategy = (SSHVerificationStrategy) o;
    return Objects.equals(this.name, ssHVerificationStrategy.name) &&
        Objects.equals(this.keyType, ssHVerificationStrategy.keyType) &&
        Objects.equals(this.rawKey, ssHVerificationStrategy.rawKey) &&
        Objects.equals(this.fingerprintType, ssHVerificationStrategy.fingerprintType) &&
        Objects.equals(this.fingerprint, ssHVerificationStrategy.fingerprint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, keyType, rawKey, fingerprintType, fingerprint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSHVerificationStrategy {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
    sb.append("    rawKey: ").append(toIndentedString(rawKey)).append("\n");
    sb.append("    fingerprintType: ").append(toIndentedString(fingerprintType)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
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
    openapiFields.add("key_type");
    openapiFields.add("raw_key");
    openapiFields.add("fingerprint_type");
    openapiFields.add("fingerprint");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SSHVerificationStrategy
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SSHVerificationStrategy.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SSHVerificationStrategy is not found in the empty JSON string", SSHVerificationStrategy.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SSHVerificationStrategy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SSHVerificationStrategy` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SSHVerificationStrategy.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `name`
      NameEnum.validateJsonElement(jsonObj.get("name"));
      if ((jsonObj.get("key_type") != null && !jsonObj.get("key_type").isJsonNull()) && !jsonObj.get("key_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key_type").toString()));
      }
      // validate the optional field `key_type`
      if (jsonObj.get("key_type") != null && !jsonObj.get("key_type").isJsonNull()) {
        KeyTypeEnum.validateJsonElement(jsonObj.get("key_type"));
      }
      if ((jsonObj.get("raw_key") != null && !jsonObj.get("raw_key").isJsonNull()) && !jsonObj.get("raw_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `raw_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("raw_key").toString()));
      }
      if ((jsonObj.get("fingerprint_type") != null && !jsonObj.get("fingerprint_type").isJsonNull()) && !jsonObj.get("fingerprint_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fingerprint_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fingerprint_type").toString()));
      }
      // validate the optional field `fingerprint_type`
      if (jsonObj.get("fingerprint_type") != null && !jsonObj.get("fingerprint_type").isJsonNull()) {
        FingerprintTypeEnum.validateJsonElement(jsonObj.get("fingerprint_type"));
      }
      if ((jsonObj.get("fingerprint") != null && !jsonObj.get("fingerprint").isJsonNull()) && !jsonObj.get("fingerprint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fingerprint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fingerprint").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SSHVerificationStrategy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SSHVerificationStrategy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SSHVerificationStrategy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SSHVerificationStrategy.class));

       return (TypeAdapter<T>) new TypeAdapter<SSHVerificationStrategy>() {
           @Override
           public void write(JsonWriter out, SSHVerificationStrategy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SSHVerificationStrategy read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SSHVerificationStrategy given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SSHVerificationStrategy
  * @throws IOException if the JSON string is invalid with respect to SSHVerificationStrategy
  */
  public static SSHVerificationStrategy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SSHVerificationStrategy.class);
  }

 /**
  * Convert an instance of SSHVerificationStrategy to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


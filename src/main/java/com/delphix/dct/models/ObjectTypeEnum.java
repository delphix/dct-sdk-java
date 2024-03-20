/*
 * Delphix DCT API
 * Delphix DCT API
 *
 * The version of the OpenAPI document: 3.3.0
 * Contact: support@delphix.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.delphix.dct.models;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Type of the DCT object.
 */
@JsonAdapter(ObjectTypeEnum.Adapter.class)
public enum ObjectTypeEnum {
  
  ACCESS_GROUP("ACCESS_GROUP"),
  
  ACCOUNT("ACCOUNT"),
  
  ROLE("ROLE"),
  
  BOOKMARK("BOOKMARK"),
  
  CDB("CDB"),
  
  DATABASE_TEMPLATE("DATABASE_TEMPLATE"),
  
  DSOURCE("DSOURCE"),
  
  ENGINE("ENGINE"),
  
  ENVIRONMENT("ENVIRONMENT"),
  
  MASKING_ENVIRONMENT("MASKING_ENVIRONMENT"),
  
  MASKING_JOB("MASKING_JOB"),
  
  MASKING_JOB_SET("MASKING_JOB_SET"),
  
  REPORT_SCHEDULE("REPORT_SCHEDULE"),
  
  SOURCE("SOURCE"),
  
  VAULT("VAULT"),
  
  VCDB("VCDB"),
  
  VDB("VDB"),
  
  VDB_GROUP("VDB_GROUP"),
  
  CONNECTOR("CONNECTOR"),
  
  VIRTUALIZATION_POLICY("VIRTUALIZATION_POLICY"),
  
  DATASET_GROUP("DATASET_GROUP"),
  
  ENGINE_VAULT("ENGINE_VAULT");

  private String value;

  ObjectTypeEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ObjectTypeEnum fromValue(String value) {
    for (ObjectTypeEnum b : ObjectTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ObjectTypeEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final ObjectTypeEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ObjectTypeEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ObjectTypeEnum.fromValue(value);
    }
  }
}


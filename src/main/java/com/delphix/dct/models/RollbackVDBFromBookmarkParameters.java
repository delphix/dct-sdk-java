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
import com.delphix.dct.models.DataPointFromBookmarkParameters;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RollbackVDBFromBookmarkParameters
 * @deprecated
 */
@Deprecated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-19T17:08:49.349376+05:30[Asia/Kolkata]")
public class RollbackVDBFromBookmarkParameters {
  public static final String SERIALIZED_NAME_BOOKMARK_ID = "bookmark_id";
  @SerializedName(SERIALIZED_NAME_BOOKMARK_ID)
  private String bookmarkId;


  public RollbackVDBFromBookmarkParameters bookmarkId(String bookmarkId) {
    
    this.bookmarkId = bookmarkId;
    return this;
  }

   /**
   * The ID of the bookmark from which to execute the operation. The bookmark must contain only one VDB.
   * @return bookmarkId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the bookmark from which to execute the operation. The bookmark must contain only one VDB.")

  public String getBookmarkId() {
    return bookmarkId;
  }


  public void setBookmarkId(String bookmarkId) {
    this.bookmarkId = bookmarkId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RollbackVDBFromBookmarkParameters rollbackVDBFromBookmarkParameters = (RollbackVDBFromBookmarkParameters) o;
    return Objects.equals(this.bookmarkId, rollbackVDBFromBookmarkParameters.bookmarkId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookmarkId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RollbackVDBFromBookmarkParameters {\n");
    sb.append("    bookmarkId: ").append(toIndentedString(bookmarkId)).append("\n");
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

}


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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PaginatedResponseMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-19T18:53:50.335381+05:30[Asia/Kolkata]")
public class PaginatedResponseMetadata {
  public static final String SERIALIZED_NAME_PREV_CURSOR = "prev_cursor";
  @SerializedName(SERIALIZED_NAME_PREV_CURSOR)
  private String prevCursor;

  public static final String SERIALIZED_NAME_NEXT_CURSOR = "next_cursor";
  @SerializedName(SERIALIZED_NAME_NEXT_CURSOR)
  private String nextCursor;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;


  public PaginatedResponseMetadata prevCursor(String prevCursor) {
    
    this.prevCursor = prevCursor;
    return this;
  }

   /**
   * Pointer to the previous page of results. Use this value as a cursor query parameter in a subsequent request, along with limit, to navigate through the collection by virtual page.
   * @return prevCursor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pointer to the previous page of results. Use this value as a cursor query parameter in a subsequent request, along with limit, to navigate through the collection by virtual page.")

  public String getPrevCursor() {
    return prevCursor;
  }


  public void setPrevCursor(String prevCursor) {
    this.prevCursor = prevCursor;
  }


  public PaginatedResponseMetadata nextCursor(String nextCursor) {
    
    this.nextCursor = nextCursor;
    return this;
  }

   /**
   * Pointer to the next page of results. Use this value as a cursor query parameter in a subsequent request, along with limit, to navigate through the collection by virtual page.
   * @return nextCursor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pointer to the next page of results. Use this value as a cursor query parameter in a subsequent request, along with limit, to navigate through the collection by virtual page.")

  public String getNextCursor() {
    return nextCursor;
  }


  public void setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
  }


  public PaginatedResponseMetadata total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * The total number of results. This value may not be provided.
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of results. This value may not be provided.")

  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedResponseMetadata paginatedResponseMetadata = (PaginatedResponseMetadata) o;
    return Objects.equals(this.prevCursor, paginatedResponseMetadata.prevCursor) &&
        Objects.equals(this.nextCursor, paginatedResponseMetadata.nextCursor) &&
        Objects.equals(this.total, paginatedResponseMetadata.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prevCursor, nextCursor, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedResponseMetadata {\n");
    sb.append("    prevCursor: ").append(toIndentedString(prevCursor)).append("\n");
    sb.append("    nextCursor: ").append(toIndentedString(nextCursor)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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


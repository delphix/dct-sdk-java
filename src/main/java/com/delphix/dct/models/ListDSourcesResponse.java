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
import com.delphix.dct.models.DSource;
import com.delphix.dct.models.Error;
import com.delphix.dct.models.PaginatedResponseMetadata;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ListDSourcesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-19T17:08:49.349376+05:30[Asia/Kolkata]")
public class ListDSourcesResponse {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<DSource> items = null;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<Error> errors = null;

  public static final String SERIALIZED_NAME_RESPONSE_METADATA = "response_metadata";
  @SerializedName(SERIALIZED_NAME_RESPONSE_METADATA)
  private PaginatedResponseMetadata responseMetadata;


  public ListDSourcesResponse items(List<DSource> items) {
    
    this.items = items;
    return this;
  }

  public ListDSourcesResponse addItemsItem(DSource itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<DSource>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DSource> getItems() {
    return items;
  }


  public void setItems(List<DSource> items) {
    this.items = items;
  }


  public ListDSourcesResponse errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public ListDSourcesResponse addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<Error>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Sadly, sometimes requests to the API are not successful. Failures can occur for a wide range of reasons. The Errors object contains information about full or partial failures which might have occurred during the request.
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sadly, sometimes requests to the API are not successful. Failures can occur for a wide range of reasons. The Errors object contains information about full or partial failures which might have occurred during the request.")

  public List<Error> getErrors() {
    return errors;
  }


  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  public ListDSourcesResponse responseMetadata(PaginatedResponseMetadata responseMetadata) {
    
    this.responseMetadata = responseMetadata;
    return this;
  }

   /**
   * Get responseMetadata
   * @return responseMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaginatedResponseMetadata getResponseMetadata() {
    return responseMetadata;
  }


  public void setResponseMetadata(PaginatedResponseMetadata responseMetadata) {
    this.responseMetadata = responseMetadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDSourcesResponse listDSourcesResponse = (ListDSourcesResponse) o;
    return Objects.equals(this.items, listDSourcesResponse.items) &&
        Objects.equals(this.errors, listDSourcesResponse.errors) &&
        Objects.equals(this.responseMetadata, listDSourcesResponse.responseMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, errors, responseMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDSourcesResponse {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    responseMetadata: ").append(toIndentedString(responseMetadata)).append("\n");
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


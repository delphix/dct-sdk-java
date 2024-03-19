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
import com.delphix.dct.models.PermissionObject;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * PermissionsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-19T17:08:49.349376+05:30[Asia/Kolkata]")
public class PermissionsRequest {
  public static final String SERIALIZED_NAME_PERMISSION_OBJECTS = "permission_objects";
  @SerializedName(SERIALIZED_NAME_PERMISSION_OBJECTS)
  private Set<PermissionObject> permissionObjects = new LinkedHashSet<PermissionObject>();


  public PermissionsRequest permissionObjects(Set<PermissionObject> permissionObjects) {
    
    this.permissionObjects = permissionObjects;
    return this;
  }

  public PermissionsRequest addPermissionObjectsItem(PermissionObject permissionObjectsItem) {
    this.permissionObjects.add(permissionObjectsItem);
    return this;
  }

   /**
   * Array of permissions with object type and their permission.
   * @return permissionObjects
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Array of permissions with object type and their permission.")

  public Set<PermissionObject> getPermissionObjects() {
    return permissionObjects;
  }


  public void setPermissionObjects(Set<PermissionObject> permissionObjects) {
    this.permissionObjects = permissionObjects;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionsRequest permissionsRequest = (PermissionsRequest) o;
    return Objects.equals(this.permissionObjects, permissionsRequest.permissionObjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionObjects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionsRequest {\n");
    sb.append("    permissionObjects: ").append(toIndentedString(permissionObjects)).append("\n");
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


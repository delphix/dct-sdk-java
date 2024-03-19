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
 * Hook
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-19T17:08:49.349376+05:30[Asia/Kolkata]")
public class Hook {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_COMMAND = "command";
  @SerializedName(SERIALIZED_NAME_COMMAND)
  private String command;

  /**
   * Gets or Sets shell
   */
  @JsonAdapter(ShellEnum.Adapter.class)
  public enum ShellEnum {
    BASH("bash"),
    
    SHELL("shell"),
    
    EXPECT("expect"),
    
    PS("ps"),
    
    PSD("psd");

    private String value;

    ShellEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ShellEnum fromValue(String value) {
      for (ShellEnum b : ShellEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ShellEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ShellEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ShellEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ShellEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SHELL = "shell";
  @SerializedName(SERIALIZED_NAME_SHELL)
  private ShellEnum shell;

  public static final String SERIALIZED_NAME_ELEMENT_ID = "element_id";
  @SerializedName(SERIALIZED_NAME_ELEMENT_ID)
  private String elementId;

  public static final String SERIALIZED_NAME_HAS_CREDENTIALS = "has_credentials";
  @SerializedName(SERIALIZED_NAME_HAS_CREDENTIALS)
  private Boolean hasCredentials;


  public Hook name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Hook command(String command) {
    
    this.command = command;
    return this;
  }

   /**
   * Get command
   * @return command
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCommand() {
    return command;
  }


  public void setCommand(String command) {
    this.command = command;
  }


  public Hook shell(ShellEnum shell) {
    
    this.shell = shell;
    return this;
  }

   /**
   * Get shell
   * @return shell
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ShellEnum getShell() {
    return shell;
  }


  public void setShell(ShellEnum shell) {
    this.shell = shell;
  }


  public Hook elementId(String elementId) {
    
    this.elementId = elementId;
    return this;
  }

   /**
   * Get elementId
   * @return elementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getElementId() {
    return elementId;
  }


  public void setElementId(String elementId) {
    this.elementId = elementId;
  }


  public Hook hasCredentials(Boolean hasCredentials) {
    
    this.hasCredentials = hasCredentials;
    return this;
  }

   /**
   * Get hasCredentials
   * @return hasCredentials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasCredentials() {
    return hasCredentials;
  }


  public void setHasCredentials(Boolean hasCredentials) {
    this.hasCredentials = hasCredentials;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hook hook = (Hook) o;
    return Objects.equals(this.name, hook.name) &&
        Objects.equals(this.command, hook.command) &&
        Objects.equals(this.shell, hook.shell) &&
        Objects.equals(this.elementId, hook.elementId) &&
        Objects.equals(this.hasCredentials, hook.hasCredentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, command, shell, elementId, hasCredentials);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hook {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    shell: ").append(toIndentedString(shell)).append("\n");
    sb.append("    elementId: ").append(toIndentedString(elementId)).append("\n");
    sb.append("    hasCredentials: ").append(toIndentedString(hasCredentials)).append("\n");
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


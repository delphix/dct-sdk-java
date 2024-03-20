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
import com.delphix.dct.models.CredentialsEnvVariable;
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
 * SourceOperation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-19T18:53:50.335381+05:30[Asia/Kolkata]")
public class SourceOperation {
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
    
    EXPECT("expect");

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
  private ShellEnum shell = ShellEnum.BASH;

  public static final String SERIALIZED_NAME_CREDENTIALS_ENV_VARS = "credentials_env_vars";
  @SerializedName(SERIALIZED_NAME_CREDENTIALS_ENV_VARS)
  private List<CredentialsEnvVariable> credentialsEnvVars = null;


  public SourceOperation name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SourceOperation command(String command) {
    
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


  public SourceOperation shell(ShellEnum shell) {
    
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


  public SourceOperation credentialsEnvVars(List<CredentialsEnvVariable> credentialsEnvVars) {
    
    this.credentialsEnvVars = credentialsEnvVars;
    return this;
  }

  public SourceOperation addCredentialsEnvVarsItem(CredentialsEnvVariable credentialsEnvVarsItem) {
    if (this.credentialsEnvVars == null) {
      this.credentialsEnvVars = new ArrayList<CredentialsEnvVariable>();
    }
    this.credentialsEnvVars.add(credentialsEnvVarsItem);
    return this;
  }

   /**
   * List of environment variables that will contain credentials for this operation.
   * @return credentialsEnvVars
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of environment variables that will contain credentials for this operation.")

  public List<CredentialsEnvVariable> getCredentialsEnvVars() {
    return credentialsEnvVars;
  }


  public void setCredentialsEnvVars(List<CredentialsEnvVariable> credentialsEnvVars) {
    this.credentialsEnvVars = credentialsEnvVars;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceOperation sourceOperation = (SourceOperation) o;
    return Objects.equals(this.name, sourceOperation.name) &&
        Objects.equals(this.command, sourceOperation.command) &&
        Objects.equals(this.shell, sourceOperation.shell) &&
        Objects.equals(this.credentialsEnvVars, sourceOperation.credentialsEnvVars);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, command, shell, credentialsEnvVars);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceOperation {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    shell: ").append(toIndentedString(shell)).append("\n");
    sb.append("    credentialsEnvVars: ").append(toIndentedString(credentialsEnvVars)).append("\n");
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


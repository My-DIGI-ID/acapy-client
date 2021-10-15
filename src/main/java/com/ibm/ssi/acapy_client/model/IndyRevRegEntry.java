/*
 * IBM-Deutschland
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.7.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ibm.ssi.acapy_client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.ibm.ssi.acapy_client.model.IndyRevRegEntryValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ibm.ssi.acapy_client.invoker.JSON;


/**
 * IndyRevRegEntry
 */
@JsonPropertyOrder({
  IndyRevRegEntry.JSON_PROPERTY_VALUE,
  IndyRevRegEntry.JSON_PROPERTY_VER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class IndyRevRegEntry {
  public static final String JSON_PROPERTY_VALUE = "value";
  private IndyRevRegEntryValue value;

  public static final String JSON_PROPERTY_VER = "ver";
  private String ver;


  public IndyRevRegEntry value(IndyRevRegEntryValue value) {
    this.value = value;
    return this;
  }

   /**
   * Revocation registry entry value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Revocation registry entry value")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IndyRevRegEntryValue getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(IndyRevRegEntryValue value) {
    this.value = value;
  }


  public IndyRevRegEntry ver(String ver) {
    this.ver = ver;
    return this;
  }

   /**
   * Version of revocation registry entry
   * @return ver
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.0", value = "Version of revocation registry entry")
  @JsonProperty(JSON_PROPERTY_VER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVer() {
    return ver;
  }


  @JsonProperty(JSON_PROPERTY_VER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVer(String ver) {
    this.ver = ver;
  }


  /**
   * Return true if this IndyRevRegEntry object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndyRevRegEntry indyRevRegEntry = (IndyRevRegEntry) o;
    return Objects.equals(this.value, indyRevRegEntry.value) &&
        Objects.equals(this.ver, indyRevRegEntry.ver);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, ver);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndyRevRegEntry {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    ver: ").append(toIndentedString(ver)).append("\n");
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


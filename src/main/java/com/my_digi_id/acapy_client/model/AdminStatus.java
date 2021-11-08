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


package com.my_digi_id.acapy_client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.my_digi_id.acapy_client.invoker.JSON;


/**
 * AdminStatus
 */
@JsonPropertyOrder({
  AdminStatus.JSON_PROPERTY_CONDUCTOR,
  AdminStatus.JSON_PROPERTY_LABEL,
  AdminStatus.JSON_PROPERTY_TIMING,
  AdminStatus.JSON_PROPERTY_VERSION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-08T11:11:35.214106+01:00[Europe/Berlin]")
public class AdminStatus {
  public static final String JSON_PROPERTY_CONDUCTOR = "conductor";
  private Object conductor;

  public static final String JSON_PROPERTY_LABEL = "label";
  private JsonNullable<String> label = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TIMING = "timing";
  private Object timing;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;


  public AdminStatus conductor(Object conductor) {
    this.conductor = conductor;
    return this;
  }

   /**
   * Conductor statistics
   * @return conductor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Conductor statistics")
  @JsonProperty(JSON_PROPERTY_CONDUCTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getConductor() {
    return conductor;
  }


  @JsonProperty(JSON_PROPERTY_CONDUCTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConductor(Object conductor) {
    this.conductor = conductor;
  }


  public AdminStatus label(String label) {
    this.label = JsonNullable.<String>of(label);
    return this;
  }

   /**
   * Default label
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Default label")
  @JsonIgnore

  public String getLabel() {
        return label.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLabel_JsonNullable() {
    return label;
  }
  
  @JsonProperty(JSON_PROPERTY_LABEL)
  public void setLabel_JsonNullable(JsonNullable<String> label) {
    this.label = label;
  }

  public void setLabel(String label) {
    this.label = JsonNullable.<String>of(label);
  }


  public AdminStatus timing(Object timing) {
    this.timing = timing;
    return this;
  }

   /**
   * Timing results
   * @return timing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timing results")
  @JsonProperty(JSON_PROPERTY_TIMING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getTiming() {
    return timing;
  }


  @JsonProperty(JSON_PROPERTY_TIMING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTiming(Object timing) {
    this.timing = timing;
  }


  public AdminStatus version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Version code
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Version code")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(String version) {
    this.version = version;
  }


  /**
   * Return true if this AdminStatus object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminStatus adminStatus = (AdminStatus) o;
    return Objects.equals(this.conductor, adminStatus.conductor) &&
        Objects.equals(this.label, adminStatus.label) &&
        Objects.equals(this.timing, adminStatus.timing) &&
        Objects.equals(this.version, adminStatus.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conductor, label, timing, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminStatus {\n");
    sb.append("    conductor: ").append(toIndentedString(conductor)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    timing: ").append(toIndentedString(timing)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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


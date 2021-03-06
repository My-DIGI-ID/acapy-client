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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.my_digi_id.acapy_client.invoker.JSON;


/**
 * AMLRecord
 */
@JsonPropertyOrder({
  AMLRecord.JSON_PROPERTY_AML,
  AMLRecord.JSON_PROPERTY_AML_CONTEXT,
  AMLRecord.JSON_PROPERTY_VERSION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-08T11:11:35.214106+01:00[Europe/Berlin]")
public class AMLRecord {
  public static final String JSON_PROPERTY_AML = "aml";
  private Map<String, String> aml = null;

  public static final String JSON_PROPERTY_AML_CONTEXT = "amlContext";
  private String amlContext;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;


  public AMLRecord aml(Map<String, String> aml) {
    this.aml = aml;
    return this;
  }

  public AMLRecord putAmlItem(String key, String amlItem) {
    if (this.aml == null) {
      this.aml = new HashMap<>();
    }
    this.aml.put(key, amlItem);
    return this;
  }

   /**
   * Get aml
   * @return aml
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getAml() {
    return aml;
  }


  @JsonProperty(JSON_PROPERTY_AML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAml(Map<String, String> aml) {
    this.aml = aml;
  }


  public AMLRecord amlContext(String amlContext) {
    this.amlContext = amlContext;
    return this;
  }

   /**
   * Get amlContext
   * @return amlContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AML_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAmlContext() {
    return amlContext;
  }


  @JsonProperty(JSON_PROPERTY_AML_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmlContext(String amlContext) {
    this.amlContext = amlContext;
  }


  public AMLRecord version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
   * Return true if this AMLRecord object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AMLRecord amLRecord = (AMLRecord) o;
    return Objects.equals(this.aml, amLRecord.aml) &&
        Objects.equals(this.amlContext, amLRecord.amlContext) &&
        Objects.equals(this.version, amLRecord.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aml, amlContext, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AMLRecord {\n");
    sb.append("    aml: ").append(toIndentedString(aml)).append("\n");
    sb.append("    amlContext: ").append(toIndentedString(amlContext)).append("\n");
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


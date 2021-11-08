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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.my_digi_id.acapy_client.invoker.JSON;


/**
 * IndyKeyCorrectnessProof
 */
@JsonPropertyOrder({
  IndyKeyCorrectnessProof.JSON_PROPERTY_C,
  IndyKeyCorrectnessProof.JSON_PROPERTY_XR_CAP,
  IndyKeyCorrectnessProof.JSON_PROPERTY_XZ_CAP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-08T11:11:35.214106+01:00[Europe/Berlin]")
public class IndyKeyCorrectnessProof {
  public static final String JSON_PROPERTY_C = "c";
  private String c;

  public static final String JSON_PROPERTY_XR_CAP = "xr_cap";
  private List<List<String>> xrCap = new ArrayList<>();

  public static final String JSON_PROPERTY_XZ_CAP = "xz_cap";
  private String xzCap;


  public IndyKeyCorrectnessProof c(String c) {
    this.c = c;
    return this;
  }

   /**
   * c in key correctness proof
   * @return c
  **/
  @ApiModelProperty(example = "0", required = true, value = "c in key correctness proof")
  @JsonProperty(JSON_PROPERTY_C)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getC() {
    return c;
  }


  @JsonProperty(JSON_PROPERTY_C)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setC(String c) {
    this.c = c;
  }


  public IndyKeyCorrectnessProof xrCap(List<List<String>> xrCap) {
    this.xrCap = xrCap;
    return this;
  }

  public IndyKeyCorrectnessProof addXrCapItem(List<String> xrCapItem) {
    this.xrCap.add(xrCapItem);
    return this;
  }

   /**
   * xr_cap in key correctness proof
   * @return xrCap
  **/
  @ApiModelProperty(required = true, value = "xr_cap in key correctness proof")
  @JsonProperty(JSON_PROPERTY_XR_CAP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<List<String>> getXrCap() {
    return xrCap;
  }


  @JsonProperty(JSON_PROPERTY_XR_CAP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setXrCap(List<List<String>> xrCap) {
    this.xrCap = xrCap;
  }


  public IndyKeyCorrectnessProof xzCap(String xzCap) {
    this.xzCap = xzCap;
    return this;
  }

   /**
   * xz_cap in key correctness proof
   * @return xzCap
  **/
  @ApiModelProperty(example = "0", required = true, value = "xz_cap in key correctness proof")
  @JsonProperty(JSON_PROPERTY_XZ_CAP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getXzCap() {
    return xzCap;
  }


  @JsonProperty(JSON_PROPERTY_XZ_CAP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setXzCap(String xzCap) {
    this.xzCap = xzCap;
  }


  /**
   * Return true if this IndyKeyCorrectnessProof object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndyKeyCorrectnessProof indyKeyCorrectnessProof = (IndyKeyCorrectnessProof) o;
    return Objects.equals(this.c, indyKeyCorrectnessProof.c) &&
        Objects.equals(this.xrCap, indyKeyCorrectnessProof.xrCap) &&
        Objects.equals(this.xzCap, indyKeyCorrectnessProof.xzCap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(c, xrCap, xzCap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndyKeyCorrectnessProof {\n");
    sb.append("    c: ").append(toIndentedString(c)).append("\n");
    sb.append("    xrCap: ").append(toIndentedString(xrCap)).append("\n");
    sb.append("    xzCap: ").append(toIndentedString(xzCap)).append("\n");
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


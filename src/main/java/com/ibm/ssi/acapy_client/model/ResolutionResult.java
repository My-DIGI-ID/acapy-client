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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ibm.ssi.acapy_client.invoker.JSON;


/**
 * ResolutionResult
 */
@JsonPropertyOrder({
  ResolutionResult.JSON_PROPERTY_DID_DOC,
  ResolutionResult.JSON_PROPERTY_METADATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class ResolutionResult {
  public static final String JSON_PROPERTY_DID_DOC = "did_doc";
  private Object didDoc;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Object metadata;


  public ResolutionResult didDoc(Object didDoc) {
    this.didDoc = didDoc;
    return this;
  }

   /**
   * DID Document
   * @return didDoc
  **/
  @ApiModelProperty(required = true, value = "DID Document")
  @JsonProperty(JSON_PROPERTY_DID_DOC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getDidDoc() {
    return didDoc;
  }


  @JsonProperty(JSON_PROPERTY_DID_DOC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDidDoc(Object didDoc) {
    this.didDoc = didDoc;
  }


  public ResolutionResult metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Resolution metadata
   * @return metadata
  **/
  @ApiModelProperty(required = true, value = "Resolution metadata")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  /**
   * Return true if this ResolutionResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResolutionResult resolutionResult = (ResolutionResult) o;
    return Objects.equals(this.didDoc, resolutionResult.didDoc) &&
        Objects.equals(this.metadata, resolutionResult.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(didDoc, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResolutionResult {\n");
    sb.append("    didDoc: ").append(toIndentedString(didDoc)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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


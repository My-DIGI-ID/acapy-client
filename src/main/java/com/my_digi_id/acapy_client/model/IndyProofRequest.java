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
import com.my_digi_id.acapy_client.model.IndyProofReqAttrSpec;
import com.my_digi_id.acapy_client.model.IndyProofReqPredSpec;
import com.my_digi_id.acapy_client.model.IndyProofRequestNonRevoked;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.my_digi_id.acapy_client.invoker.JSON;


/**
 * IndyProofRequest
 */
@JsonPropertyOrder({
  IndyProofRequest.JSON_PROPERTY_NAME,
  IndyProofRequest.JSON_PROPERTY_NON_REVOKED,
  IndyProofRequest.JSON_PROPERTY_NONCE,
  IndyProofRequest.JSON_PROPERTY_REQUESTED_ATTRIBUTES,
  IndyProofRequest.JSON_PROPERTY_REQUESTED_PREDICATES,
  IndyProofRequest.JSON_PROPERTY_VERSION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-08T11:11:35.214106+01:00[Europe/Berlin]")
public class IndyProofRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NON_REVOKED = "non_revoked";
  private JsonNullable<IndyProofRequestNonRevoked> nonRevoked = JsonNullable.<IndyProofRequestNonRevoked>undefined();

  public static final String JSON_PROPERTY_NONCE = "nonce";
  private String nonce;

  public static final String JSON_PROPERTY_REQUESTED_ATTRIBUTES = "requested_attributes";
  private Map<String, IndyProofReqAttrSpec> requestedAttributes = null;

  public static final String JSON_PROPERTY_REQUESTED_PREDICATES = "requested_predicates";
  private Map<String, IndyProofReqPredSpec> requestedPredicates = null;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;


  public IndyProofRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Proof request name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Proof request", value = "Proof request name")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public IndyProofRequest nonRevoked(IndyProofRequestNonRevoked nonRevoked) {
    this.nonRevoked = JsonNullable.<IndyProofRequestNonRevoked>of(nonRevoked);
    return this;
  }

   /**
   * Get nonRevoked
   * @return nonRevoked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public IndyProofRequestNonRevoked getNonRevoked() {
        return nonRevoked.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NON_REVOKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<IndyProofRequestNonRevoked> getNonRevoked_JsonNullable() {
    return nonRevoked;
  }
  
  @JsonProperty(JSON_PROPERTY_NON_REVOKED)
  public void setNonRevoked_JsonNullable(JsonNullable<IndyProofRequestNonRevoked> nonRevoked) {
    this.nonRevoked = nonRevoked;
  }

  public void setNonRevoked(IndyProofRequestNonRevoked nonRevoked) {
    this.nonRevoked = JsonNullable.<IndyProofRequestNonRevoked>of(nonRevoked);
  }


  public IndyProofRequest nonce(String nonce) {
    this.nonce = nonce;
    return this;
  }

   /**
   * Nonce
   * @return nonce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Nonce")
  @JsonProperty(JSON_PROPERTY_NONCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNonce() {
    return nonce;
  }


  @JsonProperty(JSON_PROPERTY_NONCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNonce(String nonce) {
    this.nonce = nonce;
  }


  public IndyProofRequest requestedAttributes(Map<String, IndyProofReqAttrSpec> requestedAttributes) {
    this.requestedAttributes = requestedAttributes;
    return this;
  }

  public IndyProofRequest putRequestedAttributesItem(String key, IndyProofReqAttrSpec requestedAttributesItem) {
    if (this.requestedAttributes == null) {
      this.requestedAttributes = new HashMap<>();
    }
    this.requestedAttributes.put(key, requestedAttributesItem);
    return this;
  }

   /**
   * Requested attribute specifications of proof request
   * @return requestedAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Requested attribute specifications of proof request")
  @JsonProperty(JSON_PROPERTY_REQUESTED_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, IndyProofReqAttrSpec> getRequestedAttributes() {
    return requestedAttributes;
  }


  @JsonProperty(JSON_PROPERTY_REQUESTED_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestedAttributes(Map<String, IndyProofReqAttrSpec> requestedAttributes) {
    this.requestedAttributes = requestedAttributes;
  }


  public IndyProofRequest requestedPredicates(Map<String, IndyProofReqPredSpec> requestedPredicates) {
    this.requestedPredicates = requestedPredicates;
    return this;
  }

  public IndyProofRequest putRequestedPredicatesItem(String key, IndyProofReqPredSpec requestedPredicatesItem) {
    if (this.requestedPredicates == null) {
      this.requestedPredicates = new HashMap<>();
    }
    this.requestedPredicates.put(key, requestedPredicatesItem);
    return this;
  }

   /**
   * Requested predicate specifications of proof request
   * @return requestedPredicates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Requested predicate specifications of proof request")
  @JsonProperty(JSON_PROPERTY_REQUESTED_PREDICATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, IndyProofReqPredSpec> getRequestedPredicates() {
    return requestedPredicates;
  }


  @JsonProperty(JSON_PROPERTY_REQUESTED_PREDICATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestedPredicates(Map<String, IndyProofReqPredSpec> requestedPredicates) {
    this.requestedPredicates = requestedPredicates;
  }


  public IndyProofRequest version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Proof request version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.0", value = "Proof request version")
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
   * Return true if this IndyProofRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndyProofRequest indyProofRequest = (IndyProofRequest) o;
    return Objects.equals(this.name, indyProofRequest.name) &&
        Objects.equals(this.nonRevoked, indyProofRequest.nonRevoked) &&
        Objects.equals(this.nonce, indyProofRequest.nonce) &&
        Objects.equals(this.requestedAttributes, indyProofRequest.requestedAttributes) &&
        Objects.equals(this.requestedPredicates, indyProofRequest.requestedPredicates) &&
        Objects.equals(this.version, indyProofRequest.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, nonRevoked, nonce, requestedAttributes, requestedPredicates, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndyProofRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nonRevoked: ").append(toIndentedString(nonRevoked)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    requestedAttributes: ").append(toIndentedString(requestedAttributes)).append("\n");
    sb.append("    requestedPredicates: ").append(toIndentedString(requestedPredicates)).append("\n");
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


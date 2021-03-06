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
 * IndyCredRequest
 */
@JsonPropertyOrder({
  IndyCredRequest.JSON_PROPERTY_BLINDED_MS,
  IndyCredRequest.JSON_PROPERTY_BLINDED_MS_CORRECTNESS_PROOF,
  IndyCredRequest.JSON_PROPERTY_CRED_DEF_ID,
  IndyCredRequest.JSON_PROPERTY_NONCE,
  IndyCredRequest.JSON_PROPERTY_PROVER_DID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class IndyCredRequest {
  public static final String JSON_PROPERTY_BLINDED_MS = "blinded_ms";
  private Object blindedMs;

  public static final String JSON_PROPERTY_BLINDED_MS_CORRECTNESS_PROOF = "blinded_ms_correctness_proof";
  private Object blindedMsCorrectnessProof;

  public static final String JSON_PROPERTY_CRED_DEF_ID = "cred_def_id";
  private String credDefId;

  public static final String JSON_PROPERTY_NONCE = "nonce";
  private String nonce;

  public static final String JSON_PROPERTY_PROVER_DID = "prover_did";
  private String proverDid;


  public IndyCredRequest blindedMs(Object blindedMs) {
    this.blindedMs = blindedMs;
    return this;
  }

   /**
   * Blinded master secret
   * @return blindedMs
  **/
  @ApiModelProperty(required = true, value = "Blinded master secret")
  @JsonProperty(JSON_PROPERTY_BLINDED_MS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getBlindedMs() {
    return blindedMs;
  }


  @JsonProperty(JSON_PROPERTY_BLINDED_MS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBlindedMs(Object blindedMs) {
    this.blindedMs = blindedMs;
  }


  public IndyCredRequest blindedMsCorrectnessProof(Object blindedMsCorrectnessProof) {
    this.blindedMsCorrectnessProof = blindedMsCorrectnessProof;
    return this;
  }

   /**
   * Blinded master secret correctness proof
   * @return blindedMsCorrectnessProof
  **/
  @ApiModelProperty(required = true, value = "Blinded master secret correctness proof")
  @JsonProperty(JSON_PROPERTY_BLINDED_MS_CORRECTNESS_PROOF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getBlindedMsCorrectnessProof() {
    return blindedMsCorrectnessProof;
  }


  @JsonProperty(JSON_PROPERTY_BLINDED_MS_CORRECTNESS_PROOF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBlindedMsCorrectnessProof(Object blindedMsCorrectnessProof) {
    this.blindedMsCorrectnessProof = blindedMsCorrectnessProof;
  }


  public IndyCredRequest credDefId(String credDefId) {
    this.credDefId = credDefId;
    return this;
  }

   /**
   * Credential definition identifier
   * @return credDefId
  **/
  @ApiModelProperty(example = "WgWxqztrNooG92RXvxSTWv:3:CL:20:tag", required = true, value = "Credential definition identifier")
  @JsonProperty(JSON_PROPERTY_CRED_DEF_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCredDefId() {
    return credDefId;
  }


  @JsonProperty(JSON_PROPERTY_CRED_DEF_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCredDefId(String credDefId) {
    this.credDefId = credDefId;
  }


  public IndyCredRequest nonce(String nonce) {
    this.nonce = nonce;
    return this;
  }

   /**
   * Nonce in credential request
   * @return nonce
  **/
  @ApiModelProperty(example = "0", required = true, value = "Nonce in credential request")
  @JsonProperty(JSON_PROPERTY_NONCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNonce() {
    return nonce;
  }


  @JsonProperty(JSON_PROPERTY_NONCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNonce(String nonce) {
    this.nonce = nonce;
  }


  public IndyCredRequest proverDid(String proverDid) {
    this.proverDid = proverDid;
    return this;
  }

   /**
   * Prover DID
   * @return proverDid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WgWxqztrNooG92RXvxSTWv", value = "Prover DID")
  @JsonProperty(JSON_PROPERTY_PROVER_DID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProverDid() {
    return proverDid;
  }


  @JsonProperty(JSON_PROPERTY_PROVER_DID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProverDid(String proverDid) {
    this.proverDid = proverDid;
  }


  /**
   * Return true if this IndyCredRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndyCredRequest indyCredRequest = (IndyCredRequest) o;
    return Objects.equals(this.blindedMs, indyCredRequest.blindedMs) &&
        Objects.equals(this.blindedMsCorrectnessProof, indyCredRequest.blindedMsCorrectnessProof) &&
        Objects.equals(this.credDefId, indyCredRequest.credDefId) &&
        Objects.equals(this.nonce, indyCredRequest.nonce) &&
        Objects.equals(this.proverDid, indyCredRequest.proverDid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blindedMs, blindedMsCorrectnessProof, credDefId, nonce, proverDid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndyCredRequest {\n");
    sb.append("    blindedMs: ").append(toIndentedString(blindedMs)).append("\n");
    sb.append("    blindedMsCorrectnessProof: ").append(toIndentedString(blindedMsCorrectnessProof)).append("\n");
    sb.append("    credDefId: ").append(toIndentedString(credDefId)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    proverDid: ").append(toIndentedString(proverDid)).append("\n");
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


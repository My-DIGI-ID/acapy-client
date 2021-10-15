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
import com.ibm.ssi.acapy_client.model.IndyKeyCorrectnessProof;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ibm.ssi.acapy_client.invoker.JSON;


/**
 * IndyCredAbstract
 */
@JsonPropertyOrder({
  IndyCredAbstract.JSON_PROPERTY_CRED_DEF_ID,
  IndyCredAbstract.JSON_PROPERTY_KEY_CORRECTNESS_PROOF,
  IndyCredAbstract.JSON_PROPERTY_NONCE,
  IndyCredAbstract.JSON_PROPERTY_SCHEMA_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class IndyCredAbstract {
  public static final String JSON_PROPERTY_CRED_DEF_ID = "cred_def_id";
  private String credDefId;

  public static final String JSON_PROPERTY_KEY_CORRECTNESS_PROOF = "key_correctness_proof";
  private IndyKeyCorrectnessProof keyCorrectnessProof;

  public static final String JSON_PROPERTY_NONCE = "nonce";
  private String nonce;

  public static final String JSON_PROPERTY_SCHEMA_ID = "schema_id";
  private String schemaId;


  public IndyCredAbstract credDefId(String credDefId) {
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


  public IndyCredAbstract keyCorrectnessProof(IndyKeyCorrectnessProof keyCorrectnessProof) {
    this.keyCorrectnessProof = keyCorrectnessProof;
    return this;
  }

   /**
   * Key correctness proof
   * @return keyCorrectnessProof
  **/
  @ApiModelProperty(required = true, value = "Key correctness proof")
  @JsonProperty(JSON_PROPERTY_KEY_CORRECTNESS_PROOF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public IndyKeyCorrectnessProof getKeyCorrectnessProof() {
    return keyCorrectnessProof;
  }


  @JsonProperty(JSON_PROPERTY_KEY_CORRECTNESS_PROOF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKeyCorrectnessProof(IndyKeyCorrectnessProof keyCorrectnessProof) {
    this.keyCorrectnessProof = keyCorrectnessProof;
  }


  public IndyCredAbstract nonce(String nonce) {
    this.nonce = nonce;
    return this;
  }

   /**
   * Nonce in credential abstract
   * @return nonce
  **/
  @ApiModelProperty(example = "0", required = true, value = "Nonce in credential abstract")
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


  public IndyCredAbstract schemaId(String schemaId) {
    this.schemaId = schemaId;
    return this;
  }

   /**
   * Schema identifier
   * @return schemaId
  **/
  @ApiModelProperty(example = "WgWxqztrNooG92RXvxSTWv:2:schema_name:1.0", required = true, value = "Schema identifier")
  @JsonProperty(JSON_PROPERTY_SCHEMA_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSchemaId() {
    return schemaId;
  }


  @JsonProperty(JSON_PROPERTY_SCHEMA_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSchemaId(String schemaId) {
    this.schemaId = schemaId;
  }


  /**
   * Return true if this IndyCredAbstract object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndyCredAbstract indyCredAbstract = (IndyCredAbstract) o;
    return Objects.equals(this.credDefId, indyCredAbstract.credDefId) &&
        Objects.equals(this.keyCorrectnessProof, indyCredAbstract.keyCorrectnessProof) &&
        Objects.equals(this.nonce, indyCredAbstract.nonce) &&
        Objects.equals(this.schemaId, indyCredAbstract.schemaId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credDefId, keyCorrectnessProof, nonce, schemaId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndyCredAbstract {\n");
    sb.append("    credDefId: ").append(toIndentedString(credDefId)).append("\n");
    sb.append("    keyCorrectnessProof: ").append(toIndentedString(keyCorrectnessProof)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
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


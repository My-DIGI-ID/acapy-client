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
import com.ibm.ssi.acapy_client.model.SignatureOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ibm.ssi.acapy_client.invoker.JSON;


/**
 * SignedDoc
 */
@JsonPropertyOrder({
  SignedDoc.JSON_PROPERTY_PROOF
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-28T08:24:27.640452+02:00[Europe/Berlin]")
public class SignedDoc {
  public static final String JSON_PROPERTY_PROOF = "proof";
  private SignatureOptions proof;


  public SignedDoc proof(SignatureOptions proof) {
    this.proof = proof;
    return this;
  }

   /**
   * Linked data proof
   * @return proof
  **/
  @ApiModelProperty(required = true, value = "Linked data proof")
  @JsonProperty(JSON_PROPERTY_PROOF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SignatureOptions getProof() {
    return proof;
  }


  @JsonProperty(JSON_PROPERTY_PROOF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProof(SignatureOptions proof) {
    this.proof = proof;
  }


  /**
   * Return true if this SignedDoc object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignedDoc signedDoc = (SignedDoc) o;
    return Objects.equals(this.proof, signedDoc.proof);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proof);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignedDoc {\n");
    sb.append("    proof: ").append(toIndentedString(proof)).append("\n");
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


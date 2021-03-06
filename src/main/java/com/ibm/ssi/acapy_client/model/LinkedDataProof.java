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
 * LinkedDataProof
 */
@JsonPropertyOrder({
  LinkedDataProof.JSON_PROPERTY_CHALLENGE,
  LinkedDataProof.JSON_PROPERTY_CREATED,
  LinkedDataProof.JSON_PROPERTY_DOMAIN,
  LinkedDataProof.JSON_PROPERTY_JWS,
  LinkedDataProof.JSON_PROPERTY_NONCE,
  LinkedDataProof.JSON_PROPERTY_PROOF_PURPOSE,
  LinkedDataProof.JSON_PROPERTY_PROOF_VALUE,
  LinkedDataProof.JSON_PROPERTY_TYPE,
  LinkedDataProof.JSON_PROPERTY_VERIFICATION_METHOD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class LinkedDataProof {
  public static final String JSON_PROPERTY_CHALLENGE = "challenge";
  private String challenge;

  public static final String JSON_PROPERTY_CREATED = "created";
  private String created;

  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private String domain;

  public static final String JSON_PROPERTY_JWS = "jws";
  private String jws;

  public static final String JSON_PROPERTY_NONCE = "nonce";
  private String nonce;

  public static final String JSON_PROPERTY_PROOF_PURPOSE = "proofPurpose";
  private String proofPurpose;

  public static final String JSON_PROPERTY_PROOF_VALUE = "proofValue";
  private String proofValue;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_VERIFICATION_METHOD = "verificationMethod";
  private String verificationMethod;


  public LinkedDataProof challenge(String challenge) {
    this.challenge = challenge;
    return this;
  }

   /**
   * Associates a challenge with a proof, for use with a proofPurpose such as authentication
   * @return challenge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3fa85f64-5717-4562-b3fc-2c963f66afa6", value = "Associates a challenge with a proof, for use with a proofPurpose such as authentication")
  @JsonProperty(JSON_PROPERTY_CHALLENGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChallenge() {
    return challenge;
  }


  @JsonProperty(JSON_PROPERTY_CHALLENGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChallenge(String challenge) {
    this.challenge = challenge;
  }


  public LinkedDataProof created(String created) {
    this.created = created;
    return this;
  }

   /**
   * The string value of an ISO8601 combined date and time string generated by the Signature Algorithm
   * @return created
  **/
  @ApiModelProperty(example = "2021-08-25 08:37:04Z", required = true, value = "The string value of an ISO8601 combined date and time string generated by the Signature Algorithm")
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCreated() {
    return created;
  }


  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreated(String created) {
    this.created = created;
  }


  public LinkedDataProof domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * A string value specifying the restricted domain of the signature.
   * @return domain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "example.com", value = "A string value specifying the restricted domain of the signature.")
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDomain() {
    return domain;
  }


  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomain(String domain) {
    this.domain = domain;
  }


  public LinkedDataProof jws(String jws) {
    this.jws = jws;
    return this;
  }

   /**
   * Associates a Detached Json Web Signature with a proof
   * @return jws
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "eyJhbGciOiAiRWREUc2UsICJjcml0IjogWyJiNjQiXX0..lKJU0Df_keblRKhZAS9Qq6zybm-HqUXNVZ8vgEPNTAjQ1Ch6YBKY7UBAjg6iBX5qBQ", value = "Associates a Detached Json Web Signature with a proof")
  @JsonProperty(JSON_PROPERTY_JWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getJws() {
    return jws;
  }


  @JsonProperty(JSON_PROPERTY_JWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJws(String jws) {
    this.jws = jws;
  }


  public LinkedDataProof nonce(String nonce) {
    this.nonce = nonce;
    return this;
  }

   /**
   * The nonce
   * @return nonce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CF69iO3nfvqRsRBNElE8b4wO39SyJHPM7Gg1nExltW5vSfQA1lvDCR/zXX1To0/4NLo==", value = "The nonce")
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


  public LinkedDataProof proofPurpose(String proofPurpose) {
    this.proofPurpose = proofPurpose;
    return this;
  }

   /**
   * Proof purpose
   * @return proofPurpose
  **/
  @ApiModelProperty(example = "assertionMethod", required = true, value = "Proof purpose")
  @JsonProperty(JSON_PROPERTY_PROOF_PURPOSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProofPurpose() {
    return proofPurpose;
  }


  @JsonProperty(JSON_PROPERTY_PROOF_PURPOSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProofPurpose(String proofPurpose) {
    this.proofPurpose = proofPurpose;
  }


  public LinkedDataProof proofValue(String proofValue) {
    this.proofValue = proofValue;
    return this;
  }

   /**
   * The proof value of a proof
   * @return proofValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "sy1AahqbzJQ63n9RtekmwzqZeVj494VppdAVJBnMYrTwft6cLJJGeTSSxCCJ6HKnRtwE7jjDh6sB2z2AAiZY9BBnCD8wUVgwqH3qchGRCuC2RugA4eQ9fUrR4Yuycac3caiaaay", value = "The proof value of a proof")
  @JsonProperty(JSON_PROPERTY_PROOF_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProofValue() {
    return proofValue;
  }


  @JsonProperty(JSON_PROPERTY_PROOF_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProofValue(String proofValue) {
    this.proofValue = proofValue;
  }


  public LinkedDataProof type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Identifies the digital signature suite that was used to create the signature
   * @return type
  **/
  @ApiModelProperty(example = "Ed25519Signature2018", required = true, value = "Identifies the digital signature suite that was used to create the signature")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


  public LinkedDataProof verificationMethod(String verificationMethod) {
    this.verificationMethod = verificationMethod;
    return this;
  }

   /**
   * Information used for proof verification
   * @return verificationMethod
  **/
  @ApiModelProperty(example = "did:key:z6Mkgg342Ycpuk263R9d8Aq6MUaxPn1DDeHyGo38EefXmgDL#z6Mkgg342Ycpuk263R9d8Aq6MUaxPn1DDeHyGo38EefXmgDL", required = true, value = "Information used for proof verification")
  @JsonProperty(JSON_PROPERTY_VERIFICATION_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getVerificationMethod() {
    return verificationMethod;
  }


  @JsonProperty(JSON_PROPERTY_VERIFICATION_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVerificationMethod(String verificationMethod) {
    this.verificationMethod = verificationMethod;
  }


  /**
   * Return true if this LinkedDataProof object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkedDataProof linkedDataProof = (LinkedDataProof) o;
    return Objects.equals(this.challenge, linkedDataProof.challenge) &&
        Objects.equals(this.created, linkedDataProof.created) &&
        Objects.equals(this.domain, linkedDataProof.domain) &&
        Objects.equals(this.jws, linkedDataProof.jws) &&
        Objects.equals(this.nonce, linkedDataProof.nonce) &&
        Objects.equals(this.proofPurpose, linkedDataProof.proofPurpose) &&
        Objects.equals(this.proofValue, linkedDataProof.proofValue) &&
        Objects.equals(this.type, linkedDataProof.type) &&
        Objects.equals(this.verificationMethod, linkedDataProof.verificationMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(challenge, created, domain, jws, nonce, proofPurpose, proofValue, type, verificationMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedDataProof {\n");
    sb.append("    challenge: ").append(toIndentedString(challenge)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    jws: ").append(toIndentedString(jws)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    proofPurpose: ").append(toIndentedString(proofPurpose)).append("\n");
    sb.append("    proofValue: ").append(toIndentedString(proofValue)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    verificationMethod: ").append(toIndentedString(verificationMethod)).append("\n");
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


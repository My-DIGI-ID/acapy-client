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
import com.ibm.ssi.acapy_client.model.Credential;
import com.ibm.ssi.acapy_client.model.LDProofVCDetailOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ibm.ssi.acapy_client.invoker.JSON;


/**
 * LDProofVCDetail
 */
@JsonPropertyOrder({
  LDProofVCDetail.JSON_PROPERTY_CREDENTIAL,
  LDProofVCDetail.JSON_PROPERTY_OPTIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class LDProofVCDetail {
  public static final String JSON_PROPERTY_CREDENTIAL = "credential";
  private Credential credential;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private LDProofVCDetailOptions options;


  public LDProofVCDetail credential(Credential credential) {
    this.credential = credential;
    return this;
  }

   /**
   * Detail of the JSON-LD Credential to be issued
   * @return credential
  **/
  @ApiModelProperty(example = "{\"@context\":[\"https://www.w3.org/2018/credentials/v1\",\"https://w3id.org/citizenship/v1\"],\"credentialSubject\":{\"familyName\":\"SMITH\",\"gender\":\"Male\",\"givenName\":\"JOHN\",\"type\":[\"PermanentResident\",\"Person\"]},\"description\":\"Government of Example Permanent Resident Card.\",\"identifier\":\"83627465\",\"issuanceDate\":\"2019-12-03T12:19:52Z\",\"issuer\":\"did:key:z6MkmjY8GnV5i9YTDtPETC2uUAW6ejw3nk5mXF5yci5ab7th\",\"name\":\"Permanent Resident Card\",\"type\":[\"VerifiableCredential\",\"PermanentResidentCard\"]}", required = true, value = "Detail of the JSON-LD Credential to be issued")
  @JsonProperty(JSON_PROPERTY_CREDENTIAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Credential getCredential() {
    return credential;
  }


  @JsonProperty(JSON_PROPERTY_CREDENTIAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCredential(Credential credential) {
    this.credential = credential;
  }


  public LDProofVCDetail options(LDProofVCDetailOptions options) {
    this.options = options;
    return this;
  }

   /**
   * Options for specifying how the linked data proof is created.
   * @return options
  **/
  @ApiModelProperty(example = "{\"proofType\":\"Ed25519Signature2018\"}", required = true, value = "Options for specifying how the linked data proof is created.")
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LDProofVCDetailOptions getOptions() {
    return options;
  }


  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOptions(LDProofVCDetailOptions options) {
    this.options = options;
  }


  /**
   * Return true if this LDProofVCDetail object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LDProofVCDetail ldProofVCDetail = (LDProofVCDetail) o;
    return Objects.equals(this.credential, ldProofVCDetail.credential) &&
        Objects.equals(this.options, ldProofVCDetail.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credential, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LDProofVCDetail {\n");
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

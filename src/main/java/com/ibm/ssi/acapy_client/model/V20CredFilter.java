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
import com.ibm.ssi.acapy_client.model.LDProofVCDetail;
import com.ibm.ssi.acapy_client.model.V20CredFilterIndy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ibm.ssi.acapy_client.invoker.JSON;


/**
 * V20CredFilter
 */
@JsonPropertyOrder({
  V20CredFilter.JSON_PROPERTY_INDY,
  V20CredFilter.JSON_PROPERTY_LD_PROOF
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class V20CredFilter {
  public static final String JSON_PROPERTY_INDY = "indy";
  private V20CredFilterIndy indy;

  public static final String JSON_PROPERTY_LD_PROOF = "ld_proof";
  private LDProofVCDetail ldProof;


  public V20CredFilter indy(V20CredFilterIndy indy) {
    this.indy = indy;
    return this;
  }

   /**
   * Credential filter for indy
   * @return indy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Credential filter for indy")
  @JsonProperty(JSON_PROPERTY_INDY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public V20CredFilterIndy getIndy() {
    return indy;
  }


  @JsonProperty(JSON_PROPERTY_INDY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndy(V20CredFilterIndy indy) {
    this.indy = indy;
  }


  public V20CredFilter ldProof(LDProofVCDetail ldProof) {
    this.ldProof = ldProof;
    return this;
  }

   /**
   * Credential filter for linked data proof
   * @return ldProof
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Credential filter for linked data proof")
  @JsonProperty(JSON_PROPERTY_LD_PROOF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LDProofVCDetail getLdProof() {
    return ldProof;
  }


  @JsonProperty(JSON_PROPERTY_LD_PROOF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLdProof(LDProofVCDetail ldProof) {
    this.ldProof = ldProof;
  }


  /**
   * Return true if this V20CredFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V20CredFilter v20CredFilter = (V20CredFilter) o;
    return Objects.equals(this.indy, v20CredFilter.indy) &&
        Objects.equals(this.ldProof, v20CredFilter.ldProof);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indy, ldProof);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V20CredFilter {\n");
    sb.append("    indy: ").append(toIndentedString(indy)).append("\n");
    sb.append("    ldProof: ").append(toIndentedString(ldProof)).append("\n");
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


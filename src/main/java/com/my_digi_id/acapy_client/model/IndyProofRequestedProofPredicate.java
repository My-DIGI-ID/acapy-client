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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.my_digi_id.acapy_client.invoker.JSON;


/**
 * IndyProofRequestedProofPredicate
 */
@JsonPropertyOrder({
  IndyProofRequestedProofPredicate.JSON_PROPERTY_SUB_PROOF_INDEX
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-08T11:11:35.214106+01:00[Europe/Berlin]")
public class IndyProofRequestedProofPredicate {
  public static final String JSON_PROPERTY_SUB_PROOF_INDEX = "sub_proof_index";
  private Integer subProofIndex;


  public IndyProofRequestedProofPredicate subProofIndex(Integer subProofIndex) {
    this.subProofIndex = subProofIndex;
    return this;
  }

   /**
   * Sub-proof index
   * @return subProofIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sub-proof index")
  @JsonProperty(JSON_PROPERTY_SUB_PROOF_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSubProofIndex() {
    return subProofIndex;
  }


  @JsonProperty(JSON_PROPERTY_SUB_PROOF_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubProofIndex(Integer subProofIndex) {
    this.subProofIndex = subProofIndex;
  }


  /**
   * Return true if this IndyProofRequestedProofPredicate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndyProofRequestedProofPredicate indyProofRequestedProofPredicate = (IndyProofRequestedProofPredicate) o;
    return Objects.equals(this.subProofIndex, indyProofRequestedProofPredicate.subProofIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subProofIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndyProofRequestedProofPredicate {\n");
    sb.append("    subProofIndex: ").append(toIndentedString(subProofIndex)).append("\n");
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


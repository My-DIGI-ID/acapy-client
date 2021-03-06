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
import com.ibm.ssi.acapy_client.model.IndyGEProofPred;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ibm.ssi.acapy_client.invoker.JSON;


/**
 * IndyGEProof
 */
@JsonPropertyOrder({
  IndyGEProof.JSON_PROPERTY_ALPHA,
  IndyGEProof.JSON_PROPERTY_MJ,
  IndyGEProof.JSON_PROPERTY_PREDICATE,
  IndyGEProof.JSON_PROPERTY_R,
  IndyGEProof.JSON_PROPERTY_T,
  IndyGEProof.JSON_PROPERTY_U
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class IndyGEProof {
  public static final String JSON_PROPERTY_ALPHA = "alpha";
  private String alpha;

  public static final String JSON_PROPERTY_MJ = "mj";
  private String mj;

  public static final String JSON_PROPERTY_PREDICATE = "predicate";
  private IndyGEProofPred predicate;

  public static final String JSON_PROPERTY_R = "r";
  private Map<String, String> r = null;

  public static final String JSON_PROPERTY_T = "t";
  private Map<String, String> t = null;

  public static final String JSON_PROPERTY_U = "u";
  private Map<String, String> u = null;


  public IndyGEProof alpha(String alpha) {
    this.alpha = alpha;
    return this;
  }

   /**
   * Get alpha
   * @return alpha
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_ALPHA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAlpha() {
    return alpha;
  }


  @JsonProperty(JSON_PROPERTY_ALPHA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlpha(String alpha) {
    this.alpha = alpha;
  }


  public IndyGEProof mj(String mj) {
    this.mj = mj;
    return this;
  }

   /**
   * Get mj
   * @return mj
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_MJ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMj() {
    return mj;
  }


  @JsonProperty(JSON_PROPERTY_MJ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMj(String mj) {
    this.mj = mj;
  }


  public IndyGEProof predicate(IndyGEProofPred predicate) {
    this.predicate = predicate;
    return this;
  }

   /**
   * Get predicate
   * @return predicate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PREDICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IndyGEProofPred getPredicate() {
    return predicate;
  }


  @JsonProperty(JSON_PROPERTY_PREDICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPredicate(IndyGEProofPred predicate) {
    this.predicate = predicate;
  }


  public IndyGEProof r(Map<String, String> r) {
    this.r = r;
    return this;
  }

  public IndyGEProof putRItem(String key, String rItem) {
    if (this.r == null) {
      this.r = new HashMap<>();
    }
    this.r.put(key, rItem);
    return this;
  }

   /**
   * Get r
   * @return r
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_R)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getR() {
    return r;
  }


  @JsonProperty(JSON_PROPERTY_R)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setR(Map<String, String> r) {
    this.r = r;
  }


  public IndyGEProof t(Map<String, String> t) {
    this.t = t;
    return this;
  }

  public IndyGEProof putTItem(String key, String tItem) {
    if (this.t == null) {
      this.t = new HashMap<>();
    }
    this.t.put(key, tItem);
    return this;
  }

   /**
   * Get t
   * @return t
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_T)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getT() {
    return t;
  }


  @JsonProperty(JSON_PROPERTY_T)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setT(Map<String, String> t) {
    this.t = t;
  }


  public IndyGEProof u(Map<String, String> u) {
    this.u = u;
    return this;
  }

  public IndyGEProof putUItem(String key, String uItem) {
    if (this.u == null) {
      this.u = new HashMap<>();
    }
    this.u.put(key, uItem);
    return this;
  }

   /**
   * Get u
   * @return u
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_U)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getU() {
    return u;
  }


  @JsonProperty(JSON_PROPERTY_U)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setU(Map<String, String> u) {
    this.u = u;
  }


  /**
   * Return true if this IndyGEProof object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndyGEProof indyGEProof = (IndyGEProof) o;
    return Objects.equals(this.alpha, indyGEProof.alpha) &&
        Objects.equals(this.mj, indyGEProof.mj) &&
        Objects.equals(this.predicate, indyGEProof.predicate) &&
        Objects.equals(this.r, indyGEProof.r) &&
        Objects.equals(this.t, indyGEProof.t) &&
        Objects.equals(this.u, indyGEProof.u);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alpha, mj, predicate, r, t, u);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndyGEProof {\n");
    sb.append("    alpha: ").append(toIndentedString(alpha)).append("\n");
    sb.append("    mj: ").append(toIndentedString(mj)).append("\n");
    sb.append("    predicate: ").append(toIndentedString(predicate)).append("\n");
    sb.append("    r: ").append(toIndentedString(r)).append("\n");
    sb.append("    t: ").append(toIndentedString(t)).append("\n");
    sb.append("    u: ").append(toIndentedString(u)).append("\n");
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


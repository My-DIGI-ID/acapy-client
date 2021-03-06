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
import com.my_digi_id.acapy_client.model.IndyProofReqPredSpecNonRevoked;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.my_digi_id.acapy_client.invoker.JSON;


/**
 * IndyProofReqPredSpec
 */
@JsonPropertyOrder({
  IndyProofReqPredSpec.JSON_PROPERTY_NAME,
  IndyProofReqPredSpec.JSON_PROPERTY_NON_REVOKED,
  IndyProofReqPredSpec.JSON_PROPERTY_P_TYPE,
  IndyProofReqPredSpec.JSON_PROPERTY_P_VALUE,
  IndyProofReqPredSpec.JSON_PROPERTY_RESTRICTIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-08T11:11:35.214106+01:00[Europe/Berlin]")
public class IndyProofReqPredSpec {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NON_REVOKED = "non_revoked";
  private JsonNullable<IndyProofReqPredSpecNonRevoked> nonRevoked = JsonNullable.<IndyProofReqPredSpecNonRevoked>undefined();

  /**
   * Predicate type (&#39;&lt;&#39;, &#39;&lt;&#x3D;&#39;, &#39;&gt;&#x3D;&#39;, or &#39;&gt;&#39;)
   */
  public enum PTypeEnum {
    LESS_THAN("<"),
    
    LESS_THAN_OR_EQUAL_TO("<="),
    
    GREATER_THAN_OR_EQUAL_TO(">="),
    
    GREATER_THAN(">");

    private String value;

    PTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PTypeEnum fromValue(String value) {
      for (PTypeEnum b : PTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_P_TYPE = "p_type";
  private PTypeEnum pType;

  public static final String JSON_PROPERTY_P_VALUE = "p_value";
  private Integer pValue;

  public static final String JSON_PROPERTY_RESTRICTIONS = "restrictions";
  private List<Map<String, String>> restrictions = null;


  public IndyProofReqPredSpec name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Attribute name
   * @return name
  **/
  @ApiModelProperty(example = "index", required = true, value = "Attribute name")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public IndyProofReqPredSpec nonRevoked(IndyProofReqPredSpecNonRevoked nonRevoked) {
    this.nonRevoked = JsonNullable.<IndyProofReqPredSpecNonRevoked>of(nonRevoked);
    return this;
  }

   /**
   * Get nonRevoked
   * @return nonRevoked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public IndyProofReqPredSpecNonRevoked getNonRevoked() {
        return nonRevoked.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NON_REVOKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<IndyProofReqPredSpecNonRevoked> getNonRevoked_JsonNullable() {
    return nonRevoked;
  }
  
  @JsonProperty(JSON_PROPERTY_NON_REVOKED)
  public void setNonRevoked_JsonNullable(JsonNullable<IndyProofReqPredSpecNonRevoked> nonRevoked) {
    this.nonRevoked = nonRevoked;
  }

  public void setNonRevoked(IndyProofReqPredSpecNonRevoked nonRevoked) {
    this.nonRevoked = JsonNullable.<IndyProofReqPredSpecNonRevoked>of(nonRevoked);
  }


  public IndyProofReqPredSpec pType(PTypeEnum pType) {
    this.pType = pType;
    return this;
  }

   /**
   * Predicate type (&#39;&lt;&#39;, &#39;&lt;&#x3D;&#39;, &#39;&gt;&#x3D;&#39;, or &#39;&gt;&#39;)
   * @return pType
  **/
  @ApiModelProperty(example = ">=", required = true, value = "Predicate type ('<', '<=', '>=', or '>')")
  @JsonProperty(JSON_PROPERTY_P_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PTypeEnum getpType() {
    return pType;
  }


  @JsonProperty(JSON_PROPERTY_P_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setpType(PTypeEnum pType) {
    this.pType = pType;
  }


  public IndyProofReqPredSpec pValue(Integer pValue) {
    this.pValue = pValue;
    return this;
  }

   /**
   * Threshold value
   * @return pValue
  **/
  @ApiModelProperty(required = true, value = "Threshold value")
  @JsonProperty(JSON_PROPERTY_P_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getpValue() {
    return pValue;
  }


  @JsonProperty(JSON_PROPERTY_P_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setpValue(Integer pValue) {
    this.pValue = pValue;
  }


  public IndyProofReqPredSpec restrictions(List<Map<String, String>> restrictions) {
    this.restrictions = restrictions;
    return this;
  }

  public IndyProofReqPredSpec addRestrictionsItem(Map<String, String> restrictionsItem) {
    if (this.restrictions == null) {
      this.restrictions = new ArrayList<>();
    }
    this.restrictions.add(restrictionsItem);
    return this;
  }

   /**
   * If present, credential must satisfy one of given restrictions: specify schema_id, schema_issuer_did, schema_name, schema_version, issuer_did, cred_def_id, and/or attr::&lt;attribute-name&gt;::value where &lt;attribute-name&gt; represents a credential attribute name
   * @return restrictions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If present, credential must satisfy one of given restrictions: specify schema_id, schema_issuer_did, schema_name, schema_version, issuer_did, cred_def_id, and/or attr::<attribute-name>::value where <attribute-name> represents a credential attribute name")
  @JsonProperty(JSON_PROPERTY_RESTRICTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Map<String, String>> getRestrictions() {
    return restrictions;
  }


  @JsonProperty(JSON_PROPERTY_RESTRICTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRestrictions(List<Map<String, String>> restrictions) {
    this.restrictions = restrictions;
  }


  /**
   * Return true if this IndyProofReqPredSpec object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndyProofReqPredSpec indyProofReqPredSpec = (IndyProofReqPredSpec) o;
    return Objects.equals(this.name, indyProofReqPredSpec.name) &&
        Objects.equals(this.nonRevoked, indyProofReqPredSpec.nonRevoked) &&
        Objects.equals(this.pType, indyProofReqPredSpec.pType) &&
        Objects.equals(this.pValue, indyProofReqPredSpec.pValue) &&
        Objects.equals(this.restrictions, indyProofReqPredSpec.restrictions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, nonRevoked, pType, pValue, restrictions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndyProofReqPredSpec {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nonRevoked: ").append(toIndentedString(nonRevoked)).append("\n");
    sb.append("    pType: ").append(toIndentedString(pType)).append("\n");
    sb.append("    pValue: ").append(toIndentedString(pValue)).append("\n");
    sb.append("    restrictions: ").append(toIndentedString(restrictions)).append("\n");
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


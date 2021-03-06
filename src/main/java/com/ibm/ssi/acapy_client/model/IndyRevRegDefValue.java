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
import com.ibm.ssi.acapy_client.model.IndyRevRegDefValuePublicKeys;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ibm.ssi.acapy_client.invoker.JSON;


/**
 * IndyRevRegDefValue
 */
@JsonPropertyOrder({
  IndyRevRegDefValue.JSON_PROPERTY_ISSUANCE_TYPE,
  IndyRevRegDefValue.JSON_PROPERTY_MAX_CRED_NUM,
  IndyRevRegDefValue.JSON_PROPERTY_PUBLIC_KEYS,
  IndyRevRegDefValue.JSON_PROPERTY_TAILS_HASH,
  IndyRevRegDefValue.JSON_PROPERTY_TAILS_LOCATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class IndyRevRegDefValue {
  /**
   * Issuance type
   */
  public enum IssuanceTypeEnum {
    ON_DEMAND("ISSUANCE_ON_DEMAND"),
    
    BY_DEFAULT("ISSUANCE_BY_DEFAULT");

    private String value;

    IssuanceTypeEnum(String value) {
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
    public static IssuanceTypeEnum fromValue(String value) {
      for (IssuanceTypeEnum b : IssuanceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ISSUANCE_TYPE = "issuanceType";
  private IssuanceTypeEnum issuanceType;

  public static final String JSON_PROPERTY_MAX_CRED_NUM = "maxCredNum";
  private Integer maxCredNum;

  public static final String JSON_PROPERTY_PUBLIC_KEYS = "publicKeys";
  private IndyRevRegDefValuePublicKeys publicKeys;

  public static final String JSON_PROPERTY_TAILS_HASH = "tailsHash";
  private String tailsHash;

  public static final String JSON_PROPERTY_TAILS_LOCATION = "tailsLocation";
  private String tailsLocation;


  public IndyRevRegDefValue issuanceType(IssuanceTypeEnum issuanceType) {
    this.issuanceType = issuanceType;
    return this;
  }

   /**
   * Issuance type
   * @return issuanceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Issuance type")
  @JsonProperty(JSON_PROPERTY_ISSUANCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IssuanceTypeEnum getIssuanceType() {
    return issuanceType;
  }


  @JsonProperty(JSON_PROPERTY_ISSUANCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuanceType(IssuanceTypeEnum issuanceType) {
    this.issuanceType = issuanceType;
  }


  public IndyRevRegDefValue maxCredNum(Integer maxCredNum) {
    this.maxCredNum = maxCredNum;
    return this;
  }

   /**
   * Maximum number of credentials; registry size
   * minimum: 1
   * @return maxCredNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "Maximum number of credentials; registry size")
  @JsonProperty(JSON_PROPERTY_MAX_CRED_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxCredNum() {
    return maxCredNum;
  }


  @JsonProperty(JSON_PROPERTY_MAX_CRED_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxCredNum(Integer maxCredNum) {
    this.maxCredNum = maxCredNum;
  }


  public IndyRevRegDefValue publicKeys(IndyRevRegDefValuePublicKeys publicKeys) {
    this.publicKeys = publicKeys;
    return this;
  }

   /**
   * Public keys
   * @return publicKeys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Public keys")
  @JsonProperty(JSON_PROPERTY_PUBLIC_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IndyRevRegDefValuePublicKeys getPublicKeys() {
    return publicKeys;
  }


  @JsonProperty(JSON_PROPERTY_PUBLIC_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublicKeys(IndyRevRegDefValuePublicKeys publicKeys) {
    this.publicKeys = publicKeys;
  }


  public IndyRevRegDefValue tailsHash(String tailsHash) {
    this.tailsHash = tailsHash;
    return this;
  }

   /**
   * Tails hash value
   * @return tailsHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "H3C2AVvLMv6gmMNam3uVAjZpfkcJCwDwnZn6z3wXmqPV", value = "Tails hash value")
  @JsonProperty(JSON_PROPERTY_TAILS_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTailsHash() {
    return tailsHash;
  }


  @JsonProperty(JSON_PROPERTY_TAILS_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTailsHash(String tailsHash) {
    this.tailsHash = tailsHash;
  }


  public IndyRevRegDefValue tailsLocation(String tailsLocation) {
    this.tailsLocation = tailsLocation;
    return this;
  }

   /**
   * Tails file location
   * @return tailsLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tails file location")
  @JsonProperty(JSON_PROPERTY_TAILS_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTailsLocation() {
    return tailsLocation;
  }


  @JsonProperty(JSON_PROPERTY_TAILS_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTailsLocation(String tailsLocation) {
    this.tailsLocation = tailsLocation;
  }


  /**
   * Return true if this IndyRevRegDefValue object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndyRevRegDefValue indyRevRegDefValue = (IndyRevRegDefValue) o;
    return Objects.equals(this.issuanceType, indyRevRegDefValue.issuanceType) &&
        Objects.equals(this.maxCredNum, indyRevRegDefValue.maxCredNum) &&
        Objects.equals(this.publicKeys, indyRevRegDefValue.publicKeys) &&
        Objects.equals(this.tailsHash, indyRevRegDefValue.tailsHash) &&
        Objects.equals(this.tailsLocation, indyRevRegDefValue.tailsLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuanceType, maxCredNum, publicKeys, tailsHash, tailsLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndyRevRegDefValue {\n");
    sb.append("    issuanceType: ").append(toIndentedString(issuanceType)).append("\n");
    sb.append("    maxCredNum: ").append(toIndentedString(maxCredNum)).append("\n");
    sb.append("    publicKeys: ").append(toIndentedString(publicKeys)).append("\n");
    sb.append("    tailsHash: ").append(toIndentedString(tailsHash)).append("\n");
    sb.append("    tailsLocation: ").append(toIndentedString(tailsLocation)).append("\n");
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


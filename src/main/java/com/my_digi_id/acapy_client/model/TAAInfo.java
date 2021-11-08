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
import com.my_digi_id.acapy_client.model.AMLRecord;
import com.my_digi_id.acapy_client.model.TAAAcceptance;
import com.my_digi_id.acapy_client.model.TAARecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.my_digi_id.acapy_client.invoker.JSON;


/**
 * TAAInfo
 */
@JsonPropertyOrder({
  TAAInfo.JSON_PROPERTY_AML_RECORD,
  TAAInfo.JSON_PROPERTY_TAA_ACCEPTED,
  TAAInfo.JSON_PROPERTY_TAA_RECORD,
  TAAInfo.JSON_PROPERTY_TAA_REQUIRED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-08T11:11:35.214106+01:00[Europe/Berlin]")
public class TAAInfo {
  public static final String JSON_PROPERTY_AML_RECORD = "aml_record";
  private AMLRecord amlRecord;

  public static final String JSON_PROPERTY_TAA_ACCEPTED = "taa_accepted";
  private TAAAcceptance taaAccepted;

  public static final String JSON_PROPERTY_TAA_RECORD = "taa_record";
  private TAARecord taaRecord;

  public static final String JSON_PROPERTY_TAA_REQUIRED = "taa_required";
  private Boolean taaRequired;


  public TAAInfo amlRecord(AMLRecord amlRecord) {
    this.amlRecord = amlRecord;
    return this;
  }

   /**
   * Get amlRecord
   * @return amlRecord
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AML_RECORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AMLRecord getAmlRecord() {
    return amlRecord;
  }


  @JsonProperty(JSON_PROPERTY_AML_RECORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmlRecord(AMLRecord amlRecord) {
    this.amlRecord = amlRecord;
  }


  public TAAInfo taaAccepted(TAAAcceptance taaAccepted) {
    this.taaAccepted = taaAccepted;
    return this;
  }

   /**
   * Get taaAccepted
   * @return taaAccepted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TAA_ACCEPTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TAAAcceptance getTaaAccepted() {
    return taaAccepted;
  }


  @JsonProperty(JSON_PROPERTY_TAA_ACCEPTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaaAccepted(TAAAcceptance taaAccepted) {
    this.taaAccepted = taaAccepted;
  }


  public TAAInfo taaRecord(TAARecord taaRecord) {
    this.taaRecord = taaRecord;
    return this;
  }

   /**
   * Get taaRecord
   * @return taaRecord
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TAA_RECORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TAARecord getTaaRecord() {
    return taaRecord;
  }


  @JsonProperty(JSON_PROPERTY_TAA_RECORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaaRecord(TAARecord taaRecord) {
    this.taaRecord = taaRecord;
  }


  public TAAInfo taaRequired(Boolean taaRequired) {
    this.taaRequired = taaRequired;
    return this;
  }

   /**
   * Get taaRequired
   * @return taaRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TAA_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTaaRequired() {
    return taaRequired;
  }


  @JsonProperty(JSON_PROPERTY_TAA_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaaRequired(Boolean taaRequired) {
    this.taaRequired = taaRequired;
  }


  /**
   * Return true if this TAAInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TAAInfo taAInfo = (TAAInfo) o;
    return Objects.equals(this.amlRecord, taAInfo.amlRecord) &&
        Objects.equals(this.taaAccepted, taAInfo.taaAccepted) &&
        Objects.equals(this.taaRecord, taAInfo.taaRecord) &&
        Objects.equals(this.taaRequired, taAInfo.taaRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amlRecord, taaAccepted, taaRecord, taaRequired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TAAInfo {\n");
    sb.append("    amlRecord: ").append(toIndentedString(amlRecord)).append("\n");
    sb.append("    taaAccepted: ").append(toIndentedString(taaAccepted)).append("\n");
    sb.append("    taaRecord: ").append(toIndentedString(taaRecord)).append("\n");
    sb.append("    taaRequired: ").append(toIndentedString(taaRequired)).append("\n");
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

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
 * V20PresExRecordByFormat
 */
@JsonPropertyOrder({
  V20PresExRecordByFormat.JSON_PROPERTY_PRES,
  V20PresExRecordByFormat.JSON_PROPERTY_PRES_PROPOSAL,
  V20PresExRecordByFormat.JSON_PROPERTY_PRES_REQUEST
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-08T11:11:35.214106+01:00[Europe/Berlin]")
public class V20PresExRecordByFormat {
  public static final String JSON_PROPERTY_PRES = "pres";
  private Object pres;

  public static final String JSON_PROPERTY_PRES_PROPOSAL = "pres_proposal";
  private Object presProposal;

  public static final String JSON_PROPERTY_PRES_REQUEST = "pres_request";
  private Object presRequest;


  public V20PresExRecordByFormat pres(Object pres) {
    this.pres = pres;
    return this;
  }

   /**
   * Get pres
   * @return pres
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getPres() {
    return pres;
  }


  @JsonProperty(JSON_PROPERTY_PRES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPres(Object pres) {
    this.pres = pres;
  }


  public V20PresExRecordByFormat presProposal(Object presProposal) {
    this.presProposal = presProposal;
    return this;
  }

   /**
   * Get presProposal
   * @return presProposal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRES_PROPOSAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getPresProposal() {
    return presProposal;
  }


  @JsonProperty(JSON_PROPERTY_PRES_PROPOSAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPresProposal(Object presProposal) {
    this.presProposal = presProposal;
  }


  public V20PresExRecordByFormat presRequest(Object presRequest) {
    this.presRequest = presRequest;
    return this;
  }

   /**
   * Get presRequest
   * @return presRequest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRES_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getPresRequest() {
    return presRequest;
  }


  @JsonProperty(JSON_PROPERTY_PRES_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPresRequest(Object presRequest) {
    this.presRequest = presRequest;
  }


  /**
   * Return true if this V20PresExRecordByFormat object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V20PresExRecordByFormat v20PresExRecordByFormat = (V20PresExRecordByFormat) o;
    return Objects.equals(this.pres, v20PresExRecordByFormat.pres) &&
        Objects.equals(this.presProposal, v20PresExRecordByFormat.presProposal) &&
        Objects.equals(this.presRequest, v20PresExRecordByFormat.presRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pres, presProposal, presRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V20PresExRecordByFormat {\n");
    sb.append("    pres: ").append(toIndentedString(pres)).append("\n");
    sb.append("    presProposal: ").append(toIndentedString(presProposal)).append("\n");
    sb.append("    presRequest: ").append(toIndentedString(presRequest)).append("\n");
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


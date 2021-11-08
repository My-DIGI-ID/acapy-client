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
import com.my_digi_id.acapy_client.model.IndyCredInfo;
import com.my_digi_id.acapy_client.model.IndyNonRevocationInterval;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.my_digi_id.acapy_client.invoker.JSON;


/**
 * IndyCredPrecis
 */
@JsonPropertyOrder({
  IndyCredPrecis.JSON_PROPERTY_CRED_INFO,
  IndyCredPrecis.JSON_PROPERTY_INTERVAL,
  IndyCredPrecis.JSON_PROPERTY_PRESENTATION_REFERENTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-08T11:11:35.214106+01:00[Europe/Berlin]")
public class IndyCredPrecis {
  public static final String JSON_PROPERTY_CRED_INFO = "cred_info";
  private IndyCredInfo credInfo;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private IndyNonRevocationInterval interval;

  public static final String JSON_PROPERTY_PRESENTATION_REFERENTS = "presentation_referents";
  private List<String> presentationReferents = null;


  public IndyCredPrecis credInfo(IndyCredInfo credInfo) {
    this.credInfo = credInfo;
    return this;
  }

   /**
   * Credential info
   * @return credInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Credential info")
  @JsonProperty(JSON_PROPERTY_CRED_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IndyCredInfo getCredInfo() {
    return credInfo;
  }


  @JsonProperty(JSON_PROPERTY_CRED_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCredInfo(IndyCredInfo credInfo) {
    this.credInfo = credInfo;
  }


  public IndyCredPrecis interval(IndyNonRevocationInterval interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Non-revocation interval from presentation request
   * @return interval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Non-revocation interval from presentation request")
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IndyNonRevocationInterval getInterval() {
    return interval;
  }


  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterval(IndyNonRevocationInterval interval) {
    this.interval = interval;
  }


  public IndyCredPrecis presentationReferents(List<String> presentationReferents) {
    this.presentationReferents = presentationReferents;
    return this;
  }

  public IndyCredPrecis addPresentationReferentsItem(String presentationReferentsItem) {
    if (this.presentationReferents == null) {
      this.presentationReferents = new ArrayList<>();
    }
    this.presentationReferents.add(presentationReferentsItem);
    return this;
  }

   /**
   * Get presentationReferents
   * @return presentationReferents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRESENTATION_REFERENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getPresentationReferents() {
    return presentationReferents;
  }


  @JsonProperty(JSON_PROPERTY_PRESENTATION_REFERENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPresentationReferents(List<String> presentationReferents) {
    this.presentationReferents = presentationReferents;
  }


  /**
   * Return true if this IndyCredPrecis object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndyCredPrecis indyCredPrecis = (IndyCredPrecis) o;
    return Objects.equals(this.credInfo, indyCredPrecis.credInfo) &&
        Objects.equals(this.interval, indyCredPrecis.interval) &&
        Objects.equals(this.presentationReferents, indyCredPrecis.presentationReferents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credInfo, interval, presentationReferents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndyCredPrecis {\n");
    sb.append("    credInfo: ").append(toIndentedString(credInfo)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    presentationReferents: ").append(toIndentedString(presentationReferents)).append("\n");
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


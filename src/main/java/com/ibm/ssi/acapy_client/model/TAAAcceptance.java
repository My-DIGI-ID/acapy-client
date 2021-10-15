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
 * TAAAcceptance
 */
@JsonPropertyOrder({
  TAAAcceptance.JSON_PROPERTY_MECHANISM,
  TAAAcceptance.JSON_PROPERTY_TIME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class TAAAcceptance {
  public static final String JSON_PROPERTY_MECHANISM = "mechanism";
  private String mechanism;

  public static final String JSON_PROPERTY_TIME = "time";
  private Integer time;


  public TAAAcceptance mechanism(String mechanism) {
    this.mechanism = mechanism;
    return this;
  }

   /**
   * Get mechanism
   * @return mechanism
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MECHANISM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMechanism() {
    return mechanism;
  }


  @JsonProperty(JSON_PROPERTY_MECHANISM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMechanism(String mechanism) {
    this.mechanism = mechanism;
  }


  public TAAAcceptance time(Integer time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * minimum: 0
   * maximum: -1
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1629880624", value = "")
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTime() {
    return time;
  }


  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTime(Integer time) {
    this.time = time;
  }


  /**
   * Return true if this TAAAcceptance object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TAAAcceptance taAAcceptance = (TAAAcceptance) o;
    return Objects.equals(this.mechanism, taAAcceptance.mechanism) &&
        Objects.equals(this.time, taAAcceptance.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mechanism, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TAAAcceptance {\n");
    sb.append("    mechanism: ").append(toIndentedString(mechanism)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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


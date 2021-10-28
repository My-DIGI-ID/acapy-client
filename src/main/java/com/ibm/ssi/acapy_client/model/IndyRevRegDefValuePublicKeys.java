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
import com.ibm.ssi.acapy_client.model.IndyRevRegDefValuePublicKeysAccumKey;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ibm.ssi.acapy_client.invoker.JSON;


/**
 * IndyRevRegDefValuePublicKeys
 */
@JsonPropertyOrder({
  IndyRevRegDefValuePublicKeys.JSON_PROPERTY_ACCUM_KEY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-28T08:24:27.640452+02:00[Europe/Berlin]")
public class IndyRevRegDefValuePublicKeys {
  public static final String JSON_PROPERTY_ACCUM_KEY = "accumKey";
  private IndyRevRegDefValuePublicKeysAccumKey accumKey;


  public IndyRevRegDefValuePublicKeys accumKey(IndyRevRegDefValuePublicKeysAccumKey accumKey) {
    this.accumKey = accumKey;
    return this;
  }

   /**
   * Get accumKey
   * @return accumKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCUM_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IndyRevRegDefValuePublicKeysAccumKey getAccumKey() {
    return accumKey;
  }


  @JsonProperty(JSON_PROPERTY_ACCUM_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccumKey(IndyRevRegDefValuePublicKeysAccumKey accumKey) {
    this.accumKey = accumKey;
  }


  /**
   * Return true if this IndyRevRegDefValuePublicKeys object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndyRevRegDefValuePublicKeys indyRevRegDefValuePublicKeys = (IndyRevRegDefValuePublicKeys) o;
    return Objects.equals(this.accumKey, indyRevRegDefValuePublicKeys.accumKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accumKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndyRevRegDefValuePublicKeys {\n");
    sb.append("    accumKey: ").append(toIndentedString(accumKey)).append("\n");
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


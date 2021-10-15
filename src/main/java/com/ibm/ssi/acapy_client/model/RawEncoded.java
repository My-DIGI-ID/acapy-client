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
 * RawEncoded
 */
@JsonPropertyOrder({
  RawEncoded.JSON_PROPERTY_ENCODED,
  RawEncoded.JSON_PROPERTY_RAW
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class RawEncoded {
  public static final String JSON_PROPERTY_ENCODED = "encoded";
  private String encoded;

  public static final String JSON_PROPERTY_RAW = "raw";
  private String raw;


  public RawEncoded encoded(String encoded) {
    this.encoded = encoded;
    return this;
  }

   /**
   * Encoded value
   * @return encoded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Encoded value")
  @JsonProperty(JSON_PROPERTY_ENCODED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEncoded() {
    return encoded;
  }


  @JsonProperty(JSON_PROPERTY_ENCODED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncoded(String encoded) {
    this.encoded = encoded;
  }


  public RawEncoded raw(String raw) {
    this.raw = raw;
    return this;
  }

   /**
   * Raw value
   * @return raw
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Raw value")
  @JsonProperty(JSON_PROPERTY_RAW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRaw() {
    return raw;
  }


  @JsonProperty(JSON_PROPERTY_RAW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRaw(String raw) {
    this.raw = raw;
  }


  /**
   * Return true if this RawEncoded object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RawEncoded rawEncoded = (RawEncoded) o;
    return Objects.equals(this.encoded, rawEncoded.encoded) &&
        Objects.equals(this.raw, rawEncoded.raw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encoded, raw);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RawEncoded {\n");
    sb.append("    encoded: ").append(toIndentedString(encoded)).append("\n");
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
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


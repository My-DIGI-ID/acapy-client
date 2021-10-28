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
 * V20CredFormat
 */
@JsonPropertyOrder({
  V20CredFormat.JSON_PROPERTY_ATTACH_ID,
  V20CredFormat.JSON_PROPERTY_FORMAT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-28T08:24:27.640452+02:00[Europe/Berlin]")
public class V20CredFormat {
  public static final String JSON_PROPERTY_ATTACH_ID = "attach_id";
  private String attachId;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private String format;


  public V20CredFormat attachId(String attachId) {
    this.attachId = attachId;
    return this;
  }

   /**
   * Attachment identifier
   * @return attachId
  **/
  @ApiModelProperty(example = "3fa85f64-5717-4562-b3fc-2c963f66afa6", required = true, value = "Attachment identifier")
  @JsonProperty(JSON_PROPERTY_ATTACH_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAttachId() {
    return attachId;
  }


  @JsonProperty(JSON_PROPERTY_ATTACH_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAttachId(String attachId) {
    this.attachId = attachId;
  }


  public V20CredFormat format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Attachment format specifier
   * @return format
  **/
  @ApiModelProperty(example = "aries/ld-proof-vc-detail@v1.0", required = true, value = "Attachment format specifier")
  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFormat() {
    return format;
  }


  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFormat(String format) {
    this.format = format;
  }


  /**
   * Return true if this V20CredFormat object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V20CredFormat v20CredFormat = (V20CredFormat) o;
    return Objects.equals(this.attachId, v20CredFormat.attachId) &&
        Objects.equals(this.format, v20CredFormat.format);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachId, format);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V20CredFormat {\n");
    sb.append("    attachId: ").append(toIndentedString(attachId)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
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


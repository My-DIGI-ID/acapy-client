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
import com.my_digi_id.acapy_client.model.AttachDecoratorDataJWSHeader;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.my_digi_id.acapy_client.invoker.JSON;


/**
 * AttachDecoratorData1JWS
 */
@JsonPropertyOrder({
  AttachDecoratorData1JWS.JSON_PROPERTY_HEADER,
  AttachDecoratorData1JWS.JSON_PROPERTY_PROTECTED,
  AttachDecoratorData1JWS.JSON_PROPERTY_SIGNATURE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-08T11:11:35.214106+01:00[Europe/Berlin]")
public class AttachDecoratorData1JWS {
  public static final String JSON_PROPERTY_HEADER = "header";
  private AttachDecoratorDataJWSHeader header;

  public static final String JSON_PROPERTY_PROTECTED = "protected";
  private String _protected;

  public static final String JSON_PROPERTY_SIGNATURE = "signature";
  private String signature;


  public AttachDecoratorData1JWS header(AttachDecoratorDataJWSHeader header) {
    this.header = header;
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_HEADER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AttachDecoratorDataJWSHeader getHeader() {
    return header;
  }


  @JsonProperty(JSON_PROPERTY_HEADER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHeader(AttachDecoratorDataJWSHeader header) {
    this.header = header;
  }


  public AttachDecoratorData1JWS _protected(String _protected) {
    this._protected = _protected;
    return this;
  }

   /**
   * protected JWS header
   * @return _protected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ey4uLn0", value = "protected JWS header")
  @JsonProperty(JSON_PROPERTY_PROTECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProtected() {
    return _protected;
  }


  @JsonProperty(JSON_PROPERTY_PROTECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProtected(String _protected) {
    this._protected = _protected;
  }


  public AttachDecoratorData1JWS signature(String signature) {
    this.signature = signature;
    return this;
  }

   /**
   * signature
   * @return signature
  **/
  @ApiModelProperty(example = "ey4uLn0", required = true, value = "signature")
  @JsonProperty(JSON_PROPERTY_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSignature() {
    return signature;
  }


  @JsonProperty(JSON_PROPERTY_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSignature(String signature) {
    this.signature = signature;
  }


  /**
   * Return true if this AttachDecoratorData1JWS object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachDecoratorData1JWS attachDecoratorData1JWS = (AttachDecoratorData1JWS) o;
    return Objects.equals(this.header, attachDecoratorData1JWS.header) &&
        Objects.equals(this._protected, attachDecoratorData1JWS._protected) &&
        Objects.equals(this.signature, attachDecoratorData1JWS.signature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, _protected, signature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachDecoratorData1JWS {\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    _protected: ").append(toIndentedString(_protected)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
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


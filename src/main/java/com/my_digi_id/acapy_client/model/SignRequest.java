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
import com.my_digi_id.acapy_client.model.Doc;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.my_digi_id.acapy_client.invoker.JSON;


/**
 * SignRequest
 */
@JsonPropertyOrder({
  SignRequest.JSON_PROPERTY_DOC,
  SignRequest.JSON_PROPERTY_VERKEY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-08T11:11:35.214106+01:00[Europe/Berlin]")
public class SignRequest {
  public static final String JSON_PROPERTY_DOC = "doc";
  private Doc doc;

  public static final String JSON_PROPERTY_VERKEY = "verkey";
  private String verkey;


  public SignRequest doc(Doc doc) {
    this.doc = doc;
    return this;
  }

   /**
   * Get doc
   * @return doc
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DOC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Doc getDoc() {
    return doc;
  }


  @JsonProperty(JSON_PROPERTY_DOC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDoc(Doc doc) {
    this.doc = doc;
  }


  public SignRequest verkey(String verkey) {
    this.verkey = verkey;
    return this;
  }

   /**
   * Verkey to use for signing
   * @return verkey
  **/
  @ApiModelProperty(required = true, value = "Verkey to use for signing")
  @JsonProperty(JSON_PROPERTY_VERKEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getVerkey() {
    return verkey;
  }


  @JsonProperty(JSON_PROPERTY_VERKEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVerkey(String verkey) {
    this.verkey = verkey;
  }


  /**
   * Return true if this SignRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignRequest signRequest = (SignRequest) o;
    return Objects.equals(this.doc, signRequest.doc) &&
        Objects.equals(this.verkey, signRequest.verkey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(doc, verkey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignRequest {\n");
    sb.append("    doc: ").append(toIndentedString(doc)).append("\n");
    sb.append("    verkey: ").append(toIndentedString(verkey)).append("\n");
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


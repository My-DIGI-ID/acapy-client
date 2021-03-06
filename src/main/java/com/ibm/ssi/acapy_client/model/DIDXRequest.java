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
import com.ibm.ssi.acapy_client.model.AttachDecorator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ibm.ssi.acapy_client.invoker.JSON;


/**
 * DIDXRequest
 */
@JsonPropertyOrder({
  DIDXRequest.JSON_PROPERTY_AT_ID,
  DIDXRequest.JSON_PROPERTY_AT_TYPE,
  DIDXRequest.JSON_PROPERTY_DID,
  DIDXRequest.JSON_PROPERTY_DID_DOC_TILDE_ATTACH,
  DIDXRequest.JSON_PROPERTY_LABEL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class DIDXRequest {
  public static final String JSON_PROPERTY_AT_ID = "@id";
  private String atId;

  public static final String JSON_PROPERTY_AT_TYPE = "@type";
  private String atType;

  public static final String JSON_PROPERTY_DID = "did";
  private String did;

  public static final String JSON_PROPERTY_DID_DOC_TILDE_ATTACH = "did_doc~attach";
  private AttachDecorator didDocTildeAttach;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;


  public DIDXRequest atId(String atId) {
    this.atId = atId;
    return this;
  }

   /**
   * Message identifier
   * @return atId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3fa85f64-5717-4562-b3fc-2c963f66afa6", value = "Message identifier")
  @JsonProperty(JSON_PROPERTY_AT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAtId() {
    return atId;
  }


  @JsonProperty(JSON_PROPERTY_AT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAtId(String atId) {
    this.atId = atId;
  }


   /**
   * Message type
   * @return atType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://didcomm.org/my-family/1.0/my-message-type", value = "Message type")
  @JsonProperty(JSON_PROPERTY_AT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAtType() {
    return atType;
  }




  public DIDXRequest did(String did) {
    this.did = did;
    return this;
  }

   /**
   * DID of exchange
   * @return did
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WgWxqztrNooG92RXvxSTWv", value = "DID of exchange")
  @JsonProperty(JSON_PROPERTY_DID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDid() {
    return did;
  }


  @JsonProperty(JSON_PROPERTY_DID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDid(String did) {
    this.did = did;
  }


  public DIDXRequest didDocTildeAttach(AttachDecorator didDocTildeAttach) {
    this.didDocTildeAttach = didDocTildeAttach;
    return this;
  }

   /**
   * As signed attachment, DID Doc associated with DID
   * @return didDocTildeAttach
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "As signed attachment, DID Doc associated with DID")
  @JsonProperty(JSON_PROPERTY_DID_DOC_TILDE_ATTACH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AttachDecorator getDidDocTildeAttach() {
    return didDocTildeAttach;
  }


  @JsonProperty(JSON_PROPERTY_DID_DOC_TILDE_ATTACH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDidDocTildeAttach(AttachDecorator didDocTildeAttach) {
    this.didDocTildeAttach = didDocTildeAttach;
  }


  public DIDXRequest label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Label for DID exchange request
   * @return label
  **/
  @ApiModelProperty(example = "Request to connect with Bob", required = true, value = "Label for DID exchange request")
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLabel() {
    return label;
  }


  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLabel(String label) {
    this.label = label;
  }


  /**
   * Return true if this DIDXRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DIDXRequest diDXRequest = (DIDXRequest) o;
    return Objects.equals(this.atId, diDXRequest.atId) &&
        Objects.equals(this.atType, diDXRequest.atType) &&
        Objects.equals(this.did, diDXRequest.did) &&
        Objects.equals(this.didDocTildeAttach, diDXRequest.didDocTildeAttach) &&
        Objects.equals(this.label, diDXRequest.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atId, atType, did, didDocTildeAttach, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DIDXRequest {\n");
    sb.append("    atId: ").append(toIndentedString(atId)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    did: ").append(toIndentedString(did)).append("\n");
    sb.append("    didDocTildeAttach: ").append(toIndentedString(didDocTildeAttach)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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


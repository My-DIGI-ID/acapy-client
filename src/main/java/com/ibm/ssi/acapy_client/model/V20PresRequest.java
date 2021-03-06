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
import com.ibm.ssi.acapy_client.model.V20PresFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ibm.ssi.acapy_client.invoker.JSON;


/**
 * V20PresRequest
 */
@JsonPropertyOrder({
  V20PresRequest.JSON_PROPERTY_AT_ID,
  V20PresRequest.JSON_PROPERTY_AT_TYPE,
  V20PresRequest.JSON_PROPERTY_COMMENT,
  V20PresRequest.JSON_PROPERTY_FORMATS,
  V20PresRequest.JSON_PROPERTY_REQUEST_PRESENTATIONS_TILDE_ATTACH,
  V20PresRequest.JSON_PROPERTY_WILL_CONFIRM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class V20PresRequest {
  public static final String JSON_PROPERTY_AT_ID = "@id";
  private String atId;

  public static final String JSON_PROPERTY_AT_TYPE = "@type";
  private String atType;

  public static final String JSON_PROPERTY_COMMENT = "comment";
  private String comment;

  public static final String JSON_PROPERTY_FORMATS = "formats";
  private List<V20PresFormat> formats = new ArrayList<>();

  public static final String JSON_PROPERTY_REQUEST_PRESENTATIONS_TILDE_ATTACH = "request_presentations~attach";
  private List<AttachDecorator> requestPresentationsTildeAttach = new ArrayList<>();

  public static final String JSON_PROPERTY_WILL_CONFIRM = "will_confirm";
  private Boolean willConfirm;


  public V20PresRequest atId(String atId) {
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




  public V20PresRequest comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Human-readable comment
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Human-readable comment")
  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getComment() {
    return comment;
  }


  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComment(String comment) {
    this.comment = comment;
  }


  public V20PresRequest formats(List<V20PresFormat> formats) {
    this.formats = formats;
    return this;
  }

  public V20PresRequest addFormatsItem(V20PresFormat formatsItem) {
    this.formats.add(formatsItem);
    return this;
  }

   /**
   * Get formats
   * @return formats
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FORMATS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<V20PresFormat> getFormats() {
    return formats;
  }


  @JsonProperty(JSON_PROPERTY_FORMATS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFormats(List<V20PresFormat> formats) {
    this.formats = formats;
  }


  public V20PresRequest requestPresentationsTildeAttach(List<AttachDecorator> requestPresentationsTildeAttach) {
    this.requestPresentationsTildeAttach = requestPresentationsTildeAttach;
    return this;
  }

  public V20PresRequest addRequestPresentationsTildeAttachItem(AttachDecorator requestPresentationsTildeAttachItem) {
    this.requestPresentationsTildeAttach.add(requestPresentationsTildeAttachItem);
    return this;
  }

   /**
   * Attachment per acceptable format on corresponding identifier
   * @return requestPresentationsTildeAttach
  **/
  @ApiModelProperty(required = true, value = "Attachment per acceptable format on corresponding identifier")
  @JsonProperty(JSON_PROPERTY_REQUEST_PRESENTATIONS_TILDE_ATTACH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AttachDecorator> getRequestPresentationsTildeAttach() {
    return requestPresentationsTildeAttach;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_PRESENTATIONS_TILDE_ATTACH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRequestPresentationsTildeAttach(List<AttachDecorator> requestPresentationsTildeAttach) {
    this.requestPresentationsTildeAttach = requestPresentationsTildeAttach;
  }


  public V20PresRequest willConfirm(Boolean willConfirm) {
    this.willConfirm = willConfirm;
    return this;
  }

   /**
   * Whether verifier will send confirmation ack
   * @return willConfirm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether verifier will send confirmation ack")
  @JsonProperty(JSON_PROPERTY_WILL_CONFIRM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWillConfirm() {
    return willConfirm;
  }


  @JsonProperty(JSON_PROPERTY_WILL_CONFIRM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWillConfirm(Boolean willConfirm) {
    this.willConfirm = willConfirm;
  }


  /**
   * Return true if this V20PresRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V20PresRequest v20PresRequest = (V20PresRequest) o;
    return Objects.equals(this.atId, v20PresRequest.atId) &&
        Objects.equals(this.atType, v20PresRequest.atType) &&
        Objects.equals(this.comment, v20PresRequest.comment) &&
        Objects.equals(this.formats, v20PresRequest.formats) &&
        Objects.equals(this.requestPresentationsTildeAttach, v20PresRequest.requestPresentationsTildeAttach) &&
        Objects.equals(this.willConfirm, v20PresRequest.willConfirm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atId, atType, comment, formats, requestPresentationsTildeAttach, willConfirm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V20PresRequest {\n");
    sb.append("    atId: ").append(toIndentedString(atId)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    formats: ").append(toIndentedString(formats)).append("\n");
    sb.append("    requestPresentationsTildeAttach: ").append(toIndentedString(requestPresentationsTildeAttach)).append("\n");
    sb.append("    willConfirm: ").append(toIndentedString(willConfirm)).append("\n");
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


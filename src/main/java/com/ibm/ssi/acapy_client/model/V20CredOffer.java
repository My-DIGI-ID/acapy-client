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
import com.ibm.ssi.acapy_client.model.V20CredFormat;
import com.ibm.ssi.acapy_client.model.V20CredPreview;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ibm.ssi.acapy_client.invoker.JSON;


/**
 * V20CredOffer
 */
@JsonPropertyOrder({
  V20CredOffer.JSON_PROPERTY_AT_ID,
  V20CredOffer.JSON_PROPERTY_AT_TYPE,
  V20CredOffer.JSON_PROPERTY_COMMENT,
  V20CredOffer.JSON_PROPERTY_CREDENTIAL_PREVIEW,
  V20CredOffer.JSON_PROPERTY_FORMATS,
  V20CredOffer.JSON_PROPERTY_OFFERS_TILDE_ATTACH,
  V20CredOffer.JSON_PROPERTY_REPLACEMENT_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class V20CredOffer {
  public static final String JSON_PROPERTY_AT_ID = "@id";
  private String atId;

  public static final String JSON_PROPERTY_AT_TYPE = "@type";
  private String atType;

  public static final String JSON_PROPERTY_COMMENT = "comment";
  private JsonNullable<String> comment = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CREDENTIAL_PREVIEW = "credential_preview";
  private V20CredPreview credentialPreview;

  public static final String JSON_PROPERTY_FORMATS = "formats";
  private List<V20CredFormat> formats = new ArrayList<>();

  public static final String JSON_PROPERTY_OFFERS_TILDE_ATTACH = "offers~attach";
  private List<AttachDecorator> offersTildeAttach = new ArrayList<>();

  public static final String JSON_PROPERTY_REPLACEMENT_ID = "replacement_id";
  private String replacementId;


  public V20CredOffer atId(String atId) {
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




  public V20CredOffer comment(String comment) {
    this.comment = JsonNullable.<String>of(comment);
    return this;
  }

   /**
   * Human-readable comment
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Human-readable comment")
  @JsonIgnore

  public String getComment() {
        return comment.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getComment_JsonNullable() {
    return comment;
  }
  
  @JsonProperty(JSON_PROPERTY_COMMENT)
  public void setComment_JsonNullable(JsonNullable<String> comment) {
    this.comment = comment;
  }

  public void setComment(String comment) {
    this.comment = JsonNullable.<String>of(comment);
  }


  public V20CredOffer credentialPreview(V20CredPreview credentialPreview) {
    this.credentialPreview = credentialPreview;
    return this;
  }

   /**
   * Get credentialPreview
   * @return credentialPreview
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREDENTIAL_PREVIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public V20CredPreview getCredentialPreview() {
    return credentialPreview;
  }


  @JsonProperty(JSON_PROPERTY_CREDENTIAL_PREVIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCredentialPreview(V20CredPreview credentialPreview) {
    this.credentialPreview = credentialPreview;
  }


  public V20CredOffer formats(List<V20CredFormat> formats) {
    this.formats = formats;
    return this;
  }

  public V20CredOffer addFormatsItem(V20CredFormat formatsItem) {
    this.formats.add(formatsItem);
    return this;
  }

   /**
   * Acceptable credential formats
   * @return formats
  **/
  @ApiModelProperty(required = true, value = "Acceptable credential formats")
  @JsonProperty(JSON_PROPERTY_FORMATS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<V20CredFormat> getFormats() {
    return formats;
  }


  @JsonProperty(JSON_PROPERTY_FORMATS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFormats(List<V20CredFormat> formats) {
    this.formats = formats;
  }


  public V20CredOffer offersTildeAttach(List<AttachDecorator> offersTildeAttach) {
    this.offersTildeAttach = offersTildeAttach;
    return this;
  }

  public V20CredOffer addOffersTildeAttachItem(AttachDecorator offersTildeAttachItem) {
    this.offersTildeAttach.add(offersTildeAttachItem);
    return this;
  }

   /**
   * Offer attachments
   * @return offersTildeAttach
  **/
  @ApiModelProperty(required = true, value = "Offer attachments")
  @JsonProperty(JSON_PROPERTY_OFFERS_TILDE_ATTACH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AttachDecorator> getOffersTildeAttach() {
    return offersTildeAttach;
  }


  @JsonProperty(JSON_PROPERTY_OFFERS_TILDE_ATTACH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOffersTildeAttach(List<AttachDecorator> offersTildeAttach) {
    this.offersTildeAttach = offersTildeAttach;
  }


  public V20CredOffer replacementId(String replacementId) {
    this.replacementId = replacementId;
    return this;
  }

   /**
   * Issuer-unique identifier to coordinate credential replacement
   * @return replacementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3fa85f64-5717-4562-b3fc-2c963f66afa6", value = "Issuer-unique identifier to coordinate credential replacement")
  @JsonProperty(JSON_PROPERTY_REPLACEMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReplacementId() {
    return replacementId;
  }


  @JsonProperty(JSON_PROPERTY_REPLACEMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReplacementId(String replacementId) {
    this.replacementId = replacementId;
  }


  /**
   * Return true if this V20CredOffer object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V20CredOffer v20CredOffer = (V20CredOffer) o;
    return Objects.equals(this.atId, v20CredOffer.atId) &&
        Objects.equals(this.atType, v20CredOffer.atType) &&
        Objects.equals(this.comment, v20CredOffer.comment) &&
        Objects.equals(this.credentialPreview, v20CredOffer.credentialPreview) &&
        Objects.equals(this.formats, v20CredOffer.formats) &&
        Objects.equals(this.offersTildeAttach, v20CredOffer.offersTildeAttach) &&
        Objects.equals(this.replacementId, v20CredOffer.replacementId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atId, atType, comment, credentialPreview, formats, offersTildeAttach, replacementId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V20CredOffer {\n");
    sb.append("    atId: ").append(toIndentedString(atId)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    credentialPreview: ").append(toIndentedString(credentialPreview)).append("\n");
    sb.append("    formats: ").append(toIndentedString(formats)).append("\n");
    sb.append("    offersTildeAttach: ").append(toIndentedString(offersTildeAttach)).append("\n");
    sb.append("    replacementId: ").append(toIndentedString(replacementId)).append("\n");
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


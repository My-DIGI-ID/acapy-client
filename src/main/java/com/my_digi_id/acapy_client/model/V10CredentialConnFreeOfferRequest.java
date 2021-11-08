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
import com.my_digi_id.acapy_client.model.CredentialPreview;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.my_digi_id.acapy_client.invoker.JSON;


/**
 * V10CredentialConnFreeOfferRequest
 */
@JsonPropertyOrder({
  V10CredentialConnFreeOfferRequest.JSON_PROPERTY_AUTO_ISSUE,
  V10CredentialConnFreeOfferRequest.JSON_PROPERTY_AUTO_REMOVE,
  V10CredentialConnFreeOfferRequest.JSON_PROPERTY_COMMENT,
  V10CredentialConnFreeOfferRequest.JSON_PROPERTY_CRED_DEF_ID,
  V10CredentialConnFreeOfferRequest.JSON_PROPERTY_CREDENTIAL_PREVIEW,
  V10CredentialConnFreeOfferRequest.JSON_PROPERTY_TRACE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-08T11:11:35.214106+01:00[Europe/Berlin]")
public class V10CredentialConnFreeOfferRequest {
  public static final String JSON_PROPERTY_AUTO_ISSUE = "auto_issue";
  private Boolean autoIssue;

  public static final String JSON_PROPERTY_AUTO_REMOVE = "auto_remove";
  private Boolean autoRemove;

  public static final String JSON_PROPERTY_COMMENT = "comment";
  private JsonNullable<String> comment = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CRED_DEF_ID = "cred_def_id";
  private String credDefId;

  public static final String JSON_PROPERTY_CREDENTIAL_PREVIEW = "credential_preview";
  private CredentialPreview credentialPreview;

  public static final String JSON_PROPERTY_TRACE = "trace";
  private Boolean trace;


  public V10CredentialConnFreeOfferRequest autoIssue(Boolean autoIssue) {
    this.autoIssue = autoIssue;
    return this;
  }

   /**
   * Whether to respond automatically to credential requests, creating and issuing requested credentials
   * @return autoIssue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to respond automatically to credential requests, creating and issuing requested credentials")
  @JsonProperty(JSON_PROPERTY_AUTO_ISSUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutoIssue() {
    return autoIssue;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_ISSUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoIssue(Boolean autoIssue) {
    this.autoIssue = autoIssue;
  }


  public V10CredentialConnFreeOfferRequest autoRemove(Boolean autoRemove) {
    this.autoRemove = autoRemove;
    return this;
  }

   /**
   * Whether to remove the credential exchange record on completion (overrides --preserve-exchange-records configuration setting)
   * @return autoRemove
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to remove the credential exchange record on completion (overrides --preserve-exchange-records configuration setting)")
  @JsonProperty(JSON_PROPERTY_AUTO_REMOVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutoRemove() {
    return autoRemove;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_REMOVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoRemove(Boolean autoRemove) {
    this.autoRemove = autoRemove;
  }


  public V10CredentialConnFreeOfferRequest comment(String comment) {
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


  public V10CredentialConnFreeOfferRequest credDefId(String credDefId) {
    this.credDefId = credDefId;
    return this;
  }

   /**
   * Credential definition identifier
   * @return credDefId
  **/
  @ApiModelProperty(example = "WgWxqztrNooG92RXvxSTWv:3:CL:20:tag", required = true, value = "Credential definition identifier")
  @JsonProperty(JSON_PROPERTY_CRED_DEF_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCredDefId() {
    return credDefId;
  }


  @JsonProperty(JSON_PROPERTY_CRED_DEF_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCredDefId(String credDefId) {
    this.credDefId = credDefId;
  }


  public V10CredentialConnFreeOfferRequest credentialPreview(CredentialPreview credentialPreview) {
    this.credentialPreview = credentialPreview;
    return this;
  }

   /**
   * Get credentialPreview
   * @return credentialPreview
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CREDENTIAL_PREVIEW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CredentialPreview getCredentialPreview() {
    return credentialPreview;
  }


  @JsonProperty(JSON_PROPERTY_CREDENTIAL_PREVIEW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCredentialPreview(CredentialPreview credentialPreview) {
    this.credentialPreview = credentialPreview;
  }


  public V10CredentialConnFreeOfferRequest trace(Boolean trace) {
    this.trace = trace;
    return this;
  }

   /**
   * Record trace information, based on agent configuration
   * @return trace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Record trace information, based on agent configuration")
  @JsonProperty(JSON_PROPERTY_TRACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTrace() {
    return trace;
  }


  @JsonProperty(JSON_PROPERTY_TRACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrace(Boolean trace) {
    this.trace = trace;
  }


  /**
   * Return true if this V10CredentialConnFreeOfferRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V10CredentialConnFreeOfferRequest v10CredentialConnFreeOfferRequest = (V10CredentialConnFreeOfferRequest) o;
    return Objects.equals(this.autoIssue, v10CredentialConnFreeOfferRequest.autoIssue) &&
        Objects.equals(this.autoRemove, v10CredentialConnFreeOfferRequest.autoRemove) &&
        Objects.equals(this.comment, v10CredentialConnFreeOfferRequest.comment) &&
        Objects.equals(this.credDefId, v10CredentialConnFreeOfferRequest.credDefId) &&
        Objects.equals(this.credentialPreview, v10CredentialConnFreeOfferRequest.credentialPreview) &&
        Objects.equals(this.trace, v10CredentialConnFreeOfferRequest.trace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoIssue, autoRemove, comment, credDefId, credentialPreview, trace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V10CredentialConnFreeOfferRequest {\n");
    sb.append("    autoIssue: ").append(toIndentedString(autoIssue)).append("\n");
    sb.append("    autoRemove: ").append(toIndentedString(autoRemove)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    credDefId: ").append(toIndentedString(credDefId)).append("\n");
    sb.append("    credentialPreview: ").append(toIndentedString(credentialPreview)).append("\n");
    sb.append("    trace: ").append(toIndentedString(trace)).append("\n");
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


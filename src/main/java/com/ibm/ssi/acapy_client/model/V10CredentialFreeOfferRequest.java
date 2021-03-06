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
import com.ibm.ssi.acapy_client.model.CredentialPreview;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ibm.ssi.acapy_client.invoker.JSON;


/**
 * V10CredentialFreeOfferRequest
 */
@JsonPropertyOrder({
  V10CredentialFreeOfferRequest.JSON_PROPERTY_AUTO_ISSUE,
  V10CredentialFreeOfferRequest.JSON_PROPERTY_AUTO_REMOVE,
  V10CredentialFreeOfferRequest.JSON_PROPERTY_COMMENT,
  V10CredentialFreeOfferRequest.JSON_PROPERTY_CONNECTION_ID,
  V10CredentialFreeOfferRequest.JSON_PROPERTY_CRED_DEF_ID,
  V10CredentialFreeOfferRequest.JSON_PROPERTY_CREDENTIAL_PREVIEW,
  V10CredentialFreeOfferRequest.JSON_PROPERTY_TRACE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class V10CredentialFreeOfferRequest {
  public static final String JSON_PROPERTY_AUTO_ISSUE = "auto_issue";
  private Boolean autoIssue;

  public static final String JSON_PROPERTY_AUTO_REMOVE = "auto_remove";
  private Boolean autoRemove;

  public static final String JSON_PROPERTY_COMMENT = "comment";
  private JsonNullable<String> comment = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private UUID connectionId;

  public static final String JSON_PROPERTY_CRED_DEF_ID = "cred_def_id";
  private String credDefId;

  public static final String JSON_PROPERTY_CREDENTIAL_PREVIEW = "credential_preview";
  private CredentialPreview credentialPreview;

  public static final String JSON_PROPERTY_TRACE = "trace";
  private Boolean trace;


  public V10CredentialFreeOfferRequest autoIssue(Boolean autoIssue) {
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


  public V10CredentialFreeOfferRequest autoRemove(Boolean autoRemove) {
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


  public V10CredentialFreeOfferRequest comment(String comment) {
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


  public V10CredentialFreeOfferRequest connectionId(UUID connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Connection identifier
   * @return connectionId
  **/
  @ApiModelProperty(example = "3fa85f64-5717-4562-b3fc-2c963f66afa6", required = true, value = "Connection identifier")
  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getConnectionId() {
    return connectionId;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnectionId(UUID connectionId) {
    this.connectionId = connectionId;
  }


  public V10CredentialFreeOfferRequest credDefId(String credDefId) {
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


  public V10CredentialFreeOfferRequest credentialPreview(CredentialPreview credentialPreview) {
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


  public V10CredentialFreeOfferRequest trace(Boolean trace) {
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
   * Return true if this V10CredentialFreeOfferRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V10CredentialFreeOfferRequest v10CredentialFreeOfferRequest = (V10CredentialFreeOfferRequest) o;
    return Objects.equals(this.autoIssue, v10CredentialFreeOfferRequest.autoIssue) &&
        Objects.equals(this.autoRemove, v10CredentialFreeOfferRequest.autoRemove) &&
        Objects.equals(this.comment, v10CredentialFreeOfferRequest.comment) &&
        Objects.equals(this.connectionId, v10CredentialFreeOfferRequest.connectionId) &&
        Objects.equals(this.credDefId, v10CredentialFreeOfferRequest.credDefId) &&
        Objects.equals(this.credentialPreview, v10CredentialFreeOfferRequest.credentialPreview) &&
        Objects.equals(this.trace, v10CredentialFreeOfferRequest.trace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoIssue, autoRemove, comment, connectionId, credDefId, credentialPreview, trace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V10CredentialFreeOfferRequest {\n");
    sb.append("    autoIssue: ").append(toIndentedString(autoIssue)).append("\n");
    sb.append("    autoRemove: ").append(toIndentedString(autoRemove)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
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


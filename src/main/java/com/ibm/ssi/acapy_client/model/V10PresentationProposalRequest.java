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
import com.ibm.ssi.acapy_client.model.IndyPresPreview;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ibm.ssi.acapy_client.invoker.JSON;


/**
 * V10PresentationProposalRequest
 */
@JsonPropertyOrder({
  V10PresentationProposalRequest.JSON_PROPERTY_AUTO_PRESENT,
  V10PresentationProposalRequest.JSON_PROPERTY_COMMENT,
  V10PresentationProposalRequest.JSON_PROPERTY_CONNECTION_ID,
  V10PresentationProposalRequest.JSON_PROPERTY_PRESENTATION_PROPOSAL,
  V10PresentationProposalRequest.JSON_PROPERTY_TRACE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class V10PresentationProposalRequest {
  public static final String JSON_PROPERTY_AUTO_PRESENT = "auto_present";
  private Boolean autoPresent;

  public static final String JSON_PROPERTY_COMMENT = "comment";
  private JsonNullable<String> comment = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private UUID connectionId;

  public static final String JSON_PROPERTY_PRESENTATION_PROPOSAL = "presentation_proposal";
  private IndyPresPreview presentationProposal;

  public static final String JSON_PROPERTY_TRACE = "trace";
  private Boolean trace;


  public V10PresentationProposalRequest autoPresent(Boolean autoPresent) {
    this.autoPresent = autoPresent;
    return this;
  }

   /**
   * Whether to respond automatically to presentation requests, building and presenting requested proof
   * @return autoPresent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to respond automatically to presentation requests, building and presenting requested proof")
  @JsonProperty(JSON_PROPERTY_AUTO_PRESENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutoPresent() {
    return autoPresent;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_PRESENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoPresent(Boolean autoPresent) {
    this.autoPresent = autoPresent;
  }


  public V10PresentationProposalRequest comment(String comment) {
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


  public V10PresentationProposalRequest connectionId(UUID connectionId) {
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


  public V10PresentationProposalRequest presentationProposal(IndyPresPreview presentationProposal) {
    this.presentationProposal = presentationProposal;
    return this;
  }

   /**
   * Get presentationProposal
   * @return presentationProposal
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PRESENTATION_PROPOSAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public IndyPresPreview getPresentationProposal() {
    return presentationProposal;
  }


  @JsonProperty(JSON_PROPERTY_PRESENTATION_PROPOSAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPresentationProposal(IndyPresPreview presentationProposal) {
    this.presentationProposal = presentationProposal;
  }


  public V10PresentationProposalRequest trace(Boolean trace) {
    this.trace = trace;
    return this;
  }

   /**
   * Whether to trace event (default false)
   * @return trace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether to trace event (default false)")
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
   * Return true if this V10PresentationProposalRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V10PresentationProposalRequest v10PresentationProposalRequest = (V10PresentationProposalRequest) o;
    return Objects.equals(this.autoPresent, v10PresentationProposalRequest.autoPresent) &&
        Objects.equals(this.comment, v10PresentationProposalRequest.comment) &&
        Objects.equals(this.connectionId, v10PresentationProposalRequest.connectionId) &&
        Objects.equals(this.presentationProposal, v10PresentationProposalRequest.presentationProposal) &&
        Objects.equals(this.trace, v10PresentationProposalRequest.trace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoPresent, comment, connectionId, presentationProposal, trace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V10PresentationProposalRequest {\n");
    sb.append("    autoPresent: ").append(toIndentedString(autoPresent)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    presentationProposal: ").append(toIndentedString(presentationProposal)).append("\n");
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


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
import com.my_digi_id.acapy_client.model.V20PresRequestByFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.my_digi_id.acapy_client.invoker.JSON;


/**
 * V20PresSendRequestRequest
 */
@JsonPropertyOrder({
  V20PresSendRequestRequest.JSON_PROPERTY_COMMENT,
  V20PresSendRequestRequest.JSON_PROPERTY_CONNECTION_ID,
  V20PresSendRequestRequest.JSON_PROPERTY_PRESENTATION_REQUEST,
  V20PresSendRequestRequest.JSON_PROPERTY_TRACE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-08T11:11:35.214106+01:00[Europe/Berlin]")
public class V20PresSendRequestRequest {
  public static final String JSON_PROPERTY_COMMENT = "comment";
  private JsonNullable<String> comment = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private UUID connectionId;

  public static final String JSON_PROPERTY_PRESENTATION_REQUEST = "presentation_request";
  private V20PresRequestByFormat presentationRequest;

  public static final String JSON_PROPERTY_TRACE = "trace";
  private Boolean trace;


  public V20PresSendRequestRequest comment(String comment) {
    this.comment = JsonNullable.<String>of(comment);
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public V20PresSendRequestRequest connectionId(UUID connectionId) {
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


  public V20PresSendRequestRequest presentationRequest(V20PresRequestByFormat presentationRequest) {
    this.presentationRequest = presentationRequest;
    return this;
  }

   /**
   * Get presentationRequest
   * @return presentationRequest
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PRESENTATION_REQUEST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public V20PresRequestByFormat getPresentationRequest() {
    return presentationRequest;
  }


  @JsonProperty(JSON_PROPERTY_PRESENTATION_REQUEST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPresentationRequest(V20PresRequestByFormat presentationRequest) {
    this.presentationRequest = presentationRequest;
  }


  public V20PresSendRequestRequest trace(Boolean trace) {
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
   * Return true if this V20PresSendRequestRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V20PresSendRequestRequest v20PresSendRequestRequest = (V20PresSendRequestRequest) o;
    return Objects.equals(this.comment, v20PresSendRequestRequest.comment) &&
        Objects.equals(this.connectionId, v20PresSendRequestRequest.connectionId) &&
        Objects.equals(this.presentationRequest, v20PresSendRequestRequest.presentationRequest) &&
        Objects.equals(this.trace, v20PresSendRequestRequest.trace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, connectionId, presentationRequest, trace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V20PresSendRequestRequest {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    presentationRequest: ").append(toIndentedString(presentationRequest)).append("\n");
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


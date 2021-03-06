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
import com.ibm.ssi.acapy_client.model.V20CredFilterLDProof;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ibm.ssi.acapy_client.invoker.JSON;


/**
 * V20CredRequestFree
 */
@JsonPropertyOrder({
  V20CredRequestFree.JSON_PROPERTY_AUTO_REMOVE,
  V20CredRequestFree.JSON_PROPERTY_COMMENT,
  V20CredRequestFree.JSON_PROPERTY_CONNECTION_ID,
  V20CredRequestFree.JSON_PROPERTY_FILTER,
  V20CredRequestFree.JSON_PROPERTY_HOLDER_DID,
  V20CredRequestFree.JSON_PROPERTY_TRACE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class V20CredRequestFree {
  public static final String JSON_PROPERTY_AUTO_REMOVE = "auto_remove";
  private Boolean autoRemove;

  public static final String JSON_PROPERTY_COMMENT = "comment";
  private JsonNullable<String> comment = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private UUID connectionId;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private V20CredFilterLDProof filter;

  public static final String JSON_PROPERTY_HOLDER_DID = "holder_did";
  private JsonNullable<String> holderDid = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TRACE = "trace";
  private Boolean trace;


  public V20CredRequestFree autoRemove(Boolean autoRemove) {
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


  public V20CredRequestFree comment(String comment) {
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


  public V20CredRequestFree connectionId(UUID connectionId) {
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


  public V20CredRequestFree filter(V20CredFilterLDProof filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Credential specification criteria by format
   * @return filter
  **/
  @ApiModelProperty(required = true, value = "Credential specification criteria by format")
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public V20CredFilterLDProof getFilter() {
    return filter;
  }


  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFilter(V20CredFilterLDProof filter) {
    this.filter = filter;
  }


  public V20CredRequestFree holderDid(String holderDid) {
    this.holderDid = JsonNullable.<String>of(holderDid);
    return this;
  }

   /**
   * Holder DID to substitute for the credentialSubject.id
   * @return holderDid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "did:key:ahsdkjahsdkjhaskjdhakjshdkajhsdkjahs", value = "Holder DID to substitute for the credentialSubject.id")
  @JsonIgnore

  public String getHolderDid() {
        return holderDid.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HOLDER_DID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getHolderDid_JsonNullable() {
    return holderDid;
  }
  
  @JsonProperty(JSON_PROPERTY_HOLDER_DID)
  public void setHolderDid_JsonNullable(JsonNullable<String> holderDid) {
    this.holderDid = holderDid;
  }

  public void setHolderDid(String holderDid) {
    this.holderDid = JsonNullable.<String>of(holderDid);
  }


  public V20CredRequestFree trace(Boolean trace) {
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
   * Return true if this V20CredRequestFree object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V20CredRequestFree v20CredRequestFree = (V20CredRequestFree) o;
    return Objects.equals(this.autoRemove, v20CredRequestFree.autoRemove) &&
        Objects.equals(this.comment, v20CredRequestFree.comment) &&
        Objects.equals(this.connectionId, v20CredRequestFree.connectionId) &&
        Objects.equals(this.filter, v20CredRequestFree.filter) &&
        Objects.equals(this.holderDid, v20CredRequestFree.holderDid) &&
        Objects.equals(this.trace, v20CredRequestFree.trace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoRemove, comment, connectionId, filter, holderDid, trace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V20CredRequestFree {\n");
    sb.append("    autoRemove: ").append(toIndentedString(autoRemove)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    holderDid: ").append(toIndentedString(holderDid)).append("\n");
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


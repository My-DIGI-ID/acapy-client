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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.my_digi_id.acapy_client.invoker.JSON;


/**
 * V10CredentialProposalRequestMand
 */
@JsonPropertyOrder({
  V10CredentialProposalRequestMand.JSON_PROPERTY_AUTO_REMOVE,
  V10CredentialProposalRequestMand.JSON_PROPERTY_COMMENT,
  V10CredentialProposalRequestMand.JSON_PROPERTY_CONNECTION_ID,
  V10CredentialProposalRequestMand.JSON_PROPERTY_CRED_DEF_ID,
  V10CredentialProposalRequestMand.JSON_PROPERTY_CREDENTIAL_PROPOSAL,
  V10CredentialProposalRequestMand.JSON_PROPERTY_ISSUER_DID,
  V10CredentialProposalRequestMand.JSON_PROPERTY_SCHEMA_ID,
  V10CredentialProposalRequestMand.JSON_PROPERTY_SCHEMA_ISSUER_DID,
  V10CredentialProposalRequestMand.JSON_PROPERTY_SCHEMA_NAME,
  V10CredentialProposalRequestMand.JSON_PROPERTY_SCHEMA_VERSION,
  V10CredentialProposalRequestMand.JSON_PROPERTY_TRACE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-08T11:11:35.214106+01:00[Europe/Berlin]")
public class V10CredentialProposalRequestMand {
  public static final String JSON_PROPERTY_AUTO_REMOVE = "auto_remove";
  private Boolean autoRemove;

  public static final String JSON_PROPERTY_COMMENT = "comment";
  private JsonNullable<String> comment = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private UUID connectionId;

  public static final String JSON_PROPERTY_CRED_DEF_ID = "cred_def_id";
  private String credDefId;

  public static final String JSON_PROPERTY_CREDENTIAL_PROPOSAL = "credential_proposal";
  private CredentialPreview credentialProposal;

  public static final String JSON_PROPERTY_ISSUER_DID = "issuer_did";
  private String issuerDid;

  public static final String JSON_PROPERTY_SCHEMA_ID = "schema_id";
  private String schemaId;

  public static final String JSON_PROPERTY_SCHEMA_ISSUER_DID = "schema_issuer_did";
  private String schemaIssuerDid;

  public static final String JSON_PROPERTY_SCHEMA_NAME = "schema_name";
  private String schemaName;

  public static final String JSON_PROPERTY_SCHEMA_VERSION = "schema_version";
  private String schemaVersion;

  public static final String JSON_PROPERTY_TRACE = "trace";
  private Boolean trace;


  public V10CredentialProposalRequestMand autoRemove(Boolean autoRemove) {
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


  public V10CredentialProposalRequestMand comment(String comment) {
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


  public V10CredentialProposalRequestMand connectionId(UUID connectionId) {
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


  public V10CredentialProposalRequestMand credDefId(String credDefId) {
    this.credDefId = credDefId;
    return this;
  }

   /**
   * Credential definition identifier
   * @return credDefId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WgWxqztrNooG92RXvxSTWv:3:CL:20:tag", value = "Credential definition identifier")
  @JsonProperty(JSON_PROPERTY_CRED_DEF_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCredDefId() {
    return credDefId;
  }


  @JsonProperty(JSON_PROPERTY_CRED_DEF_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCredDefId(String credDefId) {
    this.credDefId = credDefId;
  }


  public V10CredentialProposalRequestMand credentialProposal(CredentialPreview credentialProposal) {
    this.credentialProposal = credentialProposal;
    return this;
  }

   /**
   * Get credentialProposal
   * @return credentialProposal
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CREDENTIAL_PROPOSAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CredentialPreview getCredentialProposal() {
    return credentialProposal;
  }


  @JsonProperty(JSON_PROPERTY_CREDENTIAL_PROPOSAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCredentialProposal(CredentialPreview credentialProposal) {
    this.credentialProposal = credentialProposal;
  }


  public V10CredentialProposalRequestMand issuerDid(String issuerDid) {
    this.issuerDid = issuerDid;
    return this;
  }

   /**
   * Credential issuer DID
   * @return issuerDid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WgWxqztrNooG92RXvxSTWv", value = "Credential issuer DID")
  @JsonProperty(JSON_PROPERTY_ISSUER_DID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIssuerDid() {
    return issuerDid;
  }


  @JsonProperty(JSON_PROPERTY_ISSUER_DID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuerDid(String issuerDid) {
    this.issuerDid = issuerDid;
  }


  public V10CredentialProposalRequestMand schemaId(String schemaId) {
    this.schemaId = schemaId;
    return this;
  }

   /**
   * Schema identifier
   * @return schemaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WgWxqztrNooG92RXvxSTWv:2:schema_name:1.0", value = "Schema identifier")
  @JsonProperty(JSON_PROPERTY_SCHEMA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSchemaId() {
    return schemaId;
  }


  @JsonProperty(JSON_PROPERTY_SCHEMA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchemaId(String schemaId) {
    this.schemaId = schemaId;
  }


  public V10CredentialProposalRequestMand schemaIssuerDid(String schemaIssuerDid) {
    this.schemaIssuerDid = schemaIssuerDid;
    return this;
  }

   /**
   * Schema issuer DID
   * @return schemaIssuerDid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WgWxqztrNooG92RXvxSTWv", value = "Schema issuer DID")
  @JsonProperty(JSON_PROPERTY_SCHEMA_ISSUER_DID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSchemaIssuerDid() {
    return schemaIssuerDid;
  }


  @JsonProperty(JSON_PROPERTY_SCHEMA_ISSUER_DID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchemaIssuerDid(String schemaIssuerDid) {
    this.schemaIssuerDid = schemaIssuerDid;
  }


  public V10CredentialProposalRequestMand schemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

   /**
   * Schema name
   * @return schemaName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "preferences", value = "Schema name")
  @JsonProperty(JSON_PROPERTY_SCHEMA_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSchemaName() {
    return schemaName;
  }


  @JsonProperty(JSON_PROPERTY_SCHEMA_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchemaName(String schemaName) {
    this.schemaName = schemaName;
  }


  public V10CredentialProposalRequestMand schemaVersion(String schemaVersion) {
    this.schemaVersion = schemaVersion;
    return this;
  }

   /**
   * Schema version
   * @return schemaVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.0", value = "Schema version")
  @JsonProperty(JSON_PROPERTY_SCHEMA_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSchemaVersion() {
    return schemaVersion;
  }


  @JsonProperty(JSON_PROPERTY_SCHEMA_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchemaVersion(String schemaVersion) {
    this.schemaVersion = schemaVersion;
  }


  public V10CredentialProposalRequestMand trace(Boolean trace) {
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
   * Return true if this V10CredentialProposalRequestMand object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V10CredentialProposalRequestMand v10CredentialProposalRequestMand = (V10CredentialProposalRequestMand) o;
    return Objects.equals(this.autoRemove, v10CredentialProposalRequestMand.autoRemove) &&
        Objects.equals(this.comment, v10CredentialProposalRequestMand.comment) &&
        Objects.equals(this.connectionId, v10CredentialProposalRequestMand.connectionId) &&
        Objects.equals(this.credDefId, v10CredentialProposalRequestMand.credDefId) &&
        Objects.equals(this.credentialProposal, v10CredentialProposalRequestMand.credentialProposal) &&
        Objects.equals(this.issuerDid, v10CredentialProposalRequestMand.issuerDid) &&
        Objects.equals(this.schemaId, v10CredentialProposalRequestMand.schemaId) &&
        Objects.equals(this.schemaIssuerDid, v10CredentialProposalRequestMand.schemaIssuerDid) &&
        Objects.equals(this.schemaName, v10CredentialProposalRequestMand.schemaName) &&
        Objects.equals(this.schemaVersion, v10CredentialProposalRequestMand.schemaVersion) &&
        Objects.equals(this.trace, v10CredentialProposalRequestMand.trace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoRemove, comment, connectionId, credDefId, credentialProposal, issuerDid, schemaId, schemaIssuerDid, schemaName, schemaVersion, trace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V10CredentialProposalRequestMand {\n");
    sb.append("    autoRemove: ").append(toIndentedString(autoRemove)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    credDefId: ").append(toIndentedString(credDefId)).append("\n");
    sb.append("    credentialProposal: ").append(toIndentedString(credentialProposal)).append("\n");
    sb.append("    issuerDid: ").append(toIndentedString(issuerDid)).append("\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    schemaIssuerDid: ").append(toIndentedString(schemaIssuerDid)).append("\n");
    sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
    sb.append("    schemaVersion: ").append(toIndentedString(schemaVersion)).append("\n");
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


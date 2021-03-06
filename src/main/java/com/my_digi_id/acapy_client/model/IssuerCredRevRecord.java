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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.my_digi_id.acapy_client.invoker.JSON;


/**
 * IssuerCredRevRecord
 */
@JsonPropertyOrder({
  IssuerCredRevRecord.JSON_PROPERTY_CREATED_AT,
  IssuerCredRevRecord.JSON_PROPERTY_CRED_DEF_ID,
  IssuerCredRevRecord.JSON_PROPERTY_CRED_EX_ID,
  IssuerCredRevRecord.JSON_PROPERTY_CRED_REV_ID,
  IssuerCredRevRecord.JSON_PROPERTY_RECORD_ID,
  IssuerCredRevRecord.JSON_PROPERTY_REV_REG_ID,
  IssuerCredRevRecord.JSON_PROPERTY_STATE,
  IssuerCredRevRecord.JSON_PROPERTY_UPDATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-08T11:11:35.214106+01:00[Europe/Berlin]")
public class IssuerCredRevRecord {
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_CRED_DEF_ID = "cred_def_id";
  private String credDefId;

  public static final String JSON_PROPERTY_CRED_EX_ID = "cred_ex_id";
  private String credExId;

  public static final String JSON_PROPERTY_CRED_REV_ID = "cred_rev_id";
  private String credRevId;

  public static final String JSON_PROPERTY_RECORD_ID = "record_id";
  private String recordId;

  public static final String JSON_PROPERTY_REV_REG_ID = "rev_reg_id";
  private String revRegId;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;


  public IssuerCredRevRecord createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Time of record creation
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-08-25 08:37:04Z", value = "Time of record creation")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public IssuerCredRevRecord credDefId(String credDefId) {
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


  public IssuerCredRevRecord credExId(String credExId) {
    this.credExId = credExId;
    return this;
  }

   /**
   * Credential exchange record identifier at credential issue
   * @return credExId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3fa85f64-5717-4562-b3fc-2c963f66afa6", value = "Credential exchange record identifier at credential issue")
  @JsonProperty(JSON_PROPERTY_CRED_EX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCredExId() {
    return credExId;
  }


  @JsonProperty(JSON_PROPERTY_CRED_EX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCredExId(String credExId) {
    this.credExId = credExId;
  }


  public IssuerCredRevRecord credRevId(String credRevId) {
    this.credRevId = credRevId;
    return this;
  }

   /**
   * Credential revocation identifier
   * @return credRevId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345", value = "Credential revocation identifier")
  @JsonProperty(JSON_PROPERTY_CRED_REV_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCredRevId() {
    return credRevId;
  }


  @JsonProperty(JSON_PROPERTY_CRED_REV_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCredRevId(String credRevId) {
    this.credRevId = credRevId;
  }


  public IssuerCredRevRecord recordId(String recordId) {
    this.recordId = recordId;
    return this;
  }

   /**
   * Issuer credential revocation record identifier
   * @return recordId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3fa85f64-5717-4562-b3fc-2c963f66afa6", value = "Issuer credential revocation record identifier")
  @JsonProperty(JSON_PROPERTY_RECORD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordId() {
    return recordId;
  }


  @JsonProperty(JSON_PROPERTY_RECORD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecordId(String recordId) {
    this.recordId = recordId;
  }


  public IssuerCredRevRecord revRegId(String revRegId) {
    this.revRegId = revRegId;
    return this;
  }

   /**
   * Revocation registry identifier
   * @return revRegId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WgWxqztrNooG92RXvxSTWv:4:WgWxqztrNooG92RXvxSTWv:3:CL:20:tag:CL_ACCUM:0", value = "Revocation registry identifier")
  @JsonProperty(JSON_PROPERTY_REV_REG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRevRegId() {
    return revRegId;
  }


  @JsonProperty(JSON_PROPERTY_REV_REG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRevRegId(String revRegId) {
    this.revRegId = revRegId;
  }


  public IssuerCredRevRecord state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Issue credential revocation record state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "issued", value = "Issue credential revocation record state")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(String state) {
    this.state = state;
  }


  public IssuerCredRevRecord updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Time of last record update
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-08-25 08:37:04Z", value = "Time of last record update")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  /**
   * Return true if this IssuerCredRevRecord object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuerCredRevRecord issuerCredRevRecord = (IssuerCredRevRecord) o;
    return Objects.equals(this.createdAt, issuerCredRevRecord.createdAt) &&
        Objects.equals(this.credDefId, issuerCredRevRecord.credDefId) &&
        Objects.equals(this.credExId, issuerCredRevRecord.credExId) &&
        Objects.equals(this.credRevId, issuerCredRevRecord.credRevId) &&
        Objects.equals(this.recordId, issuerCredRevRecord.recordId) &&
        Objects.equals(this.revRegId, issuerCredRevRecord.revRegId) &&
        Objects.equals(this.state, issuerCredRevRecord.state) &&
        Objects.equals(this.updatedAt, issuerCredRevRecord.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, credDefId, credExId, credRevId, recordId, revRegId, state, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssuerCredRevRecord {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    credDefId: ").append(toIndentedString(credDefId)).append("\n");
    sb.append("    credExId: ").append(toIndentedString(credExId)).append("\n");
    sb.append("    credRevId: ").append(toIndentedString(credRevId)).append("\n");
    sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
    sb.append("    revRegId: ").append(toIndentedString(revRegId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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


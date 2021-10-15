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
import com.ibm.ssi.acapy_client.model.IndyRevRegDef;
import com.ibm.ssi.acapy_client.model.IndyRevRegEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ibm.ssi.acapy_client.invoker.JSON;


/**
 * IssuerRevRegRecord
 */
@JsonPropertyOrder({
  IssuerRevRegRecord.JSON_PROPERTY_CREATED_AT,
  IssuerRevRegRecord.JSON_PROPERTY_CRED_DEF_ID,
  IssuerRevRegRecord.JSON_PROPERTY_ERROR_MSG,
  IssuerRevRegRecord.JSON_PROPERTY_ISSUER_DID,
  IssuerRevRegRecord.JSON_PROPERTY_MAX_CRED_NUM,
  IssuerRevRegRecord.JSON_PROPERTY_PENDING_PUB,
  IssuerRevRegRecord.JSON_PROPERTY_RECORD_ID,
  IssuerRevRegRecord.JSON_PROPERTY_REVOC_DEF_TYPE,
  IssuerRevRegRecord.JSON_PROPERTY_REVOC_REG_DEF,
  IssuerRevRegRecord.JSON_PROPERTY_REVOC_REG_ENTRY,
  IssuerRevRegRecord.JSON_PROPERTY_REVOC_REG_ID,
  IssuerRevRegRecord.JSON_PROPERTY_STATE,
  IssuerRevRegRecord.JSON_PROPERTY_TAG,
  IssuerRevRegRecord.JSON_PROPERTY_TAILS_HASH,
  IssuerRevRegRecord.JSON_PROPERTY_TAILS_LOCAL_PATH,
  IssuerRevRegRecord.JSON_PROPERTY_TAILS_PUBLIC_URI,
  IssuerRevRegRecord.JSON_PROPERTY_UPDATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class IssuerRevRegRecord {
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_CRED_DEF_ID = "cred_def_id";
  private String credDefId;

  public static final String JSON_PROPERTY_ERROR_MSG = "error_msg";
  private String errorMsg;

  public static final String JSON_PROPERTY_ISSUER_DID = "issuer_did";
  private String issuerDid;

  public static final String JSON_PROPERTY_MAX_CRED_NUM = "max_cred_num";
  private Integer maxCredNum;

  public static final String JSON_PROPERTY_PENDING_PUB = "pending_pub";
  private List<String> pendingPub = null;

  public static final String JSON_PROPERTY_RECORD_ID = "record_id";
  private String recordId;

  /**
   * Revocation registry type (specify CL_ACCUM)
   */
  public enum RevocDefTypeEnum {
    CL_ACCUM("CL_ACCUM");

    private String value;

    RevocDefTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RevocDefTypeEnum fromValue(String value) {
      for (RevocDefTypeEnum b : RevocDefTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_REVOC_DEF_TYPE = "revoc_def_type";
  private RevocDefTypeEnum revocDefType;

  public static final String JSON_PROPERTY_REVOC_REG_DEF = "revoc_reg_def";
  private IndyRevRegDef revocRegDef;

  public static final String JSON_PROPERTY_REVOC_REG_ENTRY = "revoc_reg_entry";
  private IndyRevRegEntry revocRegEntry;

  public static final String JSON_PROPERTY_REVOC_REG_ID = "revoc_reg_id";
  private String revocRegId;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_TAG = "tag";
  private String tag;

  public static final String JSON_PROPERTY_TAILS_HASH = "tails_hash";
  private String tailsHash;

  public static final String JSON_PROPERTY_TAILS_LOCAL_PATH = "tails_local_path";
  private String tailsLocalPath;

  public static final String JSON_PROPERTY_TAILS_PUBLIC_URI = "tails_public_uri";
  private String tailsPublicUri;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;


  public IssuerRevRegRecord createdAt(String createdAt) {
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


  public IssuerRevRegRecord credDefId(String credDefId) {
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


  public IssuerRevRegRecord errorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    return this;
  }

   /**
   * Error message
   * @return errorMsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Revocation registry undefined", value = "Error message")
  @JsonProperty(JSON_PROPERTY_ERROR_MSG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorMsg() {
    return errorMsg;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_MSG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
  }


  public IssuerRevRegRecord issuerDid(String issuerDid) {
    this.issuerDid = issuerDid;
    return this;
  }

   /**
   * Issuer DID
   * @return issuerDid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WgWxqztrNooG92RXvxSTWv", value = "Issuer DID")
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


  public IssuerRevRegRecord maxCredNum(Integer maxCredNum) {
    this.maxCredNum = maxCredNum;
    return this;
  }

   /**
   * Maximum number of credentials for revocation registry
   * @return maxCredNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "Maximum number of credentials for revocation registry")
  @JsonProperty(JSON_PROPERTY_MAX_CRED_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxCredNum() {
    return maxCredNum;
  }


  @JsonProperty(JSON_PROPERTY_MAX_CRED_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxCredNum(Integer maxCredNum) {
    this.maxCredNum = maxCredNum;
  }


  public IssuerRevRegRecord pendingPub(List<String> pendingPub) {
    this.pendingPub = pendingPub;
    return this;
  }

  public IssuerRevRegRecord addPendingPubItem(String pendingPubItem) {
    if (this.pendingPub == null) {
      this.pendingPub = new ArrayList<>();
    }
    this.pendingPub.add(pendingPubItem);
    return this;
  }

   /**
   * Credential revocation identifier for credential revoked and pending publication to ledger
   * @return pendingPub
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Credential revocation identifier for credential revoked and pending publication to ledger")
  @JsonProperty(JSON_PROPERTY_PENDING_PUB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getPendingPub() {
    return pendingPub;
  }


  @JsonProperty(JSON_PROPERTY_PENDING_PUB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPendingPub(List<String> pendingPub) {
    this.pendingPub = pendingPub;
  }


  public IssuerRevRegRecord recordId(String recordId) {
    this.recordId = recordId;
    return this;
  }

   /**
   * Issuer revocation registry record identifier
   * @return recordId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3fa85f64-5717-4562-b3fc-2c963f66afa6", value = "Issuer revocation registry record identifier")
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


  public IssuerRevRegRecord revocDefType(RevocDefTypeEnum revocDefType) {
    this.revocDefType = revocDefType;
    return this;
  }

   /**
   * Revocation registry type (specify CL_ACCUM)
   * @return revocDefType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CL_ACCUM", value = "Revocation registry type (specify CL_ACCUM)")
  @JsonProperty(JSON_PROPERTY_REVOC_DEF_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RevocDefTypeEnum getRevocDefType() {
    return revocDefType;
  }


  @JsonProperty(JSON_PROPERTY_REVOC_DEF_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRevocDefType(RevocDefTypeEnum revocDefType) {
    this.revocDefType = revocDefType;
  }


  public IssuerRevRegRecord revocRegDef(IndyRevRegDef revocRegDef) {
    this.revocRegDef = revocRegDef;
    return this;
  }

   /**
   * Revocation registry definition
   * @return revocRegDef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Revocation registry definition")
  @JsonProperty(JSON_PROPERTY_REVOC_REG_DEF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IndyRevRegDef getRevocRegDef() {
    return revocRegDef;
  }


  @JsonProperty(JSON_PROPERTY_REVOC_REG_DEF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRevocRegDef(IndyRevRegDef revocRegDef) {
    this.revocRegDef = revocRegDef;
  }


  public IssuerRevRegRecord revocRegEntry(IndyRevRegEntry revocRegEntry) {
    this.revocRegEntry = revocRegEntry;
    return this;
  }

   /**
   * Revocation registry entry
   * @return revocRegEntry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Revocation registry entry")
  @JsonProperty(JSON_PROPERTY_REVOC_REG_ENTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IndyRevRegEntry getRevocRegEntry() {
    return revocRegEntry;
  }


  @JsonProperty(JSON_PROPERTY_REVOC_REG_ENTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRevocRegEntry(IndyRevRegEntry revocRegEntry) {
    this.revocRegEntry = revocRegEntry;
  }


  public IssuerRevRegRecord revocRegId(String revocRegId) {
    this.revocRegId = revocRegId;
    return this;
  }

   /**
   * Revocation registry identifier
   * @return revocRegId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WgWxqztrNooG92RXvxSTWv:4:WgWxqztrNooG92RXvxSTWv:3:CL:20:tag:CL_ACCUM:0", value = "Revocation registry identifier")
  @JsonProperty(JSON_PROPERTY_REVOC_REG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRevocRegId() {
    return revocRegId;
  }


  @JsonProperty(JSON_PROPERTY_REVOC_REG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRevocRegId(String revocRegId) {
    this.revocRegId = revocRegId;
  }


  public IssuerRevRegRecord state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Issue revocation registry record state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "active", value = "Issue revocation registry record state")
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


  public IssuerRevRegRecord tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Tag within issuer revocation registry identifier
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tag within issuer revocation registry identifier")
  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTag() {
    return tag;
  }


  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTag(String tag) {
    this.tag = tag;
  }


  public IssuerRevRegRecord tailsHash(String tailsHash) {
    this.tailsHash = tailsHash;
    return this;
  }

   /**
   * Tails hash
   * @return tailsHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "H3C2AVvLMv6gmMNam3uVAjZpfkcJCwDwnZn6z3wXmqPV", value = "Tails hash")
  @JsonProperty(JSON_PROPERTY_TAILS_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTailsHash() {
    return tailsHash;
  }


  @JsonProperty(JSON_PROPERTY_TAILS_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTailsHash(String tailsHash) {
    this.tailsHash = tailsHash;
  }


  public IssuerRevRegRecord tailsLocalPath(String tailsLocalPath) {
    this.tailsLocalPath = tailsLocalPath;
    return this;
  }

   /**
   * Local path to tails file
   * @return tailsLocalPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Local path to tails file")
  @JsonProperty(JSON_PROPERTY_TAILS_LOCAL_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTailsLocalPath() {
    return tailsLocalPath;
  }


  @JsonProperty(JSON_PROPERTY_TAILS_LOCAL_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTailsLocalPath(String tailsLocalPath) {
    this.tailsLocalPath = tailsLocalPath;
  }


  public IssuerRevRegRecord tailsPublicUri(String tailsPublicUri) {
    this.tailsPublicUri = tailsPublicUri;
    return this;
  }

   /**
   * Public URI for tails file
   * @return tailsPublicUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Public URI for tails file")
  @JsonProperty(JSON_PROPERTY_TAILS_PUBLIC_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTailsPublicUri() {
    return tailsPublicUri;
  }


  @JsonProperty(JSON_PROPERTY_TAILS_PUBLIC_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTailsPublicUri(String tailsPublicUri) {
    this.tailsPublicUri = tailsPublicUri;
  }


  public IssuerRevRegRecord updatedAt(String updatedAt) {
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
   * Return true if this IssuerRevRegRecord object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuerRevRegRecord issuerRevRegRecord = (IssuerRevRegRecord) o;
    return Objects.equals(this.createdAt, issuerRevRegRecord.createdAt) &&
        Objects.equals(this.credDefId, issuerRevRegRecord.credDefId) &&
        Objects.equals(this.errorMsg, issuerRevRegRecord.errorMsg) &&
        Objects.equals(this.issuerDid, issuerRevRegRecord.issuerDid) &&
        Objects.equals(this.maxCredNum, issuerRevRegRecord.maxCredNum) &&
        Objects.equals(this.pendingPub, issuerRevRegRecord.pendingPub) &&
        Objects.equals(this.recordId, issuerRevRegRecord.recordId) &&
        Objects.equals(this.revocDefType, issuerRevRegRecord.revocDefType) &&
        Objects.equals(this.revocRegDef, issuerRevRegRecord.revocRegDef) &&
        Objects.equals(this.revocRegEntry, issuerRevRegRecord.revocRegEntry) &&
        Objects.equals(this.revocRegId, issuerRevRegRecord.revocRegId) &&
        Objects.equals(this.state, issuerRevRegRecord.state) &&
        Objects.equals(this.tag, issuerRevRegRecord.tag) &&
        Objects.equals(this.tailsHash, issuerRevRegRecord.tailsHash) &&
        Objects.equals(this.tailsLocalPath, issuerRevRegRecord.tailsLocalPath) &&
        Objects.equals(this.tailsPublicUri, issuerRevRegRecord.tailsPublicUri) &&
        Objects.equals(this.updatedAt, issuerRevRegRecord.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, credDefId, errorMsg, issuerDid, maxCredNum, pendingPub, recordId, revocDefType, revocRegDef, revocRegEntry, revocRegId, state, tag, tailsHash, tailsLocalPath, tailsPublicUri, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssuerRevRegRecord {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    credDefId: ").append(toIndentedString(credDefId)).append("\n");
    sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
    sb.append("    issuerDid: ").append(toIndentedString(issuerDid)).append("\n");
    sb.append("    maxCredNum: ").append(toIndentedString(maxCredNum)).append("\n");
    sb.append("    pendingPub: ").append(toIndentedString(pendingPub)).append("\n");
    sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
    sb.append("    revocDefType: ").append(toIndentedString(revocDefType)).append("\n");
    sb.append("    revocRegDef: ").append(toIndentedString(revocRegDef)).append("\n");
    sb.append("    revocRegEntry: ").append(toIndentedString(revocRegEntry)).append("\n");
    sb.append("    revocRegId: ").append(toIndentedString(revocRegId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    tailsHash: ").append(toIndentedString(tailsHash)).append("\n");
    sb.append("    tailsLocalPath: ").append(toIndentedString(tailsLocalPath)).append("\n");
    sb.append("    tailsPublicUri: ").append(toIndentedString(tailsPublicUri)).append("\n");
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


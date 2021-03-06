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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.my_digi_id.acapy_client.invoker.JSON;


/**
 * IndyCredInfo
 */
@JsonPropertyOrder({
  IndyCredInfo.JSON_PROPERTY_ATTRS,
  IndyCredInfo.JSON_PROPERTY_CRED_DEF_ID,
  IndyCredInfo.JSON_PROPERTY_CRED_REV_ID,
  IndyCredInfo.JSON_PROPERTY_REFERENT,
  IndyCredInfo.JSON_PROPERTY_REV_REG_ID,
  IndyCredInfo.JSON_PROPERTY_SCHEMA_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-08T11:11:35.214106+01:00[Europe/Berlin]")
public class IndyCredInfo {
  public static final String JSON_PROPERTY_ATTRS = "attrs";
  private Map<String, String> attrs = null;

  public static final String JSON_PROPERTY_CRED_DEF_ID = "cred_def_id";
  private String credDefId;

  public static final String JSON_PROPERTY_CRED_REV_ID = "cred_rev_id";
  private JsonNullable<String> credRevId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REFERENT = "referent";
  private String referent;

  public static final String JSON_PROPERTY_REV_REG_ID = "rev_reg_id";
  private JsonNullable<String> revRegId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SCHEMA_ID = "schema_id";
  private String schemaId;


  public IndyCredInfo attrs(Map<String, String> attrs) {
    this.attrs = attrs;
    return this;
  }

  public IndyCredInfo putAttrsItem(String key, String attrsItem) {
    if (this.attrs == null) {
      this.attrs = new HashMap<>();
    }
    this.attrs.put(key, attrsItem);
    return this;
  }

   /**
   * Attribute names and value
   * @return attrs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Attribute names and value")
  @JsonProperty(JSON_PROPERTY_ATTRS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getAttrs() {
    return attrs;
  }


  @JsonProperty(JSON_PROPERTY_ATTRS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttrs(Map<String, String> attrs) {
    this.attrs = attrs;
  }


  public IndyCredInfo credDefId(String credDefId) {
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


  public IndyCredInfo credRevId(String credRevId) {
    this.credRevId = JsonNullable.<String>of(credRevId);
    return this;
  }

   /**
   * Credential revocation identifier
   * @return credRevId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345", value = "Credential revocation identifier")
  @JsonIgnore

  public String getCredRevId() {
        return credRevId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CRED_REV_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCredRevId_JsonNullable() {
    return credRevId;
  }
  
  @JsonProperty(JSON_PROPERTY_CRED_REV_ID)
  public void setCredRevId_JsonNullable(JsonNullable<String> credRevId) {
    this.credRevId = credRevId;
  }

  public void setCredRevId(String credRevId) {
    this.credRevId = JsonNullable.<String>of(credRevId);
  }


  public IndyCredInfo referent(String referent) {
    this.referent = referent;
    return this;
  }

   /**
   * Wallet referent
   * @return referent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3fa85f64-5717-4562-b3fc-2c963f66afa6", value = "Wallet referent")
  @JsonProperty(JSON_PROPERTY_REFERENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReferent() {
    return referent;
  }


  @JsonProperty(JSON_PROPERTY_REFERENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferent(String referent) {
    this.referent = referent;
  }


  public IndyCredInfo revRegId(String revRegId) {
    this.revRegId = JsonNullable.<String>of(revRegId);
    return this;
  }

   /**
   * Revocation registry identifier
   * @return revRegId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WgWxqztrNooG92RXvxSTWv:4:WgWxqztrNooG92RXvxSTWv:3:CL:20:tag:CL_ACCUM:0", value = "Revocation registry identifier")
  @JsonIgnore

  public String getRevRegId() {
        return revRegId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REV_REG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRevRegId_JsonNullable() {
    return revRegId;
  }
  
  @JsonProperty(JSON_PROPERTY_REV_REG_ID)
  public void setRevRegId_JsonNullable(JsonNullable<String> revRegId) {
    this.revRegId = revRegId;
  }

  public void setRevRegId(String revRegId) {
    this.revRegId = JsonNullable.<String>of(revRegId);
  }


  public IndyCredInfo schemaId(String schemaId) {
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


  /**
   * Return true if this IndyCredInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndyCredInfo indyCredInfo = (IndyCredInfo) o;
    return Objects.equals(this.attrs, indyCredInfo.attrs) &&
        Objects.equals(this.credDefId, indyCredInfo.credDefId) &&
        Objects.equals(this.credRevId, indyCredInfo.credRevId) &&
        Objects.equals(this.referent, indyCredInfo.referent) &&
        Objects.equals(this.revRegId, indyCredInfo.revRegId) &&
        Objects.equals(this.schemaId, indyCredInfo.schemaId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attrs, credDefId, credRevId, referent, revRegId, schemaId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndyCredInfo {\n");
    sb.append("    attrs: ").append(toIndentedString(attrs)).append("\n");
    sb.append("    credDefId: ").append(toIndentedString(credDefId)).append("\n");
    sb.append("    credRevId: ").append(toIndentedString(credRevId)).append("\n");
    sb.append("    referent: ").append(toIndentedString(referent)).append("\n");
    sb.append("    revRegId: ").append(toIndentedString(revRegId)).append("\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
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


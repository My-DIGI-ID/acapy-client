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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ibm.ssi.acapy_client.invoker.JSON;


/**
 * IndyProofIdentifier
 */
@JsonPropertyOrder({
  IndyProofIdentifier.JSON_PROPERTY_CRED_DEF_ID,
  IndyProofIdentifier.JSON_PROPERTY_REV_REG_ID,
  IndyProofIdentifier.JSON_PROPERTY_SCHEMA_ID,
  IndyProofIdentifier.JSON_PROPERTY_TIMESTAMP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class IndyProofIdentifier {
  public static final String JSON_PROPERTY_CRED_DEF_ID = "cred_def_id";
  private String credDefId;

  public static final String JSON_PROPERTY_REV_REG_ID = "rev_reg_id";
  private JsonNullable<String> revRegId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SCHEMA_ID = "schema_id";
  private String schemaId;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private JsonNullable<Integer> timestamp = JsonNullable.<Integer>undefined();


  public IndyProofIdentifier credDefId(String credDefId) {
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


  public IndyProofIdentifier revRegId(String revRegId) {
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


  public IndyProofIdentifier schemaId(String schemaId) {
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


  public IndyProofIdentifier timestamp(Integer timestamp) {
    this.timestamp = JsonNullable.<Integer>of(timestamp);
    return this;
  }

   /**
   * Timestamp epoch
   * minimum: 0
   * maximum: -1
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1629880624", value = "Timestamp epoch")
  @JsonIgnore

  public Integer getTimestamp() {
        return timestamp.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getTimestamp_JsonNullable() {
    return timestamp;
  }
  
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  public void setTimestamp_JsonNullable(JsonNullable<Integer> timestamp) {
    this.timestamp = timestamp;
  }

  public void setTimestamp(Integer timestamp) {
    this.timestamp = JsonNullable.<Integer>of(timestamp);
  }


  /**
   * Return true if this IndyProofIdentifier object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndyProofIdentifier indyProofIdentifier = (IndyProofIdentifier) o;
    return Objects.equals(this.credDefId, indyProofIdentifier.credDefId) &&
        Objects.equals(this.revRegId, indyProofIdentifier.revRegId) &&
        Objects.equals(this.schemaId, indyProofIdentifier.schemaId) &&
        Objects.equals(this.timestamp, indyProofIdentifier.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credDefId, revRegId, schemaId, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndyProofIdentifier {\n");
    sb.append("    credDefId: ").append(toIndentedString(credDefId)).append("\n");
    sb.append("    revRegId: ").append(toIndentedString(revRegId)).append("\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ibm.ssi.acapy_client.invoker.JSON;


/**
 * RouteRecord
 */
@JsonPropertyOrder({
  RouteRecord.JSON_PROPERTY_CONNECTION_ID,
  RouteRecord.JSON_PROPERTY_CREATED_AT,
  RouteRecord.JSON_PROPERTY_RECIPIENT_KEY,
  RouteRecord.JSON_PROPERTY_RECORD_ID,
  RouteRecord.JSON_PROPERTY_ROLE,
  RouteRecord.JSON_PROPERTY_STATE,
  RouteRecord.JSON_PROPERTY_UPDATED_AT,
  RouteRecord.JSON_PROPERTY_WALLET_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class RouteRecord {
  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private String connectionId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_RECIPIENT_KEY = "recipient_key";
  private String recipientKey;

  public static final String JSON_PROPERTY_RECORD_ID = "record_id";
  private String recordId;

  public static final String JSON_PROPERTY_ROLE = "role";
  private String role;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public static final String JSON_PROPERTY_WALLET_ID = "wallet_id";
  private String walletId;


  public RouteRecord connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Get connectionId
   * @return connectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnectionId() {
    return connectionId;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }


  public RouteRecord createdAt(String createdAt) {
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


  public RouteRecord recipientKey(String recipientKey) {
    this.recipientKey = recipientKey;
    return this;
  }

   /**
   * Get recipientKey
   * @return recipientKey
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RECIPIENT_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRecipientKey() {
    return recipientKey;
  }


  @JsonProperty(JSON_PROPERTY_RECIPIENT_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRecipientKey(String recipientKey) {
    this.recipientKey = recipientKey;
  }


  public RouteRecord recordId(String recordId) {
    this.recordId = recordId;
    return this;
  }

   /**
   * Get recordId
   * @return recordId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public RouteRecord role(String role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRole() {
    return role;
  }


  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRole(String role) {
    this.role = role;
  }


  public RouteRecord state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Current record state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "active", value = "Current record state")
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


  public RouteRecord updatedAt(String updatedAt) {
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


  public RouteRecord walletId(String walletId) {
    this.walletId = walletId;
    return this;
  }

   /**
   * Get walletId
   * @return walletId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WALLET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWalletId() {
    return walletId;
  }


  @JsonProperty(JSON_PROPERTY_WALLET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWalletId(String walletId) {
    this.walletId = walletId;
  }


  /**
   * Return true if this RouteRecord object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteRecord routeRecord = (RouteRecord) o;
    return Objects.equals(this.connectionId, routeRecord.connectionId) &&
        Objects.equals(this.createdAt, routeRecord.createdAt) &&
        Objects.equals(this.recipientKey, routeRecord.recipientKey) &&
        Objects.equals(this.recordId, routeRecord.recordId) &&
        Objects.equals(this.role, routeRecord.role) &&
        Objects.equals(this.state, routeRecord.state) &&
        Objects.equals(this.updatedAt, routeRecord.updatedAt) &&
        Objects.equals(this.walletId, routeRecord.walletId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionId, createdAt, recipientKey, recordId, role, state, updatedAt, walletId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteRecord {\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    recipientKey: ").append(toIndentedString(recipientKey)).append("\n");
    sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
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


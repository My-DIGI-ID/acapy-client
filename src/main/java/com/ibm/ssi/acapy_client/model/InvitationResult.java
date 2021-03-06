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
import com.ibm.ssi.acapy_client.model.ConnectionInvitation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ibm.ssi.acapy_client.invoker.JSON;


/**
 * InvitationResult
 */
@JsonPropertyOrder({
  InvitationResult.JSON_PROPERTY_CONNECTION_ID,
  InvitationResult.JSON_PROPERTY_INVITATION,
  InvitationResult.JSON_PROPERTY_INVITATION_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class InvitationResult {
  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private String connectionId;

  public static final String JSON_PROPERTY_INVITATION = "invitation";
  private ConnectionInvitation invitation;

  public static final String JSON_PROPERTY_INVITATION_URL = "invitation_url";
  private String invitationUrl;


  public InvitationResult connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Connection identifier
   * @return connectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3fa85f64-5717-4562-b3fc-2c963f66afa6", value = "Connection identifier")
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


  public InvitationResult invitation(ConnectionInvitation invitation) {
    this.invitation = invitation;
    return this;
  }

   /**
   * Get invitation
   * @return invitation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INVITATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConnectionInvitation getInvitation() {
    return invitation;
  }


  @JsonProperty(JSON_PROPERTY_INVITATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvitation(ConnectionInvitation invitation) {
    this.invitation = invitation;
  }


  public InvitationResult invitationUrl(String invitationUrl) {
    this.invitationUrl = invitationUrl;
    return this;
  }

   /**
   * Invitation URL
   * @return invitationUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://192.168.56.101:8020/invite?c_i=eyJAdHlwZSI6Li4ufQ==", value = "Invitation URL")
  @JsonProperty(JSON_PROPERTY_INVITATION_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvitationUrl() {
    return invitationUrl;
  }


  @JsonProperty(JSON_PROPERTY_INVITATION_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvitationUrl(String invitationUrl) {
    this.invitationUrl = invitationUrl;
  }


  /**
   * Return true if this InvitationResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvitationResult invitationResult = (InvitationResult) o;
    return Objects.equals(this.connectionId, invitationResult.connectionId) &&
        Objects.equals(this.invitation, invitationResult.invitation) &&
        Objects.equals(this.invitationUrl, invitationResult.invitationUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionId, invitation, invitationUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvitationResult {\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    invitation: ").append(toIndentedString(invitation)).append("\n");
    sb.append("    invitationUrl: ").append(toIndentedString(invitationUrl)).append("\n");
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


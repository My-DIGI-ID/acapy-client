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
 * ConnRecord
 */
@JsonPropertyOrder({
  ConnRecord.JSON_PROPERTY_ACCEPT,
  ConnRecord.JSON_PROPERTY_ALIAS,
  ConnRecord.JSON_PROPERTY_CONNECTION_ID,
  ConnRecord.JSON_PROPERTY_CONNECTION_PROTOCOL,
  ConnRecord.JSON_PROPERTY_CREATED_AT,
  ConnRecord.JSON_PROPERTY_ERROR_MSG,
  ConnRecord.JSON_PROPERTY_INBOUND_CONNECTION_ID,
  ConnRecord.JSON_PROPERTY_INVITATION_KEY,
  ConnRecord.JSON_PROPERTY_INVITATION_MODE,
  ConnRecord.JSON_PROPERTY_INVITATION_MSG_ID,
  ConnRecord.JSON_PROPERTY_MY_DID,
  ConnRecord.JSON_PROPERTY_REQUEST_ID,
  ConnRecord.JSON_PROPERTY_RFC23_STATE,
  ConnRecord.JSON_PROPERTY_ROUTING_STATE,
  ConnRecord.JSON_PROPERTY_STATE,
  ConnRecord.JSON_PROPERTY_THEIR_DID,
  ConnRecord.JSON_PROPERTY_THEIR_LABEL,
  ConnRecord.JSON_PROPERTY_THEIR_PUBLIC_DID,
  ConnRecord.JSON_PROPERTY_THEIR_ROLE,
  ConnRecord.JSON_PROPERTY_UPDATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-28T08:24:27.640452+02:00[Europe/Berlin]")
public class ConnRecord {
  /**
   * Connection acceptance: manual or auto
   */
  public enum AcceptEnum {
    MANUAL("manual"),
    
    AUTO("auto");

    private String value;

    AcceptEnum(String value) {
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
    public static AcceptEnum fromValue(String value) {
      for (AcceptEnum b : AcceptEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ACCEPT = "accept";
  private AcceptEnum accept;

  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private String connectionId;

  /**
   * Connection protocol used
   */
  public enum ConnectionProtocolEnum {
    CONNECTIONS_1_0("connections/1.0"),
    
    DIDEXCHANGE_1_0("didexchange/1.0");

    private String value;

    ConnectionProtocolEnum(String value) {
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
    public static ConnectionProtocolEnum fromValue(String value) {
      for (ConnectionProtocolEnum b : ConnectionProtocolEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CONNECTION_PROTOCOL = "connection_protocol";
  private ConnectionProtocolEnum connectionProtocol;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_ERROR_MSG = "error_msg";
  private String errorMsg;

  public static final String JSON_PROPERTY_INBOUND_CONNECTION_ID = "inbound_connection_id";
  private String inboundConnectionId;

  public static final String JSON_PROPERTY_INVITATION_KEY = "invitation_key";
  private String invitationKey;

  /**
   * Invitation mode
   */
  public enum InvitationModeEnum {
    ONCE("once"),
    
    MULTI("multi"),
    
    STATIC("static");

    private String value;

    InvitationModeEnum(String value) {
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
    public static InvitationModeEnum fromValue(String value) {
      for (InvitationModeEnum b : InvitationModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INVITATION_MODE = "invitation_mode";
  private InvitationModeEnum invitationMode;

  public static final String JSON_PROPERTY_INVITATION_MSG_ID = "invitation_msg_id";
  private String invitationMsgId;

  public static final String JSON_PROPERTY_MY_DID = "my_did";
  private String myDid;

  public static final String JSON_PROPERTY_REQUEST_ID = "request_id";
  private String requestId;

  public static final String JSON_PROPERTY_RFC23_STATE = "rfc23_state";
  private String rfc23State;

  /**
   * Routing state of connection
   */
  public enum RoutingStateEnum {
    NONE("none"),
    
    REQUEST("request"),
    
    ACTIVE("active"),
    
    ERROR("error");

    private String value;

    RoutingStateEnum(String value) {
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
    public static RoutingStateEnum fromValue(String value) {
      for (RoutingStateEnum b : RoutingStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ROUTING_STATE = "routing_state";
  private RoutingStateEnum routingState;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_THEIR_DID = "their_did";
  private String theirDid;

  public static final String JSON_PROPERTY_THEIR_LABEL = "their_label";
  private String theirLabel;

  public static final String JSON_PROPERTY_THEIR_PUBLIC_DID = "their_public_did";
  private String theirPublicDid;

  /**
   * Their role in the connection protocol
   */
  public enum TheirRoleEnum {
    INVITEE("invitee"),
    
    REQUESTER("requester"),
    
    INVITER("inviter"),
    
    RESPONDER("responder");

    private String value;

    TheirRoleEnum(String value) {
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
    public static TheirRoleEnum fromValue(String value) {
      for (TheirRoleEnum b : TheirRoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_THEIR_ROLE = "their_role";
  private TheirRoleEnum theirRole;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;


  public ConnRecord accept(AcceptEnum accept) {
    this.accept = accept;
    return this;
  }

   /**
   * Connection acceptance: manual or auto
   * @return accept
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "auto", value = "Connection acceptance: manual or auto")
  @JsonProperty(JSON_PROPERTY_ACCEPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AcceptEnum getAccept() {
    return accept;
  }


  @JsonProperty(JSON_PROPERTY_ACCEPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccept(AcceptEnum accept) {
    this.accept = accept;
  }


  public ConnRecord alias(String alias) {
    this.alias = alias;
    return this;
  }

   /**
   * Optional alias to apply to connection for later use
   * @return alias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Bob, providing quotes", value = "Optional alias to apply to connection for later use")
  @JsonProperty(JSON_PROPERTY_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAlias() {
    return alias;
  }


  @JsonProperty(JSON_PROPERTY_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlias(String alias) {
    this.alias = alias;
  }


  public ConnRecord connectionId(String connectionId) {
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


  public ConnRecord connectionProtocol(ConnectionProtocolEnum connectionProtocol) {
    this.connectionProtocol = connectionProtocol;
    return this;
  }

   /**
   * Connection protocol used
   * @return connectionProtocol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "connections/1.0", value = "Connection protocol used")
  @JsonProperty(JSON_PROPERTY_CONNECTION_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConnectionProtocolEnum getConnectionProtocol() {
    return connectionProtocol;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectionProtocol(ConnectionProtocolEnum connectionProtocol) {
    this.connectionProtocol = connectionProtocol;
  }


  public ConnRecord createdAt(String createdAt) {
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


  public ConnRecord errorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    return this;
  }

   /**
   * Error message
   * @return errorMsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "No DIDDoc provided; cannot connect to public DID", value = "Error message")
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


  public ConnRecord inboundConnectionId(String inboundConnectionId) {
    this.inboundConnectionId = inboundConnectionId;
    return this;
  }

   /**
   * Inbound routing connection id to use
   * @return inboundConnectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3fa85f64-5717-4562-b3fc-2c963f66afa6", value = "Inbound routing connection id to use")
  @JsonProperty(JSON_PROPERTY_INBOUND_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInboundConnectionId() {
    return inboundConnectionId;
  }


  @JsonProperty(JSON_PROPERTY_INBOUND_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInboundConnectionId(String inboundConnectionId) {
    this.inboundConnectionId = inboundConnectionId;
  }


  public ConnRecord invitationKey(String invitationKey) {
    this.invitationKey = invitationKey;
    return this;
  }

   /**
   * Public key for connection
   * @return invitationKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "H3C2AVvLMv6gmMNam3uVAjZpfkcJCwDwnZn6z3wXmqPV", value = "Public key for connection")
  @JsonProperty(JSON_PROPERTY_INVITATION_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvitationKey() {
    return invitationKey;
  }


  @JsonProperty(JSON_PROPERTY_INVITATION_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvitationKey(String invitationKey) {
    this.invitationKey = invitationKey;
  }


  public ConnRecord invitationMode(InvitationModeEnum invitationMode) {
    this.invitationMode = invitationMode;
    return this;
  }

   /**
   * Invitation mode
   * @return invitationMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "once", value = "Invitation mode")
  @JsonProperty(JSON_PROPERTY_INVITATION_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InvitationModeEnum getInvitationMode() {
    return invitationMode;
  }


  @JsonProperty(JSON_PROPERTY_INVITATION_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvitationMode(InvitationModeEnum invitationMode) {
    this.invitationMode = invitationMode;
  }


  public ConnRecord invitationMsgId(String invitationMsgId) {
    this.invitationMsgId = invitationMsgId;
    return this;
  }

   /**
   * ID of out-of-band invitation message
   * @return invitationMsgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3fa85f64-5717-4562-b3fc-2c963f66afa6", value = "ID of out-of-band invitation message")
  @JsonProperty(JSON_PROPERTY_INVITATION_MSG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvitationMsgId() {
    return invitationMsgId;
  }


  @JsonProperty(JSON_PROPERTY_INVITATION_MSG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvitationMsgId(String invitationMsgId) {
    this.invitationMsgId = invitationMsgId;
  }


  public ConnRecord myDid(String myDid) {
    this.myDid = myDid;
    return this;
  }

   /**
   * Our DID for connection
   * @return myDid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WgWxqztrNooG92RXvxSTWv", value = "Our DID for connection")
  @JsonProperty(JSON_PROPERTY_MY_DID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMyDid() {
    return myDid;
  }


  @JsonProperty(JSON_PROPERTY_MY_DID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMyDid(String myDid) {
    this.myDid = myDid;
  }


  public ConnRecord requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Connection request identifier
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3fa85f64-5717-4562-b3fc-2c963f66afa6", value = "Connection request identifier")
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestId() {
    return requestId;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


   /**
   * State per RFC 23
   * @return rfc23State
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "invitation-sent", value = "State per RFC 23")
  @JsonProperty(JSON_PROPERTY_RFC23_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRfc23State() {
    return rfc23State;
  }




  public ConnRecord routingState(RoutingStateEnum routingState) {
    this.routingState = routingState;
    return this;
  }

   /**
   * Routing state of connection
   * @return routingState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "active", value = "Routing state of connection")
  @JsonProperty(JSON_PROPERTY_ROUTING_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RoutingStateEnum getRoutingState() {
    return routingState;
  }


  @JsonProperty(JSON_PROPERTY_ROUTING_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoutingState(RoutingStateEnum routingState) {
    this.routingState = routingState;
  }


  public ConnRecord state(String state) {
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


  public ConnRecord theirDid(String theirDid) {
    this.theirDid = theirDid;
    return this;
  }

   /**
   * Their DID for connection
   * @return theirDid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WgWxqztrNooG92RXvxSTWv", value = "Their DID for connection")
  @JsonProperty(JSON_PROPERTY_THEIR_DID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTheirDid() {
    return theirDid;
  }


  @JsonProperty(JSON_PROPERTY_THEIR_DID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTheirDid(String theirDid) {
    this.theirDid = theirDid;
  }


  public ConnRecord theirLabel(String theirLabel) {
    this.theirLabel = theirLabel;
    return this;
  }

   /**
   * Their label for connection
   * @return theirLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Bob", value = "Their label for connection")
  @JsonProperty(JSON_PROPERTY_THEIR_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTheirLabel() {
    return theirLabel;
  }


  @JsonProperty(JSON_PROPERTY_THEIR_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTheirLabel(String theirLabel) {
    this.theirLabel = theirLabel;
  }


  public ConnRecord theirPublicDid(String theirPublicDid) {
    this.theirPublicDid = theirPublicDid;
    return this;
  }

   /**
   * Other agent&#39;s public DID for connection
   * @return theirPublicDid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2cpBmR3FqGKWi5EyUbpRY8", value = "Other agent's public DID for connection")
  @JsonProperty(JSON_PROPERTY_THEIR_PUBLIC_DID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTheirPublicDid() {
    return theirPublicDid;
  }


  @JsonProperty(JSON_PROPERTY_THEIR_PUBLIC_DID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTheirPublicDid(String theirPublicDid) {
    this.theirPublicDid = theirPublicDid;
  }


  public ConnRecord theirRole(TheirRoleEnum theirRole) {
    this.theirRole = theirRole;
    return this;
  }

   /**
   * Their role in the connection protocol
   * @return theirRole
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "requester", value = "Their role in the connection protocol")
  @JsonProperty(JSON_PROPERTY_THEIR_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TheirRoleEnum getTheirRole() {
    return theirRole;
  }


  @JsonProperty(JSON_PROPERTY_THEIR_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTheirRole(TheirRoleEnum theirRole) {
    this.theirRole = theirRole;
  }


  public ConnRecord updatedAt(String updatedAt) {
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
   * Return true if this ConnRecord object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnRecord connRecord = (ConnRecord) o;
    return Objects.equals(this.accept, connRecord.accept) &&
        Objects.equals(this.alias, connRecord.alias) &&
        Objects.equals(this.connectionId, connRecord.connectionId) &&
        Objects.equals(this.connectionProtocol, connRecord.connectionProtocol) &&
        Objects.equals(this.createdAt, connRecord.createdAt) &&
        Objects.equals(this.errorMsg, connRecord.errorMsg) &&
        Objects.equals(this.inboundConnectionId, connRecord.inboundConnectionId) &&
        Objects.equals(this.invitationKey, connRecord.invitationKey) &&
        Objects.equals(this.invitationMode, connRecord.invitationMode) &&
        Objects.equals(this.invitationMsgId, connRecord.invitationMsgId) &&
        Objects.equals(this.myDid, connRecord.myDid) &&
        Objects.equals(this.requestId, connRecord.requestId) &&
        Objects.equals(this.rfc23State, connRecord.rfc23State) &&
        Objects.equals(this.routingState, connRecord.routingState) &&
        Objects.equals(this.state, connRecord.state) &&
        Objects.equals(this.theirDid, connRecord.theirDid) &&
        Objects.equals(this.theirLabel, connRecord.theirLabel) &&
        Objects.equals(this.theirPublicDid, connRecord.theirPublicDid) &&
        Objects.equals(this.theirRole, connRecord.theirRole) &&
        Objects.equals(this.updatedAt, connRecord.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accept, alias, connectionId, connectionProtocol, createdAt, errorMsg, inboundConnectionId, invitationKey, invitationMode, invitationMsgId, myDid, requestId, rfc23State, routingState, state, theirDid, theirLabel, theirPublicDid, theirRole, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnRecord {\n");
    sb.append("    accept: ").append(toIndentedString(accept)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    connectionProtocol: ").append(toIndentedString(connectionProtocol)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
    sb.append("    inboundConnectionId: ").append(toIndentedString(inboundConnectionId)).append("\n");
    sb.append("    invitationKey: ").append(toIndentedString(invitationKey)).append("\n");
    sb.append("    invitationMode: ").append(toIndentedString(invitationMode)).append("\n");
    sb.append("    invitationMsgId: ").append(toIndentedString(invitationMsgId)).append("\n");
    sb.append("    myDid: ").append(toIndentedString(myDid)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    rfc23State: ").append(toIndentedString(rfc23State)).append("\n");
    sb.append("    routingState: ").append(toIndentedString(routingState)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    theirDid: ").append(toIndentedString(theirDid)).append("\n");
    sb.append("    theirLabel: ").append(toIndentedString(theirLabel)).append("\n");
    sb.append("    theirPublicDid: ").append(toIndentedString(theirPublicDid)).append("\n");
    sb.append("    theirRole: ").append(toIndentedString(theirRole)).append("\n");
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


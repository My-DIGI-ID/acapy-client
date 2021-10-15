

# ConnRecord


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accept** | [**AcceptEnum**](#AcceptEnum) | Connection acceptance: manual or auto |  [optional]
**alias** | **String** | Optional alias to apply to connection for later use |  [optional]
**connectionId** | **String** | Connection identifier |  [optional]
**connectionProtocol** | [**ConnectionProtocolEnum**](#ConnectionProtocolEnum) | Connection protocol used |  [optional]
**createdAt** | **String** | Time of record creation |  [optional]
**errorMsg** | **String** | Error message |  [optional]
**inboundConnectionId** | **String** | Inbound routing connection id to use |  [optional]
**invitationKey** | **String** | Public key for connection |  [optional]
**invitationMode** | [**InvitationModeEnum**](#InvitationModeEnum) | Invitation mode |  [optional]
**invitationMsgId** | **String** | ID of out-of-band invitation message |  [optional]
**myDid** | **String** | Our DID for connection |  [optional]
**requestId** | **String** | Connection request identifier |  [optional]
**rfc23State** | **String** | State per RFC 23 |  [optional] [readonly]
**routingState** | [**RoutingStateEnum**](#RoutingStateEnum) | Routing state of connection |  [optional]
**state** | **String** | Current record state |  [optional]
**theirDid** | **String** | Their DID for connection |  [optional]
**theirLabel** | **String** | Their label for connection |  [optional]
**theirPublicDid** | **String** | Other agent&#39;s public DID for connection |  [optional]
**theirRole** | [**TheirRoleEnum**](#TheirRoleEnum) | Their role in the connection protocol |  [optional]
**updatedAt** | **String** | Time of last record update |  [optional]



## Enum: AcceptEnum

Name | Value
---- | -----
MANUAL | &quot;manual&quot;
AUTO | &quot;auto&quot;



## Enum: ConnectionProtocolEnum

Name | Value
---- | -----
CONNECTIONS_1_0 | &quot;connections/1.0&quot;
DIDEXCHANGE_1_0 | &quot;didexchange/1.0&quot;



## Enum: InvitationModeEnum

Name | Value
---- | -----
ONCE | &quot;once&quot;
MULTI | &quot;multi&quot;
STATIC | &quot;static&quot;



## Enum: RoutingStateEnum

Name | Value
---- | -----
NONE | &quot;none&quot;
REQUEST | &quot;request&quot;
ACTIVE | &quot;active&quot;
ERROR | &quot;error&quot;



## Enum: TheirRoleEnum

Name | Value
---- | -----
INVITEE | &quot;invitee&quot;
REQUESTER | &quot;requester&quot;
INVITER | &quot;inviter&quot;
RESPONDER | &quot;responder&quot;




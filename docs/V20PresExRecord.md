

# V20PresExRecord


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autoPresent** | **Boolean** | Prover choice to auto-present proof as verifier requests |  [optional]
**byFormat** | [**V20PresExRecordByFormat**](V20PresExRecordByFormat.md) | Attachment content by format for proposal, request, and presentation |  [optional]
**connectionId** | **String** | Connection identifier |  [optional]
**createdAt** | **String** | Time of record creation |  [optional]
**errorMsg** | **String** | Error message |  [optional]
**initiator** | [**InitiatorEnum**](#InitiatorEnum) | Present-proof exchange initiator: self or external |  [optional]
**pres** | [**V20Pres**](V20Pres.md) | Presentation message |  [optional]
**presExId** | **String** | Presentation exchange identifier |  [optional]
**presProposal** | [**V20PresProposal**](V20PresProposal.md) | Presentation proposal message |  [optional]
**presRequest** | [**V20PresRequest**](V20PresRequest.md) | Presentation request message |  [optional]
**role** | [**RoleEnum**](#RoleEnum) | Present-proof exchange role: prover or verifier |  [optional]
**state** | [**StateEnum**](#StateEnum) | Present-proof exchange state |  [optional]
**threadId** | **String** | Thread identifier |  [optional]
**trace** | **Boolean** | Record trace information, based on agent configuration |  [optional]
**updatedAt** | **String** | Time of last record update |  [optional]
**verified** | [**VerifiedEnum**](#VerifiedEnum) | Whether presentation is verified: &#39;true&#39; or &#39;false&#39; |  [optional]



## Enum: InitiatorEnum

Name | Value
---- | -----
SELF | &quot;self&quot;
EXTERNAL | &quot;external&quot;



## Enum: RoleEnum

Name | Value
---- | -----
PROVER | &quot;prover&quot;
VERIFIER | &quot;verifier&quot;



## Enum: StateEnum

Name | Value
---- | -----
PROPOSAL_SENT | &quot;proposal-sent&quot;
PROPOSAL_RECEIVED | &quot;proposal-received&quot;
REQUEST_SENT | &quot;request-sent&quot;
REQUEST_RECEIVED | &quot;request-received&quot;
PRESENTATION_SENT | &quot;presentation-sent&quot;
PRESENTATION_RECEIVED | &quot;presentation-received&quot;
DONE | &quot;done&quot;
ABANDONED | &quot;abandoned&quot;



## Enum: VerifiedEnum

Name | Value
---- | -----
TRUE | &quot;true&quot;
FALSE | &quot;false&quot;




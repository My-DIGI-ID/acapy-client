

# V20CredExRecord


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autoIssue** | **Boolean** | Issuer choice to issue to request in this credential exchange |  [optional]
**autoOffer** | **Boolean** | Holder choice to accept offer in this credential exchange |  [optional]
**autoRemove** | **Boolean** | Issuer choice to remove this credential exchange record when complete |  [optional]
**byFormat** | [**V20CredExRecordByFormat**](V20CredExRecordByFormat.md) | Attachment content by format for proposal, offer, request, and issue |  [optional]
**connectionId** | **String** | Connection identifier |  [optional]
**createdAt** | **String** | Time of record creation |  [optional]
**credExId** | **String** | Credential exchange identifier |  [optional]
**credIssue** | [**V20CredIssue**](V20CredIssue.md) | Serialized credential issue message |  [optional]
**credOffer** | [**V20CredOffer**](V20CredOffer.md) | Credential offer message |  [optional]
**credPreview** | [**V20CredPreview**](V20CredPreview.md) | Credential preview from credential proposal |  [optional]
**credProposal** | [**V20CredProposal**](V20CredProposal.md) | Credential proposal message |  [optional]
**credRequest** | [**V20CredRequest**](V20CredRequest.md) | Serialized credential request message |  [optional]
**errorMsg** | **String** | Error message |  [optional]
**initiator** | [**InitiatorEnum**](#InitiatorEnum) | Issue-credential exchange initiator: self or external |  [optional]
**parentThreadId** | **String** | Parent thread identifier |  [optional]
**role** | [**RoleEnum**](#RoleEnum) | Issue-credential exchange role: holder or issuer |  [optional]
**state** | [**StateEnum**](#StateEnum) | Issue-credential exchange state |  [optional]
**threadId** | **String** | Thread identifier |  [optional]
**trace** | **Boolean** | Record trace information, based on agent configuration |  [optional]
**updatedAt** | **String** | Time of last record update |  [optional]



## Enum: InitiatorEnum

Name | Value
---- | -----
SELF | &quot;self&quot;
EXTERNAL | &quot;external&quot;



## Enum: RoleEnum

Name | Value
---- | -----
ISSUER | &quot;issuer&quot;
HOLDER | &quot;holder&quot;



## Enum: StateEnum

Name | Value
---- | -----
PROPOSAL_SENT | &quot;proposal-sent&quot;
PROPOSAL_RECEIVED | &quot;proposal-received&quot;
OFFER_SENT | &quot;offer-sent&quot;
OFFER_RECEIVED | &quot;offer-received&quot;
REQUEST_SENT | &quot;request-sent&quot;
REQUEST_RECEIVED | &quot;request-received&quot;
CREDENTIAL_ISSUED | &quot;credential-issued&quot;
CREDENTIAL_RECEIVED | &quot;credential-received&quot;
DONE | &quot;done&quot;




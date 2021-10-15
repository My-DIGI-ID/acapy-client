

# V10CredentialExchange


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autoIssue** | **Boolean** | Issuer choice to issue to request in this credential exchange |  [optional]
**autoOffer** | **Boolean** | Holder choice to accept offer in this credential exchange |  [optional]
**autoRemove** | **Boolean** | Issuer choice to remove this credential exchange record when complete |  [optional]
**connectionId** | **String** | Connection identifier |  [optional]
**createdAt** | **String** | Time of record creation |  [optional]
**credential** | [**IndyCredInfo**](IndyCredInfo.md) | Credential as stored |  [optional]
**credentialDefinitionId** | **String** | Credential definition identifier |  [optional]
**credentialExchangeId** | **String** | Credential exchange identifier |  [optional]
**credentialId** | **String** | Credential identifier |  [optional]
**credentialOffer** | [**IndyCredAbstract**](IndyCredAbstract.md) | (Indy) credential offer |  [optional]
**credentialOfferDict** | [**CredentialOffer**](CredentialOffer.md) | Credential offer message |  [optional]
**credentialProposalDict** | [**CredentialProposal**](CredentialProposal.md) | Credential proposal message |  [optional]
**credentialRequest** | [**IndyCredRequest**](IndyCredRequest.md) | (Indy) credential request |  [optional]
**credentialRequestMetadata** | **Object** | (Indy) credential request metadata |  [optional]
**errorMsg** | **String** | Error message |  [optional]
**initiator** | [**InitiatorEnum**](#InitiatorEnum) | Issue-credential exchange initiator: self or external |  [optional]
**parentThreadId** | **String** | Parent thread identifier |  [optional]
**rawCredential** | [**IndyCredential**](IndyCredential.md) | Credential as received, prior to storage in holder wallet |  [optional]
**revocRegId** | **String** | Revocation registry identifier |  [optional]
**revocationId** | **String** | Credential identifier within revocation registry |  [optional]
**role** | [**RoleEnum**](#RoleEnum) | Issue-credential exchange role: holder or issuer |  [optional]
**schemaId** | **String** | Schema identifier |  [optional]
**state** | **String** | Issue-credential exchange state |  [optional]
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
HOLDER | &quot;holder&quot;
ISSUER | &quot;issuer&quot;




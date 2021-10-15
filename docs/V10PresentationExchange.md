

# V10PresentationExchange


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autoPresent** | **Boolean** | Prover choice to auto-present proof as verifier requests |  [optional]
**connectionId** | **String** | Connection identifier |  [optional]
**createdAt** | **String** | Time of record creation |  [optional]
**errorMsg** | **String** | Error message |  [optional]
**initiator** | [**InitiatorEnum**](#InitiatorEnum) | Present-proof exchange initiator: self or external |  [optional]
**presentation** | [**IndyProof**](IndyProof.md) | (Indy) presentation (also known as proof) |  [optional]
**presentationExchangeId** | **String** | Presentation exchange identifier |  [optional]
**presentationProposalDict** | [**PresentationProposal**](PresentationProposal.md) | Presentation proposal message |  [optional]
**presentationRequest** | [**IndyProofRequest**](IndyProofRequest.md) | (Indy) presentation request (also known as proof request) |  [optional]
**presentationRequestDict** | [**PresentationRequest**](PresentationRequest.md) | Presentation request message |  [optional]
**role** | [**RoleEnum**](#RoleEnum) | Present-proof exchange role: prover or verifier |  [optional]
**state** | **String** | Present-proof exchange state |  [optional]
**threadId** | **String** | Thread identifier |  [optional]
**trace** | **Boolean** | Record trace information, based on agent configuration |  [optional]
**updatedAt** | **String** | Time of last record update |  [optional]
**verified** | [**VerifiedEnum**](#VerifiedEnum) | Whether presentation is verified: true or false |  [optional]



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



## Enum: VerifiedEnum

Name | Value
---- | -----
TRUE | &quot;true&quot;
FALSE | &quot;false&quot;




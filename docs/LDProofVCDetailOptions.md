

# LDProofVCDetailOptions


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**challenge** | **String** | A challenge to include in the proof. SHOULD be provided by the requesting party of the credential (&#x3D;holder) |  [optional]
**created** | **String** | The date and time of the proof (with a maximum accuracy in seconds). Defaults to current system time |  [optional]
**credentialStatus** | [**CredentialStatusOptions**](CredentialStatusOptions.md) | The credential status mechanism to use for the credential. Omitting the property indicates the issued credential will not include a credential status |  [optional]
**domain** | **String** | The intended domain of validity for the proof |  [optional]
**proofPurpose** | **String** | The proof purpose used for the proof. Should match proof purposes registered in the Linked Data Proofs Specification |  [optional]
**proofType** | **String** | The proof type used for the proof. Should match suites registered in the Linked Data Cryptographic Suite Registry | 




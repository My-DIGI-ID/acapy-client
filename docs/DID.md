

# DID


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**did** | **String** | DID of interest |  [optional]
**keyType** | [**KeyTypeEnum**](#KeyTypeEnum) | Key type associated with the DID |  [optional]
**method** | [**MethodEnum**](#MethodEnum) | Did method associated with the DID |  [optional]
**posture** | [**PostureEnum**](#PostureEnum) | Whether DID is current public DID, posted to ledger but not current public DID, or local to the wallet |  [optional]
**verkey** | **String** | Public verification key |  [optional]



## Enum: KeyTypeEnum

Name | Value
---- | -----
ED25519 | &quot;ed25519&quot;
BLS12381G2 | &quot;bls12381g2&quot;



## Enum: MethodEnum

Name | Value
---- | -----
SOV | &quot;sov&quot;
KEY | &quot;key&quot;



## Enum: PostureEnum

Name | Value
---- | -----
PUBLIC | &quot;public&quot;
POSTED | &quot;posted&quot;
WALLET_ONLY | &quot;wallet_only&quot;




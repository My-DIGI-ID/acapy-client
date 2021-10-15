

# IssuerRevRegRecord


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | **String** | Time of record creation |  [optional]
**credDefId** | **String** | Credential definition identifier |  [optional]
**errorMsg** | **String** | Error message |  [optional]
**issuerDid** | **String** | Issuer DID |  [optional]
**maxCredNum** | **Integer** | Maximum number of credentials for revocation registry |  [optional]
**pendingPub** | **List&lt;String&gt;** | Credential revocation identifier for credential revoked and pending publication to ledger |  [optional]
**recordId** | **String** | Issuer revocation registry record identifier |  [optional]
**revocDefType** | [**RevocDefTypeEnum**](#RevocDefTypeEnum) | Revocation registry type (specify CL_ACCUM) |  [optional]
**revocRegDef** | [**IndyRevRegDef**](IndyRevRegDef.md) | Revocation registry definition |  [optional]
**revocRegEntry** | [**IndyRevRegEntry**](IndyRevRegEntry.md) | Revocation registry entry |  [optional]
**revocRegId** | **String** | Revocation registry identifier |  [optional]
**state** | **String** | Issue revocation registry record state |  [optional]
**tag** | **String** | Tag within issuer revocation registry identifier |  [optional]
**tailsHash** | **String** | Tails hash |  [optional]
**tailsLocalPath** | **String** | Local path to tails file |  [optional]
**tailsPublicUri** | **String** | Public URI for tails file |  [optional]
**updatedAt** | **String** | Time of last record update |  [optional]



## Enum: RevocDefTypeEnum

Name | Value
---- | -----
CL_ACCUM | &quot;CL_ACCUM&quot;




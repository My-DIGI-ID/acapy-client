

# IndyProofReqAttrSpec


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Attribute name |  [optional]
**names** | **List&lt;String&gt;** | Attribute name group |  [optional]
**nonRevoked** | [**IndyProofReqAttrSpecNonRevoked**](IndyProofReqAttrSpecNonRevoked.md) |  |  [optional]
**restrictions** | **List&lt;Map&lt;String, String&gt;&gt;** | If present, credential must satisfy one of given restrictions: specify schema_id, schema_issuer_did, schema_name, schema_version, issuer_did, cred_def_id, and/or attr::&lt;attribute-name&gt;::value where &lt;attribute-name&gt; represents a credential attribute name |  [optional]




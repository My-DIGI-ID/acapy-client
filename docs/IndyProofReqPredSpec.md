

# IndyProofReqPredSpec


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Attribute name | 
**nonRevoked** | [**IndyProofReqPredSpecNonRevoked**](IndyProofReqPredSpecNonRevoked.md) |  |  [optional]
**pType** | [**PTypeEnum**](#PTypeEnum) | Predicate type (&#39;&lt;&#39;, &#39;&lt;&#x3D;&#39;, &#39;&gt;&#x3D;&#39;, or &#39;&gt;&#39;) | 
**pValue** | **Integer** | Threshold value | 
**restrictions** | **List&lt;Map&lt;String, String&gt;&gt;** | If present, credential must satisfy one of given restrictions: specify schema_id, schema_issuer_did, schema_name, schema_version, issuer_did, cred_def_id, and/or attr::&lt;attribute-name&gt;::value where &lt;attribute-name&gt; represents a credential attribute name |  [optional]



## Enum: PTypeEnum

Name | Value
---- | -----
LESS_THAN | &quot;&lt;&quot;
LESS_THAN_OR_EQUAL_TO | &quot;&lt;&#x3D;&quot;
GREATER_THAN_OR_EQUAL_TO | &quot;&gt;&#x3D;&quot;
GREATER_THAN | &quot;&gt;&quot;




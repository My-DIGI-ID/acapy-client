

# DIDEndpointWithType


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**did** | **String** | DID of interest | 
**endpoint** | **String** | Endpoint to set (omit to delete) |  [optional]
**endpointType** | [**EndpointTypeEnum**](#EndpointTypeEnum) | Endpoint type to set (default &#39;Endpoint&#39;); affects only public or posted DIDs |  [optional]



## Enum: EndpointTypeEnum

Name | Value
---- | -----
ENDPOINT | &quot;Endpoint&quot;
PROFILE | &quot;Profile&quot;
LINKEDDOMAINS | &quot;LinkedDomains&quot;




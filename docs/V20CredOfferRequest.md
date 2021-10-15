

# V20CredOfferRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autoIssue** | **Boolean** | Whether to respond automatically to credential requests, creating and issuing requested credentials |  [optional]
**autoRemove** | **Boolean** | Whether to remove the credential exchange record on completion (overrides --preserve-exchange-records configuration setting) |  [optional]
**comment** | **String** | Human-readable comment |  [optional]
**connectionId** | **UUID** | Connection identifier | 
**credentialPreview** | [**V20CredPreview**](V20CredPreview.md) |  |  [optional]
**filter** | [**V20CredFilter**](V20CredFilter.md) | Credential specification criteria by format | 
**trace** | **Boolean** | Record trace information, based on agent configuration |  [optional]




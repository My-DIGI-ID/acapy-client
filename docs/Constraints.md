

# Constraints


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fields** | [**List&lt;DIFField&gt;**](DIFField.md) |  |  [optional]
**isHolder** | [**List&lt;DIFHolder&gt;**](DIFHolder.md) |  |  [optional]
**limitDisclosure** | **String** | LimitDisclosure |  [optional]
**statusActive** | [**StatusActiveEnum**](#StatusActiveEnum) |  |  [optional]
**statusRevoked** | [**StatusRevokedEnum**](#StatusRevokedEnum) |  |  [optional]
**statusSuspended** | [**StatusSuspendedEnum**](#StatusSuspendedEnum) |  |  [optional]
**subjectIsIssuer** | [**SubjectIsIssuerEnum**](#SubjectIsIssuerEnum) | SubjectIsIssuer |  [optional]



## Enum: StatusActiveEnum

Name | Value
---- | -----
REQUIRED | &quot;required&quot;
ALLOWED | &quot;allowed&quot;
DISALLOWED | &quot;disallowed&quot;



## Enum: StatusRevokedEnum

Name | Value
---- | -----
REQUIRED | &quot;required&quot;
ALLOWED | &quot;allowed&quot;
DISALLOWED | &quot;disallowed&quot;



## Enum: StatusSuspendedEnum

Name | Value
---- | -----
REQUIRED | &quot;required&quot;
ALLOWED | &quot;allowed&quot;
DISALLOWED | &quot;disallowed&quot;



## Enum: SubjectIsIssuerEnum

Name | Value
---- | -----
REQUIRED | &quot;required&quot;
PREFERRED | &quot;preferred&quot;




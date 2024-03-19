

# DatabaseTemplateCreateParameters

Parameters to create a database template.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The DatabaseTemplate name. | 
**description** | **String** | User provided description for this template. |  [optional]
**sourceType** | [**SourceTypeEnum**](#SourceTypeEnum) | The type of the source associated with the template. | 
**parameters** | **Map&lt;String, String&gt;** | A name/value map of string configuration parameters. |  [optional]
**makeCurrentAccountOwner** | **Boolean** | Whether the account creating this database template must be configured as owner of the database template. |  [optional]
**tags** | [**List&lt;Tag&gt;**](Tag.md) |  |  [optional]



## Enum: SourceTypeEnum

Name | Value
---- | -----
ORACLEVIRTUALSOURCE | &quot;OracleVirtualSource&quot;
ORACLELINKEDSOURCE | &quot;OracleLinkedSource&quot;
MSSQLVIRTUALSOURCE | &quot;MSSqlVirtualSource&quot;
MSSQLLINKEDSOURCE | &quot;MSSqlLinkedSource&quot;




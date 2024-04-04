

# UpdateDatabaseTemplateParameters

Parameters to update a Database Template.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The DatabaseTemplate name. |  [optional] |
|**description** | **String** | User provided description for this template. |  [optional] |
|**sourceType** | [**SourceTypeEnum**](#SourceTypeEnum) | The type of the source associated with the template. |  [optional] |
|**parameters** | **Map&lt;String, String&gt;** | A name/value map of string configuration parameters. |  [optional] |



## Enum: SourceTypeEnum

| Name | Value |
|---- | -----|
| ORACLEVIRTUALSOURCE | &quot;OracleVirtualSource&quot; |
| ORACLELINKEDSOURCE | &quot;OracleLinkedSource&quot; |
| MSSQLVIRTUALSOURCE | &quot;MSSqlVirtualSource&quot; |
| MSSQLLINKEDSOURCE | &quot;MSSqlLinkedSource&quot; |




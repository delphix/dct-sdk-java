

# DatabaseTemplate

A database template to use for provisioning and refresh. If set, configParams will be ignored on provision or refresh.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The DatabaseTemplate entity ID. |  [optional] [readonly] |
|**name** | **String** | The DatabaseTemplate name. |  |
|**description** | **String** | User provided description for this template. |  [optional] |
|**sourceType** | [**SourceTypeEnum**](#SourceTypeEnum) | The type of the source associated with the template. |  |
|**parameters** | **Map&lt;String, String&gt;** | A name/value map of string configuration parameters. |  [optional] |
|**tags** | [**List&lt;Tag&gt;**](Tag.md) |  |  [optional] |



## Enum: SourceTypeEnum

| Name | Value |
|---- | -----|
| ORACLEVIRTUALSOURCE | &quot;OracleVirtualSource&quot; |
| ORACLELINKEDSOURCE | &quot;OracleLinkedSource&quot; |
| MSSQLVIRTUALSOURCE | &quot;MSSqlVirtualSource&quot; |
| MSSQLLINKEDSOURCE | &quot;MSSqlLinkedSource&quot; |




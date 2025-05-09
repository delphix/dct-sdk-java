

# DataLayout

A Data Control Tower object that references the self-service template/container.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | DCT Id of the template/container. |  [optional] |
|**name** | **String** | Name of the template/container |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the object, either CONTAINER or TEMPLATE. |  [optional] |
|**engineId** | **String** | Id of the engine this object belongs to. |  [optional] |
|**engineName** | **String** | Name of the engine this object belongs to. |  [optional] |
|**tags** | [**List&lt;Tag&gt;**](Tag.md) | The tags to be created for this data-layout. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CONTAINER | &quot;CONTAINER&quot; |
| TEMPLATE | &quot;TEMPLATE&quot; |




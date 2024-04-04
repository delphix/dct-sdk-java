

# VDBGroup

A collection of virtual databases and datesets.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier for the entity. |  [readonly] |
|**name** | **String** | A unique name for the entity. |  |
|**vdbIds** | **List&lt;String&gt;** | The list of VDB IDs in this VDBGroup. |  |
|**isLocked** | **Boolean** | Indicates whether the VDBGroup is locked. |  [optional] |
|**lockedBy** | **Long** | The Id of the account that locked the VDBGroup. |  [optional] |
|**lockedByName** | **String** | The name of the account that locked the VDBGroup. |  [optional] |
|**tags** | [**List&lt;Tag&gt;**](Tag.md) |  |  [optional] |




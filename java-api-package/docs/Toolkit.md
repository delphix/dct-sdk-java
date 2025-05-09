

# Toolkit

A toolkit or plugin.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Id of the toolkit. |  [optional] |
|**type** | **String** | Specifies whether this object is toolkit or plugin |  [optional] |
|**reference** | **String** | The object reference. |  [optional] |
|**engineName** | **String** | Name of the engine. |  [optional] |
|**engineId** | **String** | Id of the engine. |  [optional] |
|**virtualSourceDefinition** | **Map&lt;String, Object&gt;** | Definition of how to provision virtual sources of this type |  [optional] |
|**linkedSourceDefinition** | **Map&lt;String, Object&gt;** | Definition of how to link sources of this type. |  [optional] |
|**discoveryDefinition** | **Map&lt;String, Object&gt;** | Definition of how to discover sources of this type. |  [optional] |
|**upgradeDefinition** | **Map&lt;String, Object&gt;** | Definition of how to upgrade sources of this type. |  [optional] |
|**snapshotParametersDefinition** | **Map&lt;String, Object&gt;** | The schema that defines the structure of the fields in AppDataSyncParameters. |  [optional] |
|**tags** | [**List&lt;Tag&gt;**](Tag.md) | Tags associated to this toolkit. |  [optional] |




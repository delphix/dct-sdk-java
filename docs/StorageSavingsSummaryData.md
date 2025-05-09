

# StorageSavingsSummaryData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dsourceId** | **String** | Id of the dSource. |  [optional] |
|**dependantVdbs** | **Integer** | The number of VDBs that are dependant on this dSource. This includes all VDB descendants that have this dSource as an ancestor. |  [optional] |
|**engineName** | **String** | The engine name. |  [optional] |
|**unvirtualizedSpace** | **Long** | The disk space, in bytes, that it would take to store the dSource and its descendant VDBs without Delphix, counting each of their timeflows as separate copy of the parent source data. |  [optional] |
|**currentTimeflowsUnvirtualizedSpace** | **Long** | The disk space, in bytes, that it would take to store the dSource and its descendant VDBs without Delphix, counting only their current (active) timeflows. |  [optional] |
|**virtualizedSpace** | **Long** | The actual space used by the VDB, in bytes. |  [optional] |
|**name** | **String** | The name of the database on the target environment. |  [optional] |
|**estimatedSavings** | **Long** | The disk space that has been saved by using Delphix virtualizion for all descendant timeflows, in bytes. |  [optional] |
|**estimatedSavingsPerc** | **BigDecimal** | The disk space that has been saved by using Delphix virtualizion for all descendant timeflows, in percentage. |  [optional] |
|**estimatedCurrentTimeflowsSavings** | **Long** | The disk space that has been saved by using Delphix virtualizion for only the current (active) timeflows, in bytes. |  [optional] |
|**estimatedCurrentTimeflowsSavingsPerc** | **BigDecimal** | The disk space that has been saved by using Delphix virtualizion for only the current (active) timeflows, in percentage. |  [optional] |




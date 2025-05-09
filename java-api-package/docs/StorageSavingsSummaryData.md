

# StorageSavingsSummaryData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dsourceId** | **String** | Id of the dSource. |  [optional] |
|**dependantVdbs** | **Integer** | The number of VDBs that are dependant on this dSource. This includes all VDB descendants that have this dSource as an ancestor. |  [optional] |
|**engineName** | **String** | The engine name. |  [optional] |
|**unvirtualizedSpace** | **Long** | The disk space that would be required if not using Delphix virtualizion, in bytes. |  [optional] |
|**virtualizedSpace** | **Long** | The actual space used by the VDB, in bytes. |  [optional] |
|**name** | **String** | The name of the database on the target environment. |  [optional] |
|**estimatedSavings** | **Long** | The disk space that has been saved by using Delphix virtualizion, in bytes. |  [optional] |
|**estimatedSavingsPerc** | **BigDecimal** | The disk space that has been saved by using Delphix virtualizion, in percentage. |  [optional] |




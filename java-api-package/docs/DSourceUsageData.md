

# DSourceUsageData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**engineName** | **String** | The name of the engine the dSource belongs to. |  [optional] |
|**name** | **String** | The name of the dSource |  [optional] |
|**unvirtualizedSpace** | **Long** | The the disk space that would be required if not using Delphix virtualizion, in bytes. |  [optional] |
|**actualSpace** | **Long** | The actual space used by this dSource, in bytes. This includes the disk space used by the current copy of the data as well as the snapshots and log files retained to enable provisioning from historical versions. |  [optional] |
|**dependantVdbs** | **Integer** | The number of VDBs that are dependant on this dSource. This includes all VDB descendants that have this dSource as an ancestor. |  [optional] |




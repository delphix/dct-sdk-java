

# StorageSavingsReportSummarizedData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vdbCount** | **Integer** | The total VDB count |  [optional] |
|**dsourceCount** | **Integer** | The total dSource count |  [optional] |
|**virtualizedSpace** | **Long** | Total Virtualized Space. This is the sum of storage size from dSources and their dependant VDBs. |  [optional] |
|**unvirtualizedSpace** | **Long** | Total disk space, in bytes, that it would take to store the filtered list of dSources and their descandant VDBs without Delphix, counting each of their timeflows as separate copy of the source data. |  [optional] |
|**currentTimeflowsUnvirtualizedSpace** | **Long** | Total disk space, in bytes, that it would take to store the filtered list of dSources and their descandant VDBs without Delphix, counting only their current (active) timeflows. |  [optional] |
|**estimatedSavings** | **Long** | Total disk space that has been saved by using Delphix virtualization for all timeflows, in bytes. |  [optional] |
|**estimatedSavingsPerc** | **BigDecimal** | Total disk space that has been saved by using Delphix virtualization for all timeflows, in percentage. |  [optional] |
|**estimatedCurrentTimeflowsSavings** | **Long** | Total disk space that has been saved by using Delphix virtualization for only the current (active) timeflows, in bytes. |  [optional] |
|**estimatedCurrentTimeflowsSavingsPerc** | **BigDecimal** | Total disk space that has been saved by using Delphix virtualization for only the current (active) timeflows, in percentage. |  [optional] |






# StorageSavingsReportSummarizedData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vdbCount** | **Integer** | The total VDB count |  [optional] |
|**dsourceCount** | **Integer** | The total dSource count |  [optional] |
|**virtualizedSpace** | **Long** | Total Virtualized Space. This is the sum of storage size from dSources and their dependant VDBs. |  [optional] |
|**unvirtualizedSpace** | **Long** | Total Unvirtualized Space. This is the sum of un-virtualized space from the dependants VDBs of the dSource. |  [optional] |
|**estimatedSavings** | **Long** | The disk space that has been saved by using Delphix virtualization, in bytes. |  [optional] |
|**estimatedSavingsPerc** | **BigDecimal** | The disk space that has been saved by using Delphix virtualization, in percentage. |  [optional] |




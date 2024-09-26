

# ProvisionVDBByTimestampDefaultsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**timestamp** | **OffsetDateTime** | The point in time from which to execute the operation. Mutually exclusive with timestamp_in_database_timezone. If the timestamp is not set, selects the latest point. |  [optional] |
|**timestampInDatabaseTimezone** | **String** | The point in time from which to execute the operation, expressed as a date-time in the timezone of the source database. Mutually exclusive with timestamp. |  [optional] |
|**engineId** | **String** | The ID of the Engine onto which to provision. If the source ID unambiguously identifies a source object, this parameter is unnecessary and ignored. |  [optional] |
|**sourceDataId** | **String** | The ID of the source object (dSource or VDB) to provision from. All other objects referenced by the parameters must live on the same engine as the source. |  |
|**timeflowId** | **String** | The Timeflow ID. |  [optional] |




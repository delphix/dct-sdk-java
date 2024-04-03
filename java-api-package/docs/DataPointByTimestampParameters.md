

# DataPointByTimestampParameters


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**timestamp** | **OffsetDateTime** | The point in time from which to execute the operation. Mutually exclusive with timestamp_in_database_timezone. If the timestamp is not set, selects the latest point. |  [optional] |
|**timestampInDatabaseTimezone** | **String** | The point in time from which to execute the operation, expressed as a date-time in the timezone of the source database. Mutually exclusive with timestamp. |  [optional] |
|**timeflowId** | **String** | The Timeflow ID. |  [optional] |




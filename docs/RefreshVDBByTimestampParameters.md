

# RefreshVDBByTimestampParameters


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timestamp** | **OffsetDateTime** | The point in time from which to execute the operation. Mutually exclusive with timestamp_in_database_timezone. If the timestamp is not set, selects the latest point. |  [optional]
**timestampInDatabaseTimezone** | **String** | The point in time from which to execute the operation, expressed as a date-time in the timezone of the source database. Mutually exclusive with timestamp. |  [optional]
**timeflowId** | **String** | ID of the timeflow to refresh to, mutually exclusive with dataset_id. |  [optional]
**datasetId** | **String** | ID of the dataset to refresh to, mutually exclusive with timeflow_id. |  [optional]




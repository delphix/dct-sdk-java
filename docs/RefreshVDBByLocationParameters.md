

# RefreshVDBByLocationParameters

Parameters to refresh by a database-specific identifier (SCN, LSN, etc).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**location** | **String** | The database specific identifier for tracking transactions (SCN, LSN, etc). |  [optional]
**datasetId** | **String** | ID of the dataset to refresh to, mutually exclusive with timeflow_id. |  [optional]
**timeflowId** | **String** | ID of the timeflow to refresh to, mutually exclusive with dataset_id. |  [optional]






# TimestampCompatibleRepositoryRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourceDataId** | **String** | The ID of the source object (dSource or VDB) to get the compatible repos. All other objects referenced by the parameters must live on the same engine as the source. |  [optional]
**engineId** | **String** | The ID of the Engine from where to get the compatible repos. If the source ID unambiguously identifies a source object, this parameter is unnecessary and ignored. |  [optional]
**timestamp** | **OffsetDateTime** | The point in time from which to execute the operation. If the timestamp is not set, selects the latest point. |  [optional]
**timeflowId** | **String** | ID of the timeflow from which compatible repos need to be fetched, mutually exclusive with source_data_id. |  [optional]
**environmentId** | **String** | The ID or name of the target environment. |  [optional]




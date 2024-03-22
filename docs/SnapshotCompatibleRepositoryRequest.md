

# SnapshotCompatibleRepositoryRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourceDataId** | **String** | The ID of the source object (dSource or VDB) to get the compatible repos. All other objects referenced by the parameters must live on the same engine as the source. |  [optional]
**engineId** | **String** | The ID of the Engine from where to get the compatible repos. If the source ID unambiguously identifies a source object, this parameter is unnecessary and ignored. |  [optional]
**snapshotId** | **String** | The ID of the snapshot from which to execute the operation. |  [optional]
**environmentId** | **String** | The ID or name of the target environment. |  [optional]




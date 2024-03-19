

# ProvisionVDBBySnapshotDefaultsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**snapshotId** | **String** | The ID of the snapshot from which to execute the operation. |  [optional]
**engineId** | **String** | The ID of the Engine onto which to provision. If the source ID unambiguously identifies a source object, this parameter is unnecessary and ignored. |  [optional]
**sourceDataId** | **String** | The ID of the source object (dSource or VDB) to provision from. If this property is not set, the data_source of the snapshot_id will be used. |  [optional]






# ProvisionVDBByLocationDefaultsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourceDataId** | **String** | The ID of the source object (dSource or VDB) to provision from. All other objects referenced by the parameters must live on the same engine as the source. |  [optional]
**engineId** | **String** | The ID of the Engine onto which to provision. If the source ID unambiguously identifies a source object, this parameter is unnecessary and ignored. |  [optional]
**location** | **String** | The location to get the defaults from. |  [optional]
**timeflowId** | **String** | ID of the timeflow to provision from. |  [optional]




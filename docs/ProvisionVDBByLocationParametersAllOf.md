

# ProvisionVDBByLocationParametersAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**engineId** | **String** | The ID of the Engine onto which to provision. If the source ID unambiguously identifies a source object, this parameter is unnecessary and ignored. |  [optional]
**sourceDataId** | **String** | The ID of the source object (dSource or VDB) to provision from. All other objects referenced by the parameters must live on the same engine as the source. |  [optional]
**makeCurrentAccountOwner** | **Boolean** | Whether the account provisioning this VDB must be configured as owner of the VDB. |  [optional]




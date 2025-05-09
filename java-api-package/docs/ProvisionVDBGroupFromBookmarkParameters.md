

# ProvisionVDBGroupFromBookmarkParameters


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the created VDB group name. |  |
|**bookmarkId** | **String** | ID of a bookmark to provision this VDB Group from. |  |
|**provisionParameters** | [**Map&lt;String, BaseProvisionVDBParameters&gt;**](BaseProvisionVDBParameters.md) | Provision parameters for each of the VDBs which will need to be provisioned. The key must be the vdb_id of the corresponding entry from the bookmark, and the value the provision parameters for the VDB which will be cloned from the bookmark. |  |
|**tags** | [**List&lt;Tag&gt;**](Tag.md) | The tags to be created for VDB Group. |  [optional] |
|**makeCurrentAccountOwner** | **Boolean** | Whether the account provisioning this VDB group must be configured as owner of the VDB group. |  [optional] |




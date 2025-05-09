

# VCDB

The Delphix Oracle Virtual Container Database.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The vCDB object entity ID. |  [optional] |
|**name** | **String** | The name of this vCDB. |  [optional] |
|**namespaceId** | **String** | The namespace id of this vCDB. |  [optional] |
|**namespaceName** | **String** | The namespace name of this vCDB. |  [optional] |
|**isReplica** | **Boolean** | Is this a replicated object. |  [optional] |
|**databaseVersion** | **String** | The version of this vCDB. |  [optional] |
|**environmentId** | **String** | A reference to the Environment that hosts this vCDB. |  [optional] |
|**size** | **Long** | The total size of the data files used by this vCDB, in bytes. |  [optional] |
|**engineId** | **String** | A reference to the Engine that this vCDB belongs to. |  [optional] |
|**status** | **String** | The runtime status of the vCDB. |  [optional] |
|**parentId** | **String** | A reference to the parent CDB of this vCDB. |  [optional] |
|**creationDate** | **OffsetDateTime** | The date this vCDB was created. |  [optional] |
|**groupName** | **String** | The name of the group containing this vCDB. |  [optional] |
|**enabled** | **Boolean** | Whether the vCDB is enabled or not. |  [optional] |
|**contentType** | **String** | The content type of the vcdb. |  [optional] |
|**vcdbRestart** | **Boolean** | Indicates whether the Engine should automatically restart this vcdb when target host reboot is detected. |  [optional] |
|**tags** | [**List&lt;Tag&gt;**](Tag.md) |  |  [optional] |




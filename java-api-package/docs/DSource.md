

# DSource

The Delphix storage-based copy of the source database including its history.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The dSource object entity ID. |  [optional] |
|**databaseType** | **String** | The database type of this dSource. |  [optional] |
|**name** | **String** | The container name of this dSource. |  [optional] |
|**namespaceId** | **String** | The namespace id of this dSource. |  [optional] |
|**namespaceName** | **String** | The namespace name of this dSource. |  [optional] |
|**isReplica** | **Boolean** | Is this a replicated object. |  [optional] |
|**databaseVersion** | **String** | The database version of this dSource. |  [optional] |
|**contentType** | **String** | The content type of the dSource. |  [optional] |
|**dataUuid** | **String** | A universal ID that uniquely identifies the dSource database. |  [optional] |
|**storageSize** | **Long** | The actual space used by this dSource, in bytes. |  [optional] |
|**pluginVersion** | **String** | The version of the plugin associated with this source database. |  [optional] |
|**creationDate** | **OffsetDateTime** | The date this dSource was created. |  [optional] |
|**groupName** | **String** | The name of the group containing this dSource. |  [optional] |
|**enabled** | **Boolean** | A value indicating whether this dSource is enabled. |  [optional] |
|**engineId** | **String** | A reference to the Engine that this dSource belongs to. |  [optional] |
|**sourceId** | **String** | A reference to the Source associated with this dSource. |  [optional] |
|**status** | **String** | The runtime status of the dSource. &#39;Unknown&#39; if all attempts to connect to the source failed. |  [optional] |
|**engineName** | **String** | Name of the Engine where this DSource is hosted |  [optional] |
|**cdbId** | **String** | A reference to the CDB associated with this dSource. |  [optional] |
|**currentTimeflowId** | **String** | A reference to the currently active timeflow for this dSource. |  [optional] |
|**previousTimeflowId** | **String** | A reference to the previous timeflow for this dSource. |  [optional] |
|**isAppdata** | **Boolean** | Indicates whether this dSource has an AppData database. |  [optional] |
|**toolkitId** | **String** | The ID of the toolkit associated with this dSource(AppData only). |  [optional] |
|**unvirtualizedSpace** | **Long** | This is the sum of unvirtualized space from the dependants VDBs of the dSource. |  [optional] |
|**dependantVdbs** | **Integer** | The number of VDBs that are dependant on this dSource. This includes all VDB descendants that have this dSource as an ancestor. |  [optional] |
|**tags** | [**List&lt;Tag&gt;**](Tag.md) |  |  [optional] |
|**primaryObjectId** | **String** | The ID of the parent object from which replication was done. |  [optional] |
|**primaryEngineId** | **String** | The ID of the parent engine from which replication was done. |  [optional] |
|**primaryEngineName** | **String** | The name of the parent engine from which replication was done. |  [optional] |
|**replicas** | [**List&lt;Replica&gt;**](Replica.md) | The list of replicas replicated from this object. |  [optional] |
|**hooks** | [**DSourceHooks**](DSourceHooks.md) |  |  [optional] |
|**syncPolicyId** | **String** | The id of the snapshot policy associated with this dSource. |  [optional] |
|**retentionPolicyId** | **String** | The id of the retention policy associated with this dSource. |  [optional] |
|**quotaPolicyId** | **String** | The id of the quota policy associated with this dSource. |  [optional] |






# VDB

A Delphix virtual database or dataset.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The VDB object entity ID. |  [optional] |
|**databaseType** | **String** | The database type of this VDB. |  [optional] |
|**name** | **String** | The container name of this VDB. |  [optional] |
|**namespaceId** | **String** | The namespace id of this VDB. |  [optional] |
|**namespaceName** | **String** | The namespace name of this VDB. |  [optional] |
|**isReplica** | **Boolean** | Is this a replicated object. |  [optional] |
|**isLocked** | **Boolean** | Is this VDB locked. |  [optional] |
|**lockedBy** | **Long** | The ID of the account that locked this VDB. |  [optional] |
|**lockedByName** | **String** | The name of the account that locked this VDB. |  [optional] |
|**databaseVersion** | **String** | The database version of this VDB. |  [optional] |
|**jdbcConnectionString** | **String** | The JDBC connection URL for this VDB. |  [optional] |
|**size** | **Long** | The total size of this VDB, in bytes. |  [optional] |
|**storageSize** | **Long** | The actual space used by this VDB, in bytes. |  [optional] |
|**engineId** | **String** | A reference to the Engine that this VDB belongs to. |  [optional] |
|**status** | **String** | The runtime status of the VDB. &#39;Unknown&#39; if all attempts to connect to the dataset failed. |  [optional] |
|**masked** | **Boolean** | The VDB is masked or not. |  [optional] |
|**contentType** | **String** | The content type of the vdb. |  [optional] |
|**parentTimeflowTimestamp** | **OffsetDateTime** | The timestamp for parent timeflow. |  [optional] |
|**parentTimeflowTimezone** | **String** | The timezone for parent timeflow. |  [optional] |
|**environmentId** | **String** | A reference to the Environment that hosts this VDB. |  [optional] |
|**ipAddress** | **String** | The IP address of the VDB&#39;s host. |  [optional] |
|**fqdn** | **String** | The FQDN of the VDB&#39;s host. |  [optional] |
|**parentId** | **String** | A reference to the parent dataset of this VDB. |  [optional] |
|**parentDsourceId** | **String** | A reference to the parent dSource of this VDB. |  [optional] |
|**groupName** | **String** | The name of the group containing this VDB. |  [optional] |
|**engineName** | **String** | Name of the Engine where this VDB is hosted |  [optional] |
|**cdbId** | **String** | A reference to the CDB or VCDB associated with this VDB. |  [optional] |
|**tags** | [**List&lt;Tag&gt;**](Tag.md) |  |  [optional] |
|**creationDate** | **OffsetDateTime** | The date this VDB was created. |  [optional] |
|**hooks** | [**VirtualDatasetHooks**](VirtualDatasetHooks.md) |  |  [optional] |
|**appdataSourceParams** | **Map&lt;String, Object&gt;** | The JSON payload conforming to the DraftV4 schema based on the type of application data being manipulated. |  [optional] |
|**templateId** | **String** | A reference to the Database Template. |  [optional] |
|**configParams** | **Map&lt;String, Object&gt;** | Database configuration parameter overrides. |  [optional] |
|**additionalMountPoints** | [**List&lt;AdditionalMountPoint&gt;**](AdditionalMountPoint.md) | Specifies additional locations on which to mount a subdirectory of an AppData container. Can only be updated while the VDB is disabled. |  [optional] |
|**appdataConfigParams** | **Map&lt;String, Object&gt;** | The parameters specified by the source config schema in the toolkit |  [optional] |
|**mountPoint** | **String** | Mount point for the VDB (Oracle, ASE, AppData). |  [optional] |
|**currentTimeflowId** | **String** | A reference to the currently active timeflow for this VDB. |  [optional] |
|**previousTimeflowId** | **String** | A reference to the previous timeflow for this VDB. |  [optional] |
|**lastRefreshedDate** | **OffsetDateTime** | The date this VDB was last refreshed. |  [optional] |
|**vdbRestart** | **Boolean** | Indicates whether the Engine should automatically restart this vdb when target host reboot is detected. |  [optional] |
|**isAppdata** | **Boolean** | Indicates whether this VDB has an AppData database. |  [optional] |
|**toolkitId** | **String** | The ID of the toolkit associated with this VDB. |  [optional] |
|**pluginVersion** | **String** | The version of the plugin associated with this VDB. |  [optional] |
|**primaryObjectId** | **String** | The ID of the parent object from which replication was done. |  [optional] |
|**primaryEngineId** | **String** | The ID of the parent engine from which replication was done. |  [optional] |
|**primaryEngineName** | **String** | The name of the parent engine from which replication was done. |  [optional] |
|**replicas** | [**List&lt;Replica&gt;**](Replica.md) | The list of replicas replicated from this object. |  [optional] |




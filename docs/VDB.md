

# VDB

A Delphix virtual database or dataset.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The VDB object entity ID. |  [optional]
**databaseType** | **String** | The database type of this VDB. |  [optional]
**name** | **String** | The container name of this VDB. |  [optional]
**databaseVersion** | **String** | The database version of this VDB. |  [optional]
**size** | **Long** | The total size of this VDB, in bytes. |  [optional]
**storageSize** | **Long** | The actual space used by this VDB, in bytes. |  [optional]
**engineId** | **String** | A reference to the Engine that this VDB belongs to. |  [optional]
**status** | **String** | The runtime status of the VDB. &#39;Unknown&#39; if all attempts to connect to the dataset failed. |  [optional]
**masked** | **Boolean** | The VDB is masked or not. |  [optional]
**contentType** | **String** | The content type of the vdb. |  [optional]
**parentTimeflowTimestamp** | **OffsetDateTime** | The timestamp for parent timeflow. |  [optional]
**parentTimeflowTimezone** | **String** | The timezone for parent timeflow. |  [optional]
**environmentId** | **String** | A reference to the Environment that hosts this VDB. |  [optional]
**ipAddress** | **String** | The IP address of the VDB&#39;s host. |  [optional]
**fqdn** | **String** | The FQDN of the VDB&#39;s host. |  [optional]
**parentId** | **String** | A reference to the parent dataset of this VDB. |  [optional]
**parentDsourceId** | **String** | A reference to the parent dSource of this VDB. |  [optional]
**groupName** | **String** | The name of the group containing this VDB. |  [optional]
**engineName** | **String** | Name of the Engine where this VDB is hosted |  [optional]
**cdbId** | **String** | A reference to the CDB or VCDB associated with this VDB. |  [optional]
**tags** | [**List&lt;Tag&gt;**](Tag.md) |  |  [optional]
**creationDate** | **OffsetDateTime** | The date this VDB was created. |  [optional]
**hooks** | [**VirtualDatasetHooks**](VirtualDatasetHooks.md) |  |  [optional]
**appdataSourceParams** | **Map&lt;String, Object&gt;** | The JSON payload conforming to the DraftV4 schema based on the type of application data being manipulated. |  [optional]
**templateId** | **String** | A reference to the Database Template. |  [optional]
**configParams** | **Map&lt;String, Object&gt;** | Database configuration parameter overrides. |  [optional]
**additionalMountPoints** | [**List&lt;AdditionalMountPoint&gt;**](AdditionalMountPoint.md) | Specifies additional locations on which to mount a subdirectory of an AppData container. Can only be updated while the VDB is disabled. |  [optional]
**appdataConfigParams** | **Map&lt;String, Object&gt;** | The parameters specified by the source config schema in the toolkit |  [optional]
**mountPoint** | **String** | Mount point for the VDB (Oracle, ASE, AppData). |  [optional]
**currentTimeflowId** | **String** | A reference to the currently active timeflow for this VDB. |  [optional]
**previousTimeflowId** | **String** | A reference to the previous timeflow for this VDB. |  [optional]
**lastRefreshedDate** | **OffsetDateTime** | The date this VDB was last refreshed. |  [optional]




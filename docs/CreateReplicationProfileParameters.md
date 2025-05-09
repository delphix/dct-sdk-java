

# CreateReplicationProfileParameters

The parameters to create a ReplicationProfile.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The ReplicationProfile name. |  [optional] |
|**replicationMode** | [**ReplicationModeEnum**](#ReplicationModeEnum) | The ReplicationProfile mode. |  |
|**engineId** | **String** | The ID of the engine that the ReplicationProfile belongs to. |  |
|**targetEngineId** | **String** | The ID of the replication target engine. |  |
|**targetHost** | **String** | Hostname of the replication target engine. If none is provided, the hostname for the engine referenced by target_engine_id will be used. |  [optional] |
|**targetPort** | **Integer** | Target TCP port number for the Delphix Session Protocol. |  [optional] |
|**description** | **String** | The ReplicationProfile description. |  [optional] |
|**schedule** | **String** | Replication schedule in the form of a quartz-formatted string. |  [optional] |
|**tags** | [**List&lt;Tag&gt;**](Tag.md) | The tags that are applied to this ReplicationProfile. |  [optional] |
|**enableTagReplication** | **Boolean** | Indicates whether tag replication from primary object to replica object is enable or disabled for this ReplicationProfile. |  [optional] |
|**bandwidthLimit** | **Integer** | Bandwidth limit (MB/s) for replication network traffic. A value of 0 means no limit. |  [optional] |
|**numberOfConnections** | **Integer** | Total number of transport connections to use. |  [optional] |
|**encrypted** | **Boolean** | Encrypt replication network traffic. |  [optional] |
|**automaticReplication** | **Boolean** | Indication whether the replication spec schedule is enabled or not. |  [optional] |
|**useSystemSocksSetting** | **Boolean** | Connect to the replication target host via the system-wide SOCKS proxy. |  [optional] |
|**vdbIds** | **List&lt;String&gt;** | The VDBs that are replicated by this ReplicationProfile. |  [optional] |
|**dsourceIds** | **List&lt;String&gt;** | The dSources that are replicated by this ReplicationProfile. |  [optional] |
|**cdbIds** | **List&lt;String&gt;** | The CDBs that are replicated by this ReplicationProfile. |  [optional] |
|**vcdbIds** | **List&lt;String&gt;** | The vCDBs that are replicated by this ReplicationProfile. |  [optional] |
|**groupIds** | **List&lt;String&gt;** | The groups that are replicated by this ReplicationProfile. |  [optional] |
|**replicateEntireEngine** | **Boolean** | Whether to replicate the entire engine. This is mutually exclusive with the vdb_ids, dsource_ids, cdb_ids, vcdb_ids, and group_ids properties. |  [optional] |



## Enum: ReplicationModeEnum

| Name | Value |
|---- | -----|
| ENGINE_DATA_REPLICATION | &quot;ENGINE_DATA_REPLICATION&quot; |




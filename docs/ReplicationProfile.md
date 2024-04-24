

# ReplicationProfile

A set of rules that define what data is replicated from a source to a target.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ReplicationProfile ID. |  [optional] |
|**name** | **String** | The ReplicationProfile name. |  [optional] |
|**replicationMode** | [**ReplicationModeEnum**](#ReplicationModeEnum) | The ReplicationProfile mode. |  [optional] |
|**engineId** | **String** | The ID of the engine that the ReplicationProfile belongs to. |  [optional] |
|**targetEngineId** | **String** | The ID of the replication target engine. |  [optional] |
|**targetHost** | **String** | Hostname of the replication target engine. |  [optional] |
|**targetPort** | **Integer** | Target TCP port number for the Delphix Session Protocol. |  [optional] |
|**type** | **String** | The ReplicationProfile type. |  [optional] |
|**description** | **String** | The ReplicationProfile description. |  [optional] |
|**schedule** | **String** | Replication schedule in the form of a quartz-formatted string. |  [optional] |
|**replicationTag** | **String** | Globally unique identifier for this ReplicationProfile. |  [optional] |
|**replicationObjects** | **List&lt;String&gt;** | The objects that are replicated by this ReplicationProfile. |  [optional] |
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
|**dataLayoutIds** | **List&lt;String&gt;** | The data-layouts that are replicated by this ReplicationProfile. |  [optional] [readonly] |



## Enum: ReplicationModeEnum

| Name | Value |
|---- | -----|
| ENGINE_DATA_REPLICATION | &quot;ENGINE_DATA_REPLICATION&quot; |
| MASKED_DATA_DISTRIBUTION | &quot;MASKED_DATA_DISTRIBUTION&quot; |
| CONTINUOUS_VAULT | &quot;CONTINUOUS_VAULT&quot; |




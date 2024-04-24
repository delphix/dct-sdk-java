

# UpdateReplicationProfileParameters

The parameters to update a ReplicationProfile.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The ReplicationProfile name. |  [optional] |
|**description** | **String** | The ReplicationProfile description. |  [optional] |
|**targetEngineId** | **String** | The ID of the replication target engine. |  [optional] |
|**targetHost** | **String** | Hostname of the replication target engine. If none is provided and the target_engine_id is set, the hostname for the engine referenced by target_engine_id will be used. |  [optional] |
|**targetPort** | **Integer** | Target TCP port number for the Delphix Session Protocol. |  [optional] |
|**schedule** | **String** | Replication schedule in the form of a quartz-formatted string. |  [optional] |
|**vdbIds** | **List&lt;String&gt;** | The VDBs that are replicated by this ReplicationProfile. |  [optional] |
|**dsourceIds** | **List&lt;String&gt;** | The dSources that are replicated by this ReplicationProfile. |  [optional] |
|**cdbIds** | **List&lt;String&gt;** | The CDBs that are replicated by this ReplicationProfile. |  [optional] |
|**vcdbIds** | **List&lt;String&gt;** | The vCDBs that are replicated by this ReplicationProfile. |  [optional] |
|**groupIds** | **List&lt;String&gt;** | The groups that are replicated by this ReplicationProfile. |  [optional] |
|**replicateEntireEngine** | **Boolean** | Whether to replicate the entire engine. This is mutually exclusive with the vdb_ids, dsource_ids, cdb_ids, vcdb_ids, and group_ids properties. |  [optional] |
|**bandwidthLimit** | **Integer** | Bandwidth limit (MB/s) for replication network traffic. A value of 0 means no limit. |  [optional] |
|**numberOfConnections** | **Integer** | Total number of transport connections to use. |  [optional] |
|**encrypted** | **Boolean** | Encrypt replication network traffic. |  [optional] |
|**automaticReplication** | **Boolean** | Indication whether the replication spec schedule is enabled or not. |  [optional] |
|**useSystemSocksSetting** | **Boolean** | Connect to the replication target host via the system-wide SOCKS proxy. |  [optional] |




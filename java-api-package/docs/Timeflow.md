

# Timeflow

Virtualization Engine Timeflow of a dSource or VDB.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The Timeflow ID. |  [optional] |
|**engineId** | **String** | The ID of the engine the timeflow belongs to. |  [optional] |
|**namespace** | **String** | Alternate namespace for this object, for replicated and restored timeflows. |  [optional] |
|**namespaceId** | **String** | The namespace id of this timeflows. |  [optional] |
|**namespaceName** | **String** | The namespace name of this timeflows. |  [optional] |
|**isReplica** | **Boolean** | Is this a replicated object. |  [optional] |
|**name** | **String** | The timeflow&#39;s name. |  [optional] |
|**datasetId** | **String** | The ID of the timeflow&#39;s dSource or VDB. |  [optional] |
|**creationType** | [**CreationTypeEnum**](#CreationTypeEnum) | The source action that created the timeflow. |  [optional] |
|**parentSnapshotId** | **String** | The ID of the timeflow&#39;s parent snapshot. |  [optional] |
|**parentPointLocation** | **String** | The location on the parent timeflow from which this timeflow was provisioned. This will not be present for timeflows derived from linked sources. |  [optional] |
|**parentPointTimestamp** | **OffsetDateTime** | The timestamp on the parent timeflow from which this timeflow was provisioned. This will not be present for timeflows derived from linked sources. |  [optional] |
|**parentPointTimeflowId** | **String** | A reference to the parent timeflow from which this timeflow was provisioned. This will not be present for timeflows derived from linked sources. |  [optional] |
|**sourceDataTimestamp** | **OffsetDateTime** | The timestamp on the root ancestor timeflow from which this timeflow originated. This logical time acts as reference to the origin source data. |  [optional] |
|**oracleIncarnationId** | **String** | Oracle-specific incarnation identifier for this timeflow. |  [optional] |
|**oracleCdbTimeflowId** | **String** | A reference to the mirror CDB timeflow if this is a timeflow for a PDB. |  [optional] |
|**oracleTdeUuid** | **String** | The unique identifier for timeflow-specific TDE objects that reside outside of Delphix storage. |  [optional] |
|**mssqlDatabaseGuid** | **String** | MSSQL-specific recovery branch identifier for this timeflow. |  [optional] |
|**isActive** | **Boolean** | Whether this timeflow is currently active or not. |  [optional] |
|**creationTimestamp** | **OffsetDateTime** | The time when the timeflow was created. |  [optional] |
|**activationTimestamp** | **OffsetDateTime** | The time when this timeflow became active. |  [optional] |
|**tags** | [**List&lt;Tag&gt;**](Tag.md) |  |  [optional] |



## Enum: CreationTypeEnum

| Name | Value |
|---- | -----|
| INITIAL | &quot;INITIAL&quot; |
| INDETERMINATE | &quot;INDETERMINATE&quot; |
| REFRESH | &quot;REFRESH&quot; |
| ROLLBACK | &quot;ROLLBACK&quot; |
| TEMPORARY | &quot;TEMPORARY&quot; |
| TRANSFORMATION | &quot;TRANSFORMATION&quot; |
| V2P | &quot;V2P&quot; |
| PDB_PLUG | &quot;PDB_PLUG&quot; |
| ORACLE_LIVE_SOURCE_RESYNC | &quot;ORACLE_LIVE_SOURCE_RESYNC&quot; |
| SOURCE_CONTINUITY | &quot;SOURCE_CONTINUITY&quot; |




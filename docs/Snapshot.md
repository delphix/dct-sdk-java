

# Snapshot

Virtualization Engine Snapshot of a dSource or VDB.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The Snapshot ID. |  [optional]
**engineId** | **String** | The id of the engine the snapshot belongs to. |  [optional]
**namespace** | **String** | Alternate namespace for this object, for replicated and restored snapshots. |  [optional]
**name** | **String** | The snapshot&#39;s name. |  [optional]
**consistency** | [**ConsistencyEnum**](#ConsistencyEnum) | Indicates what type of recovery strategies must be invoked when provisioning from this snapshot. |  [optional]
**missingNonLoggedData** | **Boolean** | Indicates if a virtual database provisioned from this snapshot will be missing nologging changes. |  [optional]
**datasetId** | **String** | The ID of the Snapshot&#39;s dSource or VDB. |  [optional]
**creationTime** | **OffsetDateTime** | The time when the snapshot was created. |  [optional]
**startTimestamp** | **OffsetDateTime** | The timestamp within the parent TimeFlow at which this snapshot was initiated. \\ No recovery earlier than this point needs to be applied in order to provision a database from \\ this snapshot. If start_timestamp equals timestamp, then no recovery needs to be \\ applied in order to provision a database.  |  [optional]
**startLocation** | **String** | The database specific indentifier within the parent TimeFlow at which this snapshot was initiated. \\ No recovery earlier than this point needs to be applied in order to provision a database from \\ this snapshot. If start_location equals location, then no recovery needs to be \\ applied in order to provision a database.  |  [optional]
**timestamp** | **OffsetDateTime** | The logical time of the data contained in this Snapshot. |  [optional]
**location** | **String** | Database specific identifier for the data contained in this Snapshot, such as the Log Sequence Number (LSN) for MSsql databases, System Change Number (SCN) for Oracle databases. |  [optional]
**retention** | **Long** | Retention policy, in days. A value of -1 indicates the snapshot should be kept forever. Deprecated in favor of expiration and retain_forever. |  [optional]
**expiration** | **LocalDate** | The expiration date of this snapshot. If this is unset and retain_forever is false, and the snapshot is not included in a Bookmark, the snapshot is subject to the retention policy of its dataset. |  [optional]
**retainForever** | **Boolean** | Indicates that the snapshot is protected from retention, i.e it will be kept forever. If false, see expiration. |  [optional]
**effectiveExpiration** | **LocalDate** | The effective expiration is that max of the snapshot expiration and the expiration of any Bookmark which includes this snapshot. |  [optional]
**effectiveRetainForever** | **Boolean** | True if retain_forever is set or a Bookmark retains this snapshot forever. |  [optional]
**timeflowId** | **String** | The TimeFlow this snapshot was taken on. |  [optional]
**timezone** | **String** | Time zone of the source database at the time the snapshot was taken. |  [optional]
**version** | **String** | Version of database source repository at the time the snapshot was taken. |  [optional]
**temporary** | **Boolean** | Indicates that this snapshot is in a transient state and should not be user visible. |  [optional]
**appdataToolkit** | **String** | The toolkit associated with this snapshot. |  [optional]
**appdataMetadata** | **String** | The JSON payload conforming to the DraftV4 schema based on the type of application data being manipulated. |  [optional]
**aseDbEncryptionKey** | **String** | Database encryption key present for this snapshot. |  [optional]
**mssqlInternalVersion** | **Integer** | Internal version of the source database at the time the snapshot was taken. |  [optional]
**mssqlBackupSetUuid** | **String** | UUID of the source database backup that was restored for this snapshot. |  [optional]
**mssqlBackupSoftwareType** | [**MssqlBackupSoftwareTypeEnum**](#MssqlBackupSoftwareTypeEnum) | Backup software used to restore the source database backup for this snapshot |  [optional]
**mssqlBackupLocationType** | [**MssqlBackupLocationTypeEnum**](#MssqlBackupLocationTypeEnum) | Backup software used to restore the source database backup for this snapshot |  [optional]
**mssqlEmptySnapshot** | **Boolean** | True if the staging push dSource snapshot is empty. |  [optional]
**oracleFromPhysicalStandbyVdb** | **Boolean** | True if this snapshot was taken of a standby database. |  [optional]
**oracleRedoLogSizeInBytes** | **Long** | Online redo log size in bytes when this snapshot was taken. |  [optional]
**tags** | [**List&lt;Tag&gt;**](Tag.md) |  |  [optional]



## Enum: ConsistencyEnum

Name | Value
---- | -----
CONSISTENT | &quot;CONSISTENT&quot;
INCONSISTENT | &quot;INCONSISTENT&quot;
CRASH_CONSISTENT | &quot;CRASH_CONSISTENT&quot;
PLUGGABLE | &quot;PLUGGABLE&quot;



## Enum: MssqlBackupSoftwareTypeEnum

Name | Value
---- | -----
AZURE_NATIVE | &quot;AZURE_NATIVE&quot;
NATIVE | &quot;NATIVE&quot;
LITESPEED | &quot;LITESPEED&quot;
REDGATE | &quot;REDGATE&quot;
NETBACKUP | &quot;NETBACKUP&quot;
COMMVAULT | &quot;COMMVAULT&quot;



## Enum: MssqlBackupLocationTypeEnum

Name | Value
---- | -----
DISK | &quot;DISK&quot;
AZURE | &quot;AZURE&quot;
BACKUP_SERVER | &quot;BACKUP_SERVER&quot;




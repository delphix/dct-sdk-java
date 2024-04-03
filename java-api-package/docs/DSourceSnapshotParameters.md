

# DSourceSnapshotParameters

Parameters to snapshot a DSource.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dropAndRecreateDevices** | **Boolean** | If this parameter is set to true, older devices will be dropped and new devices created instead of trying to remap the devices. This might increase the space utilization on Delphix Engine. (ASE only)  |  [optional] |
|**syncStrategy** | [**SyncStrategyEnum**](#SyncStrategyEnum) | Determines how the Delphix Engine will take a backup: * &#x60;latest_backup&#x60; - Use the most recent backup. * &#x60;new_backup&#x60; - Delphix will take a new backup of your source database. * &#x60;specific_backup&#x60; - Use a specific backup. Using this option requires setting   &#x60;ase_backup_files&#x60; for ASE dSources or &#x60;mssql_backup_uuid&#x60; for MSSql dSources. Default is &#x60;new_backup&#x60;. (ASE, MSSql only)  |  [optional] |
|**aseBackupFiles** | **List&lt;String&gt;** | When using the &#x60;specific_backup&#x60; sync_strategy, determines the backup files. (ASE Only) |  [optional] |
|**mssqlBackupUuid** | **String** | When using the &#x60;specific_backup&#x60; sync_strategy, determines the Backup Set UUID. (MSSql only) |  [optional] |
|**compressionEnabled** | **Boolean** | When using the &#x60;new_backup&#x60; sync_strategy, determines if compression must be enabled. Defaults to the configuration of the ingestion strategy configured on the Delphix Engine for this dSource. (MSSql only) |  [optional] |
|**availabilityGroupBackupPolicy** | [**AvailabilityGroupBackupPolicyEnum**](#AvailabilityGroupBackupPolicyEnum) | When using the &#x60;new_backup&#x60; sync_strategy for an MSSql Availability Group, determines the backup policy: * &#x60;primary&#x60; - Backups only go to the primary node. * &#x60;secondary_only&#x60; - Backups only go to secondary nodes. If secondary nodes are down, backups will fail. * &#x60;prefer_secondary&#x60; - Backups go to secondary nodes, but if secondary nodes are down, backups will go to the primary node. (MSSql only)  |  [optional] |
|**doNotResume** | **Boolean** | Indicates whether a fresh SnapSync must be started regardless if it was possible to resume the current SnapSync. If true, we will not resume but instead ignore previous progress and backup all datafiles even if already completed from previous failed SnapSync. This does not force a full backup, if an incremental was in progress this will start a new incremental snapshot. (Oracle only)  |  [optional] |
|**doubleSync** | **Boolean** | Indicates whether two SnapSyncs should be performed in immediate succession to reduce the number of logs required to provision the snapshot. This may significantly reduce the time necessary to provision from a snapshot. (Oracle only).  |  [optional] |
|**forceFullBackup** | **Boolean** | Whether or not to take another full backup of the source database. (Oracle only) |  [optional] |
|**skipSpaceCheck** | **Boolean** | Skip check that tests if there is enough space available to store the database in the Delphix Engine. The Delphix Engine estimates how much space a database will occupy after compression and prevents SnapSync if insufficient space is available. This safeguard can be overridden using this option. This may be useful when linking highly compressible databases. (Oracle only)  |  [optional] |
|**filesForPartialFullBackup** | **List&lt;Long&gt;** | List of datafiles to take a full backup of. This would be useful in situations where certain datafiles could not be backed up during previous SnapSync due to corruption or because they went offline. (Oracle only)  |  [optional] |
|**appdataParameters** | **Map&lt;String, Object&gt;** | The list of parameters specified by the snapshotParametersDefinition schema in the toolkit (AppData only). |  [optional] |



## Enum: SyncStrategyEnum

| Name | Value |
|---- | -----|
| LATEST_BACKUP | &quot;latest_backup&quot; |
| NEW_BACKUP | &quot;new_backup&quot; |
| SPECIFIC_BACKUP | &quot;specific_backup&quot; |



## Enum: AvailabilityGroupBackupPolicyEnum

| Name | Value |
|---- | -----|
| PRIMARY | &quot;primary&quot; |
| SECONDARY_ONLY | &quot;secondary_only&quot; |
| PREFER_SECONDARY | &quot;prefer_secondary&quot; |




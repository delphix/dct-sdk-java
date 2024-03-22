

# ASEDSourceLinkSourceParameters


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the dSource to be created. |  [optional]
**sourceId** | **String** | Id of the source to link. | 
**groupId** | **String** | Id of the dataset group where this dSource should belong to. |  [optional]
**description** | **String** | The notes/description for the dSource. |  [optional]
**logSyncEnabled** | **Boolean** | True if LogSync should run for this database. |  [optional]
**externalFilePath** | **String** | External file path. |  [optional]
**makeCurrentAccountOwner** | **Boolean** | Whether the account creating this reporting schedule must be configured as owner of the reporting schedule. |  [optional]
**tags** | [**List&lt;Tag&gt;**](Tag.md) | The tags to be created for dSource. |  [optional]
**opsPreSync** | [**List&lt;SourceOperation&gt;**](SourceOperation.md) | Operations to perform before syncing the created dSource. These operations can quiesce any data prior to syncing. |  [optional]
**opsPostSync** | [**List&lt;SourceOperation&gt;**](SourceOperation.md) | Operations to perform after syncing a created dSource. |  [optional]
**mountBase** | **String** | The base mount point to use for the NFS mounts. |  [optional]
**loadBackupPath** | **String** | Source database backup location. | 
**backupServerName** | **String** | Name of the backup server instance. |  [optional]
**backupHostUser** | **String** | OS user for the host where the backup server is located. |  [optional]
**backupHost** | **String** | Host environment where the backup server is located. |  [optional]
**dumpCredentials** | **String** | The password credential for the source DB user. |  [optional]
**sourceHostUser** | **String** | ID or user reference of the host OS user to use for linking. |  [optional]
**dbUser** | **String** | The user name for the source DB user. |  [optional]
**dbPassword** | **String** | Password for the database user. |  [optional]
**dbVault** | **String** | The name or reference of the vault from which to read the database credentials. |  [optional]
**dbHashicorpVaultEngine** | **String** | Vault engine name where the credential is stored. |  [optional]
**dbHashicorpVaultSecretPath** | **String** | Path in the vault engine where the credential is stored. |  [optional]
**dbHashicorpVaultUsernameKey** | **String** | Hashicorp vault key for the username in the key-value store. |  [optional]
**dbHashicorpVaultSecretKey** | **String** | Hashicorp vault key for the password in the key-value store. |  [optional]
**dbAzureVaultName** | **String** | Azure key vault name. |  [optional]
**dbAzureVaultUsernameKey** | **String** | Azure vault key for the username in the key-value store. |  [optional]
**dbAzureVaultSecretKey** | **String** | Azure vault key for the password in the key-value store. |  [optional]
**dbCyberarkVaultQueryString** | **String** | Query to find a credential in the CyberArk vault. |  [optional]
**stagingRepository** | **String** | The SAP ASE instance on the staging environment that we want to use for validated sync. |  [optional]
**stagingHostUser** | **String** | Information about the host OS user on the staging environment to use for linking. |  [optional]
**validatedSyncMode** | [**ValidatedSyncModeEnum**](#ValidatedSyncModeEnum) | Information about the host OS user on the staging environment to use for linking. |  [optional]
**dumpHistoryFileEnabled** | **Boolean** | Specifies if Dump History File is enabled for backup history detection. |  [optional]
**dropAndRecreateDevices** | **Boolean** | If this parameter is set to true, it will drop the older devices and create new devices during manual sync operations instead of trying to remap the devices. This might increase the space utilization on Delphix Engine. |  [optional]
**syncStrategy** | [**SyncStrategyEnum**](#SyncStrategyEnum) | Determines how the Delphix Engine will take a backup: * &#x60;latest_backup&#x60; - Use the most recent backup. * &#x60;new_backup&#x60; - Delphix will take a new backup of your source database. * &#x60;specific_backup&#x60; - Use a specific backup. Using this option requires setting &#x60;ase_backup_files&#x60;. Default is &#x60;new_backup&#x60;.  |  [optional]
**aseBackupFiles** | **List&lt;String&gt;** | The location of the full backup of the source database to restore from. The backup should be present in the shared backup location for the source database. |  [optional]
**preValidatedSync** | [**List&lt;SourceOperation&gt;**](SourceOperation.md) | Operations to perform on the staging source before performing a validated sync. |  [optional]
**postValidatedSync** | [**List&lt;SourceOperation&gt;**](SourceOperation.md) | Operations to perform on the staging source after performing a validated sync. |  [optional]



## Enum: ValidatedSyncModeEnum

Name | Value
---- | -----
ENABLED | &quot;ENABLED&quot;
DISABLED | &quot;DISABLED&quot;



## Enum: SyncStrategyEnum

Name | Value
---- | -----
LATEST_BACKUP | &quot;latest_backup&quot;
NEW_BACKUP | &quot;new_backup&quot;
SPECIFIC_BACKUP | &quot;specific_backup&quot;




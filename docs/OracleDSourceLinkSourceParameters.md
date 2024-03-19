

# OracleDSourceLinkSourceParameters


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
**environmentUserId** | **String** | Id of the environment user to use for linking. |  [optional]
**backupLevelEnabled** | **Boolean** | Boolean value indicates whether LEVEL-based incremental backups can be used on the source database. |  [optional]
**rmanChannels** | **Integer** | Number of parallel channels to use. |  [optional]
**filesPerSet** | **Integer** | Number of data files to include in each RMAN backup set. |  [optional]
**checkLogical** | **Boolean** | True if extended block checking should be used for this linked database. |  [optional]
**encryptedLinkingEnabled** | **Boolean** | True if SnapSync data from the source should be retrieved through an encrypted connection. Enabling this feature can decrease the performance of SnapSync from the source but has no impact on the performance of VDBs created from the retrieved data. |  [optional]
**compressedLinkingEnabled** | **Boolean** | True if SnapSync data from the source should be compressed over the network. Enabling this feature will reduce network bandwidth consumption and may significantly improve throughput, especially over slow network. |  [optional]
**bandwidthLimit** | **Integer** | Bandwidth limit (MB/s) for SnapSync and LogSync network traffic. A value of 0 means no limit. |  [optional]
**numberOfConnections** | **Integer** | Total number of transport connections to use during SnapSync. |  [optional]
**diagnoseNoLoggingFaults** | **Boolean** | If true, NOLOGGING operations on this container are treated as faults and cannot be resolved manually. |  [optional]
**preProvisioningEnabled** | **Boolean** | If true, pre-provisioning will be performed after every sync. |  [optional]
**linkNow** | **Boolean** | True if initial load should be done immediately. |  [optional]
**forceFullBackup** | **Boolean** | Whether or not to take another full backup of the source database. |  [optional]
**doubleSync** | **Boolean** | True if two SnapSyncs should be performed in immediate succession to reduce the number of logs required to provision the snapshot. This may significantly reduce the time necessary to provision from a snapshot. |  [optional]
**skipSpaceCheck** | **Boolean** | Skip check that tests if there is enough space available to store the database in the Delphix Engine. The Delphix Engine estimates how much space a database will occupy after compression and prevents SnapSync if insufficient space is available. This safeguard can be overridden using this option. This may be useful when linking highly compressible databases. |  [optional]
**doNotResume** | **Boolean** | Indicates whether a fresh SnapSync must be started regardless if it was possible to resume the current SnapSync. If true, we will not resume but instead ignore previous progress and backup all datafiles even if already completed from previous failed SnapSync. This does not force a full backup, if an incremental was in progress this will start a new incremental snapshot. |  [optional]
**filesForFullBackup** | **List&lt;Integer&gt;** | List of datafiles to take a full backup of. This would be useful in situations where certain datafiles could not be backed up during previous SnapSync due to corruption or because they went offline. |  [optional]
**logSyncMode** | [**LogSyncModeEnum**](#LogSyncModeEnum) | LogSync operation mode for this database. |  [optional]
**logSyncInterval** | **Integer** | Interval between LogSync requests, in seconds. |  [optional]
**nonSysUsername** | **String** | Non-SYS database user to access this database. Only required for username-password auth (Single tenant only). |  [optional]
**nonSysPassword** | **String** | Password for non sys user authentication (Single tenant only). |  [optional]
**nonSysVault** | **String** | The name or reference of the vault from which to read the database credentials (Single tenant only). |  [optional]
**nonSysHashicorpVaultEngine** | **String** | Vault engine name where the credential is stored (Single tenant only). |  [optional]
**nonSysHashicorpVaultSecretPath** | **String** | Path in the vault engine where the credential is stored (Single tenant only). |  [optional]
**nonSysHashicorpVaultUsernameKey** | **String** | Hashicorp vault key for the username in the key-value store (Single tenant only). |  [optional]
**nonSysHashicorpVaultSecretKey** | **String** | Hashicorp vault key for the password in the key-value store (Single tenant only). |  [optional]
**nonSysAzureVaultName** | **String** | Azure key vault name (Single tenant only). |  [optional]
**nonSysAzureVaultUsernameKey** | **String** | Azure vault key for the username in the key-value store (Single tenant only). |  [optional]
**nonSysAzureVaultSecretKey** | **String** | Azure vault key for the password in the key-value store (Single tenant only). |  [optional]
**nonSysCyberarkVaultQueryString** | **String** | Query to find a credential in the CyberArk vault (Single tenant only). |  [optional]
**fallbackUsername** | **String** | The database fallback username. Optional if bequeath connections are enabled (to be used in case of bequeath connection failures). Only required for username-password auth. |  [optional]
**fallbackPassword** | **String** | Password for fallback username. |  [optional]
**fallbackVault** | **String** | The name or reference of the vault from which to read the database credentials. |  [optional]
**fallbackHashicorpVaultEngine** | **String** | Vault engine name where the credential is stored. |  [optional]
**fallbackHashicorpVaultSecretPath** | **String** | Path in the vault engine where the credential is stored. |  [optional]
**fallbackHashicorpVaultUsernameKey** | **String** | Hashicorp vault key for the username in the key-value store. |  [optional]
**fallbackHashicorpVaultSecretKey** | **String** | Hashicorp vault key for the password in the key-value store. |  [optional]
**fallbackAzureVaultName** | **String** | Azure key vault name. |  [optional]
**fallbackAzureVaultUsernameKey** | **String** | Azure vault key for the username in the key-value store. |  [optional]
**fallbackAzureVaultSecretKey** | **String** | Azure vault key for the password in the key-value store. |  [optional]
**fallbackCyberarkVaultQueryString** | **String** | Query to find a credential in the CyberArk vault. |  [optional]
**opsPreLogSync** | [**List&lt;SourceOperation&gt;**](SourceOperation.md) | Operations to perform after syncing a created dSource and before running the LogSync. |  [optional]



## Enum: LogSyncModeEnum

Name | Value
---- | -----
ARCHIVE_ONLY_MODE | &quot;ARCHIVE_ONLY_MODE&quot;
ARCHIVE_REDO_MODE | &quot;ARCHIVE_REDO_MODE&quot;
UNDEFINED | &quot;UNDEFINED&quot;




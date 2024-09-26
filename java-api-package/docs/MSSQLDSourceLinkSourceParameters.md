

# MSSQLDSourceLinkSourceParameters


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the dSource to be created. |  [optional] |
|**sourceId** | **String** | Id of the source to link. |  |
|**groupId** | **String** | Id of the dataset group where this dSource should belong to. |  [optional] |
|**description** | **String** | The notes/description for the dSource. |  [optional] |
|**logSyncEnabled** | **Boolean** | True if LogSync should run for this database. |  [optional] |
|**syncPolicyId** | **String** | The ID of the SnapSync policy for the dSource. |  [optional] |
|**retentionPolicyId** | **String** | The ID of the Retention policy for the dSource. |  [optional] |
|**makeCurrentAccountOwner** | **Boolean** | Whether the account creating this reporting schedule must be configured as owner of the reporting schedule. |  [optional] |
|**tags** | [**List&lt;Tag&gt;**](Tag.md) | The tags to be created for dSource. |  [optional] |
|**opsPreSync** | [**List&lt;SourceOperation&gt;**](SourceOperation.md) | Operations to perform before syncing the created dSource. These operations can quiesce any data prior to syncing. |  [optional] |
|**opsPostSync** | [**List&lt;SourceOperation&gt;**](SourceOperation.md) | Operations to perform after syncing a created dSource. |  [optional] |
|**encryptionKey** | **String** | The encryption key to use when restoring encrypted backups. |  [optional] |
|**syncStrategy** | [**SyncStrategyEnum**](#SyncStrategyEnum) | Determines how the Delphix Engine will take a backup: * &#x60;latest_backup&#x60; - Use the most recent backup. * &#x60;new_backup&#x60; - Delphix will take a new backup of your source database. * &#x60;specific_backup&#x60; - Use a specific backup. Using this option requires setting &#x60;ase_backup_files&#x60;. * &#x60;no_backup&#x60; - Use as input to sync MSSQL databases without a backup. Default is &#x60;new_backup&#x60;.  |  [optional] |
|**mssqlBackupUuid** | **String** | When using the &#x60;specific_backup&#x60; sync_strategy, determines the Backup Set UUID. |  [optional] |
|**compressionEnabled** | **Boolean** | When using the &#x60;new_backup&#x60; sync_strategy, determines if compression must be enabled. Defaults to the configuration of the ingestion strategy configured on the Delphix Engine for this dSource. |  [optional] |
|**availabilityGroupBackupPolicy** | [**AvailabilityGroupBackupPolicyEnum**](#AvailabilityGroupBackupPolicyEnum) | When using the &#x60;new_backup&#x60; sync_strategy for an MSSql Availability Group, determines the backup policy: * &#x60;primary&#x60; - Backups only go to the primary node. * &#x60;secondary_only&#x60; - Backups only go to secondary nodes. If secondary nodes are down, backups will fail. * &#x60;prefer_secondary&#x60; - Backups go to secondary nodes, but if secondary nodes are down, backups will go to the primary node.  |  [optional] |
|**sourceHostUser** | **String** | ID or user reference of the host OS user to use for linking. |  [optional] |
|**pptRepository** | **String** | Reference of the SQL instance on the PPT environment that we want to use for pre-provisioning. |  [optional] |
|**pptHostUser** | **String** | Reference of the host OS user on the PPT host to use for linking. |  [optional] |
|**stagingPreScript** | **String** | A user-provided PowerShell script or executable to run prior to restoring from a backup during pre-provisioning. |  [optional] |
|**stagingPostScript** | **String** | A user-provided PowerShell script or executable to run after restoring from a backup during pre-provisioning. |  [optional] |
|**syncStrategyManagedType** | [**SyncStrategyManagedTypeEnum**](#SyncStrategyManagedTypeEnum) | MSSQL specific parameters for source based sync strategy.: * &#x60;external&#x60; - MSSQL specific parameters for externally managed source based sync strategy. * &#x60;delphix&#x60; - MSSQL specific parameters for delphix managed source based sync strategy. * &#x60;staging_push&#x60; - MSSQL specific parameters for staging push based sync strategy.  |  [optional] |
|**mssqlUserEnvironmentReference** | **String** | Reference to the source environment user to use for linking. |  [optional] |
|**mssqlUserDomainUsername** | **String** | The username for the source DB user. |  [optional] |
|**mssqlUserDomainPassword** | **String** | Password for the database user. |  [optional] |
|**mssqlUserDomainVaultUsername** | **String** | Delphix display name for the vault user. |  [optional] |
|**mssqlUserDomainVault** | **String** | The name or reference of the vault from which to read the database credentials. |  [optional] |
|**mssqlUserDomainHashicorpVaultEngine** | **String** | Vault engine name where the credential is stored. |  [optional] |
|**mssqlUserDomainHashicorpVaultSecretPath** | **String** | Path in the vault engine where the credential is stored. |  [optional] |
|**mssqlUserDomainHashicorpVaultUsernameKey** | **String** | Hashicorp vault key for the username in the key-value store. |  [optional] |
|**mssqlUserDomainHashicorpVaultSecretKey** | **String** | Hashicorp vault key for the password in the key-value store. |  [optional] |
|**mssqlUserDomainAzureVaultName** | **String** | Azure key vault name. |  [optional] |
|**mssqlUserDomainAzureVaultUsernameKey** | **String** | Azure vault key for the username in the key-value store. |  [optional] |
|**mssqlUserDomainAzureVaultSecretKey** | **String** | Azure vault key for the password in the key-value store. |  [optional] |
|**mssqlUserDomainCyberarkVaultQueryString** | **String** | Query to find a credential in the CyberArk vault. |  [optional] |
|**mssqlDatabaseUsername** | **String** | The username for the source DB user. |  [optional] |
|**mssqlDatabasePassword** | **String** | Password for the database user. |  [optional] |
|**delphixManagedBackupCompressionEnabled** | **Boolean** | Specify whether the backups taken should be compressed or uncompressed when Delphix managed option is selected. |  [optional] |
|**delphixManagedBackupPolicy** | [**DelphixManagedBackupPolicyEnum**](#DelphixManagedBackupPolicyEnum) | Specify which node of an availability group to run the copy-only full backup on: * &#x60;primary&#x60; - Backups only go to the primary node. * &#x60;secondary_only&#x60; - Backups only go to secondary nodes. If secondary nodes are down, backups will fail. * &#x60;prefer_secondary&#x60; - Backups go to secondary nodes, but if secondary nodes are down, backups will go to the primary node.  |  [optional] |
|**externalManagedValidateSyncMode** | [**ExternalManagedValidateSyncModeEnum**](#ExternalManagedValidateSyncModeEnum) | Specifies the backup types ValidatedSync will use to synchronize the dSource with the source database |  [optional] |
|**externalManagedSharedBackupLocations** | **List&lt;String&gt;** | Shared source database backup locations. |  [optional] |
|**externalNetbackupConfigMasterName** | **String** | The master server name of this NetBackup configuration. |  [optional] |
|**externalNetbackupConfigSourceClientName** | **String** | The source&#39;s client server name of this NetBackup configuration. |  [optional] |
|**externalNetbackupConfigParams** | **Map&lt;String, Object&gt;** | NetBackup configuration parameter overrides. |  [optional] |
|**externalNetbackupConfigTemplates** | **String** | Optional config template selection for NetBackup configurations. If set, external_netbackup_config_params will be ignored. |  [optional] |
|**externalCommserveHostName** | **String** | The commserve host name of this Commvault configuration. |  [optional] |
|**externalCommvaultConfigSourceClientName** | **String** | The source client name of this Commvault configuration. |  [optional] |
|**externalCommvaultConfigStagingClientName** | **String** | The staging client name of this Commvault configuration. |  [optional] |
|**externalCommvaultConfigParams** | **Map&lt;String, Object&gt;** | Commvault configuration parameter overrides. |  [optional] |
|**externalCommvaultConfigTemplates** | **String** | Optional config template selection for Commvault configurations. If set, configParams will be ignored. |  [optional] |



## Enum: SyncStrategyEnum

| Name | Value |
|---- | -----|
| LATEST_BACKUP | &quot;latest_backup&quot; |
| NEW_BACKUP | &quot;new_backup&quot; |
| SPECIFIC_BACKUP | &quot;specific_backup&quot; |
| NO_BACKUP | &quot;no_backup&quot; |



## Enum: AvailabilityGroupBackupPolicyEnum

| Name | Value |
|---- | -----|
| PRIMARY | &quot;primary&quot; |
| SECONDARY_ONLY | &quot;secondary_only&quot; |
| PREFER_SECONDARY | &quot;prefer_secondary&quot; |



## Enum: SyncStrategyManagedTypeEnum

| Name | Value |
|---- | -----|
| EXTERNAL | &quot;external&quot; |
| DELPHIX | &quot;delphix&quot; |
| STAGING_PUSH | &quot;staging_push&quot; |



## Enum: DelphixManagedBackupPolicyEnum

| Name | Value |
|---- | -----|
| PRIMARY | &quot;primary&quot; |
| SECONDARY_ONLY | &quot;secondary_only&quot; |
| PREFER_SECONDARY | &quot;prefer_secondary&quot; |



## Enum: ExternalManagedValidateSyncModeEnum

| Name | Value |
|---- | -----|
| TRANSACTION_LOG | &quot;TRANSACTION_LOG&quot; |
| FULL_OR_DIFFERENTIAL | &quot;FULL_OR_DIFFERENTIAL&quot; |
| FULL | &quot;FULL&quot; |
| NONE | &quot;NONE&quot; |




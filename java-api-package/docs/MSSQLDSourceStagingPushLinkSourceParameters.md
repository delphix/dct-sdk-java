

# MSSQLDSourceStagingPushLinkSourceParameters


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the dSource to be created. |  |
|**sourceId** | **String** | Id of the source to link. |  [optional] |
|**groupId** | **String** | Id of the dataset group where this dSource should belong to. |  [optional] |
|**description** | **String** | The notes/description for the dSource. |  [optional] |
|**logSyncEnabled** | **Boolean** | True if LogSync should run for this database. |  [optional] |
|**syncPolicyId** | **String** | The ID of the SnapSync policy for the dSource. |  [optional] |
|**retentionPolicyId** | **String** | The ID of the Retention policy for the dSource. |  [optional] |
|**makeCurrentAccountOwner** | **Boolean** | Whether the account creating this reporting schedule must be configured as owner of the reporting schedule. |  [optional] |
|**tags** | [**List&lt;Tag&gt;**](Tag.md) | The tags to be created for dSource. |  [optional] |
|**opsPreSync** | [**List&lt;SourceOperation&gt;**](SourceOperation.md) | Operations to perform before syncing the created dSource. These operations can quiesce any data prior to syncing. |  [optional] |
|**opsPostSync** | [**List&lt;SourceOperation&gt;**](SourceOperation.md) | Operations to perform after syncing a created dSource. |  [optional] |
|**engineId** | **String** | The ID of the engine to link staging push database on. |  |
|**encryptionKey** | **String** | The encryption key to use when restoring encrypted backups. |  [optional] |
|**pptRepository** | **String** | Reference of the SQL instance on the PPT environment that we want to use for pre-provisioning. |  |
|**pptHostUser** | **String** | Reference of the host OS user on the PPT host to use for linking. |  |
|**stagingPreScript** | **String** | A user-provided PowerShell script or executable to run prior to restoring from a backup during pre-provisioning. |  [optional] |
|**stagingPostScript** | **String** | A user-provided PowerShell script or executable to run after restoring from a backup during pre-provisioning. |  [optional] |
|**stagingDatabaseName** | **String** | The name of the database to create on the staging environment. This property is mutually exclusive to sync_strategy_managed_type |  |




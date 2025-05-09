

# OracleStagingPushDSourceLinkSourceParameters


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the dSource to be created. |  [optional] |
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
|**containerType** | [**ContainerTypeEnum**](#ContainerTypeEnum) | The container type of this database.If not provided the request would be considered as a PDB database. |  [optional] |
|**environmentUserId** | **String** | Id of the environment user to use for linking. |  [optional] |
|**repository** | **String** | The repository reference to link. |  [optional] |
|**databaseName** | **String** | The name of the database. |  |
|**databaseUniqueName** | **String** | The unique name of the database. |  [optional] |
|**sid** | **String** | The name (sid) of the instance. |  [optional] |
|**mountBase** | **String** | The base mount point to use for the NFS mounts. |  [optional] |
|**customEnvVariablesPairs** | [**List&lt;NameValuePair&gt;**](NameValuePair.md) | An array of name value pair of environment variables. |  [optional] |
|**customEnvVariablesPaths** | **List&lt;String&gt;** | An array of strings of whitespace-separated parameters to be passed to the source command. The first parameter must be an absolute path to a file that exists on the target environment. Every subsequent parameter will be treated as an argument interpreted by the environment file. |  [optional] |
|**autoStagingRestart** | **Boolean** | Boolean value indicates whether this staging database should automatically be restarted when staging host reboot is detected. |  [optional] |
|**physicalStandby** | **Boolean** | Boolean value indicates whether this staging database will be configured as a physical standby. |  [optional] |
|**validateSnapshotInReadonly** | **Boolean** | Boolean value indicates whether this staging database snapshot will be validated by opening it in read-only. |  [optional] |
|**stagingDatabaseTemplates** | [**List&lt;NameValuePair&gt;**](NameValuePair.md) | An array of name value pair of Oracle database configuration parameter overrides. This property is deprecated. Use staging_database_config_params instead. |  [optional] |
|**stagingDatabaseConfigParams** | **Map&lt;String, String&gt;** | Oracle database configuration parameter overrides. If both staging_database_templates and staging_database_config_params are specified, staging_database_config_params will be used. |  [optional] |
|**stagingContainerDatabaseReference** | **String** | Reference of the CDB source config. |  [optional] |
|**opsPreLogSync** | [**List&lt;SourceOperation&gt;**](SourceOperation.md) | Operations to perform after syncing a created dSource and before running the LogSync. |  [optional] |
|**tdeKeystoreConfigType** | [**TdeKeystoreConfigTypeEnum**](#TdeKeystoreConfigTypeEnum) | The type of TDE keystore configuration to use for the staging database. |  [optional] |



## Enum: ContainerTypeEnum

| Name | Value |
|---- | -----|
| ROOT_CDB | &quot;ROOT_CDB&quot; |
| NON_CDB | &quot;NON_CDB&quot; |



## Enum: TdeKeystoreConfigTypeEnum

| Name | Value |
|---- | -----|
| FILE | &quot;FILE&quot; |
| OKV | &quot;OKV&quot; |
| HSM | &quot;HSM&quot; |




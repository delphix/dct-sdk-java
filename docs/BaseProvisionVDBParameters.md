

# BaseProvisionVDBParameters


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**preRefresh** | [**List&lt;Hook&gt;**](Hook.md) | The commands to execute on the target environment before refreshing the VDB. |  [optional]
**postRefresh** | [**List&lt;Hook&gt;**](Hook.md) | The commands to execute on the target environment after refreshing the VDB. |  [optional]
**preSelfRefresh** | [**List&lt;Hook&gt;**](Hook.md) | The commands to execute on the target environment before refreshing the VDB with data from itself. |  [optional]
**postSelfRefresh** | [**List&lt;Hook&gt;**](Hook.md) | The commands to execute on the target environment after refreshing the VDB with data from itself. |  [optional]
**preRollback** | [**List&lt;Hook&gt;**](Hook.md) | The commands to execute on the target environment before rewinding the VDB. |  [optional]
**postRollback** | [**List&lt;Hook&gt;**](Hook.md) | The commands to execute on the target environment after rewinding the VDB. |  [optional]
**configureClone** | [**List&lt;Hook&gt;**](Hook.md) | The commands to execute on the target environment when the VDB is created or refreshed. |  [optional]
**preSnapshot** | [**List&lt;Hook&gt;**](Hook.md) | The commands to execute on the target environment before snapshotting a virtual source. These commands can quiesce any data prior to snapshotting. |  [optional]
**postSnapshot** | [**List&lt;Hook&gt;**](Hook.md) | The commands to execute on the target environment after snapshotting a virtual source. |  [optional]
**preStart** | [**List&lt;Hook&gt;**](Hook.md) | The commands to execute on the target environment before starting a virtual source. |  [optional]
**postStart** | [**List&lt;Hook&gt;**](Hook.md) | The commands to execute on the target environment after starting a virtual source. |  [optional]
**preStop** | [**List&lt;Hook&gt;**](Hook.md) | The commands to execute on the target environment before stopping a virtual source. |  [optional]
**postStop** | [**List&lt;Hook&gt;**](Hook.md) | The commands to execute on the target environment after stopping a virtual source. |  [optional]
**targetGroupId** | **String** | The ID of the group into which the VDB will be provisioned. If unset, a group is selected randomly on the Engine. |  [optional]
**name** | **String** | The unique name of the provisioned VDB within a group. If unset, a name is randomly generated. |  [optional]
**databaseName** | **String** | The name of the database on the target environment. Defaults to the value of the name property. |  [optional]
**cdbId** | **String** | The ID of the container database (CDB) to provision an Oracle Multitenant database into. This corresponds to a CDB or VCDB API object. When this is not set, a new vCDB will be provisioned. |  [optional]
**clusterNodeIds** | **List&lt;String&gt;** | The cluster node ids, name or addresses for this provision operation (Oracle RAC Only). |  [optional]
**truncateLogOnCheckpoint** | **Boolean** | Whether to truncate log on checkpoint (ASE only). |  [optional]
**osUsername** | **String** | The name of the privileged user to run the provision operation (Oracle Only). |  [optional]
**osPassword** | **String** | The password of the privileged user to run the provision operation (Oracle Only). |  [optional]
**environmentId** | **String** | The ID of the target environment where to provision the VDB. If repository_id unambigously identifies a repository, this is unnecessary and ignored. Otherwise, a compatible repository is randomly selected on the environment. |  [optional]
**environmentUserId** | **String** | The environment user ID to use to connect to the target environment. |  [optional]
**repositoryId** | **String** | The ID of the target repository where to provision the VDB. A repository typically corresponds to a database installation (Oracle home, database instance, ...). Setting this attribute implicitly determines the environment where to provision the VDB. |  [optional]
**autoSelectRepository** | **Boolean** | Option to automatically select a compatible environment and repository. Mutually exclusive with repository_id. |  [optional]
**vdbRestart** | **Boolean** | Indicates whether the Engine should automatically restart this virtual source when target host reboot is detected. |  [optional]
**templateId** | **String** | The ID of the target VDB Template (Oracle Only). |  [optional]
**auxiliaryTemplateId** | **String** | The ID of the configuration template to apply to the auxiliary container database. This is only relevant when provisioning a Multitenant pluggable database into an existing CDB, i.e when the cdb_id property is set.(Oracle Only) |  [optional]
**fileMappingRules** | **String** | Target VDB file mapping rules (Oracle Only). Rules must be line separated (\\n or \\r) and each line must have the format \&quot;pattern:replacement\&quot;. Lines are applied in order. |  [optional]
**oracleInstanceName** | **String** | Target VDB SID name (Oracle Only). |  [optional]
**uniqueName** | **String** | Target VDB db_unique_name (Oracle Only). |  [optional]
**vcdbName** | **String** | When provisioning an Oracle Multitenant vCDB (when the cdb_id property is not set), the name of the provisioned vCDB (Oracle Multitenant Only). |  [optional]
**vcdbDatabaseName** | **String** | When provisioning an Oracle Multitenant vCDB (when the cdb_id property is not set), the database name of the provisioned vCDB. Defaults to the value of the vcdb_name property. (Oracle Multitenant Only). |  [optional]
**mountPoint** | **String** | Mount point for the VDB (Oracle, ASE, AppData). |  [optional]
**openResetLogs** | **Boolean** | Whether to open the database after provision (Oracle Only). |  [optional]
**snapshotPolicyId** | **String** | The ID of the snapshot policy for the VDB. |  [optional]
**retentionPolicyId** | **String** | The ID of the retention policy for the VDB. |  [optional]
**recoveryModel** | [**RecoveryModelEnum**](#RecoveryModelEnum) | Recovery model of the source database (MSSql Only). |  [optional]
**preScript** | **String** | PowerShell script or executable to run prior to provisioning (MSSql Only). |  [optional]
**postScript** | **String** | PowerShell script or executable to run after provisioning (MSSql Only). |  [optional]
**cdcOnProvision** | **Boolean** | Option to enable change data capture (CDC) on both the provisioned VDB and subsequent snapshot-related operations (e.g. refresh, rewind) (MSSql Only). |  [optional]
**onlineLogSize** | **Integer** | Online log size in MB (Oracle Only). |  [optional]
**onlineLogGroups** | **Integer** | Number of online log groups (Oracle Only). |  [optional]
**archiveLog** | **Boolean** | Option to create a VDB in archivelog mode (Oracle Only). |  [optional]
**newDbid** | **Boolean** | Option to generate a new DB ID for the created VDB (Oracle Only). |  [optional]
**listenerIds** | **List&lt;String&gt;** | The listener IDs for this provision operation (Oracle Only). |  [optional]
**customEnvVars** | **Map&lt;String, String&gt;** | Environment variable to be set when the engine creates a VDB. See the Engine documentation for the list of allowed/denied environment variables and rules about substitution. |  [optional]
**customEnvFiles** | **List&lt;String&gt;** | Environment files to be sourced when the Engine creates a VDB. This path can be followed by parameters. Paths and parameters are separated by spaces. |  [optional]
**oracleRacCustomEnvFiles** | [**List&lt;OracleRacCustomEnvFile&gt;**](OracleRacCustomEnvFile.md) | Environment files to be sourced when the Engine creates an Oracle RAC VDB. This path can be followed by parameters. Paths and parameters are separated by spaces. |  [optional]
**oracleRacCustomEnvVars** | [**List&lt;OracleRacCustomEnvVar&gt;**](OracleRacCustomEnvVar.md) | Environment variable to be set when the engine creates an Oracle RAC VDB. See the Engine documentation for the list of allowed/denied environment variables and rules about substitution. |  [optional]
**parentTdeKeystorePath** | **String** | Path to a copy of the parent&#39;s Oracle transparent data encryption keystore on the target host. Required to provision from snapshots containing encrypted database files. (Oracle Multitenant Only) |  [optional]
**parentTdeKeystorePassword** | **String** | The password of the keystore specified in parentTdeKeystorePath. (Oracle Multitenant Only) |  [optional]
**tdeExportedKeyFileSecret** | **String** | Secret to be used while exporting and importing vPDB encryption keys if Transparent Data Encryption is enabled on the vPDB. (Oracle Multitenant Only) |  [optional]
**tdeKeyIdentifier** | **String** | ID of the key created by Delphix. (Oracle Multitenant Only) |  [optional]
**targetVcdbTdeKeystorePath** | **String** | Path to the keystore of the target vCDB. (Oracle Multitenant Only) |  [optional]
**cdbTdeKeystorePassword** | **String** | The password for the Transparent Data Encryption keystore associated with the CDB. (Oracle Multitenant Only) |  [optional]
**vcdbTdeKeyIdentifier** | **String** | ID of the key created by Delphix. (Oracle Multitenant Only) |  [optional]
**appdataSourceParams** | **Map&lt;String, Object&gt;** | The JSON payload conforming to the DraftV4 schema based on the type of application data being manipulated. |  [optional]
**additionalMountPoints** | [**List&lt;AdditionalMountPoint&gt;**](AdditionalMountPoint.md) | Specifies additional locations on which to mount a subdirectory of an AppData container. |  [optional]
**appdataConfigParams** | **Map&lt;String, Object&gt;** | The list of parameters specified by the source config schema in the toolkit |  [optional]
**configParams** | **Map&lt;String, Object&gt;** | Database configuration parameter overrides. |  [optional]
**privilegedOsUser** | **String** | This privileged unix username will be used to create the VDB. Leave this field blank if you do not want to use privilege elevation. The unix privileged username should begin with a letter or an underscore, followed by letters, digits, underscores, or dashes. They can end with a dollar sign (postgres only). |  [optional]
**postgresPort** | **Integer** | Port number for Postgres target database (postgres only). |  [optional]
**configSettingsStg** | [**List&lt;ConfigSettingsStg&gt;**](ConfigSettingsStg.md) | Custom Database-Level config settings (postgres only). |  [optional]
**tags** | [**List&lt;Tag&gt;**](Tag.md) | The tags to be created for VDB. |  [optional]



## Enum: RecoveryModelEnum

Name | Value
---- | -----
FULL | &quot;FULL&quot;
SIMPLE | &quot;SIMPLE&quot;
BULK_LOGGED | &quot;BULK_LOGGED&quot;






# UpdateVDBParameters

Parameters to update a VDB.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The unique name of the VDB within a group. |  [optional]
**dbUsername** | **String** | The username of the database user (Oracle, ASE Only). |  [optional]
**dbPassword** | **String** | The password of the database user (Oracle, ASE Only). |  [optional]
**validateDbCredentials** | **Boolean** | Whether db_username and db_password must be validated, if present, against the VDB. This must be set to false when credentials validation is not possible, for instance if the VDB is known to be disabled. |  [optional]
**autoRestart** | **Boolean** | Whether to enable VDB restart. |  [optional]
**environmentUserId** | **String** | The environment user ID to use to connect to the target environment. |  [optional]
**templateId** | **String** | The ID of the target VDB Template (Oracle Only). |  [optional]
**listenerIds** | **List&lt;String&gt;** | The listener IDs for this provision operation (Oracle Only). |  [optional]
**newDbid** | **Boolean** | Whether to enable new DBID for Oracle |  [optional]
**cdcOnProvision** | **Boolean** | Whether to enable CDC on provision for MSSql |  [optional]
**preScript** | **String** | Pre script for MSSql. |  [optional]
**postScript** | **String** | Post script for MSSql. |  [optional]
**hooks** | [**VirtualDatasetHooks**](VirtualDatasetHooks.md) |  |  [optional]
**customEnvVars** | **Map&lt;String, String&gt;** | Environment variable to be set when the engine administers a VDB. See the Engine documentation for the list of allowed/denied environment variables and rules about substitution. Custom environment variables can only be updated while the VDB is disabled. |  [optional]
**customEnvFiles** | **List&lt;String&gt;** | Environment files to be sourced when the Engine administers a VDB. This path can be followed by parameters. Paths and parameters are separated by spaces. Custom environment variables can only be updated while the VDB is disabled. |  [optional]
**oracleRacCustomEnvFiles** | [**List&lt;OracleRacCustomEnvFile&gt;**](OracleRacCustomEnvFile.md) | Environment files to be sourced when the Engine administers an Oracle RAC VDB. This path can be followed by parameters. Paths and parameters are separated by spaces. Custom environment variables can only be updated while the VDB is disabled. |  [optional]
**oracleRacCustomEnvVars** | [**List&lt;OracleRacCustomEnvVar&gt;**](OracleRacCustomEnvVar.md) | Environment variable to be set when the engine administers an Oracle RAC VDB. See the Engine documentation for the list of allowed/denied environment variables and rules about substitution. Custom environment variables can only be updated while the VDB is disabled. |  [optional]
**parentTdeKeystorePath** | **String** | Path to a copy of the parent&#39;s Oracle transparent data encryption keystore on the target host. Required to provision from snapshots containing encrypted database files. (Oracle Multitenant Only) |  [optional]
**parentTdeKeystorePassword** | **String** | The password of the keystore specified in parentTdeKeystorePath. (Oracle Multitenant Only) |  [optional]
**tdeKeyIdentifier** | **String** | ID of the key created by Delphix. (Oracle Multitenant Only) |  [optional]
**targetVcdbTdeKeystorePath** | **String** | Path to the keystore of the target vCDB. (Oracle Multitenant Only) |  [optional]
**cdbTdeKeystorePassword** | **String** | The password for the Transparent Data Encryption keystore associated with the CDB. (Oracle Multitenant Only) |  [optional]
**appdataSourceParams** | **Map&lt;String, Object&gt;** | The JSON payload conforming to the DraftV4 schema based on the type of application data being manipulated. |  [optional]
**additionalMountPoints** | [**List&lt;AdditionalMountPoint&gt;**](AdditionalMountPoint.md) | Specifies additional locations on which to mount a subdirectory of an AppData container. Can only be updated while the VDB is disabled. |  [optional]
**appdataConfigParams** | **Map&lt;String, Object&gt;** | The parameters specified by the source config schema in the toolkit |  [optional]
**configParams** | **Map&lt;String, Object&gt;** | Database configuration parameter overrides. |  [optional]
**mountPoint** | **String** | Mount point for the VDB (AppData only), can only be updated while the VDB is disabled. |  [optional]




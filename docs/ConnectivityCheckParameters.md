

# ConnectivityCheckParameters

Parameters to check connectivity between engine and remote host.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**engineId** | **String** | The ID of the engine to check. |  |
|**useEnginePublicKey** | **Boolean** | Whether to use public key authentication. |  [optional] |
|**osName** | [**OsNameEnum**](#OsNameEnum) | Operating system type of the environment. |  [optional] |
|**stagingEnvironment** | **String** | Id of the connector environment which is used to connect to this source environment. |  [optional] |
|**host** | **String** | The hostname of the remote host machine to check. |  |
|**port** | **Integer** | The port of the remote host machine to check. For Windows, port on which Delphix connector is running. |  |
|**username** | **String** | The username of the remote host machine to check. Username is mandatory input with password/use_engine_public_key/kerberos_authentication. |  [optional] |
|**password** | **String** | The password of the remote host machine to check. |  [optional] |
|**vaultId** | **String** | The DCT id or name of the vault from which to read the host credentials. |  [optional] |
|**hashicorpVaultEngine** | **String** | Vault engine name where the credential is stored. |  [optional] |
|**hashicorpVaultSecretPath** | **String** | Path in the vault engine where the credential is stored. |  [optional] |
|**hashicorpVaultUsernameKey** | **String** | Key for the username in the key-value store. |  [optional] |
|**hashicorpVaultSecretKey** | **String** | Key for the password in the key-value store. |  [optional] |
|**azureVaultName** | **String** | Azure key vault name (ORACLE, ASE and MSSQL_DOMAIN_USER only). |  [optional] |
|**azureVaultUsernameKey** | **String** | Azure vault key for the username in the key-value store (ORACLE, ASE and MSSQL_DOMAIN_USER only). |  [optional] |
|**azureVaultSecretKey** | **String** | Azure vault key for the password in the key-value store (ORACLE, ASE and MSSQL_DOMAIN_USER only). |  [optional] |
|**cyberarkVaultQueryString** | **String** | Query to find a credential in the CyberArk vault. |  [optional] |
|**useKerberosAuthentication** | **Boolean** | Whether to use kerberos authentication. |  [optional] |



## Enum: OsNameEnum

| Name | Value |
|---- | -----|
| UNIX | &quot;UNIX&quot; |
| WINDOWS | &quot;WINDOWS&quot; |






# DatabaseConnectivityCheckParameters

Parameters to test JDBC connectivity to source configs.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**credentialsType** | [**CredentialsTypeEnum**](#CredentialsTypeEnum) | The type of credentials. |  |
|**sourceId** | **String** | Source database config Id. |  |
|**username** | **String** | Database username (Not applicable for MSSQL_ENVIRONMENT_USER). |  [optional] |
|**password** | **String** | Database password (Not applicable for MSSQL_ENVIRONMENT_USER and mutually exclusive with vault attributes). |  [optional] |
|**vault** | **String** | The name or reference of the vault from which to read the database credentials (ORACLE, ASE and MSSQL_DOMAIN_USER only). |  [optional] |
|**hashicorpVaultEngine** | **String** | Vault engine name where the credential is stored (ORACLE, ASE and MSSQL_DOMAIN_USER only). |  [optional] |
|**hashicorpVaultSecretPath** | **String** | Path in the vault engine where the credential is stored (ORACLE, ASE and MSSQL_DOMAIN_USER only). |  [optional] |
|**hashicorpVaultUsernameKey** | **String** | Hashicorp vault key for the username in the key-value store (ORACLE, ASE and MSSQL_DOMAIN_USER only). |  [optional] |
|**hashicorpVaultSecretKey** | **String** | Hashicorp vault key for the password in the key-value store (ORACLE, ASE and MSSQL_DOMAIN_USER only). |  [optional] |
|**azureVaultName** | **String** | Azure key vault name (ORACLE, ASE and MSSQL_DOMAIN_USER only). |  [optional] |
|**azureVaultUsernameKey** | **String** | Azure vault key for the username in the key-value store (ORACLE, ASE and MSSQL_DOMAIN_USER only). |  [optional] |
|**azureVaultSecretKey** | **String** | Azure vault key for the password in the key-value store (ORACLE, ASE and MSSQL_DOMAIN_USER only). |  [optional] |
|**cyberarkVaultQueryString** | **String** | Query to find a credential in the CyberArk vault (ORACLE, ASE and MSSQL_DOMAIN_USER only). |  [optional] |
|**environmentId** | **String** | Id of the environment to which environment user belongs (MSSQL_ENVIRONMENT_USER only). |  [optional] |
|**environmentUser** | **String** | Reference to the environment user (MSSQL_ENVIRONMENT_USER only). |  [optional] |



## Enum: CredentialsTypeEnum

| Name | Value |
|---- | -----|
| MSSQL_ENVIRONMENT_USER | &quot;MSSQL_ENVIRONMENT_USER&quot; |
| MSSQL_DOMAIN_USER | &quot;MSSQL_DOMAIN_USER&quot; |
| MSSQL_DATABASE_USER | &quot;MSSQL_DATABASE_USER&quot; |
| ORACLE | &quot;ORACLE&quot; |
| ASE | &quot;ASE&quot; |
| SOURCE_CONFIG | &quot;SOURCE_CONFIG&quot; |




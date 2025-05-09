

# ValidateJavaParameters

Parameters to validate java path for the remote host.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**javaHome** | **String** | Path pointing to java home on the remote machine. |  |
|**port** | **Integer** | SSH port of the remote host machine that will be used to establish SSH connection. |  |
|**username** | **String** | The username of the user that will be used to connect to the remote host machine. |  [optional] |
|**password** | **String** | The password of the user that will be used to connect to the remote host machine. |  [optional] |
|**hostName** | **String** | Hostname of the remote host machine that will be used to establish connection. |  |
|**useEnginePublicKey** | **Boolean** | Whether to use public key authentication. |  [optional] |
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




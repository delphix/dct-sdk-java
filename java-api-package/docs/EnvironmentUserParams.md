

# EnvironmentUserParams


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**username** | **String** | Username of the OS. |  [optional] |
|**password** | **String** | Password of the OS. |  [optional] |
|**vault** | **String** | The name or reference of the vault from which to read the host credentials. |  [optional] |
|**vaultUsername** | **String** | Delphix display name for the vault user |  [optional] |
|**hashicorpVaultEngine** | **String** | Vault engine name where the credential is stored. |  [optional] |
|**hashicorpVaultSecretPath** | **String** | Path in the vault engine where the credential is stored. |  [optional] |
|**hashicorpVaultUsernameKey** | **String** | Key for the username in the key-value store. |  [optional] |
|**hashicorpVaultSecretKey** | **String** | Key for the password in the key-value store. |  [optional] |
|**cyberarkVaultQueryString** | **String** | Query to find a credential in the CyberArk vault. |  [optional] |
|**useKerberosAuthentication** | **Boolean** | Whether to use kerberos authentication. |  [optional] |
|**useEnginePublicKey** | **Boolean** | Whether to use public key authentication. |  [optional] |




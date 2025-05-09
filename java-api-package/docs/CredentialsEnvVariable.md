

# CredentialsEnvVariable


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**baseVarName** | **String** | Base name of the environment variables. Variables are named by appending &#39;_USER&#39;, &#39;_PASSWORD&#39;, &#39;_PUBKEY&#39; and &#39;_PRIVKEY&#39; to this base name, respectively. Variables whose values are not entered or are not present in the type of credential or vault selected, will not be set. |  |
|**password** | **String** | Password to assign to the environment variables. |  [optional] |
|**vaultUsername** | **String** | Delphix display name for the vault user. |  [optional] |
|**vault** | **String** | The name or reference of the vault to assign to the environment variables. |  [optional] |
|**hashicorpVaultEngine** | **String** | Vault engine name where the credential is stored. |  [optional] |
|**hashicorpVaultSecretPath** | **String** | Path in the vault engine where the credential is stored. |  [optional] |
|**hashicorpVaultUsernameKey** | **String** | Hashicorp vault key for the username in the key-value store. |  [optional] |
|**hashicorpVaultSecretKey** | **String** | Hashicorp vault key for the password in the key-value store. |  [optional] |
|**azureVaultName** | **String** | Azure key vault name. |  [optional] |
|**azureVaultUsernameKey** | **String** | Azure vault key in the key-value store. |  [optional] |
|**azureVaultSecretKey** | **String** | Azure vault key in the key-value store. |  [optional] |
|**cyberarkVaultQueryString** | **String** | Query to find a credential in the CyberArk vault. |  [optional] |




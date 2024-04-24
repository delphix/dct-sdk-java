

# EnvironmentUpdateParameters


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the environment. |  [optional] |
|**stagingEnvironment** | **String** | Id of the connector environment which is used to connect to this source environment. |  [optional] |
|**clusterAddress** | **String** | Address of the cluster. This property can be modified for Windows cluster only. |  [optional] |
|**clusterHome** | **String** | Absolute path to cluster home directory. This parameter is for UNIX cluster environments. |  [optional] |
|**aseDbUsername** | **String** | username of the SAP ASE database. |  [optional] |
|**aseDbPassword** | **String** | password of the SAP ASE database. |  [optional] |
|**aseDbVault** | **String** | The name or reference of the vault from which to read the ASE database credentials. |  [optional] |
|**aseDbVaultUsername** | **String** | Delphix display name for the vault user |  [optional] |
|**aseDbHashicorpVaultEngine** | **String** | Vault engine name where the credential is stored. |  [optional] |
|**aseDbHashicorpVaultSecretPath** | **String** | Path in the vault engine where the credential is stored. |  [optional] |
|**aseDbHashicorpVaultUsernameKey** | **String** | Key for the username in the key-value store. |  [optional] |
|**aseDbHashicorpVaultSecretKey** | **String** | Key for the password in the key-value store. |  [optional] |
|**aseDbCyberarkVaultQueryString** | **String** | Query to find a credential in the CyberArk vault. |  [optional] |
|**aseDbAzureVaultName** | **String** | Azure key vault name. |  [optional] |
|**aseDbAzureVaultUsernameKey** | **String** | Azure vault key for the username in the key-value store. |  [optional] |
|**aseDbAzureVaultSecretKey** | **String** | Azure vault key for the password in the key-value store. |  [optional] |
|**aseDbUseKerberosAuthentication** | **Boolean** | Whether to use kerberos authentication for ASE DB discovery. |  [optional] |
|**description** | **String** | The environment description. |  [optional] |




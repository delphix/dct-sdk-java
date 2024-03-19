

# EnvironmentCreateParameters


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the environment. |  [optional]
**engineId** | **String** | The ID of the Engine onto which to create the environment. | 
**osName** | [**OsNameEnum**](#OsNameEnum) | Operating system type of the environment. | 
**isCluster** | **Boolean** | Whether the environment to be created is a cluster. |  [optional]
**clusterHome** | **String** | Absolute path to cluster home drectory. This parameter is mandatory for UNIX cluster environments. |  [optional]
**hostname** | **String** | host address of the machine. | 
**stagingEnvironment** | **String** | Id of the connector environment which is used to connect to this source environment. This is mandatory parameter when creating Windows source environments. |  [optional]
**connectorPort** | **Integer** | Specify port on which Delphix connector will run. This is mandatory parameter when creating Windows target environments. |  [optional]
**connectorAuthenticationKey** | **String** | Unique per Delphix key used to authenticate with the remote Delphix Connector. |  [optional]
**isTarget** | **Boolean** | Whether the environment to be created is a target cluster environment. This property is used only when creating Windows cluster environments. |  [optional]
**sshPort** | **Long** | ssh port of the host. |  [optional]
**toolkitPath** | **String** | The path for the toolkit that resides on the host. |  [optional]
**username** | **String** | Username of the OS. |  [optional]
**password** | **String** | Password of the OS. |  [optional]
**vault** | **String** | The name or reference of the vault from which to read the host credentials. |  [optional]
**hashicorpVaultEngine** | **String** | Vault engine name where the credential is stored. |  [optional]
**hashicorpVaultSecretPath** | **String** | Path in the vault engine where the credential is stored. |  [optional]
**hashicorpVaultUsernameKey** | **String** | Key for the username in the key-value store. |  [optional]
**hashicorpVaultSecretKey** | **String** | Key for the password in the key-value store. |  [optional]
**cyberarkVaultQueryString** | **String** | Query to find a credential in the CyberArk vault. |  [optional]
**useKerberosAuthentication** | **Boolean** | Whether to use kerberos authentication. |  [optional]
**useEnginePublicKey** | **Boolean** | Whether to use public key authentication. |  [optional]
**nfsAddresses** | **List&lt;String&gt;** | array of ip address or hostnames |  [optional]
**aseDbUsername** | **String** | username of the SAP ASE database. |  [optional]
**aseDbPassword** | **String** | password of the SAP ASE database. |  [optional]
**aseDbVault** | **String** | The name or reference of the vault from which to read the ASE database credentials. |  [optional]
**aseDbHashicorpVaultEngine** | **String** | Vault engine name where the credential is stored. |  [optional]
**aseDbHashicorpVaultSecretPath** | **String** | Path in the vault engine where the credential is stored. |  [optional]
**aseDbHashicorpVaultUsernameKey** | **String** | Key for the username in the key-value store. |  [optional]
**aseDbHashicorpVaultSecretKey** | **String** | Key for the password in the key-value store. |  [optional]
**aseDbCyberarkVaultQueryString** | **String** | Query to find a credential in the CyberArk vault. |  [optional]
**aseDbUseKerberosAuthentication** | **Boolean** | Whether to use kerberos authentication for ASE DB discovery. |  [optional]
**javaHome** | **String** | The path to the user managed Java Development Kit (JDK). If not specified, then the OpenJDK will be used. |  [optional]
**dspKeystorePath** | **String** | DSP keystore path. |  [optional]
**dspKeystorePassword** | **String** | DSP keystore password. |  [optional]
**dspKeystoreAlias** | **String** | DSP keystore alias. |  [optional]
**dspTruststorePath** | **String** | DSP truststore path. |  [optional]
**dspTruststorePassword** | **String** | DSP truststore password. |  [optional]
**description** | **String** | The environment description. |  [optional]
**tags** | [**List&lt;Tag&gt;**](Tag.md) | The tags to be created for this environment. |  [optional]
**makeCurrentAccountOwner** | **Boolean** | Whether the account creating this environment must be configured as owner of the environment. |  [optional]



## Enum: OsNameEnum

Name | Value
---- | -----
UNIX | &quot;UNIX&quot;
WINDOWS | &quot;WINDOWS&quot;






# HostUpdateParameters


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hostname** | **String** | host address of the machine. |  [optional]
**oracleClusterNodeName** | **String** | The name of the associated OracleClusterNode. |  [optional]
**oracleClusterNodeEnabled** | **Boolean** | Whether the associated OracleClusterNode is enabled. |  [optional]
**oracleClusterNodeVirtualIps** | [**List&lt;OracleVirtualIP&gt;**](OracleVirtualIP.md) | The Virtual IP addresses associated with the OracleClusterNode. |  [optional]
**nfsAddresses** | **List&lt;String&gt;** | array of ip addresses or hostnames |  [optional]
**sshPort** | **Long** | ssh port of the host. |  [optional]
**toolkitPath** | **String** | The path for the toolkit that resides on the host. |  [optional]
**javaHome** | **String** | The path to the user managed Java Development Kit (JDK). If not specified, then the OpenJDK will be used. |  [optional]
**dspKeystorePath** | **String** | DSP keystore path. |  [optional]
**dspKeystorePassword** | **String** | DSP keystore password. |  [optional]
**dspKeystoreAlias** | **String** | DSP keystore alias. |  [optional]
**dspTruststorePath** | **String** | DSP truststore path. |  [optional]
**dspTruststorePassword** | **String** | DSP truststore password. |  [optional]
**connectorPort** | **Integer** | Specify port on which Delphix connector will run. |  [optional]
**oracleJdbcKeystorePassword** | **String** | The password for the user managed Oracle JDBC keystore. |  [optional]
**oracleTdeKeystoresRootPath** | **String** | The path to the root of the Oracle TDE keystores artifact directories. |  [optional]
**sshVerificationStrategy** | [**SSHVerificationStrategy**](SSHVerificationStrategy.md) |  |  [optional]
**connectorAuthenticationKey** | **String** | Unique per Delphix key used to authenticate with the remote Delphix Connector. |  [optional]




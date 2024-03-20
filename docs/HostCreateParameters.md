

# HostCreateParameters


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name to associate with the host. |  [optional]
**hostname** | **String** | The hostname or IP address of this host. |  [optional]
**nfsAddresses** | **List&lt;String&gt;** | The list of host/IP addresses to use for NFS export. |  [optional]
**sshPort** | **Integer** | The port number used to connect to the host via SSH. |  [optional]
**privilegeElevationProfileReference** | **String** | Reference to a profile for escalating user privileges. |  [optional]
**dspKeystoreAlias** | **String** | The lowercase alias to use inside the user managed DSP keystore. |  [optional]
**dspKeystorePassword** | **String** | The password for the user managed DSP keystore. |  [optional]
**dspKeystorePath** | **String** | The path to the user managed DSP keystore. |  [optional]
**dspTruststorePassword** | **String** | The password for the user managed DSP truststore. |  [optional]
**dspTruststorePath** | **String** | The path to the user managed DSP truststore. |  [optional]
**javaHome** | **String** | The path to the user managed Java Development Kit (JDK). If not specified, then the OpenJDK will be used. |  [optional]
**toolkitPath** | **String** | The path for the toolkit that resides on the host. |  [optional]
**oracleJdbcKeystorePassword** | **String** | The password for the user managed Oracle JDBC keystore. |  [optional]
**oracleTdeKeystoresRootPath** | **String** | The path to the root of the Oracle TDE keystores artifact directories. |  [optional]
**sshVerificationStrategy** | [**SSHVerificationStrategy**](SSHVerificationStrategy.md) |  |  [optional]
**oracleClusterNodeVirtualIps** | [**List&lt;OracleVirtualIP&gt;**](OracleVirtualIP.md) | The Virtual IP addresses associated with the OracleClusterNode. |  [optional]




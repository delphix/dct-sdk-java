

# Host

A physical/virtual server.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The entity ID of this Host. |  [optional] |
|**hostname** | **String** | The hostname or IP address of this host. |  [optional] |
|**osName** | **String** | The name of the OS on this host. |  [optional] |
|**osVersion** | **String** | The version of the OS on this host. |  [optional] |
|**memorySize** | **Long** | The total amount of memory on this host in bytes. |  [optional] |
|**available** | **Boolean** | True if the host is up and a connection can be established from the engine. |  [optional] |
|**availableTimestamp** | **OffsetDateTime** | The last time the available property was updated. |  [optional] |
|**notAvailableReason** | **String** | The reason why the host is not available. |  [optional] |
|**oracleClusterNodeReference** | **String** | The reference to the associated OracleClusterNode. |  [optional] |
|**oracleClusterNodeName** | **String** | The name of the associated OracleClusterNode. |  [optional] |
|**oracleClusterNodeEnabled** | **Boolean** | Whether the associated OracleClusterNode is enabled. |  [optional] |
|**oracleClusterNodeDiscovered** | **Boolean** | Whether the associated OracleClusterNode was discovered. |  [optional] |
|**oracleClusterNodeVirtualIps** | [**List&lt;OracleVirtualIP&gt;**](OracleVirtualIP.md) | The Virtual IP addresses associated with the OracleClusterNode. |  [optional] |
|**oracleClusterNodeInstances** | [**List&lt;OracleClusterNodeInstance&gt;**](OracleClusterNodeInstance.md) | The instances associated with the OracleClusterNode. |  [optional] |
|**windowsClusterNodeReference** | **String** | The reference to the associated WindowsClusterNode. |  [optional] |
|**windowsClusterNodeName** | **String** | The name of the associated WindowsClusterNode. |  [optional] |
|**windowsClusterNodeDiscovered** | **Boolean** | Whether the associated Windows cluster node was discovered. |  [optional] |
|**nfsAddresses** | **Set&lt;String&gt;** | The list of host/IP addresses to use for NFS export. |  [optional] |
|**dspKeystoreAlias** | **String** | The lowercase alias to use inside the user managed DSP keystore. |  [optional] |
|**dspKeystorePath** | **String** | The path to the user managed DSP keystore. |  [optional] |
|**dspTruststorePath** | **String** | The path to the user managed DSP truststore. |  [optional] |
|**javaHome** | **String** | The path to the user managed Java Development Kit (JDK). If not specified, then the OpenJDK will be used. |  [optional] |
|**sshPort** | **Integer** | The port number used to connect to the host via SSH. |  [optional] |
|**toolkitPath** | **String** | The path for the toolkit that resides on the host. |  [optional] |
|**oracleTdeKeystoresRootPath** | **String** | The path to the root of the Oracle TDE keystores artifact directories. |  [optional] |
|**processorType** | **String** | The platform for the host machine. |  [optional] |
|**timezone** | **String** | The OS timezone. |  [optional] |




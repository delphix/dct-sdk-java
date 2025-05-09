

# Environment

A grouping of a single host or a cluster of hosts.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The Environment object entity ID. |  [optional] |
|**name** | **String** | The name of this environment. |  [optional] |
|**namespaceId** | **String** | The namespace id of this environment. |  [optional] |
|**namespaceName** | **String** | The namespace name of this environment. |  [optional] |
|**isReplica** | **Boolean** | Is this a replicated object. |  [optional] |
|**namespace** | **String** | The namespace of this environment for replicated and restored objects. |  [optional] |
|**engineId** | **String** | A reference to the Engine that this Environment connection is associated with. |  [optional] |
|**enabled** | **Boolean** | True if this environment is enabled. |  [optional] |
|**isCluster** | **Boolean** | True if this environment is a cluster of hosts. |  [optional] |
|**clusterHome** | **String** | Cluster home for RAC environment. |  [optional] |
|**isWindowsTarget** | **Boolean** | True if this windows environment is a target environment. |  [optional] |
|**stagingEnvironment** | **String** | ID of the staging environment. |  [optional] |
|**hosts** | [**List&lt;Host&gt;**](Host.md) | The hosts that are part of this environment. |  [optional] |
|**tags** | [**List&lt;Tag&gt;**](Tag.md) | The tags to be created for this environment. |  [optional] |
|**repositories** | [**List&lt;Repository&gt;**](Repository.md) | Repositories associated with this environment. A Repository typically corresponds to a database installation. |  [optional] |
|**listeners** | [**List&lt;OracleListener&gt;**](OracleListener.md) | Oracle listeners associated with this environment. |  [optional] |




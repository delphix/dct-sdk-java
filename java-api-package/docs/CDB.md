

# CDB

The Delphix representation of an Oracle Container Database.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The CDB object entity ID. |  [optional] |
|**name** | **String** | The name of this CDB. |  [optional] |
|**namespaceId** | **String** | The namespace id of this CDB. |  [optional] |
|**namespaceName** | **String** | The namespace name of this CDB. |  [optional] |
|**isReplica** | **Boolean** | Is this a replicated object. |  [optional] |
|**databaseVersion** | **String** | The version of this CDB. |  [optional] |
|**environmentId** | **String** | A reference to the Environment that hosts this CDB. |  [optional] |
|**size** | **Long** | The total size of the data files used by this CDB, in bytes. |  [optional] |
|**jdbcConnectionString** | **String** | The JDBC connection URL for this CDB. |  [optional] |
|**engineId** | **String** | A reference to the Engine that this CDB belongs to. |  [optional] |
|**tags** | [**List&lt;Tag&gt;**](Tag.md) |  |  [optional] |




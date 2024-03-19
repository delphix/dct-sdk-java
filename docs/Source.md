

# Source

The Delphix representation of the source database (not typically managed by Delphix).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The Source object entity ID. |  [optional]
**databaseType** | **String** | The type of this source database. |  [optional]
**name** | **String** | The name of this source database. |  [optional]
**databaseVersion** | **String** | The version of this source database. |  [optional]
**environmentId** | **String** | A reference to the Environment that hosts this source database. |  [optional]
**dataUuid** | **String** | A universal ID that uniquely identifies this source database. |  [optional]
**ipAddress** | **String** | The IP address of the source&#39;s host. |  [optional]
**fqdn** | **String** | The FQDN of the source&#39;s host. |  [optional]
**size** | **Long** | The total size of this source database, in bytes. |  [optional]
**jdbcConnectionString** | **String** | The JDBC connection URL for this source database. |  [optional]
**pluginVersion** | **String** | The version of the plugin associated with this source database. |  [optional]
**isDsource** | **Boolean** |  |  [optional]
**repository** | **String** | The repository reference for this source |  [optional]
**tags** | [**List&lt;Tag&gt;**](Tag.md) |  |  [optional]




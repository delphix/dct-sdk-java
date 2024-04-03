

# StagingSource

The Delphix representation of the staging source database (not typically managed by Delphix).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The Staging Source object entity ID. |  [optional] |
|**name** | **String** | The name of this staging source database. |  [optional] |
|**databaseType** | **String** | The type of this staging source database. |  [optional] |
|**databaseName** | **String** | The name of container database of associated with this staging source database. |  [optional] |
|**databaseVersion** | **String** | The version of container database associated with this staging source database. |  [optional] |
|**environmentId** | **String** | A reference to the Environment that hosts this staging source database. |  [optional] |
|**dataUuid** | **String** | A universal ID that uniquely identifies this staging source database. |  [optional] |
|**ipAddress** | **String** | The IP address of the staging source&#39;s host. |  [optional] |
|**fqdn** | **String** | The FQDN of the staging source&#39;s host. |  [optional] |
|**repository** | **String** | The repository id for this staging source. |  [optional] |
|**oracleConfigType** | [**OracleConfigTypeEnum**](#OracleConfigTypeEnum) | The type of oracle source configuration for this staging source. (Oracle only) |  [optional] |
|**cdbType** | **String** | The cdb type for this staging source. (Oracle only) |  [optional] |
|**dsourceId** | **String** | The dsource_id associated with this staging source. |  [optional] |
|**tags** | [**List&lt;Tag&gt;**](Tag.md) |  |  [optional] |



## Enum: OracleConfigTypeEnum

| Name | Value |
|---- | -----|
| ORACLERACCONFIG | &quot;OracleRACConfig&quot; |
| ORACLESICONFIG | &quot;OracleSIConfig&quot; |
| ORACLEPDBCONFIG | &quot;OraclePDBConfig&quot; |




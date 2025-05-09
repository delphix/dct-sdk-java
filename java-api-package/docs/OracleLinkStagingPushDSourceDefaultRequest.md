

# OracleLinkStagingPushDSourceDefaultRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**environmentId** | **String** | The ID of the environment to be linked. |  |
|**containerType** | [**ContainerTypeEnum**](#ContainerTypeEnum) | The container type of this database.If not provided the request would be considered for a PDB database. |  [optional] |



## Enum: ContainerTypeEnum

| Name | Value |
|---- | -----|
| ROOT_CDB | &quot;ROOT_CDB&quot; |
| NON_CDB | &quot;NON_CDB&quot; |






# VDBInventoryData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**engineName** | **String** | The name of the engine the VDB belongs to. |  [optional]
**name** | **String** | The name of the VDB. |  [optional]
**type** | **String** | The database type of the VDB. |  [optional]
**version** | **String** | The database version of the VDB. |  [optional]
**parentName** | **String** | The name of the VDB&#39;s parent dataset. |  [optional]
**parentId** | **String** | A reference to the parent dataset of the VDB. |  [optional]
**creationDate** | **OffsetDateTime** | The date the VDB was created. |  [optional]
**lastRefreshedDate** | **OffsetDateTime** | The date the VDB was last refreshed. |  [optional]
**parentTimeflowLocation** | **String** | The location for the VDB&#39;s parent timeflow. |  [optional]
**parentTimeflowTimestamp** | **OffsetDateTime** | The timestamp for the VDB&#39;s parent timeflow. |  [optional]
**parentTimeflowTimezone** | **String** | The timezone for the VDB&#39;s parent timeflow. |  [optional]
**enabled** | **Boolean** | Whether the VDB is enabled |  [optional]
**status** | **String** | The runtime status of the VDB. &#39;Unknown&#39; if all attempts to connect to the dataset failed. |  [optional]
**storageSize** | **Long** | The actual space used by the VDB, in bytes. |  [optional]




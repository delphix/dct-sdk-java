

# MaskingJob

A masking job.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The MaskingJob entity ID. |  [optional]
**name** | **String** | The name of this MaskingJob. |  [optional]
**ruleset** | [**MaskingRuleset**](MaskingRuleset.md) |  |  [optional]
**isOnTheFlyMasking** | **Boolean** | Whether this is an on-the-fly masking job. |  [optional]
**creationDate** | **OffsetDateTime** | The date this MaskingJob was created. |  [optional]
**lastCompletedExecutionDate** | **OffsetDateTime** | The date this MaskingJob was last executed to completion. |  [optional]
**lastExecutionStatus** | [**LastExecutionStatusEnum**](#LastExecutionStatusEnum) | The status of this MaskingJob&#39;s last execution. |  [optional]
**connectorUsername** | **String** | The username of the Connector used by the MaskingJob. |  [optional]
**connectorPassword** | **String** | The password of the Connector used by the MaskingJob. |  [optional]
**onTheFlySourceConnectorUsername** | **String** | The username of the source Connector used by the on-the-fly MaskingJob. |  [optional]
**onTheFlySourceConnectorPassword** | **String** | The password of the source Connector used by the on-the-fly MaskingJob. |  [optional]
**tags** | [**List&lt;Tag&gt;**](Tag.md) |  |  [optional]



## Enum: LastExecutionStatusEnum

Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
CANCELLED | &quot;CANCELLED&quot;
FAILED | &quot;FAILED&quot;
QUEUED | &quot;QUEUED&quot;
RUNNING | &quot;RUNNING&quot;
SUCCEEDED | &quot;SUCCEEDED&quot;




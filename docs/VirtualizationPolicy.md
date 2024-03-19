

# VirtualizationPolicy


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**namespace** | **String** |  |  [optional]
**engineId** | **String** |  |  [optional]
**policyType** | [**PolicyTypeEnum**](#PolicyTypeEnum) |  |  [optional]
**timezoneId** | **String** |  |  [optional]
**schedules** | [**List&lt;VirtualizationSchedule&gt;**](VirtualizationSchedule.md) |  |  [optional]



## Enum: PolicyTypeEnum

Name | Value
---- | -----
REFRESH_POLICY | &quot;REFRESH_POLICY&quot;
SNAPSHOT_POLICY | &quot;SNAPSHOT_POLICY&quot;
SYNC_POLICY | &quot;SYNC_POLICY&quot;






# VirtualizationPolicy


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**namespace** | **String** |  |  [optional] |
|**namespaceId** | **String** | The namespace id of this virtualization policy. |  [optional] |
|**namespaceName** | **String** | The namespace name of this virtualization policy.. |  [optional] |
|**isReplica** | **Boolean** | Is this a replicated object. |  [optional] |
|**engineId** | **String** |  |  [optional] |
|**policyType** | [**PolicyTypeEnum**](#PolicyTypeEnum) |  |  [optional] |
|**timezoneId** | **String** |  |  [optional] |
|**defaultPolicy** | **Boolean** | True if this is the default policy created when the system is setup. |  [optional] |
|**effectiveType** | [**EffectiveTypeEnum**](#EffectiveTypeEnum) | Whether this policy has been directly applied or inherited. See the effectivePolicies parameter of the list call for details. |  [optional] |
|**dataDuration** | **Integer** | Amount of time to keep source data [Retention Policy]. |  [optional] |
|**dataUnit** | [**DataUnitEnum**](#DataUnitEnum) | Time unit for data_duration [Retention Policy]. |  [optional] |
|**logDuration** | **Integer** | Amount of time to keep log data [Retention Policy]. |  [optional] |
|**logUnit** | [**LogUnitEnum**](#LogUnitEnum) | Time unit for log_duration [Retention Policy]. |  [optional] |
|**numOfDaily** | **Integer** | Number of daily snapshots to keep [Retention Policy]. |  [optional] |
|**numOfWeekly** | **Integer** | Number of weekly snapshots to keep [Retention Policy]. |  [optional] |
|**dayOfWeek** | [**DayOfWeekEnum**](#DayOfWeekEnum) | Day of week upon which to enforce weekly snapshot retention [Retention Policy]. |  [optional] |
|**numOfMonthly** | **Integer** | Number of monthly snapshots to keep [Retention Policy]. |  [optional] |
|**dayOfMonth** | **Integer** | Day of month upon which to enforce monthly snapshot retention [Retention Policy]. |  [optional] |
|**numOfYearly** | **Integer** | Number of yearly snapshots to keep [Retention Policy]. |  [optional] |
|**dayOfYear** | **String** | Day of year upon which to enforce yearly snapshot retention, expressed a month / day string (e.g., \&quot;Jan 1\&quot;) [Retention Policy]. |  [optional] |
|**schedules** | [**List&lt;VirtualizationSchedule&gt;**](VirtualizationSchedule.md) |  |  [optional] |
|**size** | **Long** | Size of the quota, in bytes. (QUOTA_POLICY only). |  [optional] |



## Enum: PolicyTypeEnum

| Name | Value |
|---- | -----|
| REFRESH_POLICY | &quot;REFRESH_POLICY&quot; |
| SNAPSHOT_POLICY | &quot;SNAPSHOT_POLICY&quot; |
| SYNC_POLICY | &quot;SYNC_POLICY&quot; |
| RETENTION_POLICY | &quot;RETENTION_POLICY&quot; |
| QUOTA_POLICY | &quot;QUOTA_POLICY&quot; |



## Enum: EffectiveTypeEnum

| Name | Value |
|---- | -----|
| DIRECT_APPLIED | &quot;DIRECT_APPLIED&quot; |
| INHERITED | &quot;INHERITED&quot; |



## Enum: DataUnitEnum

| Name | Value |
|---- | -----|
| DAY | &quot;DAY&quot; |
| WEEK | &quot;WEEK&quot; |
| MONTH | &quot;MONTH&quot; |
| QUARTER | &quot;QUARTER&quot; |
| YEAR | &quot;YEAR&quot; |



## Enum: LogUnitEnum

| Name | Value |
|---- | -----|
| DAY | &quot;DAY&quot; |
| WEEK | &quot;WEEK&quot; |
| MONTH | &quot;MONTH&quot; |
| QUARTER | &quot;QUARTER&quot; |
| YEAR | &quot;YEAR&quot; |



## Enum: DayOfWeekEnum

| Name | Value |
|---- | -----|
| MONDAY | &quot;MONDAY&quot; |
| TUESDAY | &quot;TUESDAY&quot; |
| WEDNESDAY | &quot;WEDNESDAY&quot; |
| THURSDAY | &quot;THURSDAY&quot; |
| FRIDAY | &quot;FRIDAY&quot; |
| SATURDAY | &quot;SATURDAY&quot; |
| SUNDAY | &quot;SUNDAY&quot; |




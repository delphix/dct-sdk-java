

# DSourceHooks

DSource operation hooks.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**opsPreSync** | [**List&lt;DSourceHooksOpsPreSyncInner&gt;**](DSourceHooksOpsPreSyncInner.md) | The commands to execute before syncing with external data. |  [optional] |
|**opsPreLogSync** | [**List&lt;DSourceHooksOpsPreSyncInner&gt;**](DSourceHooksOpsPreSyncInner.md) | The commands to execute after syncing with external data and before running the LogSync. |  [optional] |
|**opsPostSync** | [**List&lt;DSourceHooksOpsPreSyncInner&gt;**](DSourceHooksOpsPreSyncInner.md) | The commands to execute after syncing a linked source. |  [optional] |
|**preValidatedSync** | [**List&lt;DSourceHooksOpsPreSyncInner&gt;**](DSourceHooksOpsPreSyncInner.md) | The commands to execute on the staging source before performing a validated sync. |  [optional] |
|**postValidatedSync** | [**List&lt;DSourceHooksOpsPreSyncInner&gt;**](DSourceHooksOpsPreSyncInner.md) | The commands to execute on the staging source after performing a validated sync. |  [optional] |




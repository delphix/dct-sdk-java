

# VirtualDatasetHooks

VDB operation hooks.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**preRefresh** | [**List&lt;Hook&gt;**](Hook.md) | The commands to execute on the target environment before refreshing the VDB. |  [optional] |
|**postRefresh** | [**List&lt;Hook&gt;**](Hook.md) | The commands to execute on the target environment after refreshing the VDB. |  [optional] |
|**preSelfRefresh** | [**List&lt;Hook&gt;**](Hook.md) | The commands to execute on the target environment before refreshing the VDB with data from itself. |  [optional] |
|**postSelfRefresh** | [**List&lt;Hook&gt;**](Hook.md) | The commands to execute on the target environment after refreshing the VDB with data from itself. |  [optional] |
|**preRollback** | [**List&lt;Hook&gt;**](Hook.md) | The commands to execute on the target environment before rewinding the VDB. |  [optional] |
|**postRollback** | [**List&lt;Hook&gt;**](Hook.md) | The commands to execute on the target environment after rewinding the VDB. |  [optional] |
|**configureClone** | [**List&lt;Hook&gt;**](Hook.md) | The commands to execute on the target environment when the VDB is created or refreshed. |  [optional] |
|**preSnapshot** | [**List&lt;Hook&gt;**](Hook.md) | The commands to execute on the target environment before snapshotting a virtual source. These commands can quiesce any data prior to snapshotting. |  [optional] |
|**postSnapshot** | [**List&lt;Hook&gt;**](Hook.md) | The commands to execute on the target environment after snapshotting a virtual source. |  [optional] |
|**preStart** | [**List&lt;Hook&gt;**](Hook.md) | The commands to execute on the target environment before starting a virtual source. |  [optional] |
|**postStart** | [**List&lt;Hook&gt;**](Hook.md) | The commands to execute on the target environment after starting a virtual source. |  [optional] |
|**preStop** | [**List&lt;Hook&gt;**](Hook.md) | The commands to execute on the target environment before stopping a virtual source. |  [optional] |
|**postStop** | [**List&lt;Hook&gt;**](Hook.md) | The commands to execute on the target environment after stopping a virtual source. |  [optional] |




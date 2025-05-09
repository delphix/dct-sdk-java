

# AppDataDSourceLinkSourceParameters


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the dSource to be created. |  [optional] |
|**sourceId** | **String** | Id of the source to link. |  [optional] |
|**groupId** | **String** | Id of the dataset group where this dSource should belong to. |  [optional] |
|**description** | **String** | The notes/description for the dSource. |  [optional] |
|**logSyncEnabled** | **Boolean** | True if LogSync should run for this database. |  [optional] |
|**syncPolicyId** | **String** | The ID of the SnapSync policy for the dSource. |  [optional] |
|**retentionPolicyId** | **String** | The ID of the Retention policy for the dSource. |  [optional] |
|**makeCurrentAccountOwner** | **Boolean** | Whether the account creating this reporting schedule must be configured as owner of the reporting schedule. |  [optional] |
|**tags** | [**List&lt;Tag&gt;**](Tag.md) | The tags to be created for dSource. |  [optional] |
|**opsPreSync** | [**List&lt;SourceOperation&gt;**](SourceOperation.md) | Operations to perform before syncing the created dSource. These operations can quiesce any data prior to syncing. |  [optional] |
|**opsPostSync** | [**List&lt;SourceOperation&gt;**](SourceOperation.md) | Operations to perform after syncing a created dSource. |  [optional] |
|**linkType** | [**LinkTypeEnum**](#LinkTypeEnum) | The type of link to create. Default is AppDataDirect. * &#x60;AppDataDirect&#x60; - Represents the AppData specific parameters of a link request for a source directly replicated into the Delphix Engine. * &#x60;AppDataStaged&#x60; - Represents the AppData specific parameters of a link request for a source with a staging source.  |  [optional] |
|**stagingMountBase** | **String** | The base mount point for the NFS mount on the staging environment [AppDataStaged only]. |  [optional] |
|**stagingEnvironment** | **String** | The environment used as an intermediate stage to pull data into Delphix [AppDataStaged only]. |  [optional] |
|**stagingEnvironmentUser** | **String** | The environment user used to access the staging environment [AppDataStaged only]. |  [optional] |
|**environmentUser** | **String** | The OS user to use for linking. |  |
|**excludes** | **List&lt;String&gt;** | List of subdirectories in the source to exclude when syncing data. These paths are relative to the root of the source directory. [AppDataDirect only] |  [optional] |
|**followSymlinks** | **List&lt;String&gt;** | List of symlinks in the source to follow when syncing data. These paths are relative to the root of the source directory. All other symlinks are preserved. [AppDataDirect only] |  [optional] |
|**parameters** | **Map&lt;String, Object&gt;** | The JSON payload conforming to the DraftV4 schema based on the type of application data being manipulated. |  |
|**syncParameters** | **Map&lt;String, Object&gt;** | The JSON payload conforming to the snapshot parameters definition in a LUA toolkit or platform plugin. |  |



## Enum: LinkTypeEnum

| Name | Value |
|---- | -----|
| APPDATADIRECT | &quot;AppDataDirect&quot; |
| APPDATASTAGED | &quot;AppDataStaged&quot; |




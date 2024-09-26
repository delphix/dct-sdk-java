

# Bookmark

A Data Control Tower object that references points in time for one or more datasets.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The Bookmark object entity ID. |  [optional] [readonly] |
|**name** | **String** | The user-defined name of this bookmark. |  [optional] |
|**creationDate** | **OffsetDateTime** | The date and time that this bookmark was created. |  [optional] [readonly] |
|**vdbIds** | **List&lt;String&gt;** | The list of VDB IDs associated with this bookmark. |  [optional] |
|**dsourceIds** | **List&lt;String&gt;** | The list of dSource IDs associated with this bookmark. |  [optional] |
|**vdbs** | [**List&lt;BookmarkVDBs&gt;**](BookmarkVDBs.md) | The list of VDB IDs and VDB names associated with this bookmark. |  [optional] |
|**dsources** | [**List&lt;BookmarkDSources&gt;**](BookmarkDSources.md) | The list of dSource IDs and dSource names associated with this bookmark. |  [optional] |
|**retention** | **Long** | The retention policy for this bookmark, in days. A value of -1 indicates the bookmark should be kept forever. Deprecated in favor of expiration. |  [optional] |
|**expiration** | **LocalDate** | The expiration for this bookmark. When unset, indicates the bookmark is kept forever except for bookmarks of replicated datasets. Expiration cannot be set for bookmarks of replicated datasets. |  [optional] |
|**status** | **String** | A message with details about operation progress or state of this bookmark. |  [optional] [readonly] |
|**replicatedDataset** | **Boolean** | Whether this bookmark is created from a replicated dataset or not. |  [optional] |
|**bookmarkSource** | [**BookmarkSourceEnum**](#BookmarkSourceEnum) | Source of the bookmark, default is DCT. In case of self-service bookmarks, this value would be ENGINE. |  [optional] |
|**bookmarkStatus** | [**BookmarkStatusEnum**](#BookmarkStatusEnum) | Status of the bookmark. It can have INACTIVE value for engine bookmarks only. If this value is INACTIVE then ss_bookmark_errors would have the list of associated errors. |  [optional] |
|**ssBookmarkReference** | **String** | Engine reference of the self-service bookmark. |  [optional] |
|**ssBookmarkErrors** | **List&lt;String&gt;** | List of errors if any, during bookmark creation in DCT from self-service. |  [optional] |
|**tags** | [**List&lt;Tag&gt;**](Tag.md) | The tags to be created for this Bookmark. |  [optional] |



## Enum: BookmarkSourceEnum

| Name | Value |
|---- | -----|
| DCT | &quot;DCT&quot; |
| ENGINE | &quot;ENGINE&quot; |



## Enum: BookmarkStatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |




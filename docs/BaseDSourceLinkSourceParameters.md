

# BaseDSourceLinkSourceParameters


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the dSource to be created. |  [optional]
**sourceId** | **String** | Id of the source to link. |  [optional]
**groupId** | **String** | Id of the dataset group where this dSource should belong to. |  [optional]
**description** | **String** | The notes/description for the dSource. |  [optional]
**logSyncEnabled** | **Boolean** | True if LogSync should run for this database. |  [optional]
**externalFilePath** | **String** | External file path. |  [optional]
**makeCurrentAccountOwner** | **Boolean** | Whether the account creating this reporting schedule must be configured as owner of the reporting schedule. |  [optional]
**tags** | [**List&lt;Tag&gt;**](Tag.md) | The tags to be created for dSource. |  [optional]
**opsPreSync** | [**List&lt;SourceOperation&gt;**](SourceOperation.md) | Operations to perform before syncing the created dSource. These operations can quiesce any data prior to syncing. |  [optional]
**opsPostSync** | [**List&lt;SourceOperation&gt;**](SourceOperation.md) | Operations to perform after syncing a created dSource. |  [optional]




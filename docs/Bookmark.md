

# Bookmark

A Data Control Tower object that references points in time for one or more datasets.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The Bookmark object entity ID. |  [optional] [readonly]
**name** | **String** | The user-defined name of this bookmark. |  [optional]
**creationDate** | **OffsetDateTime** | The date and time that this bookmark was created. |  [optional] [readonly]
**vdbIds** | **List&lt;String&gt;** | The list of VDB IDs associated with this bookmark. |  [optional]
**retention** | **Long** | The retention policy for this bookmark, in days. A value of -1 indicates the bookmark should be kept forever. Deprecated in favor of expiration. |  [optional]
**expiration** | **LocalDate** | The expiration for this bookmark. When unset, indicates the bookmark is kept forever. |  [optional]
**status** | **String** | A message with details about operation progress or state of this bookmark. |  [optional] [readonly]
**tags** | [**List&lt;Tag&gt;**](Tag.md) | The tags to be created for this Bookmark. |  [optional]




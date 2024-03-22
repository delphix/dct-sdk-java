

# BookmarkCreateParameters

A Data Control Tower object that references points in time for one or more datasets.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The user-defined name of this bookmark. | 
**vdbIds** | **Set&lt;String&gt;** | The IDs of the VDBs to create the Bookmark on. This parameter is mutually exclusive with snapshot_ids. |  [optional]
**snapshotIds** | **Set&lt;String&gt;** | The IDs of the snapshots that will be part of the Bookmark. This parameter is mutually exclusive with vdb_ids.  |  [optional]
**retention** | **Long** | The retention policy for this bookmark, in days. A value of -1 indicates the bookmark should be kept forever. Deprecated in favor of expiration and retain_forever. |  [optional]
**expiration** | **LocalDate** | The expiration for this bookmark. Mutually exclusive with retention and retain_forever. |  [optional]
**retainForever** | **Boolean** | Indicates that the bookmark should be retained forever. |  [optional]
**tags** | [**List&lt;Tag&gt;**](Tag.md) | The tags to be created for this Bookmark. |  [optional]
**makeCurrentAccountOwner** | **Boolean** | Whether the account creating this bookmark must be configured as owner of the bookmark. |  [optional]




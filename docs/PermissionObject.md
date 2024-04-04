

# PermissionObject

A Permission Object which is mapping between object type and its permissions.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**objectType** | [**ObjectTypeEnum**](#ObjectTypeEnum) | Object type. |  |
|**permissions** | [**Set&lt;PermissionsEnum&gt;**](#Set&lt;PermissionsEnum&gt;) | List of permissions. |  |



## Enum: ObjectTypeEnum

| Name | Value |
|---- | -----|
| ACCESS_GROUP | &quot;ACCESS_GROUP&quot; |
| ACCOUNT | &quot;ACCOUNT&quot; |
| AUDIT_LOGS_SUMMARY_REPORT | &quot;AUDIT_LOGS_SUMMARY_REPORT&quot; |
| ROLE | &quot;ROLE&quot; |
| API_USAGE_REPORT | &quot;API_USAGE_REPORT&quot; |
| BOOKMARK | &quot;BOOKMARK&quot; |
| CDB | &quot;CDB&quot; |
| DATABASE_TEMPLATE | &quot;DATABASE_TEMPLATE&quot; |
| DSOURCE | &quot;DSOURCE&quot; |
| ENGINE | &quot;ENGINE&quot; |
| ENVIRONMENT | &quot;ENVIRONMENT&quot; |
| MASKING_JOB | &quot;MASKING_JOB&quot; |
| MASKING_ENVIRONMENT | &quot;MASKING_ENVIRONMENT&quot; |
| MASKING_ALGORITHM_REVISION | &quot;MASKING_ALGORITHM_REVISION&quot; |
| MASKING_JOB_SET | &quot;MASKING_JOB_SET&quot; |
| REPORT_SCHEDULE | &quot;REPORT_SCHEDULE&quot; |
| SOURCE | &quot;SOURCE&quot; |
| VAULT | &quot;VAULT&quot; |
| VCDB | &quot;VCDB&quot; |
| VDB | &quot;VDB&quot; |
| VDB_GROUP | &quot;VDB_GROUP&quot; |
| CONNECTOR | &quot;CONNECTOR&quot; |
| CONNECTIVITY_CHECK | &quot;CONNECTIVITY_CHECK&quot; |
| DSOURCE_USAGE_REPORT | &quot;DSOURCE_USAGE_REPORT&quot; |
| DSOURCE_CONSUMPTION_REPORT | &quot;DSOURCE_CONSUMPTION_REPORT&quot; |
| JOB | &quot;JOB&quot; |
| PHONEHOME_BUNDLE | &quot;PHONEHOME_BUNDLE&quot; |
| PRODUCT_INFO | &quot;PRODUCT_INFO&quot; |
| PRODUCT_REGISTRATION | &quot;PRODUCT_REGISTRATION&quot; |
| PROXY_CONFIGURATION | &quot;PROXY_CONFIGURATION&quot; |
| SMTP_CONFIG | &quot;SMTP_CONFIG&quot; |
| MASKING_EXECUTION_METRICS_REPORT | &quot;MASKING_EXECUTION_METRICS_REPORT&quot; |
| STORAGE_SUMMARY_REPORT | &quot;STORAGE_SUMMARY_REPORT&quot; |
| STORAGE_SAVINGS_SUMMARY_REPORT | &quot;STORAGE_SAVINGS_SUMMARY_REPORT&quot; |
| VDB_INVENTORY_REPORT | &quot;VDB_INVENTORY_REPORT&quot; |
| LDAP | &quot;LDAP&quot; |
| SAML | &quot;SAML&quot; |
| PASSWORD_POLICY | &quot;PASSWORD_POLICY&quot; |
| GLOBAL_PROPERTIES | &quot;GLOBAL_PROPERTIES&quot; |
| SYSTEM | &quot;SYSTEM&quot; |
| API_CLASSIFICATION | &quot;API_CLASSIFICATION&quot; |
| VIRTUALIZATION_POLICY | &quot;VIRTUALIZATION_POLICY&quot; |
| DATASET_GROUP | &quot;DATASET_GROUP&quot; |
| METADATA_DATABASE | &quot;METADATA_DATABASE&quot; |
| ENGINE_VAULT | &quot;ENGINE_VAULT&quot; |
| KERBEROS_CONFIG | &quot;KERBEROS_CONFIG&quot; |
| TIMEFLOW | &quot;TIMEFLOW&quot; |
| MASKING_ALGORITHM | &quot;MASKING_ALGORITHM&quot; |
| HYPERSCALE_INSTANCE | &quot;HYPERSCALE_INSTANCE&quot; |
| HYPERSCALE_CONNECTOR | &quot;HYPERSCALE_CONNECTOR&quot; |
| HYPERSCALE_DATASET | &quot;HYPERSCALE_DATASET&quot; |
| TOOLKIT | &quot;TOOLKIT&quot; |
| MASKING_PLUGIN | &quot;MASKING_PLUGIN&quot; |
| REPLICATION_PROFILE | &quot;REPLICATION_PROFILE&quot; |
| ENGINE_PERFORMANCE_ANALYTIC_REPORT | &quot;ENGINE_PERFORMANCE_ANALYTIC_REPORT&quot; |
| STAGING_SOURCE | &quot;STAGING_SOURCE&quot; |
| ENGINE_GLOBAL_OBJECT_STATE_REPORT | &quot;ENGINE_GLOBAL_OBJECT_STATE_REPORT&quot; |



## Enum: Set&lt;PermissionsEnum&gt;

| Name | Value |
|---- | -----|
| CREATE | &quot;CREATE&quot; |
| READ | &quot;READ&quot; |
| UPDATE | &quot;UPDATE&quot; |
| DELETE | &quot;DELETE&quot; |
| EXECUTE | &quot;EXECUTE&quot; |
| CANCEL | &quot;CANCEL&quot; |
| MIGRATE | &quot;MIGRATE&quot; |
| REFRESH | &quot;REFRESH&quot; |
| DISABLE | &quot;DISABLE&quot; |
| ENABLE | &quot;ENABLE&quot; |
| GLOBAL_SYNC_ENGINES | &quot;GLOBAL_SYNC_ENGINES&quot; |
| ABANDON | &quot;ABANDON&quot; |
| VALIDATE | &quot;VALIDATE&quot; |
| START | &quot;START&quot; |
| STOP | &quot;STOP&quot; |
| SNAPSHOT | &quot;SNAPSHOT&quot; |
| COPY | &quot;COPY&quot; |
| REMOVE_JOB | &quot;REMOVE_JOB&quot; |
| PASSWORD_RESET | &quot;PASSWORD_RESET&quot; |
| UNDO_IMPORT | &quot;UNDO_IMPORT&quot; |
| IMPORT | &quot;IMPORT&quot; |
| PROVISION_FROM_BOOKMARK | &quot;PROVISION_FROM_BOOKMARK&quot; |
| PROVISION | &quot;PROVISION&quot; |
| REFRESH_FROM_BOOKMARK | &quot;REFRESH_FROM_BOOKMARK&quot; |
| REFRESH_FROM_SNAPSHOT | &quot;REFRESH_FROM_SNAPSHOT&quot; |
| REFRESH_FROM_TIMESTAMP | &quot;REFRESH_FROM_TIMESTAMP&quot; |
| CREATE_ENVIRONMENT | &quot;CREATE_ENVIRONMENT&quot; |
| CREATE_BOOKMARK | &quot;CREATE_BOOKMARK&quot; |
| CREATE_VDBGROUP | &quot;CREATE_VDBGROUP&quot; |
| MANAGE_TAGS | &quot;MANAGE_TAGS&quot; |
| SET_TAGS_AT_OBJECT_CREATION | &quot;SET_TAGS_AT_OBJECT_CREATION&quot; |
| SNAPSHOT_UPDATE | &quot;SNAPSHOT_UPDATE&quot; |
| SNAPSHOT_DELETE | &quot;SNAPSHOT_DELETE&quot; |
| SWITCH_TIMEFLOW | &quot;SWITCH_TIMEFLOW&quot; |
| UPDATE_TIMEFLOW | &quot;UPDATE_TIMEFLOW&quot; |
| DELETE_TIMEFLOW | &quot;DELETE_TIMEFLOW&quot; |
| LINK | &quot;LINK&quot; |
| LOCK | &quot;LOCK&quot; |
| UNLOCK | &quot;UNLOCK&quot; |
| LOCK_FOR_OTHER_ACCOUNT | &quot;LOCK_FOR_OTHER_ACCOUNT&quot; |
| FORCE_UNLOCK | &quot;FORCE_UNLOCK&quot; |
| ADD_ENGINE_TO_HYPERSCALE | &quot;ADD_ENGINE_TO_HYPERSCALE&quot; |
| UPLOAD_MASKING_FILE | &quot;UPLOAD_MASKING_FILE&quot; |




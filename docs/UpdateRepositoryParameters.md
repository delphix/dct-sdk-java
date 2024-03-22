

# UpdateRepositoryParameters


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**databaseType** | [**DatabaseTypeEnum**](#DatabaseTypeEnum) | The database type of this repository. | 
**allowProvisioning** | **Boolean** | Flag indicating whether the repository should be used for provisioning. |  [optional]
**isStaging** | **Boolean** | Flag indicating whether this repository can be used by the Delphix Engine for internal processing. |  [optional]
**version** | **String** | Version of the repository. |  [optional]



## Enum: DatabaseTypeEnum

Name | Value
---- | -----
ORACLE | &quot;ORACLE&quot;
MSSQL | &quot;MSSQL&quot;
ASE | &quot;ASE&quot;
APPDATA | &quot;APPDATA&quot;




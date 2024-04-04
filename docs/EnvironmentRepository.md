

# EnvironmentRepository

A repository corresponding to the environment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Entity id of the repository. |  [optional] |
|**name** | **String** | Name of the repository. |  [optional] |
|**databaseType** | **String** | The database type of this repository. |  [optional] |
|**allowProvisioning** | **Boolean** | Flag indicating whether the repository should be used for provisioning. |  [optional] |
|**isStaging** | **Boolean** | Flag indicating whether this repository can be used by the Delphix Engine for internal processing. |  [optional] |
|**oracleBase** | **String** | The Oracle base where database binaries are located. |  [optional] |
|**version** | **String** | Version of the repository. |  [optional] |
|**bits** | **Integer** | 32 or 64 bits. |  [optional] |
|**installGroup** | **String** | Group name of the user that owns the install. |  [optional] |
|**installUser** | **String** | User name of the user that owns the install. |  [optional] |
|**rac** | **Boolean** | Flag indicating whether the install supports Oracle RAC. |  [optional] |
|**ports** | **List&lt;Long&gt;** | The network ports for connecting to the database instance. |  [optional] |
|**dumpHistoryFile** | **String** | Fully qualified name of the dump history file. |  [optional] |
|**pageSize** | **Long** | Database page size for the SAP ASE instance. |  [optional] |
|**owner** | **String** | Account the database server instance is running as. |  [optional] |
|**installationPath** | **String** | Directory path where the installation is located. |  [optional] |
|**fulltextInstalled** | **Boolean** | This property determines if the full-text search and semantic search is installed or not. |  [optional] |
|**internalVersion** | **Long** | The internal version is tied to the data format of a database and is used to detect compatibility. |  [optional] |
|**mssqlClusterInstancesName** | **List&lt;String&gt;** | MSSQL cluster instances name. |  [optional] |
|**mssqlClusterInstancesVersion** | **List&lt;String&gt;** | MSSQL cluster instances version. |  [optional] |
|**installationHome** | **String** | Directory where the installation home is located. |  [optional] |
|**driveLetter** | **List&lt;String&gt;** | MSSQL failover cluster drive letter. |  [optional] |
|**environmentId** | **String** | The environment ID. |  [optional] |




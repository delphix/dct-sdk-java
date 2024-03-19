

# ConnectivityCheckParameters

Parameters to check connectivity between engine and remote host.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**engineId** | **String** | The ID of the engine to check. | 
**useEnginePublicKey** | **Boolean** | Whether to use public key authentication. |  [optional]
**osName** | [**OsNameEnum**](#OsNameEnum) | Operating system type of the environment. |  [optional]
**stagingEnvironment** | **String** | Id of the connector environment which is used to connect to this source environment. |  [optional]
**host** | **String** | The hostname of the remote host machine to check. | 
**port** | **Integer** | The port of the remote host machine to check. For Windows, port on which Delphix connector is running. | 
**username** | **String** | The username of the remote host machine to check. |  [optional]
**password** | **String** | The password of the remote host machine to check. |  [optional]



## Enum: OsNameEnum

Name | Value
---- | -----
UNIX | &quot;UNIX&quot;
WINDOWS | &quot;WINDOWS&quot;




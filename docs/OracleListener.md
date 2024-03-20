

# OracleListener


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Id of this listener. |  [optional]
**name** | **String** | Name of this listener. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of this listener. |  [optional]
**protocolAddresses** | **List&lt;String&gt;** | The list of protocol addresses for this listener. |  [optional]
**clientEndpoints** | **List&lt;String&gt;** | The list of client endpoints for this listener. |  [optional]
**isDiscovered** | **Boolean** | Whether this listener was automatically discovered or not. |  [optional]
**hostId** | **String** | Id to the host this listener is associated with. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
NODE | &quot;NODE&quot;
SCAN | &quot;SCAN&quot;




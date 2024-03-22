

# PasswordVault

A Delphix engine password vault.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The password vault ID. |  [optional]
**name** | **String** | The name of this password vault. |  [optional]
**engineId** | **String** | Id of the Engine that this password vault belongs to. |  [optional]
**engineName** | **String** | Name of the Engine that this password vault belongs to. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of this password vault. |  [optional]
**host** | **String** | Host name or IP address of this password vault server. |  [optional]
**port** | **Long** | Port of this password vault server. |  [optional]
**enabled** | **Boolean** | The vault is enabled or not. |  [optional]
**namespace** | **String** | The namespace of this password vault. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
HASHICORPVAULT | &quot;HASHICORPVAULT&quot;
CYBERARKPASSWORDVAULT | &quot;CYBERARKPASSWORDVAULT&quot;




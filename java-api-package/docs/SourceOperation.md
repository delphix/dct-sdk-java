

# SourceOperation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**command** | **String** |  |  |
|**shell** | [**ShellEnum**](#ShellEnum) |  |  [optional] |
|**credentialsEnvVars** | [**List&lt;CredentialsEnvVariable&gt;**](CredentialsEnvVariable.md) | List of environment variables that will contain credentials for this operation. |  [optional] |



## Enum: ShellEnum

| Name | Value |
|---- | -----|
| BASH | &quot;bash&quot; |
| SHELL | &quot;shell&quot; |
| EXPECT | &quot;expect&quot; |
| PS | &quot;ps&quot; |
| PSD | &quot;psd&quot; |




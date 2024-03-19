

# EnvironmentUser


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userRef** | **String** | Environment user reference |  [optional]
**username** | **String** | Username of environment user |  [optional]
**primaryUser** | **Boolean** | This indicates if this user is primary or not |  [optional]
**authType** | [**AuthTypeEnum**](#AuthTypeEnum) | Authentication type of this user. PasswordCredential indicates username and password are used, SystemKeyCredential indicates public key based security credential, KeyPairCredential indicates public key based security credential consisting of a user specified key pair, KerberosCredential indicates Kerberos authentication, CyberArkVaultCredential indicates CyberArk Vault is used and HashiCorpVaultCredential indicates that Hashicorp vault is used for authentication |  [optional]



## Enum: AuthTypeEnum

Name | Value
---- | -----
PASSWORDCREDENTIAL | &quot;PasswordCredential&quot;
SYSTEMKEYCREDENTIAL | &quot;SystemKeyCredential&quot;
KEYPAIRCREDENTIAL | &quot;KeyPairCredential&quot;
KERBEROSCREDENTIAL | &quot;KerberosCredential&quot;
CYBERARKVAULTCREDENTIAL | &quot;CyberArkVaultCredential&quot;
HASHICORPVAULTCREDENTIAL | &quot;HashiCorpVaultCredential&quot;






# SSHVerificationStrategy

Mechanism to use for ssh host verification.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | [**NameEnum**](#NameEnum) | The name of the verification strategy. | 
**keyType** | [**KeyTypeEnum**](#KeyTypeEnum) | The type of SSH key. |  [optional]
**rawKey** | **String** | Base64-encoded ssh key of the host for RAW_KEY verification. |  [optional]
**fingerprintType** | [**FingerprintTypeEnum**](#FingerprintTypeEnum) | Hash function for the fingerprint for FINGERPRINT verification. |  [optional]
**fingerprint** | **String** | Base-64 encoded fingerprint of the ssh key of the host for FINGERPRINT verification. |  [optional]



## Enum: NameEnum

Name | Value
---- | -----
RAW_KEY | &quot;RAW_KEY&quot;
FINGERPRINT | &quot;FINGERPRINT&quot;
ACCEPT_ALWAYS | &quot;ACCEPT_ALWAYS&quot;



## Enum: KeyTypeEnum

Name | Value
---- | -----
RSA | &quot;RSA&quot;
DSA | &quot;DSA&quot;
ECDSA | &quot;ECDSA&quot;
ED25519 | &quot;ED25519&quot;



## Enum: FingerprintTypeEnum

Name | Value
---- | -----
SHA256 | &quot;SHA256&quot;
SHA512 | &quot;SHA512&quot;




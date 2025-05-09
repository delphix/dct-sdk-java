

# DataRiskData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**connectorId** | **String** | The DCT id of the connector. This is an opaque string. |  [optional] |
|**engineConnectorId** | **Integer** | The ID of the connector as found on the compliance engine. |  [optional] |
|**connectorName** | **String** | Name of the connector. |  [optional] |
|**connectorType** | [**ConnectorTypeEnum**](#ConnectorTypeEnum) | Type of the connector. |  [optional] |
|**lastProfiledDate** | **OffsetDateTime** | Date this connector was last profiled. |  [optional] |
|**lastMaskedDate** | **OffsetDateTime** | Date this connector last had a masking job run. |  [optional] |
|**engineId** | **String** | The entity ID of the masking engine. |  [optional] |
|**engineName** | **String** | The name of the masking engine. |  [optional] |
|**isProfiled** | **Boolean** | If this connector has been profiled. |  [optional] |
|**isSensitiveData** | **Boolean** | If this connector has sensitive data. |  [optional] |
|**isMasked** | **Boolean** | If this connector has had a successful masking job run. |  [optional] |
|**isAtRisk** | **Boolean** | If this connector has sensitive data that have not been masked. |  [optional] |
|**dataElementsTotal** | **Long** | The total number of data elements of this connector. |  [optional] |
|**dataElementsNotSensitive** | **Long** | The number of data elements categorized as not sensitive. |  [optional] |
|**dataElementsSensitiveMasked** | **Long** | The number of sensitive data elements that have been masked. |  [optional] |
|**dataElementsSensitiveUnmasked** | **Long** | The number of sensitive data elements that have not been masked. |  [optional] |
|**recordsTotal** | **Long** | The total number of records from this connector. |  [optional] |
|**recordsNotSensitive** | **Long** | The number of records found to be not sensitive. |  [optional] |
|**recordsSensitiveMasked** | **Long** | The number of records found to be sensitive and have been masked. |  [optional] |
|**recordsSensitiveUnmasked** | **Long** | The number of records found to be sensitive and have not been masked. |  [optional] |
|**tags** | [**List&lt;Tag&gt;**](Tag.md) | The tags of the connector. |  [optional] |



## Enum: ConnectorTypeEnum

| Name | Value |
|---- | -----|
| DATABASE | &quot;DATABASE&quot; |
| FILE | &quot;FILE&quot; |
| MAINFRAME_DATASET | &quot;MAINFRAME_DATASET&quot; |




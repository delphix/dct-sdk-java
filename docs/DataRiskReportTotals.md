

# DataRiskReportTotals

The global totals of masking data risk metrics across all connectors.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**connectorTotal** | **Long** | The total number of connectors. |  [optional] |
|**profiledConnectorCount** | **Long** | The number of connectors that have been profiled. |  [optional] |
|**sensitiveConnectorCount** | **Long** | The number of connectors found to have sensitive data. |  [optional] |
|**maskedConnectorCount** | **Long** | The number of connectors having had a successfully run masking job. |  [optional] |
|**atRiskConnectorCount** | **Long** | The number of connectors with sensitive data that have not been masked. |  [optional] |
|**dataElementsTotal** | **Long** | The total number of data elements across connectors. |  [optional] |
|**dataElementsNotSensitive** | **Long** | The number of data elements categorized as not sensitive. |  [optional] |
|**dataElementsSensitiveMasked** | **Long** | The number of sensitive data elements that have been masked. |  [optional] |
|**dataElementsSensitiveUnmasked** | **Long** | The number of sensitive data elements that have not been masked. |  [optional] |
|**recordsTotal** | **Long** | The total number of records across connectors. |  [optional] |
|**recordsNotSensitive** | **Long** | The number of records found to be not sensitive. |  [optional] |
|**recordsSensitiveMasked** | **Long** | The number of sensitive records that have been masked. |  [optional] |
|**recordsSensitiveUnmasked** | **Long** | The number of sensitive records that have not been masked. |  [optional] |
|**recordsCoverageMissingReason** | **String** | An explanation if the records coverage is not provided. |  [optional] |




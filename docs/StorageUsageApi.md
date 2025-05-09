# StorageUsageApi

All URIs are relative to */v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getHistoricalStorageSummaryAggregate**](StorageUsageApi.md#getHistoricalStorageSummaryAggregate) | **GET** /historical-storage-summary-aggregate | Returns the aggregated historical storage usage of all registered engines over time, optionally with a projection of future storage usage. |
| [**getHistoricalStorageSummaryByEngine**](StorageUsageApi.md#getHistoricalStorageSummaryByEngine) | **GET** /historical-storage-summary-by-engine | Returns the historical storage usage by engine over time, optionally with a projection of future storage usage. |


<a id="getHistoricalStorageSummaryAggregate"></a>
# **getHistoricalStorageSummaryAggregate**
> HistoricalStorageSummaryAggregate getHistoricalStorageSummaryAggregate(startDate, endDate, includeProjection, engineIds)

Returns the aggregated historical storage usage of all registered engines over time, optionally with a projection of future storage usage.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.StorageUsageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    StorageUsageApi apiInstance = new StorageUsageApi(defaultClient);
    OffsetDateTime startDate = OffsetDateTime.parse("2022-05-29T19:00:00Z"); // OffsetDateTime | Report start date/time. Defaults to first API request.
    OffsetDateTime endDate = OffsetDateTime.parse("2022-06-07T19:10:00Z"); // OffsetDateTime | Report end date/time. Defaults to current time.
    Boolean includeProjection = true; // Boolean | Whether to compute a projection of future storage usage.
    List<String> engineIds = Arrays.asList(); // List<String> | The list of engine ids to aggregate data for. By default aggregating data for all engines.
    try {
      HistoricalStorageSummaryAggregate result = apiInstance.getHistoricalStorageSummaryAggregate(startDate, endDate, includeProjection, engineIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageUsageApi#getHistoricalStorageSummaryAggregate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startDate** | **OffsetDateTime**| Report start date/time. Defaults to first API request. | [optional] |
| **endDate** | **OffsetDateTime**| Report end date/time. Defaults to current time. | [optional] |
| **includeProjection** | **Boolean**| Whether to compute a projection of future storage usage. | [optional] |
| **engineIds** | [**List&lt;String&gt;**](String.md)| The list of engine ids to aggregate data for. By default aggregating data for all engines. | [optional] |

### Return type

[**HistoricalStorageSummaryAggregate**](HistoricalStorageSummaryAggregate.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the aggregated historical storage usage of all registered engines over time. |  -  |

<a id="getHistoricalStorageSummaryByEngine"></a>
# **getHistoricalStorageSummaryByEngine**
> HistoricalStorageSummary getHistoricalStorageSummaryByEngine(startDate, endDate, includeProjection, engineIds)

Returns the historical storage usage by engine over time, optionally with a projection of future storage usage.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.StorageUsageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    StorageUsageApi apiInstance = new StorageUsageApi(defaultClient);
    OffsetDateTime startDate = OffsetDateTime.parse("2022-05-29T19:00:00Z"); // OffsetDateTime | Report start date/time. Defaults to first API request.
    OffsetDateTime endDate = OffsetDateTime.parse("2022-06-07T19:10:00Z"); // OffsetDateTime | Report end date/time. Defaults to current time.
    Boolean includeProjection = true; // Boolean | Whether to compute a projection of future storage usage.
    List<String> engineIds = Arrays.asList(); // List<String> | The list of engine ids to include in the response. By default returning data for all engines.
    try {
      HistoricalStorageSummary result = apiInstance.getHistoricalStorageSummaryByEngine(startDate, endDate, includeProjection, engineIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageUsageApi#getHistoricalStorageSummaryByEngine");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startDate** | **OffsetDateTime**| Report start date/time. Defaults to first API request. | [optional] |
| **endDate** | **OffsetDateTime**| Report end date/time. Defaults to current time. | [optional] |
| **includeProjection** | **Boolean**| Whether to compute a projection of future storage usage. | [optional] |
| **engineIds** | [**List&lt;String&gt;**](String.md)| The list of engine ids to include in the response. By default returning data for all engines. | [optional] |

### Return type

[**HistoricalStorageSummary**](HistoricalStorageSummary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the historical storage usage by engine over time. |  -  |


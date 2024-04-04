# SnapshotsApi

All URIs are relative to */v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSnapshotTags**](SnapshotsApi.md#createSnapshotTags) | **POST** /snapshots/{snapshotId}/tags | Create tags for a Snapshot. |
| [**deleteSnapshot**](SnapshotsApi.md#deleteSnapshot) | **DELETE** /snapshots/{snapshotId} | Delete a Snapshot. |
| [**deleteSnapshotTags**](SnapshotsApi.md#deleteSnapshotTags) | **POST** /snapshots/{snapshotId}/tags/delete | Delete tags for a Snapshot. |
| [**findByLocation**](SnapshotsApi.md#findByLocation) | **GET** /snapshots/find_by_location | Get the snapshots at this location for a dataset. |
| [**findByTimestamp**](SnapshotsApi.md#findByTimestamp) | **GET** /snapshots/find_by_timestamp | Get the snapshots at this timestamp for a dataset. |
| [**getSnapshotById**](SnapshotsApi.md#getSnapshotById) | **GET** /snapshots/{snapshotId} | Get a Snapshot by ID. |
| [**getSnapshotTags**](SnapshotsApi.md#getSnapshotTags) | **GET** /snapshots/{snapshotId}/tags | Get tags for a Snapshot. |
| [**getSnapshotTimeflowRange**](SnapshotsApi.md#getSnapshotTimeflowRange) | **GET** /snapshots/{snapshotId}/timeflow_range | Return the provisionable timeflow range based on a specific snapshot. |
| [**getSnapshots**](SnapshotsApi.md#getSnapshots) | **GET** /snapshots | Retrieve the list of snapshots. |
| [**searchSnapshots**](SnapshotsApi.md#searchSnapshots) | **POST** /snapshots/search | Search snapshots. |
| [**unsetSnapshotRetention**](SnapshotsApi.md#unsetSnapshotRetention) | **POST** /snapshots/{snapshotId}/unset_expiration | Unset a Snapshot&#39;s expiration, removing expiration and retain_forever values for the snapshot. |
| [**updateSnapshot**](SnapshotsApi.md#updateSnapshot) | **PATCH** /snapshots/{snapshotId} | Update values of a Snapshot. |


<a id="createSnapshotTags"></a>
# **createSnapshotTags**
> TagsResponse createSnapshotTags(snapshotId, tagsRequest)

Create tags for a Snapshot.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.SnapshotsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    SnapshotsApi apiInstance = new SnapshotsApi(defaultClient);
    String snapshotId = "snapshotId_example"; // String | The ID of the snapshot.
    TagsRequest tagsRequest = new TagsRequest(); // TagsRequest | Tags information for Snapshot.
    try {
      TagsResponse result = apiInstance.createSnapshotTags(snapshotId, tagsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapshotsApi#createSnapshotTags");
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
| **snapshotId** | **String**| The ID of the snapshot. | |
| **tagsRequest** | [**TagsRequest**](TagsRequest.md)| Tags information for Snapshot. | |

### Return type

[**TagsResponse**](TagsResponse.md)

### Authorization

[ApiKeyAuth](../DCT_README#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="deleteSnapshot"></a>
# **deleteSnapshot**
> DeleteSnapshotResponse deleteSnapshot(snapshotId)

Delete a Snapshot.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.SnapshotsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    SnapshotsApi apiInstance = new SnapshotsApi(defaultClient);
    String snapshotId = "snapshotId_example"; // String | The ID of the snapshot.
    try {
      DeleteSnapshotResponse result = apiInstance.deleteSnapshot(snapshotId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapshotsApi#deleteSnapshot");
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
| **snapshotId** | **String**| The ID of the snapshot. | |

### Return type

[**DeleteSnapshotResponse**](DeleteSnapshotResponse.md)

### Authorization

[ApiKeyAuth](../DCT_README#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Snapshot delete initiated. |  -  |

<a id="deleteSnapshotTags"></a>
# **deleteSnapshotTags**
> deleteSnapshotTags(snapshotId, deleteTag)

Delete tags for a Snapshot.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.SnapshotsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    SnapshotsApi apiInstance = new SnapshotsApi(defaultClient);
    String snapshotId = "snapshotId_example"; // String | The ID of the snapshot.
    DeleteTag deleteTag = new DeleteTag(); // DeleteTag | The parameters to delete tags
    try {
      apiInstance.deleteSnapshotTags(snapshotId, deleteTag);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapshotsApi#deleteSnapshotTags");
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
| **snapshotId** | **String**| The ID of the snapshot. | |
| **deleteTag** | [**DeleteTag**](DeleteTag.md)| The parameters to delete tags | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../DCT_README#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="findByLocation"></a>
# **findByLocation**
> FindByLocationResponse findByLocation(datasetId, location)

Get the snapshots at this location for a dataset.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.SnapshotsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    SnapshotsApi apiInstance = new SnapshotsApi(defaultClient);
    String datasetId = "dataset-123"; // String | The ID of the dSource or VDB.
    String location = "2332584"; // String | The location
    try {
      FindByLocationResponse result = apiInstance.findByLocation(datasetId, location);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapshotsApi#findByLocation");
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
| **datasetId** | **String**| The ID of the dSource or VDB. | |
| **location** | **String**| The location | |

### Return type

[**FindByLocationResponse**](FindByLocationResponse.md)

### Authorization

[ApiKeyAuth](../DCT_README#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="findByTimestamp"></a>
# **findByTimestamp**
> FindByTimestampResponse findByTimestamp(datasetId, timestamp)

Get the snapshots at this timestamp for a dataset.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.SnapshotsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    SnapshotsApi apiInstance = new SnapshotsApi(defaultClient);
    String datasetId = "dataset-123"; // String | The ID of the dSource or VDB.
    OffsetDateTime timestamp = OffsetDateTime.parse("2021-05-01T08:51:34.148000+00:00"); // OffsetDateTime | The desired point in time.
    try {
      FindByTimestampResponse result = apiInstance.findByTimestamp(datasetId, timestamp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapshotsApi#findByTimestamp");
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
| **datasetId** | **String**| The ID of the dSource or VDB. | |
| **timestamp** | **OffsetDateTime**| The desired point in time. | |

### Return type

[**FindByTimestampResponse**](FindByTimestampResponse.md)

### Authorization

[ApiKeyAuth](../DCT_README#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getSnapshotById"></a>
# **getSnapshotById**
> Snapshot getSnapshotById(snapshotId)

Get a Snapshot by ID.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.SnapshotsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    SnapshotsApi apiInstance = new SnapshotsApi(defaultClient);
    String snapshotId = "snapshotId_example"; // String | The ID of the snapshot.
    try {
      Snapshot result = apiInstance.getSnapshotById(snapshotId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapshotsApi#getSnapshotById");
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
| **snapshotId** | **String**| The ID of the snapshot. | |

### Return type

[**Snapshot**](Snapshot.md)

### Authorization

[ApiKeyAuth](../DCT_README#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getSnapshotTags"></a>
# **getSnapshotTags**
> TagsResponse getSnapshotTags(snapshotId)

Get tags for a Snapshot.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.SnapshotsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    SnapshotsApi apiInstance = new SnapshotsApi(defaultClient);
    String snapshotId = "snapshotId_example"; // String | The ID of the snapshot.
    try {
      TagsResponse result = apiInstance.getSnapshotTags(snapshotId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapshotsApi#getSnapshotTags");
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
| **snapshotId** | **String**| The ID of the snapshot. | |

### Return type

[**TagsResponse**](TagsResponse.md)

### Authorization

[ApiKeyAuth](../DCT_README#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getSnapshotTimeflowRange"></a>
# **getSnapshotTimeflowRange**
> TimeflowRange getSnapshotTimeflowRange(snapshotId)

Return the provisionable timeflow range based on a specific snapshot.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.SnapshotsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    SnapshotsApi apiInstance = new SnapshotsApi(defaultClient);
    String snapshotId = "snapshotId_example"; // String | The ID of the snapshot.
    try {
      TimeflowRange result = apiInstance.getSnapshotTimeflowRange(snapshotId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapshotsApi#getSnapshotTimeflowRange");
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
| **snapshotId** | **String**| The ID of the snapshot. | |

### Return type

[**TimeflowRange**](TimeflowRange.md)

### Authorization

[ApiKeyAuth](../DCT_README#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getSnapshots"></a>
# **getSnapshots**
> ListSnapshotsResponse getSnapshots(limit, cursor, sort)

Retrieve the list of snapshots.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.SnapshotsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    SnapshotsApi apiInstance = new SnapshotsApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100.
    String cursor = "cursor_example"; // String | Cursor to fetch the next or previous page of results. The value of this property must be extracted from the 'prev_cursor' or 'next_cursor' property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints.
    String sort = "id"; // String | The field to sort results by. A property name with a prepended '-' signifies descending order.
    try {
      ListSnapshotsResponse result = apiInstance.getSnapshots(limit, cursor, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapshotsApi#getSnapshots");
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
| **limit** | **Integer**| Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100. | [optional] [default to 100] |
| **cursor** | **String**| Cursor to fetch the next or previous page of results. The value of this property must be extracted from the &#39;prev_cursor&#39; or &#39;next_cursor&#39; property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints. | [optional] |
| **sort** | **String**| The field to sort results by. A property name with a prepended &#39;-&#39; signifies descending order. | [optional] [enum: id, -id, engine_id, -engine_id, namespace, -namespace, name, -name, consistency, -consistency, missing_non_logged_data, -missing_non_logged_data, dataset_id, -dataset_id, creation_time, -creation_time, start_timestamp, -start_timestamp, start_location, -start_location, timestamp, -timestamp, location, -location, expiration, -expiration, retain_forever, -retain_forever, effective_expiration, -effective_expiration, effective_retain_forever, -effective_retain_forever, timeflow_id, -timeflow_id, timezone, -timezone, version, -version, temporary, -temporary, appdata_toolkit, -appdata_toolkit, appdata_metadata, -appdata_metadata, ase_db_encryption_key, -ase_db_encryption_key, mssql_internal_version, -mssql_internal_version, mssql_backup_set_uuid, -mssql_backup_set_uuid, mssql_backup_software_type, -mssql_backup_software_type, mssql_backup_location_type, -mssql_backup_location_type, mssql_empty_snapshot, -mssql_empty_snapshot, oracle_from_physical_standby_vdb, -oracle_from_physical_standby_vdb, oracle_redo_log_size_in_bytes, -oracle_redo_log_size_in_bytes] |

### Return type

[**ListSnapshotsResponse**](ListSnapshotsResponse.md)

### Authorization

[ApiKeyAuth](../DCT_README#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="searchSnapshots"></a>
# **searchSnapshots**
> SearchSnapshotsResponse searchSnapshots(limit, cursor, sort, searchBody)

Search snapshots.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.SnapshotsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    SnapshotsApi apiInstance = new SnapshotsApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100.
    String cursor = "cursor_example"; // String | Cursor to fetch the next or previous page of results. The value of this property must be extracted from the 'prev_cursor' or 'next_cursor' property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints.
    String sort = "id"; // String | The field to sort results by. A property name with a prepended '-' signifies descending order.
    SearchBody searchBody = new SearchBody(); // SearchBody | A request body containing a filter expression. This enables searching for items matching arbitrarily complex conditions. The list of attributes which can be used in filter expressions is available in the x-filterable vendor extension.  # Filter Expression Overview **Note: All keywords are case-insensitive**  ## Comparison Operators | Operator | Description | Example | | --- | --- | --- | | CONTAINS | Substring or membership testing for string and list attributes respectively. | field3 CONTAINS 'foobar', field4 CONTAINS TRUE  | | IN | Tests if field is a member of a list literal. List can contain a maximum of 100 values | field2 IN ['Goku', 'Vegeta'] | | GE | Tests if a field is greater than or equal to a literal value | field1 GE 1.2e-2 | | GT | Tests if a field is greater than a literal value | field1 GT 1.2e-2 | | LE | Tests if a field is less than or equal to a literal value | field1 LE 9000 | | LT | Tests if a field is less than a literal value | field1 LT 9.02 | | NE | Tests if a field is not equal to a literal value | field1 NE 42 | | EQ | Tests if a field is equal to a literal value | field1 EQ 42 |  ## Search Operator The SEARCH operator filters for items which have any filterable attribute that contains the input string as a substring, comparison is done case-insensitively. This is not restricted to attributes with string values. Specifically `SEARCH '12'` would match an item with an attribute with an integer value of `123`.  ## Logical Operators Ordered by precedence. | Operator | Description | Example | | --- | --- | --- | | NOT | Logical NOT (Right associative) | NOT field1 LE 9000 | | AND | Logical AND (Left Associative) | field1 GT 9000 AND field2 EQ 'Goku' | | OR | Logical OR (Left Associative) | field1 GT 9000 OR field2 EQ 'Goku' |  ## Grouping Parenthesis `()` can be used to override operator precedence.  For example: NOT (field1 LT 1234 AND field2 CONTAINS 'foo')  ## Literal Values | Literal      | Description | Examples | | --- | --- | --- | | Nil | Represents the absence of a value | nil, Nil, nIl, NIL | | Boolean | true/false boolean | true, false, True, False, TRUE, FALSE | | Number | Signed integer and floating point numbers. Also supports scientific notation. | 0, 1, -1, 1.2, 0.35, 1.2e-2, -1.2e+2 | | String | Single or double quoted | \"foo\", \"bar\", \"foo bar\", 'foo', 'bar', 'foo bar' | | Datetime | Formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) | 2018-04-27T18:39:26.397237+00:00 | | List | Comma-separated literals wrapped in square brackets | [0], [0, 1], ['foo', \"bar\"] |  ## Limitations - A maximum of 8 unique identifiers may be used inside a filter expression. 
    try {
      SearchSnapshotsResponse result = apiInstance.searchSnapshots(limit, cursor, sort, searchBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapshotsApi#searchSnapshots");
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
| **limit** | **Integer**| Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100. | [optional] [default to 100] |
| **cursor** | **String**| Cursor to fetch the next or previous page of results. The value of this property must be extracted from the &#39;prev_cursor&#39; or &#39;next_cursor&#39; property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints. | [optional] |
| **sort** | **String**| The field to sort results by. A property name with a prepended &#39;-&#39; signifies descending order. | [optional] [enum: id, -id, engine_id, -engine_id, namespace, -namespace, name, -name, consistency, -consistency, missing_non_logged_data, -missing_non_logged_data, dataset_id, -dataset_id, creation_time, -creation_time, start_timestamp, -start_timestamp, start_location, -start_location, timestamp, -timestamp, location, -location, expiration, -expiration, retain_forever, -retain_forever, effective_expiration, -effective_expiration, effective_retain_forever, -effective_retain_forever, timeflow_id, -timeflow_id, timezone, -timezone, version, -version, temporary, -temporary, appdata_toolkit, -appdata_toolkit, appdata_metadata, -appdata_metadata, ase_db_encryption_key, -ase_db_encryption_key, mssql_internal_version, -mssql_internal_version, mssql_backup_set_uuid, -mssql_backup_set_uuid, mssql_backup_software_type, -mssql_backup_software_type, mssql_backup_location_type, -mssql_backup_location_type, mssql_empty_snapshot, -mssql_empty_snapshot, oracle_from_physical_standby_vdb, -oracle_from_physical_standby_vdb, oracle_redo_log_size_in_bytes, -oracle_redo_log_size_in_bytes] |
| **searchBody** | [**SearchBody**](SearchBody.md)| A request body containing a filter expression. This enables searching for items matching arbitrarily complex conditions. The list of attributes which can be used in filter expressions is available in the x-filterable vendor extension.  # Filter Expression Overview **Note: All keywords are case-insensitive**  ## Comparison Operators | Operator | Description | Example | | --- | --- | --- | | CONTAINS | Substring or membership testing for string and list attributes respectively. | field3 CONTAINS &#39;foobar&#39;, field4 CONTAINS TRUE  | | IN | Tests if field is a member of a list literal. List can contain a maximum of 100 values | field2 IN [&#39;Goku&#39;, &#39;Vegeta&#39;] | | GE | Tests if a field is greater than or equal to a literal value | field1 GE 1.2e-2 | | GT | Tests if a field is greater than a literal value | field1 GT 1.2e-2 | | LE | Tests if a field is less than or equal to a literal value | field1 LE 9000 | | LT | Tests if a field is less than a literal value | field1 LT 9.02 | | NE | Tests if a field is not equal to a literal value | field1 NE 42 | | EQ | Tests if a field is equal to a literal value | field1 EQ 42 |  ## Search Operator The SEARCH operator filters for items which have any filterable attribute that contains the input string as a substring, comparison is done case-insensitively. This is not restricted to attributes with string values. Specifically &#x60;SEARCH &#39;12&#39;&#x60; would match an item with an attribute with an integer value of &#x60;123&#x60;.  ## Logical Operators Ordered by precedence. | Operator | Description | Example | | --- | --- | --- | | NOT | Logical NOT (Right associative) | NOT field1 LE 9000 | | AND | Logical AND (Left Associative) | field1 GT 9000 AND field2 EQ &#39;Goku&#39; | | OR | Logical OR (Left Associative) | field1 GT 9000 OR field2 EQ &#39;Goku&#39; |  ## Grouping Parenthesis &#x60;()&#x60; can be used to override operator precedence.  For example: NOT (field1 LT 1234 AND field2 CONTAINS &#39;foo&#39;)  ## Literal Values | Literal      | Description | Examples | | --- | --- | --- | | Nil | Represents the absence of a value | nil, Nil, nIl, NIL | | Boolean | true/false boolean | true, false, True, False, TRUE, FALSE | | Number | Signed integer and floating point numbers. Also supports scientific notation. | 0, 1, -1, 1.2, 0.35, 1.2e-2, -1.2e+2 | | String | Single or double quoted | \&quot;foo\&quot;, \&quot;bar\&quot;, \&quot;foo bar\&quot;, &#39;foo&#39;, &#39;bar&#39;, &#39;foo bar&#39; | | Datetime | Formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) | 2018-04-27T18:39:26.397237+00:00 | | List | Comma-separated literals wrapped in square brackets | [0], [0, 1], [&#39;foo&#39;, \&quot;bar\&quot;] |  ## Limitations - A maximum of 8 unique identifiers may be used inside a filter expression.  | [optional] |

### Return type

[**SearchSnapshotsResponse**](SearchSnapshotsResponse.md)

### Authorization

[ApiKeyAuth](../DCT_README#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="unsetSnapshotRetention"></a>
# **unsetSnapshotRetention**
> UnsetSnapshotRetentionResponse unsetSnapshotRetention(snapshotId)

Unset a Snapshot&#39;s expiration, removing expiration and retain_forever values for the snapshot.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.SnapshotsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    SnapshotsApi apiInstance = new SnapshotsApi(defaultClient);
    String snapshotId = "snapshotId_example"; // String | The ID of the snapshot.
    try {
      UnsetSnapshotRetentionResponse result = apiInstance.unsetSnapshotRetention(snapshotId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapshotsApi#unsetSnapshotRetention");
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
| **snapshotId** | **String**| The ID of the snapshot. | |

### Return type

[**UnsetSnapshotRetentionResponse**](UnsetSnapshotRetentionResponse.md)

### Authorization

[ApiKeyAuth](../DCT_README#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Snapshot unset retention initiated. |  -  |

<a id="updateSnapshot"></a>
# **updateSnapshot**
> UpdateSnapshotResponse updateSnapshot(snapshotId, updateSnapshotParameters)

Update values of a Snapshot.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.SnapshotsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    SnapshotsApi apiInstance = new SnapshotsApi(defaultClient);
    String snapshotId = "snapshotId_example"; // String | The ID of the snapshot.
    UpdateSnapshotParameters updateSnapshotParameters = new UpdateSnapshotParameters(); // UpdateSnapshotParameters | The new data to update a Snapshot.
    try {
      UpdateSnapshotResponse result = apiInstance.updateSnapshot(snapshotId, updateSnapshotParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapshotsApi#updateSnapshot");
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
| **snapshotId** | **String**| The ID of the snapshot. | |
| **updateSnapshotParameters** | [**UpdateSnapshotParameters**](UpdateSnapshotParameters.md)| The new data to update a Snapshot. | [optional] |

### Return type

[**UpdateSnapshotResponse**](UpdateSnapshotResponse.md)

### Authorization

[ApiKeyAuth](../DCT_README#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Snapshot update initiated. |  -  |


# VdbsApi

All URIs are relative to */v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createVdbTags**](VdbsApi.md#createVdbTags) | **POST** /vdbs/{vdbId}/tags | Create tags for a VDB. |
| [**deleteVdb**](VdbsApi.md#deleteVdb) | **POST** /vdbs/{vdbId}/delete | Delete a VDB. |
| [**deleteVdbTags**](VdbsApi.md#deleteVdbTags) | **POST** /vdbs/{vdbId}/tags/delete | Delete tags for a VDB. |
| [**disableVdb**](VdbsApi.md#disableVdb) | **POST** /vdbs/{vdbId}/disable | Disable a VDB. |
| [**enableVdb**](VdbsApi.md#enableVdb) | **POST** /vdbs/{vdbId}/enable | Enable a VDB. |
| [**getBookmarksByVdb**](VdbsApi.md#getBookmarksByVdb) | **GET** /vdbs/{vdbId}/bookmarks | List Bookmarks compatible with this VDB. |
| [**getTagsVdb**](VdbsApi.md#getTagsVdb) | **GET** /vdbs/{vdbId}/tags | Get tags for a VDB. |
| [**getVdbById**](VdbsApi.md#getVdbById) | **GET** /vdbs/{vdbId} | Get a VDB by ID. |
| [**getVdbSnapshots**](VdbsApi.md#getVdbSnapshots) | **GET** /vdbs/{vdbId}/snapshots | List Snapshots for a VDB. |
| [**getVdbs**](VdbsApi.md#getVdbs) | **GET** /vdbs | List all vdbs. |
| [**lockVdb**](VdbsApi.md#lockVdb) | **POST** /vdbs/{vdbId}/lock | Lock a VDB. |
| [**provisionVdbByLocation**](VdbsApi.md#provisionVdbByLocation) | **POST** /vdbs/provision_by_location | Provision a new VDB by location. |
| [**provisionVdbByLocationDefaults**](VdbsApi.md#provisionVdbByLocationDefaults) | **POST** /vdbs/provision_by_location/defaults | Get default provision parameters for provisioning a new VDB by location. |
| [**provisionVdbBySnapshot**](VdbsApi.md#provisionVdbBySnapshot) | **POST** /vdbs/provision_by_snapshot | Provision a new VDB by snapshot. |
| [**provisionVdbBySnapshotDefaults**](VdbsApi.md#provisionVdbBySnapshotDefaults) | **POST** /vdbs/provision_by_snapshot/defaults | Get default provision parameters for provisioning a new VDB by snapshot. |
| [**provisionVdbByTimestamp**](VdbsApi.md#provisionVdbByTimestamp) | **POST** /vdbs/provision_by_timestamp | Provision a new VDB by timestamp. |
| [**provisionVdbByTimestampDefaults**](VdbsApi.md#provisionVdbByTimestampDefaults) | **POST** /vdbs/provision_by_timestamp/defaults | Get default provision parameters for provisioning a new VDB by timestamp. |
| [**provisionVdbFromBookmark**](VdbsApi.md#provisionVdbFromBookmark) | **POST** /vdbs/provision_from_bookmark | Provision a new VDB from a bookmark with a single VDB. |
| [**provisionVdbFromBookmarkDefaults**](VdbsApi.md#provisionVdbFromBookmarkDefaults) | **POST** /vdbs/provision_from_bookmark/defaults | Get default provision parameters for provisioning a new VDB from a bookmark. |
| [**refreshVdbByLocation**](VdbsApi.md#refreshVdbByLocation) | **POST** /vdbs/{vdbId}/refresh_by_location | Refresh a VDB by location. |
| [**refreshVdbBySnapshot**](VdbsApi.md#refreshVdbBySnapshot) | **POST** /vdbs/{vdbId}/refresh_by_snapshot | Refresh a VDB by snapshot. |
| [**refreshVdbByTimestamp**](VdbsApi.md#refreshVdbByTimestamp) | **POST** /vdbs/{vdbId}/refresh_by_timestamp | Refresh a VDB by timestamp. |
| [**refreshVdbFromBookmark**](VdbsApi.md#refreshVdbFromBookmark) | **POST** /vdbs/{vdbId}/refresh_from_bookmark | Refresh a VDB from bookmark with a single VDB. |
| [**rollbackVdbBySnapshot**](VdbsApi.md#rollbackVdbBySnapshot) | **POST** /vdbs/{vdbId}/rollback_by_snapshot | Rollback a VDB by snapshot. |
| [**rollbackVdbByTimestamp**](VdbsApi.md#rollbackVdbByTimestamp) | **POST** /vdbs/{vdbId}/rollback_by_timestamp | Rollback a VDB by timestamp. |
| [**rollbackVdbFromBookmark**](VdbsApi.md#rollbackVdbFromBookmark) | **POST** /vdbs/{vdbId}/rollback_from_bookmark | Rollback a VDB from a bookmark with only the same VDB. |
| [**searchBookmarksByVdb**](VdbsApi.md#searchBookmarksByVdb) | **POST** /vdbs/{vdbId}/bookmarks/search | Search Bookmarks compatible with this VDB. |
| [**searchVdbs**](VdbsApi.md#searchVdbs) | **POST** /vdbs/search | Search for VDBs. |
| [**snapshotVdb**](VdbsApi.md#snapshotVdb) | **POST** /vdbs/{vdbId}/snapshots | Snapshot a VDB. |
| [**startVdb**](VdbsApi.md#startVdb) | **POST** /vdbs/{vdbId}/start | Start a VDB. |
| [**stopVdb**](VdbsApi.md#stopVdb) | **POST** /vdbs/{vdbId}/stop | Stop a VDB. |
| [**switchTimeflow**](VdbsApi.md#switchTimeflow) | **POST** /vdbs/{vdbId}/switch_timeflow | Switches the current timeflow of a VDB. |
| [**unlockVdb**](VdbsApi.md#unlockVdb) | **POST** /vdbs/{vdbId}/unlock | Unlock a VDB. |
| [**updateVdbById**](VdbsApi.md#updateVdbById) | **PATCH** /vdbs/{vdbId} | Update values of a VDB |


<a id="createVdbTags"></a>
# **createVdbTags**
> TagsResponse createVdbTags(vdbId, tagsRequest)

Create tags for a VDB.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.VdbsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VdbsApi apiInstance = new VdbsApi(defaultClient);
    String vdbId = "vdbId_example"; // String | The ID of the VDB.
    TagsRequest tagsRequest = new TagsRequest(); // TagsRequest | Tags information for VDB.
    try {
      TagsResponse result = apiInstance.createVdbTags(vdbId, tagsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdbsApi#createVdbTags");
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
| **vdbId** | **String**| The ID of the VDB. | |
| **tagsRequest** | [**TagsRequest**](TagsRequest.md)| Tags information for VDB. | |

### Return type

[**TagsResponse**](TagsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="deleteVdb"></a>
# **deleteVdb**
> DeleteVDBResponse deleteVdb(vdbId, deleteVDBParameters)

Delete a VDB.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.VdbsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VdbsApi apiInstance = new VdbsApi(defaultClient);
    String vdbId = "vdbId_example"; // String | The ID of the VDB.
    DeleteVDBParameters deleteVDBParameters = new DeleteVDBParameters(); // DeleteVDBParameters | The parameters to delete a VDB.
    try {
      DeleteVDBResponse result = apiInstance.deleteVdb(vdbId, deleteVDBParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdbsApi#deleteVdb");
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
| **vdbId** | **String**| The ID of the VDB. | |
| **deleteVDBParameters** | [**DeleteVDBParameters**](DeleteVDBParameters.md)| The parameters to delete a VDB. | [optional] |

### Return type

[**DeleteVDBResponse**](DeleteVDBResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | VDB delete initiated. |  -  |

<a id="deleteVdbTags"></a>
# **deleteVdbTags**
> deleteVdbTags(vdbId, deleteTag)

Delete tags for a VDB.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.VdbsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VdbsApi apiInstance = new VdbsApi(defaultClient);
    String vdbId = "vdbId_example"; // String | The ID of the VDB.
    DeleteTag deleteTag = new DeleteTag(); // DeleteTag | The parameters to delete tags
    try {
      apiInstance.deleteVdbTags(vdbId, deleteTag);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdbsApi#deleteVdbTags");
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
| **vdbId** | **String**| The ID of the VDB. | |
| **deleteTag** | [**DeleteTag**](DeleteTag.md)| The parameters to delete tags | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="disableVdb"></a>
# **disableVdb**
> DisableVDBResponse disableVdb(vdbId, disableVDBParameters)

Disable a VDB.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.VdbsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VdbsApi apiInstance = new VdbsApi(defaultClient);
    String vdbId = "vdbId_example"; // String | The ID of the VDB.
    DisableVDBParameters disableVDBParameters = new DisableVDBParameters(); // DisableVDBParameters | The parameters to disable a VDB.
    try {
      DisableVDBResponse result = apiInstance.disableVdb(vdbId, disableVDBParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdbsApi#disableVdb");
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
| **vdbId** | **String**| The ID of the VDB. | |
| **disableVDBParameters** | [**DisableVDBParameters**](DisableVDBParameters.md)| The parameters to disable a VDB. | [optional] |

### Return type

[**DisableVDBResponse**](DisableVDBResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | VDB disable initiated. |  -  |

<a id="enableVdb"></a>
# **enableVdb**
> EnableVDBResponse enableVdb(vdbId, enableVDBParameters)

Enable a VDB.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.VdbsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VdbsApi apiInstance = new VdbsApi(defaultClient);
    String vdbId = "vdbId_example"; // String | The ID of the VDB.
    EnableVDBParameters enableVDBParameters = new EnableVDBParameters(); // EnableVDBParameters | The parameters to enable a VDB.
    try {
      EnableVDBResponse result = apiInstance.enableVdb(vdbId, enableVDBParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdbsApi#enableVdb");
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
| **vdbId** | **String**| The ID of the VDB. | |
| **enableVDBParameters** | [**EnableVDBParameters**](EnableVDBParameters.md)| The parameters to enable a VDB. | [optional] |

### Return type

[**EnableVDBResponse**](EnableVDBResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | VDB enable initiated. |  -  |

<a id="getBookmarksByVdb"></a>
# **getBookmarksByVdb**
> ListBookmarksByVDBResponse getBookmarksByVdb(vdbId, limit, cursor, sort)

List Bookmarks compatible with this VDB.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.VdbsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VdbsApi apiInstance = new VdbsApi(defaultClient);
    String vdbId = "vdbId_example"; // String | The ID of the VDB.
    Integer limit = 100; // Integer | Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100.
    String cursor = "cursor_example"; // String | Cursor to fetch the next or previous page of results. The value of this property must be extracted from the 'prev_cursor' or 'next_cursor' property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints.
    String sort = "id"; // String | The field to sort results by. A property name with a prepended '-' signifies descending order.
    try {
      ListBookmarksByVDBResponse result = apiInstance.getBookmarksByVdb(vdbId, limit, cursor, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdbsApi#getBookmarksByVdb");
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
| **vdbId** | **String**| The ID of the VDB. | |
| **limit** | **Integer**| Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100. | [optional] [default to 100] |
| **cursor** | **String**| Cursor to fetch the next or previous page of results. The value of this property must be extracted from the &#39;prev_cursor&#39; or &#39;next_cursor&#39; property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints. | [optional] |
| **sort** | **String**| The field to sort results by. A property name with a prepended &#39;-&#39; signifies descending order. | [optional] [enum: id, -id, name, -name, creation_date, -creation_date, vdb_ids, -vdb_ids, retention, -retention, expiration, -expiration] |

### Return type

[**ListBookmarksByVDBResponse**](ListBookmarksByVDBResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getTagsVdb"></a>
# **getTagsVdb**
> TagsResponse getTagsVdb(vdbId)

Get tags for a VDB.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.VdbsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VdbsApi apiInstance = new VdbsApi(defaultClient);
    String vdbId = "vdbId_example"; // String | The ID of the VDB.
    try {
      TagsResponse result = apiInstance.getTagsVdb(vdbId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdbsApi#getTagsVdb");
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
| **vdbId** | **String**| The ID of the VDB. | |

### Return type

[**TagsResponse**](TagsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getVdbById"></a>
# **getVdbById**
> VDB getVdbById(vdbId)

Get a VDB by ID.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.VdbsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VdbsApi apiInstance = new VdbsApi(defaultClient);
    String vdbId = "vdbId_example"; // String | The ID of the VDB.
    try {
      VDB result = apiInstance.getVdbById(vdbId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdbsApi#getVdbById");
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
| **vdbId** | **String**| The ID of the VDB. | |

### Return type

[**VDB**](VDB.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getVdbSnapshots"></a>
# **getVdbSnapshots**
> ListSnapshotsResponse getVdbSnapshots(vdbId, limit, cursor)

List Snapshots for a VDB.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.VdbsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VdbsApi apiInstance = new VdbsApi(defaultClient);
    String vdbId = "vdbId_example"; // String | The ID of the VDB.
    Integer limit = 100; // Integer | Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100.
    String cursor = "cursor_example"; // String | Cursor to fetch the next or previous page of results. The value of this property must be extracted from the 'prev_cursor' or 'next_cursor' property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints.
    try {
      ListSnapshotsResponse result = apiInstance.getVdbSnapshots(vdbId, limit, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdbsApi#getVdbSnapshots");
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
| **vdbId** | **String**| The ID of the VDB. | |
| **limit** | **Integer**| Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100. | [optional] [default to 100] |
| **cursor** | **String**| Cursor to fetch the next or previous page of results. The value of this property must be extracted from the &#39;prev_cursor&#39; or &#39;next_cursor&#39; property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints. | [optional] |

### Return type

[**ListSnapshotsResponse**](ListSnapshotsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getVdbs"></a>
# **getVdbs**
> ListVDBsResponse getVdbs(limit, cursor, sort, permission)

List all vdbs.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.VdbsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VdbsApi apiInstance = new VdbsApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100.
    String cursor = "cursor_example"; // String | Cursor to fetch the next or previous page of results. The value of this property must be extracted from the 'prev_cursor' or 'next_cursor' property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints.
    String sort = "id"; // String | The field to sort results by. A property name with a prepended '-' signifies descending order.
    PermissionEnum permission = PermissionEnum.fromValue("READ"); // PermissionEnum | Restrict the objects, which are allowed.
    try {
      ListVDBsResponse result = apiInstance.getVdbs(limit, cursor, sort, permission);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdbsApi#getVdbs");
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
| **sort** | **String**| The field to sort results by. A property name with a prepended &#39;-&#39; signifies descending order. | [optional] [enum: id, -id, database_type, -database_type, name, -name, database_version, -database_version, size, -size, engine_id, -engine_id, status, -status, environment_id, -environment_id, ip_address, -ip_address, fqdn, -fqdn, parent_id, -parent_id, parent_dsource_id, -parent_dsource_id, group_name, -group_name, creation_date, -creation_date, last_refreshed_date, -last_refreshed_date, engine_name, -engine_name, storage_size, -storage_size, locked_by, -locked_by, locked_by_name, -locked_by_name, primary_object_id, -primary_object_id, primary_engine_id, -primary_engine_id, primary_engine_name, -primary_engine_name] |
| **permission** | [**PermissionEnum**](.md)| Restrict the objects, which are allowed. | [optional] [enum: READ, UPDATE, DELETE, EXECUTE, CANCEL, MIGRATE, REFRESH, DISABLE, ENABLE, ABANDON, VALIDATE, START, STOP, SNAPSHOT, COPY, REMOVE_JOB, PASSWORD_RESET, UNDO_IMPORT, IMPORT, PROVISION_FROM_BOOKMARK, PROVISION, REFRESH_FROM_BOOKMARK, REFRESH_FROM_SNAPSHOT, REFRESH_FROM_TIMESTAMP, CREATE_ENVIRONMENT, CREATE_BOOKMARK, CREATE_VDBGROUP, MANAGE_TAGS, LINK, REPLICATE, REPLICATE_TO, DELETE_BOOKMARK, UPDATE_BOOKMARK, READ_BOOKMARK, CONFIGURE_PREDEFINED_AUTO_TAGGING] |

### Return type

[**ListVDBsResponse**](ListVDBsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="lockVdb"></a>
# **lockVdb**
> VDB lockVdb(vdbId, lockVDBParameters)

Lock a VDB.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.VdbsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VdbsApi apiInstance = new VdbsApi(defaultClient);
    String vdbId = "vdbId_example"; // String | The ID of the VDB.
    LockVDBParameters lockVDBParameters = new LockVDBParameters(); // LockVDBParameters | The parameters to lock a VDB.
    try {
      VDB result = apiInstance.lockVdb(vdbId, lockVDBParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdbsApi#lockVdb");
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
| **vdbId** | **String**| The ID of the VDB. | |
| **lockVDBParameters** | [**LockVDBParameters**](LockVDBParameters.md)| The parameters to lock a VDB. | |

### Return type

[**VDB**](VDB.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | VDB is locked. |  -  |

<a id="provisionVdbByLocation"></a>
# **provisionVdbByLocation**
> ProvisionVDBResponse provisionVdbByLocation(provisionVDBByLocationParameters)

Provision a new VDB by location.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.VdbsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VdbsApi apiInstance = new VdbsApi(defaultClient);
    ProvisionVDBByLocationParameters provisionVDBByLocationParameters = new ProvisionVDBByLocationParameters(); // ProvisionVDBByLocationParameters | The parameters to provision a VDB.
    try {
      ProvisionVDBResponse result = apiInstance.provisionVdbByLocation(provisionVDBByLocationParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdbsApi#provisionVdbByLocation");
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
| **provisionVDBByLocationParameters** | [**ProvisionVDBByLocationParameters**](ProvisionVDBByLocationParameters.md)| The parameters to provision a VDB. | |

### Return type

[**ProvisionVDBResponse**](ProvisionVDBResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | VDB provisioning initiated. |  -  |

<a id="provisionVdbByLocationDefaults"></a>
# **provisionVdbByLocationDefaults**
> ProvisionVDBByLocationParameters provisionVdbByLocationDefaults(provisionVDBByLocationDefaultsRequest)

Get default provision parameters for provisioning a new VDB by location.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.VdbsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VdbsApi apiInstance = new VdbsApi(defaultClient);
    ProvisionVDBByLocationDefaultsRequest provisionVDBByLocationDefaultsRequest = new ProvisionVDBByLocationDefaultsRequest(); // ProvisionVDBByLocationDefaultsRequest | The request to get default VDB provision parameters for provisioning a new VDB by location.
    try {
      ProvisionVDBByLocationParameters result = apiInstance.provisionVdbByLocationDefaults(provisionVDBByLocationDefaultsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdbsApi#provisionVdbByLocationDefaults");
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
| **provisionVDBByLocationDefaultsRequest** | [**ProvisionVDBByLocationDefaultsRequest**](ProvisionVDBByLocationDefaultsRequest.md)| The request to get default VDB provision parameters for provisioning a new VDB by location. | |

### Return type

[**ProvisionVDBByLocationParameters**](ProvisionVDBByLocationParameters.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default VDB provisioning parameters. |  -  |

<a id="provisionVdbBySnapshot"></a>
# **provisionVdbBySnapshot**
> ProvisionVDBResponse provisionVdbBySnapshot(provisionVDBBySnapshotParameters)

Provision a new VDB by snapshot.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.VdbsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VdbsApi apiInstance = new VdbsApi(defaultClient);
    ProvisionVDBBySnapshotParameters provisionVDBBySnapshotParameters = new ProvisionVDBBySnapshotParameters(); // ProvisionVDBBySnapshotParameters | The parameters to provision a VDB.
    try {
      ProvisionVDBResponse result = apiInstance.provisionVdbBySnapshot(provisionVDBBySnapshotParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdbsApi#provisionVdbBySnapshot");
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
| **provisionVDBBySnapshotParameters** | [**ProvisionVDBBySnapshotParameters**](ProvisionVDBBySnapshotParameters.md)| The parameters to provision a VDB. | |

### Return type

[**ProvisionVDBResponse**](ProvisionVDBResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | VDB provisioning initiated. |  -  |

<a id="provisionVdbBySnapshotDefaults"></a>
# **provisionVdbBySnapshotDefaults**
> ProvisionVDBBySnapshotParameters provisionVdbBySnapshotDefaults(provisionVDBBySnapshotDefaultsRequest)

Get default provision parameters for provisioning a new VDB by snapshot.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.VdbsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VdbsApi apiInstance = new VdbsApi(defaultClient);
    ProvisionVDBBySnapshotDefaultsRequest provisionVDBBySnapshotDefaultsRequest = new ProvisionVDBBySnapshotDefaultsRequest(); // ProvisionVDBBySnapshotDefaultsRequest | The request to get default VDB provision parameters for provisioning a new VDB by snapshot.
    try {
      ProvisionVDBBySnapshotParameters result = apiInstance.provisionVdbBySnapshotDefaults(provisionVDBBySnapshotDefaultsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdbsApi#provisionVdbBySnapshotDefaults");
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
| **provisionVDBBySnapshotDefaultsRequest** | [**ProvisionVDBBySnapshotDefaultsRequest**](ProvisionVDBBySnapshotDefaultsRequest.md)| The request to get default VDB provision parameters for provisioning a new VDB by snapshot. | |

### Return type

[**ProvisionVDBBySnapshotParameters**](ProvisionVDBBySnapshotParameters.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default VDB provisioning parameters. |  -  |

<a id="provisionVdbByTimestamp"></a>
# **provisionVdbByTimestamp**
> ProvisionVDBResponse provisionVdbByTimestamp(provisionVDBByTimestampParameters)

Provision a new VDB by timestamp.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.VdbsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VdbsApi apiInstance = new VdbsApi(defaultClient);
    ProvisionVDBByTimestampParameters provisionVDBByTimestampParameters = new ProvisionVDBByTimestampParameters(); // ProvisionVDBByTimestampParameters | The parameters to provision a VDB.
    try {
      ProvisionVDBResponse result = apiInstance.provisionVdbByTimestamp(provisionVDBByTimestampParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdbsApi#provisionVdbByTimestamp");
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
| **provisionVDBByTimestampParameters** | [**ProvisionVDBByTimestampParameters**](ProvisionVDBByTimestampParameters.md)| The parameters to provision a VDB. | |

### Return type

[**ProvisionVDBResponse**](ProvisionVDBResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | VDB provisioning initiated. |  -  |

<a id="provisionVdbByTimestampDefaults"></a>
# **provisionVdbByTimestampDefaults**
> ProvisionVDBByTimestampParameters provisionVdbByTimestampDefaults(provisionVDBByTimestampDefaultsRequest)

Get default provision parameters for provisioning a new VDB by timestamp.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.VdbsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VdbsApi apiInstance = new VdbsApi(defaultClient);
    ProvisionVDBByTimestampDefaultsRequest provisionVDBByTimestampDefaultsRequest = new ProvisionVDBByTimestampDefaultsRequest(); // ProvisionVDBByTimestampDefaultsRequest | The request to get default VDB provision parameters for provisioning a new VDB by timestamp.
    try {
      ProvisionVDBByTimestampParameters result = apiInstance.provisionVdbByTimestampDefaults(provisionVDBByTimestampDefaultsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdbsApi#provisionVdbByTimestampDefaults");
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
| **provisionVDBByTimestampDefaultsRequest** | [**ProvisionVDBByTimestampDefaultsRequest**](ProvisionVDBByTimestampDefaultsRequest.md)| The request to get default VDB provision parameters for provisioning a new VDB by timestamp. | |

### Return type

[**ProvisionVDBByTimestampParameters**](ProvisionVDBByTimestampParameters.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default VDB provisioning parameters. |  -  |

<a id="provisionVdbFromBookmark"></a>
# **provisionVdbFromBookmark**
> ProvisionVDBResponse provisionVdbFromBookmark(provisionVDBFromBookmarkParameters)

Provision a new VDB from a bookmark with a single VDB.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.VdbsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VdbsApi apiInstance = new VdbsApi(defaultClient);
    ProvisionVDBFromBookmarkParameters provisionVDBFromBookmarkParameters = new ProvisionVDBFromBookmarkParameters(); // ProvisionVDBFromBookmarkParameters | The parameters to provision a VDB.
    try {
      ProvisionVDBResponse result = apiInstance.provisionVdbFromBookmark(provisionVDBFromBookmarkParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdbsApi#provisionVdbFromBookmark");
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
| **provisionVDBFromBookmarkParameters** | [**ProvisionVDBFromBookmarkParameters**](ProvisionVDBFromBookmarkParameters.md)| The parameters to provision a VDB. | |

### Return type

[**ProvisionVDBResponse**](ProvisionVDBResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | VDB provisioning initiated. |  -  |

<a id="provisionVdbFromBookmarkDefaults"></a>
# **provisionVdbFromBookmarkDefaults**
> ProvisionVDBFromBookmarkParameters provisionVdbFromBookmarkDefaults(provisionVDBFromBookmarkDefaultsRequest)

Get default provision parameters for provisioning a new VDB from a bookmark.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.VdbsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VdbsApi apiInstance = new VdbsApi(defaultClient);
    ProvisionVDBFromBookmarkDefaultsRequest provisionVDBFromBookmarkDefaultsRequest = new ProvisionVDBFromBookmarkDefaultsRequest(); // ProvisionVDBFromBookmarkDefaultsRequest | The request to get default VDB provision parameters for provisioning a new VDB from a bookmark.
    try {
      ProvisionVDBFromBookmarkParameters result = apiInstance.provisionVdbFromBookmarkDefaults(provisionVDBFromBookmarkDefaultsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdbsApi#provisionVdbFromBookmarkDefaults");
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
| **provisionVDBFromBookmarkDefaultsRequest** | [**ProvisionVDBFromBookmarkDefaultsRequest**](ProvisionVDBFromBookmarkDefaultsRequest.md)| The request to get default VDB provision parameters for provisioning a new VDB from a bookmark. | |

### Return type

[**ProvisionVDBFromBookmarkParameters**](ProvisionVDBFromBookmarkParameters.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default VDB provisioning parameters. |  -  |

<a id="refreshVdbByLocation"></a>
# **refreshVdbByLocation**
> RefreshVDBByLocationResponse refreshVdbByLocation(vdbId, refreshVDBByLocationParameters)

Refresh a VDB by location.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.VdbsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VdbsApi apiInstance = new VdbsApi(defaultClient);
    String vdbId = "vdbId_example"; // String | The ID of the VDB.
    RefreshVDBByLocationParameters refreshVDBByLocationParameters = new RefreshVDBByLocationParameters(); // RefreshVDBByLocationParameters | The parameters to refresh a VDB.
    try {
      RefreshVDBByLocationResponse result = apiInstance.refreshVdbByLocation(vdbId, refreshVDBByLocationParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdbsApi#refreshVdbByLocation");
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
| **vdbId** | **String**| The ID of the VDB. | |
| **refreshVDBByLocationParameters** | [**RefreshVDBByLocationParameters**](RefreshVDBByLocationParameters.md)| The parameters to refresh a VDB. | [optional] |

### Return type

[**RefreshVDBByLocationResponse**](RefreshVDBByLocationResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | VDB refresh initiated. |  -  |

<a id="refreshVdbBySnapshot"></a>
# **refreshVdbBySnapshot**
> RefreshVDBBySnapshotResponse refreshVdbBySnapshot(vdbId, refreshVDBBySnapshotParameters)

Refresh a VDB by snapshot.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.VdbsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VdbsApi apiInstance = new VdbsApi(defaultClient);
    String vdbId = "vdbId_example"; // String | The ID of the VDB.
    RefreshVDBBySnapshotParameters refreshVDBBySnapshotParameters = new RefreshVDBBySnapshotParameters(); // RefreshVDBBySnapshotParameters | The parameters to refresh a VDB.
    try {
      RefreshVDBBySnapshotResponse result = apiInstance.refreshVdbBySnapshot(vdbId, refreshVDBBySnapshotParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdbsApi#refreshVdbBySnapshot");
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
| **vdbId** | **String**| The ID of the VDB. | |
| **refreshVDBBySnapshotParameters** | [**RefreshVDBBySnapshotParameters**](RefreshVDBBySnapshotParameters.md)| The parameters to refresh a VDB. | [optional] |

### Return type

[**RefreshVDBBySnapshotResponse**](RefreshVDBBySnapshotResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | VDB refresh initiated. |  -  |

<a id="refreshVdbByTimestamp"></a>
# **refreshVdbByTimestamp**
> RefreshVDBByTimestampResponse refreshVdbByTimestamp(vdbId, refreshVDBByTimestampParameters)

Refresh a VDB by timestamp.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.VdbsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VdbsApi apiInstance = new VdbsApi(defaultClient);
    String vdbId = "vdbId_example"; // String | The ID of the VDB.
    RefreshVDBByTimestampParameters refreshVDBByTimestampParameters = new RefreshVDBByTimestampParameters(); // RefreshVDBByTimestampParameters | The parameters to refresh a VDB.
    try {
      RefreshVDBByTimestampResponse result = apiInstance.refreshVdbByTimestamp(vdbId, refreshVDBByTimestampParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdbsApi#refreshVdbByTimestamp");
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
| **vdbId** | **String**| The ID of the VDB. | |
| **refreshVDBByTimestampParameters** | [**RefreshVDBByTimestampParameters**](RefreshVDBByTimestampParameters.md)| The parameters to refresh a VDB. | [optional] |

### Return type

[**RefreshVDBByTimestampResponse**](RefreshVDBByTimestampResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | VDB refresh initiated. |  -  |

<a id="refreshVdbFromBookmark"></a>
# **refreshVdbFromBookmark**
> RefreshVDBFromBookmarkResponse refreshVdbFromBookmark(vdbId, refreshVDBFromBookmarkParameters)

Refresh a VDB from bookmark with a single VDB.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.VdbsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VdbsApi apiInstance = new VdbsApi(defaultClient);
    String vdbId = "vdbId_example"; // String | The ID of the VDB.
    RefreshVDBFromBookmarkParameters refreshVDBFromBookmarkParameters = new RefreshVDBFromBookmarkParameters(); // RefreshVDBFromBookmarkParameters | The parameters to refresh a VDB.
    try {
      RefreshVDBFromBookmarkResponse result = apiInstance.refreshVdbFromBookmark(vdbId, refreshVDBFromBookmarkParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdbsApi#refreshVdbFromBookmark");
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
| **vdbId** | **String**| The ID of the VDB. | |
| **refreshVDBFromBookmarkParameters** | [**RefreshVDBFromBookmarkParameters**](RefreshVDBFromBookmarkParameters.md)| The parameters to refresh a VDB. | [optional] |

### Return type

[**RefreshVDBFromBookmarkResponse**](RefreshVDBFromBookmarkResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | VDB refresh initiated. |  -  |

<a id="rollbackVdbBySnapshot"></a>
# **rollbackVdbBySnapshot**
> RollbackVDBBySnapshotResponse rollbackVdbBySnapshot(vdbId, rollbackVDBBySnapshotParameters)

Rollback a VDB by snapshot.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.VdbsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VdbsApi apiInstance = new VdbsApi(defaultClient);
    String vdbId = "vdbId_example"; // String | The ID of the VDB.
    RollbackVDBBySnapshotParameters rollbackVDBBySnapshotParameters = new RollbackVDBBySnapshotParameters(); // RollbackVDBBySnapshotParameters | The parameters to rollback a VDB.
    try {
      RollbackVDBBySnapshotResponse result = apiInstance.rollbackVdbBySnapshot(vdbId, rollbackVDBBySnapshotParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdbsApi#rollbackVdbBySnapshot");
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
| **vdbId** | **String**| The ID of the VDB. | |
| **rollbackVDBBySnapshotParameters** | [**RollbackVDBBySnapshotParameters**](RollbackVDBBySnapshotParameters.md)| The parameters to rollback a VDB. | [optional] |

### Return type

[**RollbackVDBBySnapshotResponse**](RollbackVDBBySnapshotResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | VDB rollback initiated. |  -  |

<a id="rollbackVdbByTimestamp"></a>
# **rollbackVdbByTimestamp**
> RollbackVDBByTimestampResponse rollbackVdbByTimestamp(vdbId, rollbackVDBByTimestampParameters)

Rollback a VDB by timestamp.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.VdbsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VdbsApi apiInstance = new VdbsApi(defaultClient);
    String vdbId = "vdbId_example"; // String | The ID of the VDB.
    RollbackVDBByTimestampParameters rollbackVDBByTimestampParameters = new RollbackVDBByTimestampParameters(); // RollbackVDBByTimestampParameters | The parameters to rollback a VDB.
    try {
      RollbackVDBByTimestampResponse result = apiInstance.rollbackVdbByTimestamp(vdbId, rollbackVDBByTimestampParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdbsApi#rollbackVdbByTimestamp");
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
| **vdbId** | **String**| The ID of the VDB. | |
| **rollbackVDBByTimestampParameters** | [**RollbackVDBByTimestampParameters**](RollbackVDBByTimestampParameters.md)| The parameters to rollback a VDB. | [optional] |

### Return type

[**RollbackVDBByTimestampResponse**](RollbackVDBByTimestampResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | VDB rollback initiated. |  -  |

<a id="rollbackVdbFromBookmark"></a>
# **rollbackVdbFromBookmark**
> RollbackVDBFromBookmarkResponse rollbackVdbFromBookmark(vdbId, rollbackVDBFromBookmarkParameters)

Rollback a VDB from a bookmark with only the same VDB.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.VdbsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VdbsApi apiInstance = new VdbsApi(defaultClient);
    String vdbId = "vdbId_example"; // String | The ID of the VDB.
    RollbackVDBFromBookmarkParameters rollbackVDBFromBookmarkParameters = new RollbackVDBFromBookmarkParameters(); // RollbackVDBFromBookmarkParameters | The parameters to rollback a VDB.
    try {
      RollbackVDBFromBookmarkResponse result = apiInstance.rollbackVdbFromBookmark(vdbId, rollbackVDBFromBookmarkParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdbsApi#rollbackVdbFromBookmark");
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
| **vdbId** | **String**| The ID of the VDB. | |
| **rollbackVDBFromBookmarkParameters** | [**RollbackVDBFromBookmarkParameters**](RollbackVDBFromBookmarkParameters.md)| The parameters to rollback a VDB. | [optional] |

### Return type

[**RollbackVDBFromBookmarkResponse**](RollbackVDBFromBookmarkResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | VDB rollback initiated. |  -  |

<a id="searchBookmarksByVdb"></a>
# **searchBookmarksByVdb**
> SearchBookmarksByVDBResponse searchBookmarksByVdb(vdbId, limit, cursor, sort, searchBody)

Search Bookmarks compatible with this VDB.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.VdbsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VdbsApi apiInstance = new VdbsApi(defaultClient);
    String vdbId = "vdbId_example"; // String | The ID of the VDB.
    Integer limit = 100; // Integer | Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100.
    String cursor = "cursor_example"; // String | Cursor to fetch the next or previous page of results. The value of this property must be extracted from the 'prev_cursor' or 'next_cursor' property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints.
    String sort = "id"; // String | The field to sort results by. A property name with a prepended '-' signifies descending order.
    SearchBody searchBody = new SearchBody(); // SearchBody | A request body containing a filter expression. This enables searching for items matching arbitrarily complex conditions. The list of attributes which can be used in filter expressions is available in the x-filterable vendor extension.  # Filter Expression Overview **Note: All keywords are case-insensitive**  ## Comparison Operators | Operator | Description | Example | | --- | --- | --- | | CONTAINS | Substring or membership testing for string and list attributes respectively. | field3 CONTAINS 'foobar', field4 CONTAINS TRUE  | | IN | Tests if field is a member of a list literal. List can contain a maximum of 100 values | field2 IN ['Goku', 'Vegeta'] | | GE | Tests if a field is greater than or equal to a literal value | field1 GE 1.2e-2 | | GT | Tests if a field is greater than a literal value | field1 GT 1.2e-2 | | LE | Tests if a field is less than or equal to a literal value | field1 LE 9000 | | LT | Tests if a field is less than a literal value | field1 LT 9.02 | | NE | Tests if a field is not equal to a literal value | field1 NE 42 | | EQ | Tests if a field is equal to a literal value | field1 EQ 42 |  ## Search Operator The SEARCH operator filters for items which have any filterable attribute that contains the input string as a substring, comparison is done case-insensitively. This is not restricted to attributes with string values. Specifically `SEARCH '12'` would match an item with an attribute with an integer value of `123`.  ## Logical Operators Ordered by precedence. | Operator | Description | Example | | --- | --- | --- | | NOT | Logical NOT (Right associative) | NOT field1 LE 9000 | | AND | Logical AND (Left Associative) | field1 GT 9000 AND field2 EQ 'Goku' | | OR | Logical OR (Left Associative) | field1 GT 9000 OR field2 EQ 'Goku' |  ## Grouping Parenthesis `()` can be used to override operator precedence.  For example: NOT (field1 LT 1234 AND field2 CONTAINS 'foo')  ## Literal Values | Literal      | Description | Examples | | --- | --- | --- | | Nil | Represents the absence of a value | nil, Nil, nIl, NIL | | Boolean | true/false boolean | true, false, True, False, TRUE, FALSE | | Number | Signed integer and floating point numbers. Also supports scientific notation. | 0, 1, -1, 1.2, 0.35, 1.2e-2, -1.2e+2 | | String | Single or double quoted | \"foo\", \"bar\", \"foo bar\", 'foo', 'bar', 'foo bar' | | Datetime | Formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) | 2018-04-27T18:39:26.397237+00:00 | | List | Comma-separated literals wrapped in square brackets | [0], [0, 1], ['foo', \"bar\"] |  ## Limitations - A maximum of 8 unique identifiers may be used inside a filter expression. 
    try {
      SearchBookmarksByVDBResponse result = apiInstance.searchBookmarksByVdb(vdbId, limit, cursor, sort, searchBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdbsApi#searchBookmarksByVdb");
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
| **vdbId** | **String**| The ID of the VDB. | |
| **limit** | **Integer**| Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100. | [optional] [default to 100] |
| **cursor** | **String**| Cursor to fetch the next or previous page of results. The value of this property must be extracted from the &#39;prev_cursor&#39; or &#39;next_cursor&#39; property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints. | [optional] |
| **sort** | **String**| The field to sort results by. A property name with a prepended &#39;-&#39; signifies descending order. | [optional] [enum: id, -id, name, -name, creation_date, -creation_date, vdb_ids, -vdb_ids, retention, -retention, expiration, -expiration] |
| **searchBody** | [**SearchBody**](SearchBody.md)| A request body containing a filter expression. This enables searching for items matching arbitrarily complex conditions. The list of attributes which can be used in filter expressions is available in the x-filterable vendor extension.  # Filter Expression Overview **Note: All keywords are case-insensitive**  ## Comparison Operators | Operator | Description | Example | | --- | --- | --- | | CONTAINS | Substring or membership testing for string and list attributes respectively. | field3 CONTAINS &#39;foobar&#39;, field4 CONTAINS TRUE  | | IN | Tests if field is a member of a list literal. List can contain a maximum of 100 values | field2 IN [&#39;Goku&#39;, &#39;Vegeta&#39;] | | GE | Tests if a field is greater than or equal to a literal value | field1 GE 1.2e-2 | | GT | Tests if a field is greater than a literal value | field1 GT 1.2e-2 | | LE | Tests if a field is less than or equal to a literal value | field1 LE 9000 | | LT | Tests if a field is less than a literal value | field1 LT 9.02 | | NE | Tests if a field is not equal to a literal value | field1 NE 42 | | EQ | Tests if a field is equal to a literal value | field1 EQ 42 |  ## Search Operator The SEARCH operator filters for items which have any filterable attribute that contains the input string as a substring, comparison is done case-insensitively. This is not restricted to attributes with string values. Specifically &#x60;SEARCH &#39;12&#39;&#x60; would match an item with an attribute with an integer value of &#x60;123&#x60;.  ## Logical Operators Ordered by precedence. | Operator | Description | Example | | --- | --- | --- | | NOT | Logical NOT (Right associative) | NOT field1 LE 9000 | | AND | Logical AND (Left Associative) | field1 GT 9000 AND field2 EQ &#39;Goku&#39; | | OR | Logical OR (Left Associative) | field1 GT 9000 OR field2 EQ &#39;Goku&#39; |  ## Grouping Parenthesis &#x60;()&#x60; can be used to override operator precedence.  For example: NOT (field1 LT 1234 AND field2 CONTAINS &#39;foo&#39;)  ## Literal Values | Literal      | Description | Examples | | --- | --- | --- | | Nil | Represents the absence of a value | nil, Nil, nIl, NIL | | Boolean | true/false boolean | true, false, True, False, TRUE, FALSE | | Number | Signed integer and floating point numbers. Also supports scientific notation. | 0, 1, -1, 1.2, 0.35, 1.2e-2, -1.2e+2 | | String | Single or double quoted | \&quot;foo\&quot;, \&quot;bar\&quot;, \&quot;foo bar\&quot;, &#39;foo&#39;, &#39;bar&#39;, &#39;foo bar&#39; | | Datetime | Formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) | 2018-04-27T18:39:26.397237+00:00 | | List | Comma-separated literals wrapped in square brackets | [0], [0, 1], [&#39;foo&#39;, \&quot;bar\&quot;] |  ## Limitations - A maximum of 8 unique identifiers may be used inside a filter expression.  | [optional] |

### Return type

[**SearchBookmarksByVDBResponse**](SearchBookmarksByVDBResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="searchVdbs"></a>
# **searchVdbs**
> SearchVDBsResponse searchVdbs(limit, cursor, sort, permission, searchBody)

Search for VDBs.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.VdbsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VdbsApi apiInstance = new VdbsApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100.
    String cursor = "cursor_example"; // String | Cursor to fetch the next or previous page of results. The value of this property must be extracted from the 'prev_cursor' or 'next_cursor' property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints.
    String sort = "id"; // String | The field to sort results by. A property name with a prepended '-' signifies descending order.
    PermissionEnum permission = PermissionEnum.fromValue("READ"); // PermissionEnum | Restrict the objects, which are allowed.
    SearchBody searchBody = new SearchBody(); // SearchBody | A request body containing a filter expression. This enables searching for items matching arbitrarily complex conditions. The list of attributes which can be used in filter expressions is available in the x-filterable vendor extension.  # Filter Expression Overview **Note: All keywords are case-insensitive**  ## Comparison Operators | Operator | Description | Example | | --- | --- | --- | | CONTAINS | Substring or membership testing for string and list attributes respectively. | field3 CONTAINS 'foobar', field4 CONTAINS TRUE  | | IN | Tests if field is a member of a list literal. List can contain a maximum of 100 values | field2 IN ['Goku', 'Vegeta'] | | GE | Tests if a field is greater than or equal to a literal value | field1 GE 1.2e-2 | | GT | Tests if a field is greater than a literal value | field1 GT 1.2e-2 | | LE | Tests if a field is less than or equal to a literal value | field1 LE 9000 | | LT | Tests if a field is less than a literal value | field1 LT 9.02 | | NE | Tests if a field is not equal to a literal value | field1 NE 42 | | EQ | Tests if a field is equal to a literal value | field1 EQ 42 |  ## Search Operator The SEARCH operator filters for items which have any filterable attribute that contains the input string as a substring, comparison is done case-insensitively. This is not restricted to attributes with string values. Specifically `SEARCH '12'` would match an item with an attribute with an integer value of `123`.  ## Logical Operators Ordered by precedence. | Operator | Description | Example | | --- | --- | --- | | NOT | Logical NOT (Right associative) | NOT field1 LE 9000 | | AND | Logical AND (Left Associative) | field1 GT 9000 AND field2 EQ 'Goku' | | OR | Logical OR (Left Associative) | field1 GT 9000 OR field2 EQ 'Goku' |  ## Grouping Parenthesis `()` can be used to override operator precedence.  For example: NOT (field1 LT 1234 AND field2 CONTAINS 'foo')  ## Literal Values | Literal      | Description | Examples | | --- | --- | --- | | Nil | Represents the absence of a value | nil, Nil, nIl, NIL | | Boolean | true/false boolean | true, false, True, False, TRUE, FALSE | | Number | Signed integer and floating point numbers. Also supports scientific notation. | 0, 1, -1, 1.2, 0.35, 1.2e-2, -1.2e+2 | | String | Single or double quoted | \"foo\", \"bar\", \"foo bar\", 'foo', 'bar', 'foo bar' | | Datetime | Formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) | 2018-04-27T18:39:26.397237+00:00 | | List | Comma-separated literals wrapped in square brackets | [0], [0, 1], ['foo', \"bar\"] |  ## Limitations - A maximum of 8 unique identifiers may be used inside a filter expression. 
    try {
      SearchVDBsResponse result = apiInstance.searchVdbs(limit, cursor, sort, permission, searchBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdbsApi#searchVdbs");
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
| **sort** | **String**| The field to sort results by. A property name with a prepended &#39;-&#39; signifies descending order. | [optional] [enum: id, -id, database_type, -database_type, name, -name, database_version, -database_version, size, -size, engine_id, -engine_id, status, -status, environment_id, -environment_id, ip_address, -ip_address, fqdn, -fqdn, parent_id, -parent_id, parent_dsource_id, -parent_dsource_id, group_name, -group_name, creation_date, -creation_date, last_refreshed_date, -last_refreshed_date, engine_name, -engine_name, storage_size, -storage_size, locked_by, -locked_by, locked_by_name, -locked_by_name, primary_object_id, -primary_object_id, primary_engine_id, -primary_engine_id, primary_engine_name, -primary_engine_name] |
| **permission** | [**PermissionEnum**](.md)| Restrict the objects, which are allowed. | [optional] [enum: READ, UPDATE, DELETE, EXECUTE, CANCEL, MIGRATE, REFRESH, DISABLE, ENABLE, ABANDON, VALIDATE, START, STOP, SNAPSHOT, COPY, REMOVE_JOB, PASSWORD_RESET, UNDO_IMPORT, IMPORT, PROVISION_FROM_BOOKMARK, PROVISION, REFRESH_FROM_BOOKMARK, REFRESH_FROM_SNAPSHOT, REFRESH_FROM_TIMESTAMP, CREATE_ENVIRONMENT, CREATE_BOOKMARK, CREATE_VDBGROUP, MANAGE_TAGS, LINK, REPLICATE, REPLICATE_TO, DELETE_BOOKMARK, UPDATE_BOOKMARK, READ_BOOKMARK, CONFIGURE_PREDEFINED_AUTO_TAGGING] |
| **searchBody** | [**SearchBody**](SearchBody.md)| A request body containing a filter expression. This enables searching for items matching arbitrarily complex conditions. The list of attributes which can be used in filter expressions is available in the x-filterable vendor extension.  # Filter Expression Overview **Note: All keywords are case-insensitive**  ## Comparison Operators | Operator | Description | Example | | --- | --- | --- | | CONTAINS | Substring or membership testing for string and list attributes respectively. | field3 CONTAINS &#39;foobar&#39;, field4 CONTAINS TRUE  | | IN | Tests if field is a member of a list literal. List can contain a maximum of 100 values | field2 IN [&#39;Goku&#39;, &#39;Vegeta&#39;] | | GE | Tests if a field is greater than or equal to a literal value | field1 GE 1.2e-2 | | GT | Tests if a field is greater than a literal value | field1 GT 1.2e-2 | | LE | Tests if a field is less than or equal to a literal value | field1 LE 9000 | | LT | Tests if a field is less than a literal value | field1 LT 9.02 | | NE | Tests if a field is not equal to a literal value | field1 NE 42 | | EQ | Tests if a field is equal to a literal value | field1 EQ 42 |  ## Search Operator The SEARCH operator filters for items which have any filterable attribute that contains the input string as a substring, comparison is done case-insensitively. This is not restricted to attributes with string values. Specifically &#x60;SEARCH &#39;12&#39;&#x60; would match an item with an attribute with an integer value of &#x60;123&#x60;.  ## Logical Operators Ordered by precedence. | Operator | Description | Example | | --- | --- | --- | | NOT | Logical NOT (Right associative) | NOT field1 LE 9000 | | AND | Logical AND (Left Associative) | field1 GT 9000 AND field2 EQ &#39;Goku&#39; | | OR | Logical OR (Left Associative) | field1 GT 9000 OR field2 EQ &#39;Goku&#39; |  ## Grouping Parenthesis &#x60;()&#x60; can be used to override operator precedence.  For example: NOT (field1 LT 1234 AND field2 CONTAINS &#39;foo&#39;)  ## Literal Values | Literal      | Description | Examples | | --- | --- | --- | | Nil | Represents the absence of a value | nil, Nil, nIl, NIL | | Boolean | true/false boolean | true, false, True, False, TRUE, FALSE | | Number | Signed integer and floating point numbers. Also supports scientific notation. | 0, 1, -1, 1.2, 0.35, 1.2e-2, -1.2e+2 | | String | Single or double quoted | \&quot;foo\&quot;, \&quot;bar\&quot;, \&quot;foo bar\&quot;, &#39;foo&#39;, &#39;bar&#39;, &#39;foo bar&#39; | | Datetime | Formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) | 2018-04-27T18:39:26.397237+00:00 | | List | Comma-separated literals wrapped in square brackets | [0], [0, 1], [&#39;foo&#39;, \&quot;bar\&quot;] |  ## Limitations - A maximum of 8 unique identifiers may be used inside a filter expression.  | [optional] |

### Return type

[**SearchVDBsResponse**](SearchVDBsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="snapshotVdb"></a>
# **snapshotVdb**
> SnapshotVDBResponse snapshotVdb(vdbId)

Snapshot a VDB.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.VdbsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VdbsApi apiInstance = new VdbsApi(defaultClient);
    String vdbId = "vdbId_example"; // String | The ID of the VDB.
    try {
      SnapshotVDBResponse result = apiInstance.snapshotVdb(vdbId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdbsApi#snapshotVdb");
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
| **vdbId** | **String**| The ID of the VDB. | |

### Return type

[**SnapshotVDBResponse**](SnapshotVDBResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | VDB snapshot initiated. |  -  |

<a id="startVdb"></a>
# **startVdb**
> StartVDBResponse startVdb(vdbId)

Start a VDB.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.VdbsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VdbsApi apiInstance = new VdbsApi(defaultClient);
    String vdbId = "vdbId_example"; // String | The ID of the VDB.
    try {
      StartVDBResponse result = apiInstance.startVdb(vdbId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdbsApi#startVdb");
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
| **vdbId** | **String**| The ID of the VDB. | |

### Return type

[**StartVDBResponse**](StartVDBResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | VDB start initiated. |  -  |

<a id="stopVdb"></a>
# **stopVdb**
> StopVDBResponse stopVdb(vdbId)

Stop a VDB.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.VdbsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VdbsApi apiInstance = new VdbsApi(defaultClient);
    String vdbId = "vdbId_example"; // String | The ID of the VDB.
    try {
      StopVDBResponse result = apiInstance.stopVdb(vdbId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdbsApi#stopVdb");
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
| **vdbId** | **String**| The ID of the VDB. | |

### Return type

[**StopVDBResponse**](StopVDBResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | VDB stop initiated. |  -  |

<a id="switchTimeflow"></a>
# **switchTimeflow**
> SwitchTimeflowResponse switchTimeflow(vdbId, switchTimeflowParameters)

Switches the current timeflow of a VDB.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.VdbsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VdbsApi apiInstance = new VdbsApi(defaultClient);
    String vdbId = "vdbId_example"; // String | The ID of the VDB.
    SwitchTimeflowParameters switchTimeflowParameters = new SwitchTimeflowParameters(); // SwitchTimeflowParameters | The parameters to switch the timeflow of a VDB.
    try {
      SwitchTimeflowResponse result = apiInstance.switchTimeflow(vdbId, switchTimeflowParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdbsApi#switchTimeflow");
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
| **vdbId** | **String**| The ID of the VDB. | |
| **switchTimeflowParameters** | [**SwitchTimeflowParameters**](SwitchTimeflowParameters.md)| The parameters to switch the timeflow of a VDB. | [optional] |

### Return type

[**SwitchTimeflowResponse**](SwitchTimeflowResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Switch timeflow initiated. |  -  |

<a id="unlockVdb"></a>
# **unlockVdb**
> VDB unlockVdb(vdbId)

Unlock a VDB.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.VdbsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VdbsApi apiInstance = new VdbsApi(defaultClient);
    String vdbId = "vdbId_example"; // String | The ID of the VDB.
    try {
      VDB result = apiInstance.unlockVdb(vdbId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdbsApi#unlockVdb");
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
| **vdbId** | **String**| The ID of the VDB. | |

### Return type

[**VDB**](VDB.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | VDB is unlocked. |  -  |

<a id="updateVdbById"></a>
# **updateVdbById**
> UpdateVDBResponse updateVdbById(vdbId, updateVDBParameters)

Update values of a VDB

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.VdbsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VdbsApi apiInstance = new VdbsApi(defaultClient);
    String vdbId = "vdbId_example"; // String | The ID of the VDB.
    UpdateVDBParameters updateVDBParameters = new UpdateVDBParameters(); // UpdateVDBParameters | The new data to update a VDB.
    try {
      UpdateVDBResponse result = apiInstance.updateVdbById(vdbId, updateVDBParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VdbsApi#updateVdbById");
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
| **vdbId** | **String**| The ID of the VDB. | |
| **updateVDBParameters** | [**UpdateVDBParameters**](UpdateVDBParameters.md)| The new data to update a VDB. | [optional] |

### Return type

[**UpdateVDBResponse**](UpdateVDBResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


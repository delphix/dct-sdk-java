# DSourcesApi

All URIs are relative to */v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTagsDsource**](DSourcesApi.md#createTagsDsource) | **POST** /dsources/{dsourceId}/tags | Create tags for a dSource. |
| [**deleteDsource**](DSourcesApi.md#deleteDsource) | **POST** /dsources/delete | Delete the specified dSource. |
| [**deleteTagsDsource**](DSourcesApi.md#deleteTagsDsource) | **POST** /dsources/{dsourceId}/tags/delete | Delete tags for a dSource. |
| [**disableDsource**](DSourcesApi.md#disableDsource) | **POST** /dsources/{dsourceId}/disable | Disable a dSource. |
| [**enableDsource**](DSourcesApi.md#enableDsource) | **POST** /dsources/{dsourceId}/enable | Enable a dSource. |
| [**getAppdataDsourceLinkingDefaults**](DSourcesApi.md#getAppdataDsourceLinkingDefaults) | **POST** /dsources/appdata/defaults | Get defaults for an AppData dSource linking. |
| [**getAseDsourceLinkingDefaults**](DSourcesApi.md#getAseDsourceLinkingDefaults) | **POST** /dsources/ase/defaults | Get defaults for an ASE dSource linking. |
| [**getDsourceById**](DSourcesApi.md#getDsourceById) | **GET** /dsources/{dsourceId} | Get a dSource by ID. |
| [**getDsourceSnapshots**](DSourcesApi.md#getDsourceSnapshots) | **GET** /dsources/{dsourceId}/snapshots | List Snapshots for a dSource. |
| [**getDsources**](DSourcesApi.md#getDsources) | **GET** /dsources | List all dSources. |
| [**getMssqlDsourceLinkingDefaults**](DSourcesApi.md#getMssqlDsourceLinkingDefaults) | **POST** /dsources/mssql/defaults | Get defaults for a MSSql dSource linking. |
| [**getMssqlStagingPushDsourceLinkingDefaults**](DSourcesApi.md#getMssqlStagingPushDsourceLinkingDefaults) | **POST** /dsources/mssql/staging-push/defaults | Get defaults for a MSSql staging push dSource linking. |
| [**getOracleDsourceLinkingDefaults**](DSourcesApi.md#getOracleDsourceLinkingDefaults) | **POST** /dsources/oracle/defaults | Get defaults for dSource linking. |
| [**getOracleStagingPushDsourceLinkingDefaults**](DSourcesApi.md#getOracleStagingPushDsourceLinkingDefaults) | **POST** /dsources/oracle/staging-push/defaults | Get defaults for a Oracle staging push dSource linking. |
| [**getTagsDsource**](DSourcesApi.md#getTagsDsource) | **GET** /dsources/{dsourceId}/tags | Get tags for a dSource. |
| [**linkAppdataDatabase**](DSourcesApi.md#linkAppdataDatabase) | **POST** /dsources/appdata | Link an AppData database as dSource. |
| [**linkAseDatabase**](DSourcesApi.md#linkAseDatabase) | **POST** /dsources/ase | Link an ASE database as dSource. |
| [**linkMssqlDatabase**](DSourcesApi.md#linkMssqlDatabase) | **POST** /dsources/mssql | Link a MSSql database as dSource. |
| [**linkMssqlStagingPushDatabase**](DSourcesApi.md#linkMssqlStagingPushDatabase) | **POST** /dsources/mssql/staging-push | Link a MSSql staging push database as dSource. |
| [**linkOracleDatabase**](DSourcesApi.md#linkOracleDatabase) | **POST** /dsources/oracle | Link Oracle database as dSource. |
| [**linkOracleStagingPushDatabase**](DSourcesApi.md#linkOracleStagingPushDatabase) | **POST** /dsources/oracle/staging-push | Link an Oracle staging push database as dSource. |
| [**searchDsources**](DSourcesApi.md#searchDsources) | **POST** /dsources/search | Search for dSources. |
| [**snapshotDsource**](DSourcesApi.md#snapshotDsource) | **POST** /dsources/{dsourceId}/snapshots | Snapshot a dSource. |


<a id="createTagsDsource"></a>
# **createTagsDsource**
> TagsResponse createTagsDsource(dsourceId, tagsRequest)

Create tags for a dSource.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.DSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DSourcesApi apiInstance = new DSourcesApi(defaultClient);
    String dsourceId = "dsourceId_example"; // String | The ID of the dSource.
    TagsRequest tagsRequest = new TagsRequest(); // TagsRequest | Tags information for DSource.
    try {
      TagsResponse result = apiInstance.createTagsDsource(dsourceId, tagsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DSourcesApi#createTagsDsource");
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
| **dsourceId** | **String**| The ID of the dSource. | |
| **tagsRequest** | [**TagsRequest**](TagsRequest.md)| Tags information for DSource. | |

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
| **201** | Ok |  -  |

<a id="deleteDsource"></a>
# **deleteDsource**
> Job deleteDsource(deleteDSourceRequest)

Delete the specified dSource.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.DSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DSourcesApi apiInstance = new DSourcesApi(defaultClient);
    DeleteDSourceRequest deleteDSourceRequest = new DeleteDSourceRequest(); // DeleteDSourceRequest | 
    try {
      Job result = apiInstance.deleteDsource(deleteDSourceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DSourcesApi#deleteDsource");
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
| **deleteDSourceRequest** | [**DeleteDSourceRequest**](DeleteDSourceRequest.md)|  | |

### Return type

[**Job**](Job.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteTagsDsource"></a>
# **deleteTagsDsource**
> deleteTagsDsource(dsourceId, deleteTag)

Delete tags for a dSource.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.DSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DSourcesApi apiInstance = new DSourcesApi(defaultClient);
    String dsourceId = "dsourceId_example"; // String | The ID of the dSource.
    DeleteTag deleteTag = new DeleteTag(); // DeleteTag | The parameters to delete tags
    try {
      apiInstance.deleteTagsDsource(dsourceId, deleteTag);
    } catch (ApiException e) {
      System.err.println("Exception when calling DSourcesApi#deleteTagsDsource");
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
| **dsourceId** | **String**| The ID of the dSource. | |
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

<a id="disableDsource"></a>
# **disableDsource**
> DisableDsourceResponse disableDsource(dsourceId, disableDsourceParameters)

Disable a dSource.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.DSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DSourcesApi apiInstance = new DSourcesApi(defaultClient);
    String dsourceId = "dsourceId_example"; // String | The ID of the dSource.
    DisableDsourceParameters disableDsourceParameters = new DisableDsourceParameters(); // DisableDsourceParameters | The parameters to disable a dSource.
    try {
      DisableDsourceResponse result = apiInstance.disableDsource(dsourceId, disableDsourceParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DSourcesApi#disableDsource");
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
| **dsourceId** | **String**| The ID of the dSource. | |
| **disableDsourceParameters** | [**DisableDsourceParameters**](DisableDsourceParameters.md)| The parameters to disable a dSource. | [optional] |

### Return type

[**DisableDsourceResponse**](DisableDsourceResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="enableDsource"></a>
# **enableDsource**
> EnableDsourceResponse enableDsource(dsourceId, enableDsourceParameters)

Enable a dSource.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.DSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DSourcesApi apiInstance = new DSourcesApi(defaultClient);
    String dsourceId = "dsourceId_example"; // String | The ID of the dSource.
    EnableDsourceParameters enableDsourceParameters = new EnableDsourceParameters(); // EnableDsourceParameters | The parameters to enable a dSource.
    try {
      EnableDsourceResponse result = apiInstance.enableDsource(dsourceId, enableDsourceParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DSourcesApi#enableDsource");
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
| **dsourceId** | **String**| The ID of the dSource. | |
| **enableDsourceParameters** | [**EnableDsourceParameters**](EnableDsourceParameters.md)| The parameters to enable a dSource. | [optional] |

### Return type

[**EnableDsourceResponse**](EnableDsourceResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAppdataDsourceLinkingDefaults"></a>
# **getAppdataDsourceLinkingDefaults**
> AppDataDSourceLinkSourceParameters getAppdataDsourceLinkingDefaults(linkDSourceDefaultRequest)

Get defaults for an AppData dSource linking.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.DSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DSourcesApi apiInstance = new DSourcesApi(defaultClient);
    LinkDSourceDefaultRequest linkDSourceDefaultRequest = new LinkDSourceDefaultRequest(); // LinkDSourceDefaultRequest | 
    try {
      AppDataDSourceLinkSourceParameters result = apiInstance.getAppdataDsourceLinkingDefaults(linkDSourceDefaultRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DSourcesApi#getAppdataDsourceLinkingDefaults");
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
| **linkDSourceDefaultRequest** | [**LinkDSourceDefaultRequest**](LinkDSourceDefaultRequest.md)|  | |

### Return type

[**AppDataDSourceLinkSourceParameters**](AppDataDSourceLinkSourceParameters.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAseDsourceLinkingDefaults"></a>
# **getAseDsourceLinkingDefaults**
> ASEDSourceLinkSourceParameters getAseDsourceLinkingDefaults(linkDSourceDefaultRequest)

Get defaults for an ASE dSource linking.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.DSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DSourcesApi apiInstance = new DSourcesApi(defaultClient);
    LinkDSourceDefaultRequest linkDSourceDefaultRequest = new LinkDSourceDefaultRequest(); // LinkDSourceDefaultRequest | 
    try {
      ASEDSourceLinkSourceParameters result = apiInstance.getAseDsourceLinkingDefaults(linkDSourceDefaultRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DSourcesApi#getAseDsourceLinkingDefaults");
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
| **linkDSourceDefaultRequest** | [**LinkDSourceDefaultRequest**](LinkDSourceDefaultRequest.md)|  | |

### Return type

[**ASEDSourceLinkSourceParameters**](ASEDSourceLinkSourceParameters.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDsourceById"></a>
# **getDsourceById**
> DSource getDsourceById(dsourceId)

Get a dSource by ID.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.DSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DSourcesApi apiInstance = new DSourcesApi(defaultClient);
    String dsourceId = "dsourceId_example"; // String | The ID of the dSource.
    try {
      DSource result = apiInstance.getDsourceById(dsourceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DSourcesApi#getDsourceById");
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
| **dsourceId** | **String**| The ID of the dSource. | |

### Return type

[**DSource**](DSource.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDsourceSnapshots"></a>
# **getDsourceSnapshots**
> ListSnapshotsResponse getDsourceSnapshots(dsourceId, limit, cursor)

List Snapshots for a dSource.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.DSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DSourcesApi apiInstance = new DSourcesApi(defaultClient);
    String dsourceId = "dsourceId_example"; // String | The ID of the dSource.
    Integer limit = 100; // Integer | Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100.
    String cursor = "cursor_example"; // String | Cursor to fetch the next or previous page of results. The value of this property must be extracted from the 'prev_cursor' or 'next_cursor' property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints.
    try {
      ListSnapshotsResponse result = apiInstance.getDsourceSnapshots(dsourceId, limit, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DSourcesApi#getDsourceSnapshots");
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
| **dsourceId** | **String**| The ID of the dSource. | |
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

<a id="getDsources"></a>
# **getDsources**
> ListDSourcesResponse getDsources(limit, cursor, sort, permission)

List all dSources.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.DSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DSourcesApi apiInstance = new DSourcesApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100.
    String cursor = "cursor_example"; // String | Cursor to fetch the next or previous page of results. The value of this property must be extracted from the 'prev_cursor' or 'next_cursor' property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints.
    String sort = "id"; // String | The field to sort results by. A property name with a prepended '-' signifies descending order.
    PermissionEnum permission = PermissionEnum.fromValue("READ"); // PermissionEnum | Restrict the objects, which are allowed.
    try {
      ListDSourcesResponse result = apiInstance.getDsources(limit, cursor, sort, permission);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DSourcesApi#getDsources");
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
| **sort** | **String**| The field to sort results by. A property name with a prepended &#39;-&#39; signifies descending order. | [optional] [enum: id, -id, database_type, -database_type, name, -name, database_version, -database_version, data_uuid, -data_uuid, storage_size, -storage_size, plugin_version, -plugin_version, creation_date, -creation_date, group_name, -group_name, enabled, -enabled, engine_id, -engine_id, source_id, -source_id, status, -status, engine_name, -engine_name, primary_object_id, -primary_object_id, primary_engine_id, -primary_engine_id, primary_engine_name, -primary_engine_name, sync_policy_id, -sync_policy_id, retention_policy_id, -retention_policy_id, quota_policy_id, -quota_policy_id] |
| **permission** | [**PermissionEnum**](.md)| Restrict the objects, which are allowed. | [optional] [enum: READ, UPDATE, DELETE, EXECUTE, CANCEL, MIGRATE, REFRESH, DISABLE, ENABLE, ABANDON, VALIDATE, START, STOP, SNAPSHOT, COPY, REMOVE_JOB, PASSWORD_RESET, UNDO_IMPORT, IMPORT, PROVISION_FROM_BOOKMARK, PROVISION, REFRESH_FROM_BOOKMARK, REFRESH_FROM_SNAPSHOT, REFRESH_FROM_TIMESTAMP, CREATE_ENVIRONMENT, CREATE_BOOKMARK, CREATE_VDBGROUP, MANAGE_TAGS, LINK, REPLICATE, REPLICATE_TO, DELETE_BOOKMARK, UPDATE_BOOKMARK, READ_BOOKMARK, CONFIGURE_PREDEFINED_AUTO_TAGGING] |

### Return type

[**ListDSourcesResponse**](ListDSourcesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMssqlDsourceLinkingDefaults"></a>
# **getMssqlDsourceLinkingDefaults**
> MSSQLDSourceLinkSourceParameters getMssqlDsourceLinkingDefaults(linkDSourceDefaultRequest)

Get defaults for a MSSql dSource linking.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.DSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DSourcesApi apiInstance = new DSourcesApi(defaultClient);
    LinkDSourceDefaultRequest linkDSourceDefaultRequest = new LinkDSourceDefaultRequest(); // LinkDSourceDefaultRequest | 
    try {
      MSSQLDSourceLinkSourceParameters result = apiInstance.getMssqlDsourceLinkingDefaults(linkDSourceDefaultRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DSourcesApi#getMssqlDsourceLinkingDefaults");
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
| **linkDSourceDefaultRequest** | [**LinkDSourceDefaultRequest**](LinkDSourceDefaultRequest.md)|  | |

### Return type

[**MSSQLDSourceLinkSourceParameters**](MSSQLDSourceLinkSourceParameters.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMssqlStagingPushDsourceLinkingDefaults"></a>
# **getMssqlStagingPushDsourceLinkingDefaults**
> MSSQLDSourceStagingPushLinkSourceParameters getMssqlStagingPushDsourceLinkingDefaults(linkStagingPushDSourceDefaultRequest)

Get defaults for a MSSql staging push dSource linking.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.DSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DSourcesApi apiInstance = new DSourcesApi(defaultClient);
    LinkStagingPushDSourceDefaultRequest linkStagingPushDSourceDefaultRequest = new LinkStagingPushDSourceDefaultRequest(); // LinkStagingPushDSourceDefaultRequest | 
    try {
      MSSQLDSourceStagingPushLinkSourceParameters result = apiInstance.getMssqlStagingPushDsourceLinkingDefaults(linkStagingPushDSourceDefaultRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DSourcesApi#getMssqlStagingPushDsourceLinkingDefaults");
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
| **linkStagingPushDSourceDefaultRequest** | [**LinkStagingPushDSourceDefaultRequest**](LinkStagingPushDSourceDefaultRequest.md)|  | |

### Return type

[**MSSQLDSourceStagingPushLinkSourceParameters**](MSSQLDSourceStagingPushLinkSourceParameters.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getOracleDsourceLinkingDefaults"></a>
# **getOracleDsourceLinkingDefaults**
> OracleDSourceLinkSourceParameters getOracleDsourceLinkingDefaults(linkDSourceDefaultRequest)

Get defaults for dSource linking.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.DSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DSourcesApi apiInstance = new DSourcesApi(defaultClient);
    LinkDSourceDefaultRequest linkDSourceDefaultRequest = new LinkDSourceDefaultRequest(); // LinkDSourceDefaultRequest | 
    try {
      OracleDSourceLinkSourceParameters result = apiInstance.getOracleDsourceLinkingDefaults(linkDSourceDefaultRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DSourcesApi#getOracleDsourceLinkingDefaults");
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
| **linkDSourceDefaultRequest** | [**LinkDSourceDefaultRequest**](LinkDSourceDefaultRequest.md)|  | |

### Return type

[**OracleDSourceLinkSourceParameters**](OracleDSourceLinkSourceParameters.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getOracleStagingPushDsourceLinkingDefaults"></a>
# **getOracleStagingPushDsourceLinkingDefaults**
> OracleStagingPushDSourceLinkSourceParameters getOracleStagingPushDsourceLinkingDefaults(oracleLinkStagingPushDSourceDefaultRequest)

Get defaults for a Oracle staging push dSource linking.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.DSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DSourcesApi apiInstance = new DSourcesApi(defaultClient);
    OracleLinkStagingPushDSourceDefaultRequest oracleLinkStagingPushDSourceDefaultRequest = new OracleLinkStagingPushDSourceDefaultRequest(); // OracleLinkStagingPushDSourceDefaultRequest | 
    try {
      OracleStagingPushDSourceLinkSourceParameters result = apiInstance.getOracleStagingPushDsourceLinkingDefaults(oracleLinkStagingPushDSourceDefaultRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DSourcesApi#getOracleStagingPushDsourceLinkingDefaults");
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
| **oracleLinkStagingPushDSourceDefaultRequest** | [**OracleLinkStagingPushDSourceDefaultRequest**](OracleLinkStagingPushDSourceDefaultRequest.md)|  | |

### Return type

[**OracleStagingPushDSourceLinkSourceParameters**](OracleStagingPushDSourceLinkSourceParameters.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getTagsDsource"></a>
# **getTagsDsource**
> TagsResponse getTagsDsource(dsourceId)

Get tags for a dSource.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.DSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DSourcesApi apiInstance = new DSourcesApi(defaultClient);
    String dsourceId = "dsourceId_example"; // String | The ID of the dSource.
    try {
      TagsResponse result = apiInstance.getTagsDsource(dsourceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DSourcesApi#getTagsDsource");
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
| **dsourceId** | **String**| The ID of the dSource. | |

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
| **200** | Created |  -  |

<a id="linkAppdataDatabase"></a>
# **linkAppdataDatabase**
> LinkDSourceResponse linkAppdataDatabase(appDataDSourceLinkSourceParameters)

Link an AppData database as dSource.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.DSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DSourcesApi apiInstance = new DSourcesApi(defaultClient);
    AppDataDSourceLinkSourceParameters appDataDSourceLinkSourceParameters = new AppDataDSourceLinkSourceParameters(); // AppDataDSourceLinkSourceParameters | The parameters to link an AppData dSource.
    try {
      LinkDSourceResponse result = apiInstance.linkAppdataDatabase(appDataDSourceLinkSourceParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DSourcesApi#linkAppdataDatabase");
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
| **appDataDSourceLinkSourceParameters** | [**AppDataDSourceLinkSourceParameters**](AppDataDSourceLinkSourceParameters.md)| The parameters to link an AppData dSource. | |

### Return type

[**LinkDSourceResponse**](LinkDSourceResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="linkAseDatabase"></a>
# **linkAseDatabase**
> LinkDSourceResponse linkAseDatabase(asEDSourceLinkSourceParameters)

Link an ASE database as dSource.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.DSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DSourcesApi apiInstance = new DSourcesApi(defaultClient);
    ASEDSourceLinkSourceParameters asEDSourceLinkSourceParameters = new ASEDSourceLinkSourceParameters(); // ASEDSourceLinkSourceParameters | The parameters to link an ASE dSource.
    try {
      LinkDSourceResponse result = apiInstance.linkAseDatabase(asEDSourceLinkSourceParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DSourcesApi#linkAseDatabase");
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
| **asEDSourceLinkSourceParameters** | [**ASEDSourceLinkSourceParameters**](ASEDSourceLinkSourceParameters.md)| The parameters to link an ASE dSource. | |

### Return type

[**LinkDSourceResponse**](LinkDSourceResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="linkMssqlDatabase"></a>
# **linkMssqlDatabase**
> LinkDSourceResponse linkMssqlDatabase(msSQLDSourceLinkSourceParameters)

Link a MSSql database as dSource.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.DSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DSourcesApi apiInstance = new DSourcesApi(defaultClient);
    MSSQLDSourceLinkSourceParameters msSQLDSourceLinkSourceParameters = new MSSQLDSourceLinkSourceParameters(); // MSSQLDSourceLinkSourceParameters | The parameters to link an MSSql dSource.
    try {
      LinkDSourceResponse result = apiInstance.linkMssqlDatabase(msSQLDSourceLinkSourceParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DSourcesApi#linkMssqlDatabase");
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
| **msSQLDSourceLinkSourceParameters** | [**MSSQLDSourceLinkSourceParameters**](MSSQLDSourceLinkSourceParameters.md)| The parameters to link an MSSql dSource. | |

### Return type

[**LinkDSourceResponse**](LinkDSourceResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="linkMssqlStagingPushDatabase"></a>
# **linkMssqlStagingPushDatabase**
> LinkDSourceResponse linkMssqlStagingPushDatabase(msSQLDSourceStagingPushLinkSourceParameters)

Link a MSSql staging push database as dSource.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.DSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DSourcesApi apiInstance = new DSourcesApi(defaultClient);
    MSSQLDSourceStagingPushLinkSourceParameters msSQLDSourceStagingPushLinkSourceParameters = new MSSQLDSourceStagingPushLinkSourceParameters(); // MSSQLDSourceStagingPushLinkSourceParameters | The parameters to link an MSSql dSource.
    try {
      LinkDSourceResponse result = apiInstance.linkMssqlStagingPushDatabase(msSQLDSourceStagingPushLinkSourceParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DSourcesApi#linkMssqlStagingPushDatabase");
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
| **msSQLDSourceStagingPushLinkSourceParameters** | [**MSSQLDSourceStagingPushLinkSourceParameters**](MSSQLDSourceStagingPushLinkSourceParameters.md)| The parameters to link an MSSql dSource. | |

### Return type

[**LinkDSourceResponse**](LinkDSourceResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="linkOracleDatabase"></a>
# **linkOracleDatabase**
> LinkDSourceResponse linkOracleDatabase(oracleDSourceLinkSourceParameters)

Link Oracle database as dSource.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.DSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DSourcesApi apiInstance = new DSourcesApi(defaultClient);
    OracleDSourceLinkSourceParameters oracleDSourceLinkSourceParameters = new OracleDSourceLinkSourceParameters(); // OracleDSourceLinkSourceParameters | The parameters to link an Oracle dSource.
    try {
      LinkDSourceResponse result = apiInstance.linkOracleDatabase(oracleDSourceLinkSourceParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DSourcesApi#linkOracleDatabase");
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
| **oracleDSourceLinkSourceParameters** | [**OracleDSourceLinkSourceParameters**](OracleDSourceLinkSourceParameters.md)| The parameters to link an Oracle dSource. | |

### Return type

[**LinkDSourceResponse**](LinkDSourceResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="linkOracleStagingPushDatabase"></a>
# **linkOracleStagingPushDatabase**
> LinkDSourceResponse linkOracleStagingPushDatabase(oracleStagingPushDSourceLinkSourceParameters)

Link an Oracle staging push database as dSource.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.DSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DSourcesApi apiInstance = new DSourcesApi(defaultClient);
    OracleStagingPushDSourceLinkSourceParameters oracleStagingPushDSourceLinkSourceParameters = new OracleStagingPushDSourceLinkSourceParameters(); // OracleStagingPushDSourceLinkSourceParameters | The parameters to link an Oracle dSource.
    try {
      LinkDSourceResponse result = apiInstance.linkOracleStagingPushDatabase(oracleStagingPushDSourceLinkSourceParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DSourcesApi#linkOracleStagingPushDatabase");
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
| **oracleStagingPushDSourceLinkSourceParameters** | [**OracleStagingPushDSourceLinkSourceParameters**](OracleStagingPushDSourceLinkSourceParameters.md)| The parameters to link an Oracle dSource. | |

### Return type

[**LinkDSourceResponse**](LinkDSourceResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="searchDsources"></a>
# **searchDsources**
> SearchDSourcesResponse searchDsources(limit, cursor, sort, permission, searchBody)

Search for dSources.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.DSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DSourcesApi apiInstance = new DSourcesApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100.
    String cursor = "cursor_example"; // String | Cursor to fetch the next or previous page of results. The value of this property must be extracted from the 'prev_cursor' or 'next_cursor' property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints.
    String sort = "id"; // String | The field to sort results by. A property name with a prepended '-' signifies descending order.
    PermissionEnum permission = PermissionEnum.fromValue("READ"); // PermissionEnum | Restrict the objects, which are allowed.
    SearchBody searchBody = new SearchBody(); // SearchBody | A request body containing a filter expression. This enables searching for items matching arbitrarily complex conditions. The list of attributes which can be used in filter expressions is available in the x-filterable vendor extension.  # Filter Expression Overview **Note: All keywords are case-insensitive**  ## Comparison Operators | Operator | Description | Example | | --- | --- | --- | | CONTAINS | Substring or membership testing for string and list attributes respectively. | field3 CONTAINS 'foobar', field4 CONTAINS TRUE  | | IN | Tests if field is a member of a list literal. List can contain a maximum of 100 values | field2 IN ['Goku', 'Vegeta'] | | GE | Tests if a field is greater than or equal to a literal value | field1 GE 1.2e-2 | | GT | Tests if a field is greater than a literal value | field1 GT 1.2e-2 | | LE | Tests if a field is less than or equal to a literal value | field1 LE 9000 | | LT | Tests if a field is less than a literal value | field1 LT 9.02 | | NE | Tests if a field is not equal to a literal value | field1 NE 42 | | EQ | Tests if a field is equal to a literal value | field1 EQ 42 |  ## Search Operator The SEARCH operator filters for items which have any filterable attribute that contains the input string as a substring, comparison is done case-insensitively. This is not restricted to attributes with string values. Specifically `SEARCH '12'` would match an item with an attribute with an integer value of `123`.  ## Logical Operators Ordered by precedence. | Operator | Description | Example | | --- | --- | --- | | NOT | Logical NOT (Right associative) | NOT field1 LE 9000 | | AND | Logical AND (Left Associative) | field1 GT 9000 AND field2 EQ 'Goku' | | OR | Logical OR (Left Associative) | field1 GT 9000 OR field2 EQ 'Goku' |  ## Grouping Parenthesis `()` can be used to override operator precedence.  For example: NOT (field1 LT 1234 AND field2 CONTAINS 'foo')  ## Literal Values | Literal      | Description | Examples | | --- | --- | --- | | Nil | Represents the absence of a value | nil, Nil, nIl, NIL | | Boolean | true/false boolean | true, false, True, False, TRUE, FALSE | | Number | Signed integer and floating point numbers. Also supports scientific notation. | 0, 1, -1, 1.2, 0.35, 1.2e-2, -1.2e+2 | | String | Single or double quoted | \"foo\", \"bar\", \"foo bar\", 'foo', 'bar', 'foo bar' | | Datetime | Formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) | 2018-04-27T18:39:26.397237+00:00 | | List | Comma-separated literals wrapped in square brackets | [0], [0, 1], ['foo', \"bar\"] |  ## Limitations - A maximum of 8 unique identifiers may be used inside a filter expression. 
    try {
      SearchDSourcesResponse result = apiInstance.searchDsources(limit, cursor, sort, permission, searchBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DSourcesApi#searchDsources");
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
| **sort** | **String**| The field to sort results by. A property name with a prepended &#39;-&#39; signifies descending order. | [optional] [enum: id, -id, database_type, -database_type, name, -name, database_version, -database_version, data_uuid, -data_uuid, storage_size, -storage_size, plugin_version, -plugin_version, creation_date, -creation_date, group_name, -group_name, enabled, -enabled, engine_id, -engine_id, source_id, -source_id, status, -status, engine_name, -engine_name, primary_object_id, -primary_object_id, primary_engine_id, -primary_engine_id, primary_engine_name, -primary_engine_name, sync_policy_id, -sync_policy_id, retention_policy_id, -retention_policy_id, quota_policy_id, -quota_policy_id] |
| **permission** | [**PermissionEnum**](.md)| Restrict the objects, which are allowed. | [optional] [enum: READ, UPDATE, DELETE, EXECUTE, CANCEL, MIGRATE, REFRESH, DISABLE, ENABLE, ABANDON, VALIDATE, START, STOP, SNAPSHOT, COPY, REMOVE_JOB, PASSWORD_RESET, UNDO_IMPORT, IMPORT, PROVISION_FROM_BOOKMARK, PROVISION, REFRESH_FROM_BOOKMARK, REFRESH_FROM_SNAPSHOT, REFRESH_FROM_TIMESTAMP, CREATE_ENVIRONMENT, CREATE_BOOKMARK, CREATE_VDBGROUP, MANAGE_TAGS, LINK, REPLICATE, REPLICATE_TO, DELETE_BOOKMARK, UPDATE_BOOKMARK, READ_BOOKMARK, CONFIGURE_PREDEFINED_AUTO_TAGGING] |
| **searchBody** | [**SearchBody**](SearchBody.md)| A request body containing a filter expression. This enables searching for items matching arbitrarily complex conditions. The list of attributes which can be used in filter expressions is available in the x-filterable vendor extension.  # Filter Expression Overview **Note: All keywords are case-insensitive**  ## Comparison Operators | Operator | Description | Example | | --- | --- | --- | | CONTAINS | Substring or membership testing for string and list attributes respectively. | field3 CONTAINS &#39;foobar&#39;, field4 CONTAINS TRUE  | | IN | Tests if field is a member of a list literal. List can contain a maximum of 100 values | field2 IN [&#39;Goku&#39;, &#39;Vegeta&#39;] | | GE | Tests if a field is greater than or equal to a literal value | field1 GE 1.2e-2 | | GT | Tests if a field is greater than a literal value | field1 GT 1.2e-2 | | LE | Tests if a field is less than or equal to a literal value | field1 LE 9000 | | LT | Tests if a field is less than a literal value | field1 LT 9.02 | | NE | Tests if a field is not equal to a literal value | field1 NE 42 | | EQ | Tests if a field is equal to a literal value | field1 EQ 42 |  ## Search Operator The SEARCH operator filters for items which have any filterable attribute that contains the input string as a substring, comparison is done case-insensitively. This is not restricted to attributes with string values. Specifically &#x60;SEARCH &#39;12&#39;&#x60; would match an item with an attribute with an integer value of &#x60;123&#x60;.  ## Logical Operators Ordered by precedence. | Operator | Description | Example | | --- | --- | --- | | NOT | Logical NOT (Right associative) | NOT field1 LE 9000 | | AND | Logical AND (Left Associative) | field1 GT 9000 AND field2 EQ &#39;Goku&#39; | | OR | Logical OR (Left Associative) | field1 GT 9000 OR field2 EQ &#39;Goku&#39; |  ## Grouping Parenthesis &#x60;()&#x60; can be used to override operator precedence.  For example: NOT (field1 LT 1234 AND field2 CONTAINS &#39;foo&#39;)  ## Literal Values | Literal      | Description | Examples | | --- | --- | --- | | Nil | Represents the absence of a value | nil, Nil, nIl, NIL | | Boolean | true/false boolean | true, false, True, False, TRUE, FALSE | | Number | Signed integer and floating point numbers. Also supports scientific notation. | 0, 1, -1, 1.2, 0.35, 1.2e-2, -1.2e+2 | | String | Single or double quoted | \&quot;foo\&quot;, \&quot;bar\&quot;, \&quot;foo bar\&quot;, &#39;foo&#39;, &#39;bar&#39;, &#39;foo bar&#39; | | Datetime | Formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) | 2018-04-27T18:39:26.397237+00:00 | | List | Comma-separated literals wrapped in square brackets | [0], [0, 1], [&#39;foo&#39;, \&quot;bar\&quot;] |  ## Limitations - A maximum of 8 unique identifiers may be used inside a filter expression.  | [optional] |

### Return type

[**SearchDSourcesResponse**](SearchDSourcesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="snapshotDsource"></a>
# **snapshotDsource**
> SnapshotDSourceResponse snapshotDsource(dsourceId, dsourceSnapshotParameters)

Snapshot a dSource.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.DSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DSourcesApi apiInstance = new DSourcesApi(defaultClient);
    String dsourceId = "dsourceId_example"; // String | The ID of the dSource.
    DSourceSnapshotParameters dsourceSnapshotParameters = new DSourceSnapshotParameters(); // DSourceSnapshotParameters | Optional parameters to snapshot a DSource.
    try {
      SnapshotDSourceResponse result = apiInstance.snapshotDsource(dsourceId, dsourceSnapshotParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DSourcesApi#snapshotDsource");
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
| **dsourceId** | **String**| The ID of the dSource. | |
| **dsourceSnapshotParameters** | [**DSourceSnapshotParameters**](DSourceSnapshotParameters.md)| Optional parameters to snapshot a DSource. | [optional] |

### Return type

[**SnapshotDSourceResponse**](SnapshotDSourceResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | dSource snapshot initiated. |  -  |


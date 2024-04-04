# EnvironmentsApi

All URIs are relative to */v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**compatibleRepositoriesByLocation**](EnvironmentsApi.md#compatibleRepositoriesByLocation) | **POST** /environments/compatible_repositories_by_location | Get compatible repositories corresponding to the location. |
| [**compatibleRepositoriesBySnapshot**](EnvironmentsApi.md#compatibleRepositoriesBySnapshot) | **POST** /environments/compatible_repositories_by_snapshot | Get compatible repositories corresponding to the snapshot. |
| [**compatibleRepositoriesByTimestamp**](EnvironmentsApi.md#compatibleRepositoriesByTimestamp) | **POST** /environments/compatible_repositories_by_timestamp | Get compatible repositories corresponding to the timestamp. |
| [**compatibleRepositoriesFromBookmark**](EnvironmentsApi.md#compatibleRepositoriesFromBookmark) | **POST** /environments/compatible_repositories_from_bookmark | Get compatible repositories corresponding to the bookmark. |
| [**createEnvironment**](EnvironmentsApi.md#createEnvironment) | **POST** /environments | Create an environment. |
| [**createEnvironmentTags**](EnvironmentsApi.md#createEnvironmentTags) | **POST** /environments/{environmentId}/tags | Create tags for an Environment. |
| [**createEnvironmentUser**](EnvironmentsApi.md#createEnvironmentUser) | **POST** /environments/{environmentId}/users | Create environment user. |
| [**createHost**](EnvironmentsApi.md#createHost) | **POST** /environments/{environmentId}/hosts | Create a new Host. |
| [**deleteEnvironment**](EnvironmentsApi.md#deleteEnvironment) | **DELETE** /environments/{environmentId} | Delete an environment by ID. |
| [**deleteEnvironmentTags**](EnvironmentsApi.md#deleteEnvironmentTags) | **POST** /environments/{environmentId}/tags/delete | Delete tags for an Environment. |
| [**deleteEnvironmentUser**](EnvironmentsApi.md#deleteEnvironmentUser) | **DELETE** /environments/{environmentId}/users/{userRef} | Delete environment user. |
| [**deleteHost**](EnvironmentsApi.md#deleteHost) | **DELETE** /environments/{environmentId}/hosts/{hostId} | Delete a Host. |
| [**disableEnvironment**](EnvironmentsApi.md#disableEnvironment) | **POST** /environments/{environmentId}/disable | Disable environment. |
| [**enableEnvironment**](EnvironmentsApi.md#enableEnvironment) | **POST** /environments/{environmentId}/enable | Enable a disabled environment. |
| [**getEnvironmentById**](EnvironmentsApi.md#getEnvironmentById) | **GET** /environments/{environmentId} | Returns an environment by ID. |
| [**getEnvironments**](EnvironmentsApi.md#getEnvironments) | **GET** /environments | List all environments. |
| [**getTagsEnvironment**](EnvironmentsApi.md#getTagsEnvironment) | **GET** /environments/{environmentId}/tags | Get tags for an Environment. |
| [**listEnvironmentUsers**](EnvironmentsApi.md#listEnvironmentUsers) | **GET** /environments/{environmentId}/users | List environment users. |
| [**primaryEnvironmentUser**](EnvironmentsApi.md#primaryEnvironmentUser) | **POST** /environments/{environmentId}/users/{userRef}/primary | Set primary environment user. |
| [**refreshEnvironment**](EnvironmentsApi.md#refreshEnvironment) | **POST** /environments/{environmentId}/refresh | Refresh environment. |
| [**searchEnvironments**](EnvironmentsApi.md#searchEnvironments) | **POST** /environments/search | Search for environments. |
| [**updateEnvironment**](EnvironmentsApi.md#updateEnvironment) | **PATCH** /environments/{environmentId} | Update an environment by ID. |
| [**updateEnvironmentUser**](EnvironmentsApi.md#updateEnvironmentUser) | **PUT** /environments/{environmentId}/users/{userRef} | Update environment user. |
| [**updateHost**](EnvironmentsApi.md#updateHost) | **PATCH** /environments/{environmentId}/hosts/{hostId} | Update a Host. |
| [**updateRepository**](EnvironmentsApi.md#updateRepository) | **PATCH** /environments/{environmentId}/repository/{repositoryId} | Update a Repository. |


<a id="compatibleRepositoriesByLocation"></a>
# **compatibleRepositoriesByLocation**
> LocationCompatibleEnvironmentsResponse compatibleRepositoriesByLocation(locationCompatibleRepositoryRequest)

Get compatible repositories corresponding to the location.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    LocationCompatibleRepositoryRequest locationCompatibleRepositoryRequest = new LocationCompatibleRepositoryRequest(); // LocationCompatibleRepositoryRequest | The request to get compatible repositories for provisioning a new VDB by location.
    try {
      LocationCompatibleEnvironmentsResponse result = apiInstance.compatibleRepositoriesByLocation(locationCompatibleRepositoryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#compatibleRepositoriesByLocation");
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
| **locationCompatibleRepositoryRequest** | [**LocationCompatibleRepositoryRequest**](LocationCompatibleRepositoryRequest.md)| The request to get compatible repositories for provisioning a new VDB by location. | |

### Return type

[**LocationCompatibleEnvironmentsResponse**](LocationCompatibleEnvironmentsResponse.md)

### Authorization

[ApiKeyAuth](../DCT_README#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="compatibleRepositoriesBySnapshot"></a>
# **compatibleRepositoriesBySnapshot**
> SnapshotCompatibleEnvironmentsResponse compatibleRepositoriesBySnapshot(snapshotCompatibleRepositoryRequest)

Get compatible repositories corresponding to the snapshot.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    SnapshotCompatibleRepositoryRequest snapshotCompatibleRepositoryRequest = new SnapshotCompatibleRepositoryRequest(); // SnapshotCompatibleRepositoryRequest | The request to get compatible repositories for provisioning a new VDB by snapshot.
    try {
      SnapshotCompatibleEnvironmentsResponse result = apiInstance.compatibleRepositoriesBySnapshot(snapshotCompatibleRepositoryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#compatibleRepositoriesBySnapshot");
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
| **snapshotCompatibleRepositoryRequest** | [**SnapshotCompatibleRepositoryRequest**](SnapshotCompatibleRepositoryRequest.md)| The request to get compatible repositories for provisioning a new VDB by snapshot. | |

### Return type

[**SnapshotCompatibleEnvironmentsResponse**](SnapshotCompatibleEnvironmentsResponse.md)

### Authorization

[ApiKeyAuth](../DCT_README#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="compatibleRepositoriesByTimestamp"></a>
# **compatibleRepositoriesByTimestamp**
> TimestampCompatibleEnvironmentsResponse compatibleRepositoriesByTimestamp(timestampCompatibleRepositoryRequest)

Get compatible repositories corresponding to the timestamp.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    TimestampCompatibleRepositoryRequest timestampCompatibleRepositoryRequest = new TimestampCompatibleRepositoryRequest(); // TimestampCompatibleRepositoryRequest | The request to get compatible repositories for provisioning a new VDB by timestamp.
    try {
      TimestampCompatibleEnvironmentsResponse result = apiInstance.compatibleRepositoriesByTimestamp(timestampCompatibleRepositoryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#compatibleRepositoriesByTimestamp");
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
| **timestampCompatibleRepositoryRequest** | [**TimestampCompatibleRepositoryRequest**](TimestampCompatibleRepositoryRequest.md)| The request to get compatible repositories for provisioning a new VDB by timestamp. | |

### Return type

[**TimestampCompatibleEnvironmentsResponse**](TimestampCompatibleEnvironmentsResponse.md)

### Authorization

[ApiKeyAuth](../DCT_README#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="compatibleRepositoriesFromBookmark"></a>
# **compatibleRepositoriesFromBookmark**
> BookmarkCompatibleEnvironmentsResponse compatibleRepositoriesFromBookmark(bookmarkCompatibleRepositoryRequest)

Get compatible repositories corresponding to the bookmark.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    BookmarkCompatibleRepositoryRequest bookmarkCompatibleRepositoryRequest = new BookmarkCompatibleRepositoryRequest(); // BookmarkCompatibleRepositoryRequest | The request to get compatible repositories for provisioning a new VDB by bookmark.
    try {
      BookmarkCompatibleEnvironmentsResponse result = apiInstance.compatibleRepositoriesFromBookmark(bookmarkCompatibleRepositoryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#compatibleRepositoriesFromBookmark");
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
| **bookmarkCompatibleRepositoryRequest** | [**BookmarkCompatibleRepositoryRequest**](BookmarkCompatibleRepositoryRequest.md)| The request to get compatible repositories for provisioning a new VDB by bookmark. | |

### Return type

[**BookmarkCompatibleEnvironmentsResponse**](BookmarkCompatibleEnvironmentsResponse.md)

### Authorization

[ApiKeyAuth](../DCT_README#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createEnvironment"></a>
# **createEnvironment**
> CreateEnvironmentResponse createEnvironment(environmentCreateParameters)

Create an environment.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    EnvironmentCreateParameters environmentCreateParameters = new EnvironmentCreateParameters(); // EnvironmentCreateParameters | The parameters to create an environment.
    try {
      CreateEnvironmentResponse result = apiInstance.createEnvironment(environmentCreateParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#createEnvironment");
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
| **environmentCreateParameters** | [**EnvironmentCreateParameters**](EnvironmentCreateParameters.md)| The parameters to create an environment. | |

### Return type

[**CreateEnvironmentResponse**](CreateEnvironmentResponse.md)

### Authorization

[ApiKeyAuth](../DCT_README#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Environment creation initiated |  -  |

<a id="createEnvironmentTags"></a>
# **createEnvironmentTags**
> TagsResponse createEnvironmentTags(environmentId, tagsRequest)

Create tags for an Environment.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    String environmentId = "environmentId_example"; // String | The ID of the environment.
    TagsRequest tagsRequest = new TagsRequest(); // TagsRequest | Tags information for Environment.
    try {
      TagsResponse result = apiInstance.createEnvironmentTags(environmentId, tagsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#createEnvironmentTags");
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
| **environmentId** | **String**| The ID of the environment. | |
| **tagsRequest** | [**TagsRequest**](TagsRequest.md)| Tags information for Environment. | |

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

<a id="createEnvironmentUser"></a>
# **createEnvironmentUser**
> CreateEnvironmentUserResponse createEnvironmentUser(environmentId, environmentUserParams)

Create environment user.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    String environmentId = "environmentId_example"; // String | The ID of the environment.
    EnvironmentUserParams environmentUserParams = new EnvironmentUserParams(); // EnvironmentUserParams | The parameters to create an environment user.
    try {
      CreateEnvironmentUserResponse result = apiInstance.createEnvironmentUser(environmentId, environmentUserParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#createEnvironmentUser");
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
| **environmentId** | **String**| The ID of the environment. | |
| **environmentUserParams** | [**EnvironmentUserParams**](EnvironmentUserParams.md)| The parameters to create an environment user. | [optional] |

### Return type

[**CreateEnvironmentUserResponse**](CreateEnvironmentUserResponse.md)

### Authorization

[ApiKeyAuth](../DCT_README#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Environment user created |  -  |

<a id="createHost"></a>
# **createHost**
> CreateHostResponse createHost(environmentId, hostCreateParameters)

Create a new Host.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    String environmentId = "environmentId_example"; // String | The ID of the environment.
    HostCreateParameters hostCreateParameters = new HostCreateParameters(); // HostCreateParameters | 
    try {
      CreateHostResponse result = apiInstance.createHost(environmentId, hostCreateParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#createHost");
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
| **environmentId** | **String**| The ID of the environment. | |
| **hostCreateParameters** | [**HostCreateParameters**](HostCreateParameters.md)|  | |

### Return type

[**CreateHostResponse**](CreateHostResponse.md)

### Authorization

[ApiKeyAuth](../DCT_README#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Host Creation initiated |  -  |

<a id="deleteEnvironment"></a>
# **deleteEnvironment**
> DeleteEnvironmentResponse deleteEnvironment(environmentId)

Delete an environment by ID.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    String environmentId = "environmentId_example"; // String | The ID of the environment.
    try {
      DeleteEnvironmentResponse result = apiInstance.deleteEnvironment(environmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#deleteEnvironment");
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
| **environmentId** | **String**| The ID of the environment. | |

### Return type

[**DeleteEnvironmentResponse**](DeleteEnvironmentResponse.md)

### Authorization

[ApiKeyAuth](../DCT_README#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteEnvironmentTags"></a>
# **deleteEnvironmentTags**
> deleteEnvironmentTags(environmentId, deleteTag)

Delete tags for an Environment.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    String environmentId = "environmentId_example"; // String | The ID of the environment.
    DeleteTag deleteTag = new DeleteTag(); // DeleteTag | The parameters to delete tags
    try {
      apiInstance.deleteEnvironmentTags(environmentId, deleteTag);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#deleteEnvironmentTags");
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
| **environmentId** | **String**| The ID of the environment. | |
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

<a id="deleteEnvironmentUser"></a>
# **deleteEnvironmentUser**
> DeleteEnvironmentUserResponse deleteEnvironmentUser(environmentId, userRef)

Delete environment user.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    String environmentId = "environmentId_example"; // String | The ID of the environment.
    String userRef = "userRef_example"; // String | Environment user reference.
    try {
      DeleteEnvironmentUserResponse result = apiInstance.deleteEnvironmentUser(environmentId, userRef);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#deleteEnvironmentUser");
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
| **environmentId** | **String**| The ID of the environment. | |
| **userRef** | **String**| Environment user reference. | |

### Return type

[**DeleteEnvironmentUserResponse**](DeleteEnvironmentUserResponse.md)

### Authorization

[ApiKeyAuth](../DCT_README#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteHost"></a>
# **deleteHost**
> DeleteHostResponse deleteHost(environmentId, hostId)

Delete a Host.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    String environmentId = "environmentId_example"; // String | The ID of the environment.
    String hostId = "hostId_example"; // String | The ID of the host.
    try {
      DeleteHostResponse result = apiInstance.deleteHost(environmentId, hostId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#deleteHost");
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
| **environmentId** | **String**| The ID of the environment. | |
| **hostId** | **String**| The ID of the host. | |

### Return type

[**DeleteHostResponse**](DeleteHostResponse.md)

### Authorization

[ApiKeyAuth](../DCT_README#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | OK |  -  |

<a id="disableEnvironment"></a>
# **disableEnvironment**
> DisableEnvironmentResponse disableEnvironment(environmentId)

Disable environment.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    String environmentId = "environmentId_example"; // String | The ID of the environment.
    try {
      DisableEnvironmentResponse result = apiInstance.disableEnvironment(environmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#disableEnvironment");
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
| **environmentId** | **String**| The ID of the environment. | |

### Return type

[**DisableEnvironmentResponse**](DisableEnvironmentResponse.md)

### Authorization

[ApiKeyAuth](../DCT_README#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="enableEnvironment"></a>
# **enableEnvironment**
> EnableEnvironmentResponse enableEnvironment(environmentId)

Enable a disabled environment.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    String environmentId = "environmentId_example"; // String | The ID of the environment.
    try {
      EnableEnvironmentResponse result = apiInstance.enableEnvironment(environmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#enableEnvironment");
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
| **environmentId** | **String**| The ID of the environment. | |

### Return type

[**EnableEnvironmentResponse**](EnableEnvironmentResponse.md)

### Authorization

[ApiKeyAuth](../DCT_README#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEnvironmentById"></a>
# **getEnvironmentById**
> Environment getEnvironmentById(environmentId)

Returns an environment by ID.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    String environmentId = "environmentId_example"; // String | The ID of the environment.
    try {
      Environment result = apiInstance.getEnvironmentById(environmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#getEnvironmentById");
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
| **environmentId** | **String**| The ID of the environment. | |

### Return type

[**Environment**](Environment.md)

### Authorization

[ApiKeyAuth](../DCT_README#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEnvironments"></a>
# **getEnvironments**
> ListEnvironmentsResponse getEnvironments(limit, cursor, sort)

List all environments.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100.
    String cursor = "cursor_example"; // String | Cursor to fetch the next or previous page of results. The value of this property must be extracted from the 'prev_cursor' or 'next_cursor' property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints.
    String sort = "id"; // String | The field to sort results by. A property name with a prepended '-' signifies descending order.
    try {
      ListEnvironmentsResponse result = apiInstance.getEnvironments(limit, cursor, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#getEnvironments");
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
| **sort** | **String**| The field to sort results by. A property name with a prepended &#39;-&#39; signifies descending order. | [optional] [enum: id, -id, name, -name, namespace, -namespace, engine_id, -engine_id, enabled, -enabled, is_cluster, -is_cluster] |

### Return type

[**ListEnvironmentsResponse**](ListEnvironmentsResponse.md)

### Authorization

[ApiKeyAuth](../DCT_README#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getTagsEnvironment"></a>
# **getTagsEnvironment**
> TagsResponse getTagsEnvironment(environmentId)

Get tags for an Environment.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    String environmentId = "environmentId_example"; // String | The ID of the environment.
    try {
      TagsResponse result = apiInstance.getTagsEnvironment(environmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#getTagsEnvironment");
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
| **environmentId** | **String**| The ID of the environment. | |

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

<a id="listEnvironmentUsers"></a>
# **listEnvironmentUsers**
> ListEnvironmentUsers listEnvironmentUsers(environmentId)

List environment users.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    String environmentId = "environmentId_example"; // String | The ID of the environment.
    try {
      ListEnvironmentUsers result = apiInstance.listEnvironmentUsers(environmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#listEnvironmentUsers");
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
| **environmentId** | **String**| The ID of the environment. | |

### Return type

[**ListEnvironmentUsers**](ListEnvironmentUsers.md)

### Authorization

[ApiKeyAuth](../DCT_README#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="primaryEnvironmentUser"></a>
# **primaryEnvironmentUser**
> PrimaryEnvironmentUserResponse primaryEnvironmentUser(environmentId, userRef)

Set primary environment user.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    String environmentId = "environmentId_example"; // String | The ID of the environment.
    String userRef = "userRef_example"; // String | Environment user reference.
    try {
      PrimaryEnvironmentUserResponse result = apiInstance.primaryEnvironmentUser(environmentId, userRef);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#primaryEnvironmentUser");
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
| **environmentId** | **String**| The ID of the environment. | |
| **userRef** | **String**| Environment user reference. | |

### Return type

[**PrimaryEnvironmentUserResponse**](PrimaryEnvironmentUserResponse.md)

### Authorization

[ApiKeyAuth](../DCT_README#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="refreshEnvironment"></a>
# **refreshEnvironment**
> RefreshEnvironmentResponse refreshEnvironment(environmentId)

Refresh environment.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    String environmentId = "environmentId_example"; // String | The ID of the environment.
    try {
      RefreshEnvironmentResponse result = apiInstance.refreshEnvironment(environmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#refreshEnvironment");
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
| **environmentId** | **String**| The ID of the environment. | |

### Return type

[**RefreshEnvironmentResponse**](RefreshEnvironmentResponse.md)

### Authorization

[ApiKeyAuth](../DCT_README#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="searchEnvironments"></a>
# **searchEnvironments**
> SearchEnvironmentsResponse searchEnvironments(limit, cursor, sort, searchBody)

Search for environments.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of objects to return per query. The value must be between 1 and 1000. Default is 100.
    String cursor = "cursor_example"; // String | Cursor to fetch the next or previous page of results. The value of this property must be extracted from the 'prev_cursor' or 'next_cursor' property of a PaginatedResponseMetadata which is contained in the response of list and search API endpoints.
    String sort = "id"; // String | The field to sort results by. A property name with a prepended '-' signifies descending order.
    SearchBody searchBody = new SearchBody(); // SearchBody | A request body containing a filter expression. This enables searching for items matching arbitrarily complex conditions. The list of attributes which can be used in filter expressions is available in the x-filterable vendor extension.  # Filter Expression Overview **Note: All keywords are case-insensitive**  ## Comparison Operators | Operator | Description | Example | | --- | --- | --- | | CONTAINS | Substring or membership testing for string and list attributes respectively. | field3 CONTAINS 'foobar', field4 CONTAINS TRUE  | | IN | Tests if field is a member of a list literal. List can contain a maximum of 100 values | field2 IN ['Goku', 'Vegeta'] | | GE | Tests if a field is greater than or equal to a literal value | field1 GE 1.2e-2 | | GT | Tests if a field is greater than a literal value | field1 GT 1.2e-2 | | LE | Tests if a field is less than or equal to a literal value | field1 LE 9000 | | LT | Tests if a field is less than a literal value | field1 LT 9.02 | | NE | Tests if a field is not equal to a literal value | field1 NE 42 | | EQ | Tests if a field is equal to a literal value | field1 EQ 42 |  ## Search Operator The SEARCH operator filters for items which have any filterable attribute that contains the input string as a substring, comparison is done case-insensitively. This is not restricted to attributes with string values. Specifically `SEARCH '12'` would match an item with an attribute with an integer value of `123`.  ## Logical Operators Ordered by precedence. | Operator | Description | Example | | --- | --- | --- | | NOT | Logical NOT (Right associative) | NOT field1 LE 9000 | | AND | Logical AND (Left Associative) | field1 GT 9000 AND field2 EQ 'Goku' | | OR | Logical OR (Left Associative) | field1 GT 9000 OR field2 EQ 'Goku' |  ## Grouping Parenthesis `()` can be used to override operator precedence.  For example: NOT (field1 LT 1234 AND field2 CONTAINS 'foo')  ## Literal Values | Literal      | Description | Examples | | --- | --- | --- | | Nil | Represents the absence of a value | nil, Nil, nIl, NIL | | Boolean | true/false boolean | true, false, True, False, TRUE, FALSE | | Number | Signed integer and floating point numbers. Also supports scientific notation. | 0, 1, -1, 1.2, 0.35, 1.2e-2, -1.2e+2 | | String | Single or double quoted | \"foo\", \"bar\", \"foo bar\", 'foo', 'bar', 'foo bar' | | Datetime | Formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) | 2018-04-27T18:39:26.397237+00:00 | | List | Comma-separated literals wrapped in square brackets | [0], [0, 1], ['foo', \"bar\"] |  ## Limitations - A maximum of 8 unique identifiers may be used inside a filter expression. 
    try {
      SearchEnvironmentsResponse result = apiInstance.searchEnvironments(limit, cursor, sort, searchBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#searchEnvironments");
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
| **sort** | **String**| The field to sort results by. A property name with a prepended &#39;-&#39; signifies descending order. | [optional] [enum: id, -id, name, -name, namespace, -namespace, engine_id, -engine_id, enabled, -enabled, is_cluster, -is_cluster] |
| **searchBody** | [**SearchBody**](SearchBody.md)| A request body containing a filter expression. This enables searching for items matching arbitrarily complex conditions. The list of attributes which can be used in filter expressions is available in the x-filterable vendor extension.  # Filter Expression Overview **Note: All keywords are case-insensitive**  ## Comparison Operators | Operator | Description | Example | | --- | --- | --- | | CONTAINS | Substring or membership testing for string and list attributes respectively. | field3 CONTAINS &#39;foobar&#39;, field4 CONTAINS TRUE  | | IN | Tests if field is a member of a list literal. List can contain a maximum of 100 values | field2 IN [&#39;Goku&#39;, &#39;Vegeta&#39;] | | GE | Tests if a field is greater than or equal to a literal value | field1 GE 1.2e-2 | | GT | Tests if a field is greater than a literal value | field1 GT 1.2e-2 | | LE | Tests if a field is less than or equal to a literal value | field1 LE 9000 | | LT | Tests if a field is less than a literal value | field1 LT 9.02 | | NE | Tests if a field is not equal to a literal value | field1 NE 42 | | EQ | Tests if a field is equal to a literal value | field1 EQ 42 |  ## Search Operator The SEARCH operator filters for items which have any filterable attribute that contains the input string as a substring, comparison is done case-insensitively. This is not restricted to attributes with string values. Specifically &#x60;SEARCH &#39;12&#39;&#x60; would match an item with an attribute with an integer value of &#x60;123&#x60;.  ## Logical Operators Ordered by precedence. | Operator | Description | Example | | --- | --- | --- | | NOT | Logical NOT (Right associative) | NOT field1 LE 9000 | | AND | Logical AND (Left Associative) | field1 GT 9000 AND field2 EQ &#39;Goku&#39; | | OR | Logical OR (Left Associative) | field1 GT 9000 OR field2 EQ &#39;Goku&#39; |  ## Grouping Parenthesis &#x60;()&#x60; can be used to override operator precedence.  For example: NOT (field1 LT 1234 AND field2 CONTAINS &#39;foo&#39;)  ## Literal Values | Literal      | Description | Examples | | --- | --- | --- | | Nil | Represents the absence of a value | nil, Nil, nIl, NIL | | Boolean | true/false boolean | true, false, True, False, TRUE, FALSE | | Number | Signed integer and floating point numbers. Also supports scientific notation. | 0, 1, -1, 1.2, 0.35, 1.2e-2, -1.2e+2 | | String | Single or double quoted | \&quot;foo\&quot;, \&quot;bar\&quot;, \&quot;foo bar\&quot;, &#39;foo&#39;, &#39;bar&#39;, &#39;foo bar&#39; | | Datetime | Formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) | 2018-04-27T18:39:26.397237+00:00 | | List | Comma-separated literals wrapped in square brackets | [0], [0, 1], [&#39;foo&#39;, \&quot;bar\&quot;] |  ## Limitations - A maximum of 8 unique identifiers may be used inside a filter expression.  | [optional] |

### Return type

[**SearchEnvironmentsResponse**](SearchEnvironmentsResponse.md)

### Authorization

[ApiKeyAuth](../DCT_README#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateEnvironment"></a>
# **updateEnvironment**
> UpdateEnvironmentResponse updateEnvironment(environmentId, environmentUpdateParameters)

Update an environment by ID.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    String environmentId = "environmentId_example"; // String | The ID of the environment.
    EnvironmentUpdateParameters environmentUpdateParameters = new EnvironmentUpdateParameters(); // EnvironmentUpdateParameters | the parameters to update an environment
    try {
      UpdateEnvironmentResponse result = apiInstance.updateEnvironment(environmentId, environmentUpdateParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#updateEnvironment");
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
| **environmentId** | **String**| The ID of the environment. | |
| **environmentUpdateParameters** | [**EnvironmentUpdateParameters**](EnvironmentUpdateParameters.md)| the parameters to update an environment | [optional] |

### Return type

[**UpdateEnvironmentResponse**](UpdateEnvironmentResponse.md)

### Authorization

[ApiKeyAuth](../DCT_README#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateEnvironmentUser"></a>
# **updateEnvironmentUser**
> UpdateEnvironmentUserResponse updateEnvironmentUser(environmentId, userRef, environmentUserParams)

Update environment user.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    String environmentId = "environmentId_example"; // String | The ID of the environment.
    String userRef = "userRef_example"; // String | Environment user reference.
    EnvironmentUserParams environmentUserParams = new EnvironmentUserParams(); // EnvironmentUserParams | The parameters to create an environment user.
    try {
      UpdateEnvironmentUserResponse result = apiInstance.updateEnvironmentUser(environmentId, userRef, environmentUserParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#updateEnvironmentUser");
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
| **environmentId** | **String**| The ID of the environment. | |
| **userRef** | **String**| Environment user reference. | |
| **environmentUserParams** | [**EnvironmentUserParams**](EnvironmentUserParams.md)| The parameters to create an environment user. | [optional] |

### Return type

[**UpdateEnvironmentUserResponse**](UpdateEnvironmentUserResponse.md)

### Authorization

[ApiKeyAuth](../DCT_README#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateHost"></a>
# **updateHost**
> UpdateHostResponse updateHost(environmentId, hostId, hostUpdateParameters)

Update a Host.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    String environmentId = "environmentId_example"; // String | The ID of the environment.
    String hostId = "hostId_example"; // String | The ID of the host.
    HostUpdateParameters hostUpdateParameters = new HostUpdateParameters(); // HostUpdateParameters | the parameters to update a host.
    try {
      UpdateHostResponse result = apiInstance.updateHost(environmentId, hostId, hostUpdateParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#updateHost");
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
| **environmentId** | **String**| The ID of the environment. | |
| **hostId** | **String**| The ID of the host. | |
| **hostUpdateParameters** | [**HostUpdateParameters**](HostUpdateParameters.md)| the parameters to update a host. | |

### Return type

[**UpdateHostResponse**](UpdateHostResponse.md)

### Authorization

[ApiKeyAuth](../DCT_README#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | OK |  -  |

<a id="updateRepository"></a>
# **updateRepository**
> UpdateRepositoryResponse updateRepository(environmentId, repositoryId, updateRepositoryParameters)

Update a Repository.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    String environmentId = "environmentId_example"; // String | The ID of the environment.
    String repositoryId = "repositoryId_example"; // String | The ID of the repository.
    UpdateRepositoryParameters updateRepositoryParameters = new UpdateRepositoryParameters(); // UpdateRepositoryParameters | 
    try {
      UpdateRepositoryResponse result = apiInstance.updateRepository(environmentId, repositoryId, updateRepositoryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#updateRepository");
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
| **environmentId** | **String**| The ID of the environment. | |
| **repositoryId** | **String**| The ID of the repository. | |
| **updateRepositoryParameters** | [**UpdateRepositoryParameters**](UpdateRepositoryParameters.md)|  | |

### Return type

[**UpdateRepositoryResponse**](UpdateRepositoryResponse.md)

### Authorization

[ApiKeyAuth](../DCT_README#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | OK |  -  |


# ConnectivityApi

All URIs are relative to */v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**commvaultConnectivityCheck**](ConnectivityApi.md#commvaultConnectivityCheck) | **POST** /commvault/connectivity/check | Tests whether the CommServe host is accessible from the given environment and Commvault agent. |
| [**connectivityCheck**](ConnectivityApi.md#connectivityCheck) | **POST** /connectivity/check | Checks connectivity between an engine and a remote host machine on a given port. |
| [**databaseConnectivityCheck**](ConnectivityApi.md#databaseConnectivityCheck) | **POST** /database/connectivity/check | Tests the validity of the supplied database credentials, returning an error if unable to connect to the database. |
| [**netbackupConnectivityCheck**](ConnectivityApi.md#netbackupConnectivityCheck) | **POST** /netbackup/connectivity/check | Checks whether the specified NetBackup master server and client are able to communicate on the given environment. |


<a id="commvaultConnectivityCheck"></a>
# **commvaultConnectivityCheck**
> commvaultConnectivityCheck(commvaultConnectivityCheckParameters)

Tests whether the CommServe host is accessible from the given environment and Commvault agent.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ConnectivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ConnectivityApi apiInstance = new ConnectivityApi(defaultClient);
    CommvaultConnectivityCheckParameters commvaultConnectivityCheckParameters = new CommvaultConnectivityCheckParameters(); // CommvaultConnectivityCheckParameters | The api to check connectivity to the CommServe host and staging client from an environment.
    try {
      apiInstance.commvaultConnectivityCheck(commvaultConnectivityCheckParameters);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectivityApi#commvaultConnectivityCheck");
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
| **commvaultConnectivityCheckParameters** | [**CommvaultConnectivityCheckParameters**](CommvaultConnectivityCheckParameters.md)| The api to check connectivity to the CommServe host and staging client from an environment. | |

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
| **200** | OK |  -  |

<a id="connectivityCheck"></a>
# **connectivityCheck**
> ConnectivityCheckResponse connectivityCheck(connectivityCheckParameters)

Checks connectivity between an engine and a remote host machine on a given port.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ConnectivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ConnectivityApi apiInstance = new ConnectivityApi(defaultClient);
    ConnectivityCheckParameters connectivityCheckParameters = new ConnectivityCheckParameters(); // ConnectivityCheckParameters | The api to check connectivity of engine and a remote host on given port.
    try {
      ConnectivityCheckResponse result = apiInstance.connectivityCheck(connectivityCheckParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectivityApi#connectivityCheck");
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
| **connectivityCheckParameters** | [**ConnectivityCheckParameters**](ConnectivityCheckParameters.md)| The api to check connectivity of engine and a remote host on given port. | |

### Return type

[**ConnectivityCheckResponse**](ConnectivityCheckResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="databaseConnectivityCheck"></a>
# **databaseConnectivityCheck**
> ConnectivityCheckResponse databaseConnectivityCheck(databaseConnectivityCheckParameters)

Tests the validity of the supplied database credentials, returning an error if unable to connect to the database.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ConnectivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ConnectivityApi apiInstance = new ConnectivityApi(defaultClient);
    DatabaseConnectivityCheckParameters databaseConnectivityCheckParameters = new DatabaseConnectivityCheckParameters(); // DatabaseConnectivityCheckParameters | 
    try {
      ConnectivityCheckResponse result = apiInstance.databaseConnectivityCheck(databaseConnectivityCheckParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectivityApi#databaseConnectivityCheck");
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
| **databaseConnectivityCheckParameters** | [**DatabaseConnectivityCheckParameters**](DatabaseConnectivityCheckParameters.md)|  | |

### Return type

[**ConnectivityCheckResponse**](ConnectivityCheckResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="netbackupConnectivityCheck"></a>
# **netbackupConnectivityCheck**
> netbackupConnectivityCheck(netbackupConnectivityCheckParameters)

Checks whether the specified NetBackup master server and client are able to communicate on the given environment.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.ConnectivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ConnectivityApi apiInstance = new ConnectivityApi(defaultClient);
    NetbackupConnectivityCheckParameters netbackupConnectivityCheckParameters = new NetbackupConnectivityCheckParameters(); // NetbackupConnectivityCheckParameters | The api to check connectivity of NetBackup master server and client on an environment.
    try {
      apiInstance.netbackupConnectivityCheck(netbackupConnectivityCheckParameters);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectivityApi#netbackupConnectivityCheck");
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
| **netbackupConnectivityCheckParameters** | [**NetbackupConnectivityCheckParameters**](NetbackupConnectivityCheckParameters.md)| The api to check connectivity of NetBackup master server and client on an environment. | |

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
| **200** | OK |  -  |


# ConnectivityApi

All URIs are relative to *http://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**connectivityCheck**](ConnectivityApi.md#connectivityCheck) | **POST** /connectivity/check | Checks connectivity between an engine and a remote host machine on a given port.
[**databaseConnectivityCheck**](ConnectivityApi.md#databaseConnectivityCheck) | **POST** /database/connectivity/check | Tests the validity of the supplied database credentials, returning an error if unable to connect to the database.


<a name="connectivityCheck"></a>
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
    defaultClient.setBasePath("http://localhost/v3");
    
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectivityCheckParameters** | [**ConnectivityCheckParameters**](ConnectivityCheckParameters.md)| The api to check connectivity of engine and a remote host on given port. |

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
**200** | Success |  -  |

<a name="databaseConnectivityCheck"></a>
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
    defaultClient.setBasePath("http://localhost/v3");
    
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **databaseConnectivityCheckParameters** | [**DatabaseConnectivityCheckParameters**](DatabaseConnectivityCheckParameters.md)|  |

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
**200** | Success |  -  |


# TestApi

All URIs are relative to *http://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**timeToUpdateSources**](TestApi.md#timeToUpdateSources) | **POST** /time-to-update-sources | set sources loop count variable - this is being used during performance testing.


<a name="timeToUpdateSources"></a>
# **timeToUpdateSources**
> TimeToUpdateSourcesResponse timeToUpdateSources(timeToUpdateSourcesRequest)

set sources loop count variable - this is being used during performance testing.

### Example
```java
// Import classes:
import com.delphix.dct.ApiClient;
import com.delphix.dct.ApiException;
import com.delphix.dct.Configuration;
import com.delphix.dct.auth.*;
import com.delphix.dct.models.*;
import com.delphix.dct.api.TestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/v3");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    TestApi apiInstance = new TestApi(defaultClient);
    TimeToUpdateSourcesRequest timeToUpdateSourcesRequest = new TimeToUpdateSourcesRequest(); // TimeToUpdateSourcesRequest | 
    try {
      TimeToUpdateSourcesResponse result = apiInstance.timeToUpdateSources(timeToUpdateSourcesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestApi#timeToUpdateSources");
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
 **timeToUpdateSourcesRequest** | [**TimeToUpdateSourcesRequest**](TimeToUpdateSourcesRequest.md)|  | [optional]

### Return type

[**TimeToUpdateSourcesResponse**](TimeToUpdateSourcesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |


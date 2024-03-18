# BudgetProgramsApi

All URIs are relative to *https://platform.brexapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](BudgetProgramsApi.md#create) | **POST** /v1/budget_programs |  Create Budget Program  |
| [**getById**](BudgetProgramsApi.md#getById) | **GET** /v1/budget_programs/{id} |  Get Budget Program  |
| [**list**](BudgetProgramsApi.md#list) | **GET** /v1/budget_programs |  List Budget Programs  |
| [**removeProgramById**](BudgetProgramsApi.md#removeProgramById) | **DELETE** /v1/budget_programs/{id} |  Delete Budget Program  |
| [**updateProgramById**](BudgetProgramsApi.md#updateProgramById) | **PUT** /v1/budget_programs/{id} |  Update Budget Program  |


<a name="create"></a>
# **create**
> BudgetProgram create(idempotencyKey, createBudgetProgramRequest).execute();

 Create Budget Program 

 Creates a Budget Program. If your account does not have access to budget program features, a 403 response status will be returned. If this is the case and you want to gain access to this endpoint, please contact Brex support. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexBudgets;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BudgetProgramsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://platform.brexapis.com";
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    BrexBudgets client = new BrexBudgets(configuration);
    List<CreateBudgetBlueprintRequest> budgetBlueprints = Arrays.asList();
    String name = "name_example";
    String idempotencyKey = "idempotencyKey_example";
    String description = "description_example";
    List<String> existingBudgetIds = Arrays.asList(); //  IDs for existing budgets associated with this Budget Program. 
    CreateBudgetProgramRequestEmployeeFilter employeeFilter = new CreateBudgetProgramRequestEmployeeFilter();
    try {
      BudgetProgram result = client
              .budgetPrograms
              .create(budgetBlueprints, name, idempotencyKey)
              .description(description)
              .existingBudgetIds(existingBudgetIds)
              .employeeFilter(employeeFilter)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getBudgetBlueprints());
      System.out.println(result.getExistingBudgetIds());
      System.out.println(result.getEmployeeFilter());
      System.out.println(result.getBudgetProgramStatus());
      System.out.println(result.getCreatorUserId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetProgramsApi#create");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BudgetProgram> response = client
              .budgetPrograms
              .create(budgetBlueprints, name, idempotencyKey)
              .description(description)
              .existingBudgetIds(existingBudgetIds)
              .employeeFilter(employeeFilter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetProgramsApi#create");
      System.err.println("Status code: " + e.getStatusCode());
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
| **idempotencyKey** | **String**|  | |
| **createBudgetProgramRequest** | [**CreateBudgetProgramRequest**](CreateBudgetProgramRequest.md)|  | |

### Return type

[**BudgetProgram**](BudgetProgram.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | createBudgetProgram 200 response |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="getById"></a>
# **getById**
> BudgetProgram getById(id).execute();

 Get Budget Program 

 Retrieves a Budget Program by ID 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexBudgets;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BudgetProgramsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://platform.brexapis.com";
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    BrexBudgets client = new BrexBudgets(configuration);
    String id = "id_example";
    try {
      BudgetProgram result = client
              .budgetPrograms
              .getById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getBudgetBlueprints());
      System.out.println(result.getExistingBudgetIds());
      System.out.println(result.getEmployeeFilter());
      System.out.println(result.getBudgetProgramStatus());
      System.out.println(result.getCreatorUserId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetProgramsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BudgetProgram> response = client
              .budgetPrograms
              .getById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetProgramsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
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
| **id** | **String**|  | |

### Return type

[**BudgetProgram**](BudgetProgram.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | getBudgetProgramById 200 response |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="list"></a>
# **list**
> PageBudgetProgram list().cursor(cursor).limit(limit).execute();

 List Budget Programs 

 Lists Budget Programs belonging to this account 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexBudgets;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BudgetProgramsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://platform.brexapis.com";
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    BrexBudgets client = new BrexBudgets(configuration);
    String cursor = "cursor_example";
    Integer limit = 56;
    try {
      PageBudgetProgram result = client
              .budgetPrograms
              .list()
              .cursor(cursor)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextCursor());
      System.out.println(result.getItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetProgramsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageBudgetProgram> response = client
              .budgetPrograms
              .list()
              .cursor(cursor)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetProgramsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
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
| **cursor** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**PageBudgetProgram**](PageBudgetProgram.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | listBudgetPrograms 200 response |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="removeProgramById"></a>
# **removeProgramById**
> BudgetProgram removeProgramById(id).execute();

 Delete Budget Program 

 Delete a Budget Program by ID. This endpoint requires budget management. If your account does not have access to budget management features, a 403 response status will be returned.  If this is the case and you want to gain access to this endpoint, please contact Brex support. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexBudgets;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BudgetProgramsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://platform.brexapis.com";
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    BrexBudgets client = new BrexBudgets(configuration);
    String id = "id_example";
    try {
      BudgetProgram result = client
              .budgetPrograms
              .removeProgramById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getBudgetBlueprints());
      System.out.println(result.getExistingBudgetIds());
      System.out.println(result.getEmployeeFilter());
      System.out.println(result.getBudgetProgramStatus());
      System.out.println(result.getCreatorUserId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetProgramsApi#removeProgramById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BudgetProgram> response = client
              .budgetPrograms
              .removeProgramById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetProgramsApi#removeProgramById");
      System.err.println("Status code: " + e.getStatusCode());
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
| **id** | **String**|  | |

### Return type

[**BudgetProgram**](BudgetProgram.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | deleteBudgetProgram 200 response |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="updateProgramById"></a>
# **updateProgramById**
> BudgetProgram updateProgramById(id, idempotencyKey, updateBudgetProgramRequest).execute();

 Update Budget Program 

 Updates a Budget Program. This endpoint requires budget management. If your account does not have access to budget management features, a 403 response status will be returned.  If this is the case and you want to gain access to this endpoint, please contact Brex support. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexBudgets;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BudgetProgramsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://platform.brexapis.com";
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    BrexBudgets client = new BrexBudgets(configuration);
    String id = "id_example";
    String idempotencyKey = "idempotencyKey_example";
    String description = "description_example";
    List<String> existingBudgetIds = Arrays.asList(); //  IDs for existing budgets associated with this Budget Program. 
    List<UpdateBudgetBlueprintRequest> budgetBlueprints = Arrays.asList(); //  The Blueprints to update the budget program with. Blueprints without an ID are treated as new blueprints to be created. Blueprints that exist currently on the Budget Program, but are missing from the input, will be deleted. 
    CreateBudgetProgramRequestEmployeeFilter employeeFilter = new CreateBudgetProgramRequestEmployeeFilter();
    String name = "name_example";
    try {
      BudgetProgram result = client
              .budgetPrograms
              .updateProgramById(id, idempotencyKey)
              .description(description)
              .existingBudgetIds(existingBudgetIds)
              .budgetBlueprints(budgetBlueprints)
              .employeeFilter(employeeFilter)
              .name(name)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getBudgetBlueprints());
      System.out.println(result.getExistingBudgetIds());
      System.out.println(result.getEmployeeFilter());
      System.out.println(result.getBudgetProgramStatus());
      System.out.println(result.getCreatorUserId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetProgramsApi#updateProgramById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BudgetProgram> response = client
              .budgetPrograms
              .updateProgramById(id, idempotencyKey)
              .description(description)
              .existingBudgetIds(existingBudgetIds)
              .budgetBlueprints(budgetBlueprints)
              .employeeFilter(employeeFilter)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetProgramsApi#updateProgramById");
      System.err.println("Status code: " + e.getStatusCode());
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
| **id** | **String**|  | |
| **idempotencyKey** | **String**|  | |
| **updateBudgetProgramRequest** | [**UpdateBudgetProgramRequest**](UpdateBudgetProgramRequest.md)|  | |

### Return type

[**BudgetProgram**](BudgetProgram.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | updateBudgetProgram 200 response |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


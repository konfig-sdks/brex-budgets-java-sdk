# BudgetsApi

All URIs are relative to *https://platform.brexapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**archiveBudgetById**](BudgetsApi.md#archiveBudgetById) | **POST** /v1/budgets/{id}/archive |  Archive a budget  |
| [**create**](BudgetsApi.md#create) | **POST** /v1/budgets |  Create Budget  |
| [**getById**](BudgetsApi.md#getById) | **GET** /v1/budgets/{id} |  Get Budget  |
| [**list**](BudgetsApi.md#list) | **GET** /v1/budgets |  List Budgets  |
| [**updateBudget**](BudgetsApi.md#updateBudget) | **PUT** /v1/budgets/{id} |  Update Budget  |


<a name="archiveBudgetById"></a>
# **archiveBudgetById**
> archiveBudgetById(id).execute();

 Archive a budget 

 Archives a budget, making it unusable for future expenses and removing it from the UI 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexBudgets;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BudgetsApi;
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
      client
              .budgets
              .archiveBudgetById(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#archiveBudgetById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .budgets
              .archiveBudgetById(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#archiveBudgetById");
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

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | archiveBudget 200 response |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="create"></a>
# **create**
> Budget create(idempotencyKey, createBudgetRequest).execute();

 Create Budget 

 Creates a Budget. This endpoint requires budget management. If your account does not have access to budget management features, a 403 response status will be returned.  If this is the case and you want to gain access to this endpoint, please contact Brex support. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexBudgets;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BudgetsApi;
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
    String parentBudgetId = "parentBudgetId_example"; //  ID of parent Budget. 
    PeriodType periodType = PeriodType.fromValue("WEEKLY");
    Money limit = new Money();
    LimitType limitType = LimitType.fromValue("HARD");
    SpendType spendType = SpendType.fromValue("BUDGET_PROVISIONED_CARDS_ONLY");
    BudgetLimitVisibilityType limitVisibility = BudgetLimitVisibilityType.fromValue("SHARED");
    String idempotencyKey = "idempotencyKey_example";
    String description = "description_example"; //  Description of what the Budget is used for. 
    String name = "name_example"; //  Name for the Budget. 
    List<String> ownerUserIds = Arrays.asList(); //  User IDs of the owners of the Budget. 
    List<String> memberUserIds = Arrays.asList(); //  User IDs of the members of the Budget. 
    LocalDate startDate = LocalDate.now(); //  The UTC date when the Budget should start counting. 
    LocalDate endDate = LocalDate.now(); //  The UTC date when the Budget should stop counting. 
    try {
      Budget result = client
              .budgets
              .create(parentBudgetId, periodType, limit, limitType, spendType, limitVisibility, idempotencyKey)
              .description(description)
              .name(name)
              .ownerUserIds(ownerUserIds)
              .memberUserIds(memberUserIds)
              .startDate(startDate)
              .endDate(endDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getBudgetId());
      System.out.println(result.getAccountId());
      System.out.println(result.getCreatorUserId());
      System.out.println(result.getName());
      System.out.println(result.getParentBudgetId());
      System.out.println(result.getOwnerUserIds());
      System.out.println(result.getMemberUserIds());
      System.out.println(result.getPeriodType());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getLimit());
      System.out.println(result.getBudgetStatus());
      System.out.println(result.getLimitType());
      System.out.println(result.getSpendType());
      System.out.println(result.getCurrentPeriodBalance());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#create");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Budget> response = client
              .budgets
              .create(parentBudgetId, periodType, limit, limitType, spendType, limitVisibility, idempotencyKey)
              .description(description)
              .name(name)
              .ownerUserIds(ownerUserIds)
              .memberUserIds(memberUserIds)
              .startDate(startDate)
              .endDate(endDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#create");
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
| **createBudgetRequest** | [**CreateBudgetRequest**](CreateBudgetRequest.md)|  | |

### Return type

[**Budget**](Budget.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | createBudget 200 response |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="getById"></a>
# **getById**
> Budget getById(id).execute();

 Get Budget 

 Retrieves a Budget by ID 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexBudgets;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BudgetsApi;
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
      Budget result = client
              .budgets
              .getById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getBudgetId());
      System.out.println(result.getAccountId());
      System.out.println(result.getCreatorUserId());
      System.out.println(result.getName());
      System.out.println(result.getParentBudgetId());
      System.out.println(result.getOwnerUserIds());
      System.out.println(result.getMemberUserIds());
      System.out.println(result.getPeriodType());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getLimit());
      System.out.println(result.getBudgetStatus());
      System.out.println(result.getLimitType());
      System.out.println(result.getSpendType());
      System.out.println(result.getCurrentPeriodBalance());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Budget> response = client
              .budgets
              .getById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#getById");
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

[**Budget**](Budget.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | getBudgetById 200 response |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="list"></a>
# **list**
> PageBudget list().cursor(cursor).limit(limit).execute();

 List Budgets 

 Lists Budgets belonging to this account 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexBudgets;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BudgetsApi;
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
      PageBudget result = client
              .budgets
              .list()
              .cursor(cursor)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextCursor());
      System.out.println(result.getItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageBudget> response = client
              .budgets
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
      System.err.println("Exception when calling BudgetsApi#list");
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

[**PageBudget**](PageBudget.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | listBudgets 200 response |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="updateBudget"></a>
# **updateBudget**
> Budget updateBudget(id, idempotencyKey, updateBudgetRequest).execute();

 Update Budget 

 Updates a Budget. This endpoint requires budget management. If your account does not have access to budget management features, a 403 response status will be returned.  If this is the case and you want to gain access to this endpoint, please contact Brex support. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexBudgets;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BudgetsApi;
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
    String description = "description_example"; //  Description of what the Budget is used for. 
    String name = "name_example"; //  Name for the Budget. 
    List<String> ownerUserIds = Arrays.asList(); //  User IDs of the owners of the Budget. 
    List<String> memberUserIds = Arrays.asList(); //  User IDs of the members of the Budget. 
    BudgetLimit limit = new BudgetLimit();
    LimitType limitType = new LimitType();
    SpendType spendType = new SpendType();
    LocalDate startDate = LocalDate.now(); //  The UTC date when the Budget should start counting. 
    LocalDate endDate = LocalDate.now(); //  The UTC date when the Budget should stop counting. 
    BudgetLimitVisibilityType limitVisibility = new BudgetLimitVisibilityType();
    try {
      Budget result = client
              .budgets
              .updateBudget(id, idempotencyKey)
              .description(description)
              .name(name)
              .ownerUserIds(ownerUserIds)
              .memberUserIds(memberUserIds)
              .limit(limit)
              .limitType(limitType)
              .spendType(spendType)
              .startDate(startDate)
              .endDate(endDate)
              .limitVisibility(limitVisibility)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getBudgetId());
      System.out.println(result.getAccountId());
      System.out.println(result.getCreatorUserId());
      System.out.println(result.getName());
      System.out.println(result.getParentBudgetId());
      System.out.println(result.getOwnerUserIds());
      System.out.println(result.getMemberUserIds());
      System.out.println(result.getPeriodType());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getLimit());
      System.out.println(result.getBudgetStatus());
      System.out.println(result.getLimitType());
      System.out.println(result.getSpendType());
      System.out.println(result.getCurrentPeriodBalance());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#updateBudget");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Budget> response = client
              .budgets
              .updateBudget(id, idempotencyKey)
              .description(description)
              .name(name)
              .ownerUserIds(ownerUserIds)
              .memberUserIds(memberUserIds)
              .limit(limit)
              .limitType(limitType)
              .spendType(spendType)
              .startDate(startDate)
              .endDate(endDate)
              .limitVisibility(limitVisibility)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#updateBudget");
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
| **updateBudgetRequest** | [**UpdateBudgetRequest**](UpdateBudgetRequest.md)|  | |

### Return type

[**Budget**](Budget.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | updateBudget 200 response |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


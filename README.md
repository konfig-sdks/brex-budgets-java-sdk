<div align="left">

[![Visit Brex](./header.png)](https://brex.com)

# [Brex](https://brex.com)


The budgets API lets you manage your Brex budgets.


</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Brex&serviceName=Budgets&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>brex-budgets-java-sdk</artifactId>
  <version>1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:brex-budgets-java-sdk:1.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/brex-budgets-java-sdk-1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://platform.brexapis.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BudgetProgramsApi* | [**create**](docs/BudgetProgramsApi.md#create) | **POST** /v1/budget_programs |  Create Budget Program 
*BudgetProgramsApi* | [**getById**](docs/BudgetProgramsApi.md#getById) | **GET** /v1/budget_programs/{id} |  Get Budget Program 
*BudgetProgramsApi* | [**list**](docs/BudgetProgramsApi.md#list) | **GET** /v1/budget_programs |  List Budget Programs 
*BudgetProgramsApi* | [**removeProgramById**](docs/BudgetProgramsApi.md#removeProgramById) | **DELETE** /v1/budget_programs/{id} |  Delete Budget Program 
*BudgetProgramsApi* | [**updateProgramById**](docs/BudgetProgramsApi.md#updateProgramById) | **PUT** /v1/budget_programs/{id} |  Update Budget Program 
*BudgetsApi* | [**archiveBudgetById**](docs/BudgetsApi.md#archiveBudgetById) | **POST** /v1/budgets/{id}/archive |  Archive a budget 
*BudgetsApi* | [**create**](docs/BudgetsApi.md#create) | **POST** /v1/budgets |  Create Budget 
*BudgetsApi* | [**getById**](docs/BudgetsApi.md#getById) | **GET** /v1/budgets/{id} |  Get Budget 
*BudgetsApi* | [**list**](docs/BudgetsApi.md#list) | **GET** /v1/budgets |  List Budgets 
*BudgetsApi* | [**updateBudget**](docs/BudgetsApi.md#updateBudget) | **PUT** /v1/budgets/{id} |  Update Budget 


## Documentation for Models

 - [Budget](docs/Budget.md)
 - [BudgetBlueprint](docs/BudgetBlueprint.md)
 - [BudgetCurrentPeriodBalance](docs/BudgetCurrentPeriodBalance.md)
 - [BudgetLimit](docs/BudgetLimit.md)
 - [BudgetLimitVisibilityType](docs/BudgetLimitVisibilityType.md)
 - [BudgetPeriodBalance](docs/BudgetPeriodBalance.md)
 - [BudgetProgram](docs/BudgetProgram.md)
 - [BudgetProgramStatus](docs/BudgetProgramStatus.md)
 - [BudgetStatus](docs/BudgetStatus.md)
 - [CreateBudgetBlueprintRequest](docs/CreateBudgetBlueprintRequest.md)
 - [CreateBudgetProgramRequest](docs/CreateBudgetProgramRequest.md)
 - [CreateBudgetProgramRequestEmployeeFilter](docs/CreateBudgetProgramRequestEmployeeFilter.md)
 - [CreateBudgetRequest](docs/CreateBudgetRequest.md)
 - [EmployeeFilter](docs/EmployeeFilter.md)
 - [EmploymentStatus](docs/EmploymentStatus.md)
 - [EmploymentType](docs/EmploymentType.md)
 - [LimitType](docs/LimitType.md)
 - [Money](docs/Money.md)
 - [PageBudget](docs/PageBudget.md)
 - [PageBudgetProgram](docs/PageBudgetProgram.md)
 - [PeriodType](docs/PeriodType.md)
 - [SpendType](docs/SpendType.md)
 - [UpdateBudgetBlueprintRequest](docs/UpdateBudgetBlueprintRequest.md)
 - [UpdateBudgetProgramRequest](docs/UpdateBudgetProgramRequest.md)
 - [UpdateBudgetRequest](docs/UpdateBudgetRequest.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)

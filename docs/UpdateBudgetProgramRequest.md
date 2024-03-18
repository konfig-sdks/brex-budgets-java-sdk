

# UpdateBudgetProgramRequest

 Budget Program used to create budgets for eligible users. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  [optional] |
|**existingBudgetIds** | **List&lt;String&gt;** |  IDs for existing budgets associated with this Budget Program.  |  [optional] |
|**budgetBlueprints** | [**List&lt;UpdateBudgetBlueprintRequest&gt;**](UpdateBudgetBlueprintRequest.md) |  The Blueprints to update the budget program with. Blueprints without an ID are treated as new blueprints to be created. Blueprints that exist currently on the Budget Program, but are missing from the input, will be deleted.  |  [optional] |
|**employeeFilter** | [**CreateBudgetProgramRequestEmployeeFilter**](CreateBudgetProgramRequestEmployeeFilter.md) |  |  [optional] |
|**name** | **String** |  |  [optional] |




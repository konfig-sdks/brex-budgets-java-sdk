

# UpdateBudgetBlueprintRequest

 Blueprint for provisioning Budgets for a Budget Program. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  Description of what the Budget is used for.  |  [optional] |
|**id** | **String** |  ID of budget blueprint to update, omit if adding new budget blueprint to budget program.  |  [optional] |
|**name** | **String** |  Name for the Budget.  |  [optional] |
|**parentBudgetId** | **String** |  ID of parent Budget.  |  [optional] |
|**ownerUserIds** | **List&lt;String&gt;** |  User IDs of the owners of the Budget.  |  [optional] |
|**periodType** | [**PeriodType**](PeriodType.md) |  |  [optional] |
|**startDate** | **LocalDate** |  The UTC date when the Budget should start counting.  |  [optional] |
|**endDate** | **LocalDate** |  The UTC date when the Budget should stop counting.  |  [optional] |
|**limit** | [**BudgetLimit**](BudgetLimit.md) |  |  [optional] |
|**limitType** | [**LimitType**](LimitType.md) |  |  [optional] |
|**spendType** | [**SpendType**](SpendType.md) |  |  [optional] |




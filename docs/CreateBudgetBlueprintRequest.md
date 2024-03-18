

# CreateBudgetBlueprintRequest

 Blueprint for provisioning Budgets for a Budget Program. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  Description of what the Budget is used for.  |  [optional] |
|**name** | **String** |  Name for the Budget.  |  [optional] |
|**parentBudgetId** | **String** |  ID of parent Budget.  |  [optional] |
|**ownerUserIds** | **List&lt;String&gt;** |  User IDs of the owners of the Budget.  |  [optional] |
|**periodType** | **PeriodType** |  |  |
|**startDate** | **LocalDate** |  The UTC date when the Budget should start counting.  |  [optional] |
|**endDate** | **LocalDate** |  The UTC date when the Budget should stop counting.  |  [optional] |
|**limit** | [**Money**](Money.md) |  |  |
|**limitType** | **LimitType** |  |  |
|**spendType** | **SpendType** |  |  |
|**limitVisibility** | **BudgetLimitVisibilityType** |  |  |




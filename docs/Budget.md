

# Budget


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  Description of what the Budget is used for.  |  [optional] |
|**budgetId** | **String** |  Unique ID for the Budget.  |  [optional] |
|**accountId** | **String** |  The Brex account this Budget belongs to.  |  [optional] |
|**creatorUserId** | **String** |  The ID of the user who originally created this budget.  |  [optional] |
|**name** | **String** |  Name for the Budget.  |  [optional] |
|**parentBudgetId** | **String** |  ID of parent Budget.  |  [optional] |
|**ownerUserIds** | **List&lt;String&gt;** |  User IDs of the owners of the Budget.  |  [optional] |
|**memberUserIds** | **List&lt;String&gt;** |  User IDs of the members of the Budget.  |  [optional] |
|**periodType** | **PeriodType** |  |  |
|**startDate** | **LocalDate** |  The UTC date when the Budget should start counting.  |  [optional] |
|**endDate** | **LocalDate** |  The UTC date when the Budget should stop counting.  |  [optional] |
|**limit** | [**BudgetLimit**](BudgetLimit.md) |  |  [optional] |
|**budgetStatus** | **BudgetStatus** |  |  |
|**limitType** | [**LimitType**](LimitType.md) |  |  [optional] |
|**spendType** | **SpendType** |  |  |
|**currentPeriodBalance** | [**BudgetCurrentPeriodBalance**](BudgetCurrentPeriodBalance.md) |  |  [optional] |




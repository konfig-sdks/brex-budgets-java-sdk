

# CreateBudgetRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  Description of what the Budget is used for.  |  [optional] |
|**name** | **String** |  Name for the Budget.  |  [optional] |
|**parentBudgetId** | **String** |  ID of parent Budget.  |  |
|**ownerUserIds** | **List&lt;String&gt;** |  User IDs of the owners of the Budget.  |  [optional] |
|**memberUserIds** | **List&lt;String&gt;** |  User IDs of the members of the Budget.  |  [optional] |
|**periodType** | **PeriodType** |  |  |
|**limit** | [**Money**](Money.md) |  |  |
|**limitType** | **LimitType** |  |  |
|**spendType** | **SpendType** |  |  |
|**startDate** | **LocalDate** |  The UTC date when the Budget should start counting.  |  [optional] |
|**endDate** | **LocalDate** |  The UTC date when the Budget should stop counting.  |  [optional] |
|**limitVisibility** | **BudgetLimitVisibilityType** |  |  |




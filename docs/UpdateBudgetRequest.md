

# UpdateBudgetRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  Description of what the Budget is used for.  |  [optional] |
|**name** | **String** |  Name for the Budget.  |  [optional] |
|**ownerUserIds** | **List&lt;String&gt;** |  User IDs of the owners of the Budget.  |  [optional] |
|**memberUserIds** | **List&lt;String&gt;** |  User IDs of the members of the Budget.  |  [optional] |
|**limit** | [**BudgetLimit**](BudgetLimit.md) |  |  [optional] |
|**limitType** | [**LimitType**](LimitType.md) |  |  [optional] |
|**spendType** | [**SpendType**](SpendType.md) |  |  [optional] |
|**startDate** | **LocalDate** |  The UTC date when the Budget should start counting.  |  [optional] |
|**endDate** | **LocalDate** |  The UTC date when the Budget should stop counting.  |  [optional] |
|**limitVisibility** | [**BudgetLimitVisibilityType**](BudgetLimitVisibilityType.md) |  |  [optional] |




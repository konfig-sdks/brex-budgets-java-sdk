package com.konfigthis.client;

import com.konfigthis.client.api.BudgetProgramsApi;
import com.konfigthis.client.api.BudgetsApi;

public class BrexBudgets {
    private ApiClient apiClient;
    public final BudgetProgramsApi budgetPrograms;
    public final BudgetsApi budgets;

    public BrexBudgets() {
        this(null);
    }

    public BrexBudgets(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.budgetPrograms = new BudgetProgramsApi(this.apiClient);
        this.budgets = new BudgetsApi(this.apiClient);
    }

}

package com.rhinoceros.rhinExpenses.service;



import com.rhinoceros.rhinExpenses.model.Category;
import com.rhinoceros.rhinExpenses.model.Expense;
import com.rhinoceros.rhinExpenses.model.User;

public interface ExpenseService {
	public void saveExpense(Expense expense, Category category, User user);
	public void deleteExpense(long id);
}
  
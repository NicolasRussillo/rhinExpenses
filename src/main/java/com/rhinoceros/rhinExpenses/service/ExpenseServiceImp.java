package com.rhinoceros.rhinExpenses.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rhinoceros.rhinExpenses.model.Category;
import com.rhinoceros.rhinExpenses.model.Expense;
import com.rhinoceros.rhinExpenses.model.User;
import com.rhinoceros.rhinExpenses.repository.ExpenseRepository;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ExpenseServiceImp implements ExpenseService {

	@Autowired
	private ExpenseRepository expenseRepository;

	@Override
	public void saveExpense(Expense expense,Category category, User user) {

		expense.setUser(user);
		expense.setCategory(category);
		expenseRepository.save(expense);

	}
	@Override
	public void deleteExpense(long id){
		expenseRepository.deleteById(id);
	}
}

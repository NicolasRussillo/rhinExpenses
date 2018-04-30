package com.rhinoceros.rhinExpenses.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.rhinoceros.rhinExpenses.model.Expense;;
public interface ExpenseRepository extends JpaRepository<Expense,Long> {
	void deleteById(long id);
}

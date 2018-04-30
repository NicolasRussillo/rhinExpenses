package com.rhinoceros.rhinExpenses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rhinoceros.rhinExpenses.model.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {
	Category findById(String id);
}

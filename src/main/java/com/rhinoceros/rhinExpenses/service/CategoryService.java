package com.rhinoceros.rhinExpenses.service;

import java.util.List;

import com.rhinoceros.rhinExpenses.model.Category;

public interface CategoryService {
	public List<Category> getAllCategories();
	public Category findCategoryById(String id);
}

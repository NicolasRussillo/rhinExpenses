package com.rhinoceros.rhinExpenses.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rhinoceros.rhinExpenses.model.Category;
import com.rhinoceros.rhinExpenses.repository.CategoryRepository;

@Service
public class CategoryServiceImp implements CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public List<Category> getAllCategories(){
		return categoryRepository.findAll();
	}
	
	@Override
	public Category findCategoryById(String id) {
		return categoryRepository.findById(id);
	}
}

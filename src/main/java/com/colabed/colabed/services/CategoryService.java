package com.colabed.colabed.services;

import org.springframework.stereotype.Service;

import com.colabed.colabed.repositories.CategoryRepository;

@Service
public class CategoryService {

	private CategoryRepository categoryRepository;
	
	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
}

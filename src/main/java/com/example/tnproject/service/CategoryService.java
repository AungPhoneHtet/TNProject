package com.example.tnproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.tnproject.entity.Category;
import com.example.tnproject.repository.CategoryRepository;

@Service
@Transactional
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public Category save(Category category) {
		return categoryRepository.save(category);
	}

	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	public Category findById(Long id) {
		return categoryRepository.findOne(id);
	}

	public Category update(Category category) {
		if (categoryRepository.exists(category.getId()))
			return categoryRepository.save(category);
		return null;
	}

	public void delete(Long id) {
		categoryRepository.delete(id);
	}
}

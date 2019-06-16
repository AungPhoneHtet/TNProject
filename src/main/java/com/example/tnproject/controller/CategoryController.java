package com.example.tnproject.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.tnproject.entity.Category;
import com.example.tnproject.service.CategoryService;

@Controller
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	
	@GetMapping("/newCategory") 
	public String newCategoryPage(Model model) {
		model.addAttribute("category", new Category());
		return "newCategory";
	}
	
	@PostMapping("/saveCategory")
	public String saveCategory(@Valid @ModelAttribute("category") Category category, HttpServletRequest resquest) {
		categoryService.save(category);
		return "redirect:newCategory";
	}
	
	@GetMapping("/allCategories")
	public String getAllCategories(Model model) {
		model.addAttribute("categoryList", categoryService.findAll());
		return "categoryList";
	}
}

package com.example.tnprojects;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.tnproject.TnProjectApplication;
import com.example.tnproject.entity.Category;
import com.example.tnproject.service.CategoryService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TnProjectApplication.class)
public class CategoryServiceTest {

	@Autowired
	private CategoryService categoryService;

	@Test
	public void saveTest() {
		Category category = new Category();
		category.setCode("SPRING");
		category.setDescription("Spring Developement Course");
		assertTrue(categoryService.save(category).getId() != null);

	}
	
	@Test
	public void updateTest() {
		Category category = new Category();
		category.setId(1L);
		category.setCode("JAVA");
		category.setDescription("Java Spring Developement Course");
		assertTrue(categoryService.update(category).getCode().equals("JAVA"));
	}
	
	@Test
	public void findAllTest() {
		assertTrue(categoryService.findAll().size()>0);
	}
	
	@Test
	public void findByIdTest() {
		assertTrue(!categoryService.findById(1L).getCode().isEmpty());
	}

	@Test
	public void deleteTest() {
		categoryService.delete(1L);
		assertTrue(null == categoryService.findById(1L));
	}
}

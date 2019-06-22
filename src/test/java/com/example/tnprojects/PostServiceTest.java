package com.example.tnprojects;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.tnproject.TnProjectApplication;
import com.example.tnproject.entity.Post;
import com.example.tnproject.service.PostService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TnProjectApplication.class)
public class PostServiceTest {

	@Autowired
	private PostService postService;

	@Test
	public void saveTest() {
		Post post = new Post();
		post.setContent("SPRING");
		post.setTitle("Spring Developement Course");
		assertTrue(postService.save(post).getId() != null);

	}
	
	@Test
	public void updateTest() {
		Post post = new Post();
		post.setId(1L);
		post.setContent("SPRING");
		post.setTitle("Spring Developement Course");
		assertTrue(postService.update(post).getContent().equals("Spring"));
	}
	
	@Test
	public void findAllTest() {
		assertTrue(postService.findAll().size()>0);
	}
	
	@Test
	public void findByIdTest() {
		assertTrue(!postService.findById(1L).getContent().isEmpty());
	}

	@Test
	public void deleteTest() {
		postService.delete(1L);
		assertTrue(null == postService.findById(1L));
	}
}

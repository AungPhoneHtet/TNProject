package com.example.tnprojects;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.tnproject.entity.Comment;
import com.example.tnproject.entity.Post;
import com.example.tnproject.service.CommentService;
import com.example.tnproject.service.PostService;

public class CommentServiceTest {

	@Autowired
	private CommentService commentService;

	@Autowired
	private PostService postService;
	
	@Test
	public void saveTest() {
		Post post = new Post();
		post.setId(1L);
		post.setContent("SPRING");
		post.setTitle("Spring Developement Course");
		postService.save(post);
		Comment comment = new Comment();
		comment.setPost(post);
		comment.setDescription("Sample Comment");
		assertTrue(commentService.save(comment).getId() != null);

	}
	
	@Test
	public void updateTest() {
		
		Comment comment = new Comment();
		comment.setId(1L);
		comment.setDescription("Change Description");
		assertTrue(commentService.update(comment).getDescription().equals("Change Description"));
	}
	
	@Test
	public void findAllTest() {
		assertTrue(commentService.findAll().size()>0);
	}
	
	@Test
	public void findByIdTest() {
		assertTrue(!commentService.findById(1L).getDescription().isEmpty());
	}

	@Test
	public void deleteTest() {
		commentService.delete(1L);
		assertTrue(null == commentService.findById(1L));
	}
}

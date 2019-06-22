package com.example.tnproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.tnproject.entity.Comment;
import com.example.tnproject.repository.CommentRepository;

public class CommentService {

	@Autowired
	CommentRepository commentRepository;
	
	public Comment save(Comment comment) 
	{
		return commentRepository.save(comment);
	}
	
	public Comment update(Comment comment) 
	{
		if(commentRepository.exists(comment.getId())) 
		{
			return commentRepository.save(comment);
		}
		return null;
	}
	
	public List<Comment> findAll ()
	{
		return commentRepository.findAll();
	}
	
	public Comment findById (Long commentId) 
	{
		return commentRepository.findOne(commentId);
	}
	
	public void delete(Long commentId) 
	{
		commentRepository.delete(commentId);
	}
}

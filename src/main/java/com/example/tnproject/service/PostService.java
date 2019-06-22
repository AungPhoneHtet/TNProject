package com.example.tnproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.tnproject.entity.Post;
import com.example.tnproject.repository.PostRepository;

@Service
@Transactional
public class PostService {

	@Autowired
	PostRepository postRepository;
	
	public Post save(Post post) 
	{
		return postRepository.save(post);
	}
	
	public Post update(Post post) 
	{
		if(postRepository.exists(post.getId())) 
		{
			return postRepository.save(post);
		}
		return null;
	}
	
	public List<Post> findAll ()
	{
		return postRepository.findAll();
	}
	
	public Post findById (Long postId) 
	{
		return postRepository.findOne(postId);
	}
	
	public void delete(Long postId) 
	{
		postRepository.delete(postId);
	}
}

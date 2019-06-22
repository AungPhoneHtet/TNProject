package com.example.tnproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tnproject.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{

	//Post update(Post post);

}

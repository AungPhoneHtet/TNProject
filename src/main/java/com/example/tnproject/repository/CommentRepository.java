package com.example.tnproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tnproject.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{

}

package com.example.tnproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tnproject.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}

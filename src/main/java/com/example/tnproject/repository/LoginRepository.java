package com.example.tnproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tnproject.entity.TNUser;

@Repository("LoginRepository")
public interface LoginRepository extends JpaRepository<TNUser, Long>{

	TNUser findByEmail(String email);

}

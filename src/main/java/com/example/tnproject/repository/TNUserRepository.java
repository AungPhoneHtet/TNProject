package com.example.tnproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tnproject.entity.TNUser;

@Repository("TNUserRepository")
public interface TNUserRepository extends JpaRepository<TNUser, Long> {

}

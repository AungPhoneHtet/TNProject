package com.example.tnprojects.Repositories.Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tnprojects.Entity.TNUser.TNUser;

@Repository
public interface TNUserRepository extends JpaRepository<TNUser, Long>{

}

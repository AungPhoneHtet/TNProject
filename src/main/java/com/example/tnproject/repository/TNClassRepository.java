package com.example.tnproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tnproject.entity.TNClass;


@Repository("TNClassRepository")
public interface TNClassRepository extends JpaRepository<TNClass, Long> {


}

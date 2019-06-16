package com.example.tnproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.tnproject.entity.Category;
import com.example.tnproject.entity.TNClass;
import com.example.tnproject.repository.TNClassRepository;


@Service("TNClassService")
@Transactional
public class TNClassService {

	@Autowired
	TNClassRepository tnClassRepository;

	

	public TNClass save(TNClass tnClass) {
		return tnClassRepository.save(tnClass);
	}
	
	public void delete(long id) {
		tnClassRepository.delete(id);
	}
	
	public TNClass update(TNClass tnClass){
		return tnClassRepository.save(tnClass);
	}
	
	public List<TNClass> findAll() {
		return tnClassRepository.findAll();
	}

	public TNClass findById(Long id) {
		return tnClassRepository.findOne(id);
	}
}

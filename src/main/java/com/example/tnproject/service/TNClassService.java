package com.example.tnproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}

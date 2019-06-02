package com.example.tnproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.tnproject.entity.TNUser;
import com.example.tnproject.repository.TNUserRepository;

@Service("TNUserService")
@Transactional
public class TNUserService {
	
	@Autowired
	TNUserRepository tnUserRepository;

	public TNUser save(TNUser tnUser) {
		return tnUserRepository.save(tnUser);
	}

}

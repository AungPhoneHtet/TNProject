package com.example.tnproject.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.tnproject.entity.TNUser;
import com.example.tnproject.repository.TNUserRepository;

public class TNUserServiceImpl implements TNUserService {
	
	@Autowired
	TNUserRepository tnUserRepository;

	@Override
	public TNUser save(TNUser tnUser) {
		return tnUserRepository.save(tnUser);
	}

}

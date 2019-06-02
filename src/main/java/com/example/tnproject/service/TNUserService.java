package com.example.tnproject.service;

import org.springframework.stereotype.Service;

import com.example.tnproject.entity.TNUser;

@Service("TNUserService")
public interface TNUserService {

	TNUser save(TNUser tnUser);
}

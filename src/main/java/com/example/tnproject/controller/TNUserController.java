package com.example.tnproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.tnproject.entity.TNUser;
import com.example.tnproject.service.TNUserService;

@RestController("TNUserController")
public class TNUserController {
	
	@Autowired
	TNUserService tnUserService;
	
	
	@PostMapping("/saveUser")
	public TNUser saveUser(@RequestBody TNUser tnUser) {
		TNUser savedUser = tnUserService.save(tnUser);
		return savedUser;
	}

}

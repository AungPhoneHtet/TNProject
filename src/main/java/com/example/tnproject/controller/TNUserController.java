package com.example.tnproject.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
	@GetMapping("/getAllUser")
	public String getAlUser(HttpServletRequest request, HttpServletResponse response, Model model) 
	{
		List<TNUser> userLists = tnUserService.getAllUserLists();
		model.addAttribute("userLists", userLists);
		return "";
	}
	
	@GetMapping("getUserById/{id}")
	public String getUserById(HttpServletRequest request, HttpServletResponse response, Model model) 
	{
		String id = request.getParameter("id");
		TNUser user = tnUserService.findUserById(Long.parseLong(id));
		return "";
	}
	
}

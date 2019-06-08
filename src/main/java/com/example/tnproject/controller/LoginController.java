package com.example.tnproject.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.tnproject.entity.TNUser;

@Controller("LoginController")
public class LoginController {

	@GetMapping("/login")
	public String loginGet(HttpServletRequest request, HttpServletResponse response,Model model)
	{
		return "login";
	}
	
	@PostMapping("/login")
	public String loginPost(HttpServletRequest request, HttpServletResponse response, @ModelAttribute ("TNUser") TNUser tnUser) 
	{
		
		return "/dashboard";
	}
}

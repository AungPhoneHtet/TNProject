package com.example.tnproject.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.tnproject.entity.TNUser;
import com.example.tnproject.service.TNUserService;

@Controller("TNUserController")
public class TNUserController {

	@Autowired
	TNUserService tnUserService;

	@GetMapping(value = "/newUser")
	public String createUser(Model model) {
		model.addAttribute("tnUser", new TNUser());
		return "newUser";
	}

	@PostMapping(value = "/newUser")
	public String createUser(@Valid @ModelAttribute TNUser tnUser, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "newUser";
		} else {
			tnUserService.save(tnUser);
			System.out.println(tnUser.toString());
			return "newUser";
		}
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

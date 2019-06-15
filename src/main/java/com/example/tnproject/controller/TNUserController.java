package com.example.tnproject.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.tnproject.entity.TNUser;
import com.example.tnproject.service.TNUserService;

@Controller("TNUserController")
public class TNUserController {

	@Autowired
	TNUserService tnUserService;

	@GetMapping(value = "/saveUser")
	public String createUser(Model model) {
		model.addAttribute("tnUser", new TNUser());
		return "user/newUser";
	}

	@PostMapping(value = "/saveUser")
	public String createUser(@Valid @ModelAttribute TNUser tnUser, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "user/newUser";
		} else {
			tnUserService.save(tnUser);
			System.out.println(tnUser.toString());
			return "user/newUser";
		}
	}
	
}

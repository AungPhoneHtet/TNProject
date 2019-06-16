package com.example.tnproject.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.tnproject.entity.TNUser;
import com.example.tnproject.service.LoginService;

@Controller("LoginController")
public class LoginController {

	@Autowired
	LoginService loginService;
	
	HttpSession httpSession;
	
	Logger logger = LogManager.getLogger(this.getClass());
	
	@GetMapping({"/","/login"})
	public String loginGet(HttpServletRequest request, HttpServletResponse response,Model model)
	{
		logger.info("Login Controller --> login get method is load successfully.");
		model.addAttribute("TNUser", new TNUser());
		return "default";
	}
	
	@PostMapping({"/","/login"})
	public String loginPost(HttpServletRequest request, HttpServletResponse response, @ModelAttribute ("TNUser") TNUser tnUser,Model model) 
	{
		logger.info("Login Controller --> login post method is load successfully.");
		httpSession = request.getSession();
		boolean isAuthenticated = loginService.checkAuthentication(tnUser);
		if(isAuthenticated) 
		{
			loginService.saveSession(tnUser,httpSession);
			return "redirect:newUser";
		}
		model.addAttribute("errorMsg", "Email and password credential doesn't match.");
		model.addAttribute("TNUser", new TNUser());
		return "redirect:default";
	}
	
	/*
	 * @GetMapping({"/newUser"}) public String dashboardGet(HttpServletRequest
	 * request, HttpServletResponse response,Model model) {
	 * logger.info("Login Controller --> dashboard get method is load successfully."
	 * ); return "user/newUser"; }
	 */
}

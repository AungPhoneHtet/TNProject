package com.example.tnproject.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.tnproject.entity.TNUser;
import com.example.tnproject.repository.LoginRepository;

@Service("LoginService")
@Transactional
public class LoginService {

	@Autowired
	LoginRepository loginRepository;
	
	public boolean checkAuthentication(TNUser tnUser) {
		
		TNUser existedUser = loginRepository.findByEmail(tnUser.getEmail());
		if(existedUser != null) 
		{
			if(existedUser.getPassword().trim().equals(tnUser.getPassword().trim())) 
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
		return false;
	}

	public void saveSession(TNUser tnUser,HttpSession httpSession) {
		TNUser sessionUser = loginRepository.findByEmail(tnUser.getEmail());
		if(sessionUser!=null) 
		{
			httpSession.setAttribute("user", sessionUser);
		}
	}

}

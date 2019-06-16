package com.example.tnproject.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.tnproject.common.Status;
import com.example.tnproject.entity.TNUser;
import com.example.tnproject.repository.TNUserRepository;

@Service("TNUserService")
@Transactional
public class TNUserService {
	
	@Autowired
	TNUserRepository tnUserRepository;

	public TNUser save(TNUser tnUser) {
		tnUser.setStatus(Status.ACTIVE.getUserType());
		tnUser.setCreatedTime(new Date());
		return tnUserRepository.save(tnUser);
	}

	public List<TNUser> getAllUserLists() {
		return tnUserRepository.findAll();
	}

	public TNUser findUserById(long userId) {
		return tnUserRepository.findOne(userId);
	}
	
	public TNUser update(TNUser tnUser) 
	{
		if(tnUserRepository.exists(tnUser.getId())) 
		{
			tnUser.setUpdatedTime(new Date());
			return tnUserRepository.save(tnUser);
		}
		return null;
	}
	
	public void delete(long id) 
	{
		tnUserRepository.delete(id);
	}

}

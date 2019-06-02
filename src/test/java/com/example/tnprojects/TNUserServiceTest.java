package com.example.tnprojects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.tnproject.entity.TNUser;
import com.example.tnproject.service.TNUserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TNUserServiceTest {

	@Autowired
	TNUserService TNUserService;

	@Test
	public void saveTest() {
		TNUser user = new TNUser();
		user.setUserId("TN00001");
		user.setPassword("password");
		user.setName("Test");
		user.setNRC("9121828192");
		
		assertTrue(TNUserService.save(user).getId() != null);
	}
}

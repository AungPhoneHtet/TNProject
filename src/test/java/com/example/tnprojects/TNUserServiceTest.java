package com.example.tnprojects;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.tnproject.TnProjectApplication;
import com.example.tnproject.entity.TNUser;
import com.example.tnproject.service.TNUserService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TnProjectApplication.class)
public class TNUserServiceTest {

	@Autowired
	TNUserService TNUserService;

	@Test
	public void saveTest() {
		TNUser user = new TNUser();
		user.setUserId("TN00002");
		user.setPassword("password");
		user.setName("Test2");
		user.setNRC("9121828192");
		assertTrue(TNUserService.save(user).getId() != null);
	}
	
	@Test
	public void findAllTest() {
		assertTrue(TNUserService.getAllUserLists().size() > 0);
	}
	
	@Test
	public void findByIdTest() 
	{
		assertTrue(TNUserService.findUserById(3L) != null);
	}
	
	@Test
	public void updateTest() 
	{
		TNUser user = new TNUser();
		user.setId(3L);
		user.setUserId("TN00002");
		user.setPassword("password");
		user.setName("Test2");
		user.setNRC("9121828192");
		
		TNUserService.save(user);
		user.setName("modify");
		assertTrue(TNUserService.update(user) != null);
	}
	
	@Test
	public void deleteTest () 
	{
		TNUserService.delete(3L);
		assertTrue(null == TNUserService.findUserById(3L));
	}
}

package com.example.tnprojects;



import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.tnproject.TnProjectApplication;
import com.example.tnproject.entity.TNClass;
import com.example.tnproject.service.TNClassService;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = TnProjectApplication.class)
public class TNClassServiceTest {

	@Autowired
	TNClassService tnClassService;

	/*@Test
	public void saveTest() {
		
		TNClass tnclass=new TNClass();
		
		tnclass.setId((long) 1L);
		tnclass.setDescription("Spring class");
		tnclass.setStatus(123);
		tnclass.setMax_student(10);
		tnclass.setPrice(200000);
		tnclass.setStartDate(java.sql.Date.valueOf("2013-09-04"));
		tnclass.setDuration("3months");
		tnclass.setPeriod("11am to 1am");
		
		assertTrue(tnClassService.save(tnclass).getId() != null);
	}
	
	@Test
	public void deleteTest() {
		
	
	tnClassService.delete(1L);
	
	}*/
	
	@Test 
	public void updateTest() {

		TNClass tnclass=new TNClass();
		
		tnclass.setId((long) 1L);
		tnclass.setDescription("Java Class");
		tnclass.setStatus(123);
		tnclass.setMax_student(5);
		tnclass.setPrice(300000);
		tnclass.setStartDate(java.sql.Date.valueOf("2015-09-04"));
		tnclass.setDuration("1months");
		tnclass.setPeriod("11pm to 1am");
		
		
		assertTrue(tnClassService.update(tnclass).getDescription().equals("Java Class"));
		
	}
}

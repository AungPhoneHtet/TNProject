package com.example.tnproject.entity;

import java.util.Date;

import lombok.Data;

@Data
public class TNUser {

	private Long id;
	
	private String userId;
	
	private String password;
	
	private int userType;
	
	private int status;
	
	private String name;
	
	private String NRC;
	
	private Date dateOfBirth;
	
	private int gender;
	
	private String phoneNo;
	
	private String email;
	
	private String address;
}

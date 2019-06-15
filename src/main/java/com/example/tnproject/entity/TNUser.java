package com.example.tnproject.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
@Table(name = "tnuser")
public class TNUser extends Root{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "userid")
	@NotBlank
	private String userId;
	
	@Column(name = "password")
	@NotBlank
	private String password;
	
	@Column(name = "usertype")
	private int userType;
	
	@Column(name = "status")
	private int status;
	
	@Column(name = "name")
	@NotBlank
	private String name;
	
	@Column(name = "nrc")
	@NotBlank
	private String NRC;
	
	@Column(name = "dateofbirth")
	private Date dateOfBirth;
	
	@Column(name = "gender")
	private int gender;
	
	@Column(name = "phoneno")
	private String phoneNo;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "address")
	private String address;
}

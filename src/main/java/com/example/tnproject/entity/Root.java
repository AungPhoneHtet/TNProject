package com.example.tnproject.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@Data
@MappedSuperclass
public class Root {

	@Column(name = "createduser")
	private String createdUser;

	@Column(name = "updateduser")
	private String updatedUser;

	@Column(name = "createdtime")
	private Date createdTime;

	@Column(name = "updatedtime")
	private Date updatedTime;

}

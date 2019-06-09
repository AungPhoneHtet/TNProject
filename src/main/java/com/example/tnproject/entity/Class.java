package com.example.tnproject.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "class")
public class Class extends Root {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="description")
	private String description;
	
	@Column(name="status")
	private int status;
	
	private Long category_id;
	
	private TNUser coach;
	
	@Column(name="maxstudent")
	private int max_student;
	
	@Column(name="price")
	private double price;
	
	@Column(name="startdate")
	private Date startDate;
	
	@Column(name="duration")
	private String duration;
	
	@Column(name="period")
	private String period;

}

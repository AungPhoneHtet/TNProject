package com.example.tnproject.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tnclass")
public class TNClass extends Root {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="description")
	private String description;
	
	@Column(name="status")
	private int status;
	
	@OneToOne
	@JoinColumn(name="fk_categoryid")
	private Category category_id;
	
	@OneToOne
	@JoinColumn(name="fk_userid")
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
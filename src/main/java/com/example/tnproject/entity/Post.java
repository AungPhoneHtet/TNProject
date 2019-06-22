package com.example.tnproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table  (name = "post")
public class Post extends Root{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column (name = "title")
	private String title;
	
	@Column (name = "content")
	private String content;
	
	@ManyToOne
	@JoinColumn(name = "fk_user_id")
	private TNUser tnUser;
}

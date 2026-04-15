package com.example.studentapp.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank(message = "Name is required")
	private String name;
	
	@NotBlank(message = "Course is required")
	private String course;
	
	//getters and setters 
	
	//for id
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	
	//for name
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	//for course
	public String getCourse()
	{
		return course;
	}
	public void setCourse(String course)
	{
		this.course = course;
	}
}

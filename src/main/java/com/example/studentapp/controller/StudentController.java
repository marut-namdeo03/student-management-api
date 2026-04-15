package com.example.studentapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentapp.entity.Student;
import com.example.studentapp.repository.StudentRepository;
import com.example.studentapp.service.StudentService;

import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
		
	//Create 
	@PostMapping
	public Student addStudent(@RequestBody Student student)
	{
		return studentService.addStudent(student);
	}
	
	//Read All
	@GetMapping
	public List<Student> getAllStudents()
	{
		return studentService.getAllStudents();
	}
	
	//Read One
	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable int id)
	{
		return studentService.getStudentById(id);
	}
	
	//Update 
	@PutMapping("/{id}")
	public Student updateStudent(@PathVariable int id, @RequestBody Student student)
	{
		return studentService.updateStudent(id,  student);
	}
	
	//Delete
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable int id)
	{
		return studentService.deleteStudent(id);
	}
}

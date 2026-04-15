package com.example.studentapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentapp.entity.Student;
import com.example.studentapp.repository.StudentRepository;
import java.util.List;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	//Create
	public Student addStudent(Student student)
	{
		return studentRepository.save(student);
	}
	
	//Read All
	public List<Student> getAllStudents()
	{
		return studentRepository.findAll();
	}
	
	//Read one
	public Student getStudentById(int id)
	{
		return studentRepository.findById(id).orElse(null);
	}
	
	//Update
	public Student updateStudent(int id, Student newStudent)
	{
		Student student = studentRepository.findById(id).orElse(null);
		
		if(student != null)
		{
			student.setName(newStudent.getName());
			student.setCourse(newStudent.getCourse());
			return studentRepository.save(student);
		}	
		return null;
	}
	
	//Delete
	public String deleteStudent(int id)
	{
		if(studentRepository.existsById(id))
		{
			studentRepository.deleteById(id);
			return "Student deleted";
		}
		return "Student not found";
	}
}

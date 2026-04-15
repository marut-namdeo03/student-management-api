package com.example.studentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.studentapp.entity.Student;

//Student -> which table (Entity), Integer -> type of primary key(id)

public interface StudentRepository extends JpaRepository<Student, Integer> {

}

package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Student;

@Service
public class StudentDao {
	
	//Implementing Dependency Injection for ProductRepository
	@Autowired
	StudentRepository studentRepository;

	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	public Student getStudentBtId(int studentId) {
		Student student=new Student(0,"student Not Found!!",0.0);
		return studentRepository.findById(studentId).orElse(student);
		
	}

	public Student getStudentBtName(int studentName) {
		Student student=new Student(0,"student Not Found!!",0.0);
		return studentRepository.findById(studentName).orElse(student);
	}
	
	
	
}
package com.ts.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.StudentDao;
import com.model.Student;
@RestController
public class StudentController {
	
	@Autowired
	StudentDao studentDao;
	
	@GetMapping("getAllStudents")
	public List<Student> getAllStudents() {		
		return studentDao.getAllStudents();
	}
	

		@GetMapping("getStudents")
		public List<Student> getStudents() {
			
			Student student1 = new Student(101, "Manaswini",   95000.00);
			Student student2 = new Student(102, "Manadeep",   35000.00);
			Student student3 = new Student(103, "PranayVarshitha", 50090.00);
			
			List<Student> studentList = new ArrayList<Student>();
			studentList.add(student1);
			studentList.add(student2);
			studentList.add(student3);
			
			return studentList;
		}
		
	}
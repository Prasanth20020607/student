package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    // Your repository methods go here

}
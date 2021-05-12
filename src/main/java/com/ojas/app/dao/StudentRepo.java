package com.ojas.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ojas.app.model.Student;


public interface StudentRepo extends JpaRepository<Student, Integer>{

}
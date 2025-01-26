package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entity.Student;

public interface StudentDao {

	public Student getStudent(Long studentId);

	List<Student> getStudents();

	public int insert(Student student);

}

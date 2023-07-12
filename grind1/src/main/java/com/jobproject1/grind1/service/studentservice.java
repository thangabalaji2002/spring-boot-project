package com.jobproject1.grind1.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.jobproject1.grind1.entity.Student;
@Component
public interface studentservice {
	List<Student>getallstudents();

	void save(Student stu);

	Student findid(Long id);

	Student update(Student stu);

	void deleteid(Long id);
}




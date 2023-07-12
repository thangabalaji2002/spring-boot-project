package com.jobproject1.grind1.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobproject1.grind1.entity.Student;
import com.jobproject1.grind1.repository.studentrepository;
import com.jobproject1.grind1.service.studentservice;
@Service
public class studentserviceimpl implements studentservice  {
	@Autowired
	studentrepository repo;
	@Override
	public List<Student> getallstudents() {
	
		return repo.findAll();
		
		
		
	}
	@Override
	public void save(Student stu) {
		repo.save(stu);
		
	}
	@Override
	public Student findid(Long id) {
		
		return repo.findById(id).get();
	}
	@Override
	public Student update(Student stu) {
		repo.save(stu);
		return null;
	}
	@Override
	public void deleteid(Long id) {
		repo.deleteById(id);
		
	}
	
	

}

package com.jobproject1.grind1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.jobproject1.grind1.entity.Student;
@Component
public interface studentrepository extends JpaRepository<Student,Long> {

} 

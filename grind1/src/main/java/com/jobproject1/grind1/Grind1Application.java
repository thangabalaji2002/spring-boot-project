package com.jobproject1.grind1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jobproject1.grind1.entity.Student;
import com.jobproject1.grind1.repository.studentrepository;

@SpringBootApplication
public class Grind1Application implements CommandLineRunner{
	@Autowired
	private studentrepository sturepo;

	public static void main(String[] args) {
		SpringApplication.run(Grind1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
/*		Student student1 = new Student("raj","kumar","raj@2002");
		Student student2 = new Student("raja","cholan","raja@2002");
		Student student3 = new Student("ashok","kumar","ashok@2002");
		sturepo.save(student1);
		sturepo.save(student2);
		sturepo.save(student3); */
	}

}

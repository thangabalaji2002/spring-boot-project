package com.jobproject1.grind1.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.jobproject1.grind1.entity.Student;
import com.jobproject1.grind1.service.studentservice;

@Controller
public class studentcontroller {
	@Autowired
	private studentservice stuservice;
	
	
	
	
	@GetMapping("/students")
	public String liststudents(Model model ) {
		model.addAttribute("students",stuservice.getallstudents());
		return "students";
	}
	@GetMapping("/students/new")
	public String addstudent(Model model) {
		Student stud =new Student();
		model.addAttribute("students",stud);
		return "createstudent";
	}
	@PostMapping("/students")
	public String savestudent(@ModelAttribute("students") Student stu ) {
		
		stuservice.save(stu);
		
		
		return "redirect:/students";
		
		
		
	}
	@GetMapping("/student/edit/{id}")
	public String editstudent(@PathVariable Long id,Model model ) {
			Student stu=stuservice.findid(id);
			model.addAttribute("students",stu);
			return "editstudent";
		
		
	
}
 @PostMapping("/students/{id}")
 public String updatestudent(@PathVariable Long id , @ModelAttribute("students") Student student,Model model ) {
	Student existingstu = stuservice.findid(id);
	existingstu.setFirstname(student.getFirstname());
	existingstu.setLasttname(student.getLasttname());
	existingstu.setEmail(student.getEmail());
	stuservice.update(existingstu);
	 
	 return "redirect:/students";
	 
}
 @GetMapping("/student/delete/{id}")
 public String deletebyid(@PathVariable Long id ) {
	 stuservice.deleteid(id);
	 return "redirect:/students";
	 
 }
	

}

package com.imaginnovate.studentproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imaginnovate.studentproject.model.Student;
import com.imaginnovate.studentproject.model.StudentRequest;
import com.imaginnovate.studentproject.service.StudentService;

@RestController
@RequestMapping
public class StudentController {
	
	@Autowired
	private StudentService serviceRepo;
	
	@GetMapping("/students")
	public List<Student> getAllStudent(){
		return serviceRepo.getAllStudent();
	}
	
	@PostMapping("/students/add")
	public void addStudent(@RequestBody StudentRequest request) {
		serviceRepo.addStudent(request);
	}
	
	@PutMapping("/students/{id}")
	public void updateStudent(@PathVariable Integer id ,@RequestBody StudentRequest request) {
		serviceRepo.updateStudent(id,request);
	}

}

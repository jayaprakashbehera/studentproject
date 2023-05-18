package com.imaginnovate.studentproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imaginnovate.studentproject.model.Student;
import com.imaginnovate.studentproject.model.StudentRequest;
import com.imaginnovate.studentproject.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepo;
	
	public List<Student> getAllStudent(){
		List<Student> student =studentRepo.findAll();
		return student;
	}

	public void addStudent(StudentRequest request) {
		Student student = new Student();
		
		student.setFirstName(request.getFirstName());
		student.setLastName(request.getLastName());
		student.setDob(request.getDob());
		student.setGender(request.getGender());
		student.setMark1(request.getMark1());
		student.setMark2(request.getMark2());
		student.setMark3(request.getMark3());
		student.setTotal(request.getMark1()+request.getMark2()+request.getMark3());
		student.setAvarage((request.getMark1()+request.getMark2()+request.getMark3())/3);

		if(request.getMark1()<35) {
			student.setResult("fail");
		}else if (request.getMark2()<35) {
			student.setResult("fail");
		}else if (request.getMark3()<35) {
			student.setResult("fail");
		}else {
			student.setResult("pass");
		}
		
		if (student.getAvarage()>75) {
			student.setSection("A");
		}
		else if(student.getAvarage()>50 || student.getAvarage()<75) {
			student.setSection("B");
		}else {
			student.setSection("C");
		}
		
		studentRepo.save(student);
	} 

	public void updateStudent(Integer id, StudentRequest request) {
		Student student = studentRepo.findById(id).get();
		
		student.setMark1(request.getMark1());
		student.setMark2(request.getMark2());
		student.setMark3(request.getMark3());
		student.setTotal(request.getMark1()+request.getMark2()+request.getMark3());
		student.setAvarage((request.getMark1()+request.getMark2()+request.getMark3())/3);

		if(request.getMark1()<35) {
			student.setResult("fail");
		}else if (request.getMark2()<35) {
			student.setResult("fail");
		}else if (request.getMark3()<35) {
			student.setResult("fail");
		}else {
			student.setResult("pass");
		}
		
		if (student.getAvarage()>75) {
			student.setSection("A");
		}
		else if(student.getAvarage()>50 || student.getAvarage()<75) {
			student.setSection("B");
		}else {
			student.setSection("C");
		}
		
		studentRepo.save(student);
	}

}

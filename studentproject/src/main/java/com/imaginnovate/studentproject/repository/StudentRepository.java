package com.imaginnovate.studentproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imaginnovate.studentproject.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}

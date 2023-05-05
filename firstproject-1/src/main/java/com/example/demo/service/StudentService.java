package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentRepository;
import com.example.demo.model.Student;

@Service
public class StudentService {
	@Autowired
	StudentRepository studRepo;

	public List<Student> getAllStudents() {
		List<Student> studList=studRepo.findAll();
		
		return studList;
}
	public Student saveStudents(Student u)
	{
		
		return studRepo.save(u);
	}
	
	public Student updateStudents(Student u)
	{
		return studRepo.save(u);
	}
	public void deleteStudents(int regno)
	{
		studRepo.deleteById(regno);
	}
	
	public Student getStudents(int regno)
	{
		return studRepo.findById(regno).get();
	}
	
	public List<Student> sortStudents(String field) {
		 return studRepo.findAll(Sort.by(field));
		
	}
}

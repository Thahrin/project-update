package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studService;
	
	@GetMapping(value="/fetchStudents")
	public List<Student> getAllStudents()
	{
		List<Student> studList=studService.getAllStudents();
		return studList;
	}
	
	@PostMapping(value="/saveStudents")
	public Student saveStudents(@RequestBody Student u)
	{
		return studService.saveStudents(u);
	}
	
	@PutMapping(value="/updateStudents")
	public Student updateStudents(@RequestBody Student u)
	{
		return studService.saveStudents(u);
	}
	
	@DeleteMapping(value="/deleteStudents/{rno}")
	public void deleteStudents(@PathVariable("rno") int regno)
	{
		studService.deleteStudents(regno);
	}
	
	@GetMapping(value="/getStudents/{rno}")
	public Student getStudents(@PathVariable("rno")  int regno)
	{
		return studService.getStudents(regno);
	}
	@GetMapping("/sortStudents/{field}")
	public List<Student>sortStudents(@PathVariable String field)
	{
		return studService.sortStudents(field);
	}
}
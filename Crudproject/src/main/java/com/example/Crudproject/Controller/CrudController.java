package com.example.Crudproject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Crudproject.Model.Crud;
import com.example.Crudproject.Service.CrudService;



@RestController
public class CrudController {

	@Autowired
    CrudService studService;
	
	
	@GetMapping(value="/fetchStudents")
	public List<Crud>getAllStudents()
	{
		List<Crud>studList=studService.getAllStudents();
		return studList;
	}
	
	
	@PostMapping(value="/saveStudents")
	public  Crud saveStudents(@RequestBody Crud u)
	{
		return studService.saveStudents(u);
	}
	 
	
	@PutMapping(value="/updateStudent/{regno}")
	public  Crud updateStudent(@RequestBody Crud u, @PathVariable int regno)
	{
		return studService.updateStudent(u,regno);
	}
	
	
	//http://localhost:8080/deleteStudent/3
	@DeleteMapping(value="/deleteStudent/{rno}")
	public void  deleteStudent(@PathVariable("rno")  int regno)
	{
		studService.deleteStudents(regno);
	}
}

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

import com.example.demo.model.Project;
import com.example.demo.service.ProjectService;

@RestController
public class ProjectController {@Autowired
	ProjectService proService;
	
	@GetMapping(value="/fetchProjects")
	public List<Project> getAllProjects()
	{
		List<Project> proList=proService.getAllProjects();
		return proList;
	}
	
	@PostMapping(value="/saveProjects")
	public Project saveProjects(@RequestBody Project u)
	{
		return proService.saveProjects(u);
	}
	
	@PutMapping(value="/updateProjects")
	public Project updateStudents(@RequestBody Project u)
	{
		return proService.saveProjects(u);
	}
	
	@DeleteMapping(value="/deleteProjects/{rno}")
	public void deleteProjects(@PathVariable("rno") int no)
	{
		proService.deleteProjects(no);
	}
	
	@GetMapping(value="/getProjects/{rno}")
	public Project getProjects(@PathVariable("rno")  int no)
	{
		return proService.getProjects(no);
	}
	
}


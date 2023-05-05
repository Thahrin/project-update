package com.example.duplicate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.duplicate.model.duplicate;
import com.example.duplicate.service.duplicateService;

@RestController
public class duplicateController {

	@Autowired
	duplicateService dupService;
	
	@GetMapping(value="/getduplicate")
	public List<duplicate> getAllduplicate()
	{
		List<duplicate> dupList=dupService.getAllduplicate();
		return dupList;
	}
	
	@PostMapping(value="/saveduplicate")
	public duplicate saveduplicate(@RequestBody duplicate u)
	{
		return dupService.saveduplicate(u);
	}
	
	@PutMapping(value="/updateduplicate/{id}")
	public duplicate updateduplicate(@RequestBody duplicate u,@PathVariable("id") int id)

	{
		return dupService.updateduplicate(u,id);
	}
	
	@DeleteMapping(value="/deleteduplicate/{id}")
	public void deleteduplicate(@PathVariable("id") int id)

	{
		 dupService.deleteduplicate(id);
	}
	
	@GetMapping(value="/sortduplicate{field}")
	public List<duplicate>sortduplicate(@PathVariable String field)
	{
		return dupService.sortduplicate(field);
	}
}

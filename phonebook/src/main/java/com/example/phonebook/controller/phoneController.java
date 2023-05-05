package com.example.phonebook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.phonebook.model.phone;
import com.example.phonebook.service.phoneService;

@RestController
public class phoneController {

	@Autowired
	phoneService poService;
	
	@GetMapping(value="/getphone")
	public List<phone> getAllphone()
	{
		List<phone> poList=poService.getAllphone();
		return poList;
	}
	
	@PostMapping(value="/savephone")
	public phone savephone(@RequestBody phone u)
	{
		return poService.savephone(u);
	}
	
	@PutMapping(value="/updatephone/{id}")
	public phone updatephone(@RequestBody phone u,@PathVariable("id") int id)
	{
		return poService.updatephone(u,id);
	} 
	
	@DeleteMapping(value="/deletephone/{id}")
	public void deletephone(@PathVariable("id") int id)
	{
		poService.deletephone(id);
	}
	
	@GetMapping(value="/sortphone/{field}")
	public List<phone> sortphone(@PathVariable String field)
	{
		return poService.sortphone(field);
	}
	
	@GetMapping(value="/pagestore/{field}/{pageSize}")
	public List<phone>pagingNote(@PathVariable("field") int offset,@PathVariable("pageSize") int size)
	{
		return poService.pagingNote(offset,size);
	}
	@GetMapping("pagination/{nm}/{sp}/{inr}")
	public List<phone> paginate(@PathVariable("nm") int num,@PathVariable("sp") int size,@PathVariable("inr") String name)
	{
		return poService.paginate(num,size,name);
	}
	@GetMapping("/fetchCustomersByNamePrefix")
	public List<phone>fetchCustomersByNamePrefix(@RequestParam String prefix)
	{
		return poService.fetchCustomersByNamePrefix(prefix);
	}
	@GetMapping("/fetchStoresByNameSuffix")
	public List<phone>fetchCustomersByNameSuffix(@RequestParam String suffix)
	{
		return poService.fetchCustomersByNameSuffix(suffix);
	}
	@GetMapping("/findByMail")
	public List<phone>findByMail(@RequestParam String name)
	{
		return poService.findByMail(name);
	}
}

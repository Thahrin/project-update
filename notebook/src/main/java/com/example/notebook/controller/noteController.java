package com.example.notebook.controller;

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


import com.example.notebook.model.note;
import com.example.notebook.service.noteService;

@RestController
public class noteController {

	@Autowired
	noteService noService;
		
	@GetMapping(value="/getnote")
	public List<note> getAllnote()
	{
		List<note> noList=noService.getAllnote();
		return noList;
	}
	
	@PostMapping(value="/savenote")
	public note savenote(@RequestBody note u)
	{
		return noService.savenote(u);
	}
	
	@PutMapping(value="/updatenote/{no}")
	public note updatenote(@RequestBody note u,@PathVariable("no") int no)
	{
		return noService.updatenote(u,no);
	}
	
	@DeleteMapping(value="/deletenote/{no}")
	public void deletenote(@PathVariable("no") int no)
	{
		noService.deletenote(no);
	}
	
	@GetMapping(value="/sortnote/{field}")
	public List<note> sortnote(@PathVariable String field)
	{
		return noService.sortnote(field);
	}
	
	@GetMapping(value="/pagestore/{field}/{pageSize}")
	public List<note>pagingNote(@PathVariable("field") int offset,@PathVariable("pageSize") int size)
	{
		return noService.pagingNote(offset,size);
	}
	@GetMapping("pagination/{nm}/{sp}/{inr}")
	public List<note> paginate(@PathVariable("nm") int num,@PathVariable("sp") int size,@PathVariable("inr") String name)
	{
		return noService.paginate(num,size,name);
	}
	@GetMapping("/fetchCustomersByNamePrefix")
	public List<note>fetchCustomersByNamePrefix(@RequestParam String prefix)
	{
		return noService.fetchCustomersByNamePrefix(prefix);
	}
	@GetMapping("/fetchCustomersByNameSuffix")
	public List<note>fetchCustomersByNameSuffix(@RequestParam String suffix)
	{
		return noService.fetchCustomersByNameSuffix(suffix);
	}
	@GetMapping("/findByMail")
	public List<note>findByName(@RequestParam String name)
	{
		return noService.findByName(name);
	}


}

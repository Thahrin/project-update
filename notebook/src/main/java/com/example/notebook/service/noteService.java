package com.example.notebook.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.notebook.dao.noteRepository;
import com.example.notebook.model.note;

@Service
public class noteService {

	@Autowired
	noteRepository noRepo;
	
	public List<note> getAllnote()
	{
		List<note> noList=noRepo.findAll();
		return noList;
	}
	
	public note savenote(note u)
	{
		return noRepo.save(u);
	}
	public note updatenote(note u,int no)
	{
		Optional<note> optional=noRepo.findById(no);
		note obj=null;
		if(optional.isPresent())
		{
			obj=optional.get();
			obj.setNo(u.getNo());
			obj.setName(u.getName());
			obj.setPassword(u.getPassword());
			noRepo.saveAndFlush(u);
		}
		return obj;
	}
	public void deletenote(int no)
	{
		noRepo.deleteById(no);
	}
	public List<note> sortnote(String field)
	{
		return noRepo.findAll(Sort.by(Direction.DESC,field));
	}
	
	public List<note>pagingNote(int offset,int size)
	{
		Page<note> obj=noRepo.findAll(PageRequest.of(offset, size));
		return obj.getContent();
	}
	public List<note> paginate(int num, int size, String price) 
	{
		Page<note> obj=noRepo.findAll(PageRequest.of(num, size,Sort.by(price).descending()));
		return obj.getContent();
	}
	public List<note> fetchCustomersByNamePrefix(String prefix)
	{
		return noRepo.findByNameStartingWith(prefix);
	}
	public List<note> fetchCustomersByNameSuffix(String suffix)
	{
		return noRepo.findByNameEndingWith(suffix);
	}
	public List<note> findByName(String name)
	{
		return noRepo.findByName(name);
	}
	
}

package com.example.duplicate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.duplicate.dao.duplicateRepository;
import com.example.duplicate.model.duplicate;

@Service
public class duplicateService {

	@Autowired
	duplicateRepository dupRepo;
	
	public List<duplicate> getAllduplicate()
	{
		
		List<duplicate> dupList=dupRepo.findAll();
		return dupList;
	}
	
	public duplicate saveduplicate(duplicate u)
	{
		return dupRepo.save(u);
	}
	
	public duplicate updateduplicate(duplicate u,int id) {
		Optional<duplicate> optional=dupRepo.findById(id);
		duplicate obj=null;
		if(optional.isPresent())
		{
			obj=optional.get();
			obj.setId(u.getId());
			obj.setTbfrom(u.getTbfrom());
			obj.setTbookingto(u.getTbookingto());
			obj.setTbookingdate(u.getTbookingdate());
			obj.setTbookingclass(u.getTbookingclass());
			obj.setTbookingcompart(u.getTbookingcompart());
			dupRepo.saveAndFlush(u);	
		}
		return obj;
		
	}
	public void deleteduplicate(int id)
	{
		dupRepo.deleteById(id);
	}
	
	public List<duplicate> sortduplicate(String field)
	{
		return dupRepo.findAll(Sort.by(Direction.DESC,field));
	}
	
}

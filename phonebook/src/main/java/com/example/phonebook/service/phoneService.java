package com.example.phonebook.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.phonebook.dao.phoneRepository;
import com.example.phonebook.model.phone;

@Service
public class phoneService {

	@Autowired
	phoneRepository poRepo;
	public List<phone> getAllphone()
	{
		List<phone> poList=poRepo.findAll();
		return poList;
	}
	public phone savephone(phone u)
	{
		return poRepo.save(u);
	}
	
	public phone updatephone(phone u,int id)
	{
		Optional<phone> optional=poRepo.findById(id);
		phone obj=null;
		if(optional.isPresent())
		{
			obj=optional.get();
			obj.setId(u.getId());
			obj.setName(u.getName());
			obj.setPassword(u.getPassword());
			poRepo.saveAndFlush(u);
		}
		return obj;
	}
	public void deletephone(int id)
	{
		poRepo.deleteById(id);
	}
	
	public List<phone> sortphone(String field)
	{
		return poRepo.findAll(Sort.by(field));
	}
	
	public List<phone>pagingNote(int offset,int size)
	{
		Page<phone> obj=poRepo.findAll(PageRequest.of(offset, size));
		return obj.getContent();
	}
	public List<phone> paginate(int num, int size, String price) 
	{
		Page<phone> obj=poRepo.findAll(PageRequest.of(num, size,Sort.by(price).descending()));
		return obj.getContent();
	}
	public List<phone> fetchCustomersByNamePrefix(String prefix)
	{
		return poRepo.findByNameStartingWith(prefix);
	}
	public List<phone> fetchCustomersByNameSuffix(String suffix)
	{
		return poRepo.findByNameEndingWith(suffix);
	}
	public List<phone> findByMail(String mail)
	{
		return poRepo.findByMail(mail);
	}
	
}

package com.example.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import org.springframework.stereotype.Service;


import com.example.bookstore.dao.storeRepository;
import com.example.bookstore.model.store;


import jakarta.transaction.Transactional;





@Service
public class storeService {

	@Autowired
	storeRepository soRepo;
	

	public List<store> getALLstore() {
		List<store> soList=soRepo.findAll();
		return soList;
	}
	
	public store savestore(store u)
	{
		return soRepo.save(u);
	}
	
	public store updatestore(store u,int id)
	{
		Optional<store> optional=soRepo.findById(id);
		store obj=null;
		if(optional.isPresent())
		{
			obj=optional.get();
			obj.setId(u.getId());
			obj.setMail(u.getMail());
			obj.setPasscode(u.getPasscode());
			soRepo.saveAndFlush(u);
		}
		return obj;
	}
	
	public void deletestore(int id)
	{
		soRepo.deleteById(id);
	}
	
	public List<store> sortstore(String field)
	{
		return soRepo.findAll(Sort.by(field));
	}
	
	public List<store>pagingCustomers(int offset,int size)
	{
		Page<store> obj=soRepo.findAll(PageRequest.of(offset, size));
		return obj.getContent();
	}
	public List<store> paginate(int num, int size, String price) 
	{
		Page<store> obj=soRepo.findAll(PageRequest.of(num, size,Sort.by(price).descending()));
		return obj.getContent();
	}
	public List<store> fetchCustomersByBookPrefix(String prefix)
	{
		return soRepo.findByBookStartingWith(prefix);
	}
	public List<store> fetchCustomersByBookSuffix(String suffix)
	{
		return soRepo.findByBookEndingWith(suffix);
	}
	public List<store> findByMail(String mail)
	{
		return soRepo.findByMail(mail);
	}
	public List<store> getCustomersByBook(String book,String name)
	  {
		  return soRepo.getCustomersByBook(book, name);
	  }
	public List<store> getCustomersByBook(String book) 
	{
		return soRepo.getCustomersByBook(book);
	}
	@Transactional
	public int deleteCustomersByName(String name)
	{
		return soRepo.deleteCustomerByName(name);
	}
	@Transactional
	public int updateCustomerByName(String dept,String name)
	{
		return soRepo.updateCustomerByName(dept, name);
	}


}

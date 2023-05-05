package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.model.Customer;

import jakarta.transaction.Transactional;

@Service
public class CustomerService {
  @Autowired
  CustomerRepository cusRepo;

	public List<Customer> getAllCustomers() {
		List<Customer> cusList=cusRepo.findAll();
		
		return cusList;
}
	public Customer saveCustomers(Customer u)
	{
		
		return cusRepo.save(u);
	}
	
	public  Customer updateCustomers(Customer u,int no) {
		Optional<Customer> optional=cusRepo.findById(no);
		Customer obj=null;
		if(optional.isPresent())
		{
			obj=optional.get();
			obj.setno(u.getno());
			obj.setName(u.getName());
			obj.setMail(u.getMail());
			obj.setPassword(u.getPassword());
			obj.setPhno(u.getPhno());
		cusRepo.saveAndFlush(u);
		}
		return obj;
}
	public void deleteCustomers(int regno)
	{
		cusRepo.deleteById(regno);
	}
	
	public Customer getCustomers(int regno)
	{
		return cusRepo.findById(regno).get();
	}
	
	public List<Customer> sortCustomers(String field) {
		
		return cusRepo.findAll(Sort.by(Direction.DESC,field));
	}
	public List<Customer>pagingCustomers(int offset,int size)
	{
		Page<Customer> obj=cusRepo.findAll(PageRequest.of(offset, size));
		return obj.getContent();
	}
	public List<Customer> paginate(int num, int size, String price) 
	{
		Page<Customer> obj=cusRepo.findAll(PageRequest.of(num, size,Sort.by(price).descending()));
		return obj.getContent();
	}
	public List<Customer> fetchCustomersByNamePrefix(String prefix)
	{
		return cusRepo.findByNameStartingWith(prefix);
	}
	public List<Customer> fetchCustomersByNameSuffix(String suffix)
	{
		return cusRepo.findByNameEndingWith(suffix);
	}
	public List<Customer> findByMail(String mail)
	{
		return cusRepo.findByMail(mail);
	}
	public List<Customer> getCustomersByProduct(String product,String name)
	  {
		  return cusRepo.getCustomersByProduct(product, name);
	  }
	public List<Customer> getCustomersByProduct(String product) 
	{
		return cusRepo.getCustomersByProduct(product);
	}
	@Transactional
	public int deleteCustomersByName(String name)
	{
		return cusRepo.deleteCustomerByName(name);
	}
	@Transactional
	public int updateCustomerByName(String product,String name)
	{
		return cusRepo.updateCustomerByName(product, name);
	}
	public List<Customer> fetchCustomerByProduct(String product)
	{
		return cusRepo.fetchCustomerByProduct(product);
	}
	
	

}

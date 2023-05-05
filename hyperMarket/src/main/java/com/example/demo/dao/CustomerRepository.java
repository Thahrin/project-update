package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>{

	
	@Query("select u from Customer u where u.product=?1 and u.name=?2" )
	public List<Customer> getCustomersByProduct(String product,String name);
	
	@Query("select u from Customer u where u.product=:product")
	public List<Customer>getCustomersByProduct(String product);
	
	@Modifying
	@Query("delete from Customer u where u.name=?1")
	public int deleteCustomerByName(String name);
	
	@Modifying
	@Query("update Customer u set u.product=?1 where u.name=?2")
	public int updateCustomerByName(String product,String name);
	
	@Query(value="select* from Customer u where u.product=?",
			nativeQuery=true)
	public List<Customer> fetchCustomerByProduct(String mail);
	
	
	List<Customer>findByNameStartingWith(String prefix);
	List<Customer>findByNameEndingWith(String suffix);
	List<Customer>findByMail(String mail);



}

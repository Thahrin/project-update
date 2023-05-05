package com.example.bookstore.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.bookstore.model.store;




@Repository
public interface storeRepository extends JpaRepository<store,Integer>{


	@Query("select u from store u where u.book=?1 and u.name=?2" )
	public List<store> getCustomersByBook(String book,String name);
	
	@Query("select u from store u where u.book=:book")
	public List<store>getCustomersByBook(String book);
	
	@Modifying
	@Query("delete from store u where u.name=?1")
	public int deleteCustomerByName(String name);
	
	@Modifying
	@Query("update store u set u.book=?1 where u.name=?2")
	public int updateCustomerByName(String book,String name);
	
	@Query(value="select* from Customer u where u.email=?1",
			nativeQuery=true)
	public List<store> fetchCustomerByMail(String mail);
		
	List<store>findByBookStartingWith(String prefix);
	List<store>findByBookEndingWith(String suffix);
	List<store>findByMail(String mail);
	
}

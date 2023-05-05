package com.example.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookstore.dao.AddressRepository;
import com.example.bookstore.dao.PersonRepository;
import com.example.bookstore.model.Address;
import com.example.bookstore.model.Person;

@Service
public class AddressPersonService {

	@Autowired
	PersonRepository perRepository;
	AddressRepository adRepository;
	public List<Person>fetchAllPersons()
	   {
		   return perRepository.findAll();
	   }
    public Person savePersons(Person p)
	   {
		   return perRepository.save(p);
	   }
	public Address saveAddress(Address u) {
		
		return adRepository.save(u);
	}
}

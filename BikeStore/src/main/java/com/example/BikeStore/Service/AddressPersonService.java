package com.example.BikeStore.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BikeStore.Model.Person;
import com.example.BikeStore.Repository.PersonRepository;

@Service
public class AddressPersonService {

	@Autowired
	PersonRepository perRepository;
	public List<Person>fetchAllPersons()
	   {
		   return perRepository.findAll();
	   }
    public Person savePersons(Person p)
	   {
		   return perRepository.save(p);
	   }
}

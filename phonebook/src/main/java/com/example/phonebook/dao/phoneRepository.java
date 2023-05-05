package com.example.phonebook.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.phonebook.model.phone;

@Repository
public interface phoneRepository extends JpaRepository<phone,Integer>{

	List<phone>findByNameStartingWith(String prefix);
	List<phone>findByNameEndingWith(String suffix);
	List<phone>findByMail(String mail);
}


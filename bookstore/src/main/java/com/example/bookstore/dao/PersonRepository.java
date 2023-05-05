package com.example.bookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookstore.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long>{

}

package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Tutor;

@Repository
public interface TutorRepository extends JpaRepository<Tutor,Integer>{

}

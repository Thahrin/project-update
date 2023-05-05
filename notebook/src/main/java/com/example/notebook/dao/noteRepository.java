package com.example.notebook.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.notebook.model.note;

@Repository
public interface noteRepository extends JpaRepository<note,Integer>{

	List<note>findByNameStartingWith(String prefix);
	List<note>findByNameEndingWith(String suffix);
	List<note>findByName(String name);
}

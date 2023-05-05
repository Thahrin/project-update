package com.example.duplicate.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.duplicate.model.duplicate;

@Repository
public interface duplicateRepository extends JpaRepository<duplicate,Integer> {

}

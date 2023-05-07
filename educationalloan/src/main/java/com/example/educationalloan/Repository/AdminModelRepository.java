package com.example.educationalloan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.educationalloan.Model.AdminModel;

@Repository
public interface AdminModelRepository extends JpaRepository<AdminModel,String>{

}

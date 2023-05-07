package com.example.educationalloan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.educationalloan.Model.LoanApplicationModel;

@Repository
public interface LoanApplicationModelRepository extends JpaRepository<LoanApplicationModel,Integer>{

}

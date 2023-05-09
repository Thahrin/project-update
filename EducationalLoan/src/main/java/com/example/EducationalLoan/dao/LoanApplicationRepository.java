package com.example.EducationalLoan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EducationalLoan.model.LoanApplicationModel;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplicationModel,Integer>{

}

package com.example.EducationalLoan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EducationalLoan.dao.LoanApplicationRepository;
import com.example.EducationalLoan.model.LoanApplicationModel;

@Service
public class LoanApplicationService {

	@Autowired
	LoanApplicationRepository laRep;
	
	public List<LoanApplicationModel> get() {
		List<LoanApplicationModel> l=laRep.findAll();
		return l;
	}
	
	public LoanApplicationModel saveLoans(LoanApplicationModel l)
	{
		return laRep.save(l);
	}

	public LoanApplicationModel changeLoans(LoanApplicationModel c)
	{
		return laRep.saveAndFlush(c);
	}
	public void deleteLoan(int loanId)
		{
			laRep.deleteById(loanId);
		}
}

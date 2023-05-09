package com.example.EducationalLoan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EducationalLoan.dao.LoanApplicationRepository;
import com.example.EducationalLoan.dao.UserRepository;
import com.example.EducationalLoan.model.LoanApplicationModel;
import com.example.EducationalLoan.model.UserModel;

@Service
public class UserService {

	@Autowired
	UserRepository userRep;
	@Autowired
	LoanApplicationRepository laRep;
	public UserModel saveUser(UserModel l)
	{
		return userRep.save(l);
	}
	public String valideteUser(String email,String password)
	{
		String result=" ";
		UserModel l=userRep.findByEmail(email);
		if(l==null)
		{
			result="User not found";
		}
		else
		{
			if(l.getPassword().equals(password))
			{
				result="Login success";
			}
			else
			{
				result="Login failed";
			}
		}
		return result;
	}
	public List<UserModel> get()
	{
		List<UserModel> um=userRep.findAll();
		return um;
	}
	public LoanApplicationModel getById(int id)
	{
		LoanApplicationModel gbi=laRep.findById(id).get();
		return gbi;
		
	}
	public UserModel updateInfo(UserModel u)
	{
		return userRep.saveAndFlush(u);
	}
	
	public void deleteInfo(int sno)
		{
			userRep.deleteById(sno);
		}
	
}

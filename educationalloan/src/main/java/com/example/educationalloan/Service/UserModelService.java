package com.example.educationalloan.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.educationalloan.Model.UserModel;
import com.example.educationalloan.Repository.UserModelRepository;

@Service
public class UserModelService {

	@Autowired
	UserModelRepository urep;
	
	public List<UserModel> fetchAllProfile()
	{
		List<UserModel> c = urep.findAll();
		return c;
	}
}

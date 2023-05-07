package com.example.educationalloan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.educationalloan.Model.UserModel;
import com.example.educationalloan.Service.UserModelService;

@RestController
@RequestMapping("/user")
public class UserModelController {

	@Autowired
	UserModelService userv;
	
	@GetMapping("/getProfile")
	public List<UserModel> fetchAllDetails()
	{
		List<UserModel> a = userv.fetchAllProfile();
		return a;
	}
}

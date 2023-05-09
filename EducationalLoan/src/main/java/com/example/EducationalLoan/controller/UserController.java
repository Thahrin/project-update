package com.example.EducationalLoan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EducationalLoan.model.LoanApplicationModel;
import com.example.EducationalLoan.model.UserModel;
import com.example.EducationalLoan.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userSer;
	//http://localhost:8080/user/login
	@PostMapping("/login")
	public String validateUser(@RequestBody UserModel u)
	{
		return userSer.valideteUser(u.getEmail(), u.getPassword());
	}
	//http://localhost:8080/user/signup
	@PostMapping("/signup")
	public UserModel addDetails(@RequestBody UserModel u)
	{
		return userSer.saveUser(u);
	}
	//http://localhost:8080/user/getProfile
	@GetMapping(value="/getProfile")
	public List<UserModel> get()
	{
		List<UserModel> s=userSer.get();
		return s;
	}
	//http://localhost:8080/user/viewLoan/3
	@GetMapping(value="/viewLoan/{user}")
	public LoanApplicationModel getById(@PathVariable int user)
	{
		LoanApplicationModel gbi=userSer.getById(user);
		return gbi;
		
	}
	//http://localhost:8080/user/update
	@PutMapping("/update")
	public UserModel updateUser(@RequestBody UserModel id)
	{
		return userSer.updateInfo(id);
	}
	//http://localhost:8080/user/deleteById/6
	@DeleteMapping("/deleteById/{id}")
	public String deleteUser(@PathVariable("id") int id)
	{
		userSer.deleteInfo(id);
		return " user details deleted";
	}

}

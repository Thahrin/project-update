package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Login;
import com.example.demo.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	LoginService lser;
	//http://localhost:8080/checkLogin
	@PostMapping("/checkLogin")
	public String validateUser(@RequestBody Login l)
	{
		System.out.println(l.getUsername());
		return lser.validateUser(l.getUsername(), l.getPassword());
	}
	//http://localhost:8080/addUser
	@PostMapping("/addUser")
	public Login addDetails(@RequestBody Login l)
	{
		return lser.saveUser(l);
	}
	
}

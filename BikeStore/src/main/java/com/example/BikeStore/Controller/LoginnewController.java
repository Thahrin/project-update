package com.example.BikeStore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BikeStore.Model.Loginnew;
import com.example.BikeStore.Service.LoginnewService;


@RestController
public class LoginnewController {

	@Autowired
	LoginnewService lser;
	//http://localhost:8080/checkLogin
	@PostMapping("/checkLogin")
	public String validateUser(@RequestBody Loginnew l)
	{
		System.out.println(l.getUsername());
		return lser.validateUser(l.getUsername(), l.getPassword());
	}
	//http://localhost:8080/addUser
	@PostMapping("/addUser")
	public Loginnew addDetails(@RequestBody Loginnew l)
	{
		return lser.saveUser(l);
	}
	
}

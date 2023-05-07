package com.example.day1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	//http://localhost:8080/welcome
		@GetMapping("/welcome")
		public String welcome()
		{
			return "Welcome spring boot!";	
		}
		
		//http://localhost:8080/name?studentname=thahrin
		@GetMapping("/name")
		public String getName(@RequestParam String studentname)
		{
			return "Welcome " + studentname + " !";
		}
		
		//http://localhost:8080/color?color=blue
		@GetMapping("/color")
		public String getMyFav(@RequestParam String color)
		{
			return "My favourite color is  " + color;
		}
}

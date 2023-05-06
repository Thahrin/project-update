package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

public class Name {

	@ResponseBody
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String name()
	{
		String studentName = null;
		return "Welcome "+studentName+"!";
	}
}
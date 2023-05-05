package com.example.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookstore.dao.LoginRepository;
import com.example.bookstore.model.Login;


@Service
public class LoginService {

	@Autowired
    LoginRepository lrep;
	
	public Login saveUser(Login l)
	{
		return lrep.save(l);
	}
	
	public String validateUser(String username,String password)
	{
		String result="";
		Login l=lrep.findByUsername(username);
		if(l==null)
		{
			result="Invalid user";
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
}
	


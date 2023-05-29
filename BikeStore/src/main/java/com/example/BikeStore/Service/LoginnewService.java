package com.example.BikeStore.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BikeStore.Model.Loginnew;
import com.example.BikeStore.Repository.LoginnewRepository;

@Service
public class LoginnewService {


	@Autowired
    LoginnewRepository lrep;
	
	public Loginnew saveUser(Loginnew l)
	{
		return lrep.save(l);
	}
	
	public String validateUser(String username,String password)
	{
		String result="";
		Loginnew l=lrep.findByUsername(username);
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

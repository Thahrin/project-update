package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProjectRepository;
import com.example.demo.model.Project;



@Service
public class ProjectService {
 @Autowired
 ProjectRepository proRepo;

	public List<Project> getAllProjects() {
		List<Project> proList=proRepo.findAll();
		
		return proList;
}
	public Project saveProjects(Project u)
	{
		
		return proRepo.save(u);
	}
	
	public Project updateProjects(Project u)
	{
		return proRepo.save(u);
	}
	
	public void deleteProjects(int regno)
	{
		proRepo.deleteById(regno);
	}
	
	public Project getProjects(int regno)
	{
		return proRepo.findById(regno).get();
	}
	public  Project updateProjects(Project s,int rno) {
			Optional<Project> optional=proRepo.findById(rno);
			Project obj=null;
			if(optional.isPresent())
			{
				obj=optional.get();
				obj.setno(s.getno());
				obj.setName(s.getName());
				obj.setMail(s.getMail());
				obj.setPassword(s.getPassword());
				obj.setPhno(s.getPhno());
			proRepo.saveAndFlush(s);
			}
			return obj;
	}

	}
	



package com.example.Crudproject.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Crudproject.Model.Crud;
import com.example.Crudproject.Repository.CrudRepository;


@Service
public class CrudService {
	@Autowired
	   CrudRepository crudRepo;
	   

	   public List<Crud>getAllStudents()
	   {
		   List<Crud>studList=crudRepo.findAll();
		   return studList;
	   } 
	   
	   
	   public Crud saveStudents(Crud u)
	   {
		   Crud obj= crudRepo.save(u);
		   return obj;
	   }
	   
	   
	   public  Crud updateStudent(Crud s,int rno) {
			Optional<Crud> optional=crudRepo.findById(rno);
			Crud obj=null;
			if(optional.isPresent())
			{
				obj=optional.get();
				obj.setRegno(s.getRegno());
				obj.setName(s.getName());
				obj.setDept(s.getDept());
				
			crudRepo.saveAndFlush(s);
			}
			return obj;	
		}
	   
	   
	   public void deleteStudents(int regno)
	   {
		   crudRepo.deleteById(regno);   
	   }
	}

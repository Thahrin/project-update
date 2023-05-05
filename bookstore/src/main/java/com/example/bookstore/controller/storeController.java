package com.example.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookstore.model.store;
import com.example.bookstore.service.storeService;







@RestController
public class storeController {

	@Autowired
	storeService soService;

	@GetMapping(value="/getstore")
	public List<store> getAllstore()
	{
		List<store> soList=soService.getALLstore();
		return soList;
	}
	@PostMapping(value="/savestore")
	public store savestore(@RequestBody store u)
	{
		return soService.savestore(u);	
	}
	@PutMapping(value="/updatestore/{id}")
	public store updatestore(@RequestBody store u,@PathVariable("id") int id)
	{
		return soService.updatestore(u,id);
	}
	
	@DeleteMapping(value="/deletestore/{id}")
	public void deletestore(@PathVariable("id") int id)
	{
		soService.deletestore(id);
	}
	@GetMapping(value="/sortstore/{field}")
	public List<store> sortstore(@PathVariable String field)
	{
		return soService.sortstore(field);
	}
	@GetMapping(value="/pagestore/{field}/{pageSize}")
	public List<store>pagingStores(@PathVariable("field") int offset,@PathVariable("pageSize") int size)
	{
		return soService.pagingCustomers(offset,size);
	}
	@GetMapping("pagination/{nm}/{sp}/{inr}")
	public List<store> paginate(@PathVariable("nm") int num,@PathVariable("sp") int size,@PathVariable("inr") String name)
	{
		return soService.paginate(num,size,name);
	}
	@GetMapping("/fetchCustomersByNamePrefix")
	public List<store>fetchCustomersByBookPrefix(@RequestParam String prefix)
	{
		return soService.fetchCustomersByBookPrefix(prefix);
	}
	
	@GetMapping("/fetchCustomersByNameSuffix")
	public List<store>fetchCustomersByBookSuffix(@RequestParam String suffix)
	{
		return soService.fetchCustomersByBookSuffix(suffix);
	}
	@GetMapping("/findByMail")
	public List<store>findByMail(@RequestParam String mail)
	{
		return soService.findByMail(mail);
	}
	@GetMapping("/fetchCustomersByBook/{book}/{name}")
	public List<store> fetchCustomersByBook(@PathVariable 
			String book,@PathVariable String name)
	{
		return soService.getCustomersByBook(book,name);
	}
	@GetMapping("/fetchCustomersByBook")
	public List<store>getCustomersByBook(@RequestParam String book)
	{
		return soService.getCustomersByBook(book);
	}
	@DeleteMapping("/deleteCustomerByBook/{name}")
	public String deleteCustomersByName(String name)
	{
		int result=soService.deleteCustomersByName(name);
		if(result>0)
			return "Customer record deleted";
		else
			return "Problem occured while deleting";
	}
	@PutMapping("/updateCustomerByName/{book}/{name}")
    public String updateCustomerByName(@PathVariable String book,String name)
    {
 	   int res = soService.updateCustomerByName(book, name);
 	   if(res>0)
 		      return "Student record updated";
 	   else
 		    return "Problem occured";
    }

}

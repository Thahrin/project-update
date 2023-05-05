package com.example.demo.controller;

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

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;


@RestController
public class CustomerController {
	@Autowired
	CustomerService cusService;
	
	@GetMapping(value="/fetchCustomers")
	 List<Customer> getAllCustomers()
	{
		List<Customer> cusList=cusService.getAllCustomers();
		return cusList;
	}
	//http://localhost:8080/saveCustomers
	@PostMapping(value="/saveCustomers")
	public Customer saveCustomers(@RequestBody Customer u)
	{
		return cusService.saveCustomers(u);
	}
	//http://localhost:8080/updateCustomers/1
	@PutMapping(value="/updateCustomers/{no}")
	public Customer updateCustomers(@RequestBody Customer u,@PathVariable("no") int no)
	{
		return cusService.updateCustomers(u,no);
	}
	//http://localhost:8080/deleteCustomers/1
	@DeleteMapping(value="/deleteCustomers/{no}")
	public void deleteCustomers(@PathVariable("no") int no)
	{
		cusService.deleteCustomers(no);
	}
	//http://localhost:8080/getCustomers/1
	@GetMapping(value="/getCustomers/{no}")
	public Customer getProjects(@PathVariable("no")  int no)
	{
		return cusService.getCustomers(no);
	}
	//http://localhost:8080/sortCustomers/name
	@GetMapping(value="/sortCustomers/{field}")
	public List<Customer>sortCustomers(@PathVariable String field)
	{
		return cusService.sortCustomers(field);
	}
	//http://localhost:8080/pageCustomers/1/3
	@GetMapping(value="/pageCustomers/{field}/{pageSize}")
	public List<Customer>pagingCustomers(@PathVariable("field") int offset,@PathVariable("pageSize") int size)
	{
		return cusService.pagingCustomers(offset,size);
	}
	//http://localhost:8080/pagination/1/2/mail
	@GetMapping("pagination/{nm}/{sp}/{inr}")
	public List<Customer> paginate(@PathVariable("nm") int num,@PathVariable("sp") int size,@PathVariable("inr") String name)
	{
		return cusService.paginate(num,size,name);
	}
	//http://localhost:8080/fetchCustomersByNamePrefix?prefix=a
	@GetMapping("/fetchCustomersByNamePrefix")
	public List<Customer>fetchCustomersByNamePrefix(@RequestParam String prefix)
	{
		return cusService.fetchCustomersByNamePrefix(prefix);
	}
	//http://localhost:8080/fetchCustomersByNameSuffix?suffix=a
	@GetMapping("/fetchCustomersByNameSuffix")
	public List<Customer>fetchCustomersByNameSuffix(@RequestParam String suffix)
	{
		return cusService.fetchCustomersByNameSuffix(suffix);
	}
	//http://localhost:8080/findByMail?mail=808@gmail.com
	@GetMapping("/findByMail")
	public List<Customer>findByMail(@RequestParam String mail)
	{
		return cusService.findByMail(mail);
	}
	//http://localhost:8080/fetchCustomersByProduct/paste/Subhashini
	@GetMapping("/fetchCustomersByProduct/{product}/{name}")
	public List<Customer> getCustomersByProduct(@PathVariable 
			String product,@PathVariable String name)
	{
		return cusService.getCustomersByProduct(product, name);
	}
	//http://localhost:8080/fetchCustomersByProduct?product=paste
	@GetMapping("/fetchCustomersByProduct")
	public List<Customer>getCustomersByProduct(@RequestParam String product)
	{
		return cusService.getCustomersByProduct(product);
	}
	//http://localhost:8080/deleteCustomerByName?name=Fahima
	@DeleteMapping("/deleteCustomerByName")
	public String deleteCustomersByName(String name)
	{
		int result=cusService.deleteCustomersByName(name);
		if(result>0)
			return "Customer record deleted";
		else
			return "Problem occured while deleting";
	}
	//http://localhost:8080/updateCustomerByName/fruits/Ameena
	@PutMapping("/updateCustomerByName/{product}/{name}")
    public int updateCustomerByName(@PathVariable String product,@PathVariable String name)
    {
 	   return cusService.updateCustomerByName(product, name);
    }
	//http://localhost:8080/fetchCustomersByProduct?product=paste
	@GetMapping("/fetchCustomerByProduct")
	public List<Customer> fetchCustomerByProduct(@PathVariable String product)
	{
		return cusService.fetchCustomerByProduct(product);
	}

}

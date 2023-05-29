package com.example.BikeStore.Controller;

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

import com.example.BikeStore.Model.Bike;
import com.example.BikeStore.Service.BikeService;


@RestController
public class BikeController {

	@Autowired
	BikeService cusService;
	//http://localhost:8080/fetchBikes
	@GetMapping(value="/fetchBikes")
	 List<Bike> getAllCustomers()
	{
		List<Bike> cusList=cusService.getAllCustomers();
		return cusList;
	}
	//http://localhost:8080/saveBikes
	@PostMapping(value="/saveBikes")
	public Bike saveBikes(@RequestBody Bike u)
	{
		return cusService.saveBikes(u);
	}
	//http://localhost:8080/updateBikes/1
	@PutMapping(value="/updateBikes/{id}")
	public Bike updateBikes(@RequestBody Bike u,@PathVariable("id") int id)
	{
		return cusService.updateBikes(u,id);
	}
	//http://localhost:8080/deleteBikes/1
	@DeleteMapping(value="/deleteBikes/{id}")
	public void deleteBikes(@PathVariable("id") int id)
	{
		cusService.deleteBikes(id);
	}
	//http://localhost:8080/getBikes/1
	@GetMapping(value="/getBikes/{id}")
	public Bike getProjects(@PathVariable("id")  int id)
	{
		return cusService.getBikes(id);
	}
	//http://localhost:8080/sortBikes/bikename
	@GetMapping(value="/sortBikes/{bikename}")
	public List<Bike>sortBikes(@PathVariable String bikename)
	{
		return cusService.sortBikes(bikename);
	}
	//http://localhost:8080/pageBikes/1/3
	@GetMapping(value="/pageBikes/{bikename}/{pageSize}")
	public List<Bike>pagingBikes(@PathVariable("bikename") int offset,@PathVariable("pageSize") int size)
	{
		return cusService.pagingBikes(offset,size);
	}
	//http://localhost:8080/pagination/1/2/bikename
	@GetMapping("pagination/{nm}/{sp}/{inr}")
	public List<Bike> paginate(@PathVariable("nm") int num,@PathVariable("sp") int size,@PathVariable("inr") String bikename)
	{
		return cusService.paginate(num,size,bikename);
	}
	//http://localhost:8080/fetchBikesByNamePrefix?prefix=B
	@GetMapping("/fetchBikesByNamePrefix")
	public List<Bike>fetchBikesByNamePrefix(@RequestParam String prefix)
	{
		return cusService.fetchBikesByNamePrefix(prefix);
	}
	//http://localhost:8080/fetchCustomersByNameSuffix?suffix=j
	@GetMapping("/fetchBikesByNameSuffix")
	public List<Bike>fetchBikesByNameSuffix(@RequestParam String suffix)
	{
		return cusService.fetchBikesByNameSuffix(suffix);
	}
	//http://localhost:8080/findByBikename?bikename=Bajaj
	@GetMapping("/findByBikename")
	public List<Bike>findByBikename(@RequestParam String bikename)
	{
		return cusService.findByBikename(bikename);
	}
	//http://localhost:8080/fetchBikesByPrice/874,801/Hero
	@GetMapping("/fetchBikesByPrice/{price}/{bikename}")
	public List<Bike> getBikesByPrice(@PathVariable 
			String price,@PathVariable String bikename)
	{
		return cusService.getBikesByPrice(price,bikename);
	}
	//http://localhost:8080/fetchBikesByPrice?price=874,801
	@GetMapping("/fetchBikesByPrice")
	public List<Bike>getBikesByPrice(@RequestParam String price)
	{
		return cusService.getBikesByPrice(price);
	}
	//http://localhost:8080/deleteBikesByName?bikename=Hero
	@DeleteMapping("/deleteBikesByName")
	public String deleteBikesByName(String bikename)
	{
		int result=cusService.deleteBikesByName(bikename);
		if(result>0)
			return "Bike record deleted";
		else
			return "Problem occured while deleting";
	}
	//http://localhost:8080/updateCustomerByName/874,801/Hero
	@PutMapping("/updateBikeByName/{price}/{bikename}")
    public int updateBikesByName(@PathVariable String price,@PathVariable String bikename)
    {
 	   return cusService.updateBikesByName(price,bikename);
    }

}

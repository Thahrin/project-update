package com.example.BikeStore.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.BikeStore.Model.Bike;
import com.example.BikeStore.Repository.BikeRepository;

import jakarta.transaction.Transactional;

@Service
public class BikeService {

	 @Autowired
	  BikeRepository cusRepo;

		public List<Bike> getAllCustomers() {
			List<Bike> cusList=cusRepo.findAll();
			
			return cusList;
	}
		public Bike saveBikes(Bike u)
		{
			
			return cusRepo.save(u);
		}
		
		public Bike updateBikes(Bike u,int id) {
			Optional<Bike> optional=cusRepo.findById(id);
			Bike obj=null;
			if(optional.isPresent())
			{
				obj=optional.get();
				obj.setId(u.getId());
				obj.setBikename(u.getBikename());
				obj.setBikemodel(u.getBikemodel());
				obj.setPrice(u.getPrice());
				obj.setPower(u.getPower());
			cusRepo.saveAndFlush(u);
			}
			return obj;
	}
		public void deleteBikes(int id)
		{
			cusRepo.deleteById(id);
		}
		
		public Bike getBikes(int id)
		{
			return cusRepo.findById(id).get();
		}
		
		public List<Bike> sortBikes(String bikename) {
			
			return cusRepo.findAll(Sort.by(Direction.DESC,bikename));
		}
		public List<Bike>pagingBikes(int offset,int size)
		{
			Page<Bike> obj=cusRepo.findAll(PageRequest.of(offset, size));
			return obj.getContent();
		}
		public List<Bike> paginate(int num, int size, String price) 
		{
			Page<Bike> obj=cusRepo.findAll(PageRequest.of(num, size,Sort.by(price).descending()));
			return obj.getContent();
		}
		public List<Bike> fetchBikesByNamePrefix(String prefix)
		{
			return cusRepo.findByBikenameStartingWith(prefix);
		}
		public List<Bike> fetchBikesByNameSuffix(String suffix)
		{
			return cusRepo.findByBikenameEndingWith(suffix);
		}
		public List<Bike> findByBikename(String bikename)
		{
			return cusRepo.findByBikename(bikename);
		}
		public List<Bike> getBikesByPrice(String price,String bikename)
		  {
			  return cusRepo.getBikesByPrice(price, bikename);
		  }
		
		@Transactional
		public int deleteBikesByName(String bikename)
		{
			return cusRepo.deleteBikesByName(bikename);
		}
		@Transactional
		public int updateBikesByName(String price,String bikename)
		{
			return cusRepo.updateBikesByName(price, bikename);
		}
		public List<Bike> getBikesByPrice(String price) {
			
			return cusRepo.getBikesByPrice(price);
		}
		
		
}

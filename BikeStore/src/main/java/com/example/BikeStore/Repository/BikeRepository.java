package com.example.BikeStore.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.BikeStore.Model.Bike;


@Repository
public interface BikeRepository extends JpaRepository<Bike,Integer>{

	@Query("select u from Bike u where u.price=?1 and u.bikename=?2" )
	public List<Bike> getBikesByPrice(String price,String bikename);
	
	@Query("select u from Bike u where u.price=:price")
	public List<Bike>getBikesByPrice(String price);
	
	@Modifying
	@Query("delete from Bike u where u.bikename=?1")
	public int deleteBikesByName(String bikename);
	
	@Modifying
	@Query("update Bike u set u.price=?1 where u.bikename=?2")
	public int updateBikesByName(String price,String bikename);
	
	


	public List<Bike> findByBikename(String bikename);

	public List<Bike> findByBikenameEndingWith(String suffix);

	public List<Bike> findByBikenameStartingWith(String prefix);

}

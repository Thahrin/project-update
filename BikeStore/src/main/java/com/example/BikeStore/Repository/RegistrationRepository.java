package com.example.BikeStore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BikeStore.Model.Registration;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration,Integer>{

	//Registration name(Registration u);
	
}

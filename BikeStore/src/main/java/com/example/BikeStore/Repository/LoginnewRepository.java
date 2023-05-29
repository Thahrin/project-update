package com.example.BikeStore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BikeStore.Model.Loginnew;



@Repository
public interface LoginnewRepository  extends JpaRepository<Loginnew,Integer>{

	Loginnew findByUsername(String username);

}

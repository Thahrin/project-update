package com.example.BikeStore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BikeStore.Model.Address;


@Repository
public interface AddressRepository extends JpaRepository<Address,Long>
 {

}

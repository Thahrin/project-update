package com.example.bookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookstore.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {

}

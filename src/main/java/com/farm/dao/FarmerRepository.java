package com.farm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farm.model.AdminLogin;
import com.farm.model.FarmerRegistation;

@Repository
public interface FarmerRepository extends JpaRepository<FarmerRegistation, Integer> {
	
	public FarmerRegistation findByNameAndPassword(String name,String password); 

}

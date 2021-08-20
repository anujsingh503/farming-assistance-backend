package com.farm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farm.model.Farmer;

public interface FarmerRepository extends JpaRepository<Farmer, Integer>{

	
}

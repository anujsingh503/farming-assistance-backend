package com.farm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farm.model.FarmerComplain;


@Repository
public interface FarmerComplainRepository extends JpaRepository<FarmerComplain, Integer>  {
	
	
	public List<FarmerComplain> findByComplain(String complain);

}

package com.farm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farm.model.Farmer;

@Repository
public interface FarmerRepository extends JpaRepository<Farmer, Integer>{

}

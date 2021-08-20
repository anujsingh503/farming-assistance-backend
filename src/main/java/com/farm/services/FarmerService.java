package com.farm.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.farm.dao.FarmerRepository;
import com.farm.model.Farmer;

public interface FarmerService {
	 
	public String saveData(Farmer farmer);

}


package com.farm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farm.dao.FarmerRepository;
import com.farm.model.Farmer;

@Service
public class FarmerServiceImpl implements FarmerService {
	
	@Autowired
	private FarmerRepository farmerRepository;
	public String saveData(Farmer farmer)
	{
		farmerRepository.save(farmer);
		return "";
	}

	
}

package com.farm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farm.dao.FarmerRepository;
import com.farm.model.FarmerRegistation;

@Service
public class FarmerServiceImpl implements FarmerService {
	
	@Autowired
	private FarmerRepository farmerRepository;
	
	public String saveFarmerRecord(FarmerRegistation farmingRegistation)
	{
		farmerRepository.save(farmingRegistation);
		System.out.println("Farmer Record save successfully..");
		return null;
	}
	
	public FarmerRegistation loginFarmer(String name,String password)
	{
		FarmerRegistation  farmerRegistation =farmerRepository.findByNameAndPassword(name, password);
		return farmerRegistation;
	}
}

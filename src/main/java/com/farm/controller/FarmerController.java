package com.farm.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.farm.dao.FarmerComplainRepository;
import com.farm.model.FarmerComplain;
import com.farm.model.FarmerCorpAdevertisement;
import com.farm.model.FarmerRegistation;
import com.farm.services.FarmerCorpAdevertisementServiceImpl;
import com.farm.services.FarmerServiceImpl;



@RestController
public class FarmerController {
	
	
	@Autowired
	private FarmerServiceImpl farmerServiceImpl;
	@Autowired
	private FarmerComplainRepository farmerComplainRepository;
	@Autowired
	private FarmerCorpAdevertisementServiceImpl farmerCorpAdevertisementServiceImpl;
	
	
	
    @PostMapping(value="/farmerrecord", consumes = "application/json")
	public String FarmerRecord(@RequestBody FarmerRegistation farmerRegistation)
	{
		farmerServiceImpl.saveFarmerRecord(farmerRegistation);
		return null;
	}
	
	@PostMapping(value="/farmerlogin",produces = "application/json")
	public String farmerLogin(@RequestBody FarmerRegistation farmerRegistation)
	{
		FarmerRegistation farmerRegistation2=farmerServiceImpl.loginFarmer(farmerRegistation.getName(), farmerRegistation.getPassword());
		
		if(Objects.nonNull(farmerRegistation2))
		{
			System.out.println("Farmer Login Successfully....");
			return "redirect/";
		}
		else
		{
			System.out.println("Farmer Login Faild....");
			return "redirect/login";
		}
	}
	
	@PostMapping(value="/complain", consumes = "application/json")
	public String cropPost(@RequestBody FarmerComplain farmerComplain)
	{
		farmerComplainRepository.save(farmerComplain);
		System.out.println("Farmer Complain Post successfully....");
		return null;
	}
	
	@PostMapping(value="/farmeradvertise", consumes = "application/json")
	public String advrtisePost(@RequestBody FarmerCorpAdevertisement farmerCorpAdevertisement)
	{
		
		farmerCorpAdevertisementServiceImpl.farmerCorpPost(farmerCorpAdevertisement);
		System.out.println("Advertise succesfully...");
		return null;
	}

}

package com.farm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farm.services.FarmerServiceImpl;

@RestController
public class FarmerController {
	
	@Autowired
	FarmerServiceImpl farmerServiceImpl;
	
	@GetMapping(value="/record",produces ="application/json" )
	public String dashboardRecord()
	{
		
		return "";
	}

}

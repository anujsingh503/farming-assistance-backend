package com.farm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.farm.model.Farmer;
import com.farm.services.FarmerServiceImpl;

@RestController
public class FarmerController {

	@Autowired
	FarmerServiceImpl farmerServiceImpl;

	@PostMapping(value = "/record", consumes = "application/json")
	public String dashboardRecord(@RequestBody Farmer farmer) {
		farmerServiceImpl.saveData(farmer);

		return "";
	}

}

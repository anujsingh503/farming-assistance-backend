package com.farm.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.farm.dao.FarmerComplainRepository;
import com.farm.dao.FarmingTipsRepository;
import com.farm.dao.ViewComplainRepository;
import com.farm.model.AdminLogin;
import com.farm.model.FarmerComplain;
import com.farm.model.FarmingTips;
import com.farm.services.AdminLoginServiceImpl;
import com.farm.services.FarmingTipsServiceImpl;

@RestController
public class AdminController {
	
	
	@Autowired
	private AdminLoginServiceImpl adminLoginServiceImpl;
	@Autowired
	private ViewComplainRepository viewComplainRepository;
	@Autowired
	private FarmingTipsServiceImpl farmingTipsServiceImpl;
	@Autowired
	private FarmerComplainRepository farmerComplainRepository;
	
	@PostMapping(value="/adminlogin",consumes = "application/json")
	public String adminData(@RequestBody AdminLogin adminLogin)
	{
		
		AdminLogin adminLogin2=adminLoginServiceImpl.adminDataSave(adminLogin.getName(), adminLogin.getPassword());
		
		if(Objects.nonNull(adminLogin2))
		{
			System.out.println("Admin Login Successfully...");
			return "redirect/";
		}
		else
		{
			System.out.println("Admin Login Faild....");
			return "redirect/login";
		}
	}
	@CrossOrigin("http://localhost:4200")
	@GetMapping(value="/complainview",produces = "application/json")
	public List<FarmerComplain> getComplain()
	{
		List<FarmerComplain> st=farmerComplainRepository.findAll();
		
		System.out.println("++++++++++++++++++++++"+ st);
		return st;
	}
	
	@PostMapping(value="/tips",produces = "application/json")
	public String createFarmingTips(@RequestBody FarmingTips farmingTips)
	{
		farmingTipsServiceImpl.createTips(farmingTips);
		return null;
	}

}

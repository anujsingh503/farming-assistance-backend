package com.farm.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farm.dao.SupplierRegistationRepository;
import com.farm.model.SupplierLogin;
import com.farm.model.Supplier_Advertisment;
import com.farm.model.Supplier_CorpReceived;
import com.farm.model.Supplier_Registation;
import com.farm.services.CorpReceivedServiceImpl;
import com.farm.services.SupplierAdvertismentServiceImpl;
import com.farm.services.SupplierRegistationServiceImpl;

@RestController
public class SuppplierController {
	
	@Autowired
	private SupplierRegistationServiceImpl supplierRegistationServiceImpl;
	@Autowired
	private SupplierAdvertismentServiceImpl supplierAdvertismentServiceImpl;
	@Autowired
	private CorpReceivedServiceImpl corpReceivedServiceImpl;
	
	
	@PostMapping(value="/register", consumes = "application/json")
	public String supplierRegistaton(@ModelAttribute Supplier_Registation supplier_Registation)
	{
		supplierRegistationServiceImpl.saveData(supplier_Registation);
		return null;
	}
	
	@PostMapping(value="/adverties", consumes = "application/json")
	public String postAdvertise(@ModelAttribute Supplier_Advertisment supplier_Advertisment)
	{
		supplierAdvertismentServiceImpl.postAdvertise(supplier_Advertisment);
		return null;
	}
	
	@PostMapping(value="/corpreceived", consumes = "application/json")
	public String postAdvertise(@ModelAttribute Supplier_CorpReceived supplier_CorpReceived)
	{
		corpReceivedServiceImpl.corpReceived(supplier_CorpReceived);
		return null;
	}
	
	@GetMapping(value="/login",consumes = "application/json")
	public String loginForm(@ModelAttribute SupplierLogin supplierLogin)
	{
		
		SupplierLogin supplierLogin2=supplierRegistationServiceImpl.login(supplierLogin.getName(), supplierLogin.getPassword());
		if(Objects.nonNull(supplierLogin2))
		{
			return "redirect/";
		}
		else
		{
			return "redirect/";
		}
		
	}

}

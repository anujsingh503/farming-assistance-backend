package com.farm.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farm.model.Supplier_Registation;

@RestController
public class SuppplierController {
	
	
	@PostMapping(value="/register", consumes = "application/json")
	public void supplierRegistaton(@ModelAttribute Supplier_Registation supplier_Registation)
	{
		
	}

}

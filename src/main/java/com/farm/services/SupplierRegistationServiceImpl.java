package com.farm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farm.dao.SupplierRegistationRepository;
import com.farm.model.SupplierLogin;
import com.farm.model.Supplier_Registation;


@Service
public class SupplierRegistationServiceImpl implements SupplierRegistationService {
	
	@Autowired
	private SupplierRegistationRepository supplierRegistationRepository;
	
	
	public String saveData(Supplier_Registation supplier_Registation)
	{
		supplierRegistationRepository.save(supplier_Registation);
		return null;
	}
	
	
	public SupplierLogin login(String name,String password)
	{
		SupplierLogin supplier=supplierRegistationRepository.findByNameAndPassword(name ,password);
		return supplier;
	}
	
}

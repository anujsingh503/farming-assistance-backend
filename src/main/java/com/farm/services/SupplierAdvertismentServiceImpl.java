package com.farm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farm.dao.SupplierAdvertismentRepository;
import com.farm.model.Supplier_Advertisment;

@Service
public class SupplierAdvertismentServiceImpl implements SupplierAdvertismentService {
	
	@Autowired
	private SupplierAdvertismentRepository supplierAdvertismentRepository;
	public String postAdvertise(Supplier_Advertisment supplier_Advertisment)
	{
		supplierAdvertismentRepository.save(supplier_Advertisment);
		return null;
	}

}

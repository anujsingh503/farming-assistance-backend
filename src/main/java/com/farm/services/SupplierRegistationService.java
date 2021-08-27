package com.farm.services;

import com.farm.model.SupplierLogin;
import com.farm.model.Supplier_Registation;

public interface SupplierRegistationService {
	
	public String saveData(Supplier_Registation Supplier_Registation);
	
	public SupplierLogin login(String name,String password);
	

}

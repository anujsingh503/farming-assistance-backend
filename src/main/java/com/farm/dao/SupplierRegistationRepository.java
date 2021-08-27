package com.farm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farm.model.Farmer;
import com.farm.model.SupplierLogin;
import com.farm.model.Supplier_Registation;




@Repository
public interface SupplierRegistationRepository extends JpaRepository<Supplier_Registation, Integer> {
	
	public SupplierLogin findByNameAndPassword(String name,String password);
	
	
		
}

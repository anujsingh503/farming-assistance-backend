package com.farm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farm.model.Supplier_Advertisment;


@Repository
public interface SupplierAdvertismentRepository  extends JpaRepository<Supplier_Advertisment, Integer>{

}

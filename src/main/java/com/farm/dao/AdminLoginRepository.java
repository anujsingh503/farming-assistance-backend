package com.farm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farm.model.AdminLogin;


@Repository
public interface AdminLoginRepository extends JpaRepository<AdminLogin, Integer> {
	
	public AdminLogin findByNameAndPassword(String name,String password);

}

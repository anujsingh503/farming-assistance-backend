package com.farm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farm.dao.AdminLoginRepository;
import com.farm.model.AdminLogin;


@Service
public class AdminLoginServiceImpl implements AdminLoginService {
	
	@Autowired
	private AdminLoginRepository adminLoginRepository;
	
	public AdminLogin adminDataSave(String name,String password)
	{
		AdminLogin adminLogin=adminLoginRepository.findByNameAndPassword(name, password);
		return adminLogin;
	}
	
	public String viewComplain()
	{
		
		return null;
	}

}

package com.farm.services;

import com.farm.model.AdminLogin;

public interface AdminLoginService {
	
	public AdminLogin adminDataSave(String name,String password);
	
	public String viewComplain();

}

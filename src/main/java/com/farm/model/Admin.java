package com.farm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Admin {

	private int Id;
	private String name;
	private String mobileNumber;
	private String email;
	
	public Admin(String name, String mobileNumber, String email) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}
	
	

}
